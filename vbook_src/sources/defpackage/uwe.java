package defpackage;

import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uwe  reason: default package */
/* loaded from: classes.dex */
public abstract class uwe {
    public static final tu1 a = new tu1(new iv1(6), false, -760157526);
    public static final tu1 b = new tu1(new iv1(7), false, -1577466387);
    public static final tu1 c = new tu1(new ev1(26), false, -991174287);
    public static final tu1 d = new tu1(new ev1(27), false, 110872357);
    public static final StackTraceElement[] e = new StackTraceElement[0];

    public static final void a(int i, int i2, final xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, nq7 nq7Var, List list) {
        int i3;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        rv4Var.g0(665125975);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.d(i)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            obj = xt4Var;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((57344 & i3) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            Object obj3 = P;
            if (z2 || P == obj2) {
                rm0 m = qwe.m();
                dxe.B(m, false, xt4Var2);
                rv4Var.o0(m);
                obj3 = m;
            }
            final rm0 rm0Var = (rm0) obj3;
            io5 io5Var = (io5) rv4Var.j(do5.a);
            boolean f = rv4Var.f(io5Var);
            Object P2 = rv4Var.P();
            if (f || P2 == obj2) {
                P2 = new xq1(io5Var, 0);
                rv4Var.o0(P2);
            }
            mu4 mu4Var = (mu4) P2;
            boolean f2 = rv4Var.f(mu4Var);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj2) {
                P3 = new q71(mu4Var, 30);
                rv4Var.o0(P3);
            }
            final q71 q71Var = (q71) P3;
            final e81 u = ape.u(rv4Var);
            final c81 m2 = xoe.m(rv4Var);
            final o71 l = xoe.l(rv4Var);
            int i9 = i3 & 14;
            if (i9 != 4 && ((i3 & 8) == 0 || !rv4Var.f(list))) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object P4 = rv4Var.P();
            if (z3 || P4 == obj2) {
                P4 = yae.z(Boolean.FALSE);
                rv4Var.o0(P4);
            }
            aw7 aw7Var = (aw7) P4;
            if (!((Boolean) aw7Var.getValue()).booleanValue() && list.size() > i) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i9 != 4 && ((i3 & 8) == 0 || !rv4Var.f(list))) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean g = z5 | rv4Var.g(z4);
            if ((i3 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7 = g | z6;
            Object P5 = rv4Var.P();
            if (z7 || P5 == obj2) {
                if (z4) {
                    P5 = sl1.v0(list, i);
                } else {
                    P5 = list;
                }
                rv4Var.o0(P5);
            }
            final List list2 = (List) P5;
            if (!z4) {
                rv4Var.e0(2084981689);
                final xt4 xt4Var3 = obj;
                dye.b(nq7Var, jce.E(1267005145, new lu4() { // from class: yq1
                    @Override // defpackage.lu4
                    public final Object invoke(Object obj4, Object obj5) {
                        int i10 = r8;
                        pvc pvcVar = pvc.a;
                        boolean z8 = false;
                        switch (i10) {
                            case 0:
                                rv4 rv4Var2 = (rv4) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if ((intValue & 3) != 2) {
                                    z8 = true;
                                }
                                if (rv4Var2.U(intValue & 1, z8)) {
                                    npe.b(list2, rm0Var, u, m2, l, q71Var, xt4Var3, null, rv4Var2, 64, Token.CASE);
                                } else {
                                    rv4Var2.X();
                                }
                                return pvcVar;
                            default:
                                rv4 rv4Var3 = (rv4) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z8 = true;
                                }
                                if (rv4Var3.U(intValue2 & 1, z8)) {
                                    npe.b(list2, rm0Var, u, m2, l, q71Var, xt4Var3, pna.f(kq7.a, 1.0f), rv4Var3, 12582976, 0);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvcVar;
                        }
                    }
                }, rv4Var), rv4Var, 48 | ((i3 >> 3) & 14), 0);
                rv4Var.q(false);
            } else {
                rv4Var.e0(2085368631);
                nq7 f3 = pna.f(nq7Var, 1.0f);
                xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p = lye.p(rv4Var, f3);
                rw1.k.getClass();
                vt4 vt4Var = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, a2);
                jce.F(qw1.e, rv4Var, l2);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                dye.b(null, jce.E(-855650502, new lu4() { // from class: yq1
                    @Override // defpackage.lu4
                    public final Object invoke(Object obj4, Object obj5) {
                        int i10 = r8;
                        pvc pvcVar = pvc.a;
                        boolean z8 = false;
                        switch (i10) {
                            case 0:
                                rv4 rv4Var2 = (rv4) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if ((intValue & 3) != 2) {
                                    z8 = true;
                                }
                                if (rv4Var2.U(intValue & 1, z8)) {
                                    npe.b(list2, rm0Var, u, m2, l, q71Var, xt4Var, null, rv4Var2, 64, Token.CASE);
                                } else {
                                    rv4Var2.X();
                                }
                                return pvcVar;
                            default:
                                rv4 rv4Var3 = (rv4) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z8 = true;
                                }
                                if (rv4Var3.U(intValue2 & 1, z8)) {
                                    npe.b(list2, rm0Var, u, m2, l, q71Var, xt4Var, pna.f(kq7.a, 1.0f), rv4Var3, 12582976, 0);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvcVar;
                        }
                    }
                }, rv4Var), rv4Var, 48, 1);
                dye.a(jce.E(686520396, new sp0(aw7Var, 1), rv4Var), rv4Var, 6);
                rv4Var.q(true);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new xj7(i, i2, xt4Var, xt4Var2, nq7Var, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0259, code lost:
        if (r14 == r11) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x080f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.sp4 r67, defpackage.nq7 r68, defpackage.rh8 r69, defpackage.xt4 r70, defpackage.xt4 r71, defpackage.xt4 r72, defpackage.vt4 r73, defpackage.rv4 r74, int r75) {
        /*
            Method dump skipped, instructions count: 2176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwe.b(sp4, nq7, rh8, xt4, xt4, xt4, vt4, rv4, int):void");
    }

    public static final void c(ju6 ju6Var, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long j2;
        long j3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-184825322);
        if (rv4Var2.f(ju6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            eo4 q = nae.q(ju6Var.b, rv4Var2, 0);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
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
            kq7 kq7Var = kq7.a;
            nq7 b2 = q1d.b(tte.k(jsc.t(1.0f, pna.f(kq7Var, 1.0f), false), r0f.z(rv4Var2).d), !z, nae.e, vt4Var, 2);
            if (z) {
                rv4Var2.e0(2201576);
                long j4 = r0f.y(rv4Var2).c;
                z3 = false;
                rv4Var2.q(false);
                j = j4;
            } else {
                z3 = false;
                rv4Var2.e0(2297211);
                long g = rm1.g(r0f.y(rv4Var2), 4.0f);
                rv4Var2.q(false);
                j = g;
            }
            nq7 v = nmd.v(b2, j, lre.g);
            b37 d2 = fu0.d(kh5.a, z3);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, v);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            nq7 a3 = pu0.a.a(kq7Var, kh5.e);
            oyb oybVar = r0f.A(rv4Var2).e;
            if (z) {
                rv4Var2.e0(688155924);
                j2 = r0f.y(rv4Var2).d;
                z4 = false;
                rv4Var2.q(false);
            } else {
                z4 = false;
                rv4Var2.e0(688244925);
                j2 = r0f.y(rv4Var2).q;
                rv4Var2.q(false);
            }
            cvb.c("Aa", a3, j2, null, 0L, null, null, q, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var2, 6, 0, 130936);
            rs8.u(rv4Var2, true, kq7Var, 4.0f, rv4Var2);
            rv4Var2.e0(-554093805);
            String str = ju6Var.a;
            if (str.length() == 0) {
                str = yqe.A((y3b) o3b.J.getValue(), rv4Var2);
            }
            rv4Var2.q(false);
            nq7 u = l0e.u(new l95(kh5.J));
            if (z) {
                rv4Var2.e0(3193793);
                j3 = r0f.y(rv4Var2).a;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(3264287);
                j3 = r0f.y(rv4Var2).q;
                rv4Var2.q(false);
            }
            cvb.c(str, u, j3, null, 0L, null, null, q, 0L, null, null, 0L, 0, false, 1, 0, null, null, rv4Var2, 0, 24576, 245624);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new rd0(ju6Var, z, nq7Var, vt4Var, i, 6);
        }
    }

    public static final void d(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-161487622);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                vp4 vp4Var = (vp4) ((fdd) voe.z(cm9.a(vp4.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(vp4Var.e, rv4Var);
                boolean f = rv4Var.f(vp4Var);
                Object P = rv4Var.P();
                if (f || P == ax1.a) {
                    P = new rg0(vp4Var, null, 10);
                    rv4Var.o0(P);
                }
                yte.g((lu4) P, rv4Var, pvc.a);
                fxe.h(yqe.A((y3b) f3b.p.getValue(), rv4Var), pna.c, false, jce.E(-1488012802, new h64(cz7Var, 4), rv4Var), null, null, jce.E(-34319217, new cs1(vp4Var, cz7Var, z2, 5), rv4Var), rv4Var, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var, i, 5);
        }
    }

    public static final void e(final boolean z, final int i, final int i2, final String str, final int i3, final int i4, final int i5, final int i6, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final xt4 xt4Var, final vt4 vt4Var5, rv4 rv4Var, final int i7, final int i8) {
        int i9;
        int i10;
        final int i11;
        int i12;
        int i13;
        Object obj;
        Object obj2;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        str.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        xt4Var.getClass();
        vt4Var5.getClass();
        rv4Var.g0(-838888378);
        if ((i7 & 6) == 0) {
            if (rv4Var.g(z)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i9 = i23 | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            if (rv4Var.d(i)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i9 |= i22;
        }
        if ((i7 & 384) == 0) {
            i10 = i2;
            if (rv4Var.d(i10)) {
                i21 = 256;
            } else {
                i21 = Token.CASE;
            }
            i9 |= i21;
        } else {
            i10 = i2;
        }
        int i24 = 16384;
        if ((i7 & 24576) == 0) {
            i11 = i3;
            if (rv4Var.d(i11)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i9 |= i20;
        } else {
            i11 = i3;
        }
        if ((i7 & 196608) == 0) {
            if (rv4Var.d(i4)) {
                i19 = 131072;
            } else {
                i19 = Parser.ARGC_LIMIT;
            }
            i9 |= i19;
        }
        if ((i7 & 100663296) == 0) {
            if (rv4Var.f(nq7Var)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i9 |= i18;
        }
        if ((i7 & 805306368) == 0) {
            if (rv4Var.h(vt4Var)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i9 |= i17;
        }
        if ((i8 & 6) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i8 | i16;
        } else {
            i12 = i8;
        }
        if (rv4Var.h(vt4Var3)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i25 = i12 | i13;
        if ((i8 & 384) == 0) {
            obj = vt4Var4;
            if (rv4Var.h(obj)) {
                i15 = 256;
            } else {
                i15 = Token.CASE;
            }
            i25 |= i15;
        } else {
            obj = vt4Var4;
        }
        if ((i8 & 3072) == 0) {
            obj2 = xt4Var;
            if (rv4Var.h(obj2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i25 |= i14;
        } else {
            obj2 = xt4Var;
        }
        if ((i8 & 24576) == 0) {
            if (!rv4Var.h(vt4Var5)) {
                i24 = 8192;
            }
            i25 |= i24;
        }
        int i26 = i25;
        int i27 = i9;
        if ((i9 & 302063763) == 302063762 && (i26 & 9363) == 9362) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i27 & 1, z2)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
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
            nq7 f = pna.f(kq7.a, 1.0f);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new oi5(4);
                rv4Var.o0(P);
            }
            eu3 a3 = g.a(zt3.t((xt4) P));
            lz3 i28 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new oi5(5);
                rv4Var.o0(P2);
            }
            final int i29 = i10;
            final vt4 vt4Var6 = obj;
            final xt4 xt4Var2 = obj2;
            rte.e(z, f, a3, i28.a(zt3.x((xt4) P2)), null, jce.E(1357831828, new mu4() { // from class: ul5
                /* JADX WARN: Code restructure failed: missing block: B:39:0x033d, code lost:
                    if (r6 == r5) goto L70;
                 */
                @Override // defpackage.mu4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r56, java.lang.Object r57, java.lang.Object r58) {
                    /*
                        Method dump skipped, instructions count: 1186
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ul5.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, rv4Var), rv4Var, 1600902 | ((i27 << 3) & Token.ASSIGN_MOD), 16);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: vl5
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p2 = xoe.p(i7 | 1);
                    int p3 = xoe.p(i8);
                    uwe.e(z, i, i2, str, i3, i4, i5, i6, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, xt4Var, vt4Var5, (rv4) obj3, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void f(final boolean z, final int i, final int i2, final int i3, final int i4, final int i5, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, rv4 rv4Var, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj;
        Object obj2;
        final vt4 vt4Var5;
        int i14;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        rv4Var.g0(1399341437);
        int i26 = 4;
        if ((i6 & 6) == 0) {
            if (rv4Var.g(z)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i8 = i25 | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i9 = i;
            if (rv4Var.d(i9)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i8 |= i24;
        } else {
            i9 = i;
        }
        if ((i6 & 384) == 0) {
            i10 = i2;
            if (rv4Var.d(i10)) {
                i23 = 256;
            } else {
                i23 = Token.CASE;
            }
            i8 |= i23;
        } else {
            i10 = i2;
        }
        if ((i6 & 3072) == 0) {
            i11 = i3;
            if (rv4Var.d(i11)) {
                i22 = 2048;
            } else {
                i22 = 1024;
            }
            i8 |= i22;
        } else {
            i11 = i3;
        }
        if ((i6 & 24576) == 0) {
            i12 = i4;
            if (rv4Var.d(i12)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i8 |= i21;
        } else {
            i12 = i4;
        }
        if ((196608 & i6) == 0) {
            i13 = i5;
            if (rv4Var.d(i13)) {
                i20 = 131072;
            } else {
                i20 = Parser.ARGC_LIMIT;
            }
            i8 |= i20;
        } else {
            i13 = i5;
        }
        if ((1572864 & i6) == 0) {
            obj = nq7Var;
            if (rv4Var.f(obj)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i8 |= i19;
        } else {
            obj = nq7Var;
        }
        if ((12582912 & i6) == 0) {
            obj2 = vt4Var;
            if (rv4Var.h(obj2)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i8 |= i18;
        } else {
            obj2 = vt4Var;
        }
        if ((100663296 & i6) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i8 |= i17;
        }
        if ((805306368 & i6) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i8 |= i16;
        }
        if ((i7 & 6) == 0) {
            vt4Var5 = vt4Var4;
            if (!rv4Var.h(vt4Var5)) {
                i26 = 2;
            }
            i14 = i7 | i26;
        } else {
            vt4Var5 = vt4Var4;
            i14 = i7;
        }
        int i27 = i14;
        if ((i8 & 306783379) == 306783378 && (i27 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                i15 = i8;
                P = new oi5(6);
                rv4Var.o0(P);
            } else {
                i15 = i8;
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i28 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new oi5(7);
                rv4Var.o0(P2);
            }
            final int i29 = i9;
            final int i30 = i10;
            final int i31 = i11;
            final int i32 = i12;
            final int i33 = i13;
            final vt4 vt4Var6 = obj2;
            rte.c(z, obj, a2, i28.a(zt3.x((xt4) P2)), null, jce.E(-1864949851, new mu4() { // from class: wl5
                @Override // defpackage.mu4
                public final Object c(Object obj3, Object obj4, Object obj5) {
                    boolean z3;
                    float f;
                    boolean z4;
                    float f2;
                    float f3;
                    rv4 rv4Var2 = (rv4) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    ((qr) obj3).getClass();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        kq7 kq7Var = kq7.a;
                        nq7 f4 = pna.f(kq7Var, 1.0f);
                        xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, f4);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        np npVar = qw1.f;
                        jce.F(npVar, rv4Var2, a3);
                        np npVar2 = qw1.e;
                        jce.F(npVar2, rv4Var2, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        np npVar3 = qw1.g;
                        jce.F(npVar3, rv4Var2, valueOf);
                        kg kgVar = qw1.h;
                        jce.C(kgVar, rv4Var2);
                        np npVar4 = qw1.d;
                        jce.F(npVar4, rv4Var2, p);
                        nq7 f5 = pna.f(kq7Var, 1.0f);
                        tza tzaVar = j27.a;
                        vqe.m(nae.e, 6, 2, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), rv4Var2, f5);
                        nq7 z5 = zbe.z(mwe.u(nmd.v(q1d.h(rv4Var2, pna.f(kq7Var, 1.0f)), zl1.b(0.9f, rm1.g(((h27) rv4Var2.j(tzaVar)).a, 4.0f)), lre.g), false, 14), 12.0f, 6.0f);
                        gv9 a4 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, z5);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, a4);
                        jce.F(npVar2, rv4Var2, l2);
                        s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p2);
                        mfb mfbVar = jk3.d;
                        pc2.a(rp5.c((wk3) mfbVar.getValue(), rv4Var2, 0), null, vt4.this, rv4Var2, 0, 2);
                        xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                        pc2.a(rp5.c((wk3) ok3.m0.getValue(), rv4Var2, 0), null, vt4Var2, rv4Var2, 0, 2);
                        xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                        int i34 = i30;
                        boolean d2 = rv4Var2.d(i34);
                        int i35 = i31;
                        boolean d3 = d2 | rv4Var2.d(i35);
                        int i36 = i32;
                        boolean d4 = d3 | rv4Var2.d(i36);
                        int i37 = i33;
                        boolean d5 = d4 | rv4Var2.d(i37);
                        Object P3 = rv4Var2.P();
                        lh9 lh9Var2 = ax1.a;
                        if (d5 || P3 == lh9Var2) {
                            float f6 = i34;
                            if (i37 > 0) {
                                f = (i36 + 1.0f) / i37;
                            } else {
                                f = 0.0f;
                            }
                            P3 = rqe.h("%.1f", Float.valueOf(((f6 + f) * 100.0f) / i35));
                            rv4Var2.o0(P3);
                        }
                        cvb.c(yqe.B((y3b) b3b.i.getValue(), new Object[]{(String) P3}, rv4Var2), zbe.A(kq7Var, nae.e, 6.0f, 1), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var2, 48, 0, 131064);
                        xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                        float f7 = i34 + 1.0f;
                        jk1 jk1Var = new jk1(1.0f, i35);
                        kpa kpaVar = kpa.a;
                        gpa d6 = kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.a), rv4Var2, 1015);
                        we6 we6Var = new we6(1.0f, true);
                        Object P4 = rv4Var2.P();
                        if (P4 == lh9Var2) {
                            P4 = new dva(26);
                            rv4Var2.o0(P4);
                        }
                        dae.d(f7, (xt4) P4, we6Var, false, null, d6, null, 0, null, null, jk1Var, rv4Var2, 48, 0, 984);
                        xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                        int i38 = i29;
                        if (i38 != 0) {
                            z4 = true;
                            if (i38 != 1) {
                                f3 = -45.0f;
                            } else {
                                f3 = -135.0f;
                            }
                            f2 = f3;
                        } else {
                            z4 = true;
                            f2 = 0.0f;
                        }
                        pc2.a(rp5.c((wk3) ok3.k0.getValue(), rv4Var2, 0), tte.t(kq7Var, ((Number) nq.b(f2, null, null, rv4Var2, 0, 30).getValue()).floatValue()), vt4Var6, rv4Var2, 0, 0);
                        xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
                        pc2.a(rp5.c((wk3) mfbVar.getValue(), rv4Var2, 0), tte.t(kq7Var, 180.0f), vt4Var3, rv4Var2, 48, 0);
                        rv4Var2.q(z4);
                        rv4Var2.q(z4);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i15 & 14) | 200064 | ((i15 >> 15) & Token.ASSIGN_MOD), 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: xl5
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p = xoe.p(i6 | 1);
                    int p2 = xoe.p(i7);
                    uwe.f(z, i, i2, i3, i4, i5, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, (rv4) obj3, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.jub r45, final defpackage.xt4 r46, final defpackage.nq7 r47, boolean r48, defpackage.oyb r49, defpackage.lu4 r50, defpackage.lu4 r51, defpackage.lu4 r52, boolean r53, defpackage.ted r54, defpackage.t86 r55, defpackage.q86 r56, boolean r57, int r58, int r59, final defpackage.wea r60, defpackage.hrb r61, defpackage.rv4 r62, final int r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwe.g(jub, xt4, nq7, boolean, oyb, lu4, lu4, lu4, boolean, ted, t86, q86, boolean, int, int, wea, hrb, rv4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r48, final defpackage.xt4 r49, final defpackage.nq7 r50, boolean r51, boolean r52, defpackage.oyb r53, defpackage.lu4 r54, defpackage.lu4 r55, defpackage.lu4 r56, defpackage.lu4 r57, boolean r58, defpackage.ted r59, defpackage.t86 r60, defpackage.q86 r61, boolean r62, int r63, int r64, defpackage.wea r65, defpackage.hrb r66, defpackage.rv4 r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwe.h(java.lang.String, xt4, nq7, boolean, boolean, oyb, lu4, lu4, lu4, lu4, boolean, ted, t86, q86, boolean, int, int, wea, hrb, rv4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:273:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final defpackage.lu4 r40, defpackage.mu4 r41, defpackage.lu4 r42, final defpackage.lu4 r43, final defpackage.lu4 r44, final defpackage.lu4 r45, final defpackage.lu4 r46, final boolean r47, final defpackage.isb r48, final defpackage.fsb r49, final defpackage.fsb r50, final defpackage.fsb r51, final defpackage.xt4 r52, final defpackage.tu1 r53, defpackage.lu4 r54, defpackage.rh8 r55, defpackage.rv4 r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwe.i(lu4, mu4, lu4, lu4, lu4, lu4, lu4, boolean, isb, fsb, fsb, fsb, xt4, tu1, lu4, rh8, rv4, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r0 == r1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(int r2, int r3, int r4, long r5) {
        /*
            int r0 = defpackage.fxb.g(r5)
            int r1 = defpackage.fxb.f(r5)
            if (r1 >= r2) goto Lb
            return r5
        Lb:
            if (r0 > r2) goto L17
            if (r3 > r1) goto L17
            int r3 = r3 - r2
            int r4 = r4 - r3
            if (r0 != r1) goto L14
            goto L22
        L14:
            int r2 = r1 + r4
            goto L2c
        L17:
            if (r0 <= r2) goto L1e
            if (r1 >= r3) goto L1e
            int r2 = r2 + r4
            r0 = r2
            goto L2c
        L1e:
            if (r0 < r3) goto L24
            int r3 = r3 - r2
            int r4 = r4 - r3
        L22:
            int r0 = r0 + r4
            goto L14
        L24:
            if (r2 >= r0) goto L2c
            int r0 = r2 + r4
            int r3 = r3 - r2
            int r4 = r4 - r3
            int r2 = r4 + r1
        L2c:
            long r2 = defpackage.sze.a(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwe.j(int, int, int, long):long");
    }

    public static final Object k(d19 d19Var, npb npbVar, m42 m42Var) {
        Object p = k27.p(new ol(d19Var, npbVar, (m42) null, 16), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    public static boolean l(String str) {
        if (str.length() <= 1 || str.charAt(0) != '/') {
            return false;
        }
        return true;
    }

    public static boolean m(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final wz9 n(List list, List list2, List list3) {
        wz9 wz9Var;
        if (list2.size() > 0) {
            ((lma) list2.get(0)).getClass();
            wz9Var = new kma(((jz7) sl1.j0(list)).b, (jz7) sl1.j0(list), sl1.Z(list));
        } else {
            wz9Var = null;
        }
        if (wz9Var == null) {
            wz9Var = new kma(((jz7) sl1.j0(list)).b, (jz7) sl1.j0(list), sl1.Z(list));
        }
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            if (list3.get(i) == null) {
                if (wz9Var instanceof og8) {
                    wz9Var = (og8) wz9Var;
                } else {
                    wz9Var = null;
                }
                wz9Var.getClass();
            } else {
                vm1.h();
                return null;
            }
        }
        return wz9Var;
    }

    public static final uo3 o(List list, rv4 rv4Var) {
        Object P = rv4Var.P();
        if (P == ax1.a) {
            int i = so3.f;
            P = new uo3(twe.v(list));
            rv4Var.o0(P);
        }
        return (uo3) P;
    }

    public static final void p(frb frbVar, int i, int i2) {
        frbVar.g(sze.a(dce.n(i, 0, frbVar.c.length()), dce.n(i2, 0, frbVar.c.length())));
    }

    public static final nq7 q(rv4 rv4Var, nq7 nq7Var) {
        tza tzaVar = j27.a;
        return zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 16.0f);
    }
}
