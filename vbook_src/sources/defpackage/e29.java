package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e29  reason: default package */
/* loaded from: classes.dex */
public final class e29 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;

    public /* synthetic */ e29(tu1 tu1Var, int i) {
        this.a = i;
        this.b = tu1Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        tu1 tu1Var = this.b;
        int i2 = 16;
        switch (i) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i2 = 32;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & Token.TARGET) == 144 && rv4Var.E()) {
                    rv4Var.X();
                } else {
                    tu1Var.c(Integer.valueOf(intValue), rv4Var, Integer.valueOf((intValue2 >> 3) & 14));
                }
                return pvcVar;
            default:
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                ((xg6) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i2 = 32;
                    }
                    intValue4 |= i2;
                }
                if ((intValue4 & Token.TARGET) == 144 && rv4Var2.E()) {
                    rv4Var2.X();
                } else {
                    tu1Var.c(Integer.valueOf(intValue3), rv4Var2, Integer.valueOf((intValue4 >> 3) & 14));
                }
                return pvcVar;
        }
    }
}
