package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wl4  reason: default package */
/* loaded from: classes3.dex */
public final class wl4 implements hv9 {
    public static final wl4 a = new Object();

    @Override // defpackage.hv9
    public final nq7 a(float f, nq7 nq7Var, boolean z) {
        if (f <= 0.0d) {
            jv5.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return nq7Var.a0(new we6(f, true));
    }
}
