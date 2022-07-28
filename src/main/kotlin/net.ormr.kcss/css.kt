@file:Suppress("unused")

package net.ormr.kcss

fun styleSheet(body: StyleSheetBuilder.() -> Unit) = body

fun StyleSheetBuilder.url(str: String) = "url($str)"