package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wv6  reason: default package */
/* loaded from: classes3.dex */
public final class wv6 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(wv6.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = u4f.a.objectFieldOffset(wv6.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(wv6.class, "_state$volatile");
    public static final lie g = new lie(5, "REMOVE_FROZEN", false);

    public wv6(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            vs.k("Check failed.");
            throw null;
        }
        vs.k("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = this.b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = this.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    wv6 wv6Var = this;
                    if (f.compareAndSet(wv6Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i2 & i3, obj);
                        wv6 wv6Var2 = wv6Var;
                        while ((atomicLongFieldUpdater.get(wv6Var2) & 1152921504606846976L) != 0) {
                            wv6Var2 = wv6Var2.d();
                            AtomicReferenceArray atomicReferenceArray2 = wv6Var2.d;
                            int i5 = wv6Var2.c & i2;
                            Object obj2 = atomicReferenceArray2.get(i5);
                            if ((obj2 instanceof vv6) && ((vv6) obj2).a == i2) {
                                atomicReferenceArray2.set(i5, obj);
                                continue;
                            } else {
                                wv6Var2 = null;
                                continue;
                            }
                            if (wv6Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    this = wv6Var;
                }
            } else {
                return 1;
            }
        }
    }

    public final wv6 b(long j) {
        wv6 wv6Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = u4f.a;
            long j2 = h;
            wv6 wv6Var2 = (wv6) unsafe.getObjectVolatile(this, j2);
            if (wv6Var2 != null) {
                return wv6Var2;
            }
            wv6 wv6Var3 = new wv6(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new vv6(i);
                }
                wv6Var3.d.set(wv6Var3.c & i, obj);
                i++;
            }
            f.set(wv6Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = u4f.a;
                wv6Var = this;
                if (!unsafe2.compareAndSwapObject(wv6Var, h, (Object) null, wv6Var3) && unsafe2.getObjectVolatile(wv6Var, j2) == null) {
                    this = wv6Var;
                }
            }
            this = wv6Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            wv6 wv6Var = this;
            if (atomicLongFieldUpdater.compareAndSet(wv6Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = wv6Var;
        }
    }

    public final wv6 d() {
        long j;
        wv6 wv6Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                wv6Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            wv6Var = this;
            if (atomicLongFieldUpdater.compareAndSet(wv6Var, j, j2)) {
                j = j2;
                break;
            }
            this = wv6Var;
        }
        return wv6Var.b(j);
    }

    public final Object e() {
        wv6 wv6Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(wv6Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = wv6Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = wv6Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = wv6Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else if (obj instanceof vv6) {
                break;
            } else {
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(wv6Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                wv6Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(wv6Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            wv6Var = wv6Var.d();
                        } else {
                            wv6 wv6Var2 = wv6Var;
                            if (f.compareAndSet(wv6Var2, j3, (j3 & (-1073741824)) | j2)) {
                                wv6Var2.d.set(i4 & wv6Var2.c, null);
                                wv6Var = null;
                            } else {
                                wv6Var = wv6Var2;
                            }
                        }
                        if (wv6Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
