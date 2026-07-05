package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ly9  reason: default package */
/* loaded from: classes.dex */
public final class ly9 implements rn6, AutoCloseable {
    public final String a;
    public final ky9 b;
    public boolean c;

    public ly9(String str, ky9 ky9Var) {
        this.a = str;
        this.b = ky9Var;
    }

    @Override // defpackage.rn6
    public final void C(un6 un6Var, jn6 jn6Var) {
        if (jn6Var == jn6.ON_DESTROY) {
            this.c = false;
            un6Var.k().f(this);
        }
    }

    public final void S(s26 s26Var, xn6 xn6Var) {
        s26Var.getClass();
        xn6Var.getClass();
        if (!this.c) {
            this.c = true;
            xn6Var.a(this);
            s26Var.L(this.a, (ut1) this.b.a.f);
            return;
        }
        vs.k("Already attached to lifecycleOwner");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
