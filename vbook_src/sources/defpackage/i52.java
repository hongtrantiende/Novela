package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i52  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i52 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mw8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ i52(int i, int i2, mw8 mw8Var) {
        this.a = 0;
        this.c = i;
        this.d = i2;
        this.b = mw8Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        int i3 = this.c;
        mw8 mw8Var = this.b;
        lw8 lw8Var = (lw8) obj;
        switch (i) {
            case 0:
                lw8Var.getClass();
                lw8Var.o(mw8Var, (i3 - i2) / 2, 0, nae.e);
                return pvcVar;
            case 1:
                lw8Var.o(mw8Var, i3, i2, nae.e);
                return pvcVar;
            case 2:
                lw8Var.o(mw8Var, k27.A((i3 - mw8Var.a) / 2.0f), k27.A((i2 - mw8Var.b) / 2.0f), nae.e);
                return pvcVar;
            default:
                lw8Var.o(mw8Var, i3, i2, nae.e);
                return pvcVar;
        }
    }

    public /* synthetic */ i52(int i, mw8 mw8Var, int i2) {
        this.a = 2;
        this.c = i;
        this.b = mw8Var;
        this.d = i2;
    }

    public /* synthetic */ i52(mw8 mw8Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = mw8Var;
        this.c = i;
        this.d = i2;
    }
}
