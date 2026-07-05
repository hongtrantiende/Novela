package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pj  reason: default package */
/* loaded from: classes.dex */
public final class pj {
    public static final pj a = new Object();

    public static void a(mw6 mw6Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        int ordinal = mw6Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                Log.wtf(str, str2, null);
                                return;
                            } else {
                                xk5.o();
                                return;
                            }
                        }
                        Log.e(str, str2, null);
                        return;
                    }
                    Log.w(str, str2, null);
                    return;
                }
                Log.i(str, str2, null);
                return;
            }
            Log.d(str, str2, null);
            return;
        }
        Log.v(str, str2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof pj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 219057220;
    }

    public final String toString() {
        return "AndroidLogPipeline";
    }
}
