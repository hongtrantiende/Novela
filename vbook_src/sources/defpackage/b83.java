package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b83  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class b83 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ b83(int i, xt4 xt4Var, boolean z) {
        this.a = 0;
        this.b = xt4Var;
        this.d = z;
        this.c = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        int i2 = 2;
        pvc pvcVar = pvc.a;
        boolean z = this.d;
        int i3 = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                if (z) {
                    i3++;
                }
                xt4Var.invoke(Integer.valueOf(i3));
                return pvcVar;
            case 1:
                if (i3 == 0 ? z : i3 == 2) {
                    i2 = 1;
                }
                xt4Var.invoke(Integer.valueOf(i2));
                return pvcVar;
            default:
                if (i3 == 0 ? z : i3 == 2) {
                    i2 = 1;
                }
                xt4Var.invoke(Integer.valueOf(i2));
                return pvcVar;
        }
    }

    public /* synthetic */ b83(int i, int i2, xt4 xt4Var, boolean z) {
        this.a = i2;
        this.b = xt4Var;
        this.c = i;
        this.d = z;
    }
}
