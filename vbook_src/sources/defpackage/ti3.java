package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ti3  reason: default package */
/* loaded from: classes.dex */
public abstract class ti3 extends m03 implements c19, su5, wx1, hj3 {
    public ff8 M;
    public xt4 N;
    public boolean O;
    public yu7 P;
    public xy0 Q;
    public yi3 R;
    public boolean S;
    public boolean T;
    public mh3 U;
    public long V = 0;
    public cx4 W;
    public cx4 X;
    public ph3 Y;
    public oh3 Z;
    public nh3 a0;
    public vte b0;
    public c5d c0;
    public zg1 d0;
    public ru5 e0;

    public ti3(xt4 xt4Var, boolean z, yu7 yu7Var, ff8 ff8Var) {
        this.M = ff8Var;
        this.N = xt4Var;
        this.O = z;
        this.P = yu7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K1(defpackage.ti3 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.pi3
            if (r0 == 0) goto L13
            r0 = r6
            pi3 r0 = (defpackage.pi3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pi3 r0 = new pi3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r6)
            goto L47
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2c:
            defpackage.hre.r(r6)
            yi3 r6 = r5.R
            if (r6 == 0) goto L49
            yu7 r1 = r5.P
            if (r1 == 0) goto L47
            xi3 r4 = new xi3
            r4.<init>(r6)
            r0.c = r3
            java.lang.Object r6 = r1.b(r4, r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L47
            return r0
        L47:
            r5.R = r2
        L49:
            th3 r6 = new th3
            r0 = 0
            r2 = 0
            r6.<init>(r2, r0)
            r5.U1(r6)
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti3.K1(ti3, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r1.b(r5, r0) == r4) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r8v4, types: [ez5, yi3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L1(defpackage.ti3 r6, defpackage.sh3 r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.qi3
            if (r0 == 0) goto L13
            r0 = r8
            qi3 r0 = (defpackage.qi3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            qi3 r0 = new qi3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            yi3 r7 = r0.b
            sh3 r0 = r0.a
            defpackage.hre.r(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L35:
            sh3 r7 = r0.a
            defpackage.hre.r(r8)
            goto L56
        L3b:
            defpackage.hre.r(r8)
            yi3 r8 = r6.R
            if (r8 == 0) goto L56
            yu7 r1 = r6.P
            if (r1 == 0) goto L56
            xi3 r5 = new xi3
            r5.<init>(r8)
            r0.a = r7
            r0.e = r3
            java.lang.Object r8 = r1.b(r5, r0)
            if (r8 != r4) goto L56
            goto L6b
        L56:
            yi3 r8 = new yi3
            r8.<init>()
            yu7 r1 = r6.P
            if (r1 == 0) goto L70
            r0.a = r7
            r0.b = r8
            r0.e = r2
            java.lang.Object r0 = r1.b(r8, r0)
            if (r0 != r4) goto L6c
        L6b:
            return r4
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.R = r8
            long r7 = r7.a
            r6.T1(r7)
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti3.L1(ti3, sh3, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M1(defpackage.ti3 r5, defpackage.th3 r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ri3
            if (r0 == 0) goto L13
            r0 = r7
            ri3 r0 = (defpackage.ri3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ri3 r0 = new ri3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            th3 r6 = r0.a
            defpackage.hre.r(r7)
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r7)
            yi3 r7 = r5.R
            if (r7 == 0) goto L4d
            yu7 r1 = r5.P
            if (r1 == 0) goto L4b
            zi3 r4 = new zi3
            r4.<init>(r7)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r1.b(r4, r0)
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L4b
            return r0
        L4b:
            r5.R = r2
        L4d:
            r5.U1(r6)
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti3.M1(ti3, th3, n42):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, oh3] */
    public static void R1(ti3 ti3Var, z09 z09Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        oh3 oh3Var = ti3Var.Z;
        oh3 oh3Var2 = oh3Var;
        if (oh3Var == null) {
            ?? obj = new Object();
            obj.c = null;
            obj.d = Long.MAX_VALUE;
            obj.e = false;
            ti3Var.Z = obj;
            oh3Var2 = obj;
        }
        oh3Var2.c = z09Var;
        oh3Var2.d = j;
        zg1 zg1Var = ti3Var.d0;
        ff8 ff8Var = ti3Var.M;
        if (zg1Var == null) {
            ti3Var.d0 = new zg1(ff8Var, 2);
        } else {
            zg1Var.c = ff8Var;
            zg1Var.b = j2;
        }
        oh3Var2.e = false;
        ti3Var.b0 = oh3Var2;
    }

    @Override // defpackage.mq7
    public final void A1() {
        this.S = false;
        N1();
        cx4 cx4Var = this.X;
        if (cx4Var != null) {
            I1(cx4Var);
        }
        cx4 cx4Var2 = this.W;
        if (cx4Var2 != null) {
            I1(cx4Var2);
        }
        this.X = null;
        this.W = null;
    }

    public final void N1() {
        yi3 yi3Var = this.R;
        if (yi3Var != null) {
            yu7 yu7Var = this.P;
            if (yu7Var != null) {
                yu7Var.c(new xi3(yi3Var));
            }
            this.R = null;
        }
    }

    @Override // defpackage.su5
    public final void O0() {
        ru5 ru5Var = this.e0;
        if (ru5Var != null) {
            ru5Var.a();
            ti3 ti3Var = ru5Var.a;
            if (ti3Var.S) {
                ti3Var.S1(qh3.a);
            }
            ru5Var.C = null;
            jt1 jt1Var = ru5Var.F;
            jt1Var.b = 0;
            ((bv7) jt1Var.c).b = 0;
        }
    }

    public abstract Object O1(si3 si3Var, si3 si3Var2);

    /* JADX WARN: Type inference failed for: r0v3, types: [mh3, java.lang.Object] */
    public final void P1() {
        this.V = 0L;
        mh3 mh3Var = this.U;
        lh3 lh3Var = lh3.c;
        mh3 mh3Var2 = mh3Var;
        if (mh3Var == null) {
            ?? obj = new Object();
            obj.c = lh3Var;
            obj.d = false;
            obj.e = false;
            this.U = obj;
            mh3Var2 = obj;
        }
        mh3Var2.c = lh3Var;
        mh3Var2.d = false;
        mh3Var2.e = false;
        this.b0 = mh3Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nh3, java.lang.Object] */
    public final void Q1(z09 z09Var, long j, zg1 zg1Var) {
        nh3 nh3Var = this.a0;
        nh3 nh3Var2 = nh3Var;
        if (nh3Var == null) {
            ?? obj = new Object();
            obj.c = null;
            obj.d = Long.MAX_VALUE;
            this.a0 = obj;
            nh3Var2 = obj;
        }
        nh3Var2.c = z09Var;
        nh3Var2.d = j;
        zg1Var.b = 0L;
        this.b0 = nh3Var2;
    }

    public final void S1(uh3 uh3Var) {
        if ((uh3Var instanceof sh3) && !this.S) {
            this.S = true;
            a2();
        }
        V1().j(uh3Var);
    }

    public abstract void T1(long j);

    public abstract void U1(th3 th3Var);

    public final ta1 V1() {
        xy0 xy0Var = this.Q;
        if (xy0Var != null) {
            return xy0Var;
        }
        vs.m("Events channel not initialized.");
        return null;
    }

    public final c5d W1() {
        c5d c5dVar = this.c0;
        if (c5dVar != null) {
            return c5dVar;
        }
        vs.m("Velocity Tracker not initialized.");
        return null;
    }

    public final void X1(long j, z09 z09Var) {
        this.V = y78.j(this.V, j);
        hse.e(W1(), z09Var);
        V1().j(new rh3(false, j));
    }

    public final void Y1(z09 z09Var, z09 z09Var2, long j) {
        if (this.c0 == null) {
            this.c0 = new c5d();
        }
        hse.e(W1(), z09Var);
        long i = y78.i(z09Var2.c, j);
        if (((Boolean) this.N.invoke(new i19(z09Var.i))).booleanValue()) {
            if (!this.S) {
                if (this.Q == null) {
                    this.Q = xpe.a(Integer.MAX_VALUE, 6, null);
                }
                a2();
            }
            V1().j(new sh3(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [m03, ti3] */
    /* JADX WARN: Type inference failed for: r2v22, types: [pu5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [pu5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, mu5] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object] */
    @Override // defpackage.su5
    public final void Z(kj kjVar, s09 s09Var) {
        Object obj;
        Object obj2;
        char c;
        long j;
        float f;
        float intBitsToFloat;
        ru5 ru5Var;
        Object obj3;
        ru5 ru5Var2;
        Object obj4;
        ?? r7;
        lu5 lu5Var;
        int i = kjVar.a;
        ArrayList arrayList = (ArrayList) kjVar.b;
        if (this.O) {
            if (this.e0 == null) {
                this.e0 = new ru5(this);
            }
            if (this.X == null) {
                ru5 ru5Var3 = this.e0;
                ru5Var3.getClass();
                cx4 cx4Var = new cx4(ru5Var3);
                H1(cx4Var);
                this.X = cx4Var;
            }
            ru5 ru5Var4 = this.e0;
            if (ru5Var4 != null) {
                ti3 ti3Var = ru5Var4.a;
                if (ru5Var4.f == null) {
                    mu5 mu5Var = ru5Var4.b;
                    mu5 mu5Var2 = mu5Var;
                    if (mu5Var == null) {
                        ?? obj5 = new Object();
                        obj5.f = lu5.c;
                        obj5.g = false;
                        obj5.h = false;
                        ru5Var4.b = obj5;
                        mu5Var2 = obj5;
                    }
                    ru5Var4.f = mu5Var2;
                }
                lye lyeVar = ru5Var4.f;
                if (lyeVar != null) {
                    boolean z = lyeVar instanceof mu5;
                    s09 s09Var2 = s09.a;
                    boolean z2 = true;
                    s09 s09Var3 = s09.b;
                    if (z) {
                        mu5 mu5Var3 = (mu5) lyeVar;
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                if (!nye.o((ku5) arrayList.get(i2))) {
                                    return;
                                }
                            }
                            ku5 ku5Var = (ku5) sl1.c0(arrayList);
                            int i3 = qu5.a[mu5Var3.f.ordinal()];
                            lu5 lu5Var2 = lu5.b;
                            lu5 lu5Var3 = lu5.a;
                            if (i3 == 1) {
                                if (!ti3Var.Z1()) {
                                    lu5Var = lu5Var3;
                                } else {
                                    lu5Var = lu5Var2;
                                }
                            } else {
                                lu5Var = mu5Var3.f;
                            }
                            mu5Var3.f = lu5Var;
                            if (s09Var == s09Var2) {
                                if (lu5Var == lu5Var2) {
                                    ku5Var.i = true;
                                    mu5Var3.g = true;
                                }
                                mu5Var3.h = true;
                            }
                            if (s09Var == s09Var3) {
                                if (lu5Var == lu5Var3) {
                                    ru5.c(ru5Var4, ku5Var, ku5Var.a, 0L, 12);
                                    return;
                                } else if (mu5Var3.g) {
                                    ru5Var4.f(ku5Var, ku5Var, new ju5(i), 0L);
                                    ru5Var4.e(ku5Var, new ju5(i), 0L);
                                    long j2 = ku5Var.a;
                                    pu5 pu5Var = ru5Var4.c;
                                    pu5 pu5Var2 = pu5Var;
                                    if (pu5Var == null) {
                                        ?? obj6 = new Object();
                                        obj6.f = Long.MAX_VALUE;
                                        ru5Var4.c = obj6;
                                        pu5Var2 = obj6;
                                    }
                                    pu5Var2.f = j2;
                                    ru5Var4.f = pu5Var2;
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    boolean z3 = lyeVar instanceof ou5;
                    s09 s09Var4 = s09.c;
                    if (z3) {
                        ou5 ou5Var = (ou5) lyeVar;
                        if (s09Var != s09Var2) {
                            int size2 = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    obj3 = arrayList.get(i4);
                                    ru5Var = ru5Var4;
                                    if (y09.a(((ku5) obj3).a, ou5Var.g)) {
                                        break;
                                    }
                                    i4++;
                                    ru5Var4 = ru5Var;
                                } else {
                                    ru5Var = ru5Var4;
                                    obj3 = null;
                                    break;
                                }
                            }
                            ku5 ku5Var2 = (ku5) obj3;
                            if (ku5Var2 == null) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        r7 = arrayList.get(i5);
                                        if (((ku5) r7).d) {
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        r7 = 0;
                                        break;
                                    }
                                }
                                ku5Var2 = r7;
                                if (ku5Var2 == null) {
                                    ru5Var.a();
                                    return;
                                }
                                ou5Var.g = ku5Var2.a;
                            }
                            ku5 ku5Var3 = ku5Var2;
                            if (s09Var == s09Var3) {
                                if (!ku5Var3.i) {
                                    if (nye.n(ku5Var3)) {
                                        int size4 = arrayList.size();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < size4) {
                                                obj4 = arrayList.get(i6);
                                                if (((ku5) obj4).d) {
                                                    break;
                                                }
                                                i6++;
                                            } else {
                                                obj4 = null;
                                                break;
                                            }
                                        }
                                        ku5 ku5Var4 = (ku5) obj4;
                                        if (ku5Var4 == null) {
                                            ru5Var.a();
                                        } else {
                                            ou5Var.g = ku5Var4.a;
                                        }
                                    } else {
                                        float f2 = mi3.a;
                                        float f3 = ((ucd) nye.q(ti3Var, dy1.t)).f();
                                        ru5Var2 = ru5Var;
                                        zg1 zg1Var = ru5Var2.D;
                                        if (zg1Var != null) {
                                            long F = zg1.F(zg1Var, nye.y(ku5Var3, ti3Var.M, new ju5(i), true), f3);
                                            if ((9223372034707292159L & F) != 9205357640488583168L) {
                                                ku5Var3.i = true;
                                                ku5 ku5Var5 = ou5Var.f;
                                                ku5Var5.getClass();
                                                ru5Var2.f(ku5Var5, ku5Var3, new ju5(i), F);
                                                ru5Var2.e(ku5Var3, new ju5(i), F);
                                                long j3 = ku5Var3.a;
                                                pu5 pu5Var3 = ru5Var2.c;
                                                pu5 pu5Var4 = pu5Var3;
                                                if (pu5Var3 == null) {
                                                    ?? obj7 = new Object();
                                                    obj7.f = Long.MAX_VALUE;
                                                    ru5Var2.c = obj7;
                                                    pu5Var4 = obj7;
                                                }
                                                pu5Var4.f = j3;
                                                ru5Var2.f = pu5Var4;
                                            } else {
                                                ou5Var.h = true;
                                            }
                                        } else {
                                            vs.m("Touch slop detector not initialized.");
                                            return;
                                        }
                                    }
                                } else {
                                    ru5Var2 = ru5Var;
                                    ku5 ku5Var6 = ou5Var.f;
                                    if (ku5Var6 != null) {
                                        long j4 = ou5Var.g;
                                        zg1 zg1Var2 = ru5Var2.D;
                                        if (zg1Var2 != null) {
                                            ru5Var2.b(ku5Var6, j4, zg1Var2);
                                        } else {
                                            vs.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    } else {
                                        vs.m("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                }
                                if (s09Var != s09Var4 && ou5Var.h) {
                                    if (ku5Var3.i) {
                                        ku5 ku5Var7 = ou5Var.f;
                                        if (ku5Var7 != null) {
                                            long j5 = ou5Var.g;
                                            zg1 zg1Var3 = ru5Var2.D;
                                            if (zg1Var3 != null) {
                                                ru5Var2.b(ku5Var7, j5, zg1Var3);
                                                return;
                                            } else {
                                                vs.m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                        }
                                        vs.m("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                    ou5Var.h = false;
                                    return;
                                }
                                return;
                            }
                            ru5Var2 = ru5Var;
                            if (s09Var != s09Var4) {
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (lyeVar instanceof nu5) {
                        nu5 nu5Var = (nu5) lyeVar;
                        if (s09Var == s09Var4) {
                            int size5 = arrayList.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    break;
                                } else if (((ku5) arrayList.get(i7)).i) {
                                    z2 = false;
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            int size6 = arrayList.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size6) {
                                    break;
                                } else if (((ku5) arrayList.get(i8)).d) {
                                    if (!arrayList.isEmpty()) {
                                        if (z2) {
                                            long z4 = nye.z((ku5) sl1.c0(arrayList), ti3Var.M, new ju5(i));
                                            ku5 ku5Var8 = nu5Var.f;
                                            ku5Var8.getClass();
                                            long i9 = y78.i(z4, nye.z(ku5Var8, ti3Var.M, new ju5(i)));
                                            ku5 ku5Var9 = nu5Var.f;
                                            if (ku5Var9 != null) {
                                                ru5.c(ru5Var4, ku5Var9, nu5Var.g, i9, 8);
                                                return;
                                            } else {
                                                vs.m("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                } else {
                                    i8++;
                                }
                            }
                            ru5Var4.a();
                            return;
                        }
                        return;
                    } else if (lyeVar instanceof pu5) {
                        pu5 pu5Var5 = (pu5) lyeVar;
                        if (s09Var == s09Var3) {
                            long j6 = pu5Var5.f;
                            int size7 = arrayList.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 < size7) {
                                    obj = arrayList.get(i10);
                                    if (y09.a(((ku5) obj).a, j6)) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            ku5 ku5Var10 = (ku5) obj;
                            if (ku5Var10 != null) {
                                long j7 = ku5Var10.c;
                                boolean n = nye.n(ku5Var10);
                                qh3 qh3Var = qh3.a;
                                if (n) {
                                    int size8 = arrayList.size();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < size8) {
                                            obj2 = arrayList.get(i11);
                                            if (((ku5) obj2).d) {
                                                break;
                                            }
                                            i11++;
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    ku5 ku5Var11 = (ku5) obj2;
                                    if (ku5Var11 == null) {
                                        if (!ku5Var10.i && nye.n(ku5Var10)) {
                                            c5d d = ru5Var4.d();
                                            ff8 ff8Var = ti3Var.M;
                                            jt1 jt1Var = ru5Var4.E;
                                            kv7 kv7Var = (kv7) jt1Var.c;
                                            char c2 = ' ';
                                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                                            long j8 = 4294967295L;
                                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                                            if (nye.o(ku5Var10)) {
                                                jt1Var.b = 0;
                                                kv7Var.d();
                                            }
                                            if (!nye.n(ku5Var10) && !nye.o(ku5Var10)) {
                                                if (kv7Var.b == 3) {
                                                    int i12 = jt1Var.b;
                                                    jt1Var.b = i12 + 1;
                                                    kv7Var.n(i12, ku5Var10);
                                                } else {
                                                    kv7Var.a(ku5Var10);
                                                }
                                                if (jt1Var.b == 3) {
                                                    jt1Var.b = 0;
                                                }
                                                Object[] objArr = kv7Var.a;
                                                int i13 = kv7Var.b;
                                                int i14 = 0;
                                                float f4 = nae.e;
                                                while (i14 < i13) {
                                                    char c3 = c2;
                                                    f4 = Float.intBitsToFloat((int) (((ku5) objArr[i14]).c >> c3)) + f4;
                                                    i14++;
                                                    c2 = c3;
                                                }
                                                c = c2;
                                                f = nae.e;
                                                int i15 = kv7Var.b;
                                                intBitsToFloat2 = f4 / i15;
                                                Object[] objArr2 = kv7Var.a;
                                                float f5 = 0.0f;
                                                int i16 = 0;
                                                while (i16 < i15) {
                                                    long j9 = j8;
                                                    f5 += Float.intBitsToFloat((int) (((ku5) objArr2[i16]).c & j9));
                                                    i16++;
                                                    j8 = j9;
                                                }
                                                j = j8;
                                                intBitsToFloat3 = f5 / kv7Var.b;
                                            } else {
                                                c = ' ';
                                                j = 4294967295L;
                                                f = nae.e;
                                            }
                                            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & j);
                                            if (ff8Var != null) {
                                                if (i == 1) {
                                                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
                                                } else if (i == 2) {
                                                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j));
                                                }
                                                floatToRawIntBits = ff8Var == ff8.b ? (Float.floatToRawIntBits(f) & j) | (Float.floatToRawIntBits(intBitsToFloat) << c) : (Float.floatToRawIntBits(f) << c) | (Float.floatToRawIntBits(intBitsToFloat) & j);
                                            }
                                            d.a(ku5Var10.b, floatToRawIntBits);
                                            float e = ((ucd) nye.q(ti3Var, dy1.t)).e();
                                            long c4 = ru5Var4.d().c(ese.q(e, e));
                                            ru5Var4.d().d();
                                            ti3Var.S1(new th3(true, nj3.c(c4)));
                                        } else {
                                            ti3Var.S1(qh3Var);
                                        }
                                        ru5Var4.a();
                                        return;
                                    }
                                    pu5Var5.f = ku5Var11.a;
                                    return;
                                } else if (ku5Var10.i) {
                                    ti3Var.S1(qh3Var);
                                    return;
                                } else if (y78.e(nye.y(ku5Var10, ti3Var.M, new ju5(i), true)) != nae.e) {
                                    ru5Var4.e(ku5Var10, new ju5(i), nye.y(ku5Var10, ti3Var.M, new ju5(i), false));
                                    ku5Var10.i = true;
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } else {
                        xk5.o();
                        return;
                    }
                }
                vs.m("currentDragState should not be null");
            }
        }
    }

    public abstract boolean Z1();

    public final void a2() {
        this.S = true;
        if (this.Q == null) {
            this.Q = xpe.a(Integer.MAX_VALUE, 6, null);
        }
        z87.v(v1(), null, null, new si3(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0204  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, ph3] */
    /* JADX WARN: Type inference failed for: r20v0, types: [wx1, m03, f03, ax4, ti3] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, ph3] */
    /* JADX WARN: Type inference failed for: r4v14, types: [mh3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    @Override // defpackage.c19
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(defpackage.r09 r21, defpackage.s09 r22, long r23) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti3.b0(r09, s09, long):void");
    }

    public final void b2(xt4 xt4Var, boolean z, yu7 yu7Var, ff8 ff8Var, boolean z2) {
        this.N = xt4Var;
        boolean z3 = true;
        if (this.O != z) {
            this.O = z;
            if (!z) {
                cx4 cx4Var = this.X;
                if (cx4Var != null) {
                    I1(cx4Var);
                }
                cx4 cx4Var2 = this.W;
                if (cx4Var2 != null) {
                    I1(cx4Var2);
                }
                this.X = null;
                this.W = null;
                N1();
                this.e0 = null;
            }
            z2 = true;
        }
        if (!c16.i(this.P, yu7Var)) {
            N1();
            this.P = yu7Var;
        }
        if (this.M != ff8Var) {
            this.M = ff8Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.T;
            qh3 qh3Var = qh3.a;
            if (z4) {
                P1();
                if (this.S) {
                    V1().j(qh3Var);
                }
                this.c0 = null;
            }
            ru5 ru5Var = this.e0;
            if (ru5Var != null) {
                ru5Var.a();
                ti3 ti3Var = ru5Var.a;
                if (ti3Var.S) {
                    ti3Var.S1(qh3Var);
                }
                ru5Var.C = null;
                jt1 jt1Var = ru5Var.F;
                jt1Var.b = 0;
                ((bv7) jt1Var.c).b = 0;
            }
        }
    }

    @Override // defpackage.c19
    public final void n0() {
        if (this.T) {
            P1();
            if (this.S) {
                V1().j(qh3.a);
            }
            this.c0 = null;
        }
        this.T = false;
    }

    @Override // defpackage.hj3
    public final ff8 o() {
        return this.M;
    }

    @Override // defpackage.ax4
    public final String x0() {
        if (this.O) {
            vte vteVar = this.b0;
            if (vteVar instanceof mh3) {
                if (((mh3) vteVar).e) {
                    return "waiting";
                }
                return "idle";
            } else if ((vteVar instanceof oh3) || (vteVar instanceof nh3)) {
                return "waiting";
            } else {
                if (vteVar instanceof ph3) {
                    return "recognized";
                }
                return "idle";
            }
        }
        return "idle";
    }
}
