package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ct8  reason: default package */
/* loaded from: classes3.dex */
public abstract class ct8 {
    public static final long a = sve.d(4281348144L);
    public static final long b = sve.d(4294305480L);
    public static final /* synthetic */ int c = 0;

    public static final void a(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        String str2;
        int i3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(705107595);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            rv4Var2.e0(207377399);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, 24576, 0, 130030);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            ar5 c2 = rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0);
            String A = yqe.A((y3b) b3b.B.getValue(), rv4Var2);
            Object P = rv4Var2.P();
            if (P == ax1.a) {
                P = new sc8(22);
                rv4Var2.o0(P);
            }
            z1d.f(c2, A, false, null, null, null, null, null, (vt4) P, rv4Var2, 100663296, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ma(str, nq7Var, i, 6);
        }
    }

    public static final void b(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1555849141);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.g;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i5 & 14) | 48, 0, 130044);
            eg0.f(pna.n(kq7Var, 48.0f), ((zl1) rv4Var.j(r12.a)).a, null, rv4Var, 6, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            pc2.a(rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0), nc2.o(kq7Var), vt4Var, rv4Var2, i5 & 896, 0);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 12);
        }
    }

    public static final void c(ss8 ss8Var, final dt8 dt8Var, cz7 cz7Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        dt8 dt8Var2;
        boolean z2;
        aw7 aw7Var;
        nk0 nk0Var;
        boolean z3;
        long j;
        aw7 aw7Var2;
        aw7 aw7Var3;
        aw7 aw7Var4;
        Object obj;
        int i5;
        int i6;
        aw7 aw7Var5;
        aw7 aw7Var6;
        int i7;
        long j2;
        vp8 vp8Var;
        long j3;
        int i8;
        boolean z4;
        aw7 aw7Var7;
        Integer num;
        Integer num2;
        Object obj2;
        hm8 hm8Var;
        Object obj3;
        boolean z5;
        boolean z6;
        dt8 dt8Var3;
        sk8 sk8Var;
        final ar8 ar8Var;
        int i9;
        aw7 aw7Var8;
        Object obj4;
        boolean z7;
        Object obj5;
        boolean z8;
        boolean z9;
        Object obj6;
        int i10;
        aw7 aw7Var9;
        vq8 vq8Var;
        aw7 aw7Var10;
        int i11;
        long j4;
        aw7 aw7Var11;
        aw7 aw7Var12;
        boolean z10;
        nq7 nq7Var2;
        tc6 tc6Var;
        nk0 nk0Var2;
        int i12;
        kq7 kq7Var;
        boolean z11;
        am5 am5Var;
        vt4 vt4Var;
        vt4 vt4Var2;
        Object obj7;
        boolean z12;
        vt4 vt4Var3;
        aw7 aw7Var13;
        boolean z13;
        vt4 vt4Var4;
        boolean z14;
        int i13;
        boolean z15;
        vt4 vt4Var5;
        xt4 xt4Var;
        final ss8 ss8Var2;
        vt4 vt4Var6;
        boolean z16;
        aw7 aw7Var14;
        boolean z17;
        boolean z18;
        int i14;
        boolean z19;
        boolean z20;
        boolean z21;
        int i15;
        final ss8 ss8Var3;
        Object obj8;
        aw7 aw7Var15;
        Object obj9;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        cza czaVar = ss8Var.T;
        nk0 nk0Var3 = kh5.E;
        rv4Var.g0(980827151);
        if (rv4Var.f(ss8Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i16 = i | i2;
        if (rv4Var.f(dt8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i17 = i16 | i3;
        if (rv4Var.f(cz7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i18 = i17 | i4;
        if ((i18 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i18 & 1, z)) {
            final aw7 z36 = jsc.z(ss8Var.Q, rv4Var);
            aw7 z37 = jsc.z(ss8Var.R, rv4Var);
            aw7 z38 = jsc.z(ss8Var.S, rv4Var);
            aw7 z39 = jsc.z(czaVar, rv4Var);
            aw7 z40 = jsc.z(ss8Var.U, rv4Var);
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj10 = ax1.a;
            if (P == obj10) {
                P = new sc8(14);
                rv4Var.o0(P);
            }
            aw7 aw7Var16 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj10) {
                P2 = new sc8(15);
                rv4Var.o0(P2);
            }
            final aw7 aw7Var17 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            Object[] objArr3 = new Object[0];
            Object P3 = rv4Var.P();
            if (P3 == obj10) {
                P3 = new sc8(16);
                rv4Var.o0(P3);
            }
            aw7 aw7Var18 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
            Object[] objArr4 = new Object[0];
            Object P4 = rv4Var.P();
            if (P4 == obj10) {
                P4 = new sc8(17);
                rv4Var.o0(P4);
            }
            aw7 aw7Var19 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var, 48);
            Object[] objArr5 = new Object[0];
            Object P5 = rv4Var.P();
            if (P5 == obj10) {
                P5 = new sc8(18);
                rv4Var.o0(P5);
            }
            aw7 aw7Var20 = (aw7) zpe.k(objArr5, (vt4) P5, rv4Var, 48);
            Object[] objArr6 = new Object[0];
            Object P6 = rv4Var.P();
            if (P6 == obj10) {
                P6 = new sc8(19);
                rv4Var.o0(P6);
            }
            aw7 aw7Var21 = (aw7) zpe.k(objArr6, (vt4) P6, rv4Var, 48);
            Object[] objArr7 = new Object[0];
            Object P7 = rv4Var.P();
            if (P7 == obj10) {
                P7 = new sc8(20);
                rv4Var.o0(P7);
            }
            aw7 aw7Var22 = (aw7) zpe.k(objArr7, (vt4) P7, rv4Var, 48);
            Object[] objArr8 = new Object[0];
            Object P8 = rv4Var.P();
            if (P8 == obj10) {
                P8 = new sc8(21);
                rv4Var.o0(P8);
            }
            Object obj11 = (aw7) zpe.k(objArr8, (vt4) P8, rv4Var, 48);
            Object P9 = rv4Var.P();
            if (P9 == obj10) {
                P9 = yae.z(Boolean.FALSE);
                rv4Var.o0(P9);
            }
            aw7 aw7Var23 = (aw7) P9;
            Boolean bool = (Boolean) aw7Var23.getValue();
            bool.getClass();
            Float valueOf = Float.valueOf(((dm5) z36.getValue()).c);
            boolean f = rv4Var.f(z36);
            int i19 = i18 & Token.ASSIGN_MOD;
            if (i19 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z41 = f | z2;
            Object P10 = rv4Var.P();
            if (z41 || P10 == obj10) {
                P10 = new at8((m42) null, aw7Var23, z36, dt8Var);
                rv4Var.o0(P10);
            }
            yte.h(bool, valueOf, (lu4) P10, rv4Var);
            aw7 z42 = jsc.z(ss8Var.X, rv4Var);
            aw7 z43 = jsc.z(ss8Var.Y, rv4Var);
            Object P11 = rv4Var.P();
            if (P11 == obj10) {
                P11 = yae.z(-1);
                rv4Var.o0(P11);
            }
            aw7 aw7Var24 = (aw7) P11;
            Object P12 = rv4Var.P();
            ks3 ks3Var = ks3.a;
            if (P12 == obj10) {
                P12 = yae.z(ks3Var);
                rv4Var.o0(P12);
            }
            aw7 aw7Var25 = (aw7) P12;
            f99 f99Var = j27.a;
            final long b2 = zl1.b(0.5f, ((h27) rv4Var.j(f99Var)).a.j);
            vfb vfbVar = (vfb) rv4Var.j(nm3.b);
            Object P13 = rv4Var.P();
            if (P13 == obj10) {
                P13 = yae.q(new he1(aw7Var16, aw7Var17, 23));
                rv4Var.o0(P13);
            }
            yya yyaVar = (yya) P13;
            Boolean bool2 = (Boolean) yyaVar.getValue();
            bool2.getClass();
            boolean f2 = rv4Var.f(vfbVar);
            Object P14 = rv4Var.P();
            if (!f2 && P14 != obj10) {
                aw7Var = aw7Var23;
                nk0Var = nk0Var3;
            } else {
                aw7Var = aw7Var23;
                nk0Var = nk0Var3;
                P14 = new om5(vfbVar, yyaVar, null, 1);
                rv4Var.o0(P14);
            }
            yte.g((lu4) P14, rv4Var, bool2);
            Object P15 = rv4Var.P();
            if (P15 == obj10) {
                int i20 = ((xp5) czaVar.getValue()).b;
                if (i20 < 0) {
                    i20 = 0;
                }
                P15 = yae.z(Integer.valueOf(i20));
                rv4Var.o0(P15);
            }
            aw7 aw7Var26 = (aw7) P15;
            int h = dt8Var.g.h();
            aw7 z44 = jsc.z(dt8Var.a.d, rv4Var);
            float f3 = ((zc6) z44.getValue()).h;
            long j5 = ((zc6) z44.getValue()).g;
            aw7 x = jsc.x(ss8Var.W, new uqc(-1, new vp8(-1, ks3Var)), rv4Var, 64);
            vp8 vp8Var2 = ((uqc) x.getValue()).b;
            final long b3 = zl1.b(0.3f, ((h27) rv4Var.j(f99Var)).a.a);
            wxb wxbVar = (wxb) rv4Var.j(xxb.a);
            long j6 = wxbVar.b;
            long j7 = wxbVar.a;
            int i21 = i18 & 14;
            if ((((i18 & 14) ^ 6) > 4 && rv4Var.f(ss8Var)) || (i18 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P16 = rv4Var.P();
            if (!z3 && P16 != obj10) {
                j = j7;
                aw7Var2 = z43;
                aw7Var3 = aw7Var16;
                aw7Var4 = aw7Var20;
                obj = obj11;
                i5 = i18;
                i6 = i19;
                aw7Var5 = aw7Var19;
                aw7Var6 = aw7Var21;
                i7 = h;
                j2 = j5;
                vp8Var = vp8Var2;
                j3 = j6;
                i8 = i21;
            } else {
                j = j7;
                aw7Var2 = z43;
                aw7Var3 = aw7Var16;
                aw7Var4 = aw7Var20;
                obj = obj11;
                i5 = i18;
                i6 = i19;
                aw7Var5 = aw7Var19;
                aw7Var6 = aw7Var21;
                i7 = h;
                j2 = j5;
                vp8Var = vp8Var2;
                j3 = j6;
                i8 = i21;
                Object ar8Var2 = new ar8(new xe1(2, ss8Var, ss8.class, "loadTextBlocks", "loadTextBlocks(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10));
                rv4Var.o0(ar8Var2);
                P16 = ar8Var2;
            }
            ar8 ar8Var3 = (ar8) P16;
            sk8 sk8Var2 = ar8Var3.b;
            int c2 = sk8Var2.c();
            int e = sk8Var2.e();
            int a2 = sk8Var2.a();
            Integer valueOf2 = Integer.valueOf(c2);
            Integer valueOf3 = Integer.valueOf(e);
            Integer valueOf4 = Integer.valueOf(a2);
            boolean d = rv4Var.d(c2) | rv4Var.d(a2) | rv4Var.d(e);
            if (i8 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean f4 = d | z4 | rv4Var.f(sk8Var2);
            Object P17 = rv4Var.P();
            if (!f4 && P17 != obj10) {
                aw7Var7 = x;
                obj2 = P17;
                num2 = valueOf3;
                num = valueOf4;
            } else {
                aw7Var7 = x;
                num = valueOf4;
                num2 = valueOf3;
                Object bt8Var = new bt8(c2, a2, e, ss8Var, sk8Var2, null);
                sk8Var2 = sk8Var2;
                rv4Var.o0(bt8Var);
                obj2 = bt8Var;
            }
            yte.i(valueOf2, num2, num, (lu4) obj2, rv4Var);
            Object P18 = rv4Var.P();
            if (P18 == obj10) {
                P18 = yae.z(Boolean.FALSE);
                rv4Var.o0(P18);
            }
            aw7 aw7Var27 = (aw7) P18;
            Float valueOf5 = Float.valueOf(f3);
            y78 y78Var = new y78(j2);
            Object P19 = rv4Var.P();
            if (P19 == obj10) {
                P19 = new as2(aw7Var27, null, 3);
                rv4Var.o0(P19);
            }
            yte.h(valueOf5, y78Var, (lu4) P19, rv4Var);
            hm8 hm8Var2 = ar8Var3.f;
            hm8 hm8Var3 = ar8Var3.g;
            hm8 hm8Var4 = ar8Var3.h;
            hm8 hm8Var5 = ar8Var3.d;
            boolean d2 = rv4Var.d(((Number) ar8Var3.e.getValue()).intValue()) | rv4Var.f((y78) hm8Var2.getValue()) | rv4Var.c(f3) | rv4Var.e(j2) | rv4Var.f((y78) hm8Var3.getValue()) | rv4Var.f((sc6) hm8Var4.getValue()) | rv4Var.f((sc6) hm8Var5.getValue());
            Object P20 = rv4Var.P();
            if (d2 || P20 == obj10) {
                y78 y78Var2 = (y78) hm8Var2.getValue();
                y78 y78Var3 = (y78) hm8Var3.getValue();
                sc6 sc6Var = (sc6) hm8Var4.getValue();
                sc6 sc6Var2 = (sc6) hm8Var5.getValue();
                if (y78Var2 != null && y78Var3 != null && sc6Var != null && sc6Var2 != null && sc6Var.t() && sc6Var2.t()) {
                    long O = sc6Var2.O(sc6Var.m(y78Var2.a));
                    long O2 = sc6Var2.O(sc6Var.m(y78Var3.a));
                    if (Float.intBitsToFloat((int) (O & 4294967295L)) >= ((Number) hm8Var.getValue()).intValue() - Float.intBitsToFloat((int) (4294967295L & O2))) {
                        obj3 = new yp8(O, xq8.a);
                    } else {
                        obj3 = new yp8(O2, xq8.b);
                    }
                } else {
                    obj3 = null;
                }
                rv4Var.o0(obj3);
                P20 = obj3;
            }
            yp8 yp8Var = (yp8) P20;
            int i22 = i6;
            if (i22 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f5 = rv4Var.f(sk8Var2) | z5 | rv4Var.f(ar8Var3);
            if (i8 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i23 = i7;
            boolean d3 = f5 | z6 | rv4Var.d(i23);
            Object P21 = rv4Var.P();
            if (!d3 && P21 != obj10) {
                obj4 = P21;
                sk8Var = sk8Var2;
                i9 = i23;
                ar8Var = ar8Var3;
                aw7Var8 = aw7Var26;
                dt8Var3 = dt8Var;
            } else {
                dt8Var3 = dt8Var;
                Object yo1Var = new yo1(dt8Var3, sk8Var2, ar8Var3, ss8Var, i23, aw7Var26, null);
                sk8Var = sk8Var2;
                ar8Var = ar8Var3;
                i9 = i23;
                aw7Var8 = aw7Var26;
                rv4Var.o0(yo1Var);
                obj4 = yo1Var;
            }
            yte.g((lu4) obj4, rv4Var, dt8Var3);
            aw7 aw7Var28 = aw7Var7;
            boolean f6 = rv4Var.f(aw7Var28);
            if (i22 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z45 = f6 | z7;
            Object P22 = rv4Var.P();
            if (!z45 && P22 != obj10) {
                obj5 = null;
            } else {
                obj5 = null;
                P22 = new jk8((m42) null, aw7Var28, aw7Var8, dt8Var3);
                rv4Var.o0(P22);
            }
            yte.g((lu4) P22, rv4Var, dt8Var3);
            vq8 vq8Var2 = (vq8) aw7Var2.getValue();
            Object obj12 = aw7Var2;
            boolean f7 = rv4Var.f(obj12);
            if (i8 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z46 = f7 | z8;
            if (i22 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z47 = z46 | z9;
            Object P23 = rv4Var.P();
            if (!z47 && P23 != obj10) {
                obj6 = obj5;
                i10 = i22;
                aw7Var10 = aw7Var24;
                aw7Var9 = aw7Var25;
                vq8Var = vq8Var2;
            } else {
                obj6 = obj5;
                i10 = i22;
                aw7Var9 = aw7Var25;
                vq8Var = vq8Var2;
                aw7Var10 = aw7Var24;
                Object xr0Var = new xr0(ss8Var, dt8Var3, obj12, aw7Var10, aw7Var9, null, 14);
                rv4Var.o0(xr0Var);
                P23 = xr0Var;
            }
            yte.g((lu4) P23, rv4Var, vq8Var);
            int i24 = ((dm5) z36.getValue()).u;
            boolean d4 = rv4Var.d(i24);
            Object P24 = rv4Var.P();
            if (d4 || P24 == obj10) {
                i11 = 1;
                if (i24 != 1) {
                    if (i24 != 2) {
                        int i25 = zl1.j;
                        j4 = zl1.e;
                    } else {
                        j4 = b;
                    }
                } else {
                    j4 = a;
                }
                Object zh8Var = new zh8(j4, 6);
                rv4Var.o0(zh8Var);
                P24 = zh8Var;
            } else {
                i11 = 1;
            }
            zh8 zh8Var2 = (zh8) P24;
            boolean d5 = rv4Var.d(i24);
            Object P25 = rv4Var.P();
            if (d5 || P25 == obj10) {
                if (i24 != i11) {
                    if (i24 != 2) {
                        P25 = obj6;
                    } else {
                        P25 = ki8.e;
                    }
                } else {
                    P25 = ki8.d;
                }
                rv4Var.o0(P25);
            }
            em1 em1Var = (em1) P25;
            boolean f8 = rv4Var.f(ar8Var);
            Object P26 = rv4Var.P();
            if (f8 || P26 == obj10) {
                P26 = new xt4() { // from class: ts8
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj13) {
                        int i26 = r2;
                        long j8 = 0;
                        pvc pvcVar = pvc.a;
                        ar8 ar8Var4 = ar8Var;
                        switch (i26) {
                            case 0:
                                sc6 sc6Var3 = (sc6) obj13;
                                sc6Var3.getClass();
                                ar8Var4.d.setValue(sc6Var3);
                                return pvcVar;
                            case 1:
                                ((r13) obj13).getClass();
                                y78 y78Var4 = (y78) ar8Var4.i.getValue();
                                if (y78Var4 != null) {
                                    j8 = y78Var4.a;
                                }
                                return new y78(j8);
                            case 2:
                                r13 r13Var = (r13) obj13;
                                r13Var.getClass();
                                y78 y78Var5 = (y78) ar8Var4.i.getValue();
                                if (y78Var5 != null) {
                                    j8 = y78Var5.a;
                                }
                                float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - r13Var.L0(80.0f);
                                return new y78((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
                            default:
                                ar8Var4.e.setValue(Integer.valueOf((int) (((zy5) obj13).a & 4294967295L)));
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P26);
            }
            nq7 l = pbe.l(nq7Var, (xt4) P26);
            boolean f9 = rv4Var.f(ar8Var);
            Object P27 = rv4Var.P();
            if (f9 || P27 == obj10) {
                P27 = new xt4() { // from class: ts8
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj13) {
                        int i26 = r2;
                        long j8 = 0;
                        pvc pvcVar = pvc.a;
                        ar8 ar8Var4 = ar8Var;
                        switch (i26) {
                            case 0:
                                sc6 sc6Var3 = (sc6) obj13;
                                sc6Var3.getClass();
                                ar8Var4.d.setValue(sc6Var3);
                                return pvcVar;
                            case 1:
                                ((r13) obj13).getClass();
                                y78 y78Var4 = (y78) ar8Var4.i.getValue();
                                if (y78Var4 != null) {
                                    j8 = y78Var4.a;
                                }
                                return new y78(j8);
                            case 2:
                                r13 r13Var = (r13) obj13;
                                r13Var.getClass();
                                y78 y78Var5 = (y78) ar8Var4.i.getValue();
                                if (y78Var5 != null) {
                                    j8 = y78Var5.a;
                                }
                                float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - r13Var.L0(80.0f);
                                return new y78((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
                            default:
                                ar8Var4.e.setValue(Integer.valueOf((int) (((zy5) obj13).a & 4294967295L)));
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P27);
            }
            nq7 y = obe.y(l, (xt4) P27);
            y78 y78Var4 = (y78) ar8Var.i.getValue();
            kq7 kq7Var2 = kq7.a;
            if (y78Var4 != null) {
                rv4Var.e0(1167185813);
                boolean f10 = rv4Var.f(ar8Var);
                Object P28 = rv4Var.P();
                if (f10 || P28 == obj10) {
                    P28 = new xt4() { // from class: ts8
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj13) {
                            int i26 = r2;
                            long j8 = 0;
                            pvc pvcVar = pvc.a;
                            ar8 ar8Var4 = ar8Var;
                            switch (i26) {
                                case 0:
                                    sc6 sc6Var3 = (sc6) obj13;
                                    sc6Var3.getClass();
                                    ar8Var4.d.setValue(sc6Var3);
                                    return pvcVar;
                                case 1:
                                    ((r13) obj13).getClass();
                                    y78 y78Var42 = (y78) ar8Var4.i.getValue();
                                    if (y78Var42 != null) {
                                        j8 = y78Var42.a;
                                    }
                                    return new y78(j8);
                                case 2:
                                    r13 r13Var = (r13) obj13;
                                    r13Var.getClass();
                                    y78 y78Var5 = (y78) ar8Var4.i.getValue();
                                    if (y78Var5 != null) {
                                        j8 = y78Var5.a;
                                    }
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - r13Var.L0(80.0f);
                                    return new y78((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
                                default:
                                    ar8Var4.e.setValue(Integer.valueOf((int) (((zy5) obj13).a & 4294967295L)));
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P28);
                }
                xt4 xt4Var2 = (xt4) P28;
                boolean f11 = rv4Var.f(ar8Var);
                Object P29 = rv4Var.P();
                if (f11 || P29 == obj10) {
                    P29 = new xt4() { // from class: ts8
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj13) {
                            int i26 = r2;
                            long j8 = 0;
                            pvc pvcVar = pvc.a;
                            ar8 ar8Var4 = ar8Var;
                            switch (i26) {
                                case 0:
                                    sc6 sc6Var3 = (sc6) obj13;
                                    sc6Var3.getClass();
                                    ar8Var4.d.setValue(sc6Var3);
                                    return pvcVar;
                                case 1:
                                    ((r13) obj13).getClass();
                                    y78 y78Var42 = (y78) ar8Var4.i.getValue();
                                    if (y78Var42 != null) {
                                        j8 = y78Var42.a;
                                    }
                                    return new y78(j8);
                                case 2:
                                    r13 r13Var = (r13) obj13;
                                    r13Var.getClass();
                                    y78 y78Var5 = (y78) ar8Var4.i.getValue();
                                    if (y78Var5 != null) {
                                        j8 = y78Var5.a;
                                    }
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - r13Var.L0(80.0f);
                                    return new y78((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
                                default:
                                    ar8Var4.e.setValue(Integer.valueOf((int) (((zy5) obj13).a & 4294967295L)));
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P29);
                }
                aw7Var11 = aw7Var10;
                aw7Var12 = aw7Var9;
                nq7Var2 = kxe.o(kq7Var2, xt4Var2, (xt4) P29, ote.a(120.0f, 60.0f));
                z10 = false;
                rv4Var.q(false);
            } else {
                aw7Var11 = aw7Var10;
                aw7Var12 = aw7Var9;
                z10 = false;
                rv4Var.e0(1167683363);
                rv4Var.q(false);
                nq7Var2 = kq7Var2;
            }
            nq7 a0 = y.a0(nq7Var2);
            b37 d6 = fu0.d(kh5.a, z10);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p = lye.p(rv4Var, a0);
            rw1.k.getClass();
            vt4 vt4Var7 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var7);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d6);
            jce.F(qw1.e, rv4Var, l2);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            if (((dm5) z36.getValue()).b == 2) {
                tc6Var = tc6.b;
            } else {
                tc6Var = tc6.a;
            }
            i99[] i99VarArr = {ki8.a.a(zh8Var2), ki8.c.a(em1Var), dy1.n.a(tc6Var)};
            int i26 = i8;
            final ar8 ar8Var4 = ar8Var;
            final sk8 sk8Var3 = sk8Var;
            nk0 nk0Var4 = nk0Var;
            final aw7 aw7Var29 = aw7Var11;
            final vp8 vp8Var3 = vp8Var;
            final aw7 aw7Var30 = aw7Var3;
            final aw7 aw7Var31 = aw7Var12;
            final long j8 = j3;
            int i27 = i10;
            final aw7 aw7Var32 = aw7Var;
            int i28 = i9;
            final long j9 = j;
            aw7 aw7Var33 = aw7Var8;
            pye.b(i99VarArr, jce.E(1732845653, new lu4() { // from class: us8
                @Override // defpackage.lu4
                public final Object invoke(Object obj13, Object obj14) {
                    boolean z48;
                    final ar8 ar8Var5;
                    rv4 rv4Var2 = (rv4) obj13;
                    int intValue = ((Integer) obj14).intValue();
                    if ((intValue & 3) != 2) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z48)) {
                        ze4 ze4Var = pna.c;
                        boolean z49 = ((dm5) z36.getValue()).f;
                        nq7 nq7Var3 = kq7.a;
                        if (!z49) {
                            rv4Var2.e0(1993127678);
                            WeakHashMap weakHashMap = yjd.w;
                            nq7Var3 = zbe.x(nq7Var3, w92.o(h88.n(rv4Var2).b, rv4Var2));
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(1993242285);
                            rv4Var2.q(false);
                        }
                        nq7 a02 = ze4Var.a0(nq7Var3);
                        final sk8 sk8Var4 = sk8Var3;
                        boolean f12 = rv4Var2.f(sk8Var4);
                        ar8 ar8Var6 = ar8Var4;
                        aw7 aw7Var34 = aw7Var30;
                        aw7 aw7Var35 = aw7Var17;
                        boolean f13 = f12 | rv4Var2.f(ar8Var6) | rv4Var2.f(aw7Var34) | rv4Var2.f(aw7Var35);
                        Object P30 = rv4Var2.P();
                        if (!f13 && P30 != ax1.a) {
                            ar8Var5 = ar8Var6;
                        } else {
                            p6 p6Var = new p6(sk8Var4, ar8Var6, aw7Var32, aw7Var34, aw7Var35);
                            ar8Var5 = ar8Var6;
                            rv4Var2.o0(p6Var);
                            P30 = p6Var;
                        }
                        final vp8 vp8Var4 = vp8Var3;
                        final long j10 = b3;
                        final long j11 = b2;
                        final long j12 = j8;
                        final long j13 = j9;
                        final aw7 aw7Var36 = aw7Var29;
                        final aw7 aw7Var37 = aw7Var31;
                        n4f.d(a02, dt8.this, nae.e, false, (xt4) P30, jce.E(2038642496, new nu4() { // from class: ys8
                            /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
                            @Override // defpackage.nu4
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object h(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                                /*
                                    Method dump skipped, instructions count: 422
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ys8.h(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, rv4Var2), rv4Var2, 1572864);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 48);
            boolean z48 = ((dm5) z36.getValue()).r;
            pu0 pu0Var = pu0.a;
            if (z48) {
                rv4Var.e0(994119389);
                nk0Var2 = nk0Var4;
                kq7Var = kq7Var2;
                i12 = i28;
                nxe.j(d(aw7Var33) + 1, i12, zbe.y(pu0Var.a(kq7Var, nk0Var2), 12.0f), rv4Var, 0);
                rv4Var.q(false);
            } else {
                nk0Var2 = nk0Var4;
                i12 = i28;
                kq7Var = kq7Var2;
                rv4Var.e0(994350029);
                rv4Var.q(false);
            }
            boolean booleanValue = ((Boolean) aw7Var30.getValue()).booleanValue();
            rl5 rl5Var = (rl5) z37.getValue();
            am5 am5Var2 = (am5) z38.getValue();
            xp5 xp5Var = (xp5) z39.getValue();
            dm5 dm5Var = (dm5) z36.getValue();
            int i29 = i5;
            int i30 = i29 & 896;
            if (i30 == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object P30 = rv4Var.P();
            if (!z11 && P30 != obj10) {
                am5Var = am5Var2;
            } else {
                am5Var = am5Var2;
                P30 = new px6(cz7Var, 12);
                rv4Var.o0(P30);
            }
            vt4 vt4Var8 = (vt4) P30;
            boolean f12 = rv4Var.f(aw7Var30);
            Object P31 = rv4Var.P();
            if (!f12 && P31 != obj10) {
                vt4Var = vt4Var8;
            } else {
                vt4Var = vt4Var8;
                P31 = new he1(aw7Var30, aw7Var32, 19);
                rv4Var.o0(P31);
            }
            vt4 vt4Var9 = (vt4) P31;
            aw7 aw7Var34 = aw7Var5;
            aw7 aw7Var35 = aw7Var4;
            boolean f13 = rv4Var.f(aw7Var30) | rv4Var.f(aw7Var34) | rv4Var.f(aw7Var35);
            Object P32 = rv4Var.P();
            if (!f13 && P32 != obj10) {
                vt4Var2 = vt4Var9;
            } else {
                vt4Var2 = vt4Var9;
                P32 = new lm5(aw7Var30, aw7Var34, aw7Var35, 1);
                rv4Var.o0(P32);
            }
            vt4 vt4Var10 = (vt4) P32;
            Object P33 = rv4Var.P();
            if (P33 == obj10) {
                P33 = new sc8(22);
                rv4Var.o0(P33);
            }
            vt4 vt4Var11 = (vt4) P33;
            boolean f14 = rv4Var.f(aw7Var30) | rv4Var.f(aw7Var18);
            Object P34 = rv4Var.P();
            if (!f14 && P34 != obj10) {
                obj7 = aw7Var34;
            } else {
                obj7 = aw7Var34;
                P34 = new he1(aw7Var30, aw7Var18, 20);
                rv4Var.o0(P34);
            }
            vt4 vt4Var12 = (vt4) P34;
            aw7 aw7Var36 = aw7Var6;
            boolean f15 = rv4Var.f(aw7Var30) | rv4Var.f(aw7Var36);
            Object P35 = rv4Var.P();
            if (f15 || P35 == obj10) {
                P35 = new he1(aw7Var30, aw7Var36, 21);
                rv4Var.o0(P35);
            }
            vt4 vt4Var13 = (vt4) P35;
            boolean d7 = rv4Var.d(i12);
            if (i27 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z49 = d7 | z12;
            Object P36 = rv4Var.P();
            if (!z49 && P36 != obj10) {
                vt4Var3 = vt4Var11;
                aw7Var13 = aw7Var33;
            } else {
                vt4Var3 = vt4Var11;
                aw7Var13 = aw7Var33;
                P36 = new hm(i12, dt8Var, aw7Var13, 7);
                rv4Var.o0(P36);
            }
            vt4 vt4Var14 = (vt4) P36;
            if (i27 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object P37 = rv4Var.P();
            if (!z13 && P37 != obj10) {
                vt4Var4 = vt4Var14;
            } else {
                vt4Var4 = vt4Var14;
                P37 = new mm7(14, dt8Var, aw7Var13);
                rv4Var.o0(P37);
            }
            vt4 vt4Var15 = (vt4) P37;
            if (i27 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean d8 = z14 | rv4Var.d(i12);
            Object P38 = rv4Var.P();
            if (!d8 && P38 != obj10) {
                i13 = i27;
            } else {
                i13 = i27;
                P38 = new al(dt8Var, i12, 5);
                rv4Var.o0(P38);
            }
            xt4 xt4Var3 = (xt4) P38;
            if (i26 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean f16 = z15 | rv4Var.f(z36);
            Object P39 = rv4Var.P();
            if (!f16 && P39 != obj10) {
                vt4Var5 = vt4Var15;
                xt4Var = xt4Var3;
                ss8Var2 = ss8Var;
            } else {
                vt4Var5 = vt4Var15;
                xt4Var = xt4Var3;
                ss8Var2 = ss8Var;
                P39 = new vt4() { // from class: vs8
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i31;
                        int i32 = r3;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var37 = z36;
                        ss8 ss8Var4 = ss8Var2;
                        switch (i32) {
                            case 0:
                                int i33 = ((dm5) aw7Var37.getValue()).e;
                                if (i33 != 0) {
                                    i31 = 3;
                                    if (i33 != 1) {
                                        if (i33 != 3) {
                                            i31 = 0;
                                        } else {
                                            i31 = 4;
                                        }
                                    }
                                } else {
                                    i31 = 1;
                                }
                                hk1 a3 = jdd.a(ss8Var4);
                                sw2 sw2Var = ab3.a;
                                ss8Var4.f(a3, ru2.c, new is8(i31, 1, null, ss8Var4));
                                return pvcVar;
                            case 1:
                                aw7Var37.setValue(Boolean.FALSE);
                                hk1 a4 = jdd.a(ss8Var4);
                                sw2 sw2Var2 = ab3.a;
                                ss8Var4.f(a4, ru2.c, new ms8(1, null, ss8Var4));
                                return pvcVar;
                            default:
                                aw7Var37.setValue(Boolean.FALSE);
                                ss8Var4.l();
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P39);
            }
            vt4 vt4Var16 = (vt4) P39;
            boolean f17 = rv4Var.f(aw7Var17) | rv4Var.f(aw7Var30);
            Object P40 = rv4Var.P();
            if (!f17 && P40 != obj10) {
                vt4Var6 = vt4Var16;
            } else {
                vt4Var6 = vt4Var16;
                P40 = new he1(aw7Var17, aw7Var30, 22);
                rv4Var.o0(P40);
            }
            vt4 vt4Var17 = (vt4) P40;
            boolean f18 = rv4Var.f(aw7Var30);
            if (i26 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z50 = f18 | z16;
            Object P41 = rv4Var.P();
            if (!z50 && P41 != obj10) {
                aw7Var14 = z36;
            } else {
                aw7Var14 = z36;
                P41 = new vt4() { // from class: vs8
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i31;
                        int i32 = r3;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var37 = aw7Var30;
                        ss8 ss8Var4 = ss8Var2;
                        switch (i32) {
                            case 0:
                                int i33 = ((dm5) aw7Var37.getValue()).e;
                                if (i33 != 0) {
                                    i31 = 3;
                                    if (i33 != 1) {
                                        if (i33 != 3) {
                                            i31 = 0;
                                        } else {
                                            i31 = 4;
                                        }
                                    }
                                } else {
                                    i31 = 1;
                                }
                                hk1 a3 = jdd.a(ss8Var4);
                                sw2 sw2Var = ab3.a;
                                ss8Var4.f(a3, ru2.c, new is8(i31, 1, null, ss8Var4));
                                return pvcVar;
                            case 1:
                                aw7Var37.setValue(Boolean.FALSE);
                                hk1 a4 = jdd.a(ss8Var4);
                                sw2 sw2Var2 = ab3.a;
                                ss8Var4.f(a4, ru2.c, new ms8(1, null, ss8Var4));
                                return pvcVar;
                            default:
                                aw7Var37.setValue(Boolean.FALSE);
                                ss8Var4.l();
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P41);
            }
            aw7 aw7Var37 = aw7Var13;
            nk0 nk0Var5 = nk0Var2;
            kq7 kq7Var3 = kq7Var;
            int i31 = i12;
            Object obj13 = obj7;
            int i32 = i13;
            h9a.a(805306374, vt4Var, vt4Var2, vt4Var10, vt4Var3, vt4Var12, vt4Var13, vt4Var4, vt4Var5, vt4Var6, vt4Var17, (vt4) P41, xt4Var, rv4Var, rl5Var, am5Var, dm5Var, xp5Var, booleanValue);
            boolean booleanValue2 = ((Boolean) aw7Var17.getValue()).booleanValue();
            dm5 dm5Var2 = (dm5) aw7Var14.getValue();
            boolean f19 = rv4Var.f(aw7Var17);
            Object P42 = rv4Var.P();
            if (f19 || P42 == obj10) {
                P42 = new qo7(aw7Var17, 7);
                rv4Var.o0(P42);
            }
            oc2.k(booleanValue2, dm5Var2, ss8Var, (xt4) P42, rv4Var, (i29 << 6) & 896);
            boolean booleanValue3 = ((Boolean) aw7Var18.getValue()).booleanValue();
            String str = ((rl5) z37.getValue()).a;
            String str2 = ((rl5) z37.getValue()).b;
            int d9 = d(aw7Var37);
            List list = ((kq5) z40.getValue()).b;
            rj9 rj9Var = ss8Var.L;
            boolean f20 = rv4Var.f(aw7Var18);
            Object P43 = rv4Var.P();
            if (f20 || P43 == obj10) {
                P43 = new qo7(aw7Var18, 8);
                rv4Var.o0(P43);
            }
            xt4 xt4Var4 = (xt4) P43;
            boolean f21 = rv4Var.f(aw7Var18);
            if (i32 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z51 = f21 | z17;
            Object P44 = rv4Var.P();
            if (z51 || P44 == obj10) {
                P44 = new fl7(21, dt8Var, aw7Var18);
                rv4Var.o0(P44);
            }
            dt8Var2 = dt8Var;
            jsc.f(booleanValue3, str, str2, i31, d9, list, rj9Var, xt4Var4, (xt4) P44, rv4Var, 0);
            boolean booleanValue4 = ((Boolean) aw7Var36.getValue()).booleanValue();
            int intValue = ((Number) aw7Var37.getValue()).intValue() + 1;
            boolean f22 = rv4Var.f(aw7Var36);
            Object P45 = rv4Var.P();
            if (f22 || P45 == obj10) {
                P45 = new qo7(aw7Var36, 9);
                rv4Var.o0(P45);
            }
            xt4 xt4Var5 = (xt4) P45;
            boolean f23 = rv4Var.f(aw7Var36);
            if (i32 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean d10 = f23 | z18 | rv4Var.d(i31);
            Object P46 = rv4Var.P();
            if (!d10 && P46 != obj10) {
                i14 = 4;
            } else {
                i14 = 4;
                P46 = new in2(dt8Var2, i31, aw7Var36, 4);
                rv4Var.o0(P46);
            }
            bce.d(booleanValue4, intValue, i31, xt4Var5, (xt4) P46, rv4Var, 0);
            Object obj14 = (pj1) rv4Var.j(dy1.f);
            Object P47 = rv4Var.P();
            if (P47 == obj10) {
                P47 = yte.s(rv4Var);
                rv4Var.o0(P47);
            }
            Object obj15 = (m82) P47;
            aw7 z52 = jsc.z(ss8Var.V, rv4Var);
            Integer valueOf6 = Integer.valueOf(sk8Var3.c());
            Integer valueOf7 = Integer.valueOf(sk8Var3.e());
            Integer valueOf8 = Integer.valueOf(sk8Var3.a());
            boolean f24 = rv4Var.f(sk8Var3);
            if (i26 == i14) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z53 = f24 | z19;
            Object P48 = rv4Var.P();
            if (z53 || P48 == obj10) {
                P48 = new iz7(sk8Var3, ss8Var, null, 1);
                rv4Var.o0(P48);
            }
            yte.i(valueOf6, valueOf7, valueOf8, (lu4) P48, rv4Var);
            if (sk8Var3.f() && ((br8) ((hm8) sk8Var3.e).getValue()) == br8.c && !((Boolean) aw7Var27.getValue()).booleanValue()) {
                z20 = true;
            } else {
                z20 = false;
            }
            List list2 = (List) z52.getValue();
            ze4 ze4Var = pna.c;
            boolean f25 = rv4Var.f(sk8Var3) | rv4Var.h(obj15) | rv4Var.h(obj14);
            if (i26 == i14) {
                z21 = true;
            } else {
                z21 = false;
            }
            Object obj16 = obj;
            boolean f26 = f25 | z21 | rv4Var.f(obj13) | rv4Var.f(aw7Var35) | rv4Var.f(aw7Var22) | rv4Var.f(obj16) | rv4Var.f(ar8Var4);
            Object P49 = rv4Var.P();
            if (!f26 && P49 != obj10) {
                aw7Var15 = aw7Var35;
                obj9 = obj16;
                obj8 = obj13;
                ss8Var3 = ss8Var;
                i15 = i26;
            } else {
                i15 = i26;
                Object ws8Var = new ws8(sk8Var3, obj15, ss8Var, ar8Var4, obj14, obj13, aw7Var35, aw7Var22, obj16, 0);
                ss8Var3 = ss8Var;
                obj8 = obj13;
                aw7Var15 = aw7Var35;
                obj9 = obj16;
                rv4Var.o0(ws8Var);
                P49 = ws8Var;
            }
            xt4 xt4Var6 = (xt4) P49;
            Object P50 = rv4Var.P();
            if (P50 == obj10) {
                P50 = new rg8(13);
                rv4Var.o0(P50);
            }
            final aw7 aw7Var38 = obj8;
            final aw7 aw7Var39 = aw7Var15;
            aw7 aw7Var40 = obj9;
            ape.i(z20, yp8Var, list2, ze4Var, false, null, xt4Var6, (xt4) P50, rv4Var, 12585984);
            aw7 z54 = jsc.z(ss8Var3.a0, rv4Var);
            boolean booleanValue5 = ((Boolean) aw7Var22.getValue()).booleanValue();
            q3c q3cVar = (q3c) z54.getValue();
            boolean f27 = rv4Var.f(aw7Var22);
            Object P51 = rv4Var.P();
            if (f27 || P51 == obj10) {
                P51 = new qo7(aw7Var22, 10);
                rv4Var.o0(P51);
            }
            xt4 xt4Var7 = (xt4) P51;
            if (i15 == i14) {
                z22 = true;
            } else {
                z22 = false;
            }
            Object P52 = rv4Var.P();
            if (z22 || P52 == obj10) {
                P52 = new tj7(ss8Var3, 11);
                rv4Var.o0(P52);
            }
            xt4 xt4Var8 = (xt4) P52;
            if (i15 == i14) {
                z23 = true;
            } else {
                z23 = false;
            }
            Object P53 = rv4Var.P();
            if (z23 || P53 == obj10) {
                P53 = new el7(ss8Var3, 6);
                rv4Var.o0(P53);
            }
            ipe.h(booleanValue5, q3cVar, xt4Var7, xt4Var8, (lu4) P53, rv4Var, 0);
            aw7 z55 = jsc.z(ss8Var3.b0, rv4Var);
            boolean booleanValue6 = ((Boolean) aw7Var40.getValue()).booleanValue();
            tvb tvbVar = (tvb) z55.getValue();
            boolean f28 = rv4Var.f(aw7Var40);
            Object P54 = rv4Var.P();
            if (f28 || P54 == obj10) {
                P54 = new qo7(aw7Var40, 11);
                rv4Var.o0(P54);
            }
            xt4 xt4Var9 = (xt4) P54;
            boolean f29 = rv4Var.f(aw7Var40);
            if (i30 == 256) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z56 = f29 | z24;
            Object P55 = rv4Var.P();
            if (z56 || P55 == obj10) {
                P55 = new rp0(cz7Var, aw7Var40, 21);
                rv4Var.o0(P55);
            }
            dce.d(booleanValue6, tvbVar, xt4Var9, (vt4) P55, rv4Var, 0);
            boolean booleanValue7 = ((Boolean) aw7Var38.getValue()).booleanValue();
            vxb vxbVar = (vxb) z42.getValue();
            boolean f30 = rv4Var.f(aw7Var38) | rv4Var.f(aw7Var39);
            if (i15 == i14) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z57 = f30 | z25;
            Object P56 = rv4Var.P();
            if (!z57 && P56 != obj10) {
                z26 = false;
            } else {
                z26 = false;
                P56 = new xt4() { // from class: xs8
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj17) {
                        int i33;
                        Object value;
                        int i34 = r4;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var41 = aw7Var39;
                        aw7 aw7Var42 = aw7Var38;
                        ss8 ss8Var4 = ss8Var3;
                        switch (i34) {
                            case 0:
                                Boolean bool3 = (Boolean) obj17;
                                boolean booleanValue8 = bool3.booleanValue();
                                aw7Var42.setValue(bool3);
                                if (!booleanValue8 && !((Boolean) aw7Var41.getValue()).booleanValue()) {
                                    ss8Var4.l();
                                }
                                return pvcVar;
                            default:
                                rxb rxbVar = (rxb) obj17;
                                rxbVar.getClass();
                                aw7Var42.setValue(Boolean.TRUE);
                                aw7Var41.setValue(Boolean.FALSE);
                                cza czaVar2 = ss8Var4.X;
                                Iterator it = ((vxb) czaVar2.getValue()).f.iterator();
                                int i35 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        ArrayList arrayList = ((rb1) it.next()).c;
                                        int size = arrayList.size();
                                        int i36 = 0;
                                        while (i36 < size) {
                                            Object obj18 = arrayList.get(i36);
                                            i36++;
                                            if (c16.i((rxb) obj18, rxbVar)) {
                                                i33 = i35;
                                            } else {
                                                i35++;
                                            }
                                        }
                                    } else {
                                        i33 = 0;
                                    }
                                }
                                if (czaVar2 != null) {
                                    do {
                                        value = czaVar2.getValue();
                                    } while (!czaVar2.l(value, vxb.a((vxb) value, false, 0, null, i33, 0, null, 55)));
                                    ss8Var4.o(rxbVar);
                                    return pvcVar;
                                }
                                ss8Var4.o(rxbVar);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P56);
            }
            xt4 xt4Var10 = (xt4) P56;
            if (i15 == i14) {
                z27 = true;
            } else {
                z27 = z26;
            }
            Object P57 = rv4Var.P();
            if (z27 || P57 == obj10) {
                P57 = new tj7(ss8Var3, 12);
                rv4Var.o0(P57);
            }
            xt4 xt4Var11 = (xt4) P57;
            boolean f31 = rv4Var.f(aw7Var39) | rv4Var.f(aw7Var38);
            if (i15 == i14) {
                z28 = true;
            } else {
                z28 = z26;
            }
            boolean z58 = f31 | z28;
            Object P58 = rv4Var.P();
            if (!z58 && P58 != obj10) {
                z29 = true;
            } else {
                z29 = true;
                P58 = new xt4() { // from class: xs8
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj17) {
                        int i33;
                        Object value;
                        int i34 = r4;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var41 = aw7Var38;
                        aw7 aw7Var42 = aw7Var39;
                        ss8 ss8Var4 = ss8Var3;
                        switch (i34) {
                            case 0:
                                Boolean bool3 = (Boolean) obj17;
                                boolean booleanValue8 = bool3.booleanValue();
                                aw7Var42.setValue(bool3);
                                if (!booleanValue8 && !((Boolean) aw7Var41.getValue()).booleanValue()) {
                                    ss8Var4.l();
                                }
                                return pvcVar;
                            default:
                                rxb rxbVar = (rxb) obj17;
                                rxbVar.getClass();
                                aw7Var42.setValue(Boolean.TRUE);
                                aw7Var41.setValue(Boolean.FALSE);
                                cza czaVar2 = ss8Var4.X;
                                Iterator it = ((vxb) czaVar2.getValue()).f.iterator();
                                int i35 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        ArrayList arrayList = ((rb1) it.next()).c;
                                        int size = arrayList.size();
                                        int i36 = 0;
                                        while (i36 < size) {
                                            Object obj18 = arrayList.get(i36);
                                            i36++;
                                            if (c16.i((rxb) obj18, rxbVar)) {
                                                i33 = i35;
                                            } else {
                                                i35++;
                                            }
                                        }
                                    } else {
                                        i33 = 0;
                                    }
                                }
                                if (czaVar2 != null) {
                                    do {
                                        value = czaVar2.getValue();
                                    } while (!czaVar2.l(value, vxb.a((vxb) value, false, 0, null, i33, 0, null, 55)));
                                    ss8Var4.o(rxbVar);
                                    return pvcVar;
                                }
                                ss8Var4.o(rxbVar);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P58);
            }
            boolean z59 = z29;
            voe.b(booleanValue7, vxbVar, xt4Var10, xt4Var11, (xt4) P58, rv4Var, 0);
            if (((Boolean) aw7Var39.getValue()).booleanValue() && ((vxb) z42.getValue()).e > 0) {
                z30 = z59;
            } else {
                z30 = false;
            }
            String str3 = ((vxb) z42.getValue()).c;
            int i33 = ((vxb) z42.getValue()).d;
            int i34 = ((vxb) z42.getValue()).e;
            nq7 y2 = zbe.y(nc2.o(pu0Var.a(kq7Var3, nk0Var5)), 12.0f);
            if (i15 == i14) {
                z31 = true;
            } else {
                z31 = false;
            }
            Object P59 = rv4Var.P();
            if (!z31 && P59 != obj10) {
                z32 = true;
            } else {
                z32 = true;
                P59 = new fs8(ss8Var3, 1);
                rv4Var.o0(P59);
            }
            vt4 vt4Var18 = (vt4) P59;
            if (i15 == i14) {
                z33 = z32;
            } else {
                z33 = false;
            }
            Object P60 = rv4Var.P();
            if (z33 || P60 == obj10) {
                P60 = new fs8(ss8Var3, 2);
                rv4Var.o0(P60);
            }
            vt4 vt4Var19 = (vt4) P60;
            boolean f32 = rv4Var.f(aw7Var38);
            Object P61 = rv4Var.P();
            if (!f32 && P61 != obj10) {
                z34 = z30;
            } else {
                z34 = z30;
                P61 = new ao7(aw7Var38, 12);
                rv4Var.o0(P61);
            }
            vt4 vt4Var20 = (vt4) P61;
            boolean f33 = rv4Var.f(aw7Var39);
            if (i15 == 4) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean z60 = f33 | z35;
            Object P62 = rv4Var.P();
            if (z60 || P62 == obj10) {
                P62 = new vt4() { // from class: vs8
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i312;
                        int i322 = r3;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var372 = aw7Var39;
                        ss8 ss8Var4 = ss8Var3;
                        switch (i322) {
                            case 0:
                                int i332 = ((dm5) aw7Var372.getValue()).e;
                                if (i332 != 0) {
                                    i312 = 3;
                                    if (i332 != 1) {
                                        if (i332 != 3) {
                                            i312 = 0;
                                        } else {
                                            i312 = 4;
                                        }
                                    }
                                } else {
                                    i312 = 1;
                                }
                                hk1 a3 = jdd.a(ss8Var4);
                                sw2 sw2Var = ab3.a;
                                ss8Var4.f(a3, ru2.c, new is8(i312, 1, null, ss8Var4));
                                return pvcVar;
                            case 1:
                                aw7Var372.setValue(Boolean.FALSE);
                                hk1 a4 = jdd.a(ss8Var4);
                                sw2 sw2Var2 = ab3.a;
                                ss8Var4.f(a4, ru2.c, new ms8(1, null, ss8Var4));
                                return pvcVar;
                            default:
                                aw7Var372.setValue(Boolean.FALSE);
                                ss8Var4.l();
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P62);
            }
            q0f.h(z34, str3, i33, i34, y2, vt4Var18, vt4Var19, vt4Var20, (vt4) P62, rv4Var, 0);
            rv4Var.s();
        } else {
            dt8Var2 = dt8Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.e(new rj7(ss8Var, dt8Var2, cz7Var, nq7Var, i, 3));
        }
    }

    public static final int d(aw7 aw7Var) {
        return ((Number) aw7Var.getValue()).intValue();
    }

    public static final void e(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-1666989475);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z2 = true;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new v85(str, 12);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(ss8.class);
                ss8 ss8Var = (ss8) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(ss8Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new tj7(ss8Var, 10);
                    rv4Var.o0(P2);
                }
                tte.d(ss8Var, null, (xt4) P2, rv4Var, 0);
                aw7 z3 = jsc.z(ss8Var.P, rv4Var);
                aw7 z4 = jsc.z(ss8Var.Q, rv4Var);
                dxe.l(((dm5) z4.getValue()).e, ((dm5) z4.getValue()).q, ((dm5) z4.getValue()).i, ((dm5) z4.getValue()).j, rv4Var, 0);
                rv4Var2 = rv4Var;
                cs8.a((dm5) z4.getValue(), jce.E(122658338, new bn7(nq7Var, cz7Var2, str, z4, ss8Var, z3, 1), rv4Var2), rv4Var2, 48);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j31(str, cz7Var, nq7Var, i, 8);
        }
    }
}
