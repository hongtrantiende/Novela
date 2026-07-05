package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ola  reason: default package */
/* loaded from: classes.dex */
public final class ola extends mq7 implements zj3, r78 {
    public wea K;
    public lea L;
    public kl3 M;

    @Override // defpackage.r78
    public final void S0() {
        this.M = null;
        hud.o(this);
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        kl3 kl3Var;
        kl3 kl3Var2 = this.M;
        if (kl3Var2 == null) {
            ij1 b = voe.t(this).b();
            wea weaVar = this.K;
            lea leaVar = this.L;
            b.getClass();
            kl3 kl3Var3 = new kl3(weaVar, leaVar, b);
            this.M = kl3Var3;
            kl3Var = kl3Var3;
        } else {
            kl3Var = kl3Var2;
        }
        kl3Var.g(qd6Var, qd6Var.a.b(), 1.0f, null);
        qd6Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ola)) {
            return false;
        }
        ola olaVar = (ola) obj;
        if (c16.i(this.K, olaVar.K) && c16.i(this.L, olaVar.L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.L.hashCode() + (this.K.hashCode() * 31);
    }
}
