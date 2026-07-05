package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zn1  reason: default package */
/* loaded from: classes3.dex */
public final class zn1 {
    public static final zn1 a = new Object();

    public static nq7 b(nq7 nq7Var, float f) {
        if (f <= 0.0d) {
            jv5.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return nq7Var.a0(new we6(f, true));
    }

    public final nq7 a(nq7 nq7Var, lk0 lk0Var) {
        return nq7Var.a0(new l95(lk0Var));
    }
}
