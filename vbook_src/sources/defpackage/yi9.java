package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yi9  reason: default package */
/* loaded from: classes3.dex */
public final class yi9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final long f;

    public yi9(boolean z, boolean z2, boolean z3, boolean z4, int i, long j) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = j;
    }

    public static yi9 a(yi9 yi9Var, boolean z, boolean z2, boolean z3, boolean z4, int i, long j, int i2) {
        if ((i2 & 1) != 0) {
            z = yi9Var.a;
        }
        boolean z5 = z;
        if ((i2 & 2) != 0) {
            z2 = yi9Var.b;
        }
        boolean z6 = z2;
        if ((i2 & 4) != 0) {
            z3 = yi9Var.c;
        }
        boolean z7 = z3;
        if ((i2 & 8) != 0) {
            z4 = yi9Var.d;
        }
        boolean z8 = z4;
        if ((i2 & 16) != 0) {
            i = yi9Var.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            j = yi9Var.f;
        }
        yi9Var.getClass();
        return new yi9(z5, z6, z7, z8, i3, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi9)) {
            return false;
        }
        yi9 yi9Var = (yi9) obj;
        if (this.a == yi9Var.a && this.b == yi9Var.b && this.c == yi9Var.c && this.d == yi9Var.d && this.e == yi9Var.e && this.f == yi9Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + hl5.a(this.e, eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ReaderSettingState(isShowControlWhenStartRead=", this.a, ", isAutoOpenLastRead=", this.b, ", isAlwaysScreenOn=");
        rs8.z(p, this.c, ", isSaveReadHistory=", this.d, ", preloadChapterCount=");
        p.append(this.e);
        p.append(", remindTime=");
        p.append(this.f);
        p.append(")");
        return p.toString();
    }
}
