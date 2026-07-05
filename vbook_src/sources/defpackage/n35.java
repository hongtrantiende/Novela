package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n35  reason: default package */
/* loaded from: classes3.dex */
public final class n35 extends f82 implements c03 {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final n35 f;

    public n35(Handler handler, String str, boolean z) {
        n35 n35Var;
        this.c = handler;
        this.d = str;
        this.e = z;
        if (z) {
            n35Var = this;
        } else {
            n35Var = new n35(handler, str, true);
        }
        this.f = n35Var;
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        if (!this.c.post(runnable)) {
            y0(d82Var, runnable);
        }
    }

    @Override // defpackage.f82
    public final boolean V(d82 d82Var) {
        if (this.e && c16.i(Looper.myLooper(), this.c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n35) {
            n35 n35Var = (n35) obj;
            if (n35Var.c == this.c && n35Var.e == this.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.c);
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.f82
    public final f82 j0(int i) {
        yte.p(i);
        return this;
    }

    @Override // defpackage.c03
    public final kb3 o(long j, Runnable runnable, d82 d82Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new m35(0, this, runnable);
        }
        y0(d82Var, runnable);
        return w38.a;
    }

    @Override // defpackage.c03
    public final void q(long j, f61 f61Var) {
        ex2 ex2Var = new ex2(6, f61Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(ex2Var, j)) {
            f61Var.w(new j34(4, this, ex2Var));
        } else {
            y0(f61Var.e, ex2Var);
        }
    }

    @Override // defpackage.f82
    public final String toString() {
        n35 n35Var;
        String str;
        sw2 sw2Var = ab3.a;
        n35 n35Var2 = zz6.a;
        if (this == n35Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                n35Var = n35Var2.f;
            } catch (UnsupportedOperationException unused) {
                n35Var = null;
            }
            if (this == n35Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.d;
            if (str2 == null) {
                str2 = this.c.toString();
            }
            if (this.e) {
                return nk2.u(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public final void y0(d82 d82Var, Runnable runnable) {
        k27.m(d82Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        sw2 sw2Var = ab3.a;
        ru2.c.C(d82Var, runnable);
    }

    public n35(Handler handler) {
        this(handler, null, false);
    }
}
