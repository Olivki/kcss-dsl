@file:Suppress("unused")

package net.ormr.kcss

enum class AttributeFilter(private val symbol: Char?) {
    EQUALS(null),           // [attribute=value]
    CONTAINS('*'),          // [attribute*=value]
    CONTAINS_WORD('~'),     // [attribute~=value]
    STARTS_WITH('^'),       // [attribute^=value]
    STARTS_WITH_WORD('|'),  // [attribute|=value]
    ENDS_WITH('$');         // [attribute$=value]

    override fun toString() = symbol?.toString() ?: ""
}

val equals = AttributeFilter.EQUALS
val contains = AttributeFilter.CONTAINS
val containsWord = AttributeFilter.CONTAINS_WORD
val startsWith = AttributeFilter.STARTS_WITH
val startsWithWord = AttributeFilter.STARTS_WITH_WORD
val endsWith = AttributeFilter.ENDS_WITH
