package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iv0  reason: default package */
/* loaded from: classes.dex */
public final class iv0 implements hv0 {
    @Override // defpackage.hv0
    public final float a(float f, float f2, float f3) {
        boolean z;
        float abs = Math.abs((f2 + f) - f);
        if (abs <= f3) {
            z = true;
        } else {
            z = false;
        }
        float f4 = (0.3f * f3) - (nae.e * abs);
        float f5 = f3 - f4;
        if (z && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }
}
