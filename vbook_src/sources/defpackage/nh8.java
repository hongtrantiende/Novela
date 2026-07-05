package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nh8  reason: default package */
/* loaded from: classes.dex */
public final class nh8 extends uq7 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final xt4 f;

    public nh8(float f, float f2, float f3, float f4, xt4 xt4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = xt4Var;
        boolean z4 = true;
        if (f < nae.e && !Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (f2 < nae.e && !Float.isNaN(f2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = z & z2;
        if (f3 < nae.e && !Float.isNaN(f3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = z5 & z3;
        if (f4 < nae.e && !Float.isNaN(f4)) {
            z4 = false;
        }
        if (!(z6 & z4)) {
            jv5.a("Padding must be non-negative");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qh8, mq7] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        mq7Var.N = this.e;
        mq7Var.O = true;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        this.f.invoke(nx5Var);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        qh8 qh8Var = (qh8) mq7Var;
        qh8Var.K = this.b;
        qh8Var.L = this.c;
        qh8Var.M = this.d;
        qh8Var.N = this.e;
        qh8Var.O = true;
    }

    public final boolean equals(Object obj) {
        nh8 nh8Var;
        if (obj instanceof nh8) {
            nh8Var = (nh8) obj;
        } else {
            nh8Var = null;
        }
        if (nh8Var != null && rg3.b(this.b, nh8Var.b) && rg3.b(this.c, nh8Var.c) && rg3.b(this.d, nh8Var.d) && rg3.b(this.e, nh8Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }
}
