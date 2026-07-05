package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mp7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp7 implements lu4 {
    public final /* synthetic */ nu4 C;
    public final /* synthetic */ xt4 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nnb c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ mu4 f;

    public /* synthetic */ mp7(boolean z, nnb nnbVar, xt4 xt4Var, xt4 xt4Var2, mu4 mu4Var, nu4 nu4Var, xt4 xt4Var3, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = nnbVar;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = mu4Var;
        this.C = nu4Var;
        this.D = xt4Var3;
        this.E = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.E;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int p = xoe.p(i2 | 1);
                v9e.l(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).intValue();
                int p2 = xoe.p(i2 | 1);
                v9e.m(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).intValue();
                int p3 = xoe.p(i2 | 1);
                v9e.n(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p3);
                return pvcVar;
        }
    }
}
