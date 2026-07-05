package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ik8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik8 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2a b;

    public /* synthetic */ ik8(h2a h2aVar, int i) {
        this.a = i;
        this.b = h2aVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        h2a h2aVar = this.b;
        switch (i) {
            case 0:
                gj6 gj6Var = (gj6) sl1.e0(h2aVar.i().j().k);
                if (gj6Var != null) {
                    return Integer.valueOf(gj6Var.a);
                }
                return null;
            case 1:
                return Boolean.valueOf(h2aVar.k());
            default:
                h2aVar.c();
                return pvc.a;
        }
    }
}
