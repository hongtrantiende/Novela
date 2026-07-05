package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ynb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ynb implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;

    public /* synthetic */ ynb(cz7 cz7Var, int i) {
        this.a = i;
        this.b = cz7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        li9 li9Var;
        int i = this.a;
        String str = null;
        pvc pvcVar = pvc.a;
        cz7 cz7Var = this.b;
        String str2 = (String) obj;
        switch (i) {
            case 0:
                str2.getClass();
                tc4.r(cz7Var, str2);
                return pvcVar;
            case 1:
                str2.getClass();
                lz7 a = cz7Var.a();
                if (a instanceof li9) {
                    li9Var = (li9) a;
                } else {
                    li9Var = null;
                }
                if (li9Var != null) {
                    str = li9Var.a;
                }
                if (!c16.i(str, str2)) {
                    cz7Var.a.c(new li9(str2));
                }
                return pvcVar;
            case 2:
                str2.getClass();
                lpe.t(cz7Var, str2, null);
                return pvcVar;
            default:
                str2.getClass();
                q0f.m(cz7Var, str2);
                return pvcVar;
        }
    }
}
