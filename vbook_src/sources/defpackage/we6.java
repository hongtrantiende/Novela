package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: we6  reason: default package */
/* loaded from: classes.dex */
public final class we6 extends uq7 {
    public final float b;
    public final boolean c;

    public we6(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, xe6] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        float f = this.b;
        nx5Var.a = Float.valueOf(f);
        c00 c00Var = nx5Var.b;
        c00Var.b(Float.valueOf(f), "weight");
        c00Var.b(Boolean.valueOf(this.c), "fill");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        xe6 xe6Var = (xe6) mq7Var;
        xe6Var.K = this.b;
        xe6Var.L = this.c;
    }

    public final boolean equals(Object obj) {
        we6 we6Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof we6) {
            we6Var = (we6) obj;
        } else {
            we6Var = null;
        }
        if (we6Var != null && this.b == we6Var.b && this.c == we6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
