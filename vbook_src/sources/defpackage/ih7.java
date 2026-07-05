package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ih7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih7 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ hu4 D;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ih7(e33 e33Var, vt4 vt4Var, boolean z, boolean z2, xt4 xt4Var, vt4 vt4Var2, vt4 vt4Var3) {
        this.a = 4;
        this.f = e33Var;
        this.e = vt4Var;
        this.b = z;
        this.c = z2;
        this.d = xt4Var;
        this.C = vt4Var2;
        this.D = vt4Var3;
    }

    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, qid] */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Long l;
        int i = this.a;
        boolean z2 = false;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.D;
        Object obj3 = this.C;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dae.c(this.b, (y78) obj6, this.c, (nq7) obj5, (vt4) obj4, (vt4) obj3, (vt4) hu4Var, (rv4) obj, xoe.p(3073));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                cbe.a((vl6) obj6, (go0) obj3, this.b, this.c, (nq7) obj5, (xt4) hu4Var, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 2:
                bgc bgcVar = (bgc) obj6;
                tu1 tu1Var = (tu1) obj5;
                mu4 mu4Var = (mu4) obj4;
                String str = (String) obj3;
                tu1 tu1Var2 = (tu1) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    mwe.d(yae.A(kq7.a, bgcVar.a(), null), jce.E(1797077842, new y0a(this.b, this.c, bgcVar, tu1Var, mu4Var, str, 0), rv4Var), null, null, null, 0, zl1.h, 0L, new Object(), jce.E(-2017000739, new z0a(tu1Var2, 0), rv4Var), rv4Var, 806879280);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                jue.b(this.b, (String) obj6, this.c, (List) obj5, (xt4) obj4, (xt4) obj3, (xt4) hu4Var, (rv4) obj, xoe.p(24577));
                return pvcVar;
            case 4:
                e33 e33Var = (e33) obj6;
                vt4 vt4Var = (vt4) obj4;
                xt4 xt4Var = (xt4) obj5;
                vt4 vt4Var2 = (vt4) obj3;
                vt4 vt4Var3 = (vt4) hu4Var;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    boolean z3 = e33Var.g;
                    int i2 = e33Var.f;
                    long j = e33Var.h;
                    Long valueOf = Long.valueOf(j);
                    if (j > e33Var.i) {
                        l = valueOf;
                    } else {
                        l = null;
                    }
                    boolean f = rv4Var2.f(xt4Var) | rv4Var2.h(e33Var);
                    Object P = rv4Var2.P();
                    if (f || P == ax1.a) {
                        P = new mgc(xt4Var, e33Var, 1);
                        rv4Var2.o0(P);
                    }
                    oc2.d(z3, i2, vt4Var, null, l, false, this.b, this.c, (vt4) P, vt4Var2, vt4Var3, rv4Var2, 0, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                pc2.h((gcd) obj6, (xic) obj5, (fbd) obj4, (s6d) obj3, this.b, this.c, (lu4) hu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ ih7(vl6 vl6Var, go0 go0Var, boolean z, boolean z2, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, int i) {
        this.a = 1;
        this.f = vl6Var;
        this.C = go0Var;
        this.b = z;
        this.c = z2;
        this.d = nq7Var;
        this.D = xt4Var;
        this.e = vt4Var;
    }

    public /* synthetic */ ih7(bgc bgcVar, boolean z, boolean z2, tu1 tu1Var, mu4 mu4Var, String str, tu1 tu1Var2) {
        this.a = 2;
        this.f = bgcVar;
        this.b = z;
        this.c = z2;
        this.d = tu1Var;
        this.e = mu4Var;
        this.C = str;
        this.D = tu1Var2;
    }

    public /* synthetic */ ih7(gcd gcdVar, xic xicVar, fbd fbdVar, s6d s6dVar, boolean z, boolean z2, lu4 lu4Var, int i) {
        this.a = 5;
        this.f = gcdVar;
        this.d = xicVar;
        this.e = fbdVar;
        this.C = s6dVar;
        this.b = z;
        this.c = z2;
        this.D = lu4Var;
    }

    public /* synthetic */ ih7(boolean z, Object obj, boolean z2, Object obj2, hu4 hu4Var, hu4 hu4Var2, hu4 hu4Var3, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.f = obj;
        this.c = z2;
        this.d = obj2;
        this.e = hu4Var;
        this.C = hu4Var2;
        this.D = hu4Var3;
    }
}
