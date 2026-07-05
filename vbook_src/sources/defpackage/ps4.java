package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ps4  reason: default package */
/* loaded from: classes.dex */
public abstract class ps4 {
    public static final os4 a = os4.a;

    public static os4 a(rr4 rr4Var) {
        while (rr4Var != null) {
            if (rr4Var.Q != null && rr4Var.G) {
                rr4Var.o();
            }
            rr4Var = rr4Var.S;
        }
        return a;
    }

    public static void b(ls4 ls4Var) {
        if (hs4.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(ls4Var.a.getClass().getName()), ls4Var);
        }
    }

    public static final void c(rr4 rr4Var, String str) {
        str.getClass();
        b(new ls4(rr4Var, "Attempting to reuse fragment " + rr4Var + " with previous ID " + str));
        a(rr4Var).getClass();
    }
}
