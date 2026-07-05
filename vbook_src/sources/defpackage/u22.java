package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u22  reason: default package */
/* loaded from: classes.dex */
public final class u22 implements w22 {
    public final /* synthetic */ int a;

    public /* synthetic */ u22(int i) {
        this.a = i;
    }

    @Override // defpackage.w22
    public final long a(long j, long j2) {
        switch (this.a) {
            case 0:
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = kz9.c;
                return floatToRawIntBits;
            case 1:
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L);
                int i2 = kz9.c;
                return floatToRawIntBits2;
            case 2:
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                int i3 = kz9.c;
                return floatToRawIntBits3;
            case 3:
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i4 = kz9.c;
                return floatToRawIntBits4;
            case 4:
                float d = vye.d(j, j2);
                long floatToRawIntBits5 = (Float.floatToRawIntBits(d) << 32) | (Float.floatToRawIntBits(d) & 4294967295L);
                int i5 = kz9.c;
                return floatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long floatToRawIntBits6 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i6 = kz9.c;
                    return floatToRawIntBits6;
                }
                float d2 = vye.d(j, j2);
                long floatToRawIntBits7 = (Float.floatToRawIntBits(d2) << 32) | (Float.floatToRawIntBits(d2) & 4294967295L);
                int i7 = kz9.c;
                return floatToRawIntBits7;
        }
    }
}
