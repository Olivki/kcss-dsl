package net.ormr.kcss.dimensions

import net.ormr.kcss.cssDecimalFormat

class LinearDimension(
    var value: Float,
    var units: LinearUnits,
) {
    override fun toString(): String {
        val str = cssDecimalFormat.format(value)!!
        return if (str == "0") str else "$str$units"
    }

    companion object {
        fun from(value: Any): LinearDimension {
            return when (value) {
                is Number -> value.px
                is String -> fromString(value)
                is LinearDimension -> value
                else -> throw IllegalArgumentException("Cannot create LinearDimension from ${value.javaClass.simpleName}")
            }
        }

        fun fromString(string: String): LinearDimension {
            if (string.endsWith('%')) return LinearDimension(string.dropLast(1).toFloat(), LinearUnits.PERCENT)

            val units = when {
                string.endsWith("px") -> LinearUnits.PX
                string.endsWith("em") -> LinearUnits.EM
                string.endsWith("ex") -> LinearUnits.EX
                string.endsWith("in") -> LinearUnits.INCH
                string.endsWith("cm") -> LinearUnits.CM
                string.endsWith("mm") -> LinearUnits.MM
                string.endsWith("pt") -> LinearUnits.PT
                string.endsWith("pc") -> LinearUnits.PC
                else -> null
            } ?: return LinearDimension(string.toFloat(), LinearUnits.PX)

            return LinearDimension(string.dropLast(2).toFloat(), units)
        }
    }
}
