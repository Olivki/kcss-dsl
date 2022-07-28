package net.ormr.kcss

interface ASelector : CharSequence {
    override val length: Nothing get() = throw UnsupportedOperationException()

    override fun get(index: Int): Nothing = throw UnsupportedOperationException()

    override fun subSequence(startIndex: Int, endIndex: Int): Nothing = throw UnsupportedOperationException()

    fun custom(
        selector: String,
        _spaceBefore: Boolean = true,
        _spaceAfter: Boolean = true,
        body: (StyleSheetBuilder.() -> Unit)? = null,
    ): Selector

    fun pseudo(selector: String, body: (StyleSheetBuilder.() -> Unit)? = null) = custom(
        selector,
        _spaceBefore = false,
        _spaceAfter = true,
        body = body
    )

    fun pseudoFn(selector: String, body: (StyleSheetBuilder.() -> Unit)? = null) = custom(
        selector,
        _spaceBefore = false,
        _spaceAfter = true,
        body = body
    )
}
