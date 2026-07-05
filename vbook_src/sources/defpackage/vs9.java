package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vs9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vs9 implements te3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs9 b;

    public /* synthetic */ vs9(zs9 zs9Var, int i) {
        this.a = i;
        this.b = zs9Var;
    }

    @Override // defpackage.te3
    public final double c(double d) {
        int i = this.a;
        zs9 zs9Var = this.b;
        switch (i) {
            case 0:
                return dce.l(zs9Var.k.c(d), zs9Var.e, zs9Var.f);
            default:
                return zs9Var.n.c(dce.l(d, zs9Var.e, zs9Var.f));
        }
    }
}
