package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f36  reason: default package */
/* loaded from: classes3.dex */
public final class f36 implements gt5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(f36.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(f36.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final p38 a;

    static {
        Unsafe unsafe = u4f.a;
        f = unsafe.objectFieldOffset(f36.class.getDeclaredField("_rootCause$volatile"));
        d = AtomicReferenceFieldUpdater.newUpdater(f36.class, Object.class, "_exceptionsHolder$volatile");
        e = unsafe.objectFieldOffset(f36.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public f36(p38 p38Var, Throwable th) {
        this.a = p38Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable d2 = d();
        if (d2 == null) {
            h(th);
        } else if (th != d2) {
            Object b2 = b();
            if (b2 == null) {
                g(th);
            } else if (b2 instanceof Throwable) {
                if (th == b2) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(b2);
                arrayList.add(th);
                g(arrayList);
            } else if (b2 instanceof ArrayList) {
                ((ArrayList) b2).add(th);
            } else {
                xk5.p(b2, "State is ");
            }
        }
    }

    public final Object b() {
        d.getClass();
        return u4f.a.getObjectVolatile(this, e);
    }

    @Override // defpackage.gt5
    public final p38 c() {
        return this.a;
    }

    public final Throwable d() {
        c.getClass();
        return (Throwable) u4f.a.getObjectVolatile(this, f);
    }

    public final boolean e() {
        if (d() != null) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Object b2 = b();
        if (b2 == null) {
            arrayList = new ArrayList(4);
        } else if (b2 instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(b2);
            arrayList = arrayList2;
        } else if (b2 instanceof ArrayList) {
            arrayList = (ArrayList) b2;
        } else {
            xk5.p(b2, "State is ");
            return null;
        }
        Throwable d2 = d();
        if (d2 != null) {
            arrayList.add(0, d2);
        }
        if (th != null && !th.equals(d2)) {
            arrayList.add(th);
        }
        g(m36.e);
        return arrayList;
    }

    public final void g(Object obj) {
        d.getClass();
        u4f.a.putObjectVolatile(this, e, obj);
    }

    public final void h(Throwable th) {
        c.getClass();
        u4f.a.putObjectVolatile(this, f, th);
    }

    @Override // defpackage.gt5
    public final boolean isActive() {
        if (d() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        boolean z = true;
        if (b.get(this) != 1) {
            z = false;
        }
        sb.append(z);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(b());
        sb.append(", list=");
        sb.append(this.a);
        sb.append(']');
        return sb.toString();
    }
}
