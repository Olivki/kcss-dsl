@file:Suppress("unused")

package net.ormr.kcss

// CSS Reference
// http://www.w3schools.com/cssref/default.asp


// Color Properties
var StyleSheetBuilder.color by ColorPropertyHandler("color")
var StyleSheetBuilder.opacity by PropertyHandler("opacity")

// Background and Border Properties
var StyleSheetBuilder.background by PropertyHandler("background")
var StyleSheetBuilder.backgroundAttachment by PropertyHandler("background-attachment")
var StyleSheetBuilder.backgroundBlendMode by PropertyHandler("background-blend-mode")
var StyleSheetBuilder.backgroundColor by ColorPropertyHandler("background-color")
var StyleSheetBuilder.backgroundImage by PropertyHandler("background-image")
var StyleSheetBuilder.backgroundPosition by PropertyHandler("background-position")
var StyleSheetBuilder.backgroundRepeat by PropertyHandler("background-repeat")
var StyleSheetBuilder.backgroundClip by PropertyHandler("background-clip")
var StyleSheetBuilder.backgroundOrigin by PropertyHandler("background-origin")
var StyleSheetBuilder.backgroundSize by PropertyHandler("background-size")
var StyleSheetBuilder.border by PropertyHandler("border")
var StyleSheetBuilder.borderBottom by PropertyHandler("border-bottom")
var StyleSheetBuilder.borderBottomColor by ColorPropertyHandler("border-bottom-color")
var StyleSheetBuilder.borderBottomLeftRadius by PropertyHandler("border-bottom-left-radius")
var StyleSheetBuilder.borderBottomRightRadius by PropertyHandler("border-bottom-right-radius")
var StyleSheetBuilder.borderBottomStyle by PropertyHandler("border-bottom-style")
var StyleSheetBuilder.borderBottomWidth by PropertyHandler("border-bottom-width")
var StyleSheetBuilder.borderColor by ColorPropertyHandler("border-color")
var StyleSheetBuilder.borderImage by PropertyHandler("border-image")
var StyleSheetBuilder.borderImageOutset by PropertyHandler("border-image-outset")
var StyleSheetBuilder.borderImageRepeat by PropertyHandler("border-image-repeat")
var StyleSheetBuilder.borderImageSlice by PropertyHandler("border-image-slice")
var StyleSheetBuilder.borderImageSource by PropertyHandler("border-image-source")
var StyleSheetBuilder.borderImageWidth by PropertyHandler("border-image-width")
var StyleSheetBuilder.borderLeft by PropertyHandler("border-left")
var StyleSheetBuilder.borderLeftColor by ColorPropertyHandler("border-left-color")
var StyleSheetBuilder.borderLeftStyle by PropertyHandler("border-left-style")
var StyleSheetBuilder.borderLeftWidth by PropertyHandler("border-left-width")
var StyleSheetBuilder.borderRadius by PropertyHandler("border-radius")
var StyleSheetBuilder.borderRight by PropertyHandler("border-right")
var StyleSheetBuilder.borderRightColor by ColorPropertyHandler("border-right-color")
var StyleSheetBuilder.borderRightStyle by PropertyHandler("border-right-style")
var StyleSheetBuilder.borderRightWidth by PropertyHandler("border-right-width")
var StyleSheetBuilder.borderStyle by PropertyHandler("border-style")
var StyleSheetBuilder.borderTop by PropertyHandler("border-top")
var StyleSheetBuilder.borderTopColor by ColorPropertyHandler("border-top-color")
var StyleSheetBuilder.borderTopLeftRadius by PropertyHandler("border-top-left-radius")
var StyleSheetBuilder.borderTopRightRadius by PropertyHandler("border-top-right-radius")
var StyleSheetBuilder.borderTopStyle by PropertyHandler("border-top-style")
var StyleSheetBuilder.borderTopWidth by PropertyHandler("border-top-width")
var StyleSheetBuilder.borderWidth by PropertyHandler("border-width")
var StyleSheetBuilder.boxDecorationBreak by PropertyHandler("box-decoration-break")
var StyleSheetBuilder.boxShadow by PropertyHandler("box-shadow")

// Basic Box Properties
var StyleSheetBuilder.bottom by PropertyHandler("bottom")
var StyleSheetBuilder.clear by PropertyHandler("clear")
var StyleSheetBuilder.clip by PropertyHandler("clip")
var StyleSheetBuilder.display by PropertyHandler("display")
var StyleSheetBuilder.float by PropertyHandler("float")
var StyleSheetBuilder.height by PropertyHandler("height")
var StyleSheetBuilder.left by PropertyHandler("left")
var StyleSheetBuilder.margin by PropertyHandler("margin")
var StyleSheetBuilder.marginBottom by PropertyHandler("margin-bottom")
var StyleSheetBuilder.marginLeft by PropertyHandler("margin-left")
var StyleSheetBuilder.marginRight by PropertyHandler("margin-right")
var StyleSheetBuilder.marginTop by PropertyHandler("margin-top")
var StyleSheetBuilder.maxHeight by PropertyHandler("max-height")
var StyleSheetBuilder.maxWidth by PropertyHandler("max-width")
var StyleSheetBuilder.minHeight by PropertyHandler("min-height")
var StyleSheetBuilder.minWidth by PropertyHandler("min-width")
var StyleSheetBuilder.overflow by PropertyHandler("overflow")
var StyleSheetBuilder.overflowX by PropertyHandler("overflow-x")
var StyleSheetBuilder.overflowY by PropertyHandler("overflow-y")
var StyleSheetBuilder.padding by PropertyHandler("padding")
var StyleSheetBuilder.paddingBottom by PropertyHandler("padding-bottom")
var StyleSheetBuilder.paddingLeft by PropertyHandler("padding-left")
var StyleSheetBuilder.paddingRight by PropertyHandler("padding-right")
var StyleSheetBuilder.paddingTop by PropertyHandler("padding-top")
var StyleSheetBuilder.position by PropertyHandler("position")
var StyleSheetBuilder.right by PropertyHandler("right")
var StyleSheetBuilder.top by PropertyHandler("top")
var StyleSheetBuilder.visibility by PropertyHandler("visibility")
var StyleSheetBuilder.width by PropertyHandler("width")
var StyleSheetBuilder.verticalAlign by PropertyHandler("vertical-align")
var StyleSheetBuilder.zIndex by PropertyHandler("z-index")

// Flexible Box Layout
var StyleSheetBuilder.alignContent by PropertyHandler("align-content")
var StyleSheetBuilder.alignItems by PropertyHandler("align-items")
var StyleSheetBuilder.alignSelf by PropertyHandler("align-self")
var StyleSheetBuilder.flex by PropertyHandler("flex")
var StyleSheetBuilder.flexBasis by PropertyHandler("flex-basis")
var StyleSheetBuilder.flexDirection by PropertyHandler("flex-direction")
var StyleSheetBuilder.flexFlow by PropertyHandler("flex-flow")
var StyleSheetBuilder.flexGrow by PropertyHandler("flex-grow")
var StyleSheetBuilder.flexShrink by PropertyHandler("flex-shrink")
var StyleSheetBuilder.flexWrap by PropertyHandler("flex-wrap")
var StyleSheetBuilder.justifyContent by PropertyHandler("justify-content")
var StyleSheetBuilder.order by PropertyHandler("order")

// Text Properties
var StyleSheetBuilder.hangingPunctuation by PropertyHandler("hanging-punctuation")
var StyleSheetBuilder.hyphens by PropertyHandler("hyphens")
var StyleSheetBuilder.letterSpacing by PropertyHandler("letter-spacing")
var StyleSheetBuilder.lineBreak by PropertyHandler("line-break")
var StyleSheetBuilder.lineHeight by PropertyHandler("line-height")
var StyleSheetBuilder.overflowWrap by PropertyHandler("overflow-wrap")
var StyleSheetBuilder.tabSize by PropertyHandler("tab-size")
var StyleSheetBuilder.textAlign by PropertyHandler("text-align")
var StyleSheetBuilder.textAlignLast by PropertyHandler("text-align-last")
var StyleSheetBuilder.textIndent by PropertyHandler("text-indent")
var StyleSheetBuilder.textJustify by PropertyHandler("text-justify")
var StyleSheetBuilder.textTransform by PropertyHandler("text-transform")
var StyleSheetBuilder.whiteSpace by PropertyHandler("white-space")
var StyleSheetBuilder.wordBreak by PropertyHandler("word-break")
var StyleSheetBuilder.wordSpacing by PropertyHandler("word-spacing")
var StyleSheetBuilder.wordWrap by PropertyHandler("word-wrap")

// Text Decoration Properties
var StyleSheetBuilder.textDecoration by PropertyHandler("text-decoration")
var StyleSheetBuilder.textDecorationColor by ColorPropertyHandler("text-decoration-color")
var StyleSheetBuilder.textDecorationLine by PropertyHandler("text-decoration-line")
var StyleSheetBuilder.textDecorationStyle by PropertyHandler("text-decoration-style")
var StyleSheetBuilder.textShadow by PropertyHandler("text-shadow")
var StyleSheetBuilder.textUnderlinePosition by PropertyHandler("text-underline-position")

// Font Properties
var StyleSheetBuilder.font by PropertyHandler("font")
var StyleSheetBuilder.fontFamily by PropertyHandler("font-family")
var StyleSheetBuilder.fontFeatureSettings by PropertyHandler("font-feature-settings")
var StyleSheetBuilder.fontKerning by PropertyHandler("font-kerning")
var StyleSheetBuilder.fontLanguageOverride by PropertyHandler("font-language-override")
var StyleSheetBuilder.fontSize by PropertyHandler("font-size")
var StyleSheetBuilder.fontSizeAdjust by PropertyHandler("font-size-adjust")
var StyleSheetBuilder.fontStretch by PropertyHandler("font-stretch")
var StyleSheetBuilder.fontStyle by PropertyHandler("font-style")
var StyleSheetBuilder.fontSynthesis by PropertyHandler("font-synthesis")
var StyleSheetBuilder.fontVariant by PropertyHandler("font-variant")
var StyleSheetBuilder.fontVariantAlternates by PropertyHandler("font-variant-alternates")
var StyleSheetBuilder.fontVariantCaps by PropertyHandler("font-variant-caps")
var StyleSheetBuilder.fontVariantEastAsian by PropertyHandler("font-variant-east-asian")
var StyleSheetBuilder.fontVariantLigatures by PropertyHandler("font-variant-ligatures")
var StyleSheetBuilder.fontVariantNumeric by PropertyHandler("font-variant-numeric")
var StyleSheetBuilder.fontVariantPosition by PropertyHandler("font-variant-position")
var StyleSheetBuilder.fontWeight by PropertyHandler("font-weight")

// Writing Modes Properties
var StyleSheetBuilder.direction by PropertyHandler("direction")
var StyleSheetBuilder.textOrientation by PropertyHandler("text-orientation")
var StyleSheetBuilder.textCombineUpright by PropertyHandler("text-combine-upright")
var StyleSheetBuilder.unicodeBidi by PropertyHandler("unicode-bidi")
var StyleSheetBuilder.writingMode by PropertyHandler("writing-mode")

// Table Properties
var StyleSheetBuilder.borderCollapse by PropertyHandler("border-collapse")
var StyleSheetBuilder.borderSpacing by PropertyHandler("border-spacing")
var StyleSheetBuilder.captionSide by PropertyHandler("caption-side")
var StyleSheetBuilder.emptyCells by PropertyHandler("empty-cells")
var StyleSheetBuilder.tableLayout by PropertyHandler("table-layout")

// Lists and Counters Properties
var StyleSheetBuilder.counterIncrement by PropertyHandler("counter-increment")
var StyleSheetBuilder.counterReset by PropertyHandler("counter-reset")
var StyleSheetBuilder.listStyle by PropertyHandler("list-style")
var StyleSheetBuilder.listStyleImage by PropertyHandler("list-style-image")
var StyleSheetBuilder.listStylePosition by PropertyHandler("list-style-position")
var StyleSheetBuilder.listStyleType by PropertyHandler("list-style-type")

// Animation Properties
var StyleSheetBuilder.animation by PropertyHandler("animation")
var StyleSheetBuilder.animationDelay by PropertyHandler("animation-delay")
var StyleSheetBuilder.animationDirection by PropertyHandler("animation-direction")
var StyleSheetBuilder.animationDuration by PropertyHandler("animation-duration")
var StyleSheetBuilder.animationFillMode by PropertyHandler("animation-fill-mode")
var StyleSheetBuilder.animationIterationCount by PropertyHandler("animation-iteration-count")
var StyleSheetBuilder.animationName by PropertyHandler("animation-name")
var StyleSheetBuilder.animationPlayState by PropertyHandler("animation-play-state")
var StyleSheetBuilder.animationTimingFunction by PropertyHandler("animation-timing-function")

// Transform Properties
var StyleSheetBuilder.backfaceVisibility by PropertyHandler("backface-visibility")
var StyleSheetBuilder.perspective by PropertyHandler("perspective")
var StyleSheetBuilder.perspectiveOrigin by PropertyHandler("perspective-origin")
var StyleSheetBuilder.transform by PropertyHandler("transform")
var StyleSheetBuilder.transformOrigin by PropertyHandler("transform-origin")
var StyleSheetBuilder.transformStyle by PropertyHandler("transform-style")

// Transitions Properties
var StyleSheetBuilder.transition by PropertyHandler("transition")
var StyleSheetBuilder.transitionProperty by PropertyHandler("transition-property")
var StyleSheetBuilder.transitionDuration by PropertyHandler("transition-duration")
var StyleSheetBuilder.transitionTimingFunction by PropertyHandler("transition-timing-function")
var StyleSheetBuilder.transitionDelay by PropertyHandler("transition-delay")

// Basic User Interface Properties
var StyleSheetBuilder.boxSizing by PropertyHandler("box-sizing")
var StyleSheetBuilder.content by ContentPropertyHandler("content")
var StyleSheetBuilder.cursor by PropertyHandler("cursor")
var StyleSheetBuilder.imeMode by PropertyHandler("ime-mode")
var StyleSheetBuilder.navDown by PropertyHandler("nav-down")
var StyleSheetBuilder.navIndex by PropertyHandler("nav-index")
var StyleSheetBuilder.navLeft by PropertyHandler("nav-left")
var StyleSheetBuilder.navRight by PropertyHandler("nav-right")
var StyleSheetBuilder.navUp by PropertyHandler("nav-up")
var StyleSheetBuilder.outline by PropertyHandler("outline")
var StyleSheetBuilder.outlineColor by ColorPropertyHandler("outline-color")
var StyleSheetBuilder.outlineOffset by PropertyHandler("outline-offset")
var StyleSheetBuilder.outlineStyle by PropertyHandler("outline-style")
var StyleSheetBuilder.outlineWidth by PropertyHandler("outline-width")
var StyleSheetBuilder.resize by PropertyHandler("resize")
var StyleSheetBuilder.textOverflow by PropertyHandler("text-overflow")

// Multi-column Layout Properties
var StyleSheetBuilder.breakAfter by PropertyHandler("break-after")
var StyleSheetBuilder.breakBefore by PropertyHandler("break-before")
var StyleSheetBuilder.breakInside by PropertyHandler("break-inside")
var StyleSheetBuilder.columnCount by PropertyHandler("column-count")
var StyleSheetBuilder.columnFill by PropertyHandler("column-fill")
var StyleSheetBuilder.columnGap by PropertyHandler("column-gap")
var StyleSheetBuilder.columnRule by PropertyHandler("column-rule")
var StyleSheetBuilder.columnRuleColor by ColorPropertyHandler("column-rule-color")
var StyleSheetBuilder.columnRuleStyle by PropertyHandler("column-rule-style")
var StyleSheetBuilder.columnRuleWidth by PropertyHandler("column-rule-width")
var StyleSheetBuilder.columnSpan by PropertyHandler("column-span")
var StyleSheetBuilder.columnWidth by PropertyHandler("column-width")
var StyleSheetBuilder.columns by PropertyHandler("columns")
var StyleSheetBuilder.widows by PropertyHandler("widows")

// Paged Media
var StyleSheetBuilder.orphans by PropertyHandler("orphans")
var StyleSheetBuilder.pageBreakAfter by PropertyHandler("page-break-after")
var StyleSheetBuilder.pageBreakBefore by PropertyHandler("page-break-before")
var StyleSheetBuilder.pageBreakInside by PropertyHandler("page-break-inside")

// Generated Content for Paged Media
var StyleSheetBuilder.marks by PropertyHandler("marks")
var StyleSheetBuilder.quotes by PropertyHandler("quotes")

// Filter Effects Properties
var StyleSheetBuilder.filter by PropertyHandler("filter")

// Image Values and Replaced Content
var StyleSheetBuilder.imageOrientation by PropertyHandler("image-orientation")
var StyleSheetBuilder.imageRendering by PropertyHandler("image-rendering")
var StyleSheetBuilder.imageResolution by PropertyHandler("image-resolution")
var StyleSheetBuilder.objectFit by PropertyHandler("object-fit")
var StyleSheetBuilder.objectPosition by PropertyHandler("object-position")

// Masking Properties
var StyleSheetBuilder.mask by PropertyHandler("mask")
var StyleSheetBuilder.maskType by PropertyHandler("mask-type")

// Speech Properties
var StyleSheetBuilder.mark by PropertyHandler("mark")
var StyleSheetBuilder.markAfter by PropertyHandler("mark-after")
var StyleSheetBuilder.markBefore by PropertyHandler("mark-before")
var StyleSheetBuilder.phonemes by PropertyHandler("phonemes")
var StyleSheetBuilder.rest by PropertyHandler("rest")
var StyleSheetBuilder.restAfter by PropertyHandler("rest-after")
var StyleSheetBuilder.restBefore by PropertyHandler("rest-before")
var StyleSheetBuilder.voiceBalance by PropertyHandler("voice-balance")
var StyleSheetBuilder.voiceDuration by PropertyHandler("voice-duration")
var StyleSheetBuilder.voicePitch by PropertyHandler("voice-pitch")
var StyleSheetBuilder.voicePitchRange by PropertyHandler("voice-pitch-range")
var StyleSheetBuilder.voiceRate by PropertyHandler("voice-rate")
var StyleSheetBuilder.voiceStress by PropertyHandler("voice-stress")
var StyleSheetBuilder.voiceVolume by PropertyHandler("voice-volume")

// Marquee Properties
var StyleSheetBuilder.marqueeDirection by PropertyHandler("marquee-direction")
var StyleSheetBuilder.marqueePlayCount by PropertyHandler("marquee-play-count")
var StyleSheetBuilder.marqueeSpeed by PropertyHandler("marquee-speed")
var StyleSheetBuilder.marqueeStyle by PropertyHandler("marquee-style")

// Exotic
var StyleSheetBuilder.zoom by PropertyHandler("zoom")
var StyleSheetBuilder.src by PropertyHandler("src") // @font-face
