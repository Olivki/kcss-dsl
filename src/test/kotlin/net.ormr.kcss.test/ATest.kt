package net.ormr.kcss.test

import net.ormr.kcss.Stylesheet
import org.junit.Assert.assertEquals

interface ATest {
    fun testRender(expected: String, callback: Stylesheet.() -> Unit) {
        val stylesheet = Stylesheet(callback)
        assertEquals(expected, stylesheet.render())
    }

    fun testRender(expected: String, stylesheet: Stylesheet) {
        assertEquals(expected, stylesheet.render())
    }
}
