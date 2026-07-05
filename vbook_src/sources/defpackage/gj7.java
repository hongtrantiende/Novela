package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj7 implements mu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ hu4 E;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gj7(boolean z, yp8 yp8Var, rp rpVar, tc6 tc6Var, aw7 aw7Var, List list, xt4 xt4Var, xt4 xt4Var2) {
        this.a = 2;
        this.b = z;
        this.d = yp8Var;
        this.e = rpVar;
        this.f = tc6Var;
        this.C = aw7Var;
        this.D = list;
        this.c = xt4Var;
        this.E = xt4Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        r13 r13Var;
        r13 r13Var2;
        r13 r13Var3;
        r13 r13Var4;
        boolean z2;
        float f;
        int i;
        int i2 = this.a;
        xt4 xt4Var = this.c;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        hu4 hu4Var = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (i2) {
            case 0:
                boolean z3 = false;
                vt4 vt4Var = (vt4) obj8;
                vt4 vt4Var2 = (vt4) obj7;
                vt4 vt4Var3 = (vt4) obj6;
                vt4 vt4Var4 = (vt4) obj5;
                vt4 vt4Var5 = (vt4) obj4;
                vt4 vt4Var6 = (vt4) hu4Var;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var.U(intValue & 1, z3)) {
                    boolean f2 = rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f2 || P == lh9Var) {
                        P = new hg7(10, xt4Var);
                        rv4Var.o0(P);
                    }
                    wq9.l(this.b, (vt4) P, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                vt4 vt4Var7 = (vt4) obj8;
                vt4 vt4Var8 = (vt4) obj7;
                vt4 vt4Var9 = (vt4) obj6;
                vt4 vt4Var10 = (vt4) obj5;
                vt4 vt4Var11 = (vt4) obj4;
                vt4 vt4Var12 = (vt4) hu4Var;
                boolean z4 = false;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((su0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z4 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z4)) {
                    boolean f3 = rv4Var2.f(xt4Var);
                    Object P2 = rv4Var2.P();
                    if (f3 || P2 == lh9Var) {
                        P2 = new hg7(11, xt4Var);
                        rv4Var2.o0(P2);
                    }
                    wq9.l(this.b, (vt4) P2, vt4Var7, vt4Var8, vt4Var9, vt4Var10, vt4Var11, vt4Var12, rv4Var2, 48);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                yp8 yp8Var = (yp8) obj8;
                qid qidVar = (qid) obj7;
                tc6 tc6Var = (tc6) obj6;
                aw7 aw7Var = (aw7) obj5;
                final List list = (List) obj4;
                final xt4 xt4Var2 = (xt4) hu4Var;
                final su0 su0Var = (su0) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var3.f(su0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    tza tzaVar = dy1.h;
                    float L0 = ((r13) rv4Var3.j(tzaVar)).L0(20.0f);
                    float L02 = ((r13) rv4Var3.j(tzaVar)).L0(20.0f) + qidVar.d(r13Var, tc6Var);
                    final float L03 = ((r13) rv4Var3.j(tzaVar)).L0(20.0f) + qidVar.b(r13Var2, tc6Var);
                    float L04 = ((r13) rv4Var3.j(tzaVar)).L0(20.0f) + qidVar.a(r13Var3);
                    float L05 = ((r13) rv4Var3.j(tzaVar)).L0(20.0f) + qidVar.c(r13Var4);
                    if (this.b && yp8Var != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    eu3 g = zt3.g(null, 3);
                    long j = ckc.b;
                    eu3 a = g.a(zt3.k(null, 0.9f, j, 1));
                    lz3 a2 = zt3.i(null, 3).a(zt3.m(0.9f, j, 1));
                    boolean c = rv4Var3.c(L03) | rv4Var3.c(L02) | rv4Var3.c(L05) | rv4Var3.c(L04) | rv4Var3.c(L0);
                    Object P3 = rv4Var3.P();
                    if (c || P3 == lh9Var) {
                        f = L02;
                        jh7 jh7Var = new jh7(L03, f, L05, L04, L0, aw7Var, 1);
                        rv4Var3.o0(jh7Var);
                        P3 = jh7Var;
                    } else {
                        f = L02;
                    }
                    nq7 f4 = sze.f(kq7.a, (mu4) P3);
                    final xt4 xt4Var3 = this.c;
                    final float f5 = f;
                    rte.c(z2, f4, a, a2, null, jce.E(1932420664, new mu4() { // from class: cr8
                        @Override // defpackage.mu4
                        public final Object c(Object obj9, Object obj10, Object obj11) {
                            boolean z5;
                            ba5 ba5Var;
                            String[] strArr;
                            int i3;
                            nq7 nq7Var;
                            ba5 ba5Var2 = lre.g;
                            rv4 rv4Var4 = (rv4) obj10;
                            int intValue4 = ((Integer) obj11).intValue();
                            ((qr) obj9).getClass();
                            if ((intValue4 & 17) != 16) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (rv4Var4.U(intValue4 & 1, z5)) {
                                r13 r13Var5 = (r13) rv4Var4.j(dy1.h);
                                su0 su0Var2 = su0.this;
                                boolean c2 = rv4Var4.c(su0Var2.d()) | rv4Var4.f(r13Var5);
                                float f6 = f5;
                                boolean c3 = c2 | rv4Var4.c(f6);
                                float f7 = L03;
                                boolean c4 = c3 | rv4Var4.c(f7);
                                Object P4 = rv4Var4.P();
                                lh9 lh9Var2 = ax1.a;
                                if (c4 || P4 == lh9Var2) {
                                    P4 = new rg3(((rg3) hxe.u(new rg3((su0Var2.d() - r13Var5.B0(f6 + f7)) - 10.0f), new rg3(400.0f))).a);
                                    rv4Var4.o0(P4);
                                }
                                float f8 = ((rg3) P4).a;
                                w06 w06Var = w06.b;
                                kq7 kq7Var = kq7.a;
                                nq7 u = pna.u(zj0.m(kq7Var, w06Var), nae.e, f8, 1);
                                tza tzaVar2 = j27.a;
                                nq7 d = st0.d(nmd.v(tte.k(u, ((h27) rv4Var4.j(tzaVar2)).c.c), rm1.g(((h27) rv4Var4.j(tzaVar2)).a, 4.0f), ba5Var2), 1.0f, rm1.g(((h27) rv4Var4.j(tzaVar2)).a, 10.0f), ((h27) rv4Var4.j(tzaVar2)).c.c);
                                xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                                int hashCode = Long.hashCode(rv4Var4.T);
                                xt8 l = rv4Var4.l();
                                nq7 p = lye.p(rv4Var4, d);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var4.i0();
                                if (rv4Var4.S) {
                                    rv4Var4.k(zx1Var);
                                } else {
                                    rv4Var4.r0();
                                }
                                np npVar = qw1.f;
                                jce.F(npVar, rv4Var4, a3);
                                np npVar2 = qw1.e;
                                jce.F(npVar2, rv4Var4, l);
                                Integer valueOf = Integer.valueOf(hashCode);
                                np npVar3 = qw1.g;
                                jce.F(npVar3, rv4Var4, valueOf);
                                kg kgVar = qw1.h;
                                jce.C(kgVar, rv4Var4);
                                np npVar4 = qw1.d;
                                jce.F(npVar4, rv4Var4, p);
                                nq7 q = rte.q(kq7Var, rte.u(rv4Var4), 14);
                                gv9 a4 = ev9.a(lz.a, kh5.G, rv4Var4, 48);
                                int hashCode2 = Long.hashCode(rv4Var4.T);
                                xt8 l2 = rv4Var4.l();
                                nq7 p2 = lye.p(rv4Var4, q);
                                rv4Var4.i0();
                                if (rv4Var4.S) {
                                    rv4Var4.k(zx1Var);
                                } else {
                                    rv4Var4.r0();
                                }
                                jce.F(npVar, rv4Var4, a4);
                                jce.F(npVar2, rv4Var4, l2);
                                s21.t(hashCode2, rv4Var4, npVar3, rv4Var4, kgVar);
                                jce.F(npVar4, rv4Var4, p2);
                                rs8.s(rv4Var4, -681359953, kq7Var, 8.0f, rv4Var4);
                                String[] strArr2 = ape.d;
                                int i4 = 0;
                                while (i4 < 4) {
                                    String str = strArr2[i4];
                                    boolean equals = "".equals(str);
                                    boolean f9 = rv4Var4.f(str);
                                    Object P5 = rv4Var4.P();
                                    if (f9 || P5 == lh9Var2) {
                                        P5 = new zl1(kve.v(str));
                                        rv4Var4.o0(P5);
                                    }
                                    long j2 = ((zl1) P5).a;
                                    nq7 n = pna.n(kq7Var, 36.0f);
                                    su9 su9Var = uu9.a;
                                    nq7 k = tte.k(n, su9Var);
                                    xt4 xt4Var4 = xt4Var3;
                                    boolean f10 = rv4Var4.f(xt4Var4) | rv4Var4.f(str);
                                    Object P6 = rv4Var4.P();
                                    if (f10 || P6 == lh9Var2) {
                                        P6 = new xr1(8, xt4Var4, str);
                                        rv4Var4.o0(P6);
                                    }
                                    nq7 v = nmd.v(tte.k(zbe.y(lbe.f(15, (vt4) P6, k, null, false), 5.0f), su9Var), j2, ba5Var2);
                                    if (equals) {
                                        rv4Var4.e0(-1666620136);
                                        ba5Var = ba5Var2;
                                        strArr = strArr2;
                                        nq7Var = nmd.v(zbe.y(nmd.v(zbe.y(kq7Var, 2.0f), rm1.g(((h27) rv4Var4.j(j27.a)).a, 4.0f), su9Var), 2.0f), j2, su9Var);
                                        i3 = 0;
                                        rv4Var4.q(false);
                                    } else {
                                        ba5Var = ba5Var2;
                                        strArr = strArr2;
                                        i3 = 0;
                                        rv4Var4.e0(-1666075931);
                                        rv4Var4.q(false);
                                        nq7Var = kq7Var;
                                    }
                                    fu0.a(v.a0(nq7Var), rv4Var4, i3);
                                    i4++;
                                    ba5Var2 = ba5Var;
                                    strArr2 = strArr;
                                }
                                s21.x(rv4Var4, false, kq7Var, 4.0f, rv4Var4);
                                rv4Var4.e0(393713217);
                                for (m32 m32Var : list) {
                                    xt4 xt4Var5 = xt4Var2;
                                    boolean f11 = rv4Var4.f(xt4Var5) | rv4Var4.h(m32Var);
                                    Object P7 = rv4Var4.P();
                                    if (f11 || P7 == lh9Var2) {
                                        P7 = new dr8(xt4Var5, m32Var, 0);
                                        rv4Var4.o0(P7);
                                    }
                                    zj0.a(m32Var, null, (vt4) P7, null, rv4Var4, 8);
                                }
                                s21.x(rv4Var4, false, kq7Var, 8.0f, rv4Var4);
                                rv4Var4.q(true);
                                rv4Var4.q(true);
                            } else {
                                rv4Var4.X();
                            }
                            return pvc.a;
                        }
                    }, rv4Var3), rv4Var3, 196608, 16);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ gj7(boolean z, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, int i) {
        this.a = i;
        this.b = z;
        this.c = xt4Var;
        this.d = vt4Var;
        this.e = vt4Var2;
        this.f = vt4Var3;
        this.C = vt4Var4;
        this.D = vt4Var5;
        this.E = vt4Var6;
    }
}
