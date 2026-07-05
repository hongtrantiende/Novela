package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yn6  reason: default package */
/* loaded from: classes.dex */
public final class yn6 implements xp9, dv2 {
    public final xn6 a;
    public final w26 b;

    public yn6(xn6 xn6Var, w26 w26Var) {
        this.a = xn6Var;
        this.b = w26Var;
    }

    @Override // defpackage.dv2
    public final void G(un6 un6Var) {
        this.b.cancel(null);
    }

    @Override // defpackage.xp9
    public final Object a(qj9 qj9Var) {
        return vte.f(this.a, qj9Var);
    }

    @Override // defpackage.xp9
    public final void b() {
        this.a.f(this);
    }

    @Override // defpackage.xp9
    public final void start() {
        this.a.a(this);
    }
}
