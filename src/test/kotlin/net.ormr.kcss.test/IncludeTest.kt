package net.ormr.kcss.test

import net.ormr.kcss.*
import org.junit.Test

class IncludeTest : ATest {
    @Test
    fun basic() {
        val css1 = StyleSheetBuilder {
            a { color = 0xffffff }
        }
        val css2 = StyleSheetBuilder {
            a { color = 0xf2cacf }
        }

        testRender("a{color:#fff}a{color:#f2cacf}", css1.include(css2))
    }

    @Test
    fun mixins() {
        val hoverLinks = styleSheet {
            a.hover { color = 0xf2cacf }
        }

        val css = StyleSheetBuilder {
            a { color = 0xffffff }
            hoverLinks()
            a.active { color = 0xff0000 }
        }

        testRender("a{color:#fff}a:hover{color:#f2cacf}a:active{color:#f00}", css)
    }

    @Test
    fun mixins2() {
        val clrfix = styleSheet {
            zoom = 1
            after {
                content = " "
                display = "block"
                clear = "both"
            }
        }

        val css = StyleSheetBuilder {
            div {
                margin = 0
                clrfix()
            }
        }

        testRender("div{margin:0;zoom:1}div:after{content:\" \";display:block;clear:both}", css)
    }
}
