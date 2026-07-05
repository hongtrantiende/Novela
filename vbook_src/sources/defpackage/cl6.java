package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl6  reason: default package */
/* loaded from: classes.dex */
public final class cl6 extends mq7 implements by8, wx1, hz4 {
    public oj K;
    public ol6 L;
    public gtb M;
    public final hm8 N = yae.z(null);

    public cl6(oj ojVar, ol6 ol6Var, gtb gtbVar) {
        this.K = ojVar;
        this.L = ol6Var;
        this.M = gtbVar;
    }

    @Override // defpackage.mq7
    public final void A1() {
        this.K.k(this);
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        this.N.setValue(i38Var);
    }

    @Override // defpackage.mq7
    public final void z1() {
        oj ojVar = this.K;
        if (ojVar.a != null) {
            ov5.c("Expected textInputModifierNode to be null");
        }
        ojVar.a = this;
    }
}
