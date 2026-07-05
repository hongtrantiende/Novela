package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yo7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yo7 implements lu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ yo7(boolean z, float f, float f2, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = xt4Var;
        this.f = xt4Var2;
        this.C = xt4Var3;
        this.D = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.D;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                dpe.d(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                dpe.e(this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p2);
                return pvcVar;
        }
    }
}
