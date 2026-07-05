package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tm2  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm2 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ tm2(gk2 gk2Var, int i, String str, int i2, int i3) {
        this.a = i3;
        this.b = gk2Var;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        String str = this.d;
        int i3 = this.c;
        gk2 gk2Var = this.b;
        nm nmVar = (nm) obj;
        nmVar.getClass();
        switch (i) {
            case 0:
                nmVar.l(0, Boolean.TRUE);
                ((lh9) gk2Var.c).getClass();
                nmVar.j(1, Long.valueOf(i3));
                nmVar.g(2, str);
                ((lh9) gk2Var.c).getClass();
                nmVar.j(3, Long.valueOf(i2));
                return pvcVar;
            default:
                ((lh9) gk2Var.c).getClass();
                nmVar.j(0, Long.valueOf(i3));
                nmVar.g(1, str);
                ((lh9) gk2Var.c).getClass();
                nmVar.j(2, Long.valueOf(i2));
                return pvcVar;
        }
    }
}
