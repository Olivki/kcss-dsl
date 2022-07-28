package net.ormr.kcss

import net.ormr.kcss.colors.hex
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

internal class ColorPropertyHandler(private val name: String) : ReadWriteProperty<StyleSheetBuilder, Any?> {
    override fun getValue(thisRef: StyleSheetBuilder, property: KProperty<*>) = thisRef.getProperty(name) as Any?

    override fun setValue(thisRef: StyleSheetBuilder, property: KProperty<*>, value: Any?) {
        thisRef.setProperty(
            name,
            when (value) {
                is Int -> hex(value)
                else -> value
            }
        )
    }
}
