package net.ormr.kcss.test

import net.ormr.kcss.StyleSheetBuilder
import kotlin.test.assertEquals

interface ATest {
    fun testRender(expected: String, callback: StyleSheetBuilder.() -> Unit) {
        val stylesheet = StyleSheetBuilder(callback)
        assertEquals(expected, stylesheet.render())
    }

    fun testRender(expected: String, stylesheet: StyleSheetBuilder) {
        assertEquals(expected, stylesheet.render())
    }
}
