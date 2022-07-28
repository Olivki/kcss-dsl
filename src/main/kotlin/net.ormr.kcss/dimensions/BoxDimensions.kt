package net.ormr.kcss.dimensions

import net.ormr.kcss.dimensions.LinearDimension.Companion.from as linear

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

    companion object {
        fun from(vararg args: Any): BoxDimensions = when (args.size) {
            1 -> BoxDimensions(linear(args[0]))
            2 -> BoxDimensions(linear(args[0]), linear(args[1]))
            3 -> BoxDimensions(linear(args[0]), linear(args[1]), linear(args[2]))
            else -> BoxDimensions(linear(args[0]), linear(args[1]), linear(args[2]), linear(args[3]))
        }
    }
}
