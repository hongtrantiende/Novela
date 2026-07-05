package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pl8  reason: default package */
/* loaded from: classes.dex */
public final class pl8 implements ls {
    public final int a;
    public final int b;
    public final long c;
    public final rub d;
    public final ox8 e;
    public final so6 f;
    public final int g;
    public final int h;
    public final dwb i;

    public pl8(int i, int i2, long j, rub rubVar, ox8 ox8Var, so6 so6Var, int i3, int i4, dwb dwbVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = rubVar;
        this.e = ox8Var;
        this.f = so6Var;
        this.g = i3;
        this.h = i4;
        this.i = dwbVar;
        if (!e4c.a(j, e4c.c) && e4c.c(j) < nae.e) {
            float c = e4c.c(j);
            mv5.c("lineHeight can't be negative (" + c + ")");
        }
    }

    public static pl8 a(pl8 pl8Var, int i, int i2, long j, rub rubVar, so6 so6Var, int i3) {
        long j2;
        rub rubVar2;
        so6 so6Var2;
        if ((i3 & 1) != 0) {
            i = pl8Var.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = pl8Var.b;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            j2 = pl8Var.c;
        } else {
            j2 = j;
        }
        if ((i3 & 8) != 0) {
            rubVar2 = pl8Var.d;
        } else {
            rubVar2 = rubVar;
        }
        ox8 ox8Var = pl8Var.e;
        if ((i3 & 32) != 0) {
            so6Var2 = pl8Var.f;
        } else {
            so6Var2 = so6Var;
        }
        int i6 = pl8Var.g;
        int i7 = pl8Var.h;
        dwb dwbVar = pl8Var.i;
        pl8Var.getClass();
        return new pl8(i4, i5, j2, rubVar2, ox8Var, so6Var2, i6, i7, dwbVar);
    }

    public final pl8 b(pl8 pl8Var) {
        if (pl8Var == null) {
            return this;
        }
        return ql8.a(this, pl8Var.a, pl8Var.b, pl8Var.c, pl8Var.d, pl8Var.e, pl8Var.f, pl8Var.g, pl8Var.h, pl8Var.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pl8) {
                pl8 pl8Var = (pl8) obj;
                if (this.a == pl8Var.a && this.b == pl8Var.b && e4c.a(this.c, pl8Var.c) && c16.i(this.d, pl8Var.d) && c16.i(this.e, pl8Var.e) && c16.i(this.f, pl8Var.f) && this.g == pl8Var.g && this.h == pl8Var.h && c16.i(this.i, pl8Var.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int a = hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
        f4c[] f4cVarArr = e4c.b;
        int c = hl5.c(a, this.c, 31);
        int i4 = 0;
        rub rubVar = this.d;
        if (rubVar != null) {
            i = rubVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = (c + i) * 31;
        ox8 ox8Var = this.e;
        if (ox8Var != null) {
            i2 = ox8Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        so6 so6Var = this.f;
        if (so6Var != null) {
            i3 = so6Var.hashCode();
        } else {
            i3 = 0;
        }
        int a2 = hl5.a(this.h, hl5.a(this.g, (i6 + i3) * 31, 31), 31);
        dwb dwbVar = this.i;
        if (dwbVar != null) {
            i4 = dwbVar.hashCode();
        }
        return a2 + i4;
    }

    public final String toString() {
        String a = tlb.a(this.a);
        String a2 = mpb.a(this.b);
        String e = e4c.e(this.c);
        String a3 = mo6.a(this.g);
        String a4 = hj5.a(this.h);
        StringBuilder y = nk2.y("ParagraphStyle(textAlign=", a, ", textDirection=", a2, ", lineHeight=");
        y.append(e);
        y.append(", textIndent=");
        y.append(this.d);
        y.append(", platformStyle=");
        y.append(this.e);
        y.append(", lineHeightStyle=");
        y.append(this.f);
        y.append(", lineBreak=");
        nk2.C(y, a3, ", hyphens=", a4, ", textMotion=");
        y.append(this.i);
        y.append(")");
        return y.toString();
    }

    public pl8(int i, long j, rub rubVar, int i2, int i3) {
        this(i, 0, (i3 & 4) != 0 ? e4c.c : j, (i3 & 8) != 0 ? null : rubVar, null, null, (i3 & 64) != 0 ? 0 : i2, 0, null);
    }
}
