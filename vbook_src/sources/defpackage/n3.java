package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n3  reason: default package */
/* loaded from: classes.dex */
public abstract class n3 implements ListenableFuture {
    public static final Object C;
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(n3.class.getName());
    public static final zbe f;
    public volatile Object a;
    public volatile j3 b;
    public volatile m3 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [zbe] */
    /* JADX WARN: Type inference failed for: r5v3 */
    static {
        k3 k3Var;
        try {
            th = null;
            k3Var = new k3(AtomicReferenceFieldUpdater.newUpdater(m3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(m3.class, m3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n3.class, m3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(n3.class, j3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n3.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            k3Var = new Object();
        }
        f = k3Var;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        C = new Object();
    }

    public static void d(n3 n3Var) {
        m3 m3Var;
        j3 j3Var;
        j3 j3Var2;
        j3 j3Var3;
        do {
            m3Var = n3Var.c;
        } while (!f.s(n3Var, m3Var, m3.c));
        while (true) {
            j3Var = null;
            if (m3Var == null) {
                break;
            }
            Thread thread = m3Var.a;
            if (thread != null) {
                m3Var.a = null;
                LockSupport.unpark(thread);
            }
            m3Var = m3Var.b;
        }
        n3Var.c();
        do {
            j3Var2 = n3Var.b;
        } while (!f.q(n3Var, j3Var2, j3.d));
        while (true) {
            j3Var3 = j3Var;
            j3Var = j3Var2;
            if (j3Var == null) {
                break;
            }
            j3Var2 = j3Var.c;
            j3Var.c = j3Var3;
        }
        while (j3Var3 != null) {
            j3 j3Var4 = j3Var3.c;
            e(j3Var3.a, j3Var3.b);
            j3Var3 = j3Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Level level = Level.SEVERE;
            e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof h3)) {
            if (!(obj instanceof i3)) {
                if (obj == C) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((i3) obj).a);
        }
        Throwable th = ((h3) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        j3 j3Var = this.b;
        j3 j3Var2 = j3.d;
        if (j3Var != j3Var2) {
            j3 j3Var3 = new j3(runnable, executor);
            do {
                j3Var3.c = j3Var;
                if (f.q(this, j3Var, j3Var3)) {
                    return;
                }
                j3Var = this.b;
            } while (j3Var != j3Var2);
            e(runnable, executor);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object g = g(this);
            sb.append("SUCCESS, result=[");
            if (g == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(g);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        h3 h3Var;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (d) {
                h3Var = new h3(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                h3Var = h3.c;
            } else {
                h3Var = h3.d;
            }
            if (f.r(this, obj, h3Var)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        boolean z;
        m3 m3Var = m3.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return f(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                m3 m3Var2 = this.c;
                if (m3Var2 != m3Var) {
                    m3 m3Var3 = new m3();
                    do {
                        zbe zbeVar = f;
                        zbeVar.D(m3Var3, m3Var2);
                        if (zbeVar.s(this, m3Var2, m3Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    i(m3Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(m3Var3);
                        } else {
                            m3Var2 = this.c;
                        }
                    } while (m3Var2 != m3Var);
                    return f(this.a);
                }
                return f(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String n3Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder o = rs8.o(j, "Waited ", " ");
            o.append(timeUnit.toString().toLowerCase(locale));
            String sb = o.toString();
            if (nanos + 1000 < 0) {
                String concat = sb.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                } else {
                    z = true;
                }
                if (i > 0) {
                    String str = concat + convert + " " + lowerCase;
                    if (z) {
                        str = str.concat(",");
                    }
                    concat = str.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(eub.o(sb, " for ", n3Var));
        }
        throw new InterruptedException();
    }

    public String h() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(m3 m3Var) {
        m3Var.a = null;
        while (true) {
            m3 m3Var2 = this.c;
            if (m3Var2 != m3.c) {
                m3 m3Var3 = null;
                while (m3Var2 != null) {
                    m3 m3Var4 = m3Var2.b;
                    if (m3Var2.a != null) {
                        m3Var3 = m3Var2;
                    } else if (m3Var3 != null) {
                        m3Var3.b = m3Var4;
                        if (m3Var3.a == null) {
                            break;
                        }
                    } else if (!f.s(this, m3Var2, m3Var4)) {
                        break;
                    }
                    m3Var2 = m3Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof h3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = C;
        }
        if (f.r(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (f.r(this, null, new i3(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof h3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        m3 m3Var = m3.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            m3 m3Var2 = this.c;
            if (m3Var2 != m3Var) {
                m3 m3Var3 = new m3();
                do {
                    zbe zbeVar = f;
                    zbeVar.D(m3Var3, m3Var2);
                    if (zbeVar.s(this, m3Var2, m3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(m3Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    m3Var2 = this.c;
                } while (m3Var2 != m3Var);
                return f(this.a);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
