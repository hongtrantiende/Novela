package defpackage;

import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xl7  reason: default package */
/* loaded from: classes3.dex */
public abstract class xl7 {
    public static final List a = tl1.B(4294967295L, 4294961979L, 4278248959L, 4294934699L, 4287349578L, 4294944550L);
    public static final List b = tl1.B(0L, 4278190080L, 4282532418L, 4294967295L);

    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void a(List list, long j, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        float f;
        long b2;
        boolean z3;
        ?? r8;
        rv4Var.g0(76104456);
        if (rv4Var.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        boolean z4 = true;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            gv9 a2 = ev9.a(new hz(10.0f, true, new vs(2)), kh5.F, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, f2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(1327755804);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (longValue == j) {
                    z2 = z4;
                } else {
                    z2 = false;
                }
                long b3 = sve.b((int) longValue);
                nq7 n = pna.n(kq7Var, 32.0f);
                su9 su9Var = uu9.a;
                nq7 v = nmd.v(tte.k(n, su9Var), b3, lre.g);
                if (z2) {
                    f = 2.0f;
                } else {
                    f = 1.0f;
                }
                if (z2) {
                    rv4Var.e0(-1675102718);
                    b2 = ((h27) rv4Var.j(j27.a)).a.a;
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1675007827);
                    b2 = zl1.b(0.3f, ((h27) rv4Var.j(j27.a)).a.q);
                    rv4Var.q(false);
                }
                nq7 d = st0.d(v, f, b2, su9Var);
                if ((i7 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean e = z3 | rv4Var.e(longValue);
                Object P = rv4Var.P();
                if (!e && P != ax1.a) {
                    r8 = 0;
                } else {
                    r8 = 0;
                    P = new rl7(xt4Var, longValue, 0);
                    rv4Var.o0(P);
                }
                fu0.a(lbe.f(15, (vt4) P, d, null, r8), rv4Var, r8);
                z4 = true;
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sl7(list, j, xt4Var, i, 0);
        }
    }

    public static final void b(String str, float f, jk1 jk1Var, String str2, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1403100186);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var2.c(f)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var2.f(jk1Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var2.f(str2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            tza tzaVar = j27.a;
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, i11 & 14, 0, 131068);
            int i12 = i11 >> 9;
            cvb.c(str2, null, zl1.b(0.7f, ((h27) rv4Var.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, i12 & 14, 0, 131066);
            rv4Var.q(true);
            kpa kpaVar = kpa.a;
            rv4Var2 = rv4Var;
            dae.d(f, xt4Var, pna.f(kq7Var, 1.0f), false, null, kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var.j(tzaVar)).a.a), rv4Var, 1015), null, 0, null, null, jk1Var, rv4Var2, ((i11 >> 3) & 14) | 384 | (i12 & Token.ASSIGN_MOD), (i11 >> 6) & 14, 984);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vc3(str, f, jk1Var, str2, xt4Var, i);
        }
    }

    public static final void c(final boolean z, final boolean z2, final s6d s6dVar, final List list, final int i, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final xt4 xt4Var6, final xt4 xt4Var7, final xt4 xt4Var8, final xt4 xt4Var9, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c;
        char c2;
        int i13;
        int i14;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        s6dVar.getClass();
        list.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        xt4Var6.getClass();
        xt4Var7.getClass();
        xt4Var8.getClass();
        xt4Var9.getClass();
        rv4Var2.g0(1325025655);
        if (rv4Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i2 | i3;
        if (rv4Var2.g(z2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i16 = i15 | i4;
        if (rv4Var2.f(s6dVar)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i17 = i16 | i5;
        if (rv4Var2.f(list)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i18 = i17 | i6;
        if (rv4Var2.d(i)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i19 = i18 | i7;
        if (rv4Var2.h(xt4Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i8;
        if (rv4Var2.h(xt4Var2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i21 = i20 | i9;
        if (rv4Var2.h(xt4Var3)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i22 = i21 | i10;
        if (rv4Var2.h(xt4Var4)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i23 = i22 | i11;
        if (rv4Var2.h(xt4Var5)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i24 = i23 | i12;
        if (rv4Var2.h(xt4Var6)) {
            c = 4;
        } else {
            c = 2;
        }
        if (rv4Var2.h(xt4Var7)) {
            c2 = ' ';
        } else {
            c2 = 16;
        }
        int i25 = c | c2;
        if (rv4Var2.h(xt4Var8)) {
            i13 = 256;
        } else {
            i13 = Token.CASE;
        }
        int i26 = i25 | i13;
        if (rv4Var2.h(xt4Var9)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i27 = i26 | i14;
        boolean z4 = true;
        if ((i24 & 306783379) == 306783378 && (i27 & 1171) == 1170) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var2.U(i24 & 1, z3)) {
            if (z2) {
                rv4Var2.e0(-1204511858);
            } else {
                rv4Var2.e0(2039355189);
                z4 = !ikd.a(rv4Var2);
            }
            rv4Var2.q(false);
            if (z4) {
                rv4Var2.e0(-1204427093);
                nmd.f(z, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(668386563, new ql7(s6dVar, list, i, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, xt4Var8, xt4Var9), rv4Var2), rv4Var, (i24 & 14) | 805309440 | ((i24 >> 12) & Token.ASSIGN_MOD), 500);
                rv4Var.q(false);
                rv4Var2 = rv4Var;
            } else {
                rv4Var2.e0(-1203106059);
                ze4 ze4Var = pna.c;
                tu1 E = jce.E(889463793, new mu4() { // from class: ul7
                    @Override // defpackage.mu4
                    public final Object c(Object obj, Object obj2, Object obj3) {
                        boolean z5;
                        int i28;
                        su0 su0Var = (su0) obj;
                        rv4 rv4Var3 = (rv4) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        su0Var.getClass();
                        if ((intValue & 6) == 0) {
                            if (rv4Var3.f(su0Var)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            intValue |= i28;
                        }
                        if ((intValue & 19) != 18) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (rv4Var3.U(intValue & 1, z5)) {
                            nq7 h = pna.h(kq7.a, (su0Var.c() * 2.0f) / 3.0f);
                            long j = ((h27) rv4Var3.j(j27.a)).a.p;
                            tu1 tu1Var = ch0.g;
                            final s6d s6dVar2 = s6dVar;
                            final List list2 = list;
                            final int i29 = i;
                            final xt4 xt4Var10 = xt4Var2;
                            final xt4 xt4Var11 = xt4Var3;
                            final xt4 xt4Var12 = xt4Var4;
                            final xt4 xt4Var13 = xt4Var5;
                            final xt4 xt4Var14 = xt4Var6;
                            final xt4 xt4Var15 = xt4Var7;
                            final xt4 xt4Var16 = xt4Var8;
                            final xt4 xt4Var17 = xt4Var9;
                            nmd.d(z, xt4Var, h, true, null, null, j, 0L, nae.e, 0L, tu1Var, jce.E(1053010765, new mu4() { // from class: wl7
                                @Override // defpackage.mu4
                                public final Object c(Object obj4, Object obj5, Object obj6) {
                                    boolean z6;
                                    rv4 rv4Var4 = (rv4) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((zn1) obj4).getClass();
                                    if ((intValue2 & 17) != 16) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (rv4Var4.U(intValue2 & 1, z6)) {
                                        kq7 kq7Var = kq7.a;
                                        nq7 C = rte.C(pna.f(kq7Var, 1.0f), rte.u(rv4Var4), 14);
                                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                                        int hashCode = Long.hashCode(rv4Var4.T);
                                        xt8 l = rv4Var4.l();
                                        nq7 p = lye.p(rv4Var4, C);
                                        rw1.k.getClass();
                                        zx1 zx1Var = qw1.b;
                                        rv4Var4.i0();
                                        if (rv4Var4.S) {
                                            rv4Var4.k(zx1Var);
                                        } else {
                                            rv4Var4.r0();
                                        }
                                        jce.F(qw1.f, rv4Var4, a2);
                                        jce.F(qw1.e, rv4Var4, l);
                                        jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                                        jce.C(qw1.h, rv4Var4);
                                        jce.F(qw1.d, rv4Var4, p);
                                        xl7.d(s6d.this, list2, i29, zbe.x(pna.f(kq7Var, 1.0f), mwe.f(6, rv4Var4, false)), xt4Var10, xt4Var11, xt4Var12, xt4Var13, xt4Var14, xt4Var15, xt4Var16, xt4Var17, rv4Var4, 0);
                                        xbe.i(rv4Var4, pna.h(kq7Var, mwe.s(rv4Var4) + 8.0f));
                                        rv4Var4.q(true);
                                    } else {
                                        rv4Var4.X();
                                    }
                                    return pvc.a;
                                }
                            }, rv4Var3), rv4Var3, 3072, 54, 944);
                        } else {
                            rv4Var3.X();
                        }
                        return pvc.a;
                    }
                }, rv4Var2);
                rv4Var2 = rv4Var2;
                hc2.b(ze4Var, null, E, rv4Var2, 3078, 6);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(z, z2, s6dVar, list, i, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, xt4Var8, xt4Var9, i2) { // from class: vl7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ xt4 D;
                public final /* synthetic */ xt4 E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ xt4 G;
                public final /* synthetic */ xt4 H;
                public final /* synthetic */ xt4 I;
                public final /* synthetic */ xt4 J;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ s6d c;
                public final /* synthetic */ List d;
                public final /* synthetic */ int e;
                public final /* synthetic */ xt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    xl7.c(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void d(s6d s6dVar, List list, int i, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, xt4 xt4Var8, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        char c;
        boolean z;
        rv4 rv4Var2;
        rv4Var.g0(-2046640793);
        if (rv4Var.f(s6dVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        char c2 = 16;
        if (rv4Var.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (rv4Var.d(i)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i15 = i14 | i5;
        if (rv4Var.f(nq7Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (rv4Var.h(xt4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (rv4Var.h(xt4Var2)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i18 = i17 | i8;
        if (rv4Var.h(xt4Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if (rv4Var.h(xt4Var4)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i20 = i19 | i10;
        if (rv4Var.h(xt4Var5)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i21 = i20 | i11;
        if (rv4Var.h(xt4Var6)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i22 = i21 | i12;
        if (rv4Var.h(xt4Var7)) {
            c = 4;
        } else {
            c = 2;
        }
        if (rv4Var.h(xt4Var8)) {
            c2 = ' ';
        }
        int i23 = c | c2;
        if ((306783379 & i22) == 306783378 && (i23 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i22 & 1, z)) {
            nq7 A = zbe.A(nq7Var, 12.0f, nae.e, 2);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(f, ((h27) rv4Var.j(tzaVar)).c.c), rm1.g(((h27) rv4Var.j(tzaVar)).a, 3.0f), lre.g), 12.0f);
            xn1 a3 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, y);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            g(s6dVar.g, yqe.A((y3b) b2b.h.getValue(), rv4Var), xt4Var2, rv4Var, (i22 >> 9) & 896);
            rv4Var.q(true);
            rv4Var2 = rv4Var;
            rte.e(s6dVar.g, null, zt3.g(null, 3).a(zt3.e(15)), zt3.i(null, 3).a(zt3.p(15)), null, jce.E(-1629365835, new qq5(list, i, xt4Var, s6dVar, xt4Var5, xt4Var6, xt4Var7, xt4Var3, xt4Var4, xt4Var8), rv4Var), rv4Var2, 1600518, 18);
            hl5.w(kq7Var, 12.0f, rv4Var2, true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new hf3(s6dVar, list, i, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, xt4Var8, i2);
        }
    }

    public static final void e(int i, rv4 rv4Var) {
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(752083641);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i & 1, z)) {
            nq7 y = zbe.y(pna.f(kq7.a, 1.0f), 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) b2b.j.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j35(i, 19);
        }
    }

    public static final void f(List list, int i, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4Var.g0(1099172698);
        if (rv4Var.f(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5;
        if ((i8 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            s9e.f(pna.f(kq7.a, 1.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(1611164757, new tl7(i, xt4Var, yqe.A((y3b) b2b.q.getValue(), rv4Var), list), rv4Var), rv4Var, 1573302);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ps1(i, i2, xt4Var, list);
        }
    }

    public static final void g(boolean z, String str, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1163059332);
        if ((i & 6) == 0) {
            if (rv4Var2.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            nq7 f = pna.f(kq7.a, 1.0f);
            if ((i2 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i6 = i2 & 14;
            if (i6 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var2.P();
            if (z5 || P == ax1.a) {
                P = new up0(12, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7 t = q1d.t(1, (vt4) P, rv4Var2, f, false);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, t);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var2, (i2 >> 3) & 14, 0, 131068);
            rv4Var2 = rv4Var;
            tte.g(z, false, null, xt4Var, rv4Var2, i6 | ((i2 << 3) & 7168), 6);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new z52(i, 6, str, xt4Var, z);
        }
    }

    public static final void h(String str, boolean z, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long g;
        long b2;
        long j;
        rv4Var.g0(-1021932650);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            if (z) {
                rv4Var.e0(-1667255992);
                g = zl1.b(0.2f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1667182491);
                g = rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f);
                rv4Var.q(false);
            }
            if (z) {
                rv4Var.e0(-1667075448);
                b2 = zl1.b(0.6f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1667002040);
                b2 = zl1.b(0.2f, ((h27) rv4Var.j(j27.a)).a.A);
                rv4Var.q(false);
            }
            if (z) {
                rv4Var.e0(-1666900453);
                j = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1666845831);
                j = ((h27) rv4Var.j(j27.a)).a.q;
                rv4Var.q(false);
            }
            tza tzaVar = j27.a;
            nq7 z3 = zbe.z(lbe.f(15, vt4Var, st0.d(nmd.v(tte.k(kq7.a, ((h27) rv4Var.j(tzaVar)).c.c), g, lre.g), 1.0f, b2, ((h27) rv4Var.j(tzaVar)).c.c), null, false), 14.0f, 8.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z3);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            cvb.c(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, i7 & 14, 0, 131066);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new eg7(i, 1, vt4Var, str, z);
        }
    }
}
