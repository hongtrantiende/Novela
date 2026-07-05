package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uy9  reason: default package */
/* loaded from: classes.dex */
public final class uy9 implements s76 {
    public static final uy9 a = new Object();
    public static final q9a b = aze.m("androidx.savedstate.SavedState", new o9a[0]);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.getClass();
        if (jbeVar instanceof jy9) {
            jy9 jy9Var = (jy9) jbeVar;
            boolean i = c16.i(jy9Var.E, "");
            Bundle bundle2 = jy9Var.C;
            if (i) {
                bundle2.putAll(bundle);
                return;
            }
            String str = jy9Var.E;
            str.getClass();
            bundle2.putBundle(str, bundle);
            return;
        }
        p1a.k(am8.y(b.a, jbeVar));
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        if (yq2Var instanceof iy9) {
            iy9 iy9Var = (iy9) yq2Var;
            boolean i = c16.i(iy9Var.g, "");
            Bundle bundle = iy9Var.e;
            if (i) {
                return bundle;
            }
            bundle.getClass();
            return cwe.j(iy9Var.g, bundle);
        }
        p1a.k(am8.x(b.a, yq2Var));
        return null;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
