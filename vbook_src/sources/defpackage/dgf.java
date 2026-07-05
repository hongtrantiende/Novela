package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dgf  reason: default package */
/* loaded from: classes.dex */
public final class dgf implements Runnable, Closeable {
    public sgf a;
    public final boolean b = nae.s(Thread.currentThread());
    public boolean c;
    public boolean d;
    public final boolean e;

    public dgf(sgf sgfVar, boolean z) {
        this.e = false;
        this.a = sgfVar;
        this.e = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        sgf sgfVar = this.a;
        try {
            this.a = null;
            boolean z = this.d;
            if (!z) {
                if (!this.c) {
                    this.c = true;
                    if (this.b && !z) {
                        nae.s(Thread.currentThread());
                    }
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
            if (sgfVar != null) {
                ((ref) sgfVar).close();
            }
            if (this.e) {
                kff.b(kff.c(), bgf.C);
            }
        } catch (Throwable th) {
            if (sgfVar != null) {
                try {
                    ((ref) sgfVar).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void o(x1 x1Var) {
        if (!this.c) {
            if (!this.d) {
                this.d = true;
                x1Var.a(this, e73.a);
                return;
            }
            vs.k("Signal is already attached to future");
            return;
        }
        vs.k("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (!this.c && (z = this.d)) {
            this.c = true;
            if (this.b && !z) {
                nae.s(Thread.currentThread());
                return;
            }
            return;
        }
        nae.t().post(t51.d);
    }
}
