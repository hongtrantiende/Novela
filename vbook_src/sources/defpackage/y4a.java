package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y4a  reason: default package */
/* loaded from: classes.dex */
public final class y4a extends c3e {
    public static final fs O = new fs(nae.e);
    public static final fs P = new fs(1.0f);
    public final ak9 C;
    public sra D;
    public final dm8 E;
    public f61 F;
    public final sw7 G;
    public final pw7 H;
    public long I;
    public final kv7 J;
    public r4a K;
    public final q4a L;
    public float M;
    public final q4a N;
    public final hm8 b;
    public final hm8 c;
    public Object d;
    public tkc e;
    public long f;

    /* JADX WARN: Type inference failed for: r3v6, types: [q4a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [q4a] */
    public y4a(Object obj) {
        super(11);
        this.b = yae.z(obj);
        this.c = yae.z(obj);
        this.d = obj;
        this.C = new ak9(this, 11);
        this.E = new dm8(nae.e);
        this.G = new sw7();
        this.H = new pw7();
        this.I = Long.MIN_VALUE;
        this.J = new kv7();
        this.L = new xt4(this) { // from class: q4a
            public final /* synthetic */ y4a b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj2) {
                int i = r2;
                pvc pvcVar = pvc.a;
                y4a y4aVar = this.b;
                long longValue = ((Long) obj2).longValue();
                switch (i) {
                    case 0:
                        y4aVar.I = longValue;
                        return pvcVar;
                    default:
                        y4aVar.I = longValue;
                        long B = k27.B((longValue - y4aVar.I) / y4aVar.M);
                        kv7 kv7Var = y4aVar.J;
                        if (kv7Var.i()) {
                            Object[] objArr = kv7Var.a;
                            int i2 = kv7Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                r4a r4aVar = (r4a) objArr[i4];
                                y4a.e0(r4aVar, B);
                                r4aVar.c = true;
                            }
                            tkc tkcVar = y4aVar.e;
                            if (tkcVar != null) {
                                tkcVar.o();
                            }
                            int i5 = kv7Var.b;
                            Object[] objArr2 = kv7Var.a;
                            ty5 F = dce.F(0, i5);
                            int i6 = F.a;
                            int i7 = F.b;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((r4a) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            b00.g0(i5 - i3, i5, null, objArr2);
                            kv7Var.b -= i3;
                        }
                        r4a r4aVar2 = y4aVar.K;
                        if (r4aVar2 != null) {
                            r4aVar2.g = y4aVar.f;
                            y4a.e0(r4aVar2, B);
                            y4aVar.h0(r4aVar2.d);
                            if (r4aVar2.d == 1.0f) {
                                y4aVar.K = null;
                            }
                            y4aVar.g0();
                        }
                        return pvcVar;
                }
            }
        };
        this.N = new xt4(this) { // from class: q4a
            public final /* synthetic */ y4a b;

            {
                this.b = this;
            }

            @Override // defpackage.xt4
            public final Object invoke(Object obj2) {
                int i = r2;
                pvc pvcVar = pvc.a;
                y4a y4aVar = this.b;
                long longValue = ((Long) obj2).longValue();
                switch (i) {
                    case 0:
                        y4aVar.I = longValue;
                        return pvcVar;
                    default:
                        y4aVar.I = longValue;
                        long B = k27.B((longValue - y4aVar.I) / y4aVar.M);
                        kv7 kv7Var = y4aVar.J;
                        if (kv7Var.i()) {
                            Object[] objArr = kv7Var.a;
                            int i2 = kv7Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                r4a r4aVar = (r4a) objArr[i4];
                                y4a.e0(r4aVar, B);
                                r4aVar.c = true;
                            }
                            tkc tkcVar = y4aVar.e;
                            if (tkcVar != null) {
                                tkcVar.o();
                            }
                            int i5 = kv7Var.b;
                            Object[] objArr2 = kv7Var.a;
                            ty5 F = dce.F(0, i5);
                            int i6 = F.a;
                            int i7 = F.b;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((r4a) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            b00.g0(i5 - i3, i5, null, objArr2);
                            kv7Var.b -= i3;
                        }
                        r4a r4aVar2 = y4aVar.K;
                        if (r4aVar2 != null) {
                            r4aVar2.g = y4aVar.f;
                            y4a.e0(r4aVar2, B);
                            y4aVar.h0(r4aVar2.d);
                            if (r4aVar2.d == 1.0f) {
                                y4aVar.K = null;
                            }
                            y4aVar.g0();
                        }
                        return pvcVar;
                }
            }
        };
    }

    public static final void Y(y4a y4aVar) {
        dm8 dm8Var = y4aVar.E;
        tkc tkcVar = y4aVar.e;
        if (tkcVar == null) {
            return;
        }
        r4a r4aVar = y4aVar.K;
        if (r4aVar == null) {
            if (y4aVar.f > 0 && dm8Var.h() != 1.0f && !c16.i(y4aVar.c.getValue(), y4aVar.b.getValue())) {
                r4aVar = new r4a();
                r4aVar.d = dm8Var.h();
                long j = y4aVar.f;
                r4aVar.g = j;
                r4aVar.h = k27.B((1.0d - dm8Var.h()) * j);
                r4aVar.e.e(0, dm8Var.h());
            } else {
                r4aVar = null;
            }
        }
        if (r4aVar != null) {
            r4aVar.g = y4aVar.f;
            y4aVar.J.a(r4aVar);
            tkcVar.m(r4aVar);
        }
        y4aVar.K = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(defpackage.y4a r11, defpackage.n42 r12) {
        /*
            kv7 r0 = r11.J
            boolean r1 = r12 instanceof defpackage.t4a
            if (r1 == 0) goto L15
            r1 = r12
            t4a r1 = (defpackage.t4a) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            t4a r1 = new t4a
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.a
            int r2 = r1.c
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            pvc r7 = defpackage.pvc.a
            n82 r8 = defpackage.n82.a
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            goto L34
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L34:
            defpackage.hre.r(r12)
            goto L72
        L38:
            defpackage.hre.r(r12)
            boolean r12 = r0.h()
            if (r12 == 0) goto L46
            r4a r12 = r11.K
            if (r12 != 0) goto L46
            return r7
        L46:
            d82 r12 = r1.getContext()
            float r12 = defpackage.ote.v(r12)
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L59
            r11.d0()
            r11.I = r5
            return r7
        L59:
            long r9 = r11.I
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 != 0) goto L72
            q4a r12 = r11.L
            r1.c = r4
            d82 r2 = r1.getContext()
            xq7 r2 = defpackage.cqe.i(r2)
            java.lang.Object r12 = r2.m0(r12, r1)
            if (r12 != r8) goto L72
            goto L88
        L72:
            boolean r12 = r0.i()
            if (r12 != 0) goto L80
            r4a r12 = r11.K
            if (r12 == 0) goto L7d
            goto L80
        L7d:
            r11.I = r5
            return r7
        L80:
            r1.c = r3
            java.lang.Object r12 = r11.c0(r1)
            if (r12 != r8) goto L72
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4a.Z(y4a, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.o(r1) == r6) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(defpackage.y4a r8, defpackage.n42 r9) {
        /*
            sw7 r0 = r8.G
            boolean r1 = r9 instanceof defpackage.w4a
            if (r1 == 0) goto L15
            r1 = r9
            w4a r1 = (defpackage.w4a) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            w4a r1 = new w4a
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.b
            int r2 = r1.d
            r3 = 0
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.a
            defpackage.hre.r(r9)
            goto L6f
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.a
            defpackage.hre.r(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.hre.r(r9)
            hm8 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.a = r9
            r1.d = r5
            java.lang.Object r2 = r0.o(r1)
            if (r2 != r6) goto L50
            goto L6b
        L50:
            r1.a = r9
            r1.d = r4
            f61 r2 = new f61
            m42 r1 = defpackage.w92.t(r1)
            r2.<init>(r5, r1)
            r2.u()
            r8.F = r2
            r0.q(r3)
            java.lang.Object r0 = r2.s()
            if (r0 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r7 = r0
            r0 = r9
            r9 = r7
        L6f:
            boolean r9 = defpackage.c16.i(r9, r0)
            if (r9 == 0) goto L78
            pvc r8 = defpackage.pvc.a
            return r8
        L78:
            r0 = -9223372036854775808
            r8.I = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4a.a0(y4a, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.o(r1) == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(defpackage.y4a r8, defpackage.n42 r9) {
        /*
            sw7 r0 = r8.G
            boolean r1 = r9 instanceof defpackage.x4a
            if (r1 == 0) goto L15
            r1 = r9
            x4a r1 = (defpackage.x4a) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            x4a r1 = new x4a
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.b
            int r2 = r1.d
            r3 = 0
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.a
            defpackage.hre.r(r9)
            goto L7b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.a
            defpackage.hre.r(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.hre.r(r9)
            hm8 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.a = r9
            r1.d = r5
            java.lang.Object r2 = r0.o(r1)
            if (r2 != r6) goto L50
            goto L77
        L50:
            java.lang.Object r2 = r8.d
            boolean r2 = defpackage.c16.i(r9, r2)
            if (r2 == 0) goto L5c
            r0.q(r3)
            goto L81
        L5c:
            r1.a = r9
            r1.d = r4
            f61 r2 = new f61
            m42 r1 = defpackage.w92.t(r1)
            r2.<init>(r5, r1)
            r2.u()
            r8.F = r2
            r0.q(r3)
            java.lang.Object r0 = r2.s()
            if (r0 != r6) goto L78
        L77:
            return r6
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            boolean r1 = defpackage.c16.i(r9, r0)
            if (r1 == 0) goto L84
        L81:
            pvc r8 = defpackage.pvc.a
            return r8
        L84:
            r1 = -9223372036854775808
            r8.I = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4a.b0(y4a, n42):java.lang.Object");
    }

    public static void e0(r4a r4aVar, long j) {
        long j2 = r4aVar.a + j;
        r4aVar.a = j2;
        long j3 = r4aVar.h;
        if (j2 >= j3) {
            r4aVar.d = 1.0f;
            return;
        }
        r4d r4dVar = r4aVar.b;
        fs fsVar = r4aVar.e;
        if (r4dVar != null) {
            fs fsVar2 = r4aVar.f;
            if (fsVar2 == null) {
                fsVar2 = O;
            }
            r4aVar.d = dce.m(((fs) r4dVar.u(j2, fsVar, P, fsVar2)).a(0), nae.e, 1.0f);
            return;
        }
        float f = ((float) j2) / ((float) j3);
        float f2 = 1.0f - f;
        r4aVar.d = (f * 1.0f) + (f2 * fsVar.a(0));
    }

    @Override // defpackage.c3e
    public final Object B() {
        return this.b.getValue();
    }

    @Override // defpackage.c3e
    public final void I(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.c3e
    public final void K(tkc tkcVar) {
        tkc tkcVar2 = this.e;
        if (tkcVar2 != null && !tkcVar.equals(tkcVar2)) {
            tkc tkcVar3 = this.e;
            g39.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + tkcVar3 + ", new instance: " + tkcVar);
        }
        this.e = tkcVar;
    }

    @Override // defpackage.c3e
    public final void L() {
        this.e = null;
        sra sraVar = this.D;
        if (sraVar != null) {
            sraVar.b(this);
        }
    }

    public final Object c0(n42 n42Var) {
        float v = ote.v(n42Var.getContext());
        int i = (v > nae.e ? 1 : (v == nae.e ? 0 : -1));
        pvc pvcVar = pvc.a;
        if (i <= 0) {
            d0();
            return pvcVar;
        }
        this.M = v;
        Object m0 = cqe.i(n42Var.getContext()).m0(this.N, n42Var);
        if (m0 == n82.a) {
            return m0;
        }
        return pvcVar;
    }

    public final void d0() {
        tkc tkcVar = this.e;
        if (tkcVar != null) {
            tkcVar.c();
        }
        this.J.d();
        if (this.K != null) {
            this.K = null;
            h0(1.0f);
            g0();
        }
    }

    public final Object f0(float f, Object obj, aab aabVar) {
        if (nae.e > f || f > 1.0f) {
            g39.a("Expecting fraction between 0 and 1. Got " + f);
        }
        tkc tkcVar = this.e;
        if (tkcVar != null) {
            Object a = pw7.a(this.H, new v4a(obj, this.b.getValue(), this, tkcVar, f, null), aabVar);
            if (a == n82.a) {
                return a;
            }
        }
        return pvc.a;
    }

    public final void g0() {
        tkc tkcVar = this.e;
        if (tkcVar == null) {
            return;
        }
        tkcVar.l(k27.B(this.E.h() * ((Number) tkcVar.m.getValue()).longValue()));
    }

    public final void h0(float f) {
        this.E.i(f);
    }

    public final void i0(sra sraVar) {
        d89 d89Var;
        if (!c16.i(this.D, sraVar)) {
            sra sraVar2 = this.D;
            if (sraVar2 != null) {
                sraVar2.b(this);
            }
            sra sraVar3 = this.D;
            if (sraVar3 != null && (d89Var = sraVar3.h) != null) {
                d89Var.a();
            }
            this.D = sraVar;
            if (sraVar != null) {
                sraVar.e();
            }
            sra sraVar4 = this.D;
            if (sraVar4 != null) {
                sraVar4.d(this, bze.e, this.C);
            }
        }
    }

    @Override // defpackage.c3e
    public final Object z() {
        return this.c.getValue();
    }
}
