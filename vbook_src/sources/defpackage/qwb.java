package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qwb  reason: default package */
/* loaded from: classes3.dex */
public final class qwb {
    public static final /* synthetic */ r76[] A = {new qv7(qwb.class, "scrollType", "getScrollType()I", 0), new qv7(qwb.class, "isShowReadingProgress", "isShowReadingProgress()Z", 0), new qv7(qwb.class, "isEnableZoomDoubleTap", "isEnableZoomDoubleTap()Z", 0), new qv7(qwb.class, "isEyeProtect", "isEyeProtect()Z", 0), new qv7(qwb.class, "screenOrientation", "getScreenOrientation()I", 0), new qv7(qwb.class, "twoPageLayout", "getTwoPageLayout()I", 0), new qv7(qwb.class, "autoScrollSpeed", "getAutoScrollSpeed()F", 0), new qv7(qwb.class, "themeColorId", "getThemeColorId()Ljava/lang/String;", 0), new qv7(qwb.class, "customThemes", "getCustomThemes()Ljava/lang/String;", 0), new qv7(qwb.class, "textColor", "getTextColor()Ljava/lang/String;", 0), new qv7(qwb.class, "backgroundColor", "getBackgroundColor()Ljava/lang/String;", 0), new qv7(qwb.class, "backgroundImagePath", "getBackgroundImagePath()Ljava/lang/String;", 0), new qv7(qwb.class, "darkMode", "getDarkMode()Z", 0), new qv7(qwb.class, "fontFamily", "getFontFamily()Ljava/lang/String;", 0), new qv7(qwb.class, "fontSize", "getFontSize()F", 0), new qv7(qwb.class, "textIndent", "getTextIndent()F", 0), new qv7(qwb.class, "lineSpacing", "getLineSpacing()F", 0), new qv7(qwb.class, "paragraphSpacing", "getParagraphSpacing()F", 0), new qv7(qwb.class, "letterSpacing", "getLetterSpacing()F", 0), new qv7(qwb.class, "textAlign", "getTextAlign()I", 0), new qv7(qwb.class, "leftMargin", "getLeftMargin()I", 0), new qv7(qwb.class, "rightMargin", "getRightMargin()I", 0), new qv7(qwb.class, "topMargin", "getTopMargin()I", 0), new qv7(qwb.class, "bottomMargin", "getBottomMargin()I", 0), new qv7(qwb.class, "isShowContextOneLine", "isShowContextOneLine()Z", 0), new qv7(qwb.class, "isShowContextHighlight", "isShowContextHighlight()Z", 0), new qv7(qwb.class, "contextMenu", "getContextMenu()Ljava/util/List;", 0), new qv7(qwb.class, "textLookup", "getTextLookup()Ljava/util/List;", 0)};
    public final hy5 a;
    public final ls0 b;
    public final hy5 c;
    public final hy5 d;
    public final vi4 e;
    public final u68 f;
    public final u68 g;
    public final u68 h;
    public final u68 i;
    public final u68 j;
    public final ls0 k;
    public final u68 l;
    public final vi4 m;
    public final vi4 n;
    public final vi4 o;
    public final vi4 p;
    public final vi4 q;
    public final hy5 r;
    public final hy5 s;
    public final hy5 t;
    public final hy5 u;
    public final hy5 v;
    public final ls0 w;
    public final ls0 x;
    public final u68 y;
    public final u68 z;

    public qwb() {
        h49 o = v9e.o("text_settings");
        this.a = new hy5(o, "scroll_type", 0);
        this.b = new ls0(o, "is_eye_protect", false);
        this.c = new hy5(o, "screen_orientation", 0);
        this.d = new hy5(o, "two_page_layout", 0);
        this.e = new vi4(o, "auto_scroll_speed", 1.0f);
        this.f = new u68(o, "theme_id", "");
        this.g = new u68(o, "theme", "[]");
        this.h = new u68(o, "text_color", "");
        this.i = new u68(o, "background_color", "");
        this.j = new u68(o, "background_image_path", "");
        this.k = new ls0(o, "dark_mode", false);
        this.l = new u68(o, "font_family", "font/Literata.otf");
        this.m = new vi4(o, "font_size", 1.25f);
        this.n = new vi4(o, "text_indent", 1.5f);
        this.o = new vi4(o, "line_spacing", 1.1f);
        this.p = new vi4(o, "paragraph_spacing", 0.5f);
        this.q = new vi4(o, "letter_spacing", nae.e);
        this.r = new hy5(o, "text_align", 3);
        this.s = new hy5(o, "left_margin", 16);
        this.t = new hy5(o, "right_margin", 16);
        this.u = new hy5(o, "top_margin", 16);
        this.v = new hy5(o, "bottom_margin", 16);
        this.w = new ls0(o, "show_context_one_line", false);
        this.x = new ls0(o, "show_context_highlight", true);
        this.y = dpe.t(o, "context_menu", new sz(q32.Companion.serializer(), 0));
        this.z = dpe.t(o, "text_lookup", new sz(pvb.Companion.serializer(), 0));
    }
}
