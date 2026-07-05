package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rv4  reason: default package */
/* loaded from: classes.dex */
public final class rv4 {
    public int A;
    public int B;
    public boolean C;
    public final qv4 D;
    public final ArrayList E;
    public boolean F;
    public aqa G;
    public bqa H;
    public eqa I;
    public boolean J;
    public xt8 K;
    public pa1 L;
    public final bx1 M;
    public lv4 N;
    public wh4 O;
    public rka P;
    public final sx1 Q;
    public final d82 R;
    public boolean S;
    public long T;
    public tv4 U;
    public final f0 a;
    public final px1 b;
    public final bqa c;
    public final wv7 d;
    public final pa1 e;
    public final pa1 f;
    public final mu9 g;
    public final ux1 h;
    public vv4 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public uu7 p;
    public boolean q;
    public boolean r;
    public wu7 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final bz5 n = new bz5(1, false);
    public final ArrayList s = new ArrayList();
    public final bz5 t = new bz5(1, false);
    public xt8 u = xt8.d;
    public final bz5 x = new bz5(1, false);
    public int z = -1;

    public rv4(f0 f0Var, px1 px1Var, bqa bqaVar, wv7 wv7Var, pa1 pa1Var, pa1 pa1Var2, mu9 mu9Var, ux1 ux1Var) {
        boolean z;
        this.a = f0Var;
        this.b = px1Var;
        this.c = bqaVar;
        this.d = wv7Var;
        this.e = pa1Var;
        this.f = pa1Var2;
        this.g = mu9Var;
        this.h = ux1Var;
        if (!px1Var.g() && !px1Var.e()) {
            z = false;
        } else {
            z = true;
        }
        this.C = z;
        this.D = new qv4(this, 0);
        this.E = new ArrayList();
        aqa e = bqaVar.e();
        e.c();
        this.G = e;
        bqa bqaVar2 = new bqa();
        if (px1Var.g()) {
            bqaVar2.b();
        }
        if (px1Var.e()) {
            bqaVar2.G = new wu7();
        }
        this.H = bqaVar2;
        eqa f = bqaVar2.f();
        f.e(true);
        this.I = f;
        this.M = new bx1(this, pa1Var);
        aqa e2 = this.H.e();
        try {
            lv4 a = e2.a(0);
            e2.c();
            this.N = a;
            this.O = new wh4();
            this.Q = new sx1(this);
            d82 k = px1Var.k();
            d82 C = C();
            this.R = k.plus(C == null ? gs3.a : C);
        } catch (Throwable th) {
            e2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ls7 R(int r13, defpackage.rv4 r14) {
        /*
            aqa r0 = r14.G
            int r0 = r0.i(r13)
            aqa r1 = r14.G
            int[] r2 = r1.b
            java.lang.Object r1 = r1.p(r13, r2)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L94
            boolean r0 = r1 instanceof defpackage.js7
            if (r0 == 0) goto L94
            aqa r0 = r14.G
            boolean r0 = r0.d(r13)
            if (r0 == 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            S(r14, r0, r13)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            r12 = r0
            goto L31
        L30:
            r12 = r3
        L31:
            aqa r0 = r14.G
            int[] r1 = r0.b
            java.lang.Object r0 = r0.p(r13, r1)
            r0.getClass()
            r5 = r0
            js7 r5 = (defpackage.js7) r5
            aqa r0 = r14.G
            r1 = 0
            java.lang.Object r6 = r0.h(r13, r1)
            aqa r0 = r14.G
            lv4 r9 = r0.a(r13)
            aqa r0 = r14.G
            int[] r0 = r0.b
            int r1 = r13 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = r14.s
            int r2 = defpackage.xwe.f(r13, r1)
            if (r2 >= 0) goto L67
            int r2 = r2 + 1
            int r2 = -r2
        L67:
            int r3 = r1.size()
            if (r2 >= r3) goto L86
            java.lang.Object r3 = r1.get(r2)
            t16 r3 = (defpackage.t16) r3
            int r4 = r3.b
            if (r4 >= r0) goto L86
            ek9 r4 = r3.a
            java.lang.Object r3 = r3.c
            yk8 r7 = new yk8
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L67
        L86:
            ls7 r4 = new ls7
            ux1 r7 = r14.h
            bqa r8 = r14.c
            xt8 r11 = r14.m(r13)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.R(int, rv4):ls7");
    }

    public static final void S(rv4 rv4Var, ArrayList arrayList, int i) {
        int i2 = rv4Var.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (rv4Var.G.j(i3)) {
                ls7 R = R(i3, rv4Var);
                if (R != null) {
                    arrayList.add(R);
                }
            } else if (rv4Var.G.d(i3)) {
                S(rv4Var, arrayList, i3);
            }
            i3 += rv4Var.G.b[(i3 * 5) + 3];
        }
    }

    public static final int T(rv4 rv4Var, int i, int i2, boolean z, int i3) {
        int i4;
        boolean z2;
        int i5;
        wv4 wv4Var;
        Object obj;
        long[] jArr;
        Object[] objArr;
        int i6;
        long[] jArr2;
        Object[] objArr2;
        int i7;
        int i8;
        int o;
        aqa aqaVar = rv4Var.G;
        int i9 = 0;
        if (aqaVar.j(i2)) {
            int i10 = aqaVar.i(i2);
            Object p = aqaVar.p(i2, aqaVar.b);
            if (i10 == 126665345 && (p instanceof js7)) {
                ls7 R = R(i2, rv4Var);
                if (R != null) {
                    rv4Var.b.c(R);
                    rv4Var.M.e();
                    bx1 bx1Var = rv4Var.M;
                    ux1 ux1Var = rv4Var.h;
                    px1 px1Var = rv4Var.b;
                    re8 re8Var = bx1Var.b.d;
                    re8Var.p(zd8.c);
                    vve.n(re8Var, ux1Var, px1Var, R);
                }
                if (z && i2 != i) {
                    bx1 bx1Var2 = rv4Var.M;
                    bx1Var2.c();
                    bx1Var2.b();
                    rv4 rv4Var2 = bx1Var2.a;
                    if (rv4Var2.G.l(i2)) {
                        o = 1;
                    } else {
                        o = rv4Var2.G.o(i2);
                    }
                    if (o > 0) {
                        bx1Var2.f(i3, o);
                    }
                    return 0;
                }
                return aqaVar.o(i2);
            } else if (i10 == 206 && c16.i(p, ex1.e)) {
                Object h = aqaVar.h(i2, 0);
                ov4 ov4Var = null;
                if (h instanceof wv4) {
                    wv4Var = (wv4) h;
                } else {
                    wv4Var = null;
                }
                if (wv4Var != null) {
                    obj = wv4Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof ov4) {
                    ov4Var = (ov4) obj;
                }
                if (ov4Var != null) {
                    uv7 uv7Var = ov4Var.a.e;
                    Object[] objArr3 = uv7Var.b;
                    long[] jArr3 = uv7Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j = jArr3[i11];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                int i14 = i9;
                                while (i14 < i13) {
                                    if ((255 & j) < 128) {
                                        rv4 rv4Var3 = (rv4) objArr3[(i11 << 3) + i14];
                                        bqa bqaVar = rv4Var3.c;
                                        if (bqaVar.b > 0 && (bqaVar.a[1] & 67108864) != 0) {
                                            ux1 ux1Var2 = rv4Var3.h;
                                            synchronized (ux1Var2.d) {
                                                ux1Var2.s();
                                                i8 = i12;
                                                tv7 tv7Var = ux1Var2.J;
                                                ux1Var2.J = axe.h();
                                                ux1Var2.R.l0(tv7Var);
                                            }
                                            pa1 pa1Var = new pa1();
                                            rv4Var3.L = pa1Var;
                                            aqa e = rv4Var3.c.e();
                                            try {
                                                rv4Var3.G = e;
                                                bx1 bx1Var3 = rv4Var3.M;
                                                pa1 pa1Var2 = bx1Var3.b;
                                                bx1Var3.b = pa1Var;
                                                rv4Var3.Q(0);
                                                bx1 bx1Var4 = rv4Var3.M;
                                                bx1Var4.b();
                                                jArr2 = jArr3;
                                                if (bx1Var4.c) {
                                                    objArr2 = objArr3;
                                                    bx1Var4.b.d.p(ge8.c);
                                                    if (bx1Var4.c) {
                                                        bx1Var4.d(false);
                                                        bx1Var4.d(false);
                                                        bx1Var4.b.d.p(pd8.c);
                                                        i7 = 0;
                                                        bx1Var4.c = false;
                                                        bx1Var3.b = pa1Var2;
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                i7 = 0;
                                                bx1Var3.b = pa1Var2;
                                            } finally {
                                                e.c();
                                            }
                                        } else {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i7 = i9;
                                            i8 = i12;
                                        }
                                        rv4Var.b.u(rv4Var3.h);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i7 = i9;
                                        i8 = i12;
                                    }
                                    j >>= i8;
                                    i14++;
                                    i12 = i8;
                                    objArr3 = objArr2;
                                    i9 = i7;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                i6 = i9;
                                if (i13 != i12) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i6 = i9;
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                            objArr3 = objArr;
                            i9 = i6;
                            jArr3 = jArr;
                        }
                    }
                }
                return aqaVar.o(i2);
            } else {
                i4 = 1;
                if (!aqaVar.l(i2)) {
                    return aqaVar.o(i2);
                }
            }
        } else {
            i4 = 1;
            if (aqaVar.d(i2)) {
                int i15 = aqaVar.b[(i2 * 5) + 3] + i2;
                int i16 = 0;
                for (int i17 = i2 + 1; i17 < i15; i17 += aqaVar.b[(i17 * 5) + 3]) {
                    boolean l = aqaVar.l(i17);
                    if (l) {
                        rv4Var.M.c();
                        bx1 bx1Var5 = rv4Var.M;
                        Object n = aqaVar.n(i17);
                        bx1Var5.c();
                        bx1Var5.h.add(n);
                    }
                    if (!l && !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (l) {
                        i5 = 0;
                    } else {
                        i5 = i3 + i16;
                    }
                    i16 += T(rv4Var, i, i17, z2, i5);
                    if (l) {
                        rv4Var.M.c();
                        rv4Var.M.a();
                    }
                }
                if (!aqaVar.l(i2)) {
                    return i16;
                }
            } else if (!aqaVar.l(i2)) {
                return aqaVar.o(i2);
            }
        }
        return i4;
    }

    public final ek9 A() {
        if (this.A == 0) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty()) {
                return (ek9) nk2.n(1, arrayList);
            }
            return null;
        }
        return null;
    }

    public final boolean B() {
        if (E() && !this.w) {
            ek9 A = A();
            if (A == null || (A.b & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final sx1 C() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean D() {
        return this.S;
    }

    public final boolean E() {
        ek9 A;
        if (!this.S && !this.y && !this.w && (A = A()) != null && (A.b & 8) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(12:(9:(7:39|(1:41)|42|(1:44)(1:127)|45|(1:47)(1:126)|(32:49|50|51|52|(4:54|(1:56)(1:123)|57|(1:59)(1:122))(1:124)|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80|81|82|83|(1:85)|86|87|88))(1:128)|80|81|82|83|(0)|86|87|88)|68|69|70|71|72|73|74|75|76|77|78)|63|64|65|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0243, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0244, code lost:
        r10 = r3;
        r12 = r5;
        r23 = r7;
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d A[Catch: all -> 0x00ac, TryCatch #5 {all -> 0x00ac, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:14:0x0066, B:23:0x00a2, B:84:0x020a, B:28:0x00b2, B:29:0x00b5, B:10:0x0058, B:12:0x005e, B:13:0x0063, B:30:0x00b6, B:32:0x00bc, B:35:0x00c6, B:38:0x00d0, B:40:0x00d4, B:41:0x00d9, B:45:0x00e3, B:47:0x00f0, B:53:0x0110, B:55:0x0124, B:57:0x012d, B:59:0x0138, B:61:0x0149, B:66:0x0161, B:83:0x0207, B:112:0x025b, B:113:0x025e, B:64:0x014e, B:52:0x010e, B:48:0x00fe, B:44:0x00de, B:117:0x0264, B:54:0x011d), top: B:130:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5 A[Catch: all -> 0x021d, TRY_LEAVE, TryCatch #11 {all -> 0x021d, blocks: (B:79:0x01e8, B:81:0x01f5, B:104:0x0249, B:105:0x024b), top: B:141:0x01e8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.F(java.util.ArrayList):void");
    }

    public final void G(js7 js7Var, xt8 xt8Var, Object obj, boolean z) {
        boolean z2;
        b0(126665345, js7Var);
        H();
        p0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                eqa.z(this.I);
            }
            if (this.S || c16.i(this.G.f(), xt8Var)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                N(xt8Var);
            }
            Y(202, ex1.c, xt8Var, 0);
            this.K = null;
            if (this.S && !z) {
                this.J = true;
                eqa eqaVar = this.I;
                this.b.m(new ls7(js7Var, obj, this.h, this.H, eqaVar.b(eqaVar.G(eqaVar.v, eqaVar.b)), ks3.a, l(), null));
            } else {
                boolean z3 = this.w;
                this.w = z2;
                vye.p(this, new tu1(new sj(15, js7Var, obj), true, -59194059));
                this.w = z3;
            }
        } catch (Throwable th) {
            try {
                zxe.x(th, new nv4(1, this));
                throw th;
            } finally {
                q(false);
                this.K = null;
                this.T = j;
                q(false);
            }
        }
    }

    public final Object H() {
        boolean z = this.S;
        lh9 lh9Var = ax1.a;
        if (z) {
            if (this.r) {
                ex1.a("A call to createNode(), emitNode() or useNode() expected");
                return lh9Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof ps9)) {
                return m;
            }
        }
        return lh9Var;
    }

    public final List I() {
        ux1 ux1Var;
        px1 px1Var = this.b;
        ox1 i = px1Var.i();
        if (i != null) {
            ux1Var = (ux1) i;
        } else {
            ux1Var = null;
        }
        if (ux1Var != null) {
            bqa bqaVar = ux1Var.f;
            aqa e = dqa.d(bqaVar).e();
            try {
                Integer s = xxe.s(e, px1Var, 0, e.c);
                if (s != null) {
                    e = dqa.d(bqaVar).e();
                    try {
                        ArrayList w = xxe.w(e, s.intValue(), 0);
                        e.c();
                        return sl1.n0(w, ux1Var.R.I());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return ks3.a;
    }

    public final int J(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(defpackage.ux1 r9, defpackage.ux1 r10, java.lang.Integer r11, java.util.List r12, defpackage.vt4 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            yk8 r6 = (defpackage.yk8) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L24
            ek9 r7 = (defpackage.ek9) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.k0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L5e
        L26:
            r8.k0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L55
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L4f
            if (r10 == r9) goto L4f
            if (r11 < 0) goto L4f
            r9.N = r10     // Catch: java.lang.Throwable -> L24
            r9.O = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L49
            r9.N = r5     // Catch: java.lang.Throwable -> L24
            r9.O = r2     // Catch: java.lang.Throwable -> L24
            goto L53
        L49:
            r10 = move-exception
            r9.N = r5     // Catch: java.lang.Throwable -> L24
            r9.O = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L4f:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L53:
            if (r10 != 0) goto L59
        L55:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L59:
            r8.F = r0
            r8.k = r1
            return r10
        L5e:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.K(ux1, ux1, java.lang.Integer, java.util.List, vt4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r4.b < r6) goto L8;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.L():void");
    }

    public final void M() {
        Q(this.G.g);
        bx1 bx1Var = this.M;
        bx1Var.d(false);
        bx1Var.e();
        bx1Var.b.d.p(ce8.c);
        int i = bx1Var.f;
        aqa aqaVar = bx1Var.a.G;
        bx1Var.f = aqaVar.b[(aqaVar.g * 5) + 3] + i;
    }

    public final void N(xt8 xt8Var) {
        wu7 wu7Var = this.v;
        if (wu7Var == null) {
            wu7Var = new wu7();
            this.v = wu7Var;
        }
        wu7Var.i(this.G.g, xt8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(int r7, int r8, int r9) {
        /*
            r6 = this;
            aqa r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            bx1 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.O(int, int, int):void");
    }

    public final Object P() {
        boolean z = this.S;
        lh9 lh9Var = ax1.a;
        if (z) {
            if (this.r) {
                ex1.a("A call to createNode(), emitNode() or useNode() expected");
                return lh9Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof ps9)) {
                if (m instanceof wv4) {
                    return ((wv4) m).a;
                }
                return m;
            }
        }
        return lh9Var;
    }

    public final void Q(int i) {
        boolean l = this.G.l(i);
        bx1 bx1Var = this.M;
        if (l) {
            bx1Var.c();
            Object n = this.G.n(i);
            bx1Var.c();
            bx1Var.h.add(n);
        }
        T(this, i, i, l, 0);
        bx1Var.c();
        if (l) {
            bx1Var.a();
        }
    }

    public final boolean U(int i, boolean z) {
        ek9 A;
        int i2;
        if ((i & 1) == 0 && (this.S || this.y)) {
            rka rkaVar = this.P;
            if (rkaVar != null && (A = A()) != null && rkaVar.a()) {
                int i3 = A.b;
                if ((i3 & 512) != 0) {
                    return true;
                }
                int i4 = i3 | 1;
                A.b = i4;
                if (this.y) {
                    i2 = i3 | Token.DEFAULT;
                } else {
                    i2 = i4 & (-129);
                }
                A.b = i2 | 256;
                re8 re8Var = this.M.b.d;
                re8Var.p(be8.c);
                vve.l(re8Var, 0, A);
                this.b.t(A);
                return false;
            }
        } else if (!z && E()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.V():void");
    }

    public final void W() {
        int i;
        aqa aqaVar = this.G;
        int i2 = aqaVar.i;
        if (i2 >= 0) {
            i = aqaVar.b[(i2 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.l = i;
        aqaVar.t();
    }

    public final void X() {
        if (this.l != 0) {
            ex1.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            ek9 A = A();
            if (A != null) {
                int i = A.b;
                if ((i & Token.CASE) == 0) {
                    A.b = i | 16;
                }
            }
            if (this.s.isEmpty()) {
                W();
            } else {
                L();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(int r28, java.lang.Object r29, java.lang.Object r30, int r31) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.Y(int, java.lang.Object, java.lang.Object, int):void");
    }

    public final void Z() {
        Y(-127, null, null, 0);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        wh4 wh4Var = this.O;
        wh4Var.l.m();
        wh4Var.k.m();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        aqa aqaVar = this.G;
        if (!aqaVar.f) {
            aqaVar.c();
        }
        if (!this.I.w) {
            x();
        }
    }

    public final void a0(int i, kc8 kc8Var) {
        Y(i, kc8Var, null, 0);
    }

    public final void b(Object obj, lu4 lu4Var) {
        if (this.S) {
            re8 re8Var = this.O.k;
            re8Var.p(me8.c);
            vve.l(re8Var, 0, obj);
            lu4Var.getClass();
            jsc.u(2, lu4Var);
            vve.l(re8Var, 1, lu4Var);
            return;
        }
        bx1 bx1Var = this.M;
        bx1Var.b();
        re8 re8Var2 = bx1Var.b.d;
        re8Var2.p(me8.c);
        lu4Var.getClass();
        jsc.u(2, lu4Var);
        vve.m(re8Var2, 0, obj, 1, lu4Var);
    }

    public final void b0(int i, Object obj) {
        Y(i, obj, null, 0);
    }

    public final boolean c(float f) {
        Object H = H();
        if ((H instanceof Float) && f == ((Number) H).floatValue()) {
            return false;
        }
        p0(Float.valueOf(f));
        return true;
    }

    public final void c0() {
        Y(Token.IF, null, null, 1);
        this.r = true;
    }

    public final boolean d(int i) {
        Object H = H();
        if ((H instanceof Integer) && i == ((Number) H).intValue()) {
            return false;
        }
        p0(Integer.valueOf(i));
        return true;
    }

    public final void d0(Object obj, boolean z) {
        if (z) {
            aqa aqaVar = this.G;
            if (aqaVar.k <= 0) {
                if ((aqaVar.b[(aqaVar.g * 5) + 1] & 1073741824) == 0) {
                    e39.a("Expected a node group");
                }
                aqaVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            bx1 bx1Var = this.M;
            bx1Var.getClass();
            bx1Var.d(false);
            re8 re8Var = bx1Var.b.d;
            re8Var.p(le8.c);
            vve.l(re8Var, 0, obj);
        }
        this.G.u();
    }

    public final boolean e(long j) {
        Object H = H();
        if ((H instanceof Long) && j == ((Number) H).longValue()) {
            return false;
        }
        p0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            Y(i, null, null, 0);
            return;
        }
        if (this.r) {
            ex1.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        aqa aqaVar = this.G;
        boolean z = this.S;
        lh9 lh9Var = ax1.a;
        if (z) {
            aqaVar.k++;
            this.I.S(lh9Var, false, lh9Var, i);
            w(false, null);
        } else if (aqaVar.g() == i && ((i3 = aqaVar.g) >= aqaVar.h || (aqaVar.b[(i3 * 5) + 1] & 536870912) == 0)) {
            aqaVar.u();
            w(false, null);
        } else {
            if (aqaVar.k <= 0 && (i2 = aqaVar.g) != aqaVar.h) {
                int i4 = this.k;
                M();
                this.M.f(i4, aqaVar.s());
                xwe.c(i2, this.s, aqaVar.g);
            }
            aqaVar.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                eqa f = this.H.f();
                this.I = f;
                f.O();
                this.J = false;
                this.K = null;
            }
            eqa eqaVar = this.I;
            eqaVar.d();
            int i5 = eqaVar.t;
            eqaVar.S(lh9Var, false, lh9Var, i);
            this.N = eqaVar.b(i5);
            w(false, null);
        }
    }

    public final boolean f(Object obj) {
        if (!c16.i(H(), obj)) {
            p0(obj);
            return true;
        }
        return false;
    }

    public final void f0(int i) {
        Y(i, null, null, 0);
    }

    public final boolean g(boolean z) {
        Object H = H();
        if ((H instanceof Boolean) && z == ((Boolean) H).booleanValue()) {
            return false;
        }
        p0(Boolean.valueOf(z));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rv4 g0(int r7) {
        /*
            r6 = this;
            r6.e0(r7)
            boolean r7 = r6.S
            mu9 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            ux1 r2 = r6.h
            if (r7 == 0) goto L26
            ek9 r7 = new ek9
            r7.<init>(r2)
            r1.add(r7)
            r6.p0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.p()
            return r6
        L26:
            aqa r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.xwe.f(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            t16 r7 = (defpackage.t16) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            aqa r3 = r6.G
            java.lang.Object r3 = r3.m()
            lh9 r4 = defpackage.ax1.a
            boolean r4 = defpackage.c16.i(r3, r4)
            if (r4 == 0) goto L51
            ek9 r3 = new ek9
            r3.<init>(r2)
            r6.p0(r3)
            goto L56
        L51:
            r3.getClass()
            ek9 r3 = (defpackage.ek9) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.p()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            bx1 r7 = r6.M
            pa1 r7 = r7.b
            re8 r7 = r7.d
            he8 r0 = defpackage.he8.c
            r7.p(r0)
            defpackage.vve.l(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            aqa r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.g0(int):rv4");
    }

    public final boolean h(Object obj) {
        if (H() != obj) {
            p0(obj);
            return true;
        }
        return false;
    }

    public final void h0(Object obj) {
        if (!this.S && this.G.g() == 207 && !c16.i(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        Y(207, null, obj, 0);
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        bx1 bx1Var = this.M;
        bx1Var.c = false;
        bx1Var.d.b = 0;
        bx1Var.f = 0;
        bx1Var.e = true;
        bx1Var.g = 0;
        bx1Var.h.clear();
        bx1Var.i = -1;
        bx1Var.j = -1;
        bx1Var.k = -1;
        bx1Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0() {
        Y(Token.IF, null, null, 2);
        this.r = true;
    }

    public final Object j(f99 f99Var) {
        return qye.m(l(), f99Var);
    }

    public final void j0() {
        this.m = 0;
        this.G = this.c.e();
        Y(100, null, null, 0);
        px1 px1Var = this.b;
        px1Var.w();
        xt8 j = px1Var.j();
        this.x.e(this.w ? 1 : 0);
        this.w = f(j);
        this.K = null;
        if (!this.q) {
            this.q = px1Var.f();
        }
        if (!this.C) {
            this.C = px1Var.g();
        }
        if (this.C) {
            tza tzaVar = tx1.a;
            tzaVar.getClass();
            j = j.d(tzaVar, new uza(C()));
        }
        this.u = j;
        Set set = (Set) qye.m(j, mx5.a);
        if (set != null) {
            set.add(y());
            px1Var.r(set);
        }
        Y(Long.hashCode(px1Var.h()), null, null, 0);
    }

    public final void k(vt4 vt4Var) {
        if (!this.r) {
            ex1.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            ex1.a("createNode() can only be called when inserting");
        }
        bz5 bz5Var = this.n;
        int i = bz5Var.a[bz5Var.b - 1];
        eqa eqaVar = this.I;
        lv4 b = eqaVar.b(eqaVar.v);
        this.l++;
        wh4 wh4Var = this.O;
        re8 re8Var = wh4Var.k;
        re8Var.p(ud8.d);
        vve.l(re8Var, 0, vt4Var);
        re8Var.m[re8Var.n - re8Var.k[re8Var.l - 1].a] = i;
        vve.l(re8Var, 1, b);
        re8 re8Var2 = wh4Var.l;
        re8Var2.p(ud8.e);
        re8Var2.m[re8Var2.n - re8Var2.k[re8Var2.l - 1].a] = i;
        vve.l(re8Var2, 0, b);
    }

    public final boolean k0(ek9 ek9Var, Object obj) {
        lv4 lv4Var = ek9Var.c;
        if (lv4Var != null) {
            int a = this.G.a.a(zbe.m(lv4Var));
            if (this.F && a >= this.G.g) {
                ArrayList arrayList = this.s;
                int f = xwe.f(a, arrayList);
                if (f < 0) {
                    int i = -(f + 1);
                    if (!(obj instanceof h23)) {
                        obj = null;
                    }
                    arrayList.add(i, new t16(ek9Var, a, obj));
                    return true;
                }
                t16 t16Var = (t16) arrayList.get(f);
                if (obj instanceof h23) {
                    Object obj2 = t16Var.c;
                    if (obj2 == null) {
                        t16Var.c = obj;
                        return true;
                    } else if (obj2 instanceof uv7) {
                        ((uv7) obj2).a(obj);
                        return true;
                    } else {
                        uv7 uv7Var = uz9.a;
                        uv7 uv7Var2 = new uv7(2);
                        uv7Var2.k(obj2);
                        uv7Var2.k(obj);
                        t16Var.c = uv7Var2;
                        return true;
                    }
                }
                t16Var.c = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final xt8 l() {
        xt8 xt8Var = this.K;
        if (xt8Var != null) {
            return xt8Var;
        }
        return m(this.G.i);
    }

    public final void l0(tv7 tv7Var) {
        lv4 lv4Var;
        ArrayList arrayList = this.s;
        for (int x = tl1.x(arrayList); -1 < x; x--) {
            t16 t16Var = (t16) arrayList.get(x);
            lv4 lv4Var2 = t16Var.a.c;
            if (lv4Var2 != null) {
                lv4Var = zbe.m(lv4Var2);
            } else {
                lv4Var = null;
            }
            if (lv4Var != null && lv4Var.a()) {
                int i = t16Var.b;
                int i2 = lv4Var.a;
                if (i != i2) {
                    t16Var.b = i2;
                }
            } else {
                arrayList.remove(x);
            }
        }
        Object[] objArr = tv7Var.b;
        Object[] objArr2 = tv7Var.c;
        long[] jArr = tv7Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            ek9 ek9Var = (ek9) obj;
                            lv4 lv4Var3 = ek9Var.c;
                            if (lv4Var3 != null) {
                                int i7 = zbe.m(lv4Var3).a;
                                if (obj2 == ox9.H) {
                                    obj2 = null;
                                }
                                arrayList.add(new t16(ek9Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        wl1.O(xwe.b, arrayList);
    }

    public final xt8 m(int i) {
        xt8 xt8Var;
        boolean z = this.S;
        kc8 kc8Var = ex1.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.s(i2) == 202 && c16.i(this.I.t(i2), kc8Var)) {
                    Object q = this.I.q(i2);
                    q.getClass();
                    xt8 xt8Var2 = (xt8) q;
                    this.K = xt8Var2;
                    return xt8Var2;
                }
                eqa eqaVar = this.I;
                i2 = eqaVar.G(i2, eqaVar.b);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    aqa aqaVar = this.G;
                    if (c16.i(aqaVar.p(i, aqaVar.b), kc8Var)) {
                        wu7 wu7Var = this.v;
                        if (wu7Var == null || (xt8Var = (xt8) wu7Var.b(i)) == null) {
                            aqa aqaVar2 = this.G;
                            Object b = aqaVar2.b(i, aqaVar2.b);
                            b.getClass();
                            xt8Var = (xt8) b;
                        }
                        this.K = xt8Var;
                        return xt8Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        xt8 xt8Var3 = this.u;
        this.K = xt8Var3;
        return xt8Var3;
    }

    public final void m0(int i, int i2) {
        if (q0(i) != i2) {
            if (i < 0) {
                uu7 uu7Var = this.p;
                if (uu7Var == null) {
                    uu7Var = new uu7();
                    this.p = uu7Var;
                }
                uu7Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                b00.h0(-1, 0, 6, iArr);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final nw1 n() {
        Collection collection;
        Object obj;
        if (!this.b.l()) {
            return null;
        }
        jq6 t = tl1.t();
        eqa eqaVar = this.I;
        t.addAll(xxe.p(eqaVar, null, eqaVar.t, null));
        aqa aqaVar = this.G;
        boolean z = aqaVar.f;
        int[] iArr = aqaVar.b;
        if (!z && aqaVar.c != 0) {
            fj9 fj9Var = new fj9(aqaVar);
            int i = aqaVar.i;
            Object valueOf = Integer.valueOf(aqaVar.l - dqa.b(i, iArr));
            while (i >= 0) {
                if (aqaVar.k(i)) {
                    obj = aqaVar.p(i, iArr);
                } else {
                    obj = ax1.a;
                }
                fj9Var.E(aqaVar.i(i), obj, aqaVar.a.h(i), valueOf);
                valueOf = aqaVar.a(i);
                i = aqaVar.q(i);
            }
            collection = (ArrayList) fj9Var.a;
        } else {
            collection = ks3.a;
        }
        t.addAll(collection);
        t.addAll(I());
        return new nw1(tl1.r(t), this.C);
    }

    public final void n0(int i, int i2) {
        int q0 = q0(i);
        if (q0 != i2) {
            int i3 = i2 - q0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int q02 = q0(i) + i3;
                m0(i, q02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        vv4 vv4Var = (vv4) arrayList.get(i4);
                        if (vv4Var != null && vv4Var.a(i, q02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                aqa aqaVar = this.G;
                if (i < 0) {
                    i = aqaVar.i;
                } else if (!aqaVar.l(i)) {
                    i = this.G.q(i);
                } else {
                    return;
                }
            }
        }
    }

    public final void o(tv7 tv7Var, lu4 lu4Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            ex1.a("Reentrant composition is not supported");
        }
        this.g.p();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(dra.j().g());
            this.v = null;
            l0(tv7Var);
            this.k = 0;
            this.F = true;
            j0();
            Object H = H();
            if (H != lu4Var && lu4Var != null) {
                p0(lu4Var);
            }
            qv4 qv4Var = this.D;
            gw7 p = yae.p();
            p.b(qv4Var);
            kc8 kc8Var = ex1.a;
            if (lu4Var != null) {
                a0(Context.VERSION_ES6, kc8Var);
                vye.p(this, lu4Var);
                q(false);
            } else if (this.w && H != null && !H.equals(ax1.a)) {
                a0(Context.VERSION_ES6, kc8Var);
                jsc.u(2, H);
                vye.p(this, (lu4) H);
                q(false);
            } else {
                V();
            }
            p.k(p.c - 1);
            v();
            this.F = false;
            arrayList.clear();
            if (!this.I.w) {
                ex1.a("Check failed");
            }
            x();
        } finally {
            Trace.endSection();
        }
    }

    public final void o0(Object obj) {
        if (obj instanceof bn9) {
            wv4 wv4Var = new wv4((bn9) obj, this.m - 1);
            if (this.S) {
                re8 re8Var = this.M.b.d;
                re8Var.p(ae8.c);
                vve.l(re8Var, 0, wv4Var);
            }
            this.d.add(obj);
            obj = wv4Var;
        }
        p0(obj);
    }

    public final void p(int i, int i2) {
        if (i > 0 && i != i2) {
            p(this.G.q(i), i2);
            if (this.G.l(i)) {
                Object n = this.G.n(i);
                bx1 bx1Var = this.M;
                bx1Var.c();
                bx1Var.h.add(n);
            }
        }
    }

    public final void p0(Object obj) {
        if (this.S) {
            this.I.U(obj);
            return;
        }
        aqa aqaVar = this.G;
        boolean z = aqaVar.n;
        bx1 bx1Var = this.M;
        if (z) {
            int b = (aqaVar.l - dqa.b(aqaVar.i, aqaVar.b)) - 1;
            if (bx1Var.a.G.i - bx1Var.f < 0) {
                aqa aqaVar2 = this.G;
                lv4 a = aqaVar2.a(aqaVar2.i);
                re8 re8Var = bx1Var.b.d;
                re8Var.p(ud8.f);
                vve.m(re8Var, 0, obj, 1, a);
                re8Var.m[re8Var.n - re8Var.k[re8Var.l - 1].a] = b;
                return;
            }
            bx1Var.d(true);
            re8 re8Var2 = bx1Var.b.d;
            re8Var2.p(ud8.g);
            vve.l(re8Var2, 0, obj);
            re8Var2.m[re8Var2.n - re8Var2.k[re8Var2.l - 1].a] = b;
            return;
        }
        lv4 a2 = aqaVar.a(aqaVar.i);
        re8 re8Var3 = bx1Var.b.d;
        re8Var3.p(hd8.c);
        vve.m(re8Var3, 0, a2, 1, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04cc  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.q(boolean):void");
    }

    public final int q0(int i) {
        int i2;
        if (i < 0) {
            uu7 uu7Var = this.p;
            if (uu7Var != null && uu7Var.c(i) >= 0) {
                int c = uu7Var.c(i);
                if (c >= 0) {
                    return uu7Var.c[c];
                }
                p1a.l(a82.j(i, "Cannot find value for key "));
            }
            return 0;
        }
        int[] iArr = this.o;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.G.o(i);
    }

    public final void r() {
        q(false);
        ek9 A = A();
        if (A != null) {
            int i = A.b;
            if ((i & 1) != 0) {
                A.b = i | 2;
            }
        }
    }

    public final void r0() {
        if (!this.r) {
            ex1.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            ex1.a("useNode() called while inserting");
        }
        aqa aqaVar = this.G;
        Object n = aqaVar.n(aqaVar.i);
        bx1 bx1Var = this.M;
        bx1Var.c();
        bx1Var.h.add(n);
        if (this.y && (n instanceof ew1)) {
            bx1Var.b();
            bx1Var.b.d.p(oe8.c);
        }
    }

    public final void s() {
        q(true);
    }

    public final void t() {
        q(false);
    }

    public final ek9 u() {
        ek9 ek9Var;
        ek9 ek9Var2;
        lv4 a;
        in2 in2Var;
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            ek9Var = (ek9) a82.h(1, arrayList);
        } else {
            ek9Var = null;
        }
        if (ek9Var != null) {
            ek9Var.b &= -9;
            this.g.p();
            int i = this.B;
            gv7 gv7Var = ek9Var.f;
            if (gv7Var != null && (ek9Var.b & 16) == 0) {
                Object[] objArr = gv7Var.b;
                int[] iArr = gv7Var.c;
                long[] jArr = gv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        in2Var = new in2(ek9Var, i, gv7Var, 5);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            in2Var = null;
            bx1 bx1Var = this.M;
            if (in2Var != null) {
                re8 re8Var = bx1Var.b.d;
                re8Var.p(od8.c);
                vve.m(re8Var, 0, in2Var, 1, this.h);
            }
            int i6 = ek9Var.b;
            if ((i6 & 512) != 0) {
                ek9Var.b = i6 & (-513);
                re8 re8Var2 = bx1Var.b.d;
                re8Var2.p(rd8.c);
                vve.l(re8Var2, 0, ek9Var);
                int i7 = ek9Var.b;
                ek9Var.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    ek9Var.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (ek9Var != null) {
            int i8 = ek9Var.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (ek9Var.c == null) {
                    if (this.S) {
                        eqa eqaVar = this.I;
                        a = eqaVar.b(eqaVar.v);
                    } else {
                        aqa aqaVar = this.G;
                        a = aqaVar.a(aqaVar.i);
                    }
                    ek9Var.c = a;
                }
                ek9Var.b &= -5;
                ek9Var2 = ek9Var;
                q(false);
                return ek9Var2;
            }
        }
        ek9Var2 = null;
        q(false);
        return ek9Var2;
    }

    public final void v() {
        boolean z = false;
        q(false);
        this.b.d();
        q(false);
        bx1 bx1Var = this.M;
        if (bx1Var.c) {
            bx1Var.d(false);
            bx1Var.d(false);
            bx1Var.b.d.p(pd8.c);
            bx1Var.c = false;
        }
        bx1Var.b();
        if (bx1Var.d.b != 0) {
            ex1.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            ex1.a("Start/end imbalance");
        }
        i();
        this.G.c();
        if (this.x.d() != 0) {
            z = true;
        }
        this.w = z;
    }

    public final void w(boolean z, vv4 vv4Var) {
        this.i.add(this.j);
        this.j = vv4Var;
        int i = this.l;
        bz5 bz5Var = this.n;
        bz5Var.e(i);
        bz5Var.e(this.m);
        bz5Var.e(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void x() {
        bqa bqaVar = new bqa();
        if (this.C) {
            bqaVar.b();
        }
        if (this.b.e()) {
            bqaVar.G = new wu7();
        }
        this.H = bqaVar;
        eqa f = bqaVar.f();
        f.e(true);
        this.I = f;
    }

    public final rx1 y() {
        tv4 tv4Var = this.U;
        if (tv4Var == null) {
            tv4 tv4Var2 = new tv4(this.h);
            this.U = tv4Var2;
            return tv4Var2;
        }
        return tv4Var;
    }

    public final xt8 z() {
        return l();
    }
}
