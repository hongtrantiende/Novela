package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y1c  reason: default package */
/* loaded from: classes3.dex */
public final class y1c {
    public static final /* synthetic */ r76[] o = {new qv7(y1c.class, "isAllowNetwork", "isAllowNetwork()Z", 0), new qv7(y1c.class, "isAllowContinueWhenExit", "isAllowContinueWhenExit()Z", 0), new qv7(y1c.class, "isSkipFocusAudio", "isSkipFocusAudio()Z", 0), new qv7(y1c.class, "isHeadsetButtonControl", "isHeadsetButtonControl()Z", 0), new qv7(y1c.class, "isEnableBackgroundMusic", "isEnableBackgroundMusic()Z", 0), new qv7(y1c.class, "backgroundMusic", "getBackgroundMusic()Ljava/lang/String;", 0), new qv7(y1c.class, "backgroundMusicVolume", "getBackgroundMusicVolume()F", 0), new qv7(y1c.class, "autoOffTime", "getAutoOffTime()J", 0), new qv7(y1c.class, "isSaveOffTime", "isSaveOffTime()Z", 0), new qv7(y1c.class, "isAlwaysExpandTts", "isAlwaysExpandTts()Z", 0), new qv7(y1c.class, "floatStyle", "getFloatStyle()I", 0), new qv7(y1c.class, "tts", "getTts()Ljava/lang/String;", 0), new qv7(y1c.class, "isInsertDefaultSkipWord", "isInsertDefaultSkipWord()Z", 0), new qv7(y1c.class, "lastBookId", "getLastBookId()Ljava/lang/String;", 0)};
    public final mfb a = new mfb(new a1c(1));
    public final ls0 b;
    public final ls0 c;
    public final ls0 d;
    public final ls0 e;
    public final u68 f;
    public final vi4 g;
    public final wx6 h;
    public final ls0 i;
    public final ls0 j;
    public final hy5 k;
    public final u68 l;
    public final ls0 m;
    public final u68 n;

    public y1c() {
        dpe.l(b(), "allow_network", true);
        this.b = dpe.l(b(), "allow_continue_when_exit", true);
        this.c = dpe.l(b(), "skip_focus_audio", false);
        this.d = dpe.l(b(), "headset_button_control", true);
        this.e = dpe.l(b(), "enable_background_music", false);
        this.f = dpe.u(b(), "background_music", "");
        this.g = dpe.p(b(), "background_music_volume", 0.5f);
        this.h = dpe.s(b(), "auto_off_time", 0L);
        this.i = dpe.l(b(), "save_off_time", false);
        this.j = dpe.l(b(), "always_expand_tts", true);
        this.k = dpe.q(b(), "float_style", 1);
        this.l = dpe.u(b(), "tts", "system");
        this.m = dpe.l(b(), "insert_default_skip_word", false);
        this.n = dpe.u(b(), "last_book_id", "");
    }

    public final String a(String str, String str2) {
        String str3;
        str.getClass();
        h49 b = b();
        String p = eub.p("tts_keys_", str, "_", str2);
        gi1 a = cm9.a(String.class);
        if (a.equals(cm9.a(Integer.TYPE))) {
            str3 = (String) b.c(p);
        } else if (a.equals(cm9.a(Long.TYPE))) {
            b.getClass();
            str3 = (String) b.d().b(p);
        } else if (a.equals(cm9.a(String.class))) {
            str3 = b.f(p);
        } else if (a.equals(cm9.a(Float.TYPE))) {
            str3 = (String) b.b(p);
        } else if (a.equals(cm9.a(Double.TYPE))) {
            b.getClass();
            str3 = (String) b.d().a(p);
        } else if (a.equals(cm9.a(Boolean.TYPE))) {
            str3 = (String) b.a(p);
        } else {
            vs.m("Invalid type!");
            return null;
        }
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public final h49 b() {
        return (h49) this.a.getValue();
    }

    public final String c() {
        return (String) this.l.c(o[11], this);
    }
}
