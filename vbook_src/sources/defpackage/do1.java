package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: do1  reason: default package */
/* loaded from: classes.dex */
public final class do1 implements yf0 {
    public final yf0 a;
    public final yf0 b;
    public final boolean c;

    public do1(yf0 yf0Var, yf0 yf0Var2) {
        boolean z;
        yf0Var.getClass();
        yf0Var2.getClass();
        this.a = yf0Var;
        this.b = yf0Var2;
        if (!yf0Var.a() && !yf0Var2.a()) {
            z = false;
        } else {
            z = true;
        }
        this.c = z;
    }

    @Override // defpackage.yf0
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.yf0
    public final void b(ak3 ak3Var, r13 r13Var, sc6 sc6Var, xt4 xt4Var) {
        ak3Var.getClass();
        r13Var.getClass();
        this.a.b(ak3Var, r13Var, sc6Var, xt4Var);
        this.b.b(ak3Var, r13Var, sc6Var, xt4Var);
    }
}
