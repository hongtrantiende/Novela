package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uv6  reason: default package */
/* loaded from: classes3.dex */
public class uv6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(uv6.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = u4f.a.objectFieldOffset(uv6.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new wv6(8, false);

    public final boolean a(Runnable runnable) {
        uv6 uv6Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = b;
            wv6 wv6Var = (wv6) unsafe.getObjectVolatile(this, j);
            int a2 = wv6Var.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 != 2) {
                    uv6Var = this;
                } else {
                    return false;
                }
            } else {
                wv6 d = wv6Var.d();
                while (true) {
                    Unsafe unsafe2 = u4f.a;
                    uv6Var = this;
                    if (!unsafe2.compareAndSwapObject(uv6Var, b, wv6Var, d) && unsafe2.getObjectVolatile(uv6Var, j) == wv6Var) {
                        this = uv6Var;
                    }
                }
            }
            this = uv6Var;
        }
    }

    public final void b() {
        uv6 uv6Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = b;
            wv6 wv6Var = (wv6) unsafe.getObjectVolatile(this, j);
            if (wv6Var.c()) {
                return;
            }
            wv6 d = wv6Var.d();
            while (true) {
                Unsafe unsafe2 = u4f.a;
                uv6Var = this;
                if (!unsafe2.compareAndSwapObject(uv6Var, b, wv6Var, d) && unsafe2.getObjectVolatile(uv6Var, j) == wv6Var) {
                    this = uv6Var;
                }
            }
            this = uv6Var;
        }
    }

    public final int c() {
        a.getClass();
        wv6 wv6Var = (wv6) u4f.a.getObjectVolatile(this, b);
        wv6Var.getClass();
        long j = wv6.f.get(wv6Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        uv6 uv6Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = b;
            wv6 wv6Var = (wv6) unsafe.getObjectVolatile(this, j);
            Object e = wv6Var.e();
            if (e != wv6.g) {
                return e;
            }
            wv6 d = wv6Var.d();
            while (true) {
                Unsafe unsafe2 = u4f.a;
                uv6Var = this;
                if (!unsafe2.compareAndSwapObject(uv6Var, b, wv6Var, d) && unsafe2.getObjectVolatile(uv6Var, j) == wv6Var) {
                    this = uv6Var;
                }
            }
            this = uv6Var;
        }
    }
}
