package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m4d  reason: default package */
/* loaded from: classes.dex */
public final class m4d extends vk8 {
    public final g4d D;
    public final hm8 E;
    public float F;
    public em1 G;
    public final hm8 f = yae.z(new dna(0));
    public final hm8 C = yae.z(Boolean.FALSE);

    public m4d(q25 q25Var) {
        g4d g4dVar = new g4d(q25Var);
        g4dVar.f = new ik(this, 28);
        this.D = g4dVar;
        this.E = new hm8(pvc.a, r0f.J);
        this.F = 1.0f;
    }

    @Override // defpackage.vk8
    public final boolean d(float f) {
        this.F = f;
        return true;
    }

    @Override // defpackage.vk8
    public final boolean e(em1 em1Var) {
        this.G = em1Var;
        return true;
    }

    @Override // defpackage.vk8
    public final long h() {
        return ((dna) this.f.getValue()).a;
    }

    @Override // defpackage.vk8
    public final void i(ak3 ak3Var) {
        em1 em1Var = this.G;
        g4d g4dVar = this.D;
        if (em1Var == null) {
            em1Var = (em1) g4dVar.g.getValue();
        }
        if (((Boolean) this.C.getValue()).booleanValue() && ak3Var.getLayoutDirection() == tc6.b) {
            long b1 = ak3Var.b1();
            ij1 Q0 = ak3Var.Q0();
            long G = Q0.G();
            Q0.w().i();
            try {
                ((mu9) Q0.b).A(-1.0f, 1.0f, b1);
                g4dVar.e(ak3Var, this.F, em1Var);
            } finally {
                rs8.r(Q0, G);
            }
        } else {
            g4dVar.e(ak3Var, this.F, em1Var);
        }
        this.E.getValue();
    }
}
