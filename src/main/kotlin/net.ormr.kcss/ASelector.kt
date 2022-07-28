package net.ormr.kcss

interface ASelector : CharSequence {
    override val length: Int get() = throw UnsupportedOperationException()

    override fun get(index: Int): Char {
        throw UnsupportedOperationException("not implemented")
    }

    override fun subSequence(startIndex: Int, endIndex: Int): CharSequence {
        throw UnsupportedOperationException()
    }

    fun custom(
        selector: String,
        _spaceBefore: Boolean = true,
        _spaceAfter: Boolean = true,
        body: (Stylesheet.() -> Unit)? = null,
    ): Selector

    fun pseudo(selector: String, body: (Stylesheet.() -> Unit)? = null) = custom(
        selector,
        _spaceBefore = false,
        _spaceAfter = true,
        body = body
    )

    fun pseudoFn(selector: String, body: (Stylesheet.() -> Unit)? = null) = custom(
        selector,
        _spaceBefore = false,
        _spaceAfter = true,
        body = body
    )
}
