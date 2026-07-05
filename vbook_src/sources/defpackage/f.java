package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public final class f implements kg9 {
    public static final f a = new Object();
    public static final double b = ((Math.log(65504.0d) / i02.a) + 9.72d) / 17.52d;

    @Override // defpackage.kg9
    public final float c(float f) {
        double d;
        double d2 = f;
        if (d2 <= -0.3013698630136986d) {
            d = (ch0.t(2.0d, (d2 * 17.52d) - 9.72d) - 1.52587890625E-5d) * 2.0d;
        } else if (d2 < b) {
            d = Math.pow(2.0d, (d2 * 17.52d) - 9.72d);
        } else {
            d = 65504.0d;
        }
        return (float) d;
    }

    @Override // defpackage.kg9
    public final float h(float f) {
        double log;
        double d = f;
        if (d < 3.0517578125E-5d) {
            if (f < nae.e) {
                f = 0.0f;
            }
            log = Math.log((f / 2.0d) + 1.52587890625E-5d) / i02.a;
        } else {
            log = (float) (Math.log(d) / i02.a);
        }
        return (float) ((log + 9.72d) / 17.52d);
    }
}
