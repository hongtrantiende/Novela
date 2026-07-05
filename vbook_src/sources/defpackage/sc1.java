package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc1  reason: default package */
/* loaded from: classes.dex */
public final class sc1 {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Integer h;
    public final Integer i;

    public sc1(float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Integer num, Integer num2) {
        this.a = f;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = num;
        this.i = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc1)) {
            return false;
        }
        sc1 sc1Var = (sc1) obj;
        if (Float.compare(this.a, sc1Var.a) == 0 && this.b == sc1Var.b && this.c == sc1Var.c && this.d == sc1Var.d && this.e == sc1Var.e && this.f == sc1Var.f && this.g == sc1Var.g && c16.i(this.h, sc1Var.h) && c16.i(this.i, sc1Var.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.k(eub.k(eub.k(eub.k(eub.k(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        int i = 0;
        Integer num = this.h;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (k + hashCode) * 31;
        Integer num2 = this.i;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharStyle(textSize=");
        sb.append(this.a);
        sb.append(", isItalic=");
        sb.append(this.b);
        sb.append(", isBold=");
        rs8.z(sb, this.c, ", isUnderLine=", this.d, ", isStrikethrough=");
        rs8.z(sb, this.e, ", isSubscript=", this.f, ", isSuperscript=");
        sb.append(this.g);
        sb.append(", textColor=");
        sb.append(this.h);
        sb.append(", background=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
