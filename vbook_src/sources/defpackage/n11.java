package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n11  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class n11 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s11 b;

    public /* synthetic */ n11(s11 s11Var, int i) {
        this.a = i;
        this.b = s11Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        s11 s11Var = this.b;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    s11Var.a(th);
                }
                return pvc.a;
            case 1:
                ((oh5) obj).getClass();
                return s11Var;
            default:
                oh5 oh5Var = (oh5) obj;
                return s11Var;
        }
    }
}
