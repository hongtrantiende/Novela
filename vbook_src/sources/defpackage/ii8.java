package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ii8  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ii8 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh8 b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ii8(xh8 xh8Var, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.b = xh8Var;
        this.c = nq7Var;
        this.d = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        nq7 nq7Var = this.c;
        xh8 xh8Var = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ki8.b(xh8Var, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            case 1:
                ki8.d(xh8Var, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            default:
                ki8.a(xh8Var, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
        }
    }
}
