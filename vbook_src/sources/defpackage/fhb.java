package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fhb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fhb implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ go3 b;

    public /* synthetic */ fhb(go3 go3Var, int i) {
        this.a = i;
        this.b = go3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        long b;
        int i = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        boolean z3 = false;
        go3 go3Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (rv4Var.U(intValue & 1, z3)) {
                    boolean f = rv4Var.f(go3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new bhb(go3Var, 2);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, false, null, null, null, yae.f, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    Object P2 = rv4Var2.P();
                    if (P2 == lh9Var) {
                        P2 = s21.e(rv4Var2);
                    }
                    zm4 zm4Var = (zm4) P2;
                    Object P3 = rv4Var2.P();
                    if (P3 == lh9Var) {
                        P3 = new sr3(zm4Var, null, 16);
                        rv4Var2.o0(P3);
                    }
                    yte.g((lu4) P3, rv4Var2, zm4Var);
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, f2);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    String str = (String) go3Var.b.getValue();
                    t86 t86Var = new t86(0, 6, Token.INC);
                    tza tzaVar = j27.a;
                    v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
                    nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                    boolean f3 = rv4Var2.f(go3Var);
                    Object P4 = rv4Var2.P();
                    if (f3 || P4 == lh9Var) {
                        P4 = new dhb(go3Var, 2);
                        rv4Var2.o0(P4);
                    }
                    uwe.h(str, (xt4) P4, n, false, false, null, yae.h, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var2, 1572864, 12779520, 6127544);
                    xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
                    String str2 = (String) go3Var.c.getValue();
                    t86 t86Var2 = new t86(0, 7, Token.INC);
                    v72 v72Var2 = ((h27) rv4Var2.j(tzaVar)).c.b;
                    nq7 A = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
                    boolean f4 = rv4Var2.f(go3Var);
                    Object P5 = rv4Var2.P();
                    if (f4 || P5 == lh9Var) {
                        P5 = new dhb(go3Var, 3);
                        rv4Var2.o0(P5);
                    }
                    uwe.h(str2, (xt4) P5, A, false, false, null, yae.i, null, null, jce.E(305065997, new fhb(go3Var, 2), rv4Var2), false, null, t86Var2, null, true, 0, 0, v72Var2, null, rv4Var2, 806879616, 12779520, 6127032);
                    rs8.u(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    ar5 c = rp5.c((wk3) ok3.K.getValue(), rv4Var3, 0);
                    if (((Boolean) go3Var.d.getValue()).booleanValue()) {
                        rv4Var3.e0(70535324);
                        b = ((h27) rv4Var3.j(j27.a)).a.a;
                        rv4Var3.q(false);
                    } else {
                        rv4Var3.e0(70630215);
                        b = zl1.b(0.5f, ((h27) rv4Var3.j(j27.a)).a.q);
                        rv4Var3.q(false);
                    }
                    long j = b;
                    nq7 n2 = pna.n(kq7Var, 24.0f);
                    boolean f5 = rv4Var3.f(go3Var);
                    Object P6 = rv4Var3.P();
                    if (f5 || P6 == lh9Var) {
                        P6 = new bhb(go3Var, 3);
                        rv4Var3.o0(P6);
                    }
                    nk5.a(c, null, lbe.f(15, (vt4) P6, n2, null, false), j, rv4Var3, 48, 0);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
