package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pt0  reason: default package */
/* loaded from: classes3.dex */
public abstract class pt0 {
    public static final v72 a = bue.a(32.0f);
    public static final tza b = new f99(new mf0(11));

    public static final void a(hv9 hv9Var, boolean z, vt4 vt4Var, tu1 tu1Var, nq7 nq7Var, boolean z2, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        kq7 kq7Var;
        boolean z4;
        boolean z5;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        hv9Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(774038367);
        if ((i & 6) == 0) {
            if (rv4Var.f(hv9Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        int i8 = i2 | 221184;
        if ((1572864 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i8 |= i3;
        }
        if ((599187 & i8) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i8 & 1, z3)) {
            if (((om3) rv4Var.j(nm3.a)).f()) {
                rv4Var.e0(821537285);
                if (((dc6) rv4Var.j(zf0.a)).a != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(-302146704);
                rv4Var.q(false);
                z5 = false;
            }
            if (z5) {
                rv4Var.e0(-302090589);
                if (z) {
                    rv4Var.e0(-302065014);
                    j = ((h27) rv4Var.j(j27.a)).a.a;
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-302002456);
                    j = ((h27) rv4Var.j(j27.a)).a.q;
                    rv4Var.q(false);
                }
                c(hv9Var, vt4Var, jce.E(-1962383157, new jk7(j, tu1Var, lu4Var, 1), rv4Var), rv4Var, ((i8 >> 6) & 896) | (i8 & 14) | 3072 | ((i8 >> 3) & Token.ASSIGN_MOD));
                rv4Var.q(false);
            } else {
                rv4Var.e0(-301494428);
                vz7.b(hv9Var, z, vt4Var, tu1Var, null, lu4Var, false, null, rv4Var, i8 & 4136958);
                rv4Var.q(false);
            }
            kq7Var = kq7.a;
            z4 = true;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
            z4 = z2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mt0(hv9Var, z, vt4Var, tu1Var, kq7Var, z4, lu4Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, qid] */
    public static final void b(int i, xt4 xt4Var, int i2, nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4 rv4Var2 = rv4Var;
        xt4Var.getClass();
        rv4Var2.g0(-1558245706);
        if ((i3 & 6) == 0) {
            i4 = i;
            if (rv4Var2.d(i4)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i3;
        } else {
            i4 = i;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i5 |= i9;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var2.d(i2)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i5 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i5 |= i7;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var2.h(tu1Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i5 |= i6;
        }
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            ec6 ec6Var = ((dc6) rv4Var2.j(zf0.a)).a;
            if (((om3) rv4Var2.j(nm3.a)).f() && ec6Var != null) {
                rv4Var2.e0(-1690973844);
                nq7 C = zbe.C(zbe.A(nq7Var, 18.0f, nae.e, 2), nae.e, nae.e, nae.e, 8.0f, 7);
                int i11 = i5 & Token.ELSE;
                int i12 = i5 << 3;
                d(i4, xt4Var, ec6Var, i2, C, tu1Var, rv4Var2, i11 | (i12 & 7168) | (i12 & 458752));
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1690621901);
                vz7.a(pna.f(kq7.a, 1.0f), zl1.h, 0L, 1.0f, new Object(), tu1Var, rv4Var, ((i5 << 3) & 458752) | 3126);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bt0(i, xt4Var, i2, nq7Var, tu1Var, i3);
        }
    }

    public static final void c(hv9 hv9Var, vt4 vt4Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(1178738540);
        if ((i & 6) == 0) {
            if (rv4Var.f(hv9Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        int i7 = i & 384;
        kq7 kq7Var = kq7.a;
        if (i7 == 0) {
            if (rv4Var.f(kq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i8 = i2;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            vt4 vt4Var2 = (vt4) rv4Var.j(b);
            nq7 a2 = hv9Var.a(1.0f, pna.c(lbe.e(tte.k(kq7Var, a), null, null, false, new xt9(4), vt4Var, 12), 1.0f), true);
            boolean f = rv4Var.f(vt4Var2);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new nv(5, vt4Var2);
                rv4Var.o0(P);
            }
            nq7 k = axe.k(a2, (xt4) P);
            int i9 = (i8 & 7168) | 432;
            xn1 a3 = wn1.a(new hz(2.0f, false, new vs(3)), kh5.J, rv4Var, 54);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, k);
            rw1.k.getClass();
            vt4 vt4Var3 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a3);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.c(zn1.a, rv4Var, Integer.valueOf(((i9 >> 6) & Token.ASSIGN_MOD) | 6));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(hv9Var, vt4Var, tu1Var, i);
        }
    }

    public static final void d(final int i, final xt4 xt4Var, final ec6 ec6Var, final int i2, final nq7 nq7Var, final tu1 tu1Var, rv4 rv4Var, final int i3) {
        int i4;
        boolean z;
        long b2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(1634804799);
        if ((i3 & 6) == 0) {
            if (rv4Var.d(i)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.f(ec6Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i4 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var.d(i2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        if ((196608 & i3) == 0) {
            if (rv4Var.h(tu1Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i4 |= i5;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            tza tzaVar = nm3.a;
            final boolean z2 = !((om3) rv4Var.j(tzaVar)).d();
            final long j = ((h27) rv4Var.j(j27.a)).a.K;
            final long p = hud.p(rv4Var);
            if (((om3) rv4Var.j(tzaVar)).d()) {
                b2 = zl1.b(0.5f, zl1.e);
            } else {
                b2 = zl1.b(0.55f, zl1.e);
            }
            final long j2 = b2;
            final ec6 R = h9a.R(null, rv4Var, 3);
            hc2.b(nq7Var, kh5.d, jce.E(-1556762091, new mu4() { // from class: kt0
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    final boolean z4;
                    Object obj4;
                    m82 m82Var;
                    final boolean z5;
                    final float f;
                    final yya yyaVar;
                    int i11;
                    su0 su0Var = (su0) obj;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i11 = 4;
                        } else {
                            i11 = 2;
                        }
                        intValue |= i11;
                    }
                    if ((intValue & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        r13 r13Var = (r13) rv4Var2.j(dy1.h);
                        float i12 = x02.i(su0Var.b) - r13Var.L0(8.0f);
                        final int i13 = i2;
                        float f2 = i13;
                        final float f3 = i12 / f2;
                        Object P = rv4Var2.P();
                        Object obj5 = ax1.a;
                        if (P == obj5) {
                            P = tc4.a(nae.e, 0.01f);
                            rv4Var2.o0(P);
                        }
                        final lq lqVar = (lq) P;
                        boolean f4 = rv4Var2.f(r13Var);
                        Object P2 = rv4Var2.P();
                        if (f4 || P2 == obj5) {
                            P2 = yae.q(new se0(2, lqVar, su0Var, r13Var));
                            rv4Var2.o0(P2);
                        }
                        yya yyaVar2 = (yya) P2;
                        if (rv4Var2.j(dy1.n) == tc6.a) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Object P3 = rv4Var2.P();
                        if (P3 == obj5) {
                            P3 = yte.s(rv4Var2);
                            rv4Var2.o0(P3);
                        }
                        final m82 m82Var2 = (m82) P3;
                        Object P4 = rv4Var2.P();
                        int i14 = i;
                        if (P4 == obj5) {
                            P4 = new em8(i14);
                            rv4Var2.o0(P4);
                        }
                        em8 em8Var = (em8) P4;
                        Integer valueOf = Integer.valueOf(i14);
                        boolean d = rv4Var2.d(i14);
                        Object P5 = rv4Var2.P();
                        if (d || P5 == obj5) {
                            P5 = new oi(i14, em8Var, (m42) null);
                            rv4Var2.o0(P5);
                        }
                        yte.g((lu4) P5, rv4Var2, valueOf);
                        boolean f5 = rv4Var2.f(m82Var2);
                        Object P6 = rv4Var2.P();
                        if (!f5 && P6 != obj5) {
                            obj4 = obj5;
                            m82Var = m82Var2;
                        } else {
                            obj4 = obj5;
                            P6 = new ef2(m82Var2, i14, new jk1(nae.e, i13 - 1), 1.3928572f, new c8(4, (byte) 0), new gt0(i13, xt4Var, m82Var2, lqVar), new mu4() { // from class: ht0
                                @Override // defpackage.mu4
                                public final Object c(Object obj6, Object obj7, Object obj8) {
                                    float f6;
                                    ef2 ef2Var = (ef2) obj6;
                                    zy5 zy5Var = (zy5) obj7;
                                    y78 y78Var = (y78) obj8;
                                    ef2Var.getClass();
                                    float b3 = ef2Var.b();
                                    float intBitsToFloat = Float.intBitsToFloat((int) (y78Var.a >> 32)) / f3;
                                    if (z4) {
                                        f6 = 1.0f;
                                    } else {
                                        f6 = -1.0f;
                                    }
                                    float f7 = (intBitsToFloat * f6) + b3;
                                    float f8 = i13 - 1;
                                    if (f7 < nae.e) {
                                        f7 = 0.0f;
                                    }
                                    if (f7 <= f8) {
                                        f8 = f7;
                                    }
                                    ef2Var.d(f8);
                                    z87.v(m82Var2, null, null, new l0(lqVar, y78Var, null, 28), 3);
                                    return pvc.a;
                                }
                            });
                            m82Var = m82Var2;
                            rv4Var2.o0(P6);
                        }
                        final ef2 ef2Var = (ef2) P6;
                        boolean h = rv4Var2.h(ef2Var);
                        Object P7 = rv4Var2.P();
                        if (h || P7 == obj4) {
                            P7 = new l0(em8Var, ef2Var, null, 27);
                            rv4Var2.o0(P7);
                        }
                        yte.g((lu4) P7, rv4Var2, ef2Var);
                        boolean f6 = rv4Var2.f(m82Var);
                        Object P8 = rv4Var2.P();
                        if (!f6 && P8 != obj4) {
                            z5 = z4;
                            f = f3;
                            yyaVar = yyaVar2;
                        } else {
                            z5 = z4;
                            f = f3;
                            yyaVar = yyaVar2;
                            P8 = new oz5(m82Var, new it0(z5, ef2Var, f3, yyaVar2, 0));
                            rv4Var2.o0(P8);
                        }
                        oz5 oz5Var = (oz5) P8;
                        boolean f7 = rv4Var2.f(yyaVar);
                        Object P9 = rv4Var2.P();
                        if (f7 || P9 == obj4) {
                            P9 = new jt0(yyaVar, 0);
                            rv4Var2.o0(P9);
                        }
                        kq7 kq7Var = kq7.a;
                        nq7 k = axe.k(kq7Var, (xt4) P9);
                        Object P10 = rv4Var2.P();
                        if (P10 == obj4) {
                            P10 = new mf0(12);
                            rv4Var2.o0(P10);
                        }
                        vt4 vt4Var = (vt4) P10;
                        Object P11 = rv4Var2.P();
                        if (P11 == obj4) {
                            P11 = new nj0(13);
                            rv4Var2.o0(P11);
                        }
                        xt4 xt4Var2 = (xt4) P11;
                        Object P12 = rv4Var2.P();
                        if (P12 == obj4) {
                            P12 = new mf0(13);
                            rv4Var2.o0(P12);
                        }
                        vt4 vt4Var2 = (vt4) P12;
                        Object P13 = rv4Var2.P();
                        if (P13 == obj4) {
                            P13 = new mf0(14);
                            rv4Var2.o0(P13);
                        }
                        vt4 vt4Var3 = (vt4) P13;
                        Object P14 = rv4Var2.P();
                        if (P14 == obj4) {
                            P14 = new mf0(17);
                            rv4Var2.o0(P14);
                        }
                        vt4 vt4Var4 = (vt4) P14;
                        boolean h2 = rv4Var2.h(ef2Var);
                        Object P15 = rv4Var2.P();
                        if (h2 || P15 == obj4) {
                            P15 = new ft0(ef2Var, 2);
                            rv4Var2.o0(P15);
                        }
                        xt4 xt4Var3 = (xt4) P15;
                        long j3 = p;
                        boolean e = rv4Var2.e(j3);
                        Object P16 = rv4Var2.P();
                        if (e || P16 == obj4) {
                            P16 = new th(j3, 2);
                            rv4Var2.o0(P16);
                        }
                        ec6 ec6Var2 = ec6Var;
                        nq7 y = zbe.y(pna.f(pna.h(rse.e(k, ec6Var2, vt4Var, xt4Var2, vt4Var2, vt4Var3, vt4Var4, xt4Var3, (xt4) P16, 2944).a0(oz5Var.g), 64.0f), 1.0f), 4.0f);
                        gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, y);
                        rw1.k.getClass();
                        vt4 vt4Var5 = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(vt4Var5);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(qw1.f, rv4Var2, a2);
                        jce.F(qw1.e, rv4Var2, l);
                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var2);
                        jce.F(qw1.d, rv4Var2, p2);
                        Object obj6 = jv9.a;
                        tu1 tu1Var2 = tu1Var;
                        tu1Var2.c(obj6, rv4Var2, 6);
                        rv4Var2.q(true);
                        tza tzaVar2 = pt0.b;
                        boolean h3 = rv4Var2.h(ef2Var);
                        Object P17 = rv4Var2.P();
                        if (h3 || P17 == obj4) {
                            P17 = new ct0(ef2Var, 0);
                            rv4Var2.o0(P17);
                        }
                        i99 a3 = tzaVar2.a((vt4) P17);
                        ec6 ec6Var3 = R;
                        pye.a(a3, jce.E(911464149, new dt0(ec6Var3, yyaVar, ec6Var2, j3, oz5Var, j, tu1Var2), rv4Var2), rv4Var2, 56);
                        nq7 A = zbe.A(kq7Var, 4.0f, nae.e, 2);
                        boolean g = rv4Var2.g(z5) | rv4Var2.h(ef2Var) | rv4Var2.c(f) | rv4Var2.f(yyaVar);
                        Object P18 = rv4Var2.P();
                        if (g || P18 == obj4) {
                            P18 = new xt4() { // from class: et0
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj7) {
                                    float intBitsToFloat;
                                    float e2;
                                    t15 t15Var = (t15) obj7;
                                    t15Var.getClass();
                                    boolean z6 = z5;
                                    ef2 ef2Var2 = ef2Var;
                                    float f8 = f;
                                    yya yyaVar3 = yyaVar;
                                    if (z6) {
                                        intBitsToFloat = ef2Var2.c() * f8;
                                        e2 = pt0.e(yyaVar3);
                                    } else {
                                        intBitsToFloat = Float.intBitsToFloat((int) (t15Var.b() >> 32)) - ((ef2Var2.c() + 1.0f) * f8);
                                        e2 = pt0.e(yyaVar3);
                                    }
                                    t15Var.x(e2 + intBitsToFloat);
                                    return pvc.a;
                                }
                            };
                            rv4Var2.o0(P18);
                        }
                        nq7 a0 = axe.k(A, (xt4) P18).a0(oz5Var.h).a0(ef2Var.s);
                        do1 M = owe.M(ec6Var2, ec6Var3, rv4Var2, 0);
                        Object P19 = rv4Var2.P();
                        if (P19 == obj4) {
                            P19 = new mf0(10);
                            rv4Var2.o0(P19);
                        }
                        vt4 vt4Var6 = (vt4) P19;
                        boolean h4 = rv4Var2.h(ef2Var);
                        Object P20 = rv4Var2.P();
                        if (h4 || P20 == obj4) {
                            P20 = new ft0(ef2Var, 0);
                            rv4Var2.o0(P20);
                        }
                        xt4 xt4Var4 = (xt4) P20;
                        boolean h5 = rv4Var2.h(ef2Var);
                        long j4 = j2;
                        boolean e2 = h5 | rv4Var2.e(j4);
                        Object P21 = rv4Var2.P();
                        if (e2 || P21 == obj4) {
                            P21 = new ct0(ef2Var, j4);
                            rv4Var2.o0(P21);
                        }
                        vt4 vt4Var7 = (vt4) P21;
                        boolean h6 = rv4Var2.h(ef2Var);
                        Object P22 = rv4Var2.P();
                        if (h6 || P22 == obj4) {
                            P22 = new ct0(ef2Var, 2);
                            rv4Var2.o0(P22);
                        }
                        vt4 vt4Var8 = (vt4) P22;
                        boolean h7 = rv4Var2.h(ef2Var);
                        Object P23 = rv4Var2.P();
                        if (h7 || P23 == obj4) {
                            P23 = new ct0(ef2Var, 3);
                            rv4Var2.o0(P23);
                        }
                        vt4 vt4Var9 = (vt4) P23;
                        boolean h8 = rv4Var2.h(ef2Var);
                        Object P24 = rv4Var2.P();
                        if (h8 || P24 == obj4) {
                            P24 = new ft0(ef2Var, 1);
                            rv4Var2.o0(P24);
                        }
                        xt4 xt4Var5 = (xt4) P24;
                        boolean h9 = rv4Var2.h(ef2Var);
                        boolean z6 = z2;
                        boolean g2 = h9 | rv4Var2.g(z6);
                        Object P25 = rv4Var2.P();
                        if (g2 || P25 == obj4) {
                            P25 = new nf0(ef2Var, z6, 1);
                            rv4Var2.o0(P25);
                        }
                        fu0.a(pna.f(pna.h(rse.e(a0, M, vt4Var6, xt4Var4, vt4Var7, vt4Var8, vt4Var9, xt4Var5, (xt4) P25, 2944), 56.0f), 1.0f / f2), rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i4 >> 12) & 14) | 3120, 4);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: lt0
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pt0.d(i, xt4Var, ec6Var, i2, nq7Var, tu1Var, (rv4) obj, xoe.p(i3 | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final float e(yya yyaVar) {
        return ((Number) yyaVar.getValue()).floatValue();
    }
}
