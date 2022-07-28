package net.ormr.kcss

import kotlin.reflect.KProperty

class ContentPropertyHandler(val name: String) {
    operator fun getValue(stylesheet: StyleSheetBuilder, property: KProperty<*>) = stylesheet.getProperty(name) as Any?

    operator fun setValue(stylesheet: StyleSheetBuilder, property: KProperty<*>, value: Any?) {
        stylesheet.setProperty(name, "\"${value.toString().replace("\"", "\\\"")}\"")
    }
}
