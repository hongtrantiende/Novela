package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j98  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j98 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k98 b;

    public /* synthetic */ j98(k98 k98Var, int i) {
        this.a = i;
        this.b = k98Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        k98 k98Var = this.b;
        switch (i) {
            case 0:
                synchronized (k98.f) {
                    k98.e.remove(((hn8) k98Var.d.getValue()).a.t());
                }
                return pvc.a;
            default:
                v85 v85Var = k98Var.c;
                hn8 hn8Var = (hn8) v85Var.invoke();
                if (e.a(hn8Var) != -1) {
                    return fn8.d(hn8Var.a.t(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + v85Var + ", instead got " + hn8Var).toString());
        }
    }
}
