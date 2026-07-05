package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q7c  reason: default package */
/* loaded from: classes.dex */
public final class q7c extends vk8 {
    public final float D;
    public final float E;
    public final float f = 100.0f;
    public final float C = 100.0f;

    public q7c(float f, float f2) {
        this.D = f;
        this.E = f2;
    }

    @Override // defpackage.vk8
    public final long h() {
        float f = this.f;
        if (f > nae.e) {
            float f2 = this.C;
            if (f2 > nae.e) {
                float f3 = this.D;
                if (f3 > nae.e) {
                    float f4 = this.E;
                    if (f4 > nae.e) {
                        float min = Math.min(1.0f, Math.min(f / f3, f2 / f4));
                        return (Float.floatToRawIntBits(f3 * min) << 32) | (Float.floatToRawIntBits(f4 * min) & 4294967295L);
                    }
                    return 0L;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.vk8
    public final void i(ak3 ak3Var) {
        ak3Var.getClass();
    }
}
