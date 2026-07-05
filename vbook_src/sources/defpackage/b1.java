package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b1  reason: default package */
/* loaded from: classes3.dex */
public abstract class b1 extends l36 implements m42, m82 {
    public final d82 e;

    public b1(d82 d82Var, boolean z) {
        super(z);
        L((w26) d82Var.get(r0f.I));
        this.e = d82Var.plus(this);
    }

    @Override // defpackage.l36
    public final void K(gt1 gt1Var) {
        c16.p(this.e, gt1Var);
    }

    @Override // defpackage.l36
    public final void X(Object obj) {
        if (obj instanceof ft1) {
            ft1 ft1Var = (ft1) obj;
            Throwable th = ft1Var.a;
            boolean z = true;
            if (ft1.b.get(ft1Var) != 1) {
                z = false;
            }
            o0(th, z);
            return;
        }
        q0(obj);
    }

    @Override // defpackage.m42
    public final d82 getContext() {
        return this.e;
    }

    @Override // defpackage.m82
    public final d82 q() {
        return this.e;
    }

    public final void r0(p82 p82Var, b1 b1Var, lu4 lu4Var) {
        Object invoke;
        int ordinal = p82Var.ordinal();
        pvc pvcVar = pvc.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            d82 d82Var = this.e;
                            Object c = a7c.c(d82Var, null);
                            if (!(lu4Var instanceof hh0)) {
                                invoke = w92.z(lu4Var, b1Var, this);
                            } else {
                                jsc.u(2, lu4Var);
                                invoke = lu4Var.invoke(b1Var, this);
                            }
                            a7c.a(d82Var, c);
                            if (invoke != n82.a) {
                                resumeWith(invoke);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (th instanceof sa3) {
                                th = ((sa3) th).a;
                            }
                            resumeWith(hre.i(th));
                            return;
                        }
                    }
                    xk5.o();
                    return;
                }
                lu4Var.getClass();
                w92.t(w92.q(b1Var, this, lu4Var)).resumeWith(pvcVar);
                return;
            }
            return;
        }
        try {
            ua3.a(w92.t(w92.q(b1Var, this, lu4Var)), pvcVar);
        } catch (Throwable th2) {
            ube.w(this, th2);
            throw null;
        }
    }

    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        Throwable a = hs9.a(obj);
        if (a != null) {
            obj = new ft1(a, false);
        }
        Object R = R(obj);
        if (R == m36.b) {
            return;
        }
        p(R);
    }

    @Override // defpackage.l36
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void q0(Object obj) {
    }

    public void o0(Throwable th, boolean z) {
    }
}
