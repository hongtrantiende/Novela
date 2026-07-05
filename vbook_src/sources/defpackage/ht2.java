package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ht2  reason: default package */
/* loaded from: classes3.dex */
public final class ht2 extends mq7 implements zj3 {
    public final gz5 K;
    public boolean L;
    public boolean M;
    public boolean N;

    public ht2(gz5 gz5Var) {
        this.K = gz5Var;
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        qd6Var.a();
        n61 n61Var = qd6Var.a;
        if (this.L) {
            ak3.R0(qd6Var, zl1.b(0.3f, zl1.b), 0L, n61Var.b(), nae.e, null, 0, Token.FUNCTION);
        } else if (!this.M && !this.N) {
        } else {
            ak3.R0(qd6Var, zl1.b(0.1f, zl1.b), 0L, n61Var.b(), nae.e, null, 0, Token.FUNCTION);
        }
    }

    @Override // defpackage.mq7
    public final void z1() {
        z87.v(v1(), null, null, new oi(this, (m42) null, 20), 3);
    }
}
