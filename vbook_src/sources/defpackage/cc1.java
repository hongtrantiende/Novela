package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc1  reason: default package */
/* loaded from: classes3.dex */
public abstract class cc1 {
    public int a;
    public int b;
    public int[] c = new int[0];
    public float d;

    public final float a() {
        int i;
        int i2 = this.b;
        if (i2 > 0 && (i = this.a) > 4) {
            if (i2 != i) {
                float f = i / ((i2 - i) * this.d);
                if (f < 0.99f) {
                    return f;
                }
            }
            return 0.99f;
        }
        return 0.01f;
    }

    public abstract int b(byte[] bArr, int i);

    public final void c(byte[] bArr, int i, int i2) {
        int i3;
        bArr.getClass();
        if (i2 == 2) {
            i3 = b(bArr, i);
        } else {
            i3 = -1;
        }
        if (i3 >= 0) {
            this.b++;
            int[] iArr = this.c;
            if (i3 < iArr.length && 512 > iArr[i3]) {
                this.a++;
            }
        }
    }

    public final void d() {
        this.b = 0;
        this.a = 0;
    }
}
