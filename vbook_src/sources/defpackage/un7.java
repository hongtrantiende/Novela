package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: un7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class un7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ exb c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ nu4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ un7(boolean z, exb exbVar, xt4 xt4Var, nu4 nu4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = exbVar;
        this.d = xt4Var;
        this.e = nu4Var;
        this.f = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                ade.f(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                ade.h(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                ade.g(this.b, this.c, this.d, this.e, (rv4) obj, p3);
                return pvcVar;
        }
    }
}
