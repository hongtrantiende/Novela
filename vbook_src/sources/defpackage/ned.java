package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ned  reason: default package */
/* loaded from: classes.dex */
public final class ned extends uq7 {
    public final boolean b;

    public ned(boolean z) {
        this.b = z;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new oed(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(Boolean.valueOf(this.b), "Visible");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        oed oedVar = (oed) mq7Var;
        boolean z = oedVar.K;
        boolean z2 = this.b;
        if (z != z2 && z != z2) {
            oedVar.K = z2;
            if (!z2) {
                voe.v(oedVar).Z(false);
                ak0.t(oedVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        ned nedVar;
        if (obj instanceof ned) {
            nedVar = (ned) obj;
        } else {
            nedVar = null;
        }
        if (nedVar == null || this.b != nedVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
