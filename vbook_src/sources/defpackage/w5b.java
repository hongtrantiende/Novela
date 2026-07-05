package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w5b  reason: default package */
/* loaded from: classes.dex */
public final class w5b extends m03 implements fd6, zj3, rnc, wx1, r78, vx1 {
    public t5b M;
    public n5b N;
    public final mq9 O;
    public x5b P;
    public x5b Q;
    public p15 R;
    public ak9 S;
    public final bm1 T;
    public ew7 U;
    public gz5 V;
    public ux9 W;
    public long X;
    public tc6 Y;
    public wea Z;
    public kwe a0;
    public lea[] b0;
    public dw5[] c0;
    public lea[] d0;
    public kl3[] e0;
    public w26 f0;

    /* JADX WARN: Type inference failed for: r3v1, types: [mq9, java.lang.Object] */
    public w5b(ew7 ew7Var, n5b n5bVar) {
        this.N = n5bVar;
        ?? obj = new Object();
        obj.a = 1.0f;
        mxc mxcVar = mxc.a;
        obj.H = mxcVar;
        obj.I = mxcVar;
        this.O = obj;
        this.P = new x5b();
        this.T = new bm1(4);
        this.U = ew7Var == null ? new ew7(null) : ew7Var;
        this.X = 9205357640488583168L;
    }

    public static x5b M1(w5b w5bVar, int i) {
        x5b x5bVar = w5bVar.P;
        mq9 mq9Var = w5bVar.O;
        if ((mq9Var.m() & i) != 0) {
            x5b x5bVar2 = new x5b();
            mq9Var.p(i, x5bVar2);
            return x5bVar2;
        }
        return x5bVar;
    }

    @Override // defpackage.mq7
    public final void A1() {
        p15 p15Var = this.R;
        if (p15Var != null) {
            voe.t(this).a(p15Var);
            this.R = null;
        }
        this.S = null;
    }

    public final void K1(qd6 qd6Var, int i, wea weaVar, lea leaVar) {
        lea leaVar2;
        lea[] leaVarArr = this.d0;
        kl3 kl3Var = null;
        if (leaVarArr != null) {
            leaVar2 = (lea) b00.q0(i, leaVarArr);
        } else {
            leaVar2 = null;
        }
        kl3[] kl3VarArr = this.e0;
        if (kl3VarArr != null) {
            kl3Var = (kl3) b00.q0(i, kl3VarArr);
        }
        if (!c16.i(leaVar2, leaVar) || kl3Var == null) {
            ij1 b = voe.t(this).b();
            b.getClass();
            kl3Var = new kl3(weaVar, leaVar, b);
        }
        kl3 kl3Var2 = kl3Var;
        lea[] leaVarArr2 = this.d0;
        if (leaVarArr2 != null) {
            leaVarArr2[i] = leaVar;
        }
        kl3[] kl3VarArr2 = this.e0;
        if (kl3VarArr2 != null) {
            kl3VarArr2[i] = kl3Var2;
        }
        kl3Var2.g(qd6Var, qd6Var.a.b(), 1.0f, null);
    }

    public final void L1(qd6 qd6Var, int i, wea weaVar, lea leaVar) {
        lea leaVar2;
        lea[] leaVarArr = this.b0;
        dw5 dw5Var = null;
        if (leaVarArr != null) {
            leaVar2 = (lea) b00.q0(i, leaVarArr);
        } else {
            leaVar2 = null;
        }
        dw5[] dw5VarArr = this.c0;
        if (dw5VarArr != null) {
            dw5Var = (dw5) b00.q0(i, dw5VarArr);
        }
        if (!c16.i(leaVar2, leaVar) || dw5Var == null) {
            ij1 b = voe.t(this).b();
            b.getClass();
            dw5Var = new dw5(weaVar, leaVar, b);
        }
        dw5 dw5Var2 = dw5Var;
        lea[] leaVarArr2 = this.b0;
        if (leaVarArr2 != null) {
            leaVarArr2[i] = leaVar;
        }
        dw5[] dw5VarArr2 = this.c0;
        if (dw5VarArr2 != null) {
            dw5VarArr2[i] = dw5Var2;
        }
        dw5Var2.g(qd6Var, qd6Var.a.b(), 1.0f, null);
    }

    @Override // defpackage.rnc
    public final Object M() {
        return "StyleOuterNode";
    }

    @Override // defpackage.vx1
    public final Object N0(f99 f99Var) {
        return nye.q(this, f99Var);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [xl9, java.lang.Object] */
    public final void N1(boolean z) {
        x5b x5bVar;
        x5b x5bVar2;
        int r;
        x5b x5bVar3;
        if (this.J) {
            if (z) {
                x5bVar = null;
            } else {
                x5bVar = this.P;
            }
            if (z) {
                x5bVar2 = this.P;
            } else {
                if (this.Q == null) {
                    this.Q = new x5b();
                }
                x5bVar2 = this.Q;
                x5bVar2.getClass();
            }
            x5b x5bVar4 = x5bVar2;
            r13 r13Var = voe.v(this).V;
            ?? obj = new Object();
            mq9 mq9Var = this.O;
            rwa rwaVar = mq9Var.J;
            x5b x5bVar5 = mq9Var.c;
            if (rwaVar != null && x5bVar5 != null) {
                long l = rwaVar.l();
                if (l != 0) {
                    long j = l & 2251799813685247L;
                    int i = (int) (l >> 50);
                    x5b x5bVar6 = new x5b();
                    rwa rwaVar2 = mq9Var.J;
                    if (rwaVar2 != null && ((x5bVar3 = mq9Var.f) != null || (x5bVar3 = mq9Var.d) != null)) {
                        x5b x5bVar7 = x5bVar3;
                        x5b x5bVar8 = mq9Var.c;
                        if (x5bVar8 != null) {
                            y5b.a(x5bVar7, x5bVar8, rwaVar2, j, i, x5bVar6);
                        }
                    }
                    mq9Var.e = x5bVar6;
                } else {
                    mq9Var.e = null;
                }
            } else {
                mq9Var.e = null;
            }
            iue.R(this, new w24(this, r13Var, x5bVar4, x5bVar, obj, 4));
            int i2 = obj.a;
            if (x5bVar != null) {
                long j2 = y5b.b | y5b.c | y5b.d;
                long j3 = y5b.e;
                long j4 = j2 | j3 | y5b.f | y5b.g;
                int i3 = y5b.h | y5b.i | y5b.j;
                int i4 = y5b.k;
                long i5 = x5bVar.i(x5bVar4, j4);
                int h = x5bVar.h(i3 | i4 | y5b.l | y5b.m, x5bVar4);
                r = y5b.g(i5) | y5b.e(h);
                if ((h & 8) != 0 && ((x5bVar.a & j3) != 0 || (x5bVar.b & i4) != 0 || (j3 & x5bVar4.a) != 0 || (x5bVar4.b & i4) != 0)) {
                    r |= 4;
                }
            } else {
                r = x5bVar4.r();
            }
            int i6 = i2 | r;
            if (!c16.i(this.U.a, this.V)) {
                w26 w26Var = this.f0;
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
                gz5 gz5Var = this.U.a;
                this.V = gz5Var;
                if (gz5Var != null) {
                    this.f0 = z87.v(v1(), null, null, new koa(this, gz5Var, null, 5), 3);
                }
            }
            if (!z) {
                if ((i6 & 1) != 0) {
                    t5b t5bVar = this.M;
                    if (t5bVar != null) {
                        ube.y(t5bVar);
                    } else {
                        vs.k("StyleOuterNode with no corresponding StyleInnerNode");
                        return;
                    }
                }
                if ((i6 & 8) != 0) {
                    ube.y(this);
                }
                if ((i6 & 2) != 0) {
                    hud.o(this);
                    t5b t5bVar2 = this.M;
                    if (t5bVar2 != null) {
                        ube.x(t5bVar2);
                    } else {
                        vs.k("StyleOuterNode with no corresponding StyleInnerNode");
                        return;
                    }
                }
                if ((i6 & 4) != 0) {
                    ux9 ux9Var = this.W;
                    if (ux9Var == null) {
                        ux9Var = new ux9(this, 21);
                        this.W = ux9Var;
                    }
                    ube.F(this, ux9Var);
                }
                if ((i6 & 16) != 0 && this.a.J) {
                    voe.v(this).F();
                }
                if ((i6 & 32) != 0 && this.a.J) {
                    voe.v(this).C(true);
                }
            }
        }
    }

    @Override // defpackage.r78
    public final void S0() {
        N1(false);
    }

    /* JADX WARN: Type inference failed for: r33v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [wl9, java.lang.Object] */
    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        long j;
        hy0 hy0Var;
        hy0 hy0Var2;
        hy0 hy0Var3;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        hy0 hy0Var4;
        wea weaVar;
        x5b x5bVar;
        n61 n61Var;
        float f2;
        int i;
        long j2;
        kl3[] kl3VarArr;
        kwe a;
        float f3;
        Object obj2;
        wea weaVar2;
        int i2;
        dw5[] dw5VarArr;
        hy0 hy0Var5;
        bm1 bm1Var;
        hu4 r7Var;
        hu4 hm0Var;
        n61 n61Var2 = qd6Var.a;
        ba5 ba5Var = lre.g;
        x5b M1 = M1(this, 2);
        long j3 = zl1.i;
        if (M1.v((byte) 34)) {
            j = M1.z;
        } else {
            j = j3;
        }
        if (M1.w(51)) {
            hy0Var = M1.A;
            hy0Var.getClass();
        } else {
            hy0Var = null;
        }
        if (M1.v((byte) 36)) {
            j3 = M1.B;
        }
        if (M1.w(52)) {
            hy0Var2 = M1.C;
            hy0Var2.getClass();
        } else {
            hy0Var2 = null;
        }
        long j4 = zl1.b;
        if (M1.v((byte) 35)) {
            j4 = M1.x;
        }
        if (M1.w(50)) {
            hy0Var3 = M1.y;
            hy0Var3.getClass();
        } else {
            hy0Var3 = null;
        }
        if (M1.v((byte) 8)) {
            f = M1.k;
        } else {
            f = nae.e;
        }
        wea weaVar3 = M1.E;
        if (f / 2.0f > nae.e) {
            z = true;
        } else {
            z = false;
        }
        if (j != 16 || hy0Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j3 != 16 || hy0Var2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!M1.w(55) || (obj = M1.F) == null) {
            n61Var = n61Var2;
            x5bVar = M1;
            j2 = j4;
            hy0Var4 = hy0Var3;
            f2 = f;
        } else {
            hy0Var4 = hy0Var3;
            if (M1.w(53)) {
                weaVar = M1.E;
            } else {
                weaVar = ba5Var;
            }
            x5bVar = M1;
            lea[] leaVarArr = this.d0;
            n61Var = n61Var2;
            kl3[] kl3VarArr2 = this.e0;
            f2 = f;
            boolean z4 = obj instanceof Object[];
            if (z4) {
                i = ((Object[]) obj).length;
            } else {
                i = 1;
            }
            j2 = j4;
            if (leaVarArr != null && c16.i(this.Z, weaVar)) {
                if (leaVarArr.length != i) {
                    this.d0 = (lea[]) Arrays.copyOf(leaVarArr, i);
                    if (kl3VarArr2 != null) {
                        kl3VarArr = (kl3[]) Arrays.copyOf(kl3VarArr2, i);
                    } else {
                        kl3VarArr = new kl3[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            kl3VarArr[i3] = null;
                        }
                    }
                    this.e0 = kl3VarArr;
                }
            } else {
                lea[] leaVarArr2 = new lea[i];
                for (int i4 = 0; i4 < i; i4++) {
                    leaVarArr2[i4] = null;
                }
                this.d0 = leaVarArr2;
                kl3[] kl3VarArr3 = new kl3[i];
                for (int i5 = 0; i5 < i; i5++) {
                    kl3VarArr3[i5] = null;
                }
                this.e0 = kl3VarArr3;
            }
            if (z4) {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    Object obj3 = objArr[i6];
                    if (obj3 instanceof lea) {
                        K1(qd6Var, i6, weaVar, (lea) obj3);
                    }
                }
            } else if (obj instanceof lea) {
                K1(qd6Var, 0, weaVar, (lea) obj);
            }
        }
        long b = n61Var.b();
        if (dna.a(this.X, b) && this.Y == qd6Var.getLayoutDirection() && c16.i(this.Z, weaVar3)) {
            a = this.a0;
            a.getClass();
        } else {
            a = weaVar3.a(b, qd6Var.getLayoutDirection(), qd6Var);
        }
        this.a0 = a;
        this.X = b;
        this.Y = qd6Var.getLayoutDirection();
        if (z2) {
            if (hy0Var != null) {
                f3 = 0.0f;
                owe.w(qd6Var, a, hy0Var, nae.e, 60);
            } else {
                f3 = 0.0f;
                owe.x(qd6Var, a, j);
            }
        } else {
            f3 = 0.0f;
        }
        qd6Var.a();
        if (z3) {
            if (hy0Var2 != null) {
                owe.w(qd6Var, a, hy0Var2, f3, 60);
            } else {
                owe.x(qd6Var, a, j3);
            }
        }
        if (z) {
            if (hy0Var4 == null) {
                hy0Var5 = new esa(j2);
            } else {
                hy0Var5 = hy0Var4;
            }
            u5b u5bVar = new u5b(0, f2);
            ak9 ak9Var = this.S;
            if (ak9Var == null) {
                ak9Var = new ak9(this, 25);
                this.S = ak9Var;
            }
            final ak9 ak9Var2 = ak9Var;
            final bm1 bm1Var2 = this.T;
            bm1Var2.c = u5bVar;
            if (hy0Var5.equals((hy0) bm1Var2.d) && c16.i(a, (kwe) bm1Var2.e) && ((xt4) bm1Var2.f) != null) {
                bm1Var = bm1Var2;
            } else {
                bm1Var2.d = hy0Var5;
                bm1Var2.e = a;
                if (a instanceof sf8) {
                    final sf8 sf8Var = (sf8) a;
                    yj yjVar = sf8Var.c;
                    final rk9 g = yjVar.g();
                    final float g2 = g.g();
                    yj yjVar2 = (yj) bm1Var2.b;
                    if (yjVar2 == null) {
                        yjVar2 = dk.a();
                        bm1Var2.b = yjVar2;
                    }
                    yjVar2.l();
                    yj.c(yjVar2, g);
                    yjVar2.j(yjVar2, yjVar, 0);
                    final long ceil = (((int) Math.ceil(g.c - g.a)) << 32) | (((int) Math.ceil(g.d - g.b)) & 4294967295L);
                    final yj yjVar3 = yjVar2;
                    final hy0 hy0Var6 = hy0Var5;
                    r7Var = new xt4() { // from class: ps0
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj4) {
                            float f4;
                            long j5 = ceil;
                            yj yjVar4 = yjVar3;
                            ak3 ak3Var = (ak3) obj4;
                            u5b u5bVar2 = (u5b) bm1.this.c;
                            u5bVar2.getClass();
                            float floatValue = Float.valueOf(u5bVar2.b).floatValue();
                            if (floatValue < nae.e) {
                                f4 = 0.0f;
                            } else {
                                f4 = floatValue;
                            }
                            int i7 = ((2.0f * f4) > g2 ? 1 : ((2.0f * f4) == g2 ? 0 : -1));
                            sf8 sf8Var2 = sf8Var;
                            hy0 hy0Var7 = hy0Var6;
                            if (i7 > 0) {
                                ak3.N(ak3Var, sf8Var2.c, hy0Var7, nae.e, null, null, 0, 60);
                            } else {
                                p15 p15Var = (p15) ak9Var2.invoke();
                                p15Var.h(1);
                                rk9 rk9Var = g;
                                float f5 = rk9Var.a;
                                float f6 = rk9Var.b;
                                ((mu9) ak3Var.Q0().b).D(f5, f6);
                                try {
                                    ak3Var.R(j5, new qs0(rk9Var, sf8Var2, hy0Var7, f4, yjVar4), p15Var);
                                    npe.p(ak3Var, p15Var);
                                } finally {
                                    ((mu9) ak3Var.Q0().b).D(-f5, -f6);
                                }
                            }
                            return pvc.a;
                        }
                    };
                    bm1Var = bm1Var2;
                } else {
                    bm1Var = bm1Var2;
                    if (a instanceof uf8) {
                        ou9 ou9Var = ((uf8) a).c;
                        if (vte.g(ou9Var)) {
                            hm0Var = new r7(5, bm1Var, ou9Var, hy0Var5);
                        } else {
                            yj yjVar4 = (yj) bm1Var.b;
                            if (yjVar4 == null) {
                                yjVar4 = dk.a();
                                bm1Var.b = yjVar4;
                            }
                            yj yjVar5 = yjVar4;
                            ?? obj4 = new Object();
                            obj4.a = Float.NaN;
                            hm0Var = new hm0(bm1Var, ou9Var, (wl9) obj4, (zl9) new Object(), yjVar5, hy0Var5);
                        }
                        r7Var = hm0Var;
                    } else if (a instanceof tf8) {
                        r7Var = new r7(6, bm1Var, ((tf8) a).c, hy0Var5);
                    } else {
                        xk5.o();
                        return;
                    }
                }
                bm1Var.f = r7Var;
            }
            if (y78.d(0L, 0L)) {
                xt4 xt4Var = (xt4) bm1Var.f;
                xt4Var.getClass();
                xt4Var.invoke(qd6Var);
            } else {
                float intBitsToFloat = Float.intBitsToFloat(0);
                float intBitsToFloat2 = Float.intBitsToFloat(0);
                n61 n61Var3 = n61Var;
                ((mu9) n61Var3.b.b).D(intBitsToFloat, intBitsToFloat2);
                try {
                    xt4 xt4Var2 = (xt4) bm1Var.f;
                    xt4Var2.getClass();
                    xt4Var2.invoke(qd6Var);
                } finally {
                    ((mu9) n61Var3.b.b).D(-intBitsToFloat, -intBitsToFloat2);
                }
            }
        }
        x5b x5bVar2 = x5bVar;
        if (x5bVar2.w(56) && (obj2 = x5bVar2.G) != null) {
            if (x5bVar2.w(53)) {
                weaVar2 = x5bVar2.E;
            } else {
                weaVar2 = ba5Var;
            }
            lea[] leaVarArr3 = this.b0;
            dw5[] dw5VarArr2 = this.c0;
            boolean z5 = obj2 instanceof Object[];
            if (z5) {
                i2 = ((Object[]) obj2).length;
            } else {
                i2 = 1;
            }
            if (leaVarArr3 != null && c16.i(this.Z, weaVar2)) {
                if (leaVarArr3.length != i2) {
                    this.b0 = (lea[]) Arrays.copyOf(leaVarArr3, i2);
                    if (dw5VarArr2 != null) {
                        dw5VarArr = (dw5[]) Arrays.copyOf(dw5VarArr2, i2);
                    } else {
                        dw5VarArr = new dw5[i2];
                        for (int i7 = 0; i7 < i2; i7++) {
                            dw5VarArr[i7] = null;
                        }
                    }
                    this.c0 = dw5VarArr;
                }
            } else {
                lea[] leaVarArr4 = new lea[i2];
                for (int i8 = 0; i8 < i2; i8++) {
                    leaVarArr4[i8] = null;
                }
                this.b0 = leaVarArr4;
                dw5[] dw5VarArr3 = new dw5[i2];
                for (int i9 = 0; i9 < i2; i9++) {
                    dw5VarArr3[i9] = null;
                }
                this.c0 = dw5VarArr3;
            }
            if (z5) {
                Object[] objArr2 = (Object[]) obj2;
                int length2 = objArr2.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    Object obj5 = objArr2[i10];
                    if (obj5 instanceof lea) {
                        L1(qd6Var, i10, weaVar2, (lea) obj5);
                    }
                }
            } else if (obj2 instanceof lea) {
                L1(qd6Var, 0, weaVar2, (lea) obj2);
            }
        }
        this.Z = weaVar3;
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, final long j) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        x5b M1 = M1(this, 12);
        boolean v = M1.v((byte) 4);
        float f8 = nae.e;
        if (v) {
            f = M1.g;
        } else {
            f = 0.0f;
        }
        if (M1.v((byte) 13)) {
            f2 = M1.p;
        } else {
            f2 = 0.0f;
        }
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        final float f9 = f;
        if (M1.v((byte) 5)) {
            f3 = M1.h;
        } else {
            f3 = 0.0f;
        }
        if (M1.v((byte) 15)) {
            f4 = M1.r;
        } else {
            f4 = 0.0f;
        }
        if (!Float.isNaN(f4)) {
            f3 += f4;
        }
        if (M1.v((byte) 6)) {
            f5 = M1.i;
        } else {
            f5 = 0.0f;
        }
        if (M1.v((byte) 14)) {
            f6 = M1.q;
        } else {
            f6 = 0.0f;
        }
        if (!Float.isNaN(f6)) {
            f5 += f6;
        }
        if (M1.v((byte) 7)) {
            f7 = M1.j;
        } else {
            f7 = 0.0f;
        }
        if (M1.v((byte) 16)) {
            f8 = M1.s;
        }
        if (!Float.isNaN(f8)) {
            f7 += f8;
        }
        int round = Math.round(f9 + f3);
        int round2 = Math.round(f5 + f7);
        int k = x02.k(j) - round;
        if (k < 0) {
            k = 0;
        }
        int i6 = x02.i(j);
        if (i6 != Integer.MAX_VALUE && (i6 = i6 + round) < 0) {
            i6 = 0;
        }
        int j2 = x02.j(j) - round2;
        if (j2 < 0) {
            i = 0;
        } else {
            i = j2;
        }
        int h = x02.h(j);
        if (h != Integer.MAX_VALUE && (h = h + round2) < 0) {
            h = 0;
        }
        if (M1.v((byte) 19)) {
            i2 = Math.round(M1.w);
            if (i2 < 0) {
                i2 = 0;
            }
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (M1.v((byte) 17)) {
            i3 = Math.round(M1.v);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i2) {
                i3 = i2;
            }
        } else {
            i3 = 0;
        }
        if (M1.v((byte) 9)) {
            int round3 = Math.round(M1.l);
            if (round3 >= i3) {
                i3 = round3;
            }
            if (i3 <= i2) {
                i2 = i3;
            }
            i3 = i2;
        }
        if (i3 != 0) {
            if (i3 >= k) {
                k = i3;
            }
            if (k > i6) {
                k = i6;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            if (i2 < k) {
                i2 = k;
            }
            if (i2 <= i6) {
                i6 = i2;
            }
        }
        if (!M1.v((byte) 9)) {
            if (M1.v((byte) 11) && x02.e(j)) {
                int round4 = Math.round(i6 * M1.n);
                if (round4 >= k) {
                    k = round4;
                }
                if (k > i6) {
                    k = i6;
                }
                i6 = k;
            } else if (M1.v((byte) 13) && M1.v((byte) 15)) {
                k = i6;
            }
        }
        if (M1.v((byte) 20)) {
            i4 = Math.round(M1.u);
            if (i4 < 0) {
                i4 = 0;
            }
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (M1.v((byte) 18)) {
            i5 = Math.round(M1.t);
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 > i4) {
                i5 = i4;
            }
        } else {
            i5 = 0;
        }
        if (M1.v((byte) 10)) {
            int round5 = Math.round(M1.m);
            if (round5 >= i5) {
                i5 = round5;
            }
            if (i5 <= i4) {
                i4 = i5;
            }
            i5 = i4;
        }
        if (i5 != 0) {
            if (i5 >= i) {
                i = i5;
            }
            if (i > h) {
                i = h;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            if (i4 < i) {
                i4 = i;
            }
            if (i4 <= h) {
                h = i4;
            }
        }
        if (!M1.v((byte) 10)) {
            if (M1.v((byte) 12) && x02.d(j)) {
                int round6 = Math.round(h * M1.o);
                if (round6 >= i) {
                    i = round6;
                }
                if (i > h) {
                    i = h;
                }
                h = i;
            } else if (M1.v((byte) 14) && M1.v((byte) 16)) {
                i = h;
            }
        }
        final mw8 M = w27Var.M(y02.a(k, i6, i, h));
        final float f10 = f3;
        final float f11 = f5;
        final float f12 = f7;
        return e37Var.q0(M.a + round, M.b + round2, ls3.a, new xt4() { // from class: v5b
            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int round7;
                int round8;
                lw8 lw8Var = (lw8) obj;
                w5b w5bVar = w5b.this;
                x5b M12 = w5b.M1(w5bVar, 12);
                boolean v2 = M12.v((byte) 13);
                long j3 = j;
                mw8 mw8Var = M;
                if (!v2 && M12.v((byte) 15)) {
                    round7 = (x02.i(j3) - mw8Var.a) - Math.round(f10);
                } else {
                    round7 = Math.round(f9);
                }
                if (M12.v((byte) 16) && !M12.v((byte) 14)) {
                    round8 = (x02.h(j3) - mw8Var.b) - Math.round(f12);
                } else {
                    round8 = Math.round(f11);
                }
                if ((M12.r() & 4) == 0) {
                    lw8Var.o(mw8Var, round7, round8, nae.e);
                } else {
                    ux9 ux9Var = w5bVar.W;
                    if (ux9Var == null) {
                        ux9Var = new ux9(w5bVar, 21);
                        w5bVar.W = ux9Var;
                    }
                    lw8.L(lw8Var, mw8Var, round7, round8, ux9Var, 4);
                }
                return pvc.a;
            }
        });
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }
}
