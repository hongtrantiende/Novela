package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n10  reason: default package */
/* loaded from: classes.dex */
public final class n10 extends vk8 implements bn9 {
    public static final y4 R = new y4(23);
    public em1 D;
    public boolean E;
    public w26 F;
    public m82 H;
    public xt4 J;
    public q10 M;
    public h10 N;
    public final cza O;
    public final cza P;
    public final jj9 Q;
    public final hm8 f = yae.z(null);
    public float C = 1.0f;
    public long G = 9205357640488583168L;
    public xt4 I = R;
    public w22 K = r0f.e;
    public int L = 1;

    public n10(h10 h10Var) {
        this.N = h10Var;
        this.O = dza.a(h10Var);
        cza a = dza.a(i10.a);
        this.P = a;
        this.Q = z1d.q(a);
    }

    public static final jp5 j(n10 n10Var, jp5 jp5Var, boolean z) {
        hz9 hz9Var;
        fp5 a = jp5.a(jp5Var);
        a.d = new s6f(jp5Var, n10Var);
        hp5 hp5Var = jp5Var.s;
        if (hp5Var.i == null) {
            a.n = una.p;
        }
        if (hp5Var.j == null) {
            w22 w22Var = n10Var.K;
            int i = j2d.b;
            if (!c16.i(w22Var, r0f.e) && !c16.i(w22Var, r0f.D)) {
                hz9Var = hz9.a;
            } else {
                hz9Var = hz9.b;
            }
            a.o = hz9Var;
        }
        if (hp5Var.k == null) {
            a.p = z29.b;
        }
        if (z) {
            gs3 gs3Var = gs3.a;
            a.f = gs3Var;
            a.g = gs3Var;
            a.h = gs3Var;
        }
        return a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.n10 r3, defpackage.m10 r4) {
        /*
            cza r0 = r3.P
            java.lang.Object r1 = r0.getValue()
            m10 r1 = (defpackage.m10) r1
            xt4 r2 = r3.I
            java.lang.Object r4 = r2.invoke(r4)
            m10 r4 = (defpackage.m10) r4
            r0.m(r4)
            boolean r0 = r4 instanceof defpackage.l10
            if (r0 == 0) goto L1d
            r0 = r4
            l10 r0 = (defpackage.l10) r0
            t8b r0 = r0.b
            goto L26
        L1d:
            boolean r0 = r4 instanceof defpackage.j10
            if (r0 == 0) goto L35
            r0 = r4
            j10 r0 = (defpackage.j10) r0
            tw3 r0 = r0.b
        L26:
            jp5 r0 = r0.a()
            u4 r2 = defpackage.op5.a
            java.lang.Object r0 = defpackage.fca.j(r0, r2)
            c48 r0 = (defpackage.c48) r0
            r0.getClass()
        L35:
            vk8 r0 = r4.a()
            hm8 r2 = r3.f
            r2.setValue(r0)
            vk8 r0 = r1.a()
            vk8 r2 = r4.a()
            if (r0 == r2) goto L6a
            vk8 r0 = r1.a()
            boolean r1 = r0 instanceof defpackage.bn9
            r2 = 0
            if (r1 == 0) goto L54
            bn9 r0 = (defpackage.bn9) r0
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 == 0) goto L5a
            r0.b()
        L5a:
            vk8 r0 = r4.a()
            boolean r1 = r0 instanceof defpackage.bn9
            if (r1 == 0) goto L65
            r2 = r0
            bn9 r2 = (defpackage.bn9) r2
        L65:
            if (r2 == 0) goto L6a
            r2.c()
        L6a:
            xt4 r3 = r3.J
            if (r3 == 0) goto L71
            r3.invoke(r4)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n10.k(n10, m10):void");
    }

    @Override // defpackage.bn9
    public final void a() {
        w26 w26Var = this.F;
        bn9 bn9Var = null;
        if (w26Var != null) {
            w26Var.cancel(null);
        }
        this.F = null;
        vk8 l = l();
        if (l instanceof bn9) {
            bn9Var = (bn9) l;
        }
        if (bn9Var != null) {
            bn9Var.a();
        }
        this.E = false;
    }

    @Override // defpackage.bn9
    public final void b() {
        w26 w26Var = this.F;
        bn9 bn9Var = null;
        if (w26Var != null) {
            w26Var.cancel(null);
        }
        this.F = null;
        vk8 l = l();
        if (l instanceof bn9) {
            bn9Var = (bn9) l;
        }
        if (bn9Var != null) {
            bn9Var.b();
        }
        this.E = false;
    }

    @Override // defpackage.bn9
    public final void c() {
        bn9 bn9Var;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            vk8 l = l();
            if (l instanceof bn9) {
                bn9Var = (bn9) l;
            } else {
                bn9Var = null;
            }
            if (bn9Var != null) {
                bn9Var.c();
            }
            m();
            this.E = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.vk8
    public final boolean d(float f) {
        this.C = f;
        return true;
    }

    @Override // defpackage.vk8
    public final boolean e(em1 em1Var) {
        this.D = em1Var;
        return true;
    }

    @Override // defpackage.vk8
    public final long h() {
        vk8 l = l();
        if (l != null) {
            return l.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.vk8
    public final void i(ak3 ak3Var) {
        long b = ak3Var.b();
        if (!dna.a(this.G, b)) {
            this.G = b;
        }
        vk8 l = l();
        if (l != null) {
            l.g(ak3Var, ak3Var.b(), this.C, this.D);
        }
    }

    public final vk8 l() {
        return (vk8) this.f.getValue();
    }

    public final void m() {
        f82 f82Var;
        iya u;
        h10 h10Var = this.N;
        if (h10Var == null) {
            return;
        }
        m82 m82Var = this.H;
        if (m82Var != null) {
            n0 n0Var = new n0(this, h10Var, null, 9);
            d82 q = m82Var.q();
            int i = j2d.b;
            b82 b82Var = q.get(abf.d);
            if (b82Var instanceof f82) {
                f82Var = (f82) b82Var;
            } else {
                f82Var = null;
            }
            p82 p82Var = p82.d;
            if (f82Var != null && !f82Var.equals(ab3.b)) {
                u = z87.u(k27.a(new iz2(m82Var.q())), new jz2(f82Var), p82Var, n0Var);
            } else {
                u = z87.u(m82Var, ab3.b, p82Var, n0Var);
            }
            w26 w26Var = this.F;
            if (w26Var != null) {
                w26Var.cancel(null);
            }
            this.F = u;
            return;
        }
        c16.w("scope");
        throw null;
    }

    public final void n(h10 h10Var) {
        if (!c16.i(this.N, h10Var)) {
            this.N = h10Var;
            if (h10Var == null) {
                w26 w26Var = this.F;
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
                this.F = null;
            } else if (this.E) {
                m();
            }
            if (h10Var != null) {
                cza czaVar = this.O;
                czaVar.getClass();
                czaVar.n(null, h10Var);
            }
        }
    }
}
