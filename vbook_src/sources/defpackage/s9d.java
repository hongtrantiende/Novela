package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s9d  reason: default package */
/* loaded from: classes3.dex */
public final class s9d {
    public static final /* synthetic */ r76[] t = {new qv7(s9d.class, "screenOrientation", "getScreenOrientation()I", 0), new qv7(s9d.class, "resizeMode", "getResizeMode()I", 0), new qv7(s9d.class, "preferredAudioLanguage", "getPreferredAudioLanguage()Ljava/lang/String;", 0), new qv7(s9d.class, "preferredSubtitleLanguage", "getPreferredSubtitleLanguage()Ljava/lang/String;", 0), new qv7(s9d.class, "isAutoPlay", "isAutoPlay()Z", 0), new qv7(s9d.class, "isAutoNextEpisode", "isAutoNextEpisode()Z", 0), new qv7(s9d.class, "isRememberLastPosition", "isRememberLastPosition()Z", 0), new qv7(s9d.class, "isAutoResumeLastPosition", "isAutoResumeLastPosition()Z", 0), new qv7(s9d.class, "isShowSubtitle", "isShowSubtitle()Z", 0), new qv7(s9d.class, "subtitleTextSize", "getSubtitleTextSize()F", 0), new qv7(s9d.class, "subtitleBackgroundOpacity", "getSubtitleBackgroundOpacity()F", 0), new qv7(s9d.class, "subtitleTextColor", "getSubtitleTextColor()J", 0), new qv7(s9d.class, "subtitleBackgroundColor", "getSubtitleBackgroundColor()J", 0), new qv7(s9d.class, "subtitleFontWeight", "getSubtitleFontWeight()I", 0), new qv7(s9d.class, "subtitlePadding", "getSubtitlePadding()F", 0), new qv7(s9d.class, "isMuted", "isMuted()Z", 0), new qv7(s9d.class, "playbackSpeed", "getPlaybackSpeed()F", 0), new qv7(s9d.class, "seekForwardSeconds", "getSeekForwardSeconds()I", 0), new qv7(s9d.class, "seekBackwardSeconds", "getSeekBackwardSeconds()I", 0), new qv7(s9d.class, "isAlwaysScreenOn", "isAlwaysScreenOn()Z", 0), new qv7(s9d.class, "isLockOrientationWhenFullscreen", "isLockOrientationWhenFullscreen()Z", 0), new qv7(s9d.class, "isContinuePlayInPip", "isContinuePlayInPip()Z", 0)};
    public final hy5 a;
    public final hy5 b;
    public final ls0 c;
    public final ls0 d;
    public final ls0 e;
    public final ls0 f;
    public final vi4 g;
    public final vi4 h;
    public final wx6 i;
    public final wx6 j;
    public final hy5 k;
    public final vi4 l;
    public final ls0 m;
    public final vi4 n;
    public final hy5 o;
    public final hy5 p;
    public final ls0 q;
    public final ls0 r;
    public final ls0 s;

    public s9d() {
        h49 o = v9e.o("video_settings");
        this.a = new hy5(o, "screen_orientation", 0);
        this.b = new hy5(o, "resize_mode", 0);
        this.c = new ls0(o, "auto_play", true);
        this.d = new ls0(o, "auto_next_episode", true);
        this.e = new ls0(o, "auto_resume_last_position", false);
        this.f = new ls0(o, "show_subtitle", true);
        this.g = new vi4(o, "subtitle_text_size", 1.0f);
        this.h = new vi4(o, "subtitle_background_opacity", 0.35f);
        this.i = new wx6(o, "subtitle_text_color", 4294967295L);
        this.j = new wx6(o, "subtitle_background_color", 4278190080L);
        this.k = new hy5(o, "subtitle_font_weight", 1);
        this.l = new vi4(o, "subtitle_padding", nae.e);
        this.m = new ls0(o, "muted", false);
        this.n = new vi4(o, "playback_speed", 1.0f);
        this.o = new hy5(o, "seek_forward_seconds", 10);
        this.p = new hy5(o, "seek_backward_seconds", 10);
        this.q = new ls0(o, "always_screen_on", true);
        this.r = new ls0(o, "lock_orientation_when_fullscreen", true);
        this.s = new ls0(o, "continue_play_in_pip", true);
    }
}
