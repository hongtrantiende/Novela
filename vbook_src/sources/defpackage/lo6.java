package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lo6  reason: default package */
/* loaded from: classes3.dex */
public final class lo6 extends f82 implements c03 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(lo6.class, "runningWorkers$volatile");
    public final Object C;
    public final /* synthetic */ c03 c;
    public final f82 d;
    public final int e;
    public final uv6 f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public lo6(f82 f82Var, int i) {
        c03 c03Var;
        if (f82Var instanceof c03) {
            c03Var = (c03) f82Var;
        } else {
            c03Var = null;
        }
        this.c = c03Var == null ? st2.a : c03Var;
        this.d = f82Var;
        this.e = i;
        this.f = new uv6();
        this.C = new Object();
    }

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        Runnable y0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
        if (atomicIntegerFieldUpdater.get(this) < this.e && I0() && (y0 = y0()) != null) {
            try {
                ua3.b(this.d, this, new bv4(this, false, y0, 4));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    public final boolean I0() {
        synchronized (this.C) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
            if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.f82
    public final void Q(d82 d82Var, Runnable runnable) {
        Runnable y0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
        if (atomicIntegerFieldUpdater.get(this) < this.e && I0() && (y0 = y0()) != null) {
            try {
                this.d.Q(this, new bv4(this, false, y0, 4));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // defpackage.f82
    public final f82 j0(int i) {
        yte.p(i);
        if (i >= this.e) {
            return this;
        }
        return super.j0(i);
    }

    @Override // defpackage.c03
    public final kb3 o(long j, Runnable runnable, d82 d82Var) {
        return this.c.o(j, runnable, d82Var);
    }

    @Override // defpackage.c03
    public final void q(long j, f61 f61Var) {
        this.c.q(j, f61Var);
    }

    @Override // defpackage.f82
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return hl5.p(sb, this.e, ')');
    }

    public final Runnable y0() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable == null) {
                synchronized (this.C) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = D;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
