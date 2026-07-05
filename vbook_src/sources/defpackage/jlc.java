package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jlc  reason: default package */
/* loaded from: classes3.dex */
public final class jlc {
    public static final /* synthetic */ r76[] f = {new qv7(jlc.class, "isAutoTranslate", "isAutoTranslate()Z", 0), new qv7(jlc.class, "autoDetectLanguageMode", "getAutoDetectLanguageMode()I", 0), new qv7(jlc.class, "isShowRaw", "isShowRaw()Z", 0), new qv7(jlc.class, "engineId", "getEngineId()Ljava/lang/String;", 0)};
    public final h49 a;
    public final ls0 b;
    public final hy5 c;
    public final ls0 d;
    public final u68 e;

    public jlc() {
        h49 o = v9e.o("translate_settings");
        this.a = o;
        this.b = new ls0(o, "auto_translate", false);
        this.c = new hy5(o, "auto_detect_language_mode", 1);
        this.d = new ls0(o, "show_raw", true);
        this.e = new u68(o, "engine_id", "raw");
    }

    public final String a() {
        return (String) this.e.c(f[3], this);
    }
}
