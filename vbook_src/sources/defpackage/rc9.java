package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rc9  reason: default package */
/* loaded from: classes3.dex */
public final class rc9 {
    public static final /* synthetic */ r76[] q = {new qv7(rc9.class, "phienAm", "getPhienAm()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qv7(rc9.class, "vietPhrase", "getVietPhrase()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qv7(rc9.class, "name", "getName()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qv7(rc9.class, "pronouns", "getPronouns()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qv7(rc9.class, "luatNhan", "getLuatNhan()Lcom/reader/data/translate/engine/qt/model/QtDicDto;", 0), new qv7(rc9.class, "maxPhraseSize", "getMaxPhraseSize()I", 0), new qv7(rc9.class, "nameVietPhrasePriority", "getNameVietPhrasePriority()I", 0), new qv7(rc9.class, "personalGeneralPriority", "getPersonalGeneralPriority()I", 0), new qv7(rc9.class, "vietPhrasePriority", "getVietPhrasePriority()I", 0), new qv7(rc9.class, "luatNhanMode", "getLuatNhanMode()I", 0), new qv7(rc9.class, "splitMode", "getSplitMode()I", 0), new qv7(rc9.class, "isConvertToSimplified", "isConvertToSimplified()Z", 0), new qv7(rc9.class, "isNameSavePriority", "isNameSavePriority()Z", 0), new qv7(rc9.class, "isPrivSavePriority", "isPrivSavePriority()Z", 0), new qv7(rc9.class, "isDialogueItalicized", "isDialogueItalicized()Z", 0), new qv7(rc9.class, "translateLockup", "getTranslateLockup()Ljava/util/List;", 0)};
    public final u68 a;
    public final u68 b;
    public final u68 c;
    public final u68 d;
    public final u68 e;
    public final hy5 f;
    public final hy5 g;
    public final hy5 h;
    public final hy5 i;
    public final hy5 j;
    public final hy5 k;
    public final ls0 l;
    public final ls0 m;
    public final ls0 n;
    public final ls0 o;
    public final u68 p;

    public rc9() {
        h49 o = v9e.o("qt_settings");
        db9 db9Var = eb9.Companion;
        this.a = dpe.t(o, "phien_am", db9Var.serializer());
        this.b = dpe.t(o, "vietphrase", db9Var.serializer());
        this.c = dpe.t(o, "name", db9Var.serializer());
        this.d = dpe.t(o, "pronouns", db9Var.serializer());
        this.e = dpe.t(o, "luat_nhan", db9Var.serializer());
        this.f = new hy5(o, "max_phrase_size", 12);
        this.g = new hy5(o, "name_vietphrase_priority", 0);
        this.h = new hy5(o, "personal_general_priority", 0);
        this.i = new hy5(o, "vietphrase_priority", 1);
        this.j = new hy5(o, "luat_nhan_mode", 0);
        this.k = new hy5(o, "split_mode", 1);
        this.l = new ls0(o, "convert_simplified", true);
        this.m = new ls0(o, "name_save_priority", true);
        this.n = new ls0(o, "priv_save_priority", true);
        this.o = new ls0(o, "dialogue_italicized", true);
        this.p = dpe.t(o, "translate_lockup", new sz(jc9.Companion.serializer(), 0));
    }

    public final eb9 a() {
        return (eb9) this.e.c(q[4], this);
    }

    public final int b() {
        return ((Number) this.j.c(q[9], this)).intValue();
    }

    public final int c() {
        return ((Number) this.f.c(q[5], this)).intValue();
    }

    public final eb9 d() {
        return (eb9) this.c.c(q[2], this);
    }

    public final int e() {
        return ((Number) this.g.c(q[6], this)).intValue();
    }

    public final int f() {
        return ((Number) this.h.c(q[7], this)).intValue();
    }

    public final eb9 g() {
        return (eb9) this.a.c(q[0], this);
    }

    public final eb9 h() {
        return (eb9) this.d.c(q[3], this);
    }

    public final int i() {
        return ((Number) this.k.c(q[10], this)).intValue();
    }

    public final eb9 j() {
        return (eb9) this.b.c(q[1], this);
    }

    public final int k() {
        return ((Number) this.i.c(q[8], this)).intValue();
    }

    public final boolean l() {
        return ((Boolean) this.l.c(q[11], this)).booleanValue();
    }

    public final void m(eb9 eb9Var) {
        this.e.e(q[4], eb9Var);
    }

    public final void n(eb9 eb9Var) {
        this.c.e(q[2], eb9Var);
    }

    public final void o(eb9 eb9Var) {
        this.a.e(q[0], eb9Var);
    }

    public final void p(eb9 eb9Var) {
        this.d.e(q[3], eb9Var);
    }

    public final void q(eb9 eb9Var) {
        this.b.e(q[1], eb9Var);
    }
}
