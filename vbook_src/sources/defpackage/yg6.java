package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yg6  reason: default package */
/* loaded from: classes.dex */
public final class yg6 extends uq7 {
    public final lf4 b;
    public final lf4 c;
    public final lf4 d;

    public yg6(lf4 lf4Var, lf4 lf4Var2, lf4 lf4Var3) {
        this.b = lf4Var;
        this.c = lf4Var2;
        this.d = lf4Var3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, zg6] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "fadeInSpec");
        c00Var.b(this.c, "placementSpec");
        c00Var.b(this.d, "fadeOutSpec");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        zg6 zg6Var = (zg6) mq7Var;
        zg6Var.K = this.b;
        zg6Var.L = this.c;
        zg6Var.M = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg6)) {
            return false;
        }
        yg6 yg6Var = (yg6) obj;
        if (c16.i(this.b, yg6Var.b) && c16.i(this.c, yg6Var.c) && c16.i(this.d, yg6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        lf4 lf4Var = this.b;
        if (lf4Var == null) {
            hashCode = 0;
        } else {
            hashCode = lf4Var.hashCode();
        }
        int i2 = hashCode * 31;
        lf4 lf4Var2 = this.c;
        if (lf4Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lf4Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        lf4 lf4Var3 = this.d;
        if (lf4Var3 != null) {
            i = lf4Var3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.b + ", placementSpec=" + this.c + ", fadeOutSpec=" + this.d + ")";
    }
}
