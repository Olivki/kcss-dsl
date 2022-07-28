package net.ormr.kcss.dimensions

import net.ormr.kcss.cssDecimalFormat

class LinearDimension(var value: Float, var units: LinearUnits) {
    override fun toString(): String {
        val str = cssDecimalFormat.format(value)!!
        return if (str == "0") str else "$str$units"
    }
}
