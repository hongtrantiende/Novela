package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g  reason: default package */
/* loaded from: classes.dex */
public final class g implements kg9 {
    public static final g a = new Object();
    public static final double b = ((Math.log(65504.0d) / i02.a) + 9.72d) / 17.52d;

    @Override // defpackage.kg9
    public final float c(float f) {
        double d;
        double d2 = f;
        if (d2 <= 0.155251141552511d) {
            d = (d2 - 0.0729055341958355d) / 10.5402377416545d;
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
        if (d < 0.0078125d) {
            log = (d * 10.5402377416545d) + 0.0729055341958355d;
        } else {
            log = (((float) (Math.log(d) / i02.a)) + 9.72d) / 17.52d;
        }
        return (float) log;
    }
}
