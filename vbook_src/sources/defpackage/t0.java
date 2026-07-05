package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t0  reason: default package */
/* loaded from: classes.dex */
public abstract class t0 extends m03 implements c19, l86, z7a, wx1, r78, su5, ax4 {
    public yu7 M;
    public iu5 N;
    public boolean O;
    public String P;
    public xt9 Q;
    public boolean R;
    public vt4 S;
    public final mn4 T;
    public iu5 U;
    public cx4 V;
    public String W = "idle";
    public f03 X;
    public l59 Y;
    public ga5 Z;
    public final cv7 a0;
    public long b0;
    public l59 c0;
    public yu7 d0;
    public boolean e0;
    public iya f0;

    public t0(yu7 yu7Var, iu5 iu5Var, boolean z, boolean z2, String str, xt9 xt9Var, vt4 vt4Var) {
        this.M = yu7Var;
        this.N = iu5Var;
        this.O = z;
        this.P = str;
        this.Q = xt9Var;
        this.R = z2;
        this.S = vt4Var;
        this.T = new mn4(yu7Var, 0, new m0(1, this, t0.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        cv7 cv7Var = zx6.a;
        this.a0 = new cv7();
        this.b0 = 0L;
        yu7 yu7Var2 = this.M;
        this.d0 = yu7Var2;
        this.e0 = yu7Var2 == null;
    }

    @Override // defpackage.mq7
    public final void A1() {
        M1();
        if (this.d0 == null) {
            this.M = null;
        }
        f03 f03Var = this.X;
        if (f03Var != null) {
            I1(f03Var);
        }
        this.X = null;
        cx4 cx4Var = this.V;
        if (cx4Var != null) {
            I1(cx4Var);
        }
        this.V = null;
    }

    @Override // defpackage.l86
    public final boolean H(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zl9, java.lang.Object] */
    public final boolean L1() {
        ?? obj = new Object();
        dae.E(this, cx4.L, new im(7, new xi1(0, obj)));
        if (obj.a == null) {
            int i = aj1.b;
            ViewParent parent = xoe.o(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
                parent = viewGroup.getParent();
            }
            return false;
        }
        return true;
    }

    public final void M1() {
        yu7 yu7Var = this.M;
        cv7 cv7Var = this.a0;
        if (yu7Var != null) {
            l59 l59Var = this.Y;
            if (l59Var != null) {
                yu7Var.c(new k59(l59Var));
            }
            l59 l59Var2 = this.c0;
            if (l59Var2 != null) {
                yu7Var.c(new k59(l59Var2));
            }
            ga5 ga5Var = this.Z;
            if (ga5Var != null) {
                yu7Var.c(new ha5(ga5Var));
            }
            Object[] objArr = cv7Var.c;
            long[] jArr = cv7Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                yu7Var.c(new k59((l59) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        this.Y = null;
        this.c0 = null;
        this.Z = null;
        cv7Var.a();
    }

    public final long N1(long j) {
        long f1 = voe.v(this).V.f1(((ucd) nye.q(this, dy1.t)).d());
        return (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (f1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (f1 >> 32)) - ((int) (j >> 32))) / 2.0f) << 32);
    }

    public final void O1(boolean z) {
        l59 l59Var;
        kb3 kb3Var;
        yu7 yu7Var = this.M;
        if (yu7Var != null) {
            iya iyaVar = this.f0;
            if (iyaVar != null && iyaVar.isActive()) {
                iya iyaVar2 = this.f0;
                if (iyaVar2 != null) {
                    iyaVar2.cancel(null);
                }
            } else {
                if (z) {
                    l59Var = this.c0;
                } else {
                    l59Var = this.Y;
                }
                if (l59Var != null) {
                    k59 k59Var = new k59(l59Var);
                    w26 w26Var = (w26) ((m41) v1()).b.get(r0f.I);
                    if (w26Var != null) {
                        kb3Var = w26Var.invokeOnCompletion(new k0(0, yu7Var, k59Var));
                    } else {
                        kb3Var = null;
                    }
                    z87.v(v1(), null, null, new n0(yu7Var, k59Var, kb3Var, null, 0), 3);
                }
            }
            if (z) {
                this.c0 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public final void P1(boolean z, long j) {
        l59 l59Var;
        yu7 yu7Var = this.M;
        if (yu7Var != null) {
            iya iyaVar = this.f0;
            if (iyaVar != null && iyaVar.isActive()) {
                iyaVar.cancel(null);
                z87.v(v1(), null, null, new o0(iyaVar, j, yu7Var, (m42) null, 0), 3);
            } else {
                if (z) {
                    l59Var = this.c0;
                } else {
                    l59Var = this.Y;
                }
                if (l59Var != null) {
                    z87.v(v1(), null, null, new p0(l59Var, yu7Var, null), 3);
                }
            }
            if (z) {
                this.c0 = null;
            } else {
                this.Y = null;
            }
        }
    }

    public final void Q1(ku5 ku5Var) {
        yu7 yu7Var = this.M;
        if (yu7Var != null) {
            l59 l59Var = new l59(ku5Var.c);
            if (L1()) {
                this.f0 = z87.v(v1(), null, null, new q0(yu7Var, l59Var, this, null, 0), 3);
                return;
            }
            this.c0 = l59Var;
            z87.v(v1(), null, null, new p0(yu7Var, l59Var, null, 1), 3);
        }
    }

    public final void R1(z09 z09Var) {
        yu7 yu7Var = this.M;
        if (yu7Var != null) {
            l59 l59Var = new l59(z09Var.c);
            if (L1()) {
                this.f0 = z87.v(v1(), null, null, new q0(yu7Var, l59Var, this, null, 1), 3);
                return;
            }
            this.Y = l59Var;
            z87.v(v1(), null, null, new p0(yu7Var, l59Var, null, 2), 3);
        }
    }

    @Override // defpackage.r78
    public final void S0() {
        if (this.O) {
            iue.R(this, new j0(this, 0));
        }
    }

    public final void S1() {
        iu5 iu5Var;
        if (this.X == null) {
            if (this.O) {
                iu5Var = this.U;
            } else {
                iu5Var = this.N;
            }
            if (iu5Var != null) {
                if (this.M == null) {
                    this.M = new yu7();
                }
                this.T.L1(this.M);
                yu7 yu7Var = this.M;
                yu7Var.getClass();
                f03 a = iu5Var.a(yu7Var);
                H1(a);
                this.X = a;
            }
        }
    }

    public abstract boolean U1(KeyEvent keyEvent);

    public abstract void V1(KeyEvent keyEvent);

    public final void W1() {
        X1();
        this.S.invoke();
    }

    public final void X1() {
        nsa nsaVar = (nsa) nye.q(this, dy1.v);
        if (nsaVar != null) {
            nsaVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        if (r3.X == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y1(defpackage.yu7 r4, defpackage.iu5 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.xt9 r9, defpackage.vt4 r10) {
        /*
            r3 = this;
            yu7 r0 = r3.d0
            boolean r0 = defpackage.c16.i(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.M1()
            r3.d0 = r4
            r3.M = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            iu5 r0 = r3.N
            boolean r0 = defpackage.c16.i(r0, r5)
            if (r0 != 0) goto L1f
            r3.N = r5
            r4 = r1
        L1f:
            boolean r5 = r3.O
            if (r5 == r6) goto L2b
            r3.O = r6
            if (r6 == 0) goto L2a
            r3.S0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.R
            r6 = 0
            mn4 r0 = r3.T
            if (r5 == r7) goto L52
            if (r7 == 0) goto L38
            r3.H1(r0)
            goto L3e
        L38:
            r3.I1(r0)
            r3.M1()
        L3e:
            defpackage.ak0.t(r3)
            if (r7 != 0) goto L50
            cx4 r5 = r3.V
            if (r5 == 0) goto L4a
            r3.I1(r5)
        L4a:
            r3.V = r6
            java.lang.String r5 = "idle"
            r3.W = r5
        L50:
            r3.R = r7
        L52:
            java.lang.String r5 = r3.P
            boolean r5 = defpackage.c16.i(r5, r8)
            if (r5 != 0) goto L5f
            r3.P = r8
            defpackage.ak0.t(r3)
        L5f:
            xt9 r5 = r3.Q
            boolean r5 = defpackage.c16.i(r5, r9)
            if (r5 != 0) goto L6c
            r3.Q = r9
            defpackage.ak0.t(r3)
        L6c:
            r3.S = r10
            boolean r5 = r3.e0
            yu7 r7 = r3.d0
            if (r7 != 0) goto L76
            r8 = r1
            goto L77
        L76:
            r8 = r2
        L77:
            if (r5 == r8) goto L85
            if (r7 != 0) goto L7c
            r2 = r1
        L7c:
            r3.e0 = r2
            if (r2 != 0) goto L85
            f03 r5 = r3.X
            if (r5 != 0) goto L85
            goto L86
        L85:
            r1 = r4
        L86:
            if (r1 == 0) goto L9a
            f03 r4 = r3.X
            if (r4 != 0) goto L90
            boolean r5 = r3.e0
            if (r5 != 0) goto L9a
        L90:
            if (r4 == 0) goto L95
            r3.I1(r4)
        L95:
            r3.X = r6
            r3.S1()
        L9a:
            yu7 r3 = r3.M
            r0.L1(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.Y1(yu7, iu5, boolean, boolean, java.lang.String, xt9, vt4):void");
    }

    public void b0(r09 r09Var, s09 s09Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.b0 = (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        S1();
        if (this.R) {
            if (this.V == null) {
                cx4 cx4Var = new cx4(this);
                H1(cx4Var);
                this.V = cx4Var;
            }
            if (s09Var == s09.b) {
                int i = r09Var.f;
                if (i == 4) {
                    z87.v(v1(), null, null, new s0(this, null, 0), 3);
                } else if (i == 5) {
                    z87.v(v1(), null, null, new s0(this, null, 1), 3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
    @Override // defpackage.l86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g0(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r11.S1()
            long r0 = defpackage.gae.i(r12)
            boolean r2 = r11.R
            r3 = 3
            r4 = 0
            cv7 r5 = r11.a0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4a
            int r2 = defpackage.gae.j(r12)
            r8 = 2
            if (r2 != r8) goto L4a
            boolean r2 = defpackage.lbe.o(r12)
            if (r2 == 0) goto L4a
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L40
            l59 r2 = new l59
            long r9 = r11.b0
            r2.<init>(r9)
            r5.i(r2, r0)
            yu7 r0 = r11.M
            if (r0 == 0) goto L3e
            m82 r0 = r11.v1()
            r0 r1 = new r0
            r1.<init>(r11, r2, r4, r8)
            defpackage.z87.v(r0, r4, r4, r1, r3)
        L3e:
            r0 = r6
            goto L41
        L40:
            r0 = r7
        L41:
            boolean r11 = r11.U1(r12)
            if (r11 != 0) goto L77
            if (r0 == 0) goto L78
            goto L77
        L4a:
            boolean r2 = r11.R
            if (r2 == 0) goto L78
            int r2 = defpackage.gae.j(r12)
            if (r2 != r6) goto L78
            boolean r2 = defpackage.lbe.o(r12)
            if (r2 == 0) goto L78
            java.lang.Object r0 = r5.g(r0)
            l59 r0 = (defpackage.l59) r0
            if (r0 == 0) goto L75
            yu7 r1 = r11.M
            if (r1 == 0) goto L72
            m82 r1 = r11.v1()
            r0 r2 = new r0
            r2.<init>(r11, r0, r4, r3)
            defpackage.z87.v(r1, r4, r4, r2, r3)
        L72:
            r11.V1(r12)
        L75:
            if (r0 == 0) goto L78
        L77:
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.g0(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        xt9 xt9Var = this.Q;
        if (xt9Var != null) {
            j8a.i(l8aVar, xt9Var.a);
        }
        String str = this.P;
        j0 j0Var = new j0(this, 1);
        r76[] r76VarArr = j8a.a;
        l8aVar.a(s7a.b, new g4(str, j0Var));
        if (this.R) {
            this.T.m1(l8aVar);
        } else {
            l8aVar.a(h8a.j, pvc.a);
        }
        K1(l8aVar);
    }

    @Override // defpackage.z7a
    public final boolean o1() {
        return true;
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.ax4
    public final String x0() {
        return this.W;
    }

    @Override // defpackage.mq7
    public final void z1() {
        S0();
        if (!this.e0) {
            S1();
        }
        if (this.R) {
            H1(this.T);
        }
    }

    public void T1() {
    }

    public void K1(l8a l8aVar) {
    }
}
