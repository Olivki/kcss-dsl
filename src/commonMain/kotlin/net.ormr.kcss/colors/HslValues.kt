package net.ormr.kcss.colors

class HslValues(
    var hue: Float,
    var saturation: Float,
    var lightness: Float,
) {
    fun setLightnessSafe(l: Float): HslValues = apply {
        lightness = 1F.coerceAtMost(0F.coerceAtLeast(l))
    }

    fun setSaturationSafe(l: Float): HslValues = apply {
        saturation = 1F.coerceAtMost(0F.coerceAtLeast(l))
    }
}
