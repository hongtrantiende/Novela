package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fu9  reason: default package */
/* loaded from: classes.dex */
public abstract class fu9 {
    public m41 a;
    public Executor b;
    public r9a c;
    public cu9 d;
    public w16 e;
    public boolean g;
    public final kw5 f = new kw5(new yw7(0, this, fu9.class, "onClosed", "onClosed()V", 0, 23));
    public final ThreadLocal h = new ThreadLocal();
    public final LinkedHashMap i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        boolean z;
        if (!this.g) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            vs.k("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        it4 k0 = g().k0();
        if (!k0.V()) {
            mue.q(new o54(f(), (m42) null, 14));
        }
        if (k0.a.isWriteAheadLoggingEnabled()) {
            k0.q();
        } else {
            k0.o();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p17.k(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(nmd.B((gi1) entry.getKey()), entry.getValue());
        }
        return ks3.a;
    }

    public abstract w16 d();

    public yp3 e() {
        throw new g48(0);
    }

    public final w16 f() {
        w16 w16Var = this.e;
        if (w16Var != null) {
            return w16Var;
        }
        c16.w("internalTracker");
        throw null;
    }

    public final l9b g() {
        cu9 cu9Var = this.d;
        if (cu9Var != null) {
            l9b c = cu9Var.c();
            if (c != null) {
                return c;
            }
            vs.k("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
            return null;
        }
        c16.w("connectionManager");
        throw null;
    }

    public Set h() {
        return sl1.H0(new ArrayList(tl1.s(rs3.a, 10)));
    }

    public LinkedHashMap i() {
        int k = p17.k(tl1.s(rs3.a, 10));
        if (k < 16) {
            k = 16;
        }
        return new LinkedHashMap(k);
    }

    public final boolean j() {
        cu9 cu9Var = this.d;
        if (cu9Var != null) {
            if (cu9Var.c() != null) {
                return true;
            }
            return false;
        }
        c16.w("connectionManager");
        throw null;
    }

    public final boolean k() {
        if (m() && g().k0().V()) {
            return true;
        }
        return false;
    }

    public final void l() {
        g().k0().G();
        if (!k()) {
            w16 f = f();
            f.b.g(f.e, f.f);
        }
    }

    public final boolean m() {
        cu9 cu9Var = this.d;
        if (cu9Var != null) {
            it4 it4Var = cu9Var.g;
            if (it4Var != null) {
                return it4Var.a.isOpen();
            }
            return false;
        }
        c16.w("connectionManager");
        throw null;
    }

    public final Object n(Callable callable) {
        b();
        try {
            Object call = callable.call();
            p();
            return call;
        } finally {
            l();
        }
    }

    public final void o(Runnable runnable) {
        b();
        try {
            runnable.run();
            p();
        } finally {
            l();
        }
    }

    public final void p() {
        g().k0().j0();
    }

    public final Object q(boolean z, lu4 lu4Var, n42 n42Var) {
        cu9 cu9Var = this.d;
        if (cu9Var != null) {
            return cu9Var.f.N(z, lu4Var, n42Var);
        }
        c16.w("connectionManager");
        throw null;
    }
}
