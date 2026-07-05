package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ge7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge7 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ ge7(String str, xt4 xt4Var, nq7 nq7Var, int i) {
        this.b = str;
        this.d = xt4Var;
        this.c = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.d;
        nq7 nq7Var = this.c;
        String str = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ie2.c(xoe.p(1), xt4Var, rv4Var, nq7Var, str);
                return pvcVar;
            default:
                nq2.d(xoe.p(1), xt4Var, rv4Var, nq7Var, str);
                return pvcVar;
        }
    }

    public /* synthetic */ ge7(String str, nq7 nq7Var, xt4 xt4Var, int i) {
        this.b = str;
        this.c = nq7Var;
        this.d = xt4Var;
    }
}
