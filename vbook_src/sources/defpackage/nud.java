package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nud  reason: default package */
/* loaded from: classes.dex */
public final class nud implements bg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nud(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bg0
    public final void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yz4 yz4Var = (yz4) obj;
                yz4Var.J.sendMessage(yz4Var.J.obtainMessage(1, Boolean.valueOf(z)));
                return;
            default:
                l97 l97Var = (l97) obj;
                if (z) {
                    l97Var.getClass();
                    q9e q9eVar = (q9e) l97Var.a;
                    q9eVar.c.removeCallbacks(q9eVar.d);
                    return;
                }
                l97Var.getClass();
                l97Var.getClass();
                return;
        }
    }
}
