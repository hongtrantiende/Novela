package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fv1  reason: default package */
/* loaded from: classes.dex */
public final class fv1 implements nu4 {
    public static final fv1 a = new Object();

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        ou0 ou0Var = (ou0) obj;
        zc2 zc2Var = (zc2) obj2;
        rv4 rv4Var = (rv4) obj3;
        int intValue = ((Number) obj4).intValue();
        ou0Var.getClass();
        zc2Var.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var.f(ou0Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (rv4Var.f(zc2Var)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & Token.EXPR_VOID) == 146 && rv4Var.E()) {
            rv4Var.X();
        } else {
            xm5.a(ou0Var, zc2Var, rv4Var, i & Token.ELSE);
        }
        return pvc.a;
    }
}
