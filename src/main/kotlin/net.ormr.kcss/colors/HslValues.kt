package net.ormr.kcss.colors

class HslValues(
	var hue: Float,
	var saturation: Float,
	var lightness: Float,
) {
    fun setLightnessSafe(l: Float): HslValues {
        lightness = Math.min(1f, Math.max(0f, l))
        return this
    }

    fun setSaturationSafe(l: Float): HslValues {
        saturation = Math.min(1f, Math.max(0f, l))
        return this
    }
}
