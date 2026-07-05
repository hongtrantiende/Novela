package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wz6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wz6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz6 b;

    public /* synthetic */ wz6(xz6 xz6Var, int i) {
        this.a = i;
        this.b = xz6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        long j;
        int i = this.a;
        xz6 xz6Var = this.b;
        switch (i) {
            case 0:
                xz6Var.J1();
                return pvc.a;
            case 1:
                return new y78(xz6Var.Z);
            default:
                sc6 sc6Var = (sc6) xz6Var.X.getValue();
                if (sc6Var != null) {
                    j = sc6Var.h0(0L);
                } else {
                    j = 9205357640488583168L;
                }
                return new y78(j);
        }
    }
}
