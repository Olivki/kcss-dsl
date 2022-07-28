@file:Suppress("unused")

package net.ormr.kcss.colors

import net.ormr.kcss.formatCssDecimal

class CustomColor(
    var red: Float,
    var green: Float,
    var blue: Float,
    var alpha: Float = 1F,
) : Color {
    var redInt: Int
        get() = (red * 255F).toInt()
        set(value) {
            red = value.toFloat() / 255F
        }

    var greenInt: Int
        get() = (green * 255F).toInt()
        set(value) {
            green = value.toFloat() / 255F
        }

    var blueInt: Int
        get() = (blue * 255F).toInt()
        set(value) {
            blue = value.toFloat() / 255F
        }

    var alphaInt: Int
        get() = (alpha * 255F).toInt()
        set(value) {
            alpha = value.toFloat() / 255F
        }

    fun toHexString(): String {
        val hex = "#${redInt.twoDigitHex()}${greenInt.twoDigitHex()}${blueInt.twoDigitHex()}"
        var i = 1

        while (i <= 5) {
            if (hex[i] != hex[i + 1]) return hex
            i += 2
        }

        return "#${hex[1]}${hex[3]}${hex[5]}"
    }

    override fun toString() = when {
        alpha < 1f -> "rgba($redInt,$greenInt,$blueInt,${formatCssDecimal(alpha)})"
        else -> toHexString()
    }

    private fun Int.twoDigitHex() = "${if (this < 16) "0" else ""}${this.toString(16)}"

    fun toHslValues(): HslValues {
        val max = red.coerceAtLeast(green).coerceAtLeast(blue)
        val min = red.coerceAtMost(green).coerceAtMost(blue)
        val average = (max + min) / 2
        val hsl = HslValues(average, average, average)

        if (max == min) {
            // achromatic
            hsl.hue = 0F
            hsl.saturation = 0F
        } else {
            val delta = max - min

            if (hsl.lightness > 0.5F) {
                hsl.saturation = delta / (2 - max - min)
            } else {
                hsl.saturation = delta / (max + min)
            }

            when (max) {
                red -> {
                    hsl.hue = (green - blue) / delta
                    if (green < blue) hsl.hue += 6F
                }

                green -> hsl.hue = (blue - red) / delta + 2
                blue -> hsl.hue = (red - green) / delta + 4
            }

            hsl.hue /= 6F
        }

        return hsl
    }

    fun setHsl(hsl: HslValues): CustomColor = apply {
        if (hsl.saturation == 0F) {
            // achromatic
            red = hsl.lightness
            green = hsl.lightness
            blue = hsl.lightness
        } else {
            val q = when {
                hsl.lightness < 0.5F -> hsl.lightness * (1F + hsl.saturation)
                else -> hsl.lightness + hsl.saturation - hsl.lightness * hsl.saturation
            }

            val p = 2F * hsl.lightness - q
            red = hueToRgb(p, q, hsl.hue + 1F / 3F)
            green = hueToRgb(p, q, hsl.hue)
            blue = hueToRgb(p, q, hsl.hue - 1F / 3F)
        }
    }

    private fun hueToRgb(p: Float, q: Float, _t: Float): Float {
        var t = _t
        if (t < 0F) t += 1F
        if (t > 1F) t -= 1F
        return when {
            t < 1F / 6F -> p + (q - p) * 6F * t
            t < 0.5F -> q
            t < 2F / 3F -> p + (q - p) * (2F / 3F - t) * 6F
            else -> p
        }
    }

    // Color adjustment (values should be between 0 and 1)

    fun lighten(dl: Float): CustomColor {
        val hsl = toHslValues()
        hsl.setLightnessSafe(hsl.lightness + dl)
        return setHsl(hsl)
    }

    fun darken(dl: Float): CustomColor {
        val hsl = toHslValues()
        hsl.setLightnessSafe(hsl.lightness - dl)
        return setHsl(hsl)
    }

    fun saturate(dl: Float): CustomColor {
        val hsl = toHslValues()
        hsl.setSaturationSafe(hsl.lightness + dl)
        return setHsl(hsl)
    }

    fun desaturate(dl: Float): CustomColor {
        val hsl = toHslValues()
        hsl.setSaturationSafe(hsl.lightness - dl)
        return setHsl(hsl)
    }

    companion object {
        fun fromRgb(red: Int, green: Int, blue: Int, alpha: Float = 1F) =
            CustomColor(red.toFloat() / 255F, green.toFloat() / 255F, blue.toFloat() / 255F, alpha)

        fun fromHex(rawHexString: String): CustomColor {
            val hexValue = if (rawHexString[0] == '#') rawHexString.drop(1) else rawHexString

            // In CSS4 the alpha channel comes last:
            // https://www.w3.org/TR/css-color-4/#hex-notation
            return when (hexValue.length) {
                1 -> { // 0x00f
                    val b = hexValue[0].toString().toInt(16)
                    fromRgb(0, 0, b * 16 + b)
                }
                2 -> { // 0x0f0
                    val g = hexValue[0].toString().toInt(16)
                    val b = hexValue[1].toString().toInt(16)
                    fromRgb(0, g * 16 + g, b * 16 + b)
                }
                3 -> {
                    val r = hexValue[0].toString().toInt(16)
                    val g = hexValue[1].toString().toInt(16)
                    val b = hexValue[2].toString().toInt(16)
                    fromRgb(r * 16 + r, g * 16 + g, b * 16 + b)
                }
                4 -> {
                    val r = hexValue[0].toString().toInt(16)
                    val g = hexValue[1].toString().toInt(16)
                    val b = hexValue[2].toString().toInt(16)
                    val a = hexValue[3].toString().toInt(16)
                    fromRgb(r * 16 + r, g * 16 + g, b * 16 + b, 255f / a * 16 + a)
                }
                5 -> { // 0x0faabb
                    val r = hexValue.take(1).toInt(16)
                    val g = hexValue.substring(1, 3).toInt(16)
                    val b = hexValue.substring(3, 5).toInt(16)
                    fromRgb(r, g, b)
                }
                6 -> {
                    val r = hexValue.take(2).toInt(16)
                    val g = hexValue.substring(2, 4).toInt(16)
                    val b = hexValue.substring(4, 6).toInt(16)
                    fromRgb(r, g, b)
                }
                7 -> { // 0x0faabbcc
                    val r = hexValue.take(1).toInt(16)
                    val g = hexValue.substring(1, 3).toInt(16)
                    val b = hexValue.substring(3, 5).toInt(16)
                    val a = hexValue.substring(5, 7).toInt(16)
                    fromRgb(r, g, b, a / 255f)
                }
                8 -> {
                    val r = hexValue.take(2).toInt(16)
                    val g = hexValue.substring(2, 4).toInt(16)
                    val b = hexValue.substring(4, 6).toInt(16)
                    val a = hexValue.substring(6, 8).toInt(16)
                    fromRgb(r, g, b, a / 255f)
                }
                else -> throw IllegalArgumentException("Given value '$rawHexString' is not a valid CSS HEX color")
            }
        }

        fun fromHex(value: Int): CustomColor = fromHex(value.toString(16).padStart(6, '0'))

        fun fromHsl(hsl: HslValues): CustomColor {
            val color = CustomColor(0F, 0F, 0F)
            color.setHsl(hsl)
            return color
        }
    }
}




