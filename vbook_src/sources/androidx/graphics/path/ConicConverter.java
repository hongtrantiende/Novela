package androidx.graphics.path;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class ConicConverter {
    public int a;
    public int b;
    public float[] c;

    private final native int internalConicToQuadratics(float[] fArr, int i, float[] fArr2, float f, float f2);

    public final void a(float f, float[] fArr) {
        int internalConicToQuadratics = internalConicToQuadratics(fArr, 0, this.c, f, 2.0E-4f);
        this.a = internalConicToQuadratics;
        int i = (internalConicToQuadratics * 4) + 2;
        if (i > this.c.length) {
            float[] fArr2 = new float[i];
            this.c = fArr2;
            this.a = internalConicToQuadratics(fArr, 0, fArr2, f, 2.0E-4f);
        }
        this.b = 0;
    }

    public final void b(float[] fArr) {
        int i = this.b;
        if (i < this.a) {
            int i2 = i * 4;
            float[] fArr2 = this.c;
            fArr[0] = fArr2[i2];
            fArr[1] = fArr2[i2 + 1];
            fArr[2] = fArr2[i2 + 2];
            fArr[3] = fArr2[i2 + 3];
            fArr[4] = fArr2[i2 + 4];
            fArr[5] = fArr2[i2 + 5];
            this.b = i + 1;
        }
    }
}
