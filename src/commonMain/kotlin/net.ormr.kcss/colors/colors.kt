package net.ormr.kcss.colors

fun hex(hex: String): CustomColor = CustomColor.fromHex(hex)

fun hex(hex: Int): CustomColor = CustomColor.fromHex(hex)

fun rgb(r: Int, g: Int, b: Int): CustomColor = CustomColor.fromRgb(r, g, b)

fun rgba(r: Int, g: Int, b: Int, a: Number = 1F): CustomColor = CustomColor.fromRgb(r, g, b, a.toFloat())
