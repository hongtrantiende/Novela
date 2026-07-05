package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yt3  reason: default package */
/* loaded from: classes.dex */
public final class yt3 extends fb6 implements xt4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ vt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt3(boolean z, vt4 vt4Var) {
        super(1);
        this.a = z;
        this.b = vt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        t15 t15Var = (t15) obj;
        if (!this.a && ((Boolean) this.b.invoke()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        t15Var.w(z);
        return pvc.a;
    }
}
