package defpackage;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import org.jetbrains.compose.resources.AndroidContextProvider;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nh  reason: default package */
/* loaded from: classes3.dex */
public abstract class nh {
    public static final void a(int i, rv4 rv4Var) {
        boolean z;
        rv4Var.g0(1587247798);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            if (((Boolean) rv4Var.j(lx5.a)).booleanValue()) {
                rv4Var.e0(-1890697985);
                Context context = AndroidContextProvider.a;
                AndroidContextProvider.a = (Context) rv4Var.j(gh.b);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1890623988);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new c8(i);
        }
    }

    public static final Context b() {
        return InstrumentationRegistry.getInstrumentation().getContext();
    }
}
