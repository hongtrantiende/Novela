package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ww2  reason: default package */
/* loaded from: classes.dex */
public final class ww2 implements x2a {
    public final xt4 a;
    public final vw2 b = new vw2(this);
    public final ow7 c = new ow7();
    public final hm8 d;
    public final hm8 e;
    public final hm8 f;

    public ww2(xt4 xt4Var) {
        this.a = xt4Var;
        Boolean bool = Boolean.FALSE;
        this.d = yae.z(bool);
        this.e = yae.z(bool);
        this.f = yae.z(bool);
    }

    @Override // defpackage.x2a
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final float d(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.x2a
    public final Object e(jw7 jw7Var, lu4 lu4Var, m42 m42Var) {
        Object p = k27.p(new uw2(this, jw7Var, lu4Var, (m42) null), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }
}
