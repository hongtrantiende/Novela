package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mr8  reason: default package */
/* loaded from: classes3.dex */
public final class mr8 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final String e;
    public final float f;
    public final int g;
    public final double h;

    public mr8(boolean z, boolean z2, String str, boolean z3, String str2, float f, int i, double d) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = str2;
        this.f = f;
        this.g = i;
        this.h = d;
    }

    public static mr8 a(mr8 mr8Var, boolean z, String str, float f, int i, double d, int i2) {
        boolean z2;
        boolean z3;
        int i3;
        double d2;
        if ((i2 & 1) != 0) {
            z2 = mr8Var.a;
        } else {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i2 & 2) != 0) {
            z = mr8Var.b;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            str = mr8Var.c;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z3 = mr8Var.d;
        } else {
            z3 = true;
        }
        boolean z6 = z3;
        String str3 = mr8Var.e;
        if ((i2 & 32) != 0) {
            f = mr8Var.f;
        }
        float f2 = f;
        if ((i2 & 64) != 0) {
            i3 = mr8Var.g;
        } else {
            i3 = i;
        }
        if ((i2 & Token.CASE) != 0) {
            d2 = mr8Var.h;
        } else {
            d2 = d;
        }
        mr8Var.getClass();
        return new mr8(z4, z5, str2, z6, str3, f2, i3, d2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mr8) {
                mr8 mr8Var = (mr8) obj;
                if (this.a != mr8Var.a || this.b != mr8Var.b || !this.c.equals(mr8Var.c) || this.d != mr8Var.d || !this.e.equals(mr8Var.e) || Float.compare(this.f, mr8Var.f) != 0 || this.g != mr8Var.g || Double.compare(this.h, mr8Var.h) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Double.hashCode(this.h) + hl5.a(this.g, nk2.d(this.f, eub.j(eub.k(eub.j(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("PdfState(isLoading=", this.a, ", isImporting=", this.b, ", bookName=");
        rs8.y(p, this.c, ", isError=", this.d, ", errorMessage=");
        p.append(this.e);
        p.append(", savedZoom=");
        p.append(this.f);
        p.append(", savedLayoutMode=");
        p.append(this.g);
        p.append(", lastReadPercent=");
        p.append(this.h);
        p.append(")");
        return p.toString();
    }
}
