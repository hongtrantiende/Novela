package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz6  reason: default package */
/* loaded from: classes.dex */
public abstract class yz6 {
    public static final k8a a = new k8a("MagnifierPositionInRoot");

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static nq7 b(nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, boolean z, long j, ix8 ix8Var, int i) {
        xt4 xt4Var4;
        float f;
        long j2;
        ix8 ix8Var2;
        if ((i & 2) != 0) {
            xt4Var4 = null;
        } else {
            xt4Var4 = xt4Var2;
        }
        float f2 = Float.NaN;
        if ((i & 8) != 0) {
            f = Float.NaN;
        } else {
            f = 1.2f;
        }
        if ((i & 32) != 0) {
            j2 = 9205357640488583168L;
        } else {
            j2 = j;
        }
        if ((i & 64) == 0) {
            f2 = 8.0f;
        }
        float f3 = f2;
        if ((i & 512) != 0) {
            ix8Var2 = null;
        } else {
            ix8Var2 = ix8Var;
        }
        if (!a()) {
            return nq7Var;
        }
        if (ix8Var2 == null) {
            if (a()) {
                if (Build.VERSION.SDK_INT == 28) {
                    ix8Var2 = nc6.b;
                } else {
                    ix8Var2 = lx8.a;
                }
            } else {
                xk5.q("Magnifier is only supported on API level 28 and higher.");
                return null;
            }
        }
        return nq7Var.a0(new vz6(xt4Var, xt4Var4, xt4Var3, f, z, j2, f3, Float.NaN, true, ix8Var2));
    }
}
