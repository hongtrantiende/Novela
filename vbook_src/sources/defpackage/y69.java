package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y69  reason: default package */
/* loaded from: classes3.dex */
public final class y69 extends b1 implements ta1, u8a {
    public final xy0 f;

    public y69(d82 d82Var, xy0 xy0Var) {
        super(d82Var, true);
        this.f = xy0Var;
    }

    @Override // defpackage.ta1
    public final t5a b() {
        return this.f.b();
    }

    @Override // defpackage.ta1
    public final t5a c() {
        return this.f.c();
    }

    @Override // defpackage.l36, defpackage.w26
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new x26(this, v(), null);
        }
        t(cancellationException);
    }

    @Override // defpackage.ta1
    public final Object d() {
        return this.f.d();
    }

    @Override // defpackage.u8a
    public final Object e(m42 m42Var, Object obj) {
        return this.f.e(m42Var, obj);
    }

    @Override // defpackage.u8a
    public final boolean f(Throwable th) {
        return this.f.p(th, false);
    }

    @Override // defpackage.ta1
    public final Object i(aab aabVar) {
        xy0 xy0Var = this.f;
        xy0Var.getClass();
        return xy0.L(xy0Var, aabVar);
    }

    @Override // defpackage.ta1
    public final qy0 iterator() {
        xy0 xy0Var = this.f;
        xy0Var.getClass();
        return new qy0(xy0Var);
    }

    @Override // defpackage.u8a
    public final Object j(Object obj) {
        return this.f.j(obj);
    }

    @Override // defpackage.ta1
    public final Object k(co1 co1Var) {
        xy0 xy0Var = this.f;
        xy0Var.getClass();
        return xy0.M(xy0Var, co1Var);
    }

    @Override // defpackage.b1
    public final void o0(Throwable th, boolean z) {
        if (!this.f.p(th, false) && !z) {
            c16.p(this.e, th);
        }
    }

    @Override // defpackage.b1
    public final void q0(Object obj) {
        pvc pvcVar = (pvc) obj;
        this.f.f(null);
    }

    @Override // defpackage.l36
    public final void t(Throwable th) {
        CancellationException f0 = l36.f0(this, th);
        this.f.p(f0, true);
        s(f0);
    }
}
