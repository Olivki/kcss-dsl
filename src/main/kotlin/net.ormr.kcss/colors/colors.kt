package net.ormr.kcss.colors

fun hex(hex: String): Color = Color.fromHex(hex)

fun hex(hex: Int): Color = Color.fromHex(hex)

fun rgb(r: Int, g: Int, b: Int): Color = Color.fromRgb(r, g, b)

fun rgba(r: Int, g: Int, b: Int, a: Number = 1F): Color = Color.fromRgb(r, g, b, a.toFloat())
