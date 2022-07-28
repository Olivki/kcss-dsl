package net.ormr.kcss

import kotlin.reflect.KProperty

class PropertyHandler(val name: String) {
    operator fun getValue(stylesheet: Stylesheet, property: KProperty<*>) = stylesheet.getProperty(name) as Any?

    operator fun setValue(stylesheet: Stylesheet, property: KProperty<*>, value: Any?) {
        stylesheet.setProperty(name, value)
    }
}
