package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: obc  reason: default package */
/* loaded from: classes.dex */
public final class obc implements mu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ hu4 f;

    public obc(xt4 xt4Var, boolean z, List list, rk9 rk9Var, xt4 xt4Var2) {
        this.c = xt4Var;
        this.b = z;
        this.d = list;
        this.e = rk9Var;
        this.f = xt4Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.a;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = ax1.a;
        Object obj8 = this.f;
        switch (i2) {
            case 0:
                nq7 nq7Var = (nq7) obj;
                rv4 rv4Var = (rv4) obj2;
                ((Number) obj3).intValue();
                rv4Var.e0(-1525724089);
                Object P = rv4Var.P();
                if (P == obj7) {
                    P = s21.g(rv4Var);
                }
                yu7 yu7Var = (yu7) P;
                nq7 a0 = fu5.a(kq7.a, yu7Var, (iu5) obj6).a0(new vnc((rbc) obj4, yu7Var, null, this.b, (xt9) obj5, (vt4) obj8));
                rv4Var.q(false);
                return a0;
            default:
                int intValue = ((Number) obj).intValue();
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Number) obj3).intValue();
                Object obj9 = (xt4) obj8;
                xt4 xt4Var = (xt4) obj6;
                rk9 rk9Var = (rk9) obj5;
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.d(intValue)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) == 18 && rv4Var2.E()) {
                    rv4Var2.X();
                } else {
                    long j = ((zl1) rv4Var2.j(r12.a)).a;
                    long j2 = ((h27) rv4Var2.j(j27.a)).a.j;
                    if (intValue == 0) {
                        rv4Var2.e0(-1475387122);
                        rv4Var2.e0(-1633490746);
                        boolean f = rv4Var2.f(xt4Var);
                        boolean z = this.b;
                        boolean g = f | rv4Var2.g(z);
                        Object P2 = rv4Var2.P();
                        if (g || P2 == obj7) {
                            P2 = new up0(3, xt4Var, z);
                            rv4Var2.o0(P2);
                        }
                        rv4Var2.q(false);
                        mwe.a((vt4) P2, null, false, null, jce.E(1475691015, new c62(j2, j, this.b), rv4Var2), rv4Var2, 196608, 30);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(1507840201);
                        boolean z2 = true;
                        e00 e00Var = (e00) ((List) obj4).get(intValue - 1);
                        long h = rk9Var.h();
                        e00Var.getClass();
                        if (Math.abs((Float.intBitsToFloat((int) (h >> 32)) / Float.intBitsToFloat((int) (h & 4294967295L))) - (e00Var.a / e00Var.b)) > 2.4414062E-4f) {
                            z2 = false;
                        }
                        rv4Var2.e0(-1746271574);
                        boolean f2 = rv4Var2.f(obj9) | rv4Var2.f(rk9Var) | rv4Var2.h(e00Var);
                        Object P3 = rv4Var2.P();
                        if (f2 || P3 == obj7) {
                            P3 = new se0(9, obj9, rk9Var, e00Var);
                            rv4Var2.o0(P3);
                        }
                        rv4Var2.q(false);
                        mwe.a((vt4) P3, null, false, null, jce.E(1100628880, new d62(e00Var, z2, j2, j), rv4Var2), rv4Var2, 196608, 30);
                        rv4Var2.q(false);
                    }
                }
                return pvc.a;
        }
    }

    public obc(iu5 iu5Var, rbc rbcVar, boolean z, xt9 xt9Var, vt4 vt4Var) {
        this.c = iu5Var;
        this.d = rbcVar;
        this.b = z;
        this.e = xt9Var;
        this.f = vt4Var;
    }
}
