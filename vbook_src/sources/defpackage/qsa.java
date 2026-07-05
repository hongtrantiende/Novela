package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qsa  reason: default package */
/* loaded from: classes3.dex */
public final class qsa implements s11 {
    public final ly0 b;
    private volatile fk1 closed;

    public qsa(ly0 ly0Var) {
        this.b = ly0Var;
    }

    @Override // defpackage.s11, defpackage.f31
    public final void a(Throwable th) {
        if (this.closed != null) {
            return;
        }
        this.closed = new fk1(new IOException((th == null || (r2 = th.getMessage()) == null) ? "Channel was cancelled" : "Channel was cancelled", th));
    }

    @Override // defpackage.s11, defpackage.f31
    public final Throwable b() {
        Throwable th;
        fk1 fk1Var = this.closed;
        if (fk1Var != null && (th = fk1Var.a) != null) {
            if (th instanceof c72) {
                return ((c72) th).a();
            }
            if (th instanceof CancellationException) {
                return nye.b(((CancellationException) th).getMessage(), fk1Var.a);
            }
            return new ik1(th);
        }
        return null;
    }

    @Override // defpackage.s11
    public final Object e(int i, n42 n42Var) {
        Throwable b = b();
        if (b == null) {
            return Boolean.valueOf(this.b.request(i));
        }
        throw b;
    }

    @Override // defpackage.s11
    public final ly0 h() {
        Throwable b = b();
        if (b == null) {
            return this.b;
        }
        throw b;
    }

    @Override // defpackage.s11
    public final boolean i() {
        return this.b.k();
    }
}
