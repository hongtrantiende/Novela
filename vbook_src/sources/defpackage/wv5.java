package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wv5  reason: default package */
/* loaded from: classes.dex */
public final class wv5 extends i38 {
    public static final ljc w0;
    public final hkb u0;
    public vv5 v0;

    static {
        ljc c = lre.c();
        int i = zl1.j;
        c.p(zl1.f);
        c.w(1.0f);
        c.x(1);
        w0 = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, hkb] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ty6] */
    public wv5(od6 od6Var) {
        super(od6Var);
        vv5 vv5Var;
        ?? mq7Var = new mq7();
        mq7Var.d = 0;
        this.u0 = mq7Var;
        mq7Var.D = this;
        if (od6Var.E != null) {
            vv5Var = new ty6(this);
        } else {
            vv5Var = null;
        }
        this.v0 = vv5Var;
    }

    @Override // defpackage.i38
    public final ty6 C1() {
        return this.v0;
    }

    @Override // defpackage.i38
    public final mq7 E1() {
        return this.u0;
    }

    @Override // defpackage.w27
    public final int F(int i) {
        kw5 u = this.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.f((i38) od6Var.c0.e, od6Var.n(), i);
    }

    @Override // defpackage.w27
    public final int J(int i) {
        kw5 u = this.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.a((i38) od6Var.c0.e, od6Var.n(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.i38
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K1(defpackage.e38 r12, long r13, defpackage.a75 r15, int r16, boolean r17) {
        /*
            r11 = this;
            od6 r0 = r11.O
            boolean r1 = r12.h(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.f2(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.D1()
            float r11 = r11.w1(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.c
            gw7 r0 = r0.y()
            java.lang.Object[] r1 = r0.a
            int r0 = r0.c
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            od6 r5 = (defpackage.od6) r5
            boolean r2 = r5.K()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.e(r5, r6, r8, r9, r10)
            long r2 = r15.a()
            float r6 = defpackage.rqe.j(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = defpackage.rqe.l(r2)
            if (r6 == 0) goto L73
            boolean r2 = defpackage.rqe.k(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.f(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.c = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv5.K1(e38, long, a75, int, boolean):void");
    }

    @Override // defpackage.w27
    public final mw8 M(long j) {
        if (this.Q) {
            vv5 vv5Var = this.v0;
            vv5Var.getClass();
            j = vv5Var.d;
        }
        E0(j);
        od6 od6Var = this.O;
        gw7 z = od6Var.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((od6) objArr[i2]).d0.p.H = md6.c;
        }
        X1(od6Var.T.e(this, od6Var.n(), j));
        O1();
        return this;
    }

    @Override // defpackage.ry6
    public final int M0(ec ecVar) {
        vv5 vv5Var = this.v0;
        if (vv5Var != null) {
            return vv5Var.M0(ecVar);
        }
        a37 a37Var = this.O.d0.p;
        pd6 pd6Var = a37Var.U;
        if (!a37Var.I) {
            if (a37Var.f.d == kd6.a) {
                pd6Var.f = true;
                if (pd6Var.b) {
                    a37Var.S = true;
                    a37Var.T = true;
                }
            } else {
                pd6Var.g = true;
            }
        }
        wv5 n = a37Var.n();
        boolean z = n.K;
        n.K = true;
        a37Var.d0();
        n.K = z;
        Integer num = (Integer) pd6Var.i.get(ecVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.i38
    public final void T1(k61 k61Var, p15 p15Var) {
        od6 od6Var = this.O;
        wg8 a = rd6.a(od6Var);
        gw7 y = od6Var.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            if (od6Var2.K()) {
                od6Var2.j(k61Var, p15Var);
            }
        }
        if (((rg) a).getShowLayoutBounds()) {
            long j = this.c;
            k61Var.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, w0);
        }
    }

    @Override // defpackage.w27
    public final int j(int i) {
        kw5 u = this.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.g((i38) od6Var.c0.e, od6Var.n(), i);
    }

    @Override // defpackage.w27
    public final int n0(int i) {
        kw5 u = this.O.u();
        b37 t = u.t();
        od6 od6Var = (od6) u.b;
        return t.i((i38) od6Var.c0.e, od6Var.n(), i);
    }

    @Override // defpackage.mw8
    public final void x0(long j, float f, xt4 xt4Var) {
        if (this.P) {
            ty6 C1 = C1();
            C1.getClass();
            U1(C1.P, f, xt4Var, null);
        } else {
            U1(j, f, xt4Var, null);
        }
        if (this.J) {
            return;
        }
        this.O.d0.p.P0();
    }

    @Override // defpackage.i38, defpackage.mw8
    public final void z0(long j, float f, p15 p15Var) {
        wv5 wv5Var;
        if (this.P) {
            ty6 C1 = C1();
            C1.getClass();
            wv5Var = this;
            wv5Var.U1(C1.P, f, null, p15Var);
        } else {
            wv5Var = this;
            wv5Var.U1(j, f, null, p15Var);
        }
        if (wv5Var.J) {
            return;
        }
        wv5Var.O.d0.p.P0();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ty6, vv5] */
    @Override // defpackage.i38
    public final void z1() {
        if (this.v0 == null) {
            this.v0 = new ty6(this);
        }
    }
}
