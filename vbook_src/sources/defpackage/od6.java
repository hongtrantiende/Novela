package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: od6  reason: default package */
/* loaded from: classes.dex */
public final class od6 implements ew1, xg8, rw1 {
    public static final lu9 o0 = new lu9("Undefined intrinsics block and it is required", 1);
    public static final jd6 p0 = new Object();
    public static final uk q0 = new uk(20);
    public int C;
    public boolean D;
    public od6 E;
    public int F;
    public final eb5 G;
    public gw7 H;
    public boolean I;
    public od6 J;
    public wg8 K;
    public wcd L;
    public int M;
    public boolean N;
    public boolean O;
    public u7a P;
    public boolean Q;
    public final gw7 R;
    public boolean S;
    public b37 T;
    public kw5 U;
    public r13 V;
    public tc6 W;
    public ucd X;
    public yx1 Y;
    public md6 Z;
    public final boolean a;
    public md6 a0;
    public int b;
    public boolean b0;
    public boolean c;
    public final kn c0;
    public long d;
    public final sd6 d0;
    public boolean e;
    public be6 e0;
    public boolean f;
    public i38 f0;
    public boolean g0;
    public nq7 h0;
    public nq7 i0;
    public dp j0;
    public ep k0;
    public boolean l0;
    public int m0;
    public boolean n0;

    public od6(int i, boolean z) {
        this.a = z;
        this.b = i;
        this.d = 9223372034707292159L;
        this.e = true;
        this.f = true;
        this.C = -4;
        this.G = new eb5(9, new gw7(new od6[16], 0), new ik(this, 15));
        this.R = new gw7(new od6[16], 0);
        this.S = true;
        this.T = o0;
        this.V = rd6.a;
        this.W = tc6.a;
        this.X = p0;
        yx1.l.getClass();
        this.Y = xx1.b;
        md6 md6Var = md6.c;
        this.Z = md6Var;
        this.a0 = md6Var;
        this.c0 = new kn(this);
        this.d0 = new sd6(this);
        this.g0 = true;
        this.h0 = kq7.a;
    }

    public static boolean S(od6 od6Var) {
        x02 x02Var;
        a37 a37Var = od6Var.d0.p;
        if (a37Var.F) {
            x02Var = new x02(a37Var.d);
        } else {
            x02Var = null;
        }
        return od6Var.R(x02Var);
    }

    public static void Y(od6 od6Var, boolean z, int i) {
        boolean z2;
        od6 v;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if (od6Var.E == null) {
            lv5.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        wg8 wg8Var = od6Var.K;
        if (wg8Var != null && !od6Var.N && !od6Var.a) {
            ((rg) wg8Var).z(od6Var, true, z, z2);
            if (z3) {
                xy6 xy6Var = od6Var.d0.q;
                xy6Var.getClass();
                sd6 sd6Var = xy6Var.f;
                od6 v2 = sd6Var.a.v();
                md6 md6Var = sd6Var.a.Z;
                if (v2 != null && md6Var != md6.c) {
                    while (v2.Z == md6Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = md6Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (v2.E != null) {
                                v2.X(z);
                                return;
                            } else {
                                v2.Z(z);
                                return;
                            }
                        }
                        vs.k("Intrinsics isn't used by the parent");
                    } else if (v2.E != null) {
                        Y(v2, z, 6);
                    } else {
                        a0(v2, z, 6);
                    }
                }
            }
        }
    }

    public static void a0(od6 od6Var, boolean z, int i) {
        boolean z2;
        boolean z3;
        wg8 wg8Var;
        od6 v;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!od6Var.N && !od6Var.a && (wg8Var = od6Var.K) != null) {
            ((rg) wg8Var).z(od6Var, false, z, z2);
            if (z3) {
                sd6 sd6Var = od6Var.d0.p.f;
                od6 v2 = sd6Var.a.v();
                md6 md6Var = sd6Var.a.Z;
                if (v2 != null && md6Var != md6.c) {
                    while (v2.Z == md6Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = md6Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            v2.Z(z);
                            return;
                        } else {
                            vs.k("Intrinsics isn't used by the parent");
                            return;
                        }
                    }
                    a0(v2, z, 6);
                }
            }
        }
    }

    public static void b0(od6 od6Var) {
        sd6 sd6Var = od6Var.d0;
        if (nd6.a[sd6Var.d.ordinal()] == 1) {
            if (sd6Var.e) {
                Y(od6Var, true, 6);
                return;
            }
            if (sd6Var.f) {
                od6Var.X(true);
            }
            if (od6Var.r()) {
                a0(od6Var, true, 6);
                return;
            } else if (od6Var.q()) {
                od6Var.Z(true);
                return;
            } else {
                return;
            }
        }
        xk5.j(sd6Var.d, "Unexpected state ");
    }

    private final String k(od6 od6Var) {
        String str;
        String g = g(0);
        od6 od6Var2 = od6Var.J;
        if (od6Var2 != null) {
            str = od6Var2.g(0);
        } else {
            str = null;
        }
        return "Cannot insert " + od6Var + " because it already has a parent or an owner. This tree: " + g + " Other tree: " + str;
    }

    public final void A(long j, a75 a75Var, int i, boolean z) {
        kn knVar = this.c0;
        qs9 qs9Var = i38.p0;
        ((i38) knVar.e).J1(i38.s0, ((i38) knVar.e).B1(true, j), a75Var, i, z);
    }

    public final void B(int i, od6 od6Var) {
        if (od6Var.J != null && od6Var.K != null) {
            lv5.c(k(od6Var));
        }
        od6Var.J = this;
        eb5 eb5Var = this.G;
        ((gw7) eb5Var.b).a(i, od6Var);
        ((ik) eb5Var.c).invoke();
        Q();
        if (od6Var.a) {
            this.F++;
        }
        I();
        wg8 wg8Var = this.K;
        if (wg8Var != null) {
            od6Var.d(wg8Var);
        }
        if (od6Var.d0.l > 0) {
            sd6 sd6Var = this.d0;
            sd6Var.d(sd6Var.l + 1);
        }
        if (od6Var.m0 > 0) {
            f0(this.m0 + 1);
        }
    }

    public final void C(boolean z) {
        if (z) {
            od6 v = v();
            if (v != null) {
                v.D();
            } else {
                wg8 wg8Var = this.K;
                if (wg8Var != null) {
                    ((rg) wg8Var).invalidate();
                }
            }
        }
        mq7 mq7Var = (mq7) this.c0.C;
        if ((mq7Var.d & 2) != 0) {
            while (mq7Var != null) {
                if ((mq7Var.c & 2) != 0) {
                    mq7 mq7Var2 = mq7Var;
                    gw7 gw7Var = null;
                    while (mq7Var2 != null) {
                        if (mq7Var2 instanceof fd6) {
                            vg8 vg8Var = voe.s((fd6) mq7Var2, 2).n0;
                            if (vg8Var != null) {
                                ((s15) vg8Var).c();
                            }
                        } else if ((mq7Var2.c & 2) != 0 && (mq7Var2 instanceof m03)) {
                            int i = 0;
                            for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                if ((mq7Var3.c & 2) != 0) {
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
                if ((mq7Var.d & 2) == 0) {
                    break;
                }
                mq7Var = mq7Var.f;
            }
        }
        gw7 z2 = z();
        Object[] objArr = z2.a;
        int i2 = z2.c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((od6) objArr[i3]).C(false);
        }
    }

    public final void D() {
        vg8 vg8Var;
        if (this.g0) {
            kn knVar = this.c0;
            i38 i38Var = (wv5) knVar.d;
            i38 i38Var2 = ((i38) knVar.e).S;
            this.f0 = null;
            while (true) {
                if (c16.i(i38Var, i38Var2)) {
                    break;
                }
                if (i38Var != null) {
                    vg8Var = i38Var.n0;
                } else {
                    vg8Var = null;
                }
                if (vg8Var != null) {
                    this.f0 = i38Var;
                    break;
                } else if (i38Var != null) {
                    i38Var = i38Var.S;
                } else {
                    i38Var = null;
                }
            }
            this.g0 = false;
        }
        i38 i38Var3 = this.f0;
        if (i38Var3 != null && i38Var3.n0 == null) {
            throw a82.f("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (i38Var3 != null) {
            i38Var3.L1();
            return;
        }
        od6 v = v();
        if (v != null) {
            v.D();
            return;
        }
        wg8 wg8Var = this.K;
        if (wg8Var != null) {
            ((rg) wg8Var).invalidate();
        }
    }

    public final void E() {
        kn knVar = this.c0;
        i38 i38Var = (i38) knVar.e;
        wv5 wv5Var = (wv5) knVar.d;
        while (i38Var != wv5Var) {
            i38Var.getClass();
            id6 id6Var = (id6) i38Var;
            vg8 vg8Var = id6Var.n0;
            if (vg8Var != null) {
                ((s15) vg8Var).c();
            }
            i38Var = id6Var.R;
        }
        vg8 vg8Var2 = ((wv5) knVar.d).n0;
        if (vg8Var2 != null) {
            ((s15) vg8Var2).c();
        }
    }

    public final void F() {
        a0(this, false, 7);
        gw7 z = z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((od6) objArr[i2]).F();
        }
    }

    public final void G() {
        if (this.a) {
            od6 v = v();
            if (v != null) {
                v.G();
            }
        } else if (this.E != null) {
            Y(this, false, 7);
        } else {
            a0(this, false, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [zl9, java.lang.Object] */
    public final void H() {
        if (this.Q) {
            return;
        }
        if (((b38) this.c0.c).f != null || this.i0 != null) {
            this.O = true;
            return;
        }
        u7a u7aVar = this.P;
        this.Q = true;
        ?? obj = new Object();
        obj.a = new u7a();
        yg8 snapshotObserver = ((rg) rd6.a(this)).getSnapshotObserver();
        hg hgVar = new hg(19, this, obj);
        snapshotObserver.a.d(this, snapshotObserver.d, hgVar);
        this.Q = false;
        this.P = (u7a) obj.a;
        this.O = false;
        rg rgVar = (rg) rd6.a(this);
        rgVar.getSemanticsOwner().b(this, u7aVar);
        rgVar.B();
    }

    public final void I() {
        od6 od6Var;
        if (this.F > 0) {
            this.I = true;
        }
        if (this.a && (od6Var = this.J) != null) {
            od6Var.I();
        }
    }

    public final boolean J() {
        if (this.K != null) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        return this.d0.p.P;
    }

    public final Boolean L() {
        boolean z;
        xy6 xy6Var = this.d0.q;
        if (xy6Var != null) {
            if (xy6Var.N != vy6.c) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final void M() {
        od6 v;
        if (this.Z == md6.c) {
            f();
        }
        xy6 xy6Var = this.d0.q;
        xy6Var.getClass();
        boolean z = true;
        try {
            xy6Var.C = true;
            if (!xy6Var.H) {
                lv5.c("replace() called on item that was not placed");
            }
            xy6Var.Y = false;
            if (xy6Var.N == vy6.c) {
                z = false;
            }
            xy6Var.T0(xy6Var.K, xy6Var.L, xy6Var.M);
            if (z && !xy6Var.Y && (v = xy6Var.f.a.v()) != null) {
                v.X(false);
            }
            xy6Var.C = false;
        } catch (Throwable th) {
            xy6Var.C = false;
            throw th;
        }
    }

    public final void N(int i, int i2, int i3) {
        int i4;
        if (i == i2) {
            return;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            if (i > i2) {
                i4 = i + i5;
            } else {
                i4 = i;
            }
            int i6 = i > i2 ? i2 + i5 : (i2 + i3) - 2;
            eb5 eb5Var = this.G;
            ik ikVar = (ik) eb5Var.c;
            Object k = ((gw7) eb5Var.b).k(i4);
            ikVar.invoke();
            ((gw7) eb5Var.b).a(i6, (od6) k);
            ikVar.invoke();
        }
        Q();
        I();
        G();
    }

    public final void O(od6 od6Var) {
        sd6 sd6Var;
        if (od6Var.d0.l > 0) {
            this.d0.d(sd6Var.l - 1);
        }
        if (this.K != null) {
            od6Var.i();
        }
        od6Var.J = null;
        if (od6Var.m0 > 0) {
            f0(this.m0 - 1);
        }
        ((i38) od6Var.c0.e).S = null;
        if (od6Var.a) {
            this.F--;
            gw7 gw7Var = (gw7) od6Var.G.b;
            Object[] objArr = gw7Var.a;
            int i = gw7Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((i38) ((od6) objArr[i2]).c0.e).S = null;
            }
        }
        I();
        Q();
    }

    public final void P(i38 i38Var) {
        vk9 vk9Var;
        boolean z;
        wg8 wg8Var = this.K;
        if (wg8Var != null) {
            vk9Var = ((rg) wg8Var).getRectManager();
        } else {
            vk9Var = null;
        }
        sd6 sd6Var = this.d0;
        if (sd6Var.d == kd6.e && !r() && !q()) {
            z = false;
        } else {
            z = true;
        }
        if (this.C != -4 && vk9Var != null) {
            if (i38Var == ((i38) this.c0.e)) {
                this.f = true;
                if (!z) {
                    vk9Var.h(this);
                }
            } else {
                this.e = true;
                gw7 z2 = z();
                Object[] objArr = z2.a;
                int i = z2.c;
                for (int i2 = 0; i2 < i; i2++) {
                    od6 od6Var = (od6) objArr[i2];
                    od6Var.f = true;
                    if (!z) {
                        vk9Var.h(od6Var);
                    }
                }
                if (this.C != -4) {
                    vk9Var.f = true;
                    int e = vk9Var.e(this);
                    long[] jArr = (long[]) vk9Var.c.b;
                    int i3 = e + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                vk9Var.k();
            }
        }
        sd6Var.p.V0();
    }

    public final void Q() {
        if (this.a) {
            od6 v = v();
            if (v != null) {
                v.Q();
                return;
            }
            return;
        }
        this.S = true;
    }

    public final boolean R(x02 x02Var) {
        if (x02Var != null) {
            if (this.Z == md6.c) {
                e();
            }
            return this.d0.p.U0(x02Var.a);
        }
        return false;
    }

    @Override // defpackage.xg8
    public final boolean T() {
        return J();
    }

    public final void U() {
        eb5 eb5Var = this.G;
        int i = ((gw7) eb5Var.b).c;
        while (true) {
            i--;
            gw7 gw7Var = (gw7) eb5Var.b;
            if (-1 < i) {
                O((od6) gw7Var.a[i]);
            } else {
                gw7Var.g();
                ((ik) eb5Var.c).invoke();
                return;
            }
        }
    }

    public final void V(int i, int i2) {
        if (i2 < 0) {
            lv5.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            eb5 eb5Var = this.G;
            O((od6) ((gw7) eb5Var.b).a[i3]);
            Object k = ((gw7) eb5Var.b).k(i3);
            ((ik) eb5Var.c).invoke();
            od6 od6Var = (od6) k;
            if (i3 != i) {
                i3--;
            } else {
                return;
            }
        }
    }

    public final void W() {
        od6 v;
        if (this.Z == md6.c) {
            f();
        }
        a37 a37Var = this.d0.p;
        sd6 sd6Var = a37Var.f;
        try {
            a37Var.C = true;
            if (!a37Var.G) {
                lv5.c("replace called on unplaced item");
            }
            boolean z = a37Var.P;
            a37Var.S0(a37Var.J, a37Var.M, a37Var.K, a37Var.L);
            if (z && !a37Var.c0 && (v = sd6Var.a.v()) != null) {
                v.Z(false);
            }
        } finally {
        }
    }

    public final void X(boolean z) {
        wg8 wg8Var;
        if (!this.a && (wg8Var = this.K) != null) {
            ((rg) wg8Var).A(this, true, z);
        }
    }

    public final void Z(boolean z) {
        wg8 wg8Var;
        if (!this.a && (wg8Var = this.K) != null) {
            ((rg) wg8Var).A(this, false, z);
        }
    }

    @Override // defpackage.ew1
    public final void a() {
        wcd wcdVar = this.L;
        if (wcdVar != null) {
            wcdVar.a();
        }
        be6 be6Var = this.e0;
        if (be6Var != null) {
            be6Var.a();
        }
        kn knVar = this.c0;
        i38 i38Var = ((wv5) knVar.d).R;
        for (i38 i38Var2 = (i38) knVar.e; !c16.i(i38Var2, i38Var) && i38Var2 != null; i38Var2 = i38Var2.R) {
            i38Var2.Q1();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3, types: [mq7, i38] */
    public final void b(nq7 nq7Var) {
        int i;
        ?? r7;
        boolean z;
        gw7 gw7Var;
        boolean z2;
        kn knVar;
        b38 b38Var;
        gw7 gw7Var2;
        boolean z3;
        wv5 wv5Var;
        boolean z4;
        boolean z5;
        kn knVar2;
        boolean z6;
        boolean z7;
        jc jcVar;
        kn knVar3 = this.c0;
        boolean j = knVar3.j(16);
        mq7 mq7Var = (hkb) knVar3.f;
        boolean j2 = knVar3.j(1024);
        this.h0 = nq7Var;
        wv5 wv5Var2 = (wv5) knVar3.d;
        od6 od6Var = (od6) knVar3.b;
        mq7 mq7Var2 = (mq7) knVar3.C;
        b38 b38Var2 = (b38) knVar3.c;
        if (mq7Var2 == b38Var2) {
            lv5.c("padChain called on already padded chain");
        }
        mq7 mq7Var3 = (mq7) knVar3.C;
        mq7Var3.e = b38Var2;
        b38Var2.f = mq7Var3;
        gw7 gw7Var3 = (gw7) knVar3.D;
        if (gw7Var3 != null) {
            i = gw7Var3.c;
        } else {
            i = 0;
        }
        gw7 gw7Var4 = (gw7) knVar3.E;
        if (gw7Var4 == null) {
            gw7Var4 = new gw7(new lq7[16], 0);
        }
        gw7 gw7Var5 = (gw7) knVar3.F;
        gw7Var5.b(nq7Var);
        jc jcVar2 = null;
        while (true) {
            int i2 = gw7Var5.c;
            if (i2 == 0) {
                break;
            }
            nq7 nq7Var2 = (nq7) gw7Var5.k(i2 - 1);
            if (nq7Var2 instanceof no1) {
                no1 no1Var = (no1) nq7Var2;
                gw7Var5.b(no1Var.b);
                gw7Var5.b(no1Var.a);
            } else if (nq7Var2 instanceof lq7) {
                gw7Var4.b(nq7Var2);
            } else {
                if (jcVar2 == null) {
                    jcVar = new jc(gw7Var4, 28);
                    jcVar2 = jcVar;
                } else {
                    jcVar = jcVar2;
                }
                nq7Var2.m(jcVar);
            }
        }
        int i3 = gw7Var4.c;
        if (i3 == i) {
            mq7 mq7Var4 = b38Var2.f;
            kn knVar4 = knVar3;
            int i4 = 0;
            while (mq7Var4 != null && i4 < i) {
                if (gw7Var3 != null) {
                    lq7 lq7Var = (lq7) gw7Var3.a[i4];
                    lq7 lq7Var2 = (lq7) gw7Var4.a[i4];
                    if (c16.i(lq7Var, lq7Var2)) {
                        knVar2 = knVar4;
                        z7 = true;
                    } else {
                        knVar2 = knVar4;
                        if (lq7Var.getClass() == lq7Var2.getClass()) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    }
                    if (z7) {
                        if (z7) {
                            kn.n(lq7Var, lq7Var2, mq7Var4);
                        }
                        mq7Var4 = mq7Var4.f;
                        i4++;
                        knVar4 = knVar2;
                    } else {
                        mq7Var4 = mq7Var4.e;
                        break;
                    }
                } else {
                    throw a82.f("expected prior modifier list to be non-empty");
                }
            }
            knVar2 = knVar4;
            if (i4 < i) {
                if (gw7Var3 != null) {
                    if (mq7Var4 != null) {
                        if (od6Var.i0 != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        gw7Var = gw7Var3;
                        gw7Var2 = gw7Var4;
                        z5 = false;
                        mq7 mq7Var5 = mq7Var4;
                        knVar = knVar2;
                        knVar.l(i4, gw7Var, gw7Var2, mq7Var5, !z6);
                        b38Var = b38Var2;
                        z3 = true;
                        r7 = z5;
                    } else {
                        throw a82.f("structuralUpdate requires a non-null tail");
                    }
                } else {
                    throw a82.f("expected prior modifier list to be non-empty");
                }
            } else {
                knVar3 = knVar2;
                z4 = false;
                knVar = knVar3;
                gw7Var = gw7Var3;
                b38Var = b38Var2;
                gw7Var2 = gw7Var4;
                z3 = false;
                r7 = z4;
            }
        } else {
            r7 = 0;
            z5 = false;
            z4 = false;
            nq7 nq7Var3 = od6Var.i0;
            if (nq7Var3 != null && i == 0) {
                mq7 mq7Var6 = b38Var2;
                for (int i5 = 0; i5 < gw7Var4.c; i5++) {
                    mq7Var6 = kn.g((lq7) gw7Var4.a[i5], mq7Var6);
                }
                int i6 = 0;
                for (mq7 mq7Var7 = mq7Var.e; mq7Var7 != null && mq7Var7 != b38Var2; mq7Var7 = mq7Var7.e) {
                    i6 |= mq7Var7.c;
                    mq7Var7.d = i6;
                }
                knVar = knVar3;
                gw7Var = gw7Var3;
                b38Var = b38Var2;
                gw7Var2 = gw7Var4;
                z3 = true;
                r7 = z5;
            } else if (i3 == 0) {
                if (gw7Var3 != null) {
                    mq7 mq7Var8 = b38Var2.f;
                    for (int i7 = 0; mq7Var8 != null && i7 < gw7Var3.c; i7++) {
                        mq7Var8 = kn.h(mq7Var8).f;
                    }
                    od6 v = od6Var.v();
                    if (v != null) {
                        wv5Var = (wv5) v.c0.d;
                    } else {
                        wv5Var = null;
                    }
                    wv5Var2.S = wv5Var;
                    knVar3.e = wv5Var2;
                    knVar = knVar3;
                    gw7Var = gw7Var3;
                    b38Var = b38Var2;
                    gw7Var2 = gw7Var4;
                    z3 = false;
                    r7 = z4;
                } else {
                    throw a82.f("expected prior modifier list to be non-empty");
                }
            } else {
                if (gw7Var3 == null) {
                    z = false;
                    gw7Var3 = new gw7(new lq7[16], 0);
                } else {
                    z = false;
                }
                gw7Var = gw7Var3;
                if (nq7Var3 != null) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                knVar = knVar3;
                b38Var = b38Var2;
                gw7Var2 = gw7Var4;
                knVar.l(0, gw7Var, gw7Var2, b38Var, !z2);
                z3 = true;
            }
        }
        knVar.D = gw7Var2;
        if (gw7Var != null) {
            gw7Var.g();
        } else {
            gw7Var = r7;
        }
        knVar.E = gw7Var;
        mq7 mq7Var9 = b38Var.f;
        if (mq7Var9 != null) {
            mq7Var = mq7Var9;
        }
        mq7Var.e = r7;
        b38Var.f = r7;
        b38Var.d = -1;
        b38Var.D = r7;
        if (mq7Var == b38Var) {
            lv5.c("trimChain did not update the head");
        }
        knVar.C = mq7Var;
        if (z3) {
            knVar.m();
        }
        boolean j3 = knVar.j(16);
        boolean j4 = knVar.j(1024);
        this.d0.j();
        if (this.E == null && knVar.j(512)) {
            g0(this);
        }
        if (j != j3 || j2 != j4) {
            vk9 rectManager = ((rg) rd6.a(this)).getRectManager();
            rectManager.getClass();
            if (J() && this.C != -4) {
                kj kjVar = rectManager.c;
                int e = rectManager.e(this);
                long[] jArr = (long[]) kjVar.b;
                int i8 = e + 2;
                jArr[i8] = (jArr[i8] & (-6917529027641081857L)) | ((j4 ? 1L : 0L) * 2305843009213693952L) | ((j3 ? 1L : 0L) * 4611686018427387904L);
            }
        }
    }

    @Override // defpackage.ew1
    public final void c() {
        cf autofillManager;
        wcd wcdVar = this.L;
        if (wcdVar != null) {
            wcdVar.c();
        }
        be6 be6Var = this.e0;
        if (be6Var != null) {
            be6Var.j(true);
        }
        this.n0 = true;
        mq7 mq7Var = (hkb) this.c0.f;
        for (mq7 mq7Var2 = mq7Var; mq7Var2 != null; mq7Var2 = mq7Var2.e) {
            if (mq7Var2.J) {
                mq7Var2.C1();
            }
        }
        for (mq7 mq7Var3 = mq7Var; mq7Var3 != null; mq7Var3 = mq7Var3.e) {
            if (mq7Var3.J) {
                mq7Var3.E1();
            }
        }
        while (mq7Var != null) {
            if (mq7Var.J) {
                mq7Var.y1();
            }
            mq7Var = mq7Var.e;
        }
        if (J()) {
            this.P = null;
            this.O = false;
        }
        wg8 wg8Var = this.K;
        if (wg8Var != null) {
            rg rgVar = (rg) wg8Var;
            if (rg.e() && (autofillManager = rgVar.getAutofillManager()) != null && autofillManager.D.g(this.b)) {
                autofillManager.a.f(autofillManager.c, this.b, false);
            }
        }
    }

    public final void c0() {
        gw7 z = z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var = (od6) objArr[i2];
            md6 md6Var = od6Var.a0;
            od6Var.Z = md6Var;
            if (md6Var != md6.c) {
                od6Var.c0();
            }
        }
    }

    public final void d(wg8 wg8Var) {
        wv5 wv5Var;
        int i;
        od6 od6Var;
        cf autofillManager;
        u7a x;
        wg8 wg8Var2;
        String str;
        if (this.K != null) {
            lv5.c("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        od6 od6Var2 = this.J;
        if (od6Var2 != null && !c16.i(od6Var2.K, wg8Var)) {
            od6 v = v();
            if (v != null) {
                wg8Var2 = v.K;
            } else {
                wg8Var2 = null;
            }
            String g = g(0);
            od6 od6Var3 = this.J;
            if (od6Var3 != null) {
                str = od6Var3.g(0);
            } else {
                str = null;
            }
            lv5.c("Attaching to a different owner(" + wg8Var + ") than the parent's owner(" + wg8Var2 + "). This tree: " + g + " Parent tree: " + str);
        }
        od6 v2 = v();
        sd6 sd6Var = this.d0;
        if (v2 == null) {
            sd6Var.p.P = true;
            ((rg) wg8Var).getRectManager().h(this);
            xy6 xy6Var = sd6Var.q;
            if (xy6Var != null) {
                xy6Var.N = vy6.a;
            }
        }
        kn knVar = this.c0;
        i38 i38Var = (i38) knVar.e;
        if (v2 != null) {
            wv5Var = (wv5) v2.c0.d;
        } else {
            wv5Var = null;
        }
        i38Var.S = wv5Var;
        this.K = wg8Var;
        if (v2 != null) {
            i = v2.M;
        } else {
            i = -1;
        }
        this.M = i + 1;
        nq7 nq7Var = this.i0;
        if (nq7Var != null) {
            b(nq7Var);
        }
        this.i0 = null;
        ((rg) wg8Var).getLayoutNodes().i(this.b, this);
        if (this.D) {
            g0(this);
        } else {
            od6 od6Var4 = this.J;
            if (od6Var4 == null || (od6Var = od6Var4.E) == null) {
                od6Var = this.E;
            }
            g0(od6Var);
            if (this.E == null && knVar.j(512)) {
                g0(this);
            }
        }
        if (!this.n0) {
            for (mq7 mq7Var = (mq7) knVar.C; mq7Var != null; mq7Var = mq7Var.f) {
                mq7Var.x1();
            }
        }
        gw7 gw7Var = (gw7) this.G.b;
        Object[] objArr = gw7Var.a;
        int i2 = gw7Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            ((od6) objArr[i3]).d(wg8Var);
        }
        if (!this.n0) {
            knVar.k();
        }
        G();
        if (v2 != null) {
            v2.G();
        }
        dp dpVar = this.j0;
        if (dpVar != null) {
            dpVar.invoke(wg8Var);
        }
        sd6Var.j();
        if (!this.n0 && knVar.j(8)) {
            H();
        }
        rg rgVar = (rg) wg8Var;
        if (rg.e() && (autofillManager = rgVar.getAutofillManager()) != null && (x = x()) != null && x.a.b(h8a.r)) {
            autofillManager.D.a(this.b);
            autofillManager.a.f(autofillManager.c, this.b, true);
        }
    }

    public final void d0(Throwable th) {
        yx1 yx1Var = this.Y;
        tza tzaVar = tx1.a;
        xt8 xt8Var = (xt8) yx1Var;
        xt8Var.getClass();
        sx1 sx1Var = (sx1) qye.m(xt8Var, tzaVar);
        if (sx1Var != null) {
            zxe.x(th, new t7(23, sx1Var, this));
        }
        throw th;
    }

    public final void e() {
        this.a0 = this.Z;
        md6 md6Var = md6.c;
        this.Z = md6Var;
        gw7 z = z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var = (od6) objArr[i2];
            if (od6Var.Z != md6Var) {
                od6Var.e();
            }
        }
    }

    public final void e0(r13 r13Var) {
        if (!c16.i(this.V, r13Var)) {
            this.V = r13Var;
            G();
            od6 v = v();
            if (v != null) {
                v.D();
            } else {
                wg8 wg8Var = this.K;
                if (wg8Var != null) {
                    ((rg) wg8Var).invalidate();
                }
            }
            E();
            for (mq7 mq7Var = (mq7) this.c0.C; mq7Var != null; mq7Var = mq7Var.f) {
                mq7Var.p();
            }
        }
    }

    public final void f() {
        this.a0 = this.Z;
        this.Z = md6.c;
        gw7 z = z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var = (od6) objArr[i2];
            if (od6Var.Z == md6.b) {
                od6Var.f();
            }
        }
    }

    public final void f0(int i) {
        od6 v;
        od6 v2;
        int i2 = this.m0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (v2 = v()) != null) {
                v2.f0(v2.m0 + 1);
            }
            if (i == 0 && this.m0 > 0 && (v = v()) != null) {
                v.f0(v.m0 - 1);
            }
            this.m0 = i;
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        gw7 z = z();
        Object[] objArr = z.a;
        int i3 = z.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((od6) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        if (i == 0) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    public final void g0(od6 od6Var) {
        if (!c16.i(od6Var, this.E)) {
            this.E = od6Var;
            sd6 sd6Var = this.d0;
            if (od6Var != null) {
                if (sd6Var.q == null) {
                    sd6Var.q = new xy6(sd6Var);
                }
                kn knVar = this.c0;
                i38 i38Var = ((wv5) knVar.d).R;
                for (i38 i38Var2 = (i38) knVar.e; !c16.i(i38Var2, i38Var) && i38Var2 != null; i38Var2 = i38Var2.R) {
                    i38Var2.z1();
                }
            } else {
                sd6Var.q = null;
                sd6Var.f = false;
                sd6Var.e = false;
            }
            G();
        }
    }

    @Override // defpackage.ew1
    public final void h() {
        vk9 rectManager;
        cf autofillManager;
        vk9 rectManager2;
        if (!J()) {
            lv5.a("onReuse is only expected on attached node");
        }
        wcd wcdVar = this.L;
        if (wcdVar != null) {
            wcdVar.h();
        }
        be6 be6Var = this.e0;
        if (be6Var != null) {
            be6Var.j(false);
        }
        this.Q = false;
        boolean z = this.n0;
        kn knVar = this.c0;
        if (z) {
            this.n0 = false;
        } else {
            mq7 mq7Var = (hkb) knVar.f;
            for (mq7 mq7Var2 = mq7Var; mq7Var2 != null; mq7Var2 = mq7Var2.e) {
                if (mq7Var2.J) {
                    mq7Var2.C1();
                }
            }
            for (mq7 mq7Var3 = mq7Var; mq7Var3 != null; mq7Var3 = mq7Var3.e) {
                if (mq7Var3.J) {
                    mq7Var3.E1();
                }
            }
            while (mq7Var != null) {
                if (mq7Var.J) {
                    mq7Var.y1();
                }
                mq7Var = mq7Var.e;
            }
        }
        int i = this.b;
        wg8 wg8Var = this.K;
        if (wg8Var != null && (rectManager2 = ((rg) wg8Var).getRectManager()) != null) {
            rectManager2.i(this);
        }
        this.b = y7a.a.addAndGet(1);
        wg8 wg8Var2 = this.K;
        if (wg8Var2 != null) {
            rg rgVar = (rg) wg8Var2;
            rgVar.getLayoutNodes().g(i);
            rgVar.getLayoutNodes().i(this.b, this);
        }
        for (mq7 mq7Var4 = (mq7) knVar.C; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
            mq7Var4.x1();
        }
        knVar.k();
        if (knVar.j(8)) {
            H();
        }
        b0(this);
        wg8 wg8Var3 = this.K;
        if (wg8Var3 != null) {
            rg rgVar2 = (rg) wg8Var3;
            if (rg.e() && (autofillManager = rgVar2.getAutofillManager()) != null) {
                rg rgVar3 = autofillManager.c;
                yw8 yw8Var = autofillManager.a;
                xu7 xu7Var = autofillManager.D;
                if (xu7Var.g(i)) {
                    yw8Var.f(rgVar3, i, false);
                }
                u7a x = x();
                if (x != null && x.a.b(h8a.r)) {
                    xu7Var.a(this.b);
                    yw8Var.f(rgVar3, this.b, true);
                }
            }
        }
        wg8 wg8Var4 = this.K;
        if (wg8Var4 != null && (rectManager = ((rg) wg8Var4).getRectManager()) != null) {
            rectManager.h(this);
        }
    }

    public final void h0(b37 b37Var) {
        if (!c16.i(this.T, b37Var)) {
            this.T = b37Var;
            kw5 kw5Var = this.U;
            if (kw5Var != null) {
                ((hm8) kw5Var.c).setValue(b37Var);
            }
            G();
        }
    }

    public final void i() {
        cf autofillManager;
        pd6 pd6Var;
        wg8 wg8Var = this.K;
        String str = null;
        if (wg8Var == null) {
            od6 v = v();
            if (v != null) {
                str = v.g(0);
            }
            lv5.d("Cannot detach node that is already detached!  Tree: " + str);
            ls2.c();
            return;
        }
        od6 v2 = v();
        sd6 sd6Var = this.d0;
        if (v2 != null) {
            v2.D();
            v2.G();
            a37 a37Var = sd6Var.p;
            md6 md6Var = md6.c;
            a37Var.H = md6Var;
            xy6 xy6Var = sd6Var.q;
            if (xy6Var != null) {
                xy6Var.F = md6Var;
            }
        }
        pd6 pd6Var2 = sd6Var.p.U;
        pd6Var2.b = true;
        pd6Var2.c = false;
        pd6Var2.e = false;
        pd6Var2.d = false;
        pd6Var2.f = false;
        pd6Var2.g = false;
        pd6Var2.h = null;
        xy6 xy6Var2 = sd6Var.q;
        if (xy6Var2 != null && (pd6Var = xy6Var2.O) != null) {
            pd6Var.b = true;
            pd6Var.c = false;
            pd6Var.e = false;
            pd6Var.d = false;
            pd6Var.f = false;
            pd6Var.g = false;
            pd6Var.h = null;
        }
        kn knVar = this.c0;
        mq7 mq7Var = (hkb) knVar.f;
        i38 i38Var = ((wv5) knVar.d).R;
        for (i38 i38Var2 = (i38) knVar.e; !c16.i(i38Var2, i38Var) && i38Var2 != null; i38Var2 = i38Var2.R) {
            i38Var2.W1();
            if (i38Var2.O.K()) {
                i38Var2.R1();
            }
        }
        ep epVar = this.k0;
        if (epVar != null) {
            epVar.invoke(wg8Var);
        }
        for (mq7 mq7Var2 = mq7Var; mq7Var2 != null; mq7Var2 = mq7Var2.e) {
            if (mq7Var2.J) {
                mq7Var2.E1();
            }
        }
        this.N = true;
        gw7 gw7Var = (gw7) this.G.b;
        Object[] objArr = gw7Var.a;
        int i = gw7Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((od6) objArr[i2]).i();
        }
        this.N = false;
        while (mq7Var != null) {
            if (mq7Var.J) {
                mq7Var.y1();
            }
            mq7Var = mq7Var.e;
        }
        rg rgVar = (rg) wg8Var;
        rgVar.getLayoutNodes().g(this.b);
        y27 y27Var = rgVar.o0;
        ij1 ij1Var = y27Var.b;
        ((uwd) ij1Var.b).y(this);
        ((uwd) ij1Var.c).y(this);
        ((uwd) ij1Var.d).y(this);
        ((gw7) y27Var.e.b).j(this);
        rgVar.i0 = true;
        if (rg.e() && (autofillManager = rgVar.getAutofillManager()) != null && autofillManager.D.g(this.b)) {
            autofillManager.a.f(autofillManager.c, this.b, false);
        }
        rgVar.getRectManager().i(this);
        this.K = null;
        g0(null);
        this.M = 0;
        a37 a37Var2 = sd6Var.p;
        a37Var2.E = Integer.MAX_VALUE;
        a37Var2.D = Integer.MAX_VALUE;
        a37Var2.P = false;
        xy6 xy6Var3 = sd6Var.q;
        if (xy6Var3 != null) {
            xy6Var3.E = Integer.MAX_VALUE;
            xy6Var3.D = Integer.MAX_VALUE;
            xy6Var3.N = vy6.c;
        }
        if (knVar.j(8)) {
            u7a u7aVar = this.P;
            this.P = null;
            this.O = false;
            rgVar.getSemanticsOwner().b(this, u7aVar);
            rgVar.B();
        }
    }

    public final void i0(nq7 nq7Var) {
        if (this.a && this.h0 != kq7.a) {
            lv5.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.n0) {
            lv5.a("modifier is updated when deactivated");
        }
        if (J()) {
            b(nq7Var);
            if (this.O) {
                H();
                return;
            }
            return;
        }
        this.i0 = nq7Var;
    }

    public final void j(k61 k61Var, p15 p15Var) {
        try {
            ((i38) this.c0.e).x1(k61Var, p15Var);
        } catch (Throwable th) {
            d0(th);
            throw null;
        }
    }

    public final void j0(ucd ucdVar) {
        if (!c16.i(this.X, ucdVar)) {
            this.X = ucdVar;
            mq7 mq7Var = (mq7) this.c0.C;
            if ((mq7Var.d & 16) != 0) {
                while (mq7Var != null) {
                    if ((mq7Var.c & 16) != 0) {
                        mq7 mq7Var2 = mq7Var;
                        gw7 gw7Var = null;
                        while (mq7Var2 != null) {
                            if (mq7Var2 instanceof c19) {
                                ((c19) mq7Var2).j1();
                            } else if ((mq7Var2.c & 16) != 0 && (mq7Var2 instanceof m03)) {
                                int i = 0;
                                for (mq7 mq7Var3 = ((m03) mq7Var2).L; mq7Var3 != null; mq7Var3 = mq7Var3.f) {
                                    if ((mq7Var3.c & 16) != 0) {
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
                    if ((mq7Var.d & 16) != 0) {
                        mq7Var = mq7Var.f;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void k0() {
        if (this.F > 0 && this.I) {
            this.I = false;
            gw7 gw7Var = this.H;
            if (gw7Var == null) {
                gw7Var = new gw7(new od6[16], 0);
                this.H = gw7Var;
            }
            gw7Var.g();
            gw7 gw7Var2 = (gw7) this.G.b;
            Object[] objArr = gw7Var2.a;
            int i = gw7Var2.c;
            for (int i2 = 0; i2 < i; i2++) {
                od6 od6Var = (od6) objArr[i2];
                if (od6Var.a) {
                    gw7Var.c(gw7Var.c, od6Var.z());
                } else {
                    gw7Var.b(od6Var);
                }
            }
            sd6 sd6Var = this.d0;
            sd6Var.p.W = true;
            xy6 xy6Var = sd6Var.q;
            if (xy6Var != null) {
                xy6Var.Q = true;
            }
        }
    }

    public final void l() {
        x02 x02Var;
        if (this.E != null) {
            Y(this, false, 5);
        } else {
            a0(this, false, 5);
        }
        a37 a37Var = this.d0.p;
        if (a37Var.F) {
            x02Var = new x02(a37Var.d);
        } else {
            x02Var = null;
        }
        wg8 wg8Var = this.K;
        if (x02Var != null) {
            if (wg8Var != null) {
                ((rg) wg8Var).v(this, x02Var.a);
            }
        } else if (wg8Var != null) {
            ((rg) wg8Var).u(true);
        }
    }

    public final List m() {
        xy6 xy6Var = this.d0.q;
        xy6Var.getClass();
        gw7 gw7Var = xy6Var.P;
        sd6 sd6Var = xy6Var.f;
        sd6Var.a.o();
        if (!xy6Var.Q) {
            return gw7Var.f();
        }
        od6 od6Var = sd6Var.a;
        gw7 z = od6Var.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            od6 od6Var2 = (od6) objArr[i2];
            if (gw7Var.c <= i2) {
                xy6 xy6Var2 = od6Var2.d0.q;
                xy6Var2.getClass();
                gw7Var.b(xy6Var2);
            } else {
                xy6 xy6Var3 = od6Var2.d0.q;
                xy6Var3.getClass();
                Object[] objArr2 = gw7Var.a;
                Object obj = objArr2[i2];
                objArr2[i2] = xy6Var3;
            }
        }
        gw7Var.l(((gw7) ((iv7) od6Var.o()).b).c, gw7Var.c);
        xy6Var.Q = false;
        return gw7Var.f();
    }

    public final List n() {
        return this.d0.p.H0();
    }

    public final List o() {
        return z().f();
    }

    public final List p() {
        return ((gw7) this.G.b).f();
    }

    public final boolean q() {
        return this.d0.p.S;
    }

    public final boolean r() {
        return this.d0.p.R;
    }

    public final md6 s() {
        return this.d0.p.H;
    }

    public final md6 t() {
        md6 md6Var;
        xy6 xy6Var = this.d0.q;
        if (xy6Var != null && (md6Var = xy6Var.F) != null) {
            return md6Var;
        }
        return md6.c;
    }

    public final String toString() {
        String J = z1d.J(this);
        int i = ((gw7) ((iv7) o()).b).c;
        b37 b37Var = this.T;
        boolean z = this.n0;
        boolean K = K();
        return J + " children: " + i + " measurePolicy: " + b37Var + " deactivated: " + z + " isVirtual: " + this.a + " isPlaced: " + K;
    }

    public final kw5 u() {
        kw5 kw5Var = this.U;
        if (kw5Var == null) {
            kw5 kw5Var2 = new kw5(this, this.T);
            this.U = kw5Var2;
            return kw5Var2;
        }
        return kw5Var;
    }

    public final od6 v() {
        od6 od6Var = this.J;
        while (od6Var != null && od6Var.a) {
            od6Var = od6Var.J;
        }
        return od6Var;
    }

    public final int w() {
        return this.d0.p.E;
    }

    public final u7a x() {
        if (J() && !this.n0 && this.c0.j(8)) {
            return this.P;
        }
        return null;
    }

    public final gw7 y() {
        boolean z = this.S;
        gw7 gw7Var = this.R;
        if (z) {
            gw7Var.g();
            gw7Var.c(gw7Var.c, z());
            Arrays.sort(gw7Var.a, 0, gw7Var.c, q0);
            this.S = false;
        }
        return gw7Var;
    }

    public final gw7 z() {
        k0();
        if (this.F == 0) {
            return (gw7) this.G.b;
        }
        gw7 gw7Var = this.H;
        gw7Var.getClass();
        return gw7Var;
    }

    public od6(int i) {
        this(y7a.a.addAndGet(1), (i & 1) == 0);
    }
}
