package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f7  reason: default package */
/* loaded from: classes.dex */
public final class f7 implements q09 {
    public static final f7 c = new f7(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, 0);
    public final /* synthetic */ int a;
    public float[] b;

    public /* synthetic */ f7(float[] fArr, int i) {
        this.a = i;
        this.b = fArr;
    }

    @Override // defpackage.q09
    public long a(float f, float f2) {
        long c2 = l27.c((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), this.b);
        return wi4.a(Float.intBitsToFloat((int) (c2 >> 32)), Float.intBitsToFloat((int) (c2 & 4294967295L)));
    }

    public void b(float[] fArr, boolean z) {
        float[] fArr2 = new float[9];
        if (z) {
            for (int i = 0; i < 3; i++) {
                for (int i2 = 0; i2 < 3; i2++) {
                    int i3 = i * 3;
                    float f = fArr[i3];
                    float[] fArr3 = this.b;
                    fArr2[i3 + i2] = (fArr[i3 + 2] * fArr3[i2 + 6]) + (fArr[i3 + 1] * fArr3[i2 + 3]) + (f * fArr3[i2]);
                }
            }
        } else {
            for (int i4 = 0; i4 < 3; i4++) {
                for (int i5 = 0; i5 < 3; i5++) {
                    int i6 = i4 * 3;
                    float[] fArr4 = this.b;
                    fArr2[i6 + i5] = (fArr4[i6 + 2] * fArr[i5 + 6]) + (fArr4[i6 + 1] * fArr[i5 + 3]) + (fArr4[i6] * fArr[i5]);
                }
            }
        }
        this.b = fArr2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Bradford";
            default:
                return super.toString();
        }
    }
}
