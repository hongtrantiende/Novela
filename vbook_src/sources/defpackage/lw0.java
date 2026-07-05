package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lw0  reason: default package */
/* loaded from: classes3.dex */
public final class lw0 {
    public static final /* synthetic */ r76[] h = {new qv7(lw0.class, "isAdBlockEnabled", "isAdBlockEnabled()Z", 0), new qv7(lw0.class, "isDesktopModeEnabled", "isDesktopModeEnabled()Z", 0), new qv7(lw0.class, "searchEngine", "getSearchEngine()Ljava/lang/String;", 0), new qv7(lw0.class, "isTranslateEnabled", "isTranslateEnabled()Z", 0), new qv7(lw0.class, "translateEngine", "getTranslateEngine()Ljava/lang/String;", 0), new qv7(lw0.class, "translateFromLanguage", "getTranslateFromLanguage()Ljava/lang/String;", 0), new qv7(lw0.class, "translateToLanguage", "getTranslateToLanguage()Ljava/lang/String;", 0)};
    public final ls0 a;
    public final ls0 b;
    public final u68 c;
    public final ls0 d;
    public final u68 e;
    public final u68 f;
    public final u68 g;

    public lw0() {
        h49 o = v9e.o("browser_settings");
        this.a = new ls0(o, "ad_block_enabled", true);
        this.b = new ls0(o, "desktop_mode_enabled", false);
        this.c = new u68(o, "search_engine", "google");
        this.d = new ls0(o, "translate_enabled", false);
        this.e = new u68(o, "translate_engine", "");
        this.f = new u68(o, "translate_from_language", "");
        this.g = new u68(o, "translate_to_language", "");
    }

    public final boolean a() {
        return ((Boolean) this.b.c(h[1], this)).booleanValue();
    }
}
