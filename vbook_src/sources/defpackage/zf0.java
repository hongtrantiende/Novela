package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zf0  reason: default package */
/* loaded from: classes3.dex */
public abstract class zf0 {
    public static final ly1 a = new ly1(new mf0(2));

    public static final void a(tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        dc6 dc6Var;
        rv4Var.g0(1211690683);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            boolean f = ((om3) rv4Var.j(nm3.a)).f();
            Object obj = ax1.a;
            if (f) {
                rv4Var.e0(-1722808150);
                long j = ((h27) rv4Var.j(j27.a)).a.p;
                boolean e = rv4Var.e(j);
                Object P = rv4Var.P();
                if (e || P == obj) {
                    P = new th(j, 1);
                    rv4Var.o0(P);
                }
                ec6 R = h9a.R((xt4) P, rv4Var, 1);
                boolean f2 = rv4Var.f(R);
                Object P2 = rv4Var.P();
                if (f2 || P2 == obj) {
                    P2 = new dc6(R);
                    rv4Var.o0(P2);
                }
                dc6Var = (dc6) P2;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1722588329);
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new dc6(null);
                    rv4Var.o0(P3);
                }
                dc6Var = (dc6) P3;
                rv4Var.q(false);
            }
            pye.a(a.a(dc6Var), jce.E(-1788300805, new x0a(tu1Var, 1), rv4Var), rv4Var, 56);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x0a(i, 2, tu1Var);
        }
    }

    public static final nq7 b(dc6 dc6Var, rv4 rv4Var) {
        dc6Var.getClass();
        rv4Var.e0(-1740028344);
        ec6 ec6Var = dc6Var.a;
        kq7 kq7Var = kq7.a;
        if (ec6Var == null) {
            rv4Var.q(false);
            return kq7Var;
        }
        nq7 t = aze.t(kq7Var, ec6Var);
        rv4Var.q(false);
        return t;
    }
}
