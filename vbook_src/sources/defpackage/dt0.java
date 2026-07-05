package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt0 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dt0(long j, long j2, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, nq7 nq7Var, List list, int i) {
        this.b = j;
        this.c = j2;
        this.d = xt4Var;
        this.e = vt4Var;
        this.f = vt4Var2;
        this.C = nq7Var;
        this.D = list;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                ec6 ec6Var = (ec6) obj7;
                yya yyaVar = (yya) obj5;
                ec6 ec6Var2 = (ec6) obj6;
                oz5 oz5Var = (oz5) obj4;
                tu1 tu1Var = (tu1) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = new nj0(14);
                        rv4Var.o0(P);
                    }
                    nq7 t = aze.t(lpe.m(y7a.b(kq7.a, (xt4) P), nae.e), ec6Var);
                    boolean f = rv4Var.f(yyaVar);
                    Object P2 = rv4Var.P();
                    if (f || P2 == lh9Var) {
                        P2 = new jt0(yyaVar, 1);
                        rv4Var.o0(P2);
                    }
                    nq7 k = axe.k(t, (xt4) P2);
                    Object P3 = rv4Var.P();
                    if (P3 == lh9Var) {
                        P3 = new mf0(15);
                        rv4Var.o0(P3);
                    }
                    vt4 vt4Var = (vt4) P3;
                    Object P4 = rv4Var.P();
                    if (P4 == lh9Var) {
                        P4 = new nj0(15);
                        rv4Var.o0(P4);
                    }
                    xt4 xt4Var = (xt4) P4;
                    long j = this.b;
                    boolean e = rv4Var.e(j);
                    Object P5 = rv4Var.P();
                    if (e || P5 == lh9Var) {
                        P5 = new th(j, 3);
                        rv4Var.o0(P5);
                    }
                    nq7 l = axe.l(zbe.A(pna.f(pna.h(rse.e(k, ec6Var2, vt4Var, xt4Var, null, null, null, null, (xt4) P5, 3064).a0(oz5Var.g), 56.0f), 1.0f), 4.0f, nae.e, 2), nae.e, nae.e, nae.e, nae.e, nae.e, null, false, new wl0(this.c, 5), 786431);
                    gv9 a = ev9.a(lz.a, kh5.G, rv4Var, 48);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p = lye.p(rv4Var, l);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a);
                    jce.F(qw1.e, rv4Var, l2);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    tu1Var.c(jv9.a, rv4Var, 6);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                ote.c(this.b, this.c, (xt4) obj7, (vt4) obj6, (vt4) obj5, (nq7) obj4, (List) obj3, (rv4) obj, xoe.p(196609));
                return pvcVar;
        }
    }

    public /* synthetic */ dt0(ec6 ec6Var, yya yyaVar, ec6 ec6Var2, long j, oz5 oz5Var, long j2, tu1 tu1Var) {
        this.d = ec6Var;
        this.f = yyaVar;
        this.e = ec6Var2;
        this.b = j;
        this.C = oz5Var;
        this.c = j2;
        this.D = tu1Var;
    }
}
