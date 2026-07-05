package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lqa  reason: default package */
/* loaded from: classes.dex */
public final class lqa {
    public final p09 a;
    public final p09 b;
    public final p09 c;
    public final p09 d;
    public final xy e;

    public lqa(float f, float f2, int i) {
        boolean z;
        double n;
        double n2;
        if (i >= 0) {
            float min = Math.min(f, f2);
            float f3 = i / 100.0f;
            float min2 = Math.min(f2, (1.0f + f3) * min);
            float f4 = f2 / 2.0f;
            if (min <= f4) {
                z = true;
            } else {
                z = false;
            }
            float f5 = (min - f4) / f4;
            if (z) {
                n = yte.n(f3 * 45.0d);
            } else {
                n = yte.n(f3 * 45.0d * (1.0f - f5));
            }
            float f6 = (float) n;
            if (z) {
                n2 = yte.n((1.0d - f3) * 90.0d);
            } else {
                n2 = yte.n((1.0f - ((1.0f - f5) * f3)) * 90.0d);
            }
            float f7 = (float) n2;
            float n3 = (float) ((yte.n(90.0d) - f7) / 2.0d);
            double d = f6;
            float tan = ((float) Math.tan(n3 / 2.0f)) * min * ((float) Math.cos(d));
            float sqrt = ((min2 - ((float) (Math.sqrt(2.0d) * (((float) Math.sin(f7 / 2.0f)) * min)))) - ((1.0f + ((float) Math.tan(d))) * tan)) / 3.0f;
            float min3 = Math.min(min2, f2);
            this.a = new p09(min3, nae.e);
            float f8 = min3 - (2.0f * sqrt);
            this.b = new p09(f8, nae.e);
            float f9 = f8 - sqrt;
            this.c = new p09(f9, nae.e);
            this.d = new p09(f9 - tan, ((float) Math.tan(d)) * tan);
            this.e = new xy(min, n3, f7);
            return;
        }
        vs.m("The value for smoothness can never be negative.");
        throw null;
    }
}
