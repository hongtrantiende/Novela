package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ek7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p59 b;

    public /* synthetic */ ek7(p59 p59Var, int i) {
        this.a = i;
        this.b = p59Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        p59 p59Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) p59Var.a.getValue();
                bool.booleanValue();
                return yae.z(bool);
            default:
                p59Var.a(false);
                return pvc.a;
        }
    }
}
