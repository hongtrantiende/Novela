package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: he1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class he1 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ he1(aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = aw7Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        String str = null;
        boolean z = true;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        aw7 aw7Var2 = this.b;
        switch (i) {
            case 0:
                hbe.H(aw7Var2, false);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 1:
                hbe.H(aw7Var2, false);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 2:
                hbe.H(aw7Var2, false);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 3:
                hbe.H(aw7Var2, false);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 4:
                if (((Boolean) aw7Var2.getValue()).booleanValue()) {
                    ((vt4) aw7Var.getValue()).invoke();
                }
                return pvcVar;
            case 5:
                if (!((List) aw7Var2.getValue()).isEmpty()) {
                    aw7Var.setValue(Boolean.TRUE);
                }
                return pvcVar;
            case 6:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 7:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 8:
                aw7Var2.setValue(Boolean.TRUE);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 9:
                if (!((Boolean) aw7Var2.getValue()).booleanValue() && !((Boolean) aw7Var.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 11:
                ((xt4) aw7Var2.getValue()).invoke(kve.A(((zl1) aw7Var.getValue()).a, true, false));
                return pvcVar;
            case 12:
                ((xt4) aw7Var2.getValue()).invoke(kve.A(((zl1) aw7Var.getValue()).a, true, false));
                return pvcVar;
            case 13:
                ((xt4) aw7Var2.getValue()).invoke(kve.A(((zl1) aw7Var.getValue()).a, true, false));
                return pvcVar;
            case 14:
                mq5 mq5Var = (mq5) sl1.f0(((Number) aw7Var.getValue()).intValue(), (List) aw7Var2.getValue());
                if (mq5Var != null) {
                    str = mq5Var.b;
                }
                if (str == null) {
                    return "";
                }
                return str;
            case 15:
                u2c u2cVar = (u2c) sl1.f0(((Number) aw7Var.getValue()).intValue(), (List) aw7Var2.getValue());
                if (u2cVar != null) {
                    str = u2cVar.b;
                }
                if (str == null) {
                    return "";
                }
                return str;
            case 16:
                aw7Var2.setValue(new pn1());
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 17:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 18:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 19:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 20:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 21:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 22:
                aw7Var2.setValue(Boolean.TRUE);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 23:
                if (!((Boolean) aw7Var2.getValue()).booleanValue() && !((Boolean) aw7Var.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                aw7Var2.setValue(Boolean.TRUE);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 25:
                aw7Var2.setValue(Boolean.TRUE);
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 26:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 27:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            case 28:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
            default:
                aw7Var2.setValue(Boolean.FALSE);
                aw7Var.setValue(Boolean.TRUE);
                return pvcVar;
        }
    }
}
