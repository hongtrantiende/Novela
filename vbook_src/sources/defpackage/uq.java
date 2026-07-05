package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uq  reason: default package */
/* loaded from: classes.dex */
public final class uq extends fb6 implements xt4 {
    public final /* synthetic */ mw8[] a;
    public final /* synthetic */ vq b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(mw8[] mw8VarArr, vq vqVar, int i, int i2) {
        super(1);
        this.a = mw8VarArr;
        this.b = vqVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        mw8[] mw8VarArr;
        lw8 lw8Var = (lw8) obj;
        for (mw8 mw8Var : this.a) {
            if (mw8Var != null) {
                long a = this.b.a.b.a((mw8Var.a << 32) | (mw8Var.b & 4294967295L), (this.c << 32) | (this.d & 4294967295L), tc6.a);
                lw8Var.o(mw8Var, (int) (a >> 32), (int) (a & 4294967295L), nae.e);
            }
        }
        return pvc.a;
    }
}
