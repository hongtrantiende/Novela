package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty1  reason: default package */
/* loaded from: classes3.dex */
public abstract class ty1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ty1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = u4f.a;
        c = unsafe.objectFieldOffset(ty1.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(ty1.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(ty1.class.getDeclaredField("_prev$volatile"));
    }

    public ty1(f5a f5aVar) {
        this._prev$volatile = f5aVar;
    }

    public final void b() {
        b.getClass();
        u4f.a.putObjectVolatile(this, d, (Object) null);
    }

    public final ty1 c() {
        ty1 f = f();
        while (f != null && f.g()) {
            b.getClass();
            f = (ty1) u4f.a.getObjectVolatile(f, d);
        }
        return f;
    }

    public final ty1 d() {
        Object e = e();
        if (e == sy1.a) {
            return null;
        }
        return (ty1) e;
    }

    public final Object e() {
        a.getClass();
        return u4f.a.getObjectVolatile(this, c);
    }

    public final ty1 f() {
        b.getClass();
        return (ty1) u4f.a.getObjectVolatile(this, d);
    }

    public abstract boolean g();

    public final boolean h() {
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = c;
            ty1 ty1Var = this;
            if (unsafe.compareAndSwapObject(ty1Var, j, (Object) null, sy1.a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(ty1Var, j) != null) {
                return false;
            }
            this = ty1Var;
        }
    }

    public final void i() {
        ty1 ty1Var;
        ty1 ty1Var2;
        Unsafe unsafe;
        if (d() == null) {
            return;
        }
        while (true) {
            ty1 c2 = c();
            ty1 d2 = d();
            d2.getClass();
            do {
                ty1Var = d2;
                if (!ty1Var.g()) {
                    break;
                }
                d2 = ty1Var.d();
            } while (d2 != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = u4f.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(ty1Var, j);
                if (((ty1) objectVolatile) == null) {
                    ty1Var2 = null;
                } else {
                    ty1Var2 = c2;
                }
                do {
                    unsafe = u4f.a;
                    if (unsafe.compareAndSwapObject(ty1Var, d, objectVolatile, ty1Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(ty1Var, j) == objectVolatile);
            }
            if (c2 != null) {
                a.getClass();
                unsafe.putObjectVolatile(c2, c, ty1Var);
            }
            if (!ty1Var.g() || ty1Var.d() == null) {
                if (c2 == null || !c2.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(f5a f5aVar) {
        while (true) {
            a.getClass();
            Unsafe unsafe = u4f.a;
            long j = c;
            ty1 ty1Var = this;
            f5a f5aVar2 = f5aVar;
            if (unsafe.compareAndSwapObject(ty1Var, j, (Object) null, f5aVar2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(ty1Var, j) != null) {
                return false;
            }
            this = ty1Var;
            f5aVar = f5aVar2;
        }
    }
}
