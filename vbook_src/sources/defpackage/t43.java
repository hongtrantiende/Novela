package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t43  reason: default package */
/* loaded from: classes3.dex */
public final class t43 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ t43(int i, List list) {
        this.a = i;
        this.b = list;
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
        pvc pvcVar = pvc.a;
        List list = this.b;
        int i6 = 16;
        int i7 = 2;
        switch (i5) {
            case 0:
                yf6 yf6Var = (yf6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(yf6Var)) {
                        i7 = 4;
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
                    rv4Var.e0(1355994262);
                    nqe.i(zbe.C(kq7.a, nae.e, 16.0f, nae.e, nae.e, 13), jce.E(-1854349459, new s43((us9) list.get(intValue), 0), rv4Var), rv4Var, 54);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                yf6 yf6Var2 = (yf6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(yf6Var2)) {
                        i7 = 4;
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
                    rv4Var2.e0(-2096997436);
                    nqe.i(zbe.C(kq7.a, nae.e, 16.0f, nae.e, nae.e, 13), jce.E(767842047, new s43((us9) list.get(intValue3), 1), rv4Var2), rv4Var2, 54);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                xg6 xg6Var = (xg6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (rv4Var3.f(xg6Var)) {
                        i7 = 4;
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
                    rv4Var3.e0(1144324397);
                    bbe.i((l54) list.get(intValue5), rv4Var3, 0);
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
                    if (rv4Var4.f(xg6Var2)) {
                        i7 = 4;
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
                    rv4Var4.e0(-322619445);
                    fbe.d((rp1) list.get(intValue7), hbe.c0(rv4Var4, pna.f(kq7.a, 1.0f)), rv4Var4, 8);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
