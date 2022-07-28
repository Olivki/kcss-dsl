package net.ormr.kcss

internal fun formatCssDecimal(value: Float): String {
    val string = value.toString()
    val fractional = when {
        '.' in string -> {
            val fractionalPart = string.substringAfter('.')
            val chunked = fractionalPart.substring(0, fractionalPart.length.coerceAtMost(5))
            if (chunked == "0") null else chunked
        }
        else -> null
    }
    val integral = string.substringBefore('.').let { if (it == "0" && fractional != null) "" else it }
    return fractional?.let { "${integral}.$it" } ?: integral
}