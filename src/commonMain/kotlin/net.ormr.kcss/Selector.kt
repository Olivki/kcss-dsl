package net.ormr.kcss


class Selector(var stylesheet: StyleSheetBuilder) : ASelector {
    internal var rows = mutableListOf<Row>()

    operator fun invoke(body: StyleSheetBuilder.() -> Unit): StyleSheetBuilder {
        stylesheet.body()
        return stylesheet
    }

    override fun custom(
        selector: String,
        spaceBefore: Boolean,
        spaceAfter: Boolean,
        body: (StyleSheetBuilder.() -> Unit)?,
    ): Selector {
        if (rows.isEmpty()) {
            rows.add(Row(selector, spaceBefore, spaceAfter))
        } else {
            for (row in rows) {
                row.append(selector, spaceBefore, spaceAfter)
            }
        }

        body?.invoke(stylesheet)
        return this
    }

    fun append(selector: ASelector): Selector = apply {
        when (selector) {
            is Selector -> {
                val newRows = ArrayList<Row>(rows.size * selector.rows.size)
                for (i in rows) {
                    for (k in selector.rows) {
                        val result = Row(i.builder, i.spaceBefore, i.spaceAfter)
                        result.append(k.builder, k.spaceBefore, k.spaceAfter)
                        newRows.add(result)
                    }
                }
                rows = newRows
                selector.stylesheet.moveDataTo(stylesheet)
            }
            is StyleSheetBuilder -> {
                append(selector.selector!!)
                selector.moveDataTo(stylesheet)
            }
        }
    }

    fun toList(selectorPrefix: CharSequence, spaceBefore: Boolean) =
        rows.map { it.toString(selectorPrefix, spaceBefore) }

    fun toString(selectorPrefix: CharSequence, spaceBefore: Boolean) =
        toList(selectorPrefix, spaceBefore).joinToString(",")

    override fun toString() = toString("", true)

    internal class Row(
        content: CharSequence,
        var spaceBefore: Boolean = true,
        var spaceAfter: Boolean = true,
    ) {
        val builder = StringBuilder(content)

        fun append(str: CharSequence, spaceBefore: Boolean, spaceAfter: Boolean) {
            if (builder.isEmpty()) {
                this.spaceBefore = spaceBefore
            } else if (spaceBefore && this.spaceAfter) {
                builder.append(' ')
            }

            builder.append(str)

            this.spaceAfter = spaceAfter
        }

        fun toString(selectorPrefix: CharSequence, spaceBefore: Boolean): String = buildString {
            if (selectorPrefix.isNotEmpty()) {
                append(selectorPrefix)
                if (spaceBefore && this@Row.spaceBefore) append(' ')
            }
            append(builder)
        }

        override fun toString() = builder.toString()
    }

    companion object {
        fun createEmpty(stylesheet: StyleSheetBuilder) = Selector(stylesheet).apply { rows.add(Row("", false, true)) }
    }
}
