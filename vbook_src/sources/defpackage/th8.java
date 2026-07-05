package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: th8  reason: default package */
/* loaded from: classes.dex */
public final class th8 implements rh8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public th8(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f >= nae.e) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= nae.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (f3 >= nae.e) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z4 & z3 & (f4 >= nae.e))) {
            jv5.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.rh8
    public final float a() {
        return this.d;
    }

    @Override // defpackage.rh8
    public final float b(tc6 tc6Var) {
        if (tc6Var == tc6.a) {
            return this.a;
        }
        return this.c;
    }

    @Override // defpackage.rh8
    public final float c(tc6 tc6Var) {
        if (tc6Var == tc6.a) {
            return this.c;
        }
        return this.a;
    }

    @Override // defpackage.rh8
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof th8) {
            th8 th8Var = (th8) obj;
            if (rg3.b(this.a, th8Var.a) && rg3.b(this.b, th8Var.b) && rg3.b(this.c, th8Var.c) && rg3.b(this.d, th8Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nk2.d(this.c, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String c = rg3.c(this.a);
        String c2 = rg3.c(this.b);
        return nk2.w(nk2.y("PaddingValues(start=", c, ", top=", c2, ", end="), rg3.c(this.c), ", bottom=", rg3.c(this.d), ")");
    }
}
