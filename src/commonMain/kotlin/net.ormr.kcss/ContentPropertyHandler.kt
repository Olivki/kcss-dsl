package net.ormr.kcss

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

internal class ContentPropertyHandler(private val name: String) : ReadWriteProperty<StyleSheetBuilder, Any?> {
    override fun getValue(thisRef: StyleSheetBuilder, property: KProperty<*>) = thisRef.getProperty(name) as Any?

    override fun setValue(thisRef: StyleSheetBuilder, property: KProperty<*>, value: Any?) {
        thisRef.setProperty(name, "\"${value.toString().replace("\"", "\\\"")}\"")
    }
}
