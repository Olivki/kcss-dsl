package net.ormr.kcss.dimensions

import net.ormr.kcss.formatCssDecimal

data class LinearDimension(val value: Float, val units: LinearUnits) {
    override fun toString(): String = formatCssDecimal(value).let { if (it == "0") it else "$it$units" }
}
