@file:Suppress("unused")

package net.ormr.kcss.dimensions

val Number.px: LinearDimension get() = linear(this, LinearUnits.PX)

val Number.em: LinearDimension get() = linear(this, LinearUnits.EM)

val Number.percent: LinearDimension get() = linear(this, LinearUnits.PERCENT)

val Number.ex: LinearDimension get() = linear(this, LinearUnits.EX)

val Number.inch: LinearDimension get() = linear(this, LinearUnits.INCH)

val Number.cm: LinearDimension get() = linear(this, LinearUnits.CM)

val Number.mm: LinearDimension get() = linear(this, LinearUnits.MM)

val Number.pt: LinearDimension get() = linear(this, LinearUnits.PT)

val Number.pc: LinearDimension get() = linear(this, LinearUnits.PC)

private inline fun linear(value: Number, units: LinearUnits) = LinearDimension(value.toFloat(), units)

fun box(top: LinearDimension): BoxDimension = BoxDimension(top)

fun box(top: LinearDimension, right: LinearDimension): BoxDimension = BoxDimension(top, right)

fun box(top: LinearDimension, right: LinearDimension, bottom: LinearDimension): BoxDimension =
    BoxDimension(top, right, bottom)

fun box(
    top: LinearDimension,
    right: LinearDimension,
    bottom: LinearDimension,
    left: LinearDimension,
): BoxDimension = BoxDimension(top, right, bottom, left)