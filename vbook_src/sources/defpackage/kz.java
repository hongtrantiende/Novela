package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kz  reason: default package */
/* loaded from: classes.dex */
public final class kz {
    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final int g;

    public kz(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.a = i;
        this.b = f;
        this.c = i2;
        this.d = f2;
        this.e = i3;
        this.f = f3;
        this.g = i4;
    }

    public static final float a(kz kzVar, float f) {
        float f2 = kzVar.b;
        float f3 = kzVar.f;
        int i = kzVar.c;
        int i2 = kzVar.g;
        if (i2 > 0 && i > 0 && kzVar.e > 0) {
            float f4 = kzVar.d;
            if (f3 <= f4 || f4 <= f2) {
                return Float.MAX_VALUE;
            }
        } else if (i2 > 0 && i > 0 && f3 <= f2) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f - f3) * kzVar.a;
    }
}
