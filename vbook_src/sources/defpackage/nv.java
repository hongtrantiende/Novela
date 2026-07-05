package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nv implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;

    public /* synthetic */ nv(int i, vt4 vt4Var) {
        this.a = i;
        this.b = vt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        float f3;
        int i = this.a;
        Float f4 = null;
        pvc pvcVar = pvc.a;
        vt4 vt4Var = this.b;
        switch (i) {
            case 0:
                ((t15) obj).q(((Number) vt4Var.invoke()).floatValue());
                return pvcVar;
            case 1:
                y78 y78Var = (y78) obj;
                vt4Var.invoke();
                return pvcVar;
            case 2:
                y78 y78Var2 = (y78) obj;
                vt4Var.invoke();
                return pvcVar;
            case 3:
                y78 y78Var3 = (y78) obj;
                vt4Var.invoke();
                return pvcVar;
            case 4:
                y78 y78Var4 = (y78) obj;
                vt4Var.invoke();
                return pvcVar;
            case 5:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                float floatValue = ((Number) vt4Var.invoke()).floatValue();
                t15Var.v(floatValue);
                t15Var.l(floatValue);
                return pvcVar;
            case 6:
                ((Boolean) obj).booleanValue();
                vt4Var.invoke();
                return pvcVar;
            case 7:
                ak3.R0((ak3) obj, ((zl1) vt4Var.invoke()).a, 0L, 0L, nae.e, null, 0, Token.ELSE);
                return pvcVar;
            case 8:
                z09 z09Var = (z09) obj;
                vt4Var.invoke();
                return pvcVar;
            case 9:
                ((Boolean) obj).booleanValue();
                vt4Var.invoke();
                return pvcVar;
            case 10:
                l8a l8aVar = (l8a) obj;
                Object invoke = vt4Var.invoke();
                if (!Float.isNaN(((Number) invoke).floatValue())) {
                    f4 = invoke;
                }
                Float f5 = f4;
                if (f5 != null) {
                    f = f5.floatValue();
                } else {
                    f = 0.0f;
                }
                j8a.h(l8aVar, new g79(f, new jk1(nae.e, 1.0f), 0));
                return pvcVar;
            case 11:
                if (!((Boolean) obj).booleanValue()) {
                    vt4Var.invoke();
                }
                return pvcVar;
            case 12:
                y78 y78Var5 = (y78) obj;
                vt4Var.invoke();
                return pvcVar;
            case 13:
                l8a l8aVar2 = (l8a) obj;
                Object invoke2 = vt4Var.invoke();
                if (!Float.isNaN(((Number) invoke2).floatValue())) {
                    f4 = invoke2;
                }
                Float f6 = (Float) f4;
                if (f6 != null) {
                    f2 = f6.floatValue();
                } else {
                    f2 = 0.0f;
                }
                j8a.h(l8aVar2, new g79(f2, new jk1(nae.e, 1.0f), 0));
                return pvcVar;
            case 14:
                l8a l8aVar3 = (l8a) obj;
                Object invoke3 = vt4Var.invoke();
                if (!Float.isNaN(((Number) invoke3).floatValue())) {
                    f4 = invoke3;
                }
                Float f7 = (Float) f4;
                if (f7 != null) {
                    f3 = f7.floatValue();
                } else {
                    f3 = 0.0f;
                }
                j8a.h(l8aVar3, new g79(f3, new jk1(nae.e, 1.0f), 0));
                return pvcVar;
            case 15:
                ((Boolean) obj).booleanValue();
                vt4Var.invoke();
                return pvcVar;
            case 16:
                r13 r13Var = (r13) obj;
                return (y78) vt4Var.invoke();
            case 17:
                r13 r13Var2 = (r13) obj;
                return (y78) vt4Var.invoke();
            default:
                y78 y78Var6 = (y78) obj;
                vt4Var.invoke();
                return pvcVar;
        }
    }
}
