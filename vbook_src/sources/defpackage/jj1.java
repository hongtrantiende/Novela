package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jj1  reason: default package */
/* loaded from: classes.dex */
public final class jj1 implements Closeable {
    public final h40 a;
    public final Object b;
    public final xt4 c;
    public vt4 d;

    public jj1(h40 h40Var, Object obj, xt4 xt4Var) {
        h40Var.getClass();
        obj.getClass();
        this.a = h40Var;
        this.b = obj;
        this.c = xt4Var;
        this.d = new cd1(15);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.invoke();
    }
}
