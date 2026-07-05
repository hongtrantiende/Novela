package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: un0  reason: default package */
/* loaded from: classes.dex */
public final class un0 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(int i, boolean z) {
        super(1);
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        ba5 ba5Var = lre.g;
        t15 t15Var = (t15) obj;
        float f = t15Var.f() * 12.0f;
        float f2 = t15Var.f() * 12.0f;
        tn0 tn0Var = null;
        if (f > nae.e && f2 > nae.e) {
            tn0Var = new tn0(null, f, f2, this.a);
        }
        t15Var.r(tn0Var);
        t15Var.J0(ba5Var);
        t15Var.w(this.b);
        return pvc.a;
    }
}
