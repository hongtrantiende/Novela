package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qo5  reason: default package */
/* loaded from: classes.dex */
public final class qo5 extends vk8 {
    public final ml5 f;

    public qo5(ml5 ml5Var) {
        this.f = ml5Var;
    }

    @Override // defpackage.vk8
    public final long h() {
        float f;
        ml5 ml5Var = this.f;
        int e = ml5Var.e();
        float f2 = Float.NaN;
        if (e > 0) {
            f = e;
        } else {
            f = Float.NaN;
        }
        int d = ml5Var.d();
        if (d > 0) {
            f2 = d;
        }
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    @Override // defpackage.vk8
    public final void i(ak3 ak3Var) {
        float f;
        ml5 ml5Var = this.f;
        int e = ml5Var.e();
        float f2 = 1.0f;
        if (e > 0) {
            f = Float.intBitsToFloat((int) (ak3Var.b() >> 32)) / e;
        } else {
            f = 1.0f;
        }
        int d = ml5Var.d();
        if (d > 0) {
            f2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) / d;
        }
        ij1 Q0 = ak3Var.Q0();
        long G = Q0.G();
        Q0.w().i();
        try {
            ((mu9) Q0.b).A(f, f2, 0L);
            ml5Var.h(tf.a(ak3Var.Q0().w()));
        } finally {
            rs8.r(Q0, G);
        }
    }
}
