package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ve0  reason: default package */
/* loaded from: classes.dex */
public final class ve0 implements kg9 {
    public static final ve0 a = new Object();
    public static final double b = (ch0.t(0.018d, 0.45d) * 1.099d) - 0.099d;

    @Override // defpackage.kg9
    public final float c(float f) {
        Number valueOf;
        double d = f;
        if (d < b) {
            valueOf = Float.valueOf(f / 4.5f);
        } else {
            valueOf = Double.valueOf(ch0.t((d + 0.099d) / 1.099d, 2.2222222222222223d));
        }
        return valueOf.floatValue();
    }

    @Override // defpackage.kg9
    public final float h(float f) {
        double t;
        double d = f;
        if (d < 0.018d) {
            t = d * 4.5d;
        } else {
            t = (ch0.t(d, 0.45d) * 1.099d) - 0.099d;
        }
        return (float) t;
    }
}
