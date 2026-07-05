package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h66  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h66 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl9 b;

    public /* synthetic */ h66(vl9 vl9Var, int i) {
        this.a = i;
        this.b = vl9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        pvc pvcVar = pvc.a;
        vl9 vl9Var = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                vl9Var.a = true;
                return pvcVar;
            case 1:
                if (((z5a) obj).f.a.a.b.length() > 0) {
                    vl9Var.a = false;
                }
                return pvcVar;
            case 2:
                Throwable th2 = (Throwable) obj;
                vl9Var.a = true;
                return pvcVar;
            default:
                zy5 zy5Var = (zy5) obj;
                long j = 0;
                if (zy5Var != null) {
                    z = zy5.b(zy5Var.a, 0L);
                }
                if (!z && vl9Var.a) {
                    j = 120;
                }
                return Long.valueOf(j);
        }
    }
}
