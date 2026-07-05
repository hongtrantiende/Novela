package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x6c  reason: default package */
/* loaded from: classes3.dex */
public final class x6c {
    public final long a;
    public final mv b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final double i;
    public final float j;
    public final float k;
    public final eo4 l;
    public final int m;
    public final String n;
    public final float o;

    public x6c(long j, mv mvVar, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, double d, float f, float f2, eo4 eo4Var, int i3, String str, float f3, int i4) {
        long j2;
        mv mvVar2;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6;
        double d2;
        float f4;
        eo4 eo4Var2;
        int i7;
        String str2;
        float f5;
        if ((i4 & 1) != 0) {
            j2 = zl1.h;
        } else {
            j2 = j;
        }
        if ((i4 & 2) != 0) {
            mvVar2 = mv.c;
        } else {
            mvVar2 = mvVar;
        }
        if ((i4 & 4) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 8) != 0) {
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i4 & 16) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i4 & 32) != 0) {
            z7 = true;
        } else {
            z7 = z3;
        }
        if ((i4 & 64) != 0) {
            z8 = false;
        } else {
            z8 = z4;
        }
        if ((i4 & Token.CASE) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            d2 = 0.0d;
        } else {
            d2 = d;
        }
        if ((i4 & 1024) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f;
        }
        float f6 = (i4 & 2048) == 0 ? f2 : 1.0f;
        if ((i4 & 4096) != 0) {
            eo4Var2 = eo4.a;
        } else {
            eo4Var2 = eo4Var;
        }
        eo4 eo4Var3 = eo4Var2;
        if ((i4 & 8192) != 0) {
            i7 = 0;
        } else {
            i7 = i3;
        }
        int i8 = i7;
        if ((i4 & 16384) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i4 & 32768) != 0) {
            f5 = 0.35f;
        } else {
            f5 = f3;
        }
        eo4Var3.getClass();
        str2.getClass();
        this.a = j2;
        this.b = mvVar2;
        this.c = i5;
        this.d = z5;
        this.e = z6;
        this.f = z7;
        this.g = z8;
        this.h = i6;
        this.i = d2;
        this.j = f4;
        this.k = f6;
        this.l = eo4Var3;
        this.m = i8;
        this.n = str2;
        this.o = f5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x6c) {
                x6c x6cVar = (x6c) obj;
                if (!zl1.c(this.a, x6cVar.a) || this.b != x6cVar.b || this.c != x6cVar.c || this.d != x6cVar.d || this.e != x6cVar.e || this.f != x6cVar.f || this.g != x6cVar.g || this.h != x6cVar.h || Double.compare(this.i, x6cVar.i) != 0 || Float.compare(this.j, x6cVar.j) != 0 || Float.compare(this.k, x6cVar.k) != 0 || !c16.i(this.l, x6cVar.l) || this.m != x6cVar.m || !c16.i(this.n, x6cVar.n) || Float.compare(this.o, x6cVar.o) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = zl1.j;
        int hashCode = this.b.hashCode();
        int d = nk2.d(this.k, nk2.d(this.j, eub.k((Double.hashCode(this.i) + hl5.a(this.h, eub.k(eub.k(eub.k(eub.k(hl5.a(this.c, (hashCode + (Long.hashCode(this.a) * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31)) * 31, 31, false), 31), 31);
        return Float.hashCode(this.o) + eub.j(hl5.a(this.m, (this.l.hashCode() + d) * 31, 31), 31, this.n);
    }

    public final String toString() {
        String i = zl1.i(this.a);
        StringBuilder sb = new StringBuilder("ThemeState(primaryColor=");
        sb.append(i);
        sb.append(", background=");
        sb.append(this.b);
        sb.append(", darkTheme=");
        eub.w(sb, this.c, ", useAmoledTheme=", this.d, ", useEInkTheme=");
        rs8.z(sb, this.e, ", useLiquidGlass=", this.f, ", useSystemColor=");
        sb.append(this.g);
        sb.append(", style=");
        sb.append(this.h);
        sb.append(", contrastLevel=");
        sb.append(this.i);
        sb.append(", isExtendedFidelity=false, fontScale=");
        sb.append(this.j);
        sb.append(", densityScale=");
        sb.append(this.k);
        sb.append(", fontFamily=");
        sb.append(this.l);
        sb.append(", swipeBack=");
        sb.append(this.m);
        sb.append(", backgroundImage=");
        sb.append(this.n);
        sb.append(", backgroundImageAlpha=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
