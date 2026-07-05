package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l82  reason: default package */
/* loaded from: classes3.dex */
public final class l82 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater D = AtomicLongFieldUpdater.newUpdater(l82.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(l82.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(l82.class, "_isTerminated$volatile");
    public static final lie G = new lie(5, "NOT_IN_STACK", false);
    public final iq9 C;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final iz4 e;
    public final iz4 f;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v3, types: [iz4, uv6] */
    /* JADX WARN: Type inference failed for: r4v4, types: [iz4, uv6] */
    public l82(int i, int i2, long j, String str) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.e = new uv6();
                        this.f = new uv6();
                        this.C = new iq9((i + 1) * 2);
                        this.controlState$volatile = i << 42;
                        return;
                    }
                    p1a.k(nk2.t(j, "Idle worker keep alive time ", " must be positive"));
                    throw null;
                }
                p1a.k(hl5.l("Max pool size ", " should not exceed maximal supported number of threads 2097150", i2));
                throw null;
            }
            p1a.k(rs8.k("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        p1a.k(hl5.l("Core pool size ", " should be at least 1", i));
        throw null;
    }

    public static /* synthetic */ void C(l82 l82Var, Runnable runnable, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        l82Var.q(runnable, false, z);
    }

    public final void G(j82 j82Var, int i, int i2) {
        while (true) {
            long j = D.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = j82Var.c();
                    while (true) {
                        if (c == G) {
                            i3 = -1;
                            break;
                        } else if (c == null) {
                            i3 = 0;
                            break;
                        } else {
                            j82 j82Var2 = (j82) c;
                            int b = j82Var2.b();
                            if (b != 0) {
                                i3 = b;
                                break;
                            }
                            c = j82Var2.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                l82 l82Var = this;
                if (D.compareAndSet(l82Var, j, i3 | j2)) {
                    return;
                }
                this = l82Var;
            }
        }
    }

    public final boolean Q(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int o = o();
            if (o == 1 && i2 > 1) {
                o();
            }
            if (o > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean S() {
        l82 l82Var;
        lie lieVar;
        int i;
        while (true) {
            long j = D.get(this);
            j82 j82Var = (j82) this.C.b((int) (2097151 & j));
            if (j82Var == null) {
                j82Var = null;
                l82Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = j82Var.c();
                while (true) {
                    lieVar = G;
                    if (c == lieVar) {
                        i = -1;
                        break;
                    } else if (c == null) {
                        i = 0;
                        break;
                    } else {
                        j82 j82Var2 = (j82) c;
                        i = j82Var2.b();
                        if (i != 0) {
                            break;
                        }
                        c = j82Var2.c();
                        j = j;
                    }
                }
                if (i >= 0) {
                    l82 l82Var2 = this;
                    boolean compareAndSet = D.compareAndSet(l82Var2, j, i | j2);
                    l82Var = l82Var2;
                    if (compareAndSet) {
                        j82Var.g(lieVar);
                    }
                    this = l82Var;
                } else {
                    continue;
                }
            }
            if (j82Var == null) {
                return false;
            }
            if (j82.E.compareAndSet(j82Var, -1, 0)) {
                LockSupport.unpark(j82Var);
                return true;
            }
            this = l82Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r0 == null) goto L42;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.l82.F
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.j82
            r3 = 0
            if (r1 == 0) goto L17
            j82 r0 = (defpackage.j82) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L20
            l82 r1 = r0.D
            if (r1 == r8) goto L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            iq9 r0 = r8.C
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.l82.E     // Catch: java.lang.Throwable -> La7
            long r4 = r1.get(r8)     // Catch: java.lang.Throwable -> La7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L5c
            r0 = r2
        L32:
            iq9 r4 = r8.C
            java.lang.Object r4 = r4.b(r0)
            r4.getClass()
            j82 r4 = (defpackage.j82) r4
            if (r4 == r3) goto L57
        L3f:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L3f
        L50:
            tmd r4 = r4.a
            iz4 r5 = r8.f
            r4.d(r5)
        L57:
            if (r0 == r1) goto L5c
            int r0 = r0 + 1
            goto L32
        L5c:
            iz4 r0 = r8.f
            r0.b()
            iz4 r0 = r8.e
            r0.b()
        L66:
            if (r3 == 0) goto L6e
            ykb r0 = r3.a(r2)
            if (r0 != 0) goto L96
        L6e:
            iz4 r0 = r8.e
            java.lang.Object r0 = r0.d()
            ykb r0 = (defpackage.ykb) r0
            if (r0 != 0) goto L96
            iz4 r0 = r8.f
            java.lang.Object r0 = r0.d()
            ykb r0 = (defpackage.ykb) r0
            if (r0 != 0) goto L96
            if (r3 == 0) goto L89
            k82 r0 = defpackage.k82.e
            r3.h(r0)
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.l82.D
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.l82.E
            r0.set(r8, r1)
            return
        L96:
            r0.run()     // Catch: java.lang.Throwable -> L9a
            goto L66
        L9a:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.getUncaughtExceptionHandler()
            r4.uncaughtException(r1, r0)
            goto L66
        La7:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l82.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C(this, runnable, 6);
    }

    public final int o() {
        boolean z;
        synchronized (this.C) {
            try {
                if (F.get(this) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = E;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 > 0 && this.C.b(i3) == null) {
                    j82 j82Var = new j82(this, i3);
                    this.C.c(i3, j82Var);
                    if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i4 = i2 + 1;
                        j82Var.start();
                        return i4;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(Runnable runnable, boolean z, boolean z2) {
        ykb zkbVar;
        long j;
        j82 j82Var;
        boolean a;
        k82 k82Var;
        alb.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof ykb) {
            zkbVar = (ykb) runnable;
            zkbVar.a = nanoTime;
            zkbVar.b = z;
        } else {
            zkbVar = new zkb(runnable, nanoTime, z);
        }
        boolean z3 = zkbVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        if (z3) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        j82 j82Var2 = null;
        if (currentThread instanceof j82) {
            j82Var = (j82) currentThread;
        } else {
            j82Var = null;
        }
        if (j82Var != null && j82Var.D == this) {
            j82Var2 = j82Var;
        }
        if (j82Var2 != null && (k82Var = j82Var2.c) != k82.e && (zkbVar.b || k82Var != k82.b)) {
            j82Var2.C = true;
            zkbVar = j82Var2.a.a(zkbVar, z2);
        }
        if (zkbVar != null) {
            if (zkbVar.b) {
                a = this.f.a(zkbVar);
            } else {
                a = this.e.a(zkbVar);
            }
            if (!a) {
                throw new RejectedExecutionException(s21.q(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (!S() && !Q(j)) {
                S();
            }
        } else if (S() || Q(atomicLongFieldUpdater.get(this))) {
        } else {
            S();
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        iq9 iq9Var = this.C;
        int a = iq9Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            j82 j82Var = (j82) iq9Var.b(i6);
            if (j82Var != null) {
                int c = j82Var.a.c();
                int ordinal = j82Var.c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i5++;
                                } else {
                                    xk5.o();
                                    return null;
                                }
                            } else {
                                i4++;
                                if (c > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        i2++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(c);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j = E.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(nq2.y(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        rs8.q(this.b, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        rs8.q(i2, i3, ", parked = ", ", dormant = ", sb4);
        rs8.q(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
