package defpackage;

import java.util.ArrayList;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q14  reason: default package */
/* loaded from: classes3.dex */
public final class q14 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ q14(ArrayList arrayList, xt4 xt4Var, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5 = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        Object obj5 = ax1.a;
        ArrayList arrayList = this.b;
        int i6 = 16;
        int i7 = 4;
        xt4 xt4Var = this.c;
        switch (i5) {
            case 0:
                Object obj6 = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var.f(obj6)) {
                        i7 = 2;
                    }
                    i = intValue2 | i7;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i6 = 32;
                    }
                    i |= i6;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    r14 r14Var = (r14) arrayList.get(intValue);
                    rv4Var.e0(583063410);
                    rg3 rg3Var = new rg3(120.0f);
                    boolean h = rv4Var.h(r14Var) | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (h || P == obj5) {
                        P = new o14(r14Var, xt4Var, 0);
                        rv4Var.o0(P);
                    }
                    iue.i(384, 2, rg3Var, r14Var, (vt4) P, rv4Var, null);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (!rv4Var2.f(xg6Var)) {
                        i7 = 2;
                    }
                    i2 = intValue4 | i7;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i6 = 32;
                    }
                    i2 |= i6;
                }
                if ((i2 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i2 & 1, z2)) {
                    Object obj7 = arrayList.get(intValue3);
                    int i8 = i2 & Token.ELSE;
                    r14 r14Var2 = (r14) obj7;
                    rv4Var2.e0(-445389540);
                    rg3 rg3Var2 = new rg3(120.0f);
                    boolean h2 = rv4Var2.h(r14Var2) | rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (h2 || P2 == obj5) {
                        P2 = new o14(r14Var2, xt4Var, 1);
                        rv4Var2.o0(P2);
                    }
                    iue.o(intValue3, ((i8 >> 3) & 14) | 3072, rg3Var2, r14Var2, (vt4) P2, rv4Var2, null);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                yf6 yf6Var = (yf6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (!rv4Var3.f(yf6Var)) {
                        i7 = 2;
                    }
                    i3 = intValue6 | i7;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var3.d(intValue5)) {
                        i6 = 32;
                    }
                    i3 |= i6;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i3 & 1, z3)) {
                    r14 r14Var3 = (r14) arrayList.get(intValue5);
                    rv4Var3.e0(1828010804);
                    nq7 f = pna.f(kq7Var, 1.0f);
                    boolean h3 = rv4Var3.h(r14Var3) | rv4Var3.f(xt4Var);
                    Object P3 = rv4Var3.P();
                    if (h3 || P3 == obj5) {
                        P3 = new o14(r14Var3, xt4Var, 2);
                        rv4Var3.o0(P3);
                    }
                    iue.i(48, 4, null, r14Var3, (vt4) P3, rv4Var3, f);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var2 = (xg6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (!rv4Var4.f(xg6Var2)) {
                        i7 = 2;
                    }
                    i4 = intValue8 | i7;
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (rv4Var4.d(intValue7)) {
                        i6 = 32;
                    }
                    i4 |= i6;
                }
                if ((i4 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(i4 & 1, z4)) {
                    rxb rxbVar = (rxb) arrayList.get(intValue7);
                    rv4Var4.e0(-1164875774);
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    boolean f3 = rv4Var4.f(xt4Var) | rv4Var4.h(rxbVar);
                    Object P4 = rv4Var4.P();
                    if (f3 || P4 == obj5) {
                        P4 = new w7(21, xt4Var, rxbVar);
                        rv4Var4.o0(P4);
                    }
                    voe.f(rxbVar, zbe.C(zbe.y(lbe.f(15, (vt4) P4, f2, null, false), 8.0f), 24.0f, nae.e, nae.e, nae.e, 14), rv4Var4, 0);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
