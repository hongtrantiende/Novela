package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj7 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xj7(int i, int i2, xt4 xt4Var, nq7 nq7Var, String str, List list) {
        this.a = 8;
        this.c = str;
        this.f = list;
        this.b = i;
        this.C = nq7Var;
        this.e = xt4Var;
        this.d = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = false;
        int i2 = this.d;
        int i3 = this.b;
        pvc pvcVar = pvc.a;
        Object obj3 = this.e;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj6;
                List list = (List) obj5;
                io5 io5Var = (io5) obj4;
                xt4 xt4Var = (xt4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    jsc.k(str, this.b, this.d, list, io5Var, pna.c, xt4Var, rv4Var, 196608);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                th8 th8Var = (th8) obj5;
                qg6 qg6Var = (qg6) obj4;
                String str2 = (String) obj6;
                xt4 xt4Var2 = (xt4) obj3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    f25 f25Var = new f25(96.0f);
                    ze4 ze4Var = pna.c;
                    bkd r = mwe.r(new th8(16.0f, 8.0f, 16.0f, 8.0f), th8Var);
                    hz hzVar = new hz(12.0f, true, new vs(2));
                    hz hzVar2 = new hz(12.0f, true, new vs(2));
                    boolean d = rv4Var2.d(i3) | rv4Var2.f(str2) | rv4Var2.d(i2) | rv4Var2.f(xt4Var2);
                    Object P = rv4Var2.P();
                    if (d || P == ax1.a) {
                        P = new gn2(i3, str2, i2, xt4Var2);
                        rv4Var2.o0(P);
                    }
                    ade.e(f25Var, ze4Var, qg6Var, r, hzVar2, hzVar, null, false, null, (xt4) P, rv4Var2, 1769520, 0, 912);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                xve.a((s10) obj6, (nq7) obj5, (dc) obj4, (w22) obj3, (rv4) obj, xoe.p(i3 | 1), xoe.p(i2));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                int i4 = this.b;
                uwe.a(i4, p, (xt4) obj3, (xt4) obj4, (rv4) obj, (nq7) obj6, (List) obj5);
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                fre.d((m93) obj5, (nq7) obj4, (String) obj6, (vt4) obj3, (rv4) obj, xoe.p(i3 | 1), this.d);
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                fa3.e((ar5) obj5, this.b, (hn0) obj4, (String) obj6, (uo3) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 6:
                ((Integer) obj2).getClass();
                iue.f((tu1) obj6, (lu4) obj5, (nq7) obj4, (vt4) obj3, (rv4) obj, xoe.p(i3 | 1), this.d);
                return pvcVar;
            case 7:
                ((Integer) obj2).getClass();
                xbe.h((String) obj6, (nq7) obj5, (mu4) obj4, (tu1) obj3, (rv4) obj, xoe.p(i3 | 1), this.d);
                return pvcVar;
            case 8:
                ((Integer) obj2).getClass();
                l0e.j((String) obj6, (List) obj5, this.b, (nq7) obj4, (xt4) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            case 9:
                aw7 aw7Var = (aw7) obj5;
                aw7 aw7Var2 = (aw7) obj4;
                aw7 aw7Var3 = (aw7) obj3;
                z09 z09Var = (z09) obj;
                y78 y78Var = (y78) obj2;
                z09Var.getClass();
                aw7Var.setValue(Float.valueOf((Float.intBitsToFloat((int) (y78Var.a >> 32)) / (i3 - ((int) (e1c.i(aw7Var2) >> 32)))) + e1c.j(aw7Var)));
                aw7Var3.setValue(Float.valueOf((Float.intBitsToFloat((int) (y78Var.a & 4294967295L)) / (i2 - ((int) (((zy5) aw7Var2.getValue()).a & 4294967295L)))) + ((Number) aw7Var3.getValue()).floatValue()));
                aw7Var3.setValue(Float.valueOf(dce.m(((Number) aw7Var3.getValue()).floatValue(), nae.e, 1.0f)));
                hse.e((c5d) obj6, z09Var);
                return pvcVar;
            case 10:
                ((Integer) obj2).getClass();
                eh.a((ar5) obj6, (nq7) obj5, (vt4) obj4, (vt4) obj3, (rv4) obj, xoe.p(i3 | 1), this.d);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                ape.o((String) obj6, (String) obj5, (nq7) obj4, (vt4) obj3, (rv4) obj, xoe.p(i3 | 1), this.d);
                return pvcVar;
        }
    }

    public /* synthetic */ xj7(int i, int i2, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, List list) {
        this.a = 3;
        this.f = list;
        this.c = nq7Var;
        this.b = i;
        this.e = xt4Var;
        this.C = xt4Var2;
        this.d = i2;
    }

    public /* synthetic */ xj7(int i, int i2, c5d c5dVar, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3) {
        this.a = 9;
        this.b = i;
        this.d = i2;
        this.c = c5dVar;
        this.f = aw7Var;
        this.C = aw7Var2;
        this.e = aw7Var3;
    }

    public /* synthetic */ xj7(m93 m93Var, nq7 nq7Var, String str, vt4 vt4Var, int i, int i2) {
        this.a = 4;
        this.f = m93Var;
        this.C = nq7Var;
        this.c = str;
        this.e = vt4Var;
        this.b = i;
        this.d = i2;
    }

    public /* synthetic */ xj7(ar5 ar5Var, int i, hn0 hn0Var, String str, uo3 uo3Var, int i2) {
        this.a = 5;
        this.f = ar5Var;
        this.b = i;
        this.C = hn0Var;
        this.c = str;
        this.e = uo3Var;
        this.d = i2;
    }

    public /* synthetic */ xj7(th8 th8Var, qg6 qg6Var, int i, String str, int i2, xt4 xt4Var) {
        this.a = 1;
        this.f = th8Var;
        this.C = qg6Var;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = xt4Var;
    }

    public /* synthetic */ xj7(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.f = obj2;
        this.C = obj3;
        this.e = obj4;
        this.b = i;
        this.d = i2;
    }

    public /* synthetic */ xj7(String str, int i, int i2, List list, io5 io5Var, xt4 xt4Var) {
        this.a = 0;
        this.c = str;
        this.b = i;
        this.d = i2;
        this.f = list;
        this.C = io5Var;
        this.e = xt4Var;
    }
}
