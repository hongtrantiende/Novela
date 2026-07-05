package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: td6  reason: default package */
/* loaded from: classes.dex */
public final class td6 implements p6b, e37 {
    public final /* synthetic */ wd6 a;
    public final /* synthetic */ be6 b;

    public td6(be6 be6Var) {
        this.b = be6Var;
        this.a = be6Var.D;
    }

    @Override // defpackage.r13
    public final float B0(float f) {
        return f / this.a.f();
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.a.c;
    }

    @Override // defpackage.u06
    public final boolean I0() {
        return this.a.I0();
    }

    @Override // defpackage.r13
    public final float L0(float f) {
        return this.a.f() * f;
    }

    @Override // defpackage.r13
    public final long P(float f) {
        return this.a.P(f);
    }

    @Override // defpackage.r13
    public final long Q(long j) {
        return this.a.Q(j);
    }

    @Override // defpackage.e37
    public final c37 W0(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2) {
        return this.a.W0(i, i2, map, xt4Var, xt4Var2);
    }

    @Override // defpackage.r13
    public final int X0(float f) {
        return this.a.X0(f);
    }

    @Override // defpackage.r13
    public final float c0(long j) {
        return this.a.c0(j);
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a.b;
    }

    @Override // defpackage.r13
    public final long f1(long j) {
        return this.a.f1(j);
    }

    @Override // defpackage.u06
    public final tc6 getLayoutDirection() {
        return this.a.a;
    }

    @Override // defpackage.e37
    public final c37 i0(int i, int i2, jc jcVar, y0 y0Var, Map map, dg dgVar) {
        return this.a.i0(i, i2, jcVar, y0Var, map, dgVar);
    }

    @Override // defpackage.p6b
    public final List j0(Object obj, lu4 lu4Var) {
        ud6 ud6Var;
        be6 be6Var = this.b;
        od6 od6Var = be6Var.a;
        tv7 tv7Var = be6Var.C;
        od6 od6Var2 = (od6) tv7Var.g(obj);
        if (od6Var2 != null && ((gw7) ((iv7) od6Var.p()).b).i(od6Var2) < be6Var.d) {
            return od6Var2.n();
        }
        tv7 tv7Var2 = be6Var.H;
        tv7 tv7Var3 = be6Var.F;
        gw7 gw7Var = be6Var.I;
        if (gw7Var.c < be6Var.e) {
            lv5.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        od6 od6Var3 = (od6) tv7Var.g(obj);
        int i = gw7Var.c;
        int i2 = be6Var.e;
        if (i == i2) {
            gw7Var.b(obj);
        } else {
            Object[] objArr = gw7Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        be6Var.e++;
        boolean b = tv7Var3.b(obj);
        if (!b && od6Var3 == null) {
            be6Var.l(obj, lu4Var, false);
            tv7Var2.n(obj, be6Var.f(obj));
        } else {
            if (!b && od6Var3 != null) {
                be6Var.k(((gw7) ((iv7) od6Var.p()).b).i(od6Var3), ((gw7) ((iv7) od6Var.p()).b).c);
                be6Var.K++;
                tv7Var.l(obj);
                tv7Var3.n(obj, od6Var3);
                tv7Var2.n(obj, be6Var.f(obj));
                if (od6Var.J()) {
                    be6Var.i();
                }
            }
            od6 od6Var4 = (od6) tv7Var3.g(obj);
            qo8 qo8Var = null;
            if (od6Var4 != null) {
                ud6Var = (ud6) be6Var.f.g(od6Var4);
            } else {
                ud6Var = null;
            }
            if (ud6Var != null && ud6Var.d) {
                be6Var.n(od6Var4, obj, false, lu4Var);
            }
            if (ud6Var != null) {
                qo8Var = ud6Var.f;
            }
            if (qo8Var != null) {
                be6Var.d(ud6Var, true);
            }
        }
        od6 od6Var5 = (od6) tv7Var3.g(obj);
        if (od6Var5 != null) {
            List H0 = od6Var5.d0.p.H0();
            iv7 iv7Var = (iv7) H0;
            int i3 = ((gw7) iv7Var.b).c;
            for (int i4 = 0; i4 < i3; i4++) {
                ((a37) iv7Var.get(i4)).f.b = true;
            }
            return H0;
        }
        return ks3.a;
    }

    @Override // defpackage.r13
    public final float k1(long j) {
        return this.a.k1(j);
    }

    @Override // defpackage.r13
    public final long p0(int i) {
        return this.a.p0(i);
    }

    @Override // defpackage.e37
    public final c37 q0(int i, int i2, Map map, xt4 xt4Var) {
        return this.a.W0(i, i2, map, null, xt4Var);
    }

    @Override // defpackage.r13
    public final long r0(float f) {
        return this.a.r0(f);
    }

    @Override // defpackage.r13
    public final float y0(int i) {
        return this.a.y0(i);
    }
}
