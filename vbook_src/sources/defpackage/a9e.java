package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a9e  reason: default package */
/* loaded from: classes.dex */
public abstract class a9e {
    public final Unsafe a;

    public a9e(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public final void b(long j, Object obj, int i) {
        this.a.putInt(obj, j, i);
    }

    public abstract void c(Object obj, long j, byte b);

    public abstract void d(Object obj, long j, double d);

    public abstract void e(Object obj, long j, float f);

    public final void f(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public abstract void g(Object obj, long j, boolean z);

    public abstract float h(Object obj, long j);

    public abstract boolean i(Object obj, long j);

    public final int j(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long k(Object obj, long j) {
        return this.a.getLong(obj, j);
    }
}
