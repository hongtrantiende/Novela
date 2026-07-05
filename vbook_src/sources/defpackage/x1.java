package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x1  reason: default package */
/* loaded from: classes.dex */
public abstract class x1 implements ListenableFuture {
    public static final Object C;
    public static final boolean d;
    public static final nj6 e;
    public static final lbe f;
    public volatile Object a;
    public volatile l1 b;
    public volatile w1 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [lbe] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    static {
        boolean z;
        Throwable th;
        m1 m1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new nj6(x1.class);
        Throwable th2 = null;
        try {
            th = null;
            m1Var = new Object();
        } catch (Error | Exception e2) {
            th = e2;
            try {
                m1Var = new m1(AtomicReferenceFieldUpdater.newUpdater(w1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(w1.class, w1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x1.class, w1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(x1.class, l1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x1.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                m1Var = new Object();
            }
        }
        f = m1Var;
        if (th2 != null) {
            nj6 nj6Var = e;
            Logger a = nj6Var.a();
            Level level = Level.SEVERE;
            a.log(level, "UnsafeAtomicHelper is broken!", th);
            nj6Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        C = new Object();
    }

    public static void e(x1 x1Var, boolean z) {
        l1 l1Var = null;
        while (true) {
            for (w1 m = f.m(x1Var); m != null; m = m.b) {
                Thread thread = m.a;
                if (thread != null) {
                    m.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                x1Var.i();
                z = false;
            }
            x1Var.c();
            l1 l1Var2 = l1Var;
            l1 l = f.l(x1Var);
            l1 l1Var3 = l1Var2;
            while (l != null) {
                l1 l1Var4 = l.c;
                l.c = l1Var3;
                l1Var3 = l;
                l = l1Var4;
            }
            while (l1Var3 != null) {
                l1Var = l1Var3.c;
                Runnable runnable = l1Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof n1) {
                    n1 n1Var = (n1) runnable;
                    x1Var = n1Var.a;
                    if (x1Var.a == n1Var) {
                        if (f.c(x1Var, n1Var, h(n1Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = l1Var3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                l1Var3 = l1Var;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            Logger a = e.a();
            Level level = Level.SEVERE;
            a.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) {
        if (!(obj instanceof i1)) {
            if (!(obj instanceof k1)) {
                if (obj == C) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((k1) obj).a);
        }
        Throwable th = ((i1) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object h(ListenableFuture listenableFuture) {
        Object obj;
        Throwable o;
        if (listenableFuture instanceof p1) {
            Object obj2 = ((x1) listenableFuture).a;
            if (obj2 instanceof i1) {
                i1 i1Var = (i1) obj2;
                if (i1Var.a) {
                    obj2 = i1Var.b != null ? new i1(i1Var.b, false) : i1.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        } else if ((listenableFuture instanceof x1) && (o = ((x1) listenableFuture).o()) != null) {
            return new k1(o);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            boolean z = true;
            if ((!d) & isCancelled) {
                i1 i1Var2 = i1.d;
                Objects.requireNonNull(i1Var2);
                return i1Var2;
            }
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        try {
                            obj = listenableFuture.get();
                            break;
                        } catch (Error e2) {
                            e = e2;
                            return new k1(e);
                        }
                    } catch (InterruptedException unused) {
                        z2 = z;
                    } catch (Throwable th) {
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (Error | Exception e3) {
                    e = e3;
                    return new k1(e);
                } catch (CancellationException e4) {
                    if (!isCancelled) {
                        return new k1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e4));
                    }
                    return new i1(e4, false);
                } catch (ExecutionException e5) {
                    if (isCancelled) {
                        return new i1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e5), false);
                    }
                    return new k1(e5.getCause());
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            if (isCancelled) {
                return new i1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
            } else if (obj == null) {
                return C;
            } else {
                return obj;
            }
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void a(Runnable runnable, Executor executor) {
        l1 l1Var;
        l1 l1Var2 = l1.d;
        wq9.z(executor, "Executor was null.");
        if (!isDone() && (l1Var = this.b) != l1Var2) {
            l1 l1Var3 = new l1(runnable, executor);
            do {
                l1Var3.c = l1Var;
                if (f.b(this, l1Var, l1Var3)) {
                    return;
                }
                l1Var = this.b;
            } while (l1Var != l1Var2);
            f(runnable, executor);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        i1 i1Var;
        boolean z3;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof n1))) {
            return false;
        }
        if (d) {
            i1Var = new i1(new CancellationException("Future.cancel() was called."), z);
        } else {
            if (z) {
                i1Var = i1.c;
            } else {
                i1Var = i1.d;
            }
            Objects.requireNonNull(i1Var);
        }
        boolean z4 = false;
        while (true) {
            if (f.c(this, obj, i1Var)) {
                e(this, z);
                if (!(obj instanceof n1)) {
                    break;
                }
                ListenableFuture listenableFuture = ((n1) obj).b;
                if (listenableFuture instanceof p1) {
                    this = (x1) listenableFuture;
                    obj = this.a;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof n1)) {
                        break;
                    }
                    z4 = true;
                } else {
                    listenableFuture.cancel(z);
                    break;
                }
            } else {
                obj = this.a;
                if (!(obj instanceof n1)) {
                    return z4;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        w1 w1Var = w1.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof n1))) {
                return g(obj);
            }
            long j4 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                w1 w1Var2 = this.c;
                if (w1Var2 != w1Var) {
                    w1 w1Var3 = new w1();
                    z2 = true;
                    while (true) {
                        lbe lbeVar = f;
                        lbeVar.r(w1Var3, w1Var2);
                        if (lbeVar.d(this, w1Var2, w1Var3)) {
                            j3 = j4;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & (!(obj2 instanceof n1))) {
                                        return g(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    k(w1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            k(w1Var3);
                        } else {
                            long j5 = j4;
                            w1Var2 = this.c;
                            if (w1Var2 == w1Var) {
                                break;
                            }
                            j4 = j5;
                        }
                    }
                }
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                return g(obj3);
            }
            z2 = true;
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.a;
                if (obj4 != null) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4 & (!(obj4 instanceof n1))) {
                    return g(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String x1Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            StringBuilder o = rs8.o(j, "Waited ", " ");
            o.append(timeUnit.toString().toLowerCase(locale));
            String sb = o.toString();
            if (nanos + 1000 < j3) {
                String concat = sb.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                int i = (convert > j3 ? 1 : (convert == j3 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i > 0) {
                    String str = concat + convert + " " + lowerCase;
                    if (z3) {
                        str = str.concat(",");
                    }
                    concat = str.concat(" ");
                }
                if (z3) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(eub.o(sb, " for ", x1Var));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof i1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj;
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof n1)) & z;
    }

    public String j() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void k(w1 w1Var) {
        w1Var.a = null;
        while (true) {
            w1 w1Var2 = this.c;
            if (w1Var2 != w1.c) {
                w1 w1Var3 = null;
                while (w1Var2 != null) {
                    w1 w1Var4 = w1Var2.b;
                    if (w1Var2.a != null) {
                        w1Var3 = w1Var2;
                    } else if (w1Var3 != null) {
                        w1Var3.b = w1Var4;
                        if (w1Var3.a == null) {
                            break;
                        }
                    } else if (!f.d(this, w1Var2, w1Var4)) {
                        break;
                    }
                    w1Var2 = w1Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = C;
        }
        if (!f.c(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!f.c(this, null, new k1(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean n(ListenableFuture listenableFuture) {
        k1 k1Var;
        listenableFuture.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (f.c(this, null, h(listenableFuture))) {
                    e(this, false);
                    return true;
                }
                return false;
            }
            n1 n1Var = new n1(this, listenableFuture);
            if (f.c(this, null, n1Var)) {
                try {
                    listenableFuture.a(n1Var, e73.a);
                    return true;
                } catch (Throwable th) {
                    try {
                        k1Var = new k1(th);
                    } catch (Error | Exception unused) {
                        k1Var = k1.b;
                    }
                    f.c(this, n1Var, k1Var);
                    return true;
                }
            }
            obj = this.a;
        }
        if (obj instanceof i1) {
            listenableFuture.cancel(((i1) obj).a);
        }
        return false;
    }

    public final Throwable o() {
        if (this instanceof p1) {
            Object obj = this.a;
            if (obj instanceof k1) {
                return ((k1) obj).a;
            }
            return null;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.a;
        if ((obj instanceof i1) && ((i1) obj).a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r6 = "CANCELLED"
            r0.append(r6)
            goto Lcf
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.b(r0)
            goto Lcf
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.a
            boolean r4 = r3 instanceof defpackage.n1
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            n1 r3 = (defpackage.n1) r3
            com.google.common.util.concurrent.ListenableFuture r3 = r3.b
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lbf
        L93:
            java.lang.String r3 = r6.j()     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            boolean r4 = defpackage.ch0.v(r3)     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            if (r4 == 0) goto Lb2
            r3 = 0
            goto Lb2
        L9f:
            r3 = move-exception
            goto La2
        La1:
            r3 = move-exception
        La2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb2:
            if (r3 == 0) goto Lbf
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbf:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcf
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.b(r0)
        Lcf:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1.toString():java.lang.String");
    }

    public void c() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        w1 w1Var = w1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof n1))) {
                return g(obj2);
            }
            w1 w1Var2 = this.c;
            if (w1Var2 != w1Var) {
                w1 w1Var3 = new w1();
                do {
                    lbe lbeVar = f;
                    lbeVar.r(w1Var3, w1Var2);
                    if (lbeVar.d(this, w1Var2, w1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(w1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof n1))));
                        return g(obj);
                    }
                    w1Var2 = this.c;
                } while (w1Var2 != w1Var);
                Object obj3 = this.a;
                Objects.requireNonNull(obj3);
                return g(obj3);
            }
            Object obj32 = this.a;
            Objects.requireNonNull(obj32);
            return g(obj32);
        }
        throw new InterruptedException();
    }
}
