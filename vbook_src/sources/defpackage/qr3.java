package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qr3  reason: default package */
/* loaded from: classes3.dex */
public final class qr3 implements nu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ qo9 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ aw7 f;

    public qr3(List list, qo9 qo9Var, xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var) {
        this.b = list;
        this.c = qo9Var;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = aw7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        List list = this.b;
        int i4 = 16;
        int i5 = 2;
        boolean z4 = true;
        switch (i3) {
            case 0:
                yf6 yf6Var = (yf6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(yf6Var)) {
                        i5 = 4;
                    }
                    i = i5 | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    wp3 wp3Var = (wp3) list.get(intValue);
                    rv4Var.e0(1435631037);
                    if (intValue == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (intValue == tl1.x((List) this.f.getValue())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    rqe.b(yf6Var, this.c, wp3Var.a, null, false, null, jce.E(-1838104654, new pr3(z2, z3, wp3Var, this.d, this.e, this.f), rv4Var), rv4Var, (i & 14) | 1572864);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                yf6 yf6Var2 = (yf6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(yf6Var2)) {
                        i5 = 4;
                    }
                    i2 = i5 | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & Token.EXPR_VOID) == 146) {
                    z4 = false;
                }
                if (rv4Var2.U(i2 & 1, z4)) {
                    String str = (String) list.get(intValue3);
                    rv4Var2.e0(1320453703);
                    rqe.b(yf6Var2, this.c, str, null, false, null, jce.E(1167897837, new td0(str, this.d, this.e, this.f, 13), rv4Var2), rv4Var2, (i2 & 14) | 1572864);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public qr3(List list, qo9 qo9Var, aw7 aw7Var, xt4 xt4Var, xt4 xt4Var2) {
        this.b = list;
        this.c = qo9Var;
        this.f = aw7Var;
        this.d = xt4Var;
        this.e = xt4Var2;
    }
}
