package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tmd  reason: default package */
/* loaded from: classes3.dex */
public final class tmd {
    public final AtomicReferenceArray a = new AtomicReferenceArray((int) Token.CASE);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(tmd.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = u4f.a.objectFieldOffset(tmd.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(tmd.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(tmd.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(tmd.class, "blockingTasksInBuffer$volatile");

    public final ykb a(ykb ykbVar, boolean z) {
        if (z) {
            return b(ykbVar);
        }
        b.getClass();
        ykb ykbVar2 = (ykb) u4f.a.getAndSetObject(this, f, ykbVar);
        if (ykbVar2 == null) {
            return null;
        }
        return b(ykbVar2);
    }

    public final ykb b(ykb ykbVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return ykbVar;
        }
        if (ykbVar.b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & Token.SWITCH;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, ykbVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = u4f.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        if (objectVolatile != null) {
            return (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1;
        }
        return atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(iz4 iz4Var) {
        b.getClass();
        ykb ykbVar = (ykb) u4f.a.getAndSetObject(this, f, (Object) null);
        if (ykbVar != null) {
            iz4Var.a(ykbVar);
        }
        while (true) {
            ykb f2 = f();
            if (f2 == null) {
                return;
            }
            iz4Var.a(f2);
        }
    }

    public final ykb e() {
        b.getClass();
        ykb ykbVar = (ykb) u4f.a.getAndSetObject(this, f, (Object) null);
        if (ykbVar == null) {
            return f();
        }
        return ykbVar;
    }

    public final ykb f() {
        ykb ykbVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & Token.SWITCH;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (ykbVar = (ykb) this.a.getAndSet(i2, null)) != null) {
                if (ykbVar.b) {
                    e.decrementAndGet(this);
                }
                return ykbVar;
            }
        }
    }

    public final ykb g() {
        tmd tmdVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = u4f.a;
            long j = f;
            ykb ykbVar = (ykb) unsafe.getObjectVolatile(this, j);
            if (ykbVar != null && ykbVar.b) {
                while (true) {
                    Unsafe unsafe2 = u4f.a;
                    tmdVar = this;
                    if (unsafe2.compareAndSwapObject(tmdVar, f, ykbVar, (Object) null)) {
                        return ykbVar;
                    }
                    if (unsafe2.getObjectVolatile(tmdVar, j) != ykbVar) {
                        break;
                    }
                    this = tmdVar;
                }
            }
            this = tmdVar;
        }
        tmd tmdVar2 = this;
        int i = d.get(tmdVar2);
        int i2 = c.get(tmdVar2);
        while (i != i2 && e.get(tmdVar2) != 0) {
            i2--;
            ykb h = tmdVar2.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final ykb h(int i, boolean z) {
        int i2 = i & Token.SWITCH;
        AtomicReferenceArray atomicReferenceArray = this.a;
        ykb ykbVar = (ykb) atomicReferenceArray.get(i2);
        if (ykbVar == null || ykbVar.b != z) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i2, ykbVar, null)) {
            if (atomicReferenceArray.get(i2) != ykbVar) {
                return null;
            }
        }
        if (z) {
            e.decrementAndGet(this);
        }
        return ykbVar;
    }

    public final long i(int i, zl9 zl9Var) {
        int i2;
        tmd tmdVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = u4f.a;
            long j = f;
            ykb ykbVar = (ykb) unsafe.getObjectVolatile(this, j);
            if (ykbVar != null) {
                if (ykbVar.b) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                if ((i2 & i) == 0) {
                    return -2L;
                }
                alb.f.getClass();
                long nanoTime = System.nanoTime() - ykbVar.a;
                long j2 = alb.b;
                if (nanoTime < j2) {
                    return j2 - nanoTime;
                }
                while (true) {
                    Unsafe unsafe2 = u4f.a;
                    tmdVar = this;
                    if (unsafe2.compareAndSwapObject(tmdVar, f, ykbVar, (Object) null)) {
                        zl9Var.a = ykbVar;
                        return -1L;
                    } else if (unsafe2.getObjectVolatile(tmdVar, j) != ykbVar) {
                        break;
                    } else {
                        this = tmdVar;
                    }
                }
            } else {
                return -2L;
            }
            this = tmdVar;
        }
    }
}
