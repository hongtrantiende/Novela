package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hv0  reason: default package */
/* loaded from: classes.dex */
public interface hv0 {
    public static final gv0 a = gv0.a;

    default float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= nae.e && f4 <= f3) || (f < nae.e && f4 > f3)) {
            return nae.e;
        }
        float f5 = f4 - f3;
        if (Math.abs(f) < Math.abs(f5)) {
            return f;
        }
        return f5;
    }
}
