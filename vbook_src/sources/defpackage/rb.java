package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rb(lu4 lu4Var, tu1 tu1Var, long j, long j2, tu1 tu1Var2) {
        this.a = 0;
        this.d = lu4Var;
        this.e = tu1Var;
        this.b = j;
        this.c = j2;
        this.f = tu1Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        np npVar;
        zx1 zx1Var;
        pvc pvcVar;
        np npVar2;
        tu1 tu1Var;
        np npVar3;
        kg kgVar;
        int i = this.a;
        pvc pvcVar2 = pvc.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                lu4 lu4Var = (lu4) obj5;
                tu1 tu1Var2 = (tu1) obj4;
                tu1 tu1Var3 = (tu1) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 x = zbe.x(kq7.a, xb.a);
                    lk0 lk0Var = kh5.I;
                    ez ezVar = lz.c;
                    xn1 a = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, x);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var2);
                    } else {
                        rv4Var.r0();
                    }
                    np npVar4 = qw1.f;
                    jce.F(npVar4, rv4Var, a);
                    np npVar5 = qw1.e;
                    jce.F(npVar5, rv4Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    np npVar6 = qw1.g;
                    jce.F(npVar6, rv4Var, valueOf);
                    kg kgVar2 = qw1.h;
                    jce.C(kgVar2, rv4Var);
                    np npVar7 = qw1.d;
                    jce.F(npVar7, rv4Var, p);
                    if (lu4Var == null) {
                        rv4Var.e0(-1979464233);
                        rv4Var.q(false);
                        pvcVar = pvcVar2;
                        tu1Var = tu1Var3;
                        npVar2 = npVar5;
                        kgVar = kgVar2;
                        npVar3 = npVar6;
                        zx1Var = zx1Var2;
                        npVar = npVar4;
                    } else {
                        rv4Var.e0(-1979464232);
                        oyb oybVar = ((h27) rv4Var.j(j27.a)).b.g;
                        tu1 E = jce.E(169494680, new tb(0, lu4Var), rv4Var);
                        npVar = npVar4;
                        zx1Var = zx1Var2;
                        pvcVar = pvcVar2;
                        npVar2 = npVar5;
                        tu1Var = tu1Var3;
                        npVar3 = npVar6;
                        kgVar = kgVar2;
                        xb.e(this.b, oybVar, E, rv4Var, 384);
                        rv4Var.q(false);
                    }
                    rv4Var.e0(-1978911719);
                    float f = 1.0f;
                    if (1.0f <= 0.0d) {
                        jv5.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    we6 we6Var = new we6(f, false);
                    xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, we6Var);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, a2);
                    jce.F(npVar2, rv4Var, l2);
                    s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar7, rv4Var, p2);
                    tu1Var2.invoke(rv4Var, 0);
                    rv4Var.q(true);
                    rv4Var.q(false);
                    l95 l95Var = new l95(kh5.K);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode3 = Long.hashCode(rv4Var.T);
                    xt8 l3 = rv4Var.l();
                    nq7 p3 = lye.p(rv4Var, l95Var);
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(npVar, rv4Var, d);
                    jce.F(npVar2, rv4Var, l3);
                    s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
                    jce.F(npVar7, rv4Var, p3);
                    xb.e(this.c, ((h27) rv4Var.j(j27.a)).b.m, tu1Var, rv4Var, 0);
                    rv4Var.q(true);
                    rv4Var.q(true);
                    return pvcVar;
                }
                rv4Var.X();
                return pvcVar2;
            case 1:
                ((Integer) obj2).getClass();
                eg0.b((nq7) obj5, this.b, this.c, (wea) obj4, (List) obj3, (rv4) obj, xoe.p(7));
                return pvcVar2;
            case 2:
                ((Integer) obj2).getClass();
                l08.a((nq7) obj5, this.b, this.c, (qid) obj3, (tu1) obj4, (rv4) obj, xoe.p(196657));
                return pvcVar2;
            default:
                ((Integer) obj2).getClass();
                xxe.l((String) obj5, this.b, this.c, (nq7) obj4, (vt4) obj3, (rv4) obj, xoe.p(3073));
                return pvcVar2;
        }
    }

    public /* synthetic */ rb(nq7 nq7Var, long j, long j2, qid qidVar, tu1 tu1Var, int i) {
        this.a = 2;
        this.d = nq7Var;
        this.b = j;
        this.c = j2;
        this.f = qidVar;
        this.e = tu1Var;
    }

    public /* synthetic */ rb(Object obj, long j, long j2, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
        this.f = obj3;
    }
}
