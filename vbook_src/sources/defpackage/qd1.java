package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qd1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd1 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qd1(su0 su0Var, yha yhaVar, boolean z) {
        this.a = 3;
        this.c = su0Var;
        this.d = yhaVar;
        this.b = z;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        long j;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.d;
        boolean z3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hma.i((bzc) obj4, z3, (vt4) obj3, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 1:
                String str = (String) obj4;
                oyb oybVar = (oyb) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    if (z3) {
                        rv4Var.e0(-2058081621);
                        j = ((h27) rv4Var.j(j27.a)).a.b;
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-2058001269);
                        j = ((h27) rv4Var.j(j27.a)).a.q;
                        rv4Var.q(false);
                    }
                    cvb.c(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, 0, 24576, 114682);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                r1d.c((bzc) obj4, z3, (nq7) obj3, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 3:
                yha yhaVar = (yha) obj3;
                zy5 zy5Var = (zy5) obj;
                x02 x02Var = (x02) obj2;
                float i2 = x02.i(((su0) obj4).b);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zha zhaVar = zha.b;
                zha zhaVar2 = zha.a;
                if (z3) {
                    linkedHashMap.put(zhaVar2, Float.valueOf(i2));
                    int i3 = (int) (zy5Var.a >> 32);
                    if (i3 != 0) {
                        linkedHashMap.put(zhaVar, Float.valueOf(i2 - i3));
                    }
                } else {
                    linkedHashMap.put(zhaVar2, Float.valueOf(-i2));
                    if (((int) (zy5Var.a >> 32)) != 0) {
                        linkedHashMap.put(zhaVar, Float.valueOf((float) nae.e));
                    }
                }
                t07 t07Var = new t07(linkedHashMap);
                int ordinal = ((zha) yhaVar.b.h.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        xk5.o();
                        return null;
                    }
                    zha zhaVar3 = zha.c;
                    if (linkedHashMap.containsKey(zhaVar3)) {
                        zhaVar = zhaVar3;
                    } else if (!linkedHashMap.containsKey(zhaVar)) {
                        zhaVar = zhaVar2;
                    }
                    zhaVar2 = zhaVar;
                }
                return new yk8(t07Var, zhaVar2);
            case 4:
                ((Integer) obj2).getClass();
                s9e.b(z3, (u2c) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                v9e.i(z3, (pn1) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 6:
                xt4 xt4Var = (xt4) obj4;
                yya yyaVar = (yya) obj3;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    nq7 t = tte.t(tte.k(pna.n(kq7.a, 44.0f), uu9.a), ((Number) yyaVar.getValue()).floatValue());
                    boolean f = rv4Var2.f(xt4Var) | rv4Var2.g(z3);
                    Object P = rv4Var2.P();
                    if (f || P == ax1.a) {
                        P = new up0(21, xt4Var, z3);
                        rv4Var2.o0(P);
                    }
                    nk5.a(rp5.c((wk3) rk3.e.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P, t, null, false), 12.0f), 0L, rv4Var2, 48, 8);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                ch0.b((List) obj4, z3, (xt4) obj3, (rv4) obj, xoe.p(391));
                return pvcVar;
        }
    }

    public /* synthetic */ qd1(int i, int i2, Object obj, Object obj2, boolean z) {
        this.a = i2;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ qd1(xt4 xt4Var, boolean z, yya yyaVar) {
        this.a = 6;
        this.c = xt4Var;
        this.b = z;
        this.d = yyaVar;
    }

    public /* synthetic */ qd1(boolean z, Object obj, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = obj;
        this.d = nq7Var;
    }

    public /* synthetic */ qd1(boolean z, String str, oyb oybVar) {
        this.a = 1;
        this.b = z;
        this.c = str;
        this.d = oybVar;
    }
}
