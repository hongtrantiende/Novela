package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: an7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class an7 implements lu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ vt4 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kub c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ an7(boolean z, kub kubVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, vt4 vt4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = kubVar;
        this.d = xt4Var;
        this.e = xt4Var2;
        this.f = xt4Var3;
        this.C = xt4Var4;
        this.D = vt4Var;
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
                sxd.b(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).intValue();
                int p2 = xoe.p(i2 | 1);
                sxd.c(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).intValue();
                int p3 = xoe.p(i2 | 1);
                sxd.d(this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p3);
                return pvcVar;
        }
    }
}
