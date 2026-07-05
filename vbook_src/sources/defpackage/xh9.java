package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xh9  reason: default package */
/* loaded from: classes3.dex */
public final class xh9 {
    public static final /* synthetic */ r76[] s = {new qv7(xh9.class, "currentReadingBook", "getCurrentReadingBook()Ljava/lang/String;", 0), new qv7(xh9.class, "isShowControlWhenStartRead", "isShowControlWhenStartRead()Z", 0), new qv7(xh9.class, "isAutoOpenBookLastRead", "isAutoOpenBookLastRead()Z", 0), new qv7(xh9.class, "isSaveReadHistory", "isSaveReadHistory()Z", 0), new qv7(xh9.class, "isAutoBrightness", "isAutoBrightness()Z", 0), new qv7(xh9.class, "brightness", "getBrightness()F", 0), new qv7(xh9.class, "isAlwaysScreenOn", "isAlwaysScreenOn()Z", 0), new qv7(xh9.class, "isTurnPageByVolume", "isTurnPageByVolume()Z", 0), new qv7(xh9.class, "isRevertTurnPageByVolume", "isRevertTurnPageByVolume()Z", 0), new qv7(xh9.class, "isTurnPageByKeyboard", "isTurnPageByKeyboard()Z", 0), new qv7(xh9.class, "turnPageByTouchOrientation", "getTurnPageByTouchOrientation()I", 0), new qv7(xh9.class, "turnPageTouchMode", "getTurnPageTouchMode()I", 0), new qv7(xh9.class, "isAnimationTurnPage", "isAnimationTurnPage()Z", 0), new qv7(xh9.class, "isTurnPageSound", "isTurnPageSound()Z", 0), new qv7(xh9.class, "preloadChapterCount", "getPreloadChapterCount()I", 0), new qv7(xh9.class, "readingTimeAlert", "getReadingTimeAlert()J", 0), new qv7(xh9.class, "txtRules", "getTxtRules()Ljava/util/List;", 0)};
    public final mfb a = new mfb(new pa9(2));
    public final u68 b = dpe.u(b(), "current_reading_book", "");
    public final ls0 c = dpe.l(b(), "show_control_when_start_read", false);
    public final ls0 d = dpe.l(b(), "auto_open_book_last_read", true);
    public final ls0 e = dpe.l(b(), "save_read_history", true);
    public final ls0 f = dpe.l(b(), "auto_brightness", true);
    public final vi4 g = dpe.p(b(), "brightness", 0.5f);
    public final ls0 h = dpe.l(b(), "always_screen_on", true);
    public final ls0 i = dpe.l(b(), "turn_page_volume", false);
    public final ls0 j = dpe.l(b(), "revert_turn_page_volume", false);
    public final ls0 k = dpe.l(b(), "turn_page_keyboard", true);
    public final hy5 l = dpe.q(b(), "turn_page_touch_orientation", 2);
    public final hy5 m = dpe.q(b(), "turn_page_touch_mode", 0);
    public final ls0 n = dpe.l(b(), "animation_turn_page", true);
    public final ls0 o = dpe.l(b(), "turn_page_sound", false);
    public final hy5 p = dpe.q(b(), "preload_chapter_count", 1);
    public final wx6 q = dpe.s(b(), "reading_time_alert", 0);
    public final u68 r = dpe.t(b(), "chapter_txt_rules", new sz(rrc.Companion.serializer(), 0));

    public final float a() {
        return ((Number) this.g.c(s[5], this)).floatValue();
    }

    public final h49 b() {
        return (h49) this.a.getValue();
    }

    public final boolean c() {
        return ((Boolean) this.h.c(s[6], this)).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.f.c(s[4], this)).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.c.c(s[1], this)).booleanValue();
    }
}
