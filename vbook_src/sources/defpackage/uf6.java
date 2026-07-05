package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uf6 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mu4 b;

    public /* synthetic */ uf6(mu4 mu4Var, int i) {
        this.a = i;
        this.b = mu4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        int i2 = 2;
        mu4 mu4Var = this.b;
        switch (i) {
            case 0:
                yf6 yf6Var = (yf6) obj;
                ((Integer) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(yf6Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & Token.DO) != 130) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    mu4Var.c(yf6Var, rv4Var, Integer.valueOf(intValue & 14));
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var = (xg6) obj;
                ((Integer) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(xg6Var)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & Token.DO) != 130) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    mu4Var.c(xg6Var, rv4Var2, Integer.valueOf(intValue2 & 14));
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
