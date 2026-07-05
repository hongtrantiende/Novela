package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qd0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qd0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qd0(float f, float f2, dm8 dm8Var) {
        this.a = 2;
        this.b = f;
        this.c = f2;
        this.d = dm8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.d;
        float f = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                r13 r13Var = (r13) obj2;
                ((r13) obj).getClass();
                int X0 = r13Var.X0(f2);
                return new py5((r13Var.X0(f) & 4294967295L) | (X0 << 32));
            case 1:
                ((lw8) obj).o((mw8) obj2, Math.round(f2), Math.round(f), nae.e);
                return pvcVar;
            default:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                t15Var.i(((dm8) obj2).h());
                t15Var.v(f2);
                t15Var.l(f2);
                su9 su9Var = uu9.a;
                za9 za9Var = new za9(f);
                t15Var.J0(new v72(za9Var, za9Var, za9Var, za9Var));
                if (f > nae.e) {
                    z = true;
                } else {
                    z = false;
                }
                t15Var.w(z);
                return pvcVar;
        }
    }

    public /* synthetic */ qd0(float f, float f2, int i, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }
}
