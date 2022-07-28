package net.ormr.kcss.dimensions

import net.ormr.kcss.cssDecimalFormat

data class LinearDimension(val value: Float, val units: LinearUnits) {
    override fun toString(): String {
        val str = cssDecimalFormat.format(value)!!
        return if (str == "0") str else "$str$units"
    }
}
