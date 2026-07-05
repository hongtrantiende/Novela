package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl8  reason: default package */
/* loaded from: classes.dex */
public final class cl8 {
    public final int a;
    public final int b;
    public final float[] c;

    public cl8(int i, int i2) {
        this.a = i;
        this.b = i2;
        float[] fArr = new float[3];
        iwe.d((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        this.c = fArr;
    }
}
