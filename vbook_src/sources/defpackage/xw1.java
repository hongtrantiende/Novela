package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xw1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xw1 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ xw1(xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = xt4Var;
        this.c = xt4Var2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        xt4 xt4Var2 = this.b;
        switch (i) {
            case 0:
                m10 m10Var = (m10) obj;
                m10Var.getClass();
                if (m10Var instanceof k10) {
                    if (xt4Var2 != null) {
                        xt4Var2.invoke(m10Var);
                        return pvcVar;
                    }
                    return pvcVar;
                } else if (m10Var instanceof l10) {
                    if (xt4Var != null) {
                        xt4Var.invoke(m10Var);
                        return pvcVar;
                    }
                    return pvcVar;
                } else if (!(m10Var instanceof j10) && !(m10Var instanceof i10)) {
                    xk5.o();
                    return null;
                } else {
                    return pvcVar;
                }
            case 1:
                obj.getClass();
                if (xt4Var2 != null) {
                    xt4Var2.invoke(obj);
                }
                xt4Var.invoke(obj);
                return pvcVar;
            case 2:
                mv mvVar = (mv) obj;
                mvVar.getClass();
                xt4Var2.invoke(mvVar);
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 3:
                mv mvVar2 = (mv) obj;
                mvVar2.getClass();
                xt4Var2.invoke(mvVar2);
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 4:
                xt4Var2.invoke(obj);
                xt4Var.invoke(obj);
                return pvcVar;
            default:
                xt4Var2.invoke(obj);
                xt4Var.invoke(obj);
                return pvcVar;
        }
    }
}
