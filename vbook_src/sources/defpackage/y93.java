package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y93  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class y93 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt2 b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;

    public /* synthetic */ y93(yt2 yt2Var, aw7 aw7Var, aw7 aw7Var2, int i) {
        this.a = i;
        this.b = yt2Var;
        this.c = aw7Var;
        this.d = aw7Var2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        aw7 aw7Var2 = this.c;
        yt2 yt2Var = this.b;
        switch (i) {
            case 0:
                for (tva tvaVar : fa3.c) {
                    yt2Var.getClass();
                    tvaVar.getClass();
                    zq4 a = yt2Var.a();
                    if (a != null) {
                        yt2Var.c.c(a.a, a.b, a.c, tvaVar);
                    }
                }
                long j = zl1.i;
                aw7Var2.setValue(new zl1(j));
                aw7Var.setValue(new zl1(j));
                return pvcVar;
            default:
                for (tva tvaVar2 : rgc.c) {
                    yt2Var.getClass();
                    tvaVar2.getClass();
                    zq4 a2 = yt2Var.a();
                    if (a2 != null) {
                        yt2Var.c.c(a2.a, a2.b, a2.c, tvaVar2);
                    }
                }
                long j2 = zl1.i;
                aw7Var2.setValue(new zl1(j2));
                aw7Var.setValue(new zl1(j2));
                return pvcVar;
        }
    }
}
