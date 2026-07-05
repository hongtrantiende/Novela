package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pa7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pa7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba7 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ v72 e;
    public final /* synthetic */ db7 f;

    public /* synthetic */ pa7(ba7 ba7Var, xt4 xt4Var, xt4 xt4Var2, v72 v72Var, db7 db7Var, int i) {
        this.a = i;
        this.b = ba7Var;
        this.c = xt4Var;
        this.d = xt4Var2;
        this.e = v72Var;
        this.f = db7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        switch (i2) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    hc2.b(pna.f(kq7.a, 1.0f), null, jce.E(-2121539538, new pa7(this.b, this.c, this.d, this.e, this.f, 1), rv4Var), rv4Var, 3078, 6);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ba5 ba5Var = lre.g;
                su0 su0Var = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(su0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    ba7 ba7Var = this.b;
                    fa7 fa7Var = ba7Var.f;
                    if (fa7Var == null || (fa7Var instanceof ca7)) {
                        fa7Var = null;
                    }
                    kq7 kq7Var = kq7.a;
                    xt4 xt4Var = this.c;
                    if (fa7Var != null) {
                        s21.w(rv4Var2, 1954485734, kq7Var, 4.0f, rv4Var2);
                        nq7 u = pna.u(kq7Var, nae.e, su0Var.d() * 0.6f, 1);
                        tza tzaVar = j27.a;
                        uaf.j(fa7Var, nmd.v(tte.k(u, ((h27) rv4Var2.j(tzaVar)).c.b), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 2.0f), ba5Var), xt4Var, this.d, rv4Var2, 0);
                        rv4Var2 = rv4Var2;
                        hl5.w(kq7Var, 12.0f, rv4Var2, false);
                    } else {
                        rv4Var2.e0(1955083476);
                        rv4Var2.q(false);
                    }
                    String str = ba7Var.b;
                    int i3 = ba7Var.c;
                    int i4 = ba7Var.d;
                    nq7 k = tte.k(zbe.C(kq7Var, 6.0f, nae.e, nae.e, 3.0f, 6), this.e);
                    boolean f = rv4Var2.f(xt4Var) | rv4Var2.f(ba7Var);
                    Object P = rv4Var2.P();
                    if (f || P == ax1.a) {
                        P = new oa7(xt4Var, ba7Var, 2);
                        rv4Var2.o0(P);
                    }
                    uaf.b(i3, i4, 0, rv4Var2, q1d.t(1, (vt4) P, rv4Var2, k, false), str);
                    db7 db7Var = db7.d;
                    db7 db7Var2 = this.f;
                    if (db7Var2 != db7Var && db7Var2 != db7.c) {
                        rv4Var2.e0(1956201460);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(1955638593);
                        rv4 rv4Var3 = rv4Var2;
                        tc4.l(ba7Var.h, zbe.z(nmd.v(tte.k(zbe.C(pu0.a.a(kq7Var, kh5.C), 10.0f, nae.e, nae.e, 6.0f, 6), uu9.a), zl1.b(0.5f, zl1.b), ba5Var), 6.0f, 2.0f), false, zl1.e, 0L, 0L, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.l, rv4Var3, 3072, 0, 131060);
                        rv4Var3.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
