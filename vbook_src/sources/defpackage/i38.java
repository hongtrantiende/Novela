package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i38  reason: default package */
/* loaded from: classes.dex */
public abstract class i38 extends ry6 implements w27, sc6 {
    public static final qs9 p0 = new qs9();
    public static final ic6 q0 = new ic6();
    public static final float[] r0 = l27.a();
    public static final c38 s0 = new Object();
    public static final d38 t0 = new d38(0);
    public final od6 O;
    public boolean P;
    public boolean Q;
    public i38 R;
    public i38 S;
    public boolean T;
    public boolean U;
    public xt4 V;
    public r13 W;
    public tc6 X;
    public c37 Z;
    public gv7 a0;
    public float c0;
    public sv7 d0;
    public ic6 e0;
    public boolean g0;
    public boolean h0;
    public p15 i0;
    public k61 j0;
    public jh k0;
    public boolean m0;
    public vg8 n0;
    public p15 o0;
    public float Y = 0.8f;
    public long b0 = 0;
    public wea f0 = lre.g;
    public final f38 l0 = new f38(this, 1);

    public i38(od6 od6Var) {
        this.O = od6Var;
        this.W = od6Var.V;
        this.X = od6Var.W;
    }

    public static i38 Z1(sc6 sc6Var) {
        uy6 uy6Var;
        i38 i38Var;
        if (sc6Var instanceof uy6) {
            uy6Var = (uy6) sc6Var;
        } else {
            uy6Var = null;
        }
        if (uy6Var != null && (i38Var = uy6Var.a.O) != null) {
            return i38Var;
        }
        sc6Var.getClass();
        return (i38) sc6Var;
    }

    public final i38 A1(i38 i38Var) {
        od6 od6Var = i38Var.O;
        od6 od6Var2 = this.O;
        if (od6Var == od6Var2) {
            mq7 E1 = i38Var.E1();
            mq7 E12 = E1();
            if (!E12.a.J) {
                lv5.c("visitLocalAncestors called on an unattached node");
            }
            for (mq7 mq7Var = E12.a.e; mq7Var != null; mq7Var = mq7Var.e) {
                if ((mq7Var.c & 2) != 0 && mq7Var == E1) {
                    return i38Var;
                }
            }
            return this;
        }
        while (od6Var.M > od6Var2.M) {
            od6Var = od6Var.v();
            od6Var.getClass();
        }
        od6 od6Var3 = od6Var2;
        while (od6Var3.M > od6Var.M) {
            od6Var3 = od6Var3.v();
            od6Var3.getClass();
        }
        while (od6Var != od6Var3) {
            od6Var = od6Var.v();
            od6Var3 = od6Var3.v();
            if (od6Var != null) {
                if (od6Var3 == null) {
                }
            }
            vs.m("layouts are not part of the same hierarchy");
            return null;
        }
        if (od6Var3 != od6Var2) {
            if (od6Var != i38Var.O) {
                return (wv5) od6Var.c0.d;
            }
            return i38Var;
        }
        return this;
    }

    public final long B1(boolean z, long j) {
        if (z || !this.H) {
            long j2 = this.b0;
            j = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
        }
        vg8 vg8Var = this.n0;
        if (vg8Var != null) {
            s15 s15Var = (s15) vg8Var;
            float[] a = s15Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!s15Var.O) {
                return l27.c(j, a);
            }
        }
        return j;
    }

    public abstract ty6 C1();

    public final long D1() {
        return this.W.f1(this.O.X.d());
    }

    @Override // defpackage.sc6
    public final void E(sc6 sc6Var, float[] fArr) {
        i38 Z1 = Z1(sc6Var);
        Z1.N1();
        i38 A1 = A1(Z1);
        l27.f(fArr);
        Z1.c2(A1, fArr);
        b2(A1, fArr);
    }

    public abstract mq7 E1();

    public final mq7 F1(int i) {
        boolean g = o38.g(i);
        mq7 E1 = E1();
        if (g || (E1 = E1.e) != null) {
            for (mq7 G1 = G1(g); G1 != null && (G1.d & i) != 0; G1 = G1.f) {
                if ((G1.c & i) != 0) {
                    return G1;
                }
                if (G1 == E1) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.O.V.G0();
    }

    public final mq7 G1(boolean z) {
        mq7 E1;
        kn knVar = this.O.c0;
        if (((i38) knVar.e) == this) {
            return (mq7) knVar.C;
        }
        i38 i38Var = this.S;
        if (z) {
            if (i38Var != null && (E1 = i38Var.E1()) != null) {
                return E1.f;
            }
            return null;
        } else if (i38Var != null) {
            return i38Var.E1();
        } else {
            return null;
        }
    }

    public final void H1(mq7 mq7Var, e38 e38Var, long j, a75 a75Var, int i, boolean z) {
        if (mq7Var == null) {
            K1(e38Var, j, a75Var, i, z);
        } else if (!e38Var.d(mq7Var)) {
            H1(kte.c(mq7Var, e38Var.b()), e38Var, j, a75Var, i, z);
        } else {
            int i2 = a75Var.c;
            kv7 kv7Var = a75Var.a;
            a75Var.b(i2 + 1, kv7Var.b);
            a75Var.c++;
            kv7Var.a(mq7Var);
            a75Var.b.a(lre.a(-1.0f, z, false));
            H1(kte.c(mq7Var, e38Var.b()), e38Var, j, a75Var, i, z);
            a75Var.c = i2;
        }
    }

    public final void I1(mq7 mq7Var, e38 e38Var, long j, a75 a75Var, int i, boolean z, float f) {
        if (mq7Var == null) {
            K1(e38Var, j, a75Var, i, z);
        } else if (!e38Var.d(mq7Var)) {
            I1(kte.c(mq7Var, e38Var.b()), e38Var, j, a75Var, i, z, f);
        } else {
            int i2 = a75Var.c;
            kv7 kv7Var = a75Var.a;
            a75Var.b(i2 + 1, kv7Var.b);
            a75Var.c++;
            kv7Var.a(mq7Var);
            a75Var.b.a(lre.a(f, z, false));
            S1(kte.c(mq7Var, e38Var.b()), e38Var, j, a75Var, i, z, f, true);
            a75Var.c = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (defpackage.rqe.c(r18.a(), defpackage.lre.a(r2, r7, false)) > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(defpackage.e38 r15, long r16, defpackage.a75 r18, int r19, boolean r20) {
        /*
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.b()
            mq7 r1 = r14.F1(r0)
            boolean r0 = r14.f2(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.D1()
            float r0 = r14.w1(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.c
            kv7 r7 = r5.a
            int r7 = r7.b
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = defpackage.lre.a(r0, r8, r8)
            long r9 = r5.a()
            int r2 = defpackage.rqe.c(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.I1(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.K1(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.v0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.u0()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.H1(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.D1()
            float r2 = r14.w1(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.c
            kv7 r9 = r5.a
            int r9 = r9.b
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = defpackage.lre.a(r2, r7, r8)
            long r12 = r5.a()
            int r9 = defpackage.rqe.c(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            r0.S1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i38.J1(e38, long, a75, int, boolean):void");
    }

    public void K1(e38 e38Var, long j, a75 a75Var, int i, boolean z) {
        i38 i38Var = this.R;
        if (i38Var != null) {
            i38Var.J1(e38Var, i38Var.B1(true, j), a75Var, i, z);
        }
    }

    @Override // defpackage.sc6
    public final long L(long j) {
        if (!E1().J) {
            lv5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((rg) rd6.a(this.O)).t(h0(j));
    }

    public final void L1() {
        vg8 vg8Var = this.n0;
        if (vg8Var != null) {
            ((s15) vg8Var).c();
            return;
        }
        i38 i38Var = this.S;
        if (i38Var != null) {
            i38Var.L1();
        }
    }

    public final boolean M1() {
        if (this.n0 != null && this.Y <= nae.e) {
            return true;
        }
        i38 i38Var = this.S;
        if (i38Var != null) {
            return i38Var.M1();
        }
        return false;
    }

    public final void N1() {
        this.O.d0.b();
    }

    @Override // defpackage.sc6
    public final long O(long j) {
        if (!E1().J) {
            lv5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        sc6 t = obe.t(this);
        rg rgVar = (rg) rd6.a(this.O);
        rgVar.E();
        return l0(t, y78.i(l27.c(j, rgVar.u0), t.h0(0L)), true);
    }

    public final void O1() {
        xt4 xt4Var;
        mq7 mq7Var;
        boolean g = o38.g(Token.CASE);
        mq7 G1 = G1(g);
        if (G1 != null && (G1.a.d & Token.CASE) != 0) {
            zqa f = pae.f();
            if (f != null) {
                xt4Var = f.e();
            } else {
                xt4Var = null;
            }
            zqa h = pae.h(f);
            try {
                if (g) {
                    mq7Var = E1();
                } else {
                    mq7Var = E1().e;
                    if (mq7Var == null) {
                    }
                }
                for (mq7 G12 = G1(g); G12 != null; G12 = G12.f) {
                    if ((G12.d & Token.CASE) == 0) {
                        break;
                    }
                    if ((G12.c & Token.CASE) != 0) {
                        mq7 mq7Var2 = G12;
                        gw7 gw7Var = null;
                        while (mq7Var2 != null) {
                            if (mq7Var2 instanceof i37) {
                                ((i37) mq7Var2).g(this.c);
                            } else if ((mq7Var2.c & Token.CASE) != 0 && (mq7Var2 instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                    if ((mq7Var3.c & Token.CASE) != 0) {
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
                    }
                    if (G12 == mq7Var) {
                        break;
                    }
                }
            } finally {
                pae.n(f, h, xt4Var);
            }
        }
    }

    @Override // defpackage.ry6
    public final ry6 P0() {
        return this.R;
    }

    public final void P1() {
        boolean g = o38.g(4194304);
        mq7 E1 = E1();
        if (g || (E1 = E1.e) != null) {
            for (mq7 G1 = G1(g); G1 != null && (G1.d & 4194304) != 0; G1 = G1.f) {
                if ((G1.c & 4194304) != 0) {
                    mq7 mq7Var = G1;
                    gw7 gw7Var = null;
                    while (mq7Var != null) {
                        if (mq7Var instanceof oc6) {
                            ((oc6) mq7Var).L(this);
                        } else if ((mq7Var.c & 4194304) != 0 && (mq7Var instanceof m03)) {
                            int i = 0;
                            for (mq7 mq7Var2 = ((m03) mq7Var).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                                if ((mq7Var2.c & 4194304) != 0) {
                                    i++;
                                    if (i == 1) {
                                        mq7Var = mq7Var2;
                                    } else {
                                        if (gw7Var == null) {
                                            gw7Var = new gw7(new mq7[16], 0);
                                        }
                                        if (mq7Var != null) {
                                            gw7Var.b(mq7Var);
                                            mq7Var = null;
                                        }
                                        gw7Var.b(mq7Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        mq7Var = voe.h(gw7Var);
                    }
                }
                if (G1 == E1) {
                    return;
                }
            }
        }
    }

    public final void Q1() {
        this.T = true;
        this.l0.invoke();
        W1();
        if (!py5.b(this.b0, 0L)) {
            this.O.P(this);
        }
    }

    public final void R1() {
        boolean g = o38.g(1048576);
        mq7 G1 = G1(g);
        if (G1 != null && (G1.a.d & 1048576) != 0) {
            mq7 E1 = E1();
            if (g || (E1 = E1.e) != null) {
                for (mq7 G12 = G1(g); G12 != null && (G12.d & 1048576) != 0; G12 = G12.f) {
                    if ((G12.c & 1048576) != 0) {
                        mq7 mq7Var = G12;
                        gw7 gw7Var = null;
                        while (mq7Var != null) {
                            if (!(mq7Var instanceof hn4) && (mq7Var.c & 1048576) != 0 && (mq7Var instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var2 = ((m03) mq7Var).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                                    if ((mq7Var2.c & 1048576) != 0) {
                                        i++;
                                        if (i == 1) {
                                            mq7Var = mq7Var2;
                                        } else {
                                            if (gw7Var == null) {
                                                gw7Var = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var != null) {
                                                gw7Var.b(mq7Var);
                                                mq7Var = null;
                                            }
                                            gw7Var.b(mq7Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            mq7Var = voe.h(gw7Var);
                        }
                    }
                    if (G12 == E1) {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.mw8, defpackage.w27
    public final Object S() {
        od6 od6Var = this.O;
        if (!od6Var.c0.j(64)) {
            return null;
        }
        E1();
        Object obj = null;
        for (mq7 mq7Var = (hkb) od6Var.c0.f; mq7Var != null; mq7Var = mq7Var.e) {
            if ((mq7Var.c & 64) != 0) {
                mq7 mq7Var2 = mq7Var;
                gw7 gw7Var = null;
                while (mq7Var2 != null) {
                    if (mq7Var2 instanceof jm8) {
                        obj = ((jm8) mq7Var2).j(od6Var.V, obj);
                    } else if ((mq7Var2.c & 64) != 0 && (mq7Var2 instanceof m03)) {
                        int i = 0;
                        for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                            if ((mq7Var3.c & 64) != 0) {
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
            }
        }
        return obj;
    }

    public final void S1(mq7 mq7Var, e38 e38Var, long j, a75 a75Var, int i, boolean z, float f, boolean z2) {
        int j2;
        int j3;
        if (mq7Var == null) {
            K1(e38Var, j, a75Var, i, z);
        } else if (!e38Var.d(mq7Var)) {
            S1(kte.c(mq7Var, e38Var.b()), e38Var, j, a75Var, i, z, f, z2);
        } else {
            int i2 = i;
            if (i2 == 3 || i2 == 4) {
                gw7 gw7Var = null;
                mq7 mq7Var2 = mq7Var;
                while (true) {
                    if (mq7Var2 == null) {
                        break;
                    } else if (mq7Var2 instanceof c19) {
                        long O = ((c19) mq7Var2).O();
                        int i3 = (int) (j >> 32);
                        float intBitsToFloat = Float.intBitsToFloat(i3);
                        od6 od6Var = this.O;
                        tc6 tc6Var = od6Var.W;
                        int i4 = jic.b;
                        int i5 = ((Long.MIN_VALUE & O) > 0L ? 1 : ((Long.MIN_VALUE & O) == 0L ? 0 : -1));
                        tc6 tc6Var2 = tc6.a;
                        if (i5 != 0 && tc6Var != tc6Var2) {
                            j2 = h88.j(2, O);
                        } else {
                            j2 = h88.j(0, O);
                        }
                        if (intBitsToFloat >= (-j2)) {
                            float intBitsToFloat2 = Float.intBitsToFloat(i3);
                            int v0 = v0();
                            tc6 tc6Var3 = od6Var.W;
                            if (i5 != 0 && tc6Var3 != tc6Var2) {
                                j3 = h88.j(0, O);
                            } else {
                                j3 = h88.j(2, O);
                            }
                            if (intBitsToFloat2 < v0 + j3) {
                                int i6 = (int) (j & 4294967295L);
                                float intBitsToFloat3 = Float.intBitsToFloat(i6);
                                int i7 = jic.b;
                                if (intBitsToFloat3 >= (-h88.j(1, O))) {
                                    if (Float.intBitsToFloat(i6) < h88.j(3, O) + u0()) {
                                        g38 g38Var = new g38(this, mq7Var, e38Var, j, a75Var, i2, z, f, z2);
                                        bv7 bv7Var = a75Var.b;
                                        kv7 kv7Var = a75Var.a;
                                        int i8 = a75Var.c;
                                        int i9 = kv7Var.b;
                                        if (i8 == i9 - 1) {
                                            a75Var.b(i8 + 1, i9);
                                            a75Var.c++;
                                            kv7Var.a(mq7Var);
                                            bv7Var.a(lre.a(nae.e, z, true));
                                            g38Var.invoke();
                                            a75Var.c = i8;
                                            return;
                                        }
                                        long a = a75Var.a();
                                        int i10 = a75Var.c;
                                        if (rqe.k(a)) {
                                            int i11 = kv7Var.b;
                                            int i12 = i11 - 1;
                                            a75Var.c = i12;
                                            a75Var.b(i11, kv7Var.b);
                                            a75Var.c++;
                                            kv7Var.a(mq7Var);
                                            bv7Var.a(lre.a(nae.e, z, true));
                                            g38Var.invoke();
                                            a75Var.c = i12;
                                            if (rqe.j(a75Var.a()) < nae.e) {
                                                a75Var.b(i10 + 1, a75Var.c + 1);
                                            }
                                            a75Var.c = i10;
                                            return;
                                        } else if (rqe.j(a) > nae.e) {
                                            int i13 = a75Var.c;
                                            a75Var.b(i13 + 1, kv7Var.b);
                                            a75Var.c++;
                                            kv7Var.a(mq7Var);
                                            bv7Var.a(lre.a(nae.e, z, true));
                                            g38Var.invoke();
                                            a75Var.c = i13;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ((mq7Var2.c & 16) != 0 && (mq7Var2 instanceof m03)) {
                            int i14 = 0;
                            for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                if ((mq7Var3.c & 16) != 0) {
                                    i14++;
                                    if (i14 == 1) {
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
                            if (i14 == 1) {
                                i2 = i;
                            }
                        }
                        mq7Var2 = voe.h(gw7Var);
                        i2 = i;
                    }
                }
            }
            if (z2) {
                I1(mq7Var, e38Var, j, a75Var, i, z, f);
            } else {
                Y1(mq7Var, e38Var, j, a75Var, i, z, f);
            }
        }
    }

    @Override // defpackage.ry6, defpackage.xg8
    public final boolean T() {
        if (this.n0 != null && !this.T && this.O.J()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ry6
    public final boolean T0() {
        if (this.Z != null) {
            return true;
        }
        return false;
    }

    public abstract void T1(k61 k61Var, p15 p15Var);

    @Override // defpackage.ry6
    public final od6 U0() {
        return this.O;
    }

    public final void U1(long j, float f, xt4 xt4Var, p15 p15Var) {
        od6 od6Var = this.O;
        if (p15Var != null) {
            if (xt4Var != null) {
                lv5.a("both ways to create layers shouldn't be used together");
            }
            if (this.o0 != p15Var) {
                this.o0 = null;
                d2(null, false);
                this.o0 = p15Var;
            }
            if (this.n0 == null) {
                wg8 a = rd6.a(od6Var);
                jh jhVar = this.k0;
                if (jhVar == null) {
                    jh jhVar2 = new jh(4, this, new f38(this, 0));
                    this.k0 = jhVar2;
                    jhVar = jhVar2;
                }
                f38 f38Var = this.l0;
                vg8 h = ((rg) a).h(jhVar, f38Var, p15Var);
                s15 s15Var = (s15) h;
                s15Var.e(this.c);
                s15Var.d(j);
                this.n0 = h;
                od6Var.g0 = true;
                f38Var.invoke();
            }
        } else {
            if (this.o0 != null) {
                this.o0 = null;
                d2(null, false);
            }
            d2(xt4Var, false);
        }
        if (!py5.b(this.b0, j)) {
            ((rg) rd6.a(od6Var)).S(-4.0f);
            this.b0 = j;
            vg8 vg8Var = this.n0;
            if (vg8Var != null) {
                ((s15) vg8Var).d(j);
            } else {
                i38 i38Var = this.S;
                if (i38Var != null) {
                    i38Var.L1();
                }
            }
            od6Var.P(this);
            ry6.j1(this);
            wg8 wg8Var = od6Var.K;
            if (wg8Var != null) {
                ((rg) wg8Var).y(od6Var);
            }
        }
        this.c0 = f;
        if (this == ((i38) od6Var.c0.e)) {
            ((rg) rd6.a(od6Var)).getRectManager().h(od6Var);
        }
        if (!this.K) {
            O0(V0());
        }
    }

    @Override // defpackage.ry6
    public final c37 V0() {
        c37 c37Var = this.Z;
        if (c37Var != null) {
            return c37Var;
        }
        vs.k("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final void V1(sv7 sv7Var, boolean z, boolean z2) {
        long j;
        vg8 vg8Var = this.n0;
        if (vg8Var != null) {
            if (this.U) {
                if (z2) {
                    long D1 = D1();
                    float f = sv7Var.b;
                    float f2 = sv7Var.c;
                    if (sv7Var.d >= nae.e) {
                        long j2 = this.c;
                        if (f <= ((int) (j2 >> 32)) && sv7Var.e >= nae.e && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (D1 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (D1 & 4294967295L));
                            float f3 = (intBitsToFloat - (sv7Var.d - sv7Var.b)) / 2.0f;
                            if (f3 > nae.e) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (sv7Var.e - sv7Var.c)) / 2.0f;
                            if (f5 > nae.e) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.c;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (D1 >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (D1 & 4294967295L);
                            sv7Var.b(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.c;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (D1 >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (D1 & 4294967295L);
                    sv7Var.b(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.c;
                    sv7Var.b(nae.e, nae.e, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (sv7Var.c()) {
                    return;
                }
            }
            s15 s15Var = (s15) vg8Var;
            float[] b = s15Var.b();
            if (!s15Var.O) {
                if (b == null) {
                    sv7Var.b = nae.e;
                    sv7Var.c = nae.e;
                    sv7Var.d = nae.e;
                    sv7Var.e = nae.e;
                } else {
                    l27.e(b, sv7Var);
                }
            }
        }
        long j5 = this.b0;
        float f9 = (int) (j5 >> 32);
        sv7Var.b += f9;
        sv7Var.d += f9;
        float f10 = (int) (j5 & 4294967295L);
        sv7Var.c += f10;
        sv7Var.e += f10;
    }

    public final void W1() {
        if (this.n0 != null) {
            if (this.o0 != null) {
                this.o0 = null;
            }
            d2(null, false);
            this.O.Z(false);
        }
    }

    public final void X1(c37 c37Var) {
        i38 i38Var;
        c37 c37Var2 = this.Z;
        if (c37Var != c37Var2) {
            this.Z = c37Var;
            od6 od6Var = this.O;
            int i = 0;
            if (c37Var2 == null || c37Var.e() != c37Var2.e() || c37Var.d() != c37Var2.d()) {
                int e = c37Var.e();
                int d = c37Var.d();
                vg8 vg8Var = this.n0;
                if (vg8Var != null) {
                    ((s15) vg8Var).e((e << 32) | (d & 4294967295L));
                } else if (od6Var.K() && (i38Var = this.S) != null) {
                    i38Var.L1();
                }
                A0((d & 4294967295L) | (e << 32));
                if (this.V != null) {
                    e2(false);
                }
                boolean g = o38.g(4);
                mq7 E1 = E1();
                if (g || (E1 = E1.e) != null) {
                    for (mq7 G1 = G1(g); G1 != null && (G1.d & 4) != 0; G1 = G1.f) {
                        if ((G1.c & 4) != 0) {
                            mq7 mq7Var = G1;
                            gw7 gw7Var = null;
                            while (mq7Var != null) {
                                if (mq7Var instanceof zj3) {
                                    ((zj3) mq7Var).v0();
                                } else if ((mq7Var.c & 4) != 0 && (mq7Var instanceof m03)) {
                                    int i2 = 0;
                                    for (mq7 mq7Var2 = ((m03) mq7Var).L; mq7Var2 != null; mq7Var2 = mq7Var2.f) {
                                        if ((mq7Var2.c & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                mq7Var = mq7Var2;
                                            } else {
                                                if (gw7Var == null) {
                                                    gw7Var = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var != null) {
                                                    gw7Var.b(mq7Var);
                                                    mq7Var = null;
                                                }
                                                gw7Var.b(mq7Var2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                mq7Var = voe.h(gw7Var);
                            }
                        }
                        if (G1 == E1) {
                            break;
                        }
                    }
                }
                wg8 wg8Var = od6Var.K;
                if (wg8Var != null) {
                    ((rg) wg8Var).y(od6Var);
                }
                od6Var.P(this);
            }
            gv7 gv7Var = this.a0;
            if ((gv7Var != null && gv7Var.e != 0) || !c37Var.g().isEmpty()) {
                gv7 gv7Var2 = this.a0;
                Map g2 = c37Var.g();
                if (gv7Var2 != null && gv7Var2.e == g2.size()) {
                    Object[] objArr = gv7Var2.b;
                    int[] iArr = gv7Var2.c;
                    long[] jArr = gv7Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        loop0: while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = i; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        int i6 = (i3 << 3) + i5;
                                        Object obj = objArr[i6];
                                        int i7 = iArr[i6];
                                        Integer num = (Integer) g2.get((ec) obj);
                                        if (num == null || num.intValue() != i7) {
                                            break loop0;
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    return;
                                }
                            }
                            if (i3 != length) {
                                i3++;
                                i = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                od6Var.d0.p.U.f();
                gv7 gv7Var3 = this.a0;
                if (gv7Var3 == null) {
                    gv7 gv7Var4 = h78.a;
                    gv7Var3 = new gv7();
                    this.a0 = gv7Var3;
                }
                gv7Var3.a();
                for (Map.Entry entry : c37Var.g().entrySet()) {
                    gv7Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    public final void Y1(mq7 mq7Var, e38 e38Var, long j, a75 a75Var, int i, boolean z, float f) {
        int i2;
        int i3;
        if (mq7Var == null) {
            K1(e38Var, j, a75Var, i, z);
        } else if (!e38Var.d(mq7Var)) {
            Y1(kte.c(mq7Var, e38Var.b()), e38Var, j, a75Var, i, z, f);
        } else if (e38Var.a(mq7Var)) {
            h38 h38Var = new h38(this, mq7Var, e38Var, j, a75Var, i, z, f);
            bv7 bv7Var = a75Var.b;
            kv7 kv7Var = a75Var.a;
            int i4 = a75Var.c;
            int i5 = kv7Var.b;
            if (i4 == i5 - 1) {
                int i6 = i4 + 1;
                a75Var.b(i6, i5);
                a75Var.c++;
                kv7Var.a(mq7Var);
                bv7Var.a(lre.a(f, z, false));
                h38Var.invoke();
                a75Var.c = i4;
                if (i6 != kv7Var.b - 1 && !rqe.k(a75Var.a())) {
                    return;
                }
                int i7 = a75Var.c;
                int i8 = i7 + 1;
                kv7Var.k(i8);
                if (i8 >= 0 && i8 < (i3 = bv7Var.b)) {
                    long[] jArr = bv7Var.a;
                    long j2 = jArr[i8];
                    if (i8 != i3 - 1) {
                        b00.Y(jArr, jArr, i8, i7 + 2, i3);
                    }
                    bv7Var.b--;
                    return;
                }
                cy7.k("Index must be between 0 and size");
                return;
            }
            long a = a75Var.a();
            int i9 = a75Var.c;
            int i10 = kv7Var.b;
            int i11 = i10 - 1;
            a75Var.c = i11;
            a75Var.b(i10, kv7Var.b);
            a75Var.c++;
            kv7Var.a(mq7Var);
            bv7Var.a(lre.a(f, z, false));
            h38Var.invoke();
            a75Var.c = i11;
            long a2 = a75Var.a();
            if (a75Var.c + 1 < kv7Var.b - 1 && rqe.c(a, a2) > 0) {
                int i12 = i9 + 1;
                boolean k = rqe.k(a2);
                int i13 = a75Var.c;
                if (k) {
                    i2 = i13 + 2;
                } else {
                    i2 = i13 + 1;
                }
                a75Var.b(i12, i2);
            } else {
                a75Var.b(a75Var.c + 1, kv7Var.b);
            }
            a75Var.c = i9;
        } else {
            S1(kte.c(mq7Var, e38Var.b()), e38Var, j, a75Var, i, z, f, false);
        }
    }

    @Override // defpackage.sc6
    public final sc6 Z() {
        boolean z = E1().J;
        od6 od6Var = this.O;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (od6 od6Var2 = od6Var; od6Var2 != null; od6Var2 = od6Var2.v()) {
                sb.append("\n|");
                sb.append(od6Var2);
                sb.append(" isAttached=");
                sb.append(od6Var2.J());
                sb.append(" modifier=");
                sb.append(od6Var2.h0);
                sb.append(" tail=");
                sb.append(E1());
            }
            lv5.c(sb.toString());
        }
        N1();
        return ((i38) od6Var.c0.e).S;
    }

    @Override // defpackage.sc6
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ry6
    public final ry6 a1() {
        return this.S;
    }

    public final rk9 a2() {
        if (E1().J) {
            sc6 t = obe.t(this);
            sv7 sv7Var = this.d0;
            if (sv7Var == null) {
                sv7Var = new sv7(0);
                this.d0 = sv7Var;
            }
            long v1 = v1(D1());
            int i = (int) (v1 >> 32);
            sv7Var.b = -Float.intBitsToFloat(i);
            int i2 = (int) (v1 & 4294967295L);
            sv7Var.c = -Float.intBitsToFloat(i2);
            sv7Var.d = Float.intBitsToFloat(i) + v0();
            sv7Var.e = Float.intBitsToFloat(i2) + u0();
            while (this != t) {
                this.V1(sv7Var, false, true);
                if (!sv7Var.c()) {
                    this = this.S;
                    this.getClass();
                }
            }
            return new rk9(sv7Var.b, sv7Var.c, sv7Var.d, sv7Var.e);
        }
        return rk9.e;
    }

    public final void b2(i38 i38Var, float[] fArr) {
        float[] a;
        if (!c16.i(i38Var, this)) {
            i38 i38Var2 = this.S;
            i38Var2.getClass();
            i38Var2.b2(i38Var, fArr);
            if (!py5.b(this.b0, 0L)) {
                float[] fArr2 = r0;
                l27.f(fArr2);
                long j = this.b0;
                l27.k(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
                l27.j(fArr, fArr2);
            }
            vg8 vg8Var = this.n0;
            if (vg8Var != null && (a = ((s15) vg8Var).a()) != null) {
                l27.j(fArr, a);
            }
        }
    }

    public final void c2(i38 i38Var, float[] fArr) {
        while (!this.equals(i38Var)) {
            vg8 vg8Var = this.n0;
            if (vg8Var != null) {
                l27.j(fArr, ((s15) vg8Var).b());
            }
            long j = this.b0;
            if (!py5.b(j, 0L)) {
                float[] fArr2 = r0;
                l27.f(fArr2);
                l27.k(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                l27.j(fArr, fArr2);
            }
            this = this.S;
            this.getClass();
        }
    }

    @Override // defpackage.ry6
    public final long d1() {
        return this.b0;
    }

    public final void d2(xt4 xt4Var, boolean z) {
        boolean z2;
        wg8 wg8Var;
        gw7 gw7Var;
        Reference poll;
        if (xt4Var != null && this.o0 != null) {
            lv5.a("layerBlock can't be provided when explicitLayer is provided");
        }
        od6 od6Var = this.O;
        if (!z && this.V == xt4Var && c16.i(this.W, od6Var.V) && this.X == od6Var.W) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.W = od6Var.V;
        this.X = od6Var.W;
        boolean J = od6Var.J();
        f38 f38Var = this.l0;
        if (J && xt4Var != null) {
            this.V = xt4Var;
            if (this.n0 == null) {
                wg8 a = rd6.a(od6Var);
                jh jhVar = this.k0;
                if (jhVar == null) {
                    jh jhVar2 = new jh(4, this, new f38(this, 0));
                    this.k0 = jhVar2;
                    jhVar = jhVar2;
                }
                vg8 h = ((rg) a).h(jhVar, f38Var, null);
                s15 s15Var = (s15) h;
                s15Var.e(this.c);
                s15Var.d(this.b0);
                this.n0 = h;
                e2(true);
                od6Var.g0 = true;
                f38Var.invoke();
                return;
            } else if (z2) {
                e2(true);
                return;
            } else {
                return;
            }
        }
        this.V = null;
        vg8 vg8Var = this.n0;
        if (vg8Var != null) {
            s15 s15Var2 = (s15) vg8Var;
            if (!pye.n(s15Var2.b())) {
                od6Var.P(this);
            }
            s15Var2.d = null;
            s15Var2.e = null;
            s15Var2.C = true;
            s15Var2.f(false);
            m15 m15Var = s15Var2.b;
            if (m15Var != null) {
                m15Var.a(s15Var2.a);
                rg rgVar = s15Var2.c;
                hvc hvcVar = rgVar.K0;
                do {
                    gw7Var = (gw7) hvcVar.b;
                    poll = ((ReferenceQueue) hvcVar.c).poll();
                    if (poll != null) {
                        gw7Var.j(poll);
                        continue;
                    }
                } while (poll != null);
                gw7Var.b(new WeakReference(s15Var2, (ReferenceQueue) hvcVar.c));
                rgVar.V.j(s15Var2);
            }
            this.n0 = null;
            od6Var.g0 = true;
            f38Var.invoke();
            if (E1().J && od6Var.K() && (wg8Var = od6Var.K) != null) {
                ((rg) wg8Var).y(od6Var);
            }
        }
        this.m0 = false;
    }

    @Override // defpackage.sc6
    public final long e0(sc6 sc6Var, long j) {
        return l0(sc6Var, j, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e2(boolean r28) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i38.e2(boolean):void");
    }

    @Override // defpackage.r13
    public final float f() {
        return this.O.V.f();
    }

    @Override // defpackage.sc6
    public final long f0(long j) {
        if (!E1().J) {
            lv5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return l0(obe.t(this), ((rg) rd6.a(this.O)).L(j), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f2(long r24) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i38.f2(long):boolean");
    }

    @Override // defpackage.sc6
    public final rk9 g0(sc6 sc6Var, boolean z) {
        if (!E1().J) {
            lv5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sc6Var.t()) {
            lv5.c("LayoutCoordinates " + sc6Var + " is not attached!");
        }
        i38 Z1 = Z1(sc6Var);
        Z1.N1();
        i38 A1 = A1(Z1);
        sv7 sv7Var = this.d0;
        if (sv7Var == null) {
            sv7Var = new sv7(0);
            this.d0 = sv7Var;
        }
        sv7Var.b = nae.e;
        sv7Var.c = nae.e;
        sv7Var.d = (int) (sc6Var.a() >> 32);
        sv7Var.e = (int) (sc6Var.a() & 4294967295L);
        while (Z1 != A1) {
            Z1.V1(sv7Var, z, false);
            if (sv7Var.c()) {
                return rk9.e;
            }
            Z1 = Z1.S;
            Z1.getClass();
        }
        p1(A1, sv7Var, z);
        return new rk9(sv7Var.b, sv7Var.c, sv7Var.d, sv7Var.e);
    }

    @Override // defpackage.u06
    public final tc6 getLayoutDirection() {
        return this.O.W;
    }

    @Override // defpackage.sc6
    public final long h0(long j) {
        if (!E1().J) {
            lv5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        N1();
        while (this != null) {
            od6 od6Var = this.O;
            if (this == ((i38) od6Var.c0.e) && !od6Var.c) {
                long b = ((rg) rd6.a(od6Var)).getRectManager().b(od6Var);
                if (!py5.b(b, 9223372034707292159L)) {
                    return hif.u(j, b);
                }
            }
            vg8 vg8Var = this.n0;
            if (vg8Var != null) {
                s15 s15Var = (s15) vg8Var;
                float[] b2 = s15Var.b();
                if (!s15Var.O) {
                    j = l27.c(j, b2);
                }
            }
            j = hif.u(j, this.b0);
            this = this.S;
        }
        return j;
    }

    @Override // defpackage.sc6
    public final long l0(sc6 sc6Var, long j, boolean z) {
        if (sc6Var instanceof uy6) {
            uy6 uy6Var = (uy6) sc6Var;
            uy6Var.a.O.N1();
            return uy6Var.l0(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        i38 Z1 = Z1(sc6Var);
        Z1.N1();
        i38 A1 = A1(Z1);
        while (Z1 != A1) {
            vg8 vg8Var = Z1.n0;
            if (vg8Var != null) {
                s15 s15Var = (s15) vg8Var;
                float[] b = s15Var.b();
                if (!s15Var.O) {
                    j = l27.c(j, b);
                }
            }
            if (z || !Z1.H) {
                j = hif.u(j, Z1.b0);
            }
            Z1 = Z1.S;
            Z1.getClass();
        }
        return q1(A1, j, z);
    }

    @Override // defpackage.sc6
    public final long m(long j) {
        long h0 = h0(j);
        rg rgVar = (rg) rd6.a(this.O);
        rgVar.E();
        return l27.c(h0, rgVar.t0);
    }

    @Override // defpackage.ry6
    public final void m1() {
        p15 p15Var = this.o0;
        long j = this.b0;
        if (p15Var != null) {
            z0(j, this.c0, p15Var);
        } else {
            x0(j, this.c0, this.V);
        }
    }

    public final void p1(i38 i38Var, sv7 sv7Var, boolean z) {
        if (i38Var != this) {
            i38 i38Var2 = this.S;
            if (i38Var2 != null) {
                i38Var2.p1(i38Var, sv7Var, z);
            }
            long j = this.b0;
            float f = (int) (j >> 32);
            sv7Var.b -= f;
            sv7Var.d -= f;
            float f2 = (int) (j & 4294967295L);
            sv7Var.c -= f2;
            sv7Var.e -= f2;
            vg8 vg8Var = this.n0;
            if (vg8Var != null) {
                s15 s15Var = (s15) vg8Var;
                float[] a = s15Var.a();
                if (!s15Var.O) {
                    if (a == null) {
                        sv7Var.b = nae.e;
                        sv7Var.c = nae.e;
                        sv7Var.d = nae.e;
                        sv7Var.e = nae.e;
                    } else {
                        l27.e(a, sv7Var);
                    }
                }
                if (this.U && z) {
                    long j2 = this.c;
                    sv7Var.b(nae.e, nae.e, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    public final long q1(i38 i38Var, long j, boolean z) {
        if (i38Var == this) {
            return j;
        }
        i38 i38Var2 = this.S;
        if (i38Var2 != null && !c16.i(i38Var, i38Var2)) {
            return B1(z, i38Var2.q1(i38Var, j, z));
        }
        return B1(z, j);
    }

    @Override // defpackage.sc6
    public final boolean t() {
        return E1().J;
    }

    public final long v1(long j) {
        return (Float.floatToRawIntBits(Math.max((float) nae.e, (Float.intBitsToFloat((int) (j >> 32)) - v0()) / 2.0f)) << 32) | (Float.floatToRawIntBits(Math.max((float) nae.e, (Float.intBitsToFloat((int) (j & 4294967295L)) - u0()) / 2.0f)) & 4294967295L);
    }

    public final float w1(long j, long j2) {
        float v0;
        float u0;
        if (v0() < Float.intBitsToFloat((int) (j2 >> 32)) || u0() < Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long v1 = v1(j2);
            float intBitsToFloat = Float.intBitsToFloat((int) (v1 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (v1 & 4294967295L));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
            if (intBitsToFloat3 < nae.e) {
                v0 = -intBitsToFloat3;
            } else {
                v0 = intBitsToFloat3 - v0();
            }
            float max = Math.max((float) nae.e, v0);
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (intBitsToFloat4 < nae.e) {
                u0 = -intBitsToFloat4;
            } else {
                u0 = intBitsToFloat4 - u0();
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max((float) nae.e, u0)) & 4294967295L);
            if ((intBitsToFloat > nae.e || intBitsToFloat2 > nae.e) && Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) <= intBitsToFloat2) {
                return y78.f(floatToRawIntBits);
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void x1(k61 k61Var, p15 p15Var) {
        boolean z;
        vg8 vg8Var = this.n0;
        if (vg8Var != null) {
            s15 s15Var = (s15) vg8Var;
            n61 n61Var = s15Var.I;
            s15Var.g();
            if (s15Var.a.a.Z() > nae.e) {
                z = true;
            } else {
                z = false;
            }
            s15Var.P = z;
            ij1 ij1Var = n61Var.b;
            ij1Var.V(k61Var);
            ij1Var.c = p15Var;
            npe.p(n61Var, s15Var.a);
            return;
        }
        long j = this.b0;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        k61Var.p(f, f2);
        y1(k61Var, p15Var);
        k61Var.p(-f, -f2);
    }

    public final void y1(k61 k61Var, p15 p15Var) {
        i38 i38Var;
        k61 k61Var2;
        p15 p15Var2;
        mq7 F1 = F1(4);
        if (F1 == null) {
            T1(k61Var, p15Var);
            return;
        }
        od6 od6Var = this.O;
        od6Var.getClass();
        qd6 sharedDrawScope = ((rg) rd6.a(od6Var)).getSharedDrawScope();
        long A = eg0.A(this.c);
        sharedDrawScope.getClass();
        gw7 gw7Var = null;
        while (F1 != null) {
            if (F1 instanceof zj3) {
                i38Var = this;
                k61Var2 = k61Var;
                p15Var2 = p15Var;
                sharedDrawScope.g(k61Var2, A, i38Var, (zj3) F1, p15Var2);
            } else {
                i38Var = this;
                k61Var2 = k61Var;
                p15Var2 = p15Var;
                if ((F1.c & 4) != 0 && (F1 instanceof m03)) {
                    int i = 0;
                    for (mq7 mq7Var = ((m03) F1).L; mq7Var != null; mq7Var = mq7Var.f) {
                        if ((mq7Var.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                F1 = mq7Var;
                            } else {
                                if (gw7Var == null) {
                                    gw7Var = new gw7(new mq7[16], 0);
                                }
                                if (F1 != null) {
                                    gw7Var.b(F1);
                                    F1 = null;
                                }
                                gw7Var.b(mq7Var);
                            }
                        }
                    }
                    if (i == 1) {
                        k61Var = k61Var2;
                        this = i38Var;
                        p15Var = p15Var2;
                    }
                }
            }
            F1 = voe.h(gw7Var);
            k61Var = k61Var2;
            this = i38Var;
            p15Var = p15Var2;
        }
    }

    @Override // defpackage.sc6
    public final void z(float[] fArr) {
        wg8 a = rd6.a(this.O);
        i38 Z1 = Z1(obe.t(this));
        c2(Z1, fArr);
        if (a instanceof o27) {
            ((rg) ((o27) a)).s(fArr);
            return;
        }
        long L = Z1.L(0L);
        if ((9223372034707292159L & L) != 9205357640488583168L) {
            l27.k(fArr, Float.intBitsToFloat((int) (L >> 32)), Float.intBitsToFloat((int) (L & 4294967295L)));
        }
    }

    @Override // defpackage.mw8
    public abstract void z0(long j, float f, p15 p15Var);

    public abstract void z1();

    @Override // defpackage.ry6
    public final sc6 S0() {
        return this;
    }
}
