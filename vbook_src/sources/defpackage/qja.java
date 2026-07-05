package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qja  reason: default package */
/* loaded from: classes3.dex */
public final class qja implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ uja c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ qja(List list, uja ujaVar, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = ujaVar;
        this.d = xt4Var;
        this.e = xt4Var2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4 = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        uja ujaVar = this.c;
        List list = this.b;
        int i5 = 16;
        int i6 = 2;
        switch (i4) {
            case 0:
                yf6 yf6Var = (yf6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(yf6Var)) {
                        i6 = 4;
                    }
                    i = intValue2 | i6;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    rv4Var.e0(943733972);
                    tl1.a((cia) list.get(intValue), ujaVar.e, ujaVar.f, ujaVar.g, yf6.a(yf6Var, pna.f(kq7Var, 1.0f)), this.d, this.e, rv4Var, 0);
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
                        i6 = 4;
                    }
                    i2 = intValue4 | i6;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((i2 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i2 & 1, z2)) {
                    rv4Var2.e0(-713272269);
                    tl1.b((cia) list.get(intValue3), ujaVar.e, ujaVar.f, ujaVar.g, yf6.a(yf6Var2, pna.f(kq7Var, 1.0f)), this.d, this.e, rv4Var2, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                yf6 yf6Var3 = (yf6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (rv4Var3.f(yf6Var3)) {
                        i6 = 4;
                    }
                    i3 = intValue6 | i6;
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (rv4Var3.d(intValue5)) {
                        i5 = 32;
                    }
                    i3 |= i5;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i3 & 1, z3)) {
                    rv4Var3.e0(-1504580052);
                    tl1.c((cia) list.get(intValue5), ujaVar.e, ujaVar.f, ujaVar.g, yf6.a(yf6Var3, pna.f(kq7Var, 1.0f)), this.d, this.e, rv4Var3, 0);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
