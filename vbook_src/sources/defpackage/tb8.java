package defpackage;

import android.window.OnBackInvokedDispatcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tb8  reason: default package */
/* loaded from: classes.dex */
public final class tb8 {
    public final Runnable a;
    public final mfb b = new mfb(new u76(this, 20));

    public tb8(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(if0 if0Var, un6 un6Var) {
        if0Var.getClass();
        final xn6 k = un6Var.k();
        if (k.h == kn6.a) {
            return;
        }
        ob8 ob8Var = new ob8(if0Var, new pb8(if0Var, un6Var));
        if0Var.a.add(ob8Var);
        ob8Var.j(false);
        yz7.a(b().c, ob8Var);
        final yf yfVar = new yf(ob8Var, this, k);
        k.a(yfVar);
        if0Var.c.add(new AutoCloseable() { // from class: qb8
            @Override // java.lang.AutoCloseable
            public final void close() {
                xn6.this.f(yfVar);
            }
        });
    }

    public final rb8 b() {
        return (rb8) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.c(new mb8(onBackInvokedDispatcher, 0), 1);
        b().c.c(new mb8(onBackInvokedDispatcher, 1000000), 0);
    }
}
