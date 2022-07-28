package net.ormr.kcss.dimensions

data class BoxDimension(
    val top: LinearDimension = 0.px,
    val right: LinearDimension = top,
    val bottom: LinearDimension = top,
    val left: LinearDimension = right,
) {
    override fun toString(): String = when {
        top == right && top == bottom && top == left -> top.toString()
        top == bottom && left == right -> "$top $right"
        left == right -> "$top $right $bottom"
        else -> "$top $right $bottom $left"
    }
}
