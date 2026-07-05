package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u34  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u34 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u34(ar5 ar5Var, String str, String str2, nq7 nq7Var, vt4 vt4Var, int i, int i2) {
        this.a = 4;
        this.e = ar5Var;
        this.C = str;
        this.D = str2;
        this.b = nq7Var;
        this.f = vt4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        int i2 = this.c;
        pvc pvcVar = pvc.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                oue.j((l54) obj6, this.b, (vt4) obj5, (vt4) obj4, (vt4) obj3, (rv4) obj, xoe.p(i2 | 1), this.d);
                return pvcVar;
            case 1:
                th8 th8Var = (th8) obj6;
                qg6 qg6Var = (qg6) obj5;
                String str = (String) obj4;
                xt4 xt4Var = (xt4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    bkd r = mwe.r(th8Var, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
                    tza tzaVar = j27.a;
                    fpe.f(qg6Var, this.b, false, 6.0f, r, nae.e, zl1.b(0.2f, ((h27) rv4Var.j(tzaVar)).a.a), ((h27) rv4Var.j(tzaVar)).a.a, null, null, null, 0, false, jce.E(762993076, new xj7(th8Var, qg6Var, this.c, str, this.d, xt4Var), rv4Var), rv4Var, 24576, 196608, 32332);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                jsc.i((String) obj6, this.c, this.d, (io5) obj5, (th8) obj4, this.b, (xt4) obj3, (rv4) obj, xoe.p(196609));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                jsc.k((String) obj6, this.c, this.d, (List) obj5, (io5) obj4, this.b, (xt4) obj3, (rv4) obj, xoe.p(196609));
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                l0e.l((ar5) obj6, (String) obj4, (String) obj3, this.b, (vt4) obj5, (rv4) obj, xoe.p(i2 | 1), this.d);
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                fxe.j((String) obj6, this.b, (tu1) obj5, (mu4) obj4, (tu1) obj3, (rv4) obj, xoe.p(i2 | 1), this.d);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                d3a.b((rj8) obj6, (List) obj5, this.b, (tu1) obj4, (tu1) obj3, (rv4) obj, xoe.p(i2 | 1), this.d);
                return pvcVar;
        }
    }

    public /* synthetic */ u34(th8 th8Var, qg6 qg6Var, nq7 nq7Var, int i, String str, int i2, xt4 xt4Var) {
        this.a = 1;
        this.e = th8Var;
        this.f = qg6Var;
        this.b = nq7Var;
        this.c = i;
        this.C = str;
        this.d = i2;
        this.D = xt4Var;
    }

    public /* synthetic */ u34(rj8 rj8Var, List list, nq7 nq7Var, tu1 tu1Var, tu1 tu1Var2, int i, int i2) {
        this.a = 6;
        this.e = rj8Var;
        this.f = list;
        this.b = nq7Var;
        this.C = tu1Var;
        this.D = tu1Var2;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ u34(Object obj, nq7 nq7Var, hu4 hu4Var, hu4 hu4Var2, hu4 hu4Var3, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = nq7Var;
        this.f = hu4Var;
        this.C = hu4Var2;
        this.D = hu4Var3;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ u34(String str, int i, int i2, Object obj, Object obj2, nq7 nq7Var, xt4 xt4Var, int i3, int i4) {
        this.a = i4;
        this.e = str;
        this.c = i;
        this.d = i2;
        this.f = obj;
        this.C = obj2;
        this.b = nq7Var;
        this.D = xt4Var;
    }
}
