package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv5  reason: default package */
/* loaded from: classes.dex */
public final class vv5 extends ty6 {
    @Override // defpackage.w27
    public final int F(int i) {
        kw5 u = this.O.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.f((i38) od6Var.c0.e, od6Var.m(), i);
    }

    @Override // defpackage.w27
    public final int J(int i) {
        kw5 u = this.O.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.a((i38) od6Var.c0.e, od6Var.m(), i);
    }

    @Override // defpackage.w27
    public final mw8 M(long j) {
        E0(j);
        i38 i38Var = this.O;
        gw7 z = i38Var.O.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            xy6 xy6Var = ((od6) objArr[i2]).d0.q;
            xy6Var.getClass();
            xy6Var.F = md6.c;
        }
        od6 od6Var = i38Var.O;
        ty6.p1(this, od6Var.T.e(this, od6Var.m(), j));
        return this;
    }

    @Override // defpackage.ry6
    public final int M0(ec ecVar) {
        Boolean bool;
        int i;
        boolean z;
        xy6 xy6Var = this.O.O.d0.q;
        xy6Var.getClass();
        pd6 pd6Var = xy6Var.O;
        if (!xy6Var.G) {
            sd6 sd6Var = xy6Var.f;
            if (sd6Var.d == kd6.b) {
                pd6Var.f = true;
                if (pd6Var.b) {
                    sd6Var.f = true;
                    sd6Var.g = true;
                }
            } else {
                pd6Var.g = true;
            }
        }
        vv5 vv5Var = xy6Var.n().v0;
        if (vv5Var != null) {
            bool = Boolean.valueOf(vv5Var.K);
        } else {
            bool = null;
        }
        vv5 vv5Var2 = xy6Var.n().v0;
        if (vv5Var2 != null) {
            vv5Var2.K = true;
        }
        xy6Var.d0();
        vv5 vv5Var3 = xy6Var.n().v0;
        if (vv5Var3 != null) {
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            vv5Var3.K = z;
        }
        Integer num = (Integer) pd6Var.i.get(ecVar);
        if (num != null) {
            i = num.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        this.T.g(i, ecVar);
        return i;
    }

    @Override // defpackage.w27
    public final int j(int i) {
        kw5 u = this.O.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.g((i38) od6Var.c0.e, od6Var.m(), i);
    }

    @Override // defpackage.w27
    public final int n0(int i) {
        kw5 u = this.O.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.i((i38) od6Var.c0.e, od6Var.m(), i);
    }

    @Override // defpackage.ty6
    public final void v1() {
        xy6 xy6Var = this.O.O.d0.q;
        xy6Var.getClass();
        xy6Var.S0();
    }
}
