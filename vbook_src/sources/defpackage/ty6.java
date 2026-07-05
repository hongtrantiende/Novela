package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty6  reason: default package */
/* loaded from: classes.dex */
public abstract class ty6 extends ry6 implements w27 {
    public final i38 O;
    public LinkedHashMap Q;
    public c37 S;
    public final gv7 T;
    public long P = 0;
    public final uy6 R = new uy6(this);

    public ty6(i38 i38Var) {
        this.O = i38Var;
        gv7 gv7Var = h78.a;
        this.T = new gv7();
    }

    public static final void p1(ty6 ty6Var, c37 c37Var) {
        LinkedHashMap linkedHashMap;
        if (c37Var != null) {
            ty6Var.A0((c37Var.d() & 4294967295L) | (c37Var.e() << 32));
        } else {
            ty6Var.A0(0L);
        }
        if (!c16.i(ty6Var.S, c37Var) && c37Var != null && ((((linkedHashMap = ty6Var.Q) != null && !linkedHashMap.isEmpty()) || !c37Var.g().isEmpty()) && !c16.i(c37Var.g(), ty6Var.Q))) {
            xy6 xy6Var = ty6Var.O.O.d0.q;
            xy6Var.getClass();
            xy6Var.O.f();
            LinkedHashMap linkedHashMap2 = ty6Var.Q;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                ty6Var.Q = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(c37Var.g());
        }
        ty6Var.S = c37Var;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.O.G0();
    }

    @Override // defpackage.ry6, defpackage.u06
    public final boolean I0() {
        return true;
    }

    @Override // defpackage.ry6
    public final ry6 P0() {
        i38 i38Var = this.O.R;
        if (i38Var != null) {
            return i38Var.C1();
        }
        return null;
    }

    @Override // defpackage.mw8, defpackage.w27
    public final Object S() {
        return this.O.S();
    }

    @Override // defpackage.ry6
    public final sc6 S0() {
        return this.R;
    }

    @Override // defpackage.ry6
    public final boolean T0() {
        if (this.S != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ry6
    public final od6 U0() {
        return this.O.O;
    }

    @Override // defpackage.ry6
    public final c37 V0() {
        c37 c37Var = this.S;
        if (c37Var != null) {
            return c37Var;
        }
        throw a82.f("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.ry6
    public final ry6 a1() {
        i38 i38Var = this.O.S;
        if (i38Var != null) {
            return i38Var.C1();
        }
        return null;
    }

    @Override // defpackage.ry6
    public final long d1() {
        return this.P;
    }

    @Override // defpackage.r13
    public final float f() {
        return this.O.f();
    }

    @Override // defpackage.u06
    public final tc6 getLayoutDirection() {
        return this.O.O.W;
    }

    @Override // defpackage.ry6
    public final void m1() {
        x0(this.P, nae.e, null);
    }

    public final long q1() {
        return (this.a << 32) | (this.b & 4294967295L);
    }

    public void v1() {
        V0().a();
    }

    public final void w1(long j) {
        if (!py5.b(this.P, j)) {
            this.P = j;
            i38 i38Var = this.O;
            xy6 xy6Var = i38Var.O.d0.q;
            if (xy6Var != null) {
                xy6Var.O0();
            }
            ry6.j1(i38Var);
        }
        if (!this.K) {
            O0(V0());
        }
    }

    @Override // defpackage.mw8
    public final void x0(long j, float f, xt4 xt4Var) {
        w1(j);
        if (this.J) {
            return;
        }
        v1();
    }

    public final long x1(ty6 ty6Var, boolean z) {
        long j = 0;
        while (!this.equals(ty6Var)) {
            if (!this.H || !z) {
                j = py5.d(j, this.P);
            }
            i38 i38Var = this.O.S;
            i38Var.getClass();
            this = i38Var.C1();
            this.getClass();
        }
        return j;
    }
}
