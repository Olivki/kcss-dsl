package net.ormr.kcss.dimensions

class BoxDimensions(
    var top: LinearDimension = 0.px,
    var right: LinearDimension = top,
    var bottom: LinearDimension = top,
    var left: LinearDimension = right,
) {
    override fun toString(): String = when {
        top == right && top == bottom && top == left -> top.toString()
        top == bottom && left == right -> "$top $right"
        left == right -> "$top $right $bottom"
        else -> "$top $right $bottom $left"
    }
}
