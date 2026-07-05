package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r72  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r72 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t72 b;

    public /* synthetic */ r72(t72 t72Var, int i) {
        this.a = i;
        this.b = t72Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        bsa bsaVar;
        int i = this.a;
        pvc pvcVar = pvc.a;
        t72 t72Var = this.b;
        switch (i) {
            case 0:
                voe.r(t72Var);
                return pvcVar;
            case 1:
                t72Var.T.h(true);
                break;
            case 2:
                t72Var.T.d(true);
                break;
            case 3:
                t72Var.T.f();
                break;
            case 4:
                voe.r(t72Var);
                return pvcVar;
            case 5:
                t72Var.T.p();
                break;
            case 6:
                t72Var.O.w.b.r.b(t72Var.U.e);
                break;
            default:
                ol6 ol6Var = t72Var.O;
                zm4 zm4Var = t72Var.V;
                boolean z = t72Var.P;
                if (!ol6Var.b()) {
                    zm4.a(zm4Var);
                } else if (!z && (bsaVar = ol6Var.c) != null) {
                    ((w03) bsaVar).b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
