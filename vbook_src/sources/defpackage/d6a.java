package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d6a  reason: default package */
/* loaded from: classes.dex */
public final class d6a extends m03 implements fd6, zj3, hz4, wx1, r78 {
    public q6a M;
    public final zlb N;

    public d6a(ps psVar, oyb oybVar, do4 do4Var, xt4 xt4Var, int i, boolean z, int i2, int i3, List list, xt4 xt4Var2, q6a q6aVar, qa0 qa0Var) {
        this.M = q6aVar;
        zlb zlbVar = new zlb(psVar, oybVar, do4Var, xt4Var, i, z, i2, i3, list, xt4Var2, q6aVar, qa0Var, null);
        H1(zlbVar);
        this.N = zlbVar;
        if (this.M != null) {
            return;
        }
        throw hl5.d("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
    }

    @Override // defpackage.mq7
    public final void A1() {
        q6a q6aVar = this.M;
        if (q6aVar != null) {
            q6aVar.d = ij1.r(q6aVar.d, null, null, null, 3);
        }
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        return this.N.H0(ry6Var, w27Var, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zl9, java.lang.Object] */
    public final ai6 K1() {
        ?? obj = new Object();
        iue.R(this, new mm7(23, obj, this));
        return (ai6) obj.a;
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        return this.N.P0(ry6Var, w27Var, i);
    }

    @Override // defpackage.r78
    public final void S0() {
        q6a q6aVar = this.M;
        if (q6aVar != null) {
            q6aVar.d = ij1.r(q6aVar.d, null, null, K1(), 3);
        }
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        this.N.V0(qd6Var);
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        return this.N.a1(ry6Var, w27Var, i);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        return this.N.n(e37Var, w27Var, j);
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        q6a q6aVar = this.M;
        if (q6aVar != null) {
            q6aVar.d = ij1.r(q6aVar.d, i38Var, null, null, 6);
            n7a n7aVar = q6aVar.b;
            long j = q6aVar.a;
            n7aVar.a = false;
            m6a m6aVar = n7aVar.e;
            if (m6aVar != null) {
                m6aVar.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        return this.N.z(ry6Var, w27Var, i);
    }

    @Override // defpackage.mq7
    public final void z1() {
        q6a q6aVar = this.M;
        if (q6aVar != null) {
            q6aVar.d = ij1.r(q6aVar.d, null, null, K1(), 3);
        }
    }
}
