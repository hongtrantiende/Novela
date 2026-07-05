package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ex5  reason: default package */
/* loaded from: classes.dex */
public abstract class ex5 extends mq7 implements rnc {
    public qid K;
    public qid L;

    public ex5() {
        mh4 mh4Var = w92.d;
        this.K = mh4Var;
        this.L = mh4Var;
    }

    @Override // defpackage.mq7
    public void A1() {
        this.L = this.K;
        dae.G(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new dx5(this, 0));
    }

    @Override // defpackage.mq7
    public final void B1() {
        this.K = w92.d;
    }

    public abstract qid H1(qid qidVar);

    public void I1() {
        this.L = H1(this.K);
        dae.G(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new dx5(this, 0));
    }

    @Override // defpackage.rnc
    public final Object M() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.mq7
    public void z1() {
        dae.E(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new dx5(this, 1));
        I1();
    }
}
