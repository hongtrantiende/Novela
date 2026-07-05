package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ut9  reason: default package */
/* loaded from: classes.dex */
public final class ut9 implements iu5 {
    public final boolean a;
    public final float b;
    public final long c;
    public final wea d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ut9(boolean z, float f, long j, wea weaVar, boolean z2) {
        if (weaVar == null) {
            rg3 rg3Var = rg3.b(f, Float.NaN) ? null : new rg3(f);
            if (rg3Var != null) {
                weaVar = uu9.a(rg3Var.a);
            } else {
                weaVar = null;
            }
            if (weaVar == null) {
                weaVar = lre.g;
            }
        }
        this.a = z;
        this.b = f;
        this.c = j;
        this.d = weaVar;
        this.e = true;
        this.f = z2;
        this.g = true;
        this.h = true;
    }

    @Override // defpackage.iu5
    public final f03 a(gz5 gz5Var) {
        return new z03(gz5Var, this.a, this.b, new k57(this, 7), this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ut9) {
                ut9 ut9Var = (ut9) obj;
                if (this.a != ut9Var.a || !rg3.b(this.b, ut9Var.b) || !zl1.c(this.c, ut9Var.c) || !c16.i(this.d, ut9Var.d) || this.e != ut9Var.e || this.f != ut9Var.f || this.g != ut9Var.g || this.h != ut9Var.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.iu5
    public final int hashCode() {
        int d = nk2.d(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = zl1.j;
        return Boolean.hashCode(this.h) + eub.k(eub.k(eub.k((this.d.hashCode() + hl5.c(d, this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
