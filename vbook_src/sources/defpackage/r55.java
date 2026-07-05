package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r55  reason: default package */
/* loaded from: classes.dex */
final class r55 extends uq7 {
    public final oyb b;
    public final int c;
    public final int d;

    public r55(oyb oybVar, int i, int i2) {
        this.b = oybVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, t55] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        mq7Var.O = -1;
        mq7Var.P = -1;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(Integer.valueOf(this.c), "minLines");
        c00Var.b(Integer.valueOf(this.d), "maxLines");
        c00Var.b(this.b, "textStyle");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        t55 t55Var = (t55) mq7Var;
        oyb oybVar = t55Var.K;
        oyb oybVar2 = this.b;
        boolean i = c16.i(oybVar, oybVar2);
        int i2 = this.c;
        int i3 = this.d;
        if (i && t55Var.L == i2 && t55Var.M == i3) {
            return;
        }
        t55Var.K = oybVar2;
        t55Var.L = i2;
        t55Var.M = i3;
        t55Var.Q = uaf.z(oybVar2, voe.v(t55Var).W);
        t55Var.N = true;
        ube.y(t55Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r55)) {
            return false;
        }
        r55 r55Var = (r55) obj;
        if (c16.i(this.b, r55Var.b) && this.c == r55Var.c && this.d == r55Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.d;
    }
}
