package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y27  reason: default package */
/* loaded from: classes.dex */
public final class y27 {
    public final od6 a;
    public boolean c;
    public boolean d;
    public x02 i;
    public final ij1 b = new ij1(24);
    public final eb5 e = new eb5(13);
    public final gw7 f = new gw7(new od6[16], 0);
    public final long g = 1;
    public final gw7 h = new gw7(new x27[16], 0);

    public y27(od6 od6Var) {
        this.a = od6Var;
    }

    public static final boolean a(y27 y27Var, od6 od6Var, boolean z) {
        x02 x02Var;
        boolean z2;
        lw8 placementScope;
        wv5 wv5Var;
        od6 v;
        od6 od6Var2 = y27Var.a;
        boolean z3 = od6Var.n0;
        sd6 sd6Var = od6Var.d0;
        boolean z4 = false;
        if (!z3 && l(od6Var)) {
            if (od6Var == od6Var2) {
                x02Var = y27Var.i;
                x02Var.getClass();
            } else {
                x02Var = null;
            }
            if (z) {
                if (sd6Var.e) {
                    z4 = d(od6Var, x02Var);
                }
                if ((z4 || sd6Var.f) && c16.i(od6Var.L(), Boolean.TRUE)) {
                    od6Var.M();
                }
            } else {
                if (od6Var.r()) {
                    z2 = e(od6Var, x02Var);
                } else {
                    z2 = false;
                }
                if (od6Var.q() && (od6Var == od6Var2 || ((v = od6Var.v()) != null && v.K() && sd6Var.p.Q))) {
                    if (od6Var == od6Var2) {
                        if (od6Var.Z == md6.c) {
                            od6Var.f();
                        }
                        od6 v2 = od6Var.v();
                        if (v2 == null || (wv5Var = (wv5) v2.c0.d) == null || (placementScope = wv5Var.L) == null) {
                            placementScope = ((rg) rd6.a(od6Var)).getPlacementScope();
                        }
                        lw8.z(placementScope, sd6Var.p, 0, 0);
                    } else {
                        od6Var.W();
                    }
                    eb5 eb5Var = y27Var.e;
                    eb5Var.getClass();
                    if (od6Var.m0 > 0) {
                        ((gw7) eb5Var.b).b(od6Var);
                        od6Var.l0 = true;
                    }
                }
                z4 = z2;
            }
            y27Var.f();
        }
        return z4;
    }

    public static boolean d(od6 od6Var, x02 x02Var) {
        x02 x02Var2;
        boolean U0;
        od6 od6Var2 = od6Var.E;
        sd6 sd6Var = od6Var.d0;
        if (od6Var2 == null) {
            return false;
        }
        if (x02Var != null) {
            if (od6Var2 != null) {
                xy6 xy6Var = sd6Var.q;
                xy6Var.getClass();
                U0 = xy6Var.U0(x02Var.a);
            }
            U0 = false;
        } else {
            xy6 xy6Var2 = sd6Var.q;
            if (xy6Var2 != null) {
                x02Var2 = xy6Var2.J;
            } else {
                x02Var2 = null;
            }
            if (x02Var2 != null && od6Var2 != null) {
                xy6Var2.getClass();
                U0 = xy6Var2.U0(x02Var2.a);
            }
            U0 = false;
        }
        od6 v = od6Var.v();
        if (U0 && v != null) {
            if (v.E == null) {
                od6.a0(v, false, 3);
                return U0;
            } else if (od6Var.t() == md6.a) {
                od6.Y(v, false, 3);
                return U0;
            } else if (od6Var.t() == md6.b) {
                v.X(false);
            }
        }
        return U0;
    }

    public static boolean e(od6 od6Var, x02 x02Var) {
        boolean S;
        if (x02Var != null) {
            S = od6Var.R(x02Var);
        } else {
            S = od6.S(od6Var);
        }
        od6 v = od6Var.v();
        if (S && v != null) {
            if (od6Var.s() == md6.a) {
                od6.a0(v, false, 3);
                return S;
            } else if (od6Var.s() == md6.b) {
                v.Z(false);
            }
        }
        return S;
    }

    public static boolean j(od6 od6Var) {
        xy6 xy6Var;
        pd6 pd6Var;
        if (od6Var.d0.e) {
            if (od6Var.t() != md6.c || ((xy6Var = od6Var.d0.q) != null && (pd6Var = xy6Var.O) != null && pd6Var.e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean k(od6 od6Var) {
        kd6 kd6Var;
        if (od6Var.r()) {
            do {
                if (od6Var.s() == md6.c && !od6Var.d0.p.U.e()) {
                    od6 v = od6Var.v();
                    if (v != null) {
                        kd6Var = v.d0.d;
                    } else {
                        kd6Var = null;
                    }
                    if (kd6Var != kd6.a) {
                        return false;
                    }
                }
                od6Var = od6Var.v();
                if (od6Var == null) {
                    return false;
                }
            } while (!od6Var.K());
            return true;
        }
        return false;
    }

    public static boolean l(od6 od6Var) {
        xy6 xy6Var;
        pd6 pd6Var;
        sd6 sd6Var = od6Var.d0;
        if (od6Var.K() || sd6Var.p.Q || k(od6Var) || c16.i(od6Var.L(), Boolean.TRUE) || j(od6Var) || sd6Var.p.U.e() || ((xy6Var = sd6Var.q) != null && (pd6Var = xy6Var.O) != null && pd6Var.e())) {
            return true;
        }
        return false;
    }

    public final void b() {
        mq7 mq7Var;
        gw7 gw7Var = this.f;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            kn knVar = ((od6) objArr[i2]).c0;
            wv5 wv5Var = (wv5) knVar.d;
            boolean g = o38.g(4194304);
            if (g) {
                mq7Var = wv5Var.u0;
            } else {
                mq7Var = wv5Var.u0.e;
                if (mq7Var == null) {
                }
            }
            qs9 qs9Var = i38.p0;
            for (mq7 G1 = wv5Var.G1(g); G1 != null && (G1.d & 4194304) != 0; G1 = G1.f) {
                if ((G1.c & 4194304) != 0) {
                    mq7 mq7Var2 = G1;
                    gw7 gw7Var2 = null;
                    while (mq7Var2 != null) {
                        if (mq7Var2 instanceof oc6) {
                            ((oc6) mq7Var2).L((wv5) knVar.d);
                        } else if ((mq7Var2.c & 4194304) != 0 && (mq7Var2 instanceof m03)) {
                            int i3 = 0;
                            for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                if ((mq7Var3.c & 4194304) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        mq7Var2 = mq7Var3;
                                    } else {
                                        if (gw7Var2 == null) {
                                            gw7Var2 = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var2 != null) {
                                            gw7Var2.b(mq7Var2);
                                            mq7Var2 = null;
                                        }
                                        gw7Var2.b(mq7Var3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        mq7Var2 = voe.h(gw7Var2);
                    }
                }
                if (G1 != mq7Var) {
                }
            }
        }
        gw7Var.g();
    }

    public final void c(boolean z) {
        eb5 eb5Var = this.e;
        if (z) {
            gw7 gw7Var = (gw7) eb5Var.b;
            od6 od6Var = this.a;
            if (od6Var.m0 > 0) {
                gw7Var.g();
                gw7Var.b(od6Var);
                od6Var.l0 = true;
            }
        }
        if (((gw7) eb5Var.b).c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                eb5Var.l();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void f() {
        gw7 gw7Var = this.h;
        int i = gw7Var.c;
        if (i != 0) {
            Object[] objArr = gw7Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                x27 x27Var = (x27) objArr[i2];
                if (x27Var.a.J()) {
                    boolean z = x27Var.b;
                    od6 od6Var = x27Var.a;
                    boolean z2 = x27Var.c;
                    if (!z) {
                        od6.a0(od6Var, z2, 2);
                    } else {
                        od6.Y(od6Var, z2, 2);
                    }
                }
            }
            gw7Var.g();
        }
    }

    public final void g(od6 od6Var) {
        gw7 z = od6Var.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            if (c16.i(od6Var2.L(), Boolean.TRUE) && !od6Var2.n0) {
                if (this.b.q(od6Var2)) {
                    od6Var2.M();
                }
                g(od6Var2);
            }
        }
    }

    public final void h(od6 od6Var, boolean z) {
        boolean r;
        if (!this.c) {
            lv5.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z) {
            r = od6Var.d0.e;
        } else {
            r = od6Var.r();
        }
        if (r) {
            lv5.a("node not yet measured");
        }
        i(od6Var, z);
    }

    public final void i(od6 od6Var, boolean z) {
        boolean r;
        xy6 xy6Var;
        pd6 pd6Var;
        boolean r2;
        boolean r3;
        gw7 z2 = od6Var.z();
        Object[] objArr = z2.a;
        int i = z2.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            md6 md6Var = md6.a;
            if ((!z && (od6Var2.s() == md6Var || od6Var2.d0.p.U.e())) || (z && (od6Var2.t() == md6Var || ((xy6Var = od6Var2.d0.q) != null && (pd6Var = xy6Var.O) != null && pd6Var.e())))) {
                boolean F = xbe.F(od6Var2);
                sd6 sd6Var = od6Var2.d0;
                if (F && !z) {
                    if (sd6Var.e && this.b.q(od6Var2)) {
                        p(od6Var2, true);
                    } else {
                        h(od6Var2, true);
                    }
                }
                if (z) {
                    r2 = sd6Var.e;
                } else {
                    r2 = od6Var2.r();
                }
                if (r2) {
                    p(od6Var2, z);
                }
                if (z) {
                    r3 = sd6Var.e;
                } else {
                    r3 = od6Var2.r();
                }
                if (!r3) {
                    i(od6Var2, z);
                }
            }
        }
        if (z) {
            r = od6Var.d0.e;
        } else {
            r = od6Var.r();
        }
        if (r) {
            p(od6Var, z);
        }
    }

    public final boolean m(vt4 vt4Var) {
        boolean z;
        boolean z2;
        od6 od6Var;
        boolean z3;
        boolean p;
        ij1 ij1Var = this.b;
        od6 od6Var2 = this.a;
        if (!od6Var2.J()) {
            lv5.a("performMeasureAndLayout called with unattached root");
        }
        if (!od6Var2.K()) {
            lv5.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            lv5.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean P = ij1Var.P();
                uwd uwdVar = (uwd) ij1Var.b;
                if (P) {
                    z = false;
                    while (true) {
                        uwd uwdVar2 = (uwd) ij1Var.d;
                        uwd uwdVar3 = (uwd) ij1Var.c;
                        if (!((msa) uwdVar.b).isEmpty()) {
                            od6Var = (od6) ((msa) uwdVar.b).first();
                            uwdVar.y(od6Var);
                            if (od6Var.E != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = false;
                        } else if (!((msa) uwdVar3.b).isEmpty()) {
                            od6Var = (od6) ((msa) uwdVar3.b).first();
                            uwdVar3.y(od6Var);
                            if (od6Var.E != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = true;
                        } else if (((msa) uwdVar2.b).isEmpty()) {
                            break;
                        } else {
                            od6 od6Var3 = (od6) ((msa) uwdVar2.b).first();
                            uwdVar2.y(od6Var3);
                            z2 = true;
                            od6Var = od6Var3;
                            z3 = false;
                        }
                        if (z2) {
                            p = a(this, od6Var, z3);
                        } else {
                            p = p(od6Var, z3);
                            if (od6Var.d0.f) {
                                ij1Var.a(od6Var, s16.b);
                            }
                            if (od6Var.q()) {
                                ij1Var.a(od6Var, s16.d);
                            }
                        }
                        if (od6Var == od6Var2 && p) {
                            z = true;
                        }
                    }
                    if (vt4Var != null) {
                        vt4Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z4 = z;
            } finally {
            }
        }
        b();
        return z4;
    }

    public final void n(od6 od6Var, long j) {
        if (od6Var.n0) {
            return;
        }
        od6 od6Var2 = this.a;
        if (od6Var == od6Var2) {
            lv5.a("measureAndLayout called on root");
        }
        if (!od6Var2.J()) {
            lv5.a("performMeasureAndLayout called with unattached root");
        }
        if (!od6Var2.K()) {
            lv5.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            lv5.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                ij1 ij1Var = this.b;
                ((uwd) ij1Var.b).y(od6Var);
                ((uwd) ij1Var.c).y(od6Var);
                ((uwd) ij1Var.d).y(od6Var);
                if ((d(od6Var, new x02(j)) || od6Var.d0.f) && c16.i(od6Var.L(), Boolean.TRUE)) {
                    od6Var.M();
                }
                g(od6Var);
                e(od6Var, new x02(j));
                if (od6Var.q() && od6Var.K()) {
                    od6Var.W();
                    eb5 eb5Var = this.e;
                    eb5Var.getClass();
                    if (od6Var.m0 > 0) {
                        ((gw7) eb5Var.b).b(od6Var);
                        od6Var.l0 = true;
                    }
                }
                f();
            } finally {
            }
        }
        b();
    }

    public final void o() {
        boolean z;
        ij1 ij1Var = this.b;
        if (ij1Var.P()) {
            od6 od6Var = this.a;
            if (!od6Var.J()) {
                lv5.a("performMeasureAndLayout called with unattached root");
            }
            if (!od6Var.K()) {
                lv5.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                lv5.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((msa) ((uwd) ij1Var.d).b).isEmpty() && !((msa) ((uwd) ij1Var.b).b).isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (od6Var.E != null) {
                            r(od6Var, true);
                        } else {
                            q(od6Var);
                        }
                    }
                    r(od6Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean p(od6 od6Var, boolean z) {
        x02 x02Var;
        boolean z2 = false;
        if (!od6Var.n0 && l(od6Var)) {
            if (od6Var == this.a) {
                x02Var = this.i;
                x02Var.getClass();
            } else {
                x02Var = null;
            }
            if (z) {
                if (od6Var.d0.e) {
                    z2 = d(od6Var, x02Var);
                }
            } else if (od6Var.r()) {
                z2 = e(od6Var, x02Var);
            }
            f();
        }
        return z2;
    }

    public final void q(od6 od6Var) {
        gw7 z = od6Var.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            if (od6Var2.s() == md6.a || od6Var2.d0.p.U.e()) {
                if (xbe.F(od6Var2)) {
                    r(od6Var2, true);
                } else {
                    q(od6Var2);
                }
            }
        }
    }

    public final void r(od6 od6Var, boolean z) {
        x02 x02Var;
        if (od6Var.n0) {
            return;
        }
        if (od6Var == this.a) {
            x02Var = this.i;
            x02Var.getClass();
        } else {
            x02Var = null;
        }
        if (z) {
            d(od6Var, x02Var);
        } else {
            e(od6Var, x02Var);
        }
    }

    public final boolean s(od6 od6Var, boolean z) {
        int ordinal = od6Var.d0.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    if (!od6Var.r() || z) {
                        od6Var.d0.p.R = true;
                        if (!od6Var.n0 && (od6Var.K() || k(od6Var))) {
                            od6 v = od6Var.v();
                            if (v == null || !v.r()) {
                                this.b.a(od6Var, s16.c);
                            }
                            if (!this.d) {
                                return true;
                            }
                        }
                    }
                } else {
                    xk5.o();
                    return false;
                }
            } else {
                this.h.b(new x27(od6Var, false, z));
            }
        }
        return false;
    }

    public final void t(long j) {
        boolean c;
        s16 s16Var;
        x02 x02Var = this.i;
        if (x02Var == null) {
            c = false;
        } else {
            c = x02.c(x02Var.a, j);
        }
        if (!c) {
            if (this.c) {
                lv5.a("updateRootConstraints called while measuring");
            }
            this.i = new x02(j);
            od6 od6Var = this.a;
            boolean J = od6Var.J();
            sd6 sd6Var = od6Var.d0;
            if (J) {
                od6 od6Var2 = od6Var.E;
                if (od6Var2 != null) {
                    sd6Var.e = true;
                }
                sd6Var.p.R = true;
                if (od6Var2 != null) {
                    s16Var = s16.a;
                } else {
                    s16Var = s16.c;
                }
                this.b.a(od6Var, s16Var);
            }
        }
    }
}
