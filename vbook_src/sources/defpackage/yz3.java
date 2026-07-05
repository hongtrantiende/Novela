package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yz3 implements or6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ yz3(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.or6
    public final void invoke(Object obj) {
        int i = this.a;
        boolean z = this.b;
        az8 az8Var = (az8) obj;
        switch (i) {
            case 0:
                az8Var.n(z);
                return;
            default:
                az8Var.y(z);
                return;
        }
    }
}
