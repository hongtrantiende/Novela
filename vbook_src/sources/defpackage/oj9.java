package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oj9  reason: default package */
/* loaded from: classes.dex */
public final class oj9 {
    public final pe4 a;
    public final ra3 b;

    public oj9(long j, pe4 pe4Var, hn8 hn8Var) {
        this.a = pe4Var;
        this.b = new ra3(j, pe4Var, hn8Var);
    }

    public final k57 a(String str) {
        e31 e31Var = e31.d;
        o40 q = this.b.q(p40.o(str).d("SHA-256").f());
        if (q != null) {
            return new k57(q, 4);
        }
        return null;
    }

    public final nj9 b(String str) {
        e31 e31Var = e31.d;
        pa3 C = this.b.C(p40.o(str).d("SHA-256").f());
        if (C != null) {
            return new nj9(C);
        }
        return null;
    }

    public final boolean c(String str) {
        ra3 ra3Var = this.b;
        e31 e31Var = e31.d;
        String f = p40.o(str).d("SHA-256").f();
        synchronized (ra3Var.D) {
            if (!ra3Var.J) {
                ra3.y0(f);
                ra3Var.G();
                oa3 oa3Var = (oa3) ra3Var.f.get(f);
                if (oa3Var == null) {
                    return false;
                }
                ra3Var.m0(oa3Var);
                if (ra3Var.E <= ra3Var.b) {
                    ra3Var.K = false;
                }
                return true;
            }
            throw new IllegalStateException("cache is closed");
        }
    }
}
