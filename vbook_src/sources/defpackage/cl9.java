package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl9  reason: default package */
/* loaded from: classes.dex */
public abstract class cl9 {
    public n07 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(rl9 rl9Var) {
        RecyclerView recyclerView;
        int i = rl9Var.i;
        if (!rl9Var.e() && (i & 4) == 0 && (recyclerView = rl9Var.q) != null) {
            recyclerView.D(rl9Var);
        }
    }

    public abstract boolean a(rl9 rl9Var, rl9 rl9Var2, vf9 vf9Var, vf9 vf9Var2);

    public final void c(rl9 rl9Var) {
        n07 n07Var = this.a;
        if (n07Var != null) {
            RecyclerView recyclerView = (RecyclerView) n07Var.b;
            boolean z = true;
            rl9Var.m(true);
            View view = rl9Var.a;
            if (rl9Var.g != null && rl9Var.h == null) {
                rl9Var.g = null;
            }
            rl9Var.h = null;
            if ((rl9Var.i & 16) == 0) {
                kl9 kl9Var = recyclerView.c;
                recyclerView.Y();
                ij1 ij1Var = recyclerView.f;
                zg1 zg1Var = (zg1) ij1Var.c;
                g99 g99Var = (g99) ij1Var.b;
                int indexOfChild = ((RecyclerView) g99Var.b).indexOfChild(view);
                if (indexOfChild == -1) {
                    ij1Var.a0(view);
                } else if (zg1Var.E(indexOfChild)) {
                    zg1Var.I(indexOfChild);
                    ij1Var.a0(view);
                    g99Var.y(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    rl9 F = RecyclerView.F(view);
                    kl9Var.o(F);
                    kl9Var.l(F);
                }
                recyclerView.Z(!z);
                if (!z && rl9Var.i()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(rl9 rl9Var);

    public abstract void e();

    public abstract boolean f();
}
