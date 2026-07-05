package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n4d  reason: default package */
/* loaded from: classes.dex */
public final class n4d extends l4d {
    public final float C;
    public final float D;
    public final int E;
    public final int F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final String a;
    public final List b;
    public final int c;
    public final hy0 d;
    public final float e;
    public final hy0 f;

    public n4d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, hy0 hy0Var, hy0 hy0Var2, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = hy0Var;
        this.e = f;
        this.f = hy0Var2;
        this.C = f2;
        this.D = f3;
        this.E = i2;
        this.F = i3;
        this.G = f4;
        this.H = f5;
        this.I = f6;
        this.J = f7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n4d.class == obj.getClass()) {
                n4d n4dVar = (n4d) obj;
                if (this.a.equals(n4dVar.a) && c16.i(this.d, n4dVar.d) && this.e == n4dVar.e && c16.i(this.f, n4dVar.f) && this.C == n4dVar.C && this.D == n4dVar.D && this.E == n4dVar.E && this.F == n4dVar.F && this.G == n4dVar.G && this.H == n4dVar.H && this.I == n4dVar.I && this.J == n4dVar.J && this.c == n4dVar.c && c16.i(this.b, n4dVar.b)) {
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
        int l = eub.l(this.a.hashCode() * 31, this.b, 31);
        int i2 = 0;
        hy0 hy0Var = this.d;
        if (hy0Var != null) {
            i = hy0Var.hashCode();
        } else {
            i = 0;
        }
        int d = nk2.d(this.e, (l + i) * 31, 31);
        hy0 hy0Var2 = this.f;
        if (hy0Var2 != null) {
            i2 = hy0Var2.hashCode();
        }
        return Integer.hashCode(this.c) + nk2.d(this.J, nk2.d(this.I, nk2.d(this.H, nk2.d(this.G, hl5.a(this.F, hl5.a(this.E, nk2.d(this.D, nk2.d(this.C, (d + i2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
