package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rj8  reason: default package */
/* loaded from: classes.dex */
public abstract class rj8 implements x2a {
    public final aw7 A;
    public final aw7 B;
    public final hm8 C;
    public final hm8 D;
    public final hm8 E;
    public final hm8 F;
    public boolean a;
    public ij8 b;
    public final hm8 c;
    public final wf2 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ww2 k;
    public final boolean l;
    public final hm8 m;
    public r13 n;
    public int o;
    public final yu7 p;
    public final em8 q;
    public final em8 r;
    public final h23 s;
    public final ei6 t;
    public final yi8 u;
    public final mce v;
    public final pe0 w;
    public final hm8 x;
    public final ng6 y;
    public final bi6 z;

    /* JADX WARN: Type inference failed for: r0v5, types: [wf2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, pe0] */
    public rj8(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            ov5.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = yae.z(new y78(0L));
        ?? obj = new Object();
        obj.b = this;
        obj.d = new em8(i);
        obj.e = new dm8(f);
        obj.f = new xh6(i, 30, 100);
        this.d = obj;
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new ww2(new xt4(this) { // from class: mj8
            public final /* synthetic */ rj8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            @Override // defpackage.xt4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mj8.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.l = true;
        this.m = new hm8(uj8.b, r0f.J);
        this.n = uj8.a;
        this.p = new yu7();
        this.q = new em8(-1);
        this.r = new em8(i);
        zj1 zj1Var = zj1.G;
        this.s = yae.r(new yh6(this, 2), zj1Var);
        yae.r(new yh6(this, 3), zj1Var);
        ei6 ei6Var = new ei6(new xt4(this) { // from class: mj8
            public final /* synthetic */ rj8 b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mj8.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.t = ei6Var;
        this.u = new yi8(new pj8(this), ei6Var, new yh6(this, 4));
        this.v = new mce(26);
        this.w = new Object();
        this.x = yae.z(null);
        this.y = new ng6(this, 3);
        y02.b(0, 0, 0, 0, 15);
        this.z = new bi6();
        this.A = gue.l();
        this.B = gue.l();
        Boolean bool = Boolean.FALSE;
        this.C = yae.z(bool);
        this.D = yae.z(bool);
        this.E = yae.z(bool);
        this.F = yae.z(bool);
    }

    public static void s(rj8 rj8Var, int i) {
        if (rj8Var.k.a()) {
            z87.v(((ij8) rj8Var.m.getValue()).s, null, null, new r85(3, null, rj8Var), 3);
        }
        rj8Var.v(i, nae.e, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r6.i(r0) == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r9.e(r7, r8, r0) != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object t(defpackage.rj8 r6, defpackage.jw7 r7, defpackage.lu4 r8, defpackage.m42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.qj8
            if (r0 == 0) goto L13
            r0 = r9
            qj8 r0 = (defpackage.qj8) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            qj8 r0 = new qj8
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            rj8 r6 = r0.a
            defpackage.hre.r(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L33:
            aab r6 = r0.c
            r8 = r6
            lu4 r8 = (defpackage.lu4) r8
            jw7 r7 = r0.b
            rj8 r6 = r0.a
            defpackage.hre.r(r9)
            goto L55
        L40:
            defpackage.hre.r(r9)
            r0.a = r6
            r0.b = r7
            r9 = r8
            aab r9 = (defpackage.aab) r9
            r0.c = r9
            r0.f = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L76
        L55:
            ww2 r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L66
            int r9 = r6.k()
            em8 r1 = r6.r
            r1.i(r9)
        L66:
            ww2 r9 = r6.k
            r0.a = r6
            r0.b = r2
            r0.c = r2
            r0.f = r3
            java.lang.Object r7 = r9.e(r7, r8, r0)
            if (r7 != r5) goto L77
        L76:
            return r5
        L77:
            r7 = -1
            em8 r6 = r6.q
            r6.i(r7)
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj8.t(rj8, jw7, lu4, m42):java.lang.Object");
    }

    public static Object u(rj8 rj8Var, int i, aab aabVar) {
        rj8Var.getClass();
        Object e = rj8Var.e(jw7.a, new gs1(rj8Var, i, null, 9), aabVar);
        if (e == n82.a) {
            return e;
        }
        return pvc.a;
    }

    @Override // defpackage.x2a
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.x2a
    public final boolean b() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final boolean c() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.x2a
    public final float d(float f) {
        return this.k.d(f);
    }

    @Override // defpackage.x2a
    public final Object e(jw7 jw7Var, lu4 lu4Var, m42 m42Var) {
        return t(this, jw7Var, lu4Var, m42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, defpackage.gxa r13, defpackage.m42 r14) {
        /*
            r11 = this;
            boolean r3 = r14 instanceof defpackage.nj8
            if (r3 == 0) goto L14
            r3 = r14
            nj8 r3 = (defpackage.nj8) r3
            int r4 = r3.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.e = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            nj8 r3 = new nj8
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r2 = r6.c
            int r3 = r6.e
            r7 = 0
            r4 = 0
            pvc r8 = defpackage.pvc.a
            r9 = 2
            r5 = 1
            n82 r10 = defpackage.n82.a
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r9) goto L30
            defpackage.hre.r(r2)
            return r8
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r7
        L36:
            int r0 = r6.a
            gxa r3 = r6.b
            defpackage.hre.r(r2)
            r2 = r4
            r4 = r3
            goto L69
        L40:
            defpackage.hre.r(r2)
            int r2 = r11.k()
            if (r12 != r2) goto L52
            float r2 = r11.l()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            goto L88
        L52:
            int r2 = r11.n()
            if (r2 != 0) goto L59
            goto L88
        L59:
            r6.b = r13
            r6.a = r12
            r6.e = r5
            java.lang.Object r3 = r11.i(r6)
            if (r3 != r10) goto L66
            goto L87
        L66:
            r0 = r12
            r2 = r4
            r4 = r13
        L69:
            int r0 = r11.j(r0)
            int r3 = r11.p()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            oj8 r0 = new oj8
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.b = r7
            r6.e = r9
            jw7 r2 = defpackage.jw7.a
            java.lang.Object r0 = r11.e(r2, r0, r6)
            if (r0 != r10) goto L88
        L87:
            return r10
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj8.f(int, gxa, m42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0336, code lost:
        if (r() == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Type inference failed for: r15v12, types: [g51, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.ij8 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj8.h(ij8, boolean, boolean):void");
    }

    public final Object i(n42 n42Var) {
        Object e;
        if (this.m.getValue() == uj8.b && (e = this.w.e(n42Var)) == n82.a) {
            return e;
        }
        return pvc.a;
    }

    public final int j(int i) {
        if (n() <= 0) {
            return 0;
        }
        return dce.n(i, 0, n() - 1);
    }

    public final int k() {
        return ((em8) this.d.d).h();
    }

    public final float l() {
        return ((dm8) this.d.e).h();
    }

    public final ij8 m() {
        return (ij8) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((ij8) this.m.getValue()).b;
    }

    public final int p() {
        return ((ij8) this.m.getValue()).c + o();
    }

    public final long q() {
        return ((y78) this.c.getValue()).a;
    }

    public final boolean r() {
        if (((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void v(int i, float f, boolean z) {
        wf2 wf2Var = this.d;
        dm8 dm8Var = (dm8) wf2Var.e;
        if (((em8) wf2Var.d).h() != i || dm8Var.h() != f) {
            this.u.g();
        }
        ((em8) wf2Var.d).i(i);
        ((xh6) wf2Var.f).a(i);
        dm8Var.i(f);
        wf2Var.c = null;
        if (z) {
            od6 od6Var = (od6) this.x.getValue();
            if (od6Var != null) {
                od6Var.l();
                return;
            }
            return;
        }
        gue.u(this.B);
    }
}
