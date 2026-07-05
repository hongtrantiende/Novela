package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kr3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr3 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ kr3(boolean z, xt4 xt4Var, xt4 xt4Var2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = xt4Var;
        this.d = xt4Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.d;
        xt4 xt4Var2 = this.c;
        boolean z = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                hud.e(z, xt4Var2, xt4Var, rv4Var, xoe.p(49));
                return pvcVar;
            case 1:
                que.e(z, xt4Var2, xt4Var, rv4Var, xoe.p(1));
                return pvcVar;
            case 2:
                nc2.a(z, xt4Var2, xt4Var, rv4Var, xoe.p(1));
                return pvcVar;
            case 3:
                s9e.h(z, xt4Var2, xt4Var, rv4Var, xoe.p(1));
                return pvcVar;
            default:
                am8.g(z, xt4Var2, xt4Var, rv4Var, xoe.p(1));
                return pvcVar;
        }
    }
}
