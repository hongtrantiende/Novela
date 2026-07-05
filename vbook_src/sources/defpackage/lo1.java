package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lo1  reason: default package */
/* loaded from: classes.dex */
public final class lo1 extends e9 {
    public static final nj6 K = new nj6(lo1.class);
    public is5 H;
    public final boolean I;
    public ko1 J;

    public lo1(is5 is5Var, boolean z) {
        int size = is5Var.size();
        this.D = null;
        this.E = size;
        this.H = is5Var;
        this.I = z;
    }

    @Override // defpackage.x1
    public final void c() {
        boolean z;
        is5 is5Var = this.H;
        this.H = null;
        this.J = null;
        boolean z2 = this.a instanceof i1;
        if (is5Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z2 & z) {
            boolean p = p();
            jwc it = is5Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(p);
            }
        }
    }

    @Override // defpackage.x1
    public final void i() {
        ko1 ko1Var = this.J;
        if (ko1Var != null) {
            ko1Var.c();
        }
    }

    @Override // defpackage.x1
    public final String j() {
        is5 is5Var = this.H;
        if (is5Var != null) {
            return "futures=" + is5Var;
        }
        return super.j();
    }

    public final void q(is5 is5Var) {
        boolean z;
        int n = e9.F.n(this);
        if (n >= 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.C("Less than 0 remaining futures", z);
        if (n == 0) {
            if (is5Var != null) {
                jwc it = is5Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            bce.p(future);
                        } catch (ExecutionException e) {
                            r(e.getCause());
                        } catch (Throwable th) {
                            r(th);
                        }
                    }
                }
            }
            this.D = null;
            ko1 ko1Var = this.J;
            if (ko1Var != null) {
                try {
                    ko1Var.c.execute(ko1Var);
                } catch (RejectedExecutionException e2) {
                    ko1Var.d.m(e2);
                }
            }
            this.H = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        String str = "Input Future failed with Error";
        if (this.I && !m(th)) {
            Set set = this.D;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.a instanceof i1)) {
                    Throwable o = o();
                    Objects.requireNonNull(o);
                    while (o != null && newSetFromMap.add(o)) {
                        o = o.getCause();
                    }
                }
                e9.F.m(this, newSetFromMap);
                Set set2 = this.D;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            if (!(th instanceof Error)) {
                str = "Got more than one input Future failure. Logging failures after the first";
            }
            K.a().log(Level.SEVERE, str, th);
            return;
        }
        if (th instanceof Error) {
            K.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.H);
        if (this.H.isEmpty()) {
            ko1 ko1Var = this.J;
            if (ko1Var != null) {
                try {
                    ko1Var.c.execute(ko1Var);
                    return;
                } catch (RejectedExecutionException e) {
                    ko1Var.d.m(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.I;
        e73 e73Var = e73.a;
        if (z) {
            jwc it = this.H.iterator();
            int i = 0;
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    t(listenableFuture);
                } else {
                    listenableFuture.a(new b9(this, i, listenableFuture), e73Var);
                }
                i = i2;
            }
            return;
        }
        b9 b9Var = new b9(1, this, (Object) null);
        jwc it2 = this.H.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                q(null);
            } else {
                listenableFuture2.a(b9Var, e73Var);
            }
        }
    }

    public final void t(ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.H = null;
                cancel(false);
            } else {
                try {
                    bce.p(listenableFuture);
                } catch (ExecutionException e) {
                    r(e.getCause());
                } catch (Throwable th) {
                    r(th);
                }
            }
        } finally {
            q(null);
        }
    }
}
