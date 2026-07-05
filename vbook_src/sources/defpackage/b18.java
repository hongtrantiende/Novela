package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b18  reason: default package */
/* loaded from: classes.dex */
public final class b18 extends mq7 implements rnc, u08 {
    public u08 K;
    public x08 L;
    public b18 M;
    public final String N;

    public b18(u08 u08Var, x08 x08Var) {
        this.K = u08Var;
        this.L = x08Var == null ? new x08() : x08Var;
        this.N = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zl9, java.lang.Object] */
    @Override // defpackage.mq7
    public final void A1() {
        ?? obj = new Object();
        dae.F(this, new jg(2, obj));
        b18 b18Var = (b18) ((rnc) obj.a);
        this.M = b18Var;
        x08 x08Var = this.L;
        x08Var.b = b18Var;
        if (x08Var.a == this) {
            x08Var.a = null;
        }
    }

    public final m82 H1() {
        m82 m82Var;
        b18 I1 = I1();
        if (I1 != null) {
            m82Var = I1.H1();
        } else {
            m82Var = null;
        }
        if (m82Var != null && k27.v(m82Var)) {
            return m82Var;
        }
        m82 m82Var2 = this.L.d;
        if (m82Var2 != null) {
            return m82Var2;
        }
        vs.k("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final b18 I1() {
        kn knVar;
        rnc rncVar = null;
        if (!this.J) {
            return null;
        }
        if (!this.a.J) {
            lv5.c("visitAncestors called on an unattached node");
        }
        mq7 mq7Var = this.a.e;
        od6 v = voe.v(this);
        loop0: while (true) {
            if (v == null) {
                break;
            }
            if ((((mq7) v.c0.C).d & 262144) != 0) {
                while (mq7Var != null) {
                    if ((mq7Var.c & 262144) != 0) {
                        mq7 mq7Var2 = mq7Var;
                        gw7 gw7Var = null;
                        while (mq7Var2 != null) {
                            if (mq7Var2 instanceof rnc) {
                                rnc rncVar2 = (rnc) mq7Var2;
                                if (c16.i(this.N, rncVar2.M()) && b18.class == rncVar2.getClass()) {
                                    rncVar = rncVar2;
                                    break loop0;
                                }
                            }
                            if ((mq7Var2.c & 262144) != 0 && (mq7Var2 instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                    if ((mq7Var3.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            mq7Var2 = mq7Var3;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var2 != null) {
                                                gw7Var.b(mq7Var2);
                                                mq7Var2 = null;
                                            }
                                            gw7Var.b(mq7Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            mq7Var2 = voe.h(gw7Var);
                        }
                        continue;
                    }
                    mq7Var = mq7Var.e;
                }
            }
            v = v.v();
            if (v != null && (knVar = v.c0) != null) {
                mq7Var = (hkb) knVar.f;
            } else {
                mq7Var = null;
            }
        }
        return (b18) rncVar;
    }

    @Override // defpackage.rnc
    public final Object M() {
        return this.N;
    }

    @Override // defpackage.u08
    public final long i1(long j, long j2, int i) {
        b18 b18Var;
        long j3;
        long i1 = this.K.i1(j, j2, i);
        if (this.J) {
            b18Var = I1();
        } else {
            b18Var = null;
        }
        b18 b18Var2 = b18Var;
        if (b18Var2 != null) {
            j3 = b18Var2.i1(y78.j(j, i1), y78.i(j2, i1), i);
        } else {
            j3 = 0;
        }
        return y78.j(i1, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    @Override // defpackage.u08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l1(long r13, long r15, defpackage.m42 r17) {
        /*
            r12 = this;
            r1 = r17
            boolean r2 = r1 instanceof defpackage.z08
            if (r2 == 0) goto L16
            r2 = r1
            z08 r2 = (defpackage.z08) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.e = r3
        L14:
            r8 = r2
            goto L1e
        L16:
            z08 r2 = new z08
            n42 r1 = (defpackage.n42) r1
            r2.<init>(r12, r1)
            goto L14
        L1e:
            java.lang.Object r1 = r8.c
            int r2 = r8.e
            r9 = 0
            r10 = 2
            r3 = 1
            n82 r11 = defpackage.n82.a
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r10) goto L33
            long r2 = r8.a
            defpackage.hre.r(r1)
            goto L84
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r9
        L39:
            long r2 = r8.b
            long r4 = r8.a
            defpackage.hre.r(r1)
            goto L58
        L41:
            defpackage.hre.r(r1)
            u08 r1 = r12.K
            r8.a = r13
            r6 = r15
            r8.b = r6
            r8.e = r3
            r4 = r13
            r3 = r1
            java.lang.Object r1 = r3.l1(r4, r6, r8)
            if (r1 != r11) goto L56
            goto L82
        L56:
            r4 = r13
            r2 = r15
        L58:
            z4d r1 = (defpackage.z4d) r1
            long r6 = r1.a
            boolean r1 = r12.J
            if (r1 == 0) goto L67
            if (r1 == 0) goto L69
            b18 r9 = r12.I1()
            goto L69
        L67:
            b18 r9 = r12.M
        L69:
            if (r9 == 0) goto L8a
            long r0 = defpackage.z4d.e(r4, r6)
            long r2 = defpackage.z4d.d(r2, r6)
            r8.a = r6
            r8.e = r10
            r13 = r0
            r15 = r2
            r17 = r8
            r12 = r9
            java.lang.Object r1 = r12.l1(r13, r15, r17)
            if (r1 != r11) goto L83
        L82:
            return r11
        L83:
            r2 = r6
        L84:
            z4d r1 = (defpackage.z4d) r1
            long r0 = r1.a
            r6 = r2
            goto L8c
        L8a:
            r0 = 0
        L8c:
            long r0 = defpackage.z4d.e(r6, r0)
            z4d r2 = new z4d
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b18.l1(long, long, m42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r9 == r5) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // defpackage.u08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(long r7, defpackage.m42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.a18
            if (r0 == 0) goto L13
            r0 = r9
            a18 r0 = (defpackage.a18) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            a18 r0 = new a18
            n42 r9 = (defpackage.n42) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.a
            defpackage.hre.r(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L35:
            long r7 = r0.a
            defpackage.hre.r(r9)
            goto L53
        L3b:
            defpackage.hre.r(r9)
            boolean r9 = r6.J
            if (r9 == 0) goto L46
            b18 r2 = r6.I1()
        L46:
            if (r2 == 0) goto L58
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r2.m0(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            z4d r9 = (defpackage.z4d) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            u08 r6 = r6.K
            long r7 = defpackage.z4d.d(r7, r1)
            r0.a = r1
            r0.d = r3
            java.lang.Object r9 = r6.m0(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            z4d r9 = (defpackage.z4d) r9
            long r8 = r9.a
            long r6 = defpackage.z4d.e(r6, r8)
            z4d r8 = new z4d
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b18.m0(long, m42):java.lang.Object");
    }

    @Override // defpackage.u08
    public final long u0(int i, long j) {
        b18 b18Var;
        long j2;
        if (this.J) {
            b18Var = I1();
        } else {
            b18Var = null;
        }
        if (b18Var != null) {
            j2 = b18Var.u0(i, j);
        } else {
            j2 = 0;
        }
        return y78.j(j2, this.K.u0(i, y78.i(j, j2)));
    }

    @Override // defpackage.mq7
    public final void z1() {
        x08 x08Var = this.L;
        x08Var.a = this;
        x08Var.b = null;
        this.M = null;
        x08Var.c = new ik(this, 19);
        x08Var.d = v1();
    }
}
