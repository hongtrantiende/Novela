package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ni4  reason: default package */
/* loaded from: classes.dex */
public final class ni4 {
    public float a = nae.e;
    public float b = nae.e;

    public mi4 a(float f) {
        double b = b(f);
        double d = oi4.a;
        double d2 = d - 1.0d;
        return new mi4(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = dj.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
