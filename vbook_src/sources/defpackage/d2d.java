package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d2d  reason: default package */
/* loaded from: classes.dex */
public abstract class d2d {
    public static final long a = wi4.a(nae.e, nae.e);
    public static final float b = 3.1415927f;

    public static final long a(float f, float f2) {
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (sqrt > nae.e) {
            return wi4.a(f / sqrt, f2 / sqrt);
        }
        vs.m("Required distance greater than zero");
        return 0L;
    }

    public static final float b(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float c(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }

    public static long d(float f, float f2) {
        double d = f2;
        return nc2.m(nc2.p(f, wi4.a((float) Math.cos(d), (float) Math.sin(d))), a);
    }
}
