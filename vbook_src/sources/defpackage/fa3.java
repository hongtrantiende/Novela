package defpackage;

import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fa3  reason: default package */
/* loaded from: classes3.dex */
public abstract class fa3 {
    public static final jva a;
    public static final iva b;
    public static final List c;

    static {
        jva jvaVar = new jva(4294961979L);
        a = jvaVar;
        iva ivaVar = new iva(4278190080L);
        b = ivaVar;
        c = tl1.B(hva.a, ova.a, rva.a, qva.a, lva.a, jvaVar, ivaVar);
    }

    public static final void a(final long j, final long j2, final boolean z, final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long j3;
        long j4;
        rv4Var.g0(-1881905617);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.e(j2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.g(z)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            nq7 n = pna.n(kq7.a, 32.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new pp1(22, vt4Var);
                rv4Var.o0(P);
            }
            nq7 y = zbe.y(lbe.f(14, (vt4) P, k, null, z), 6.0f);
            if (j == 16) {
                rv4Var.e0(-1641714296);
                j3 = ((h27) rv4Var.j(j27.a)).a.q;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1641634750);
                rv4Var.q(false);
                j3 = j;
            }
            nq7 d = st0.d(y, 2.0f, j3, su9Var);
            if (j2 == 16) {
                rv4Var.e0(-1641449494);
                j4 = ((h27) rv4Var.j(j27.a)).a.p;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1641371684);
                rv4Var.q(false);
                j4 = j2;
            }
            fu0.a(nmd.v(d, j4, su9Var), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(j, j2, z, vt4Var, i) { // from class: ca3
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ vt4 d;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(3073);
                    fa3.a(this.a, this.b, this.c, this.d, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(yya yyaVar, yt2 yt2Var, uo3 uo3Var, boolean z, vt4 vt4Var, vt4 vt4Var2, nq7 nq7Var, rv4 rv4Var, int i) {
        yya yyaVar2;
        int i2;
        boolean z2;
        kq7 kq7Var;
        wk3 wk3Var;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        aw7 aw7Var;
        boolean z14;
        boolean z15;
        boolean z16;
        aw7 aw7Var2;
        boolean z17;
        boolean z18;
        boolean z19;
        xl0 c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        yyaVar.getClass();
        yt2Var.getClass();
        uo3Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var.g0(-1012252772);
        if ((i & 6) == 0) {
            yyaVar2 = yyaVar;
            if (rv4Var.f(yyaVar2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            yyaVar2 = yyaVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(yt2Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(uo3Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.g(z)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i2 |= i4;
        }
        int i10 = i2 | 1572864;
        if ((i10 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            ar4 ar4Var = (ar4) yyaVar2.getValue();
            Object obj = (ym0) rv4Var.j(ft6.a);
            String str = ar4Var.c;
            hn0 hn0Var = null;
            if (str != null && (c2 = uo3Var.e().c(str)) != null) {
                hn0Var = c2.b;
            }
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (P == obj2) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var3 = (aw7) P;
            Object P2 = rv4Var.P();
            if (P2 == obj2) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var.o0(P2);
            }
            aw7 aw7Var4 = (aw7) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj2) {
                P3 = yae.z(new zl1(zl1.i));
                rv4Var.o0(P3);
            }
            aw7 aw7Var5 = (aw7) P3;
            Object P4 = rv4Var.P();
            if (P4 == obj2) {
                P4 = yae.z(new zl1(zl1.i));
                rv4Var.o0(P4);
            }
            aw7 aw7Var6 = (aw7) P4;
            kq7 kq7Var2 = kq7.a;
            nq7 f = pna.f(kq7Var2, 1.0f);
            f99 f99Var = j27.a;
            nq7 z20 = zbe.z(rte.q(nmd.v(tte.k(f, ((h27) rv4Var.j(f99Var)).c.d), rm1.g(((h27) rv4Var.j(f99Var)).a, 4.0f), lre.g), rte.u(rv4Var), 14), 8.0f, 6.0f);
            gv9 a2 = ev9.a(new hz(4.0f, true, new vs(2)), kh5.G, rv4Var, 54);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z20);
            rw1.k.getClass();
            vt4 vt4Var3 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            int i11 = i10 >> 6;
            h(rp5.c((wk3) ok3.o.getValue(), rv4Var, 0), false, false, vt4Var2, rv4Var, i11 & 7168, 6);
            if (z) {
                wk3Var = (wk3) ok3.y.getValue();
            } else {
                wk3Var = (wk3) ok3.o0.getValue();
            }
            h(rp5.c(wk3Var, rv4Var, 0), z, false, vt4Var, rv4Var, (i11 & Token.ASSIGN_MOD) | ((i10 >> 3) & 7168), 4);
            if (ar4Var.b && ar4Var.c != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = rv4Var.f(obj) | rv4Var.f(ar4Var);
            Object P5 = rv4Var.P();
            if (f2 || P5 == obj2) {
                P5 = new u93(1, obj, ar4Var);
                rv4Var.o0(P5);
            }
            f(z3, (vt4) P5, rv4Var, 0);
            i(0, rv4Var);
            ar5 c3 = rp5.c((wk3) jk3.h0.getValue(), rv4Var, 0);
            a6b a3 = ar4Var.a(hva.a);
            a6b a6bVar = a6b.a;
            if (a3 == a6bVar) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z21 = ar4Var.b;
            int i12 = i10 & Token.ASSIGN_MOD;
            if (i12 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P6 = rv4Var.P();
            if (!z5 && P6 != obj2) {
                i3 = 0;
            } else {
                i3 = 0;
                P6 = new w93(yt2Var, 0);
                rv4Var.o0(P6);
            }
            h(c3, z4, z21, (vt4) P6, rv4Var, 0, 0);
            ar5 c4 = rp5.c((wk3) jk3.m0.getValue(), rv4Var, i3);
            if (ar4Var.a(ova.a) == a6bVar) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z22 = ar4Var.b;
            if (i12 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object P7 = rv4Var.P();
            if (z7 || P7 == obj2) {
                P7 = new w93(yt2Var, 1);
                rv4Var.o0(P7);
            }
            h(c4, z6, z22, (vt4) P7, rv4Var, 0, 0);
            ar5 c5 = rp5.c((wk3) jk3.p0.getValue(), rv4Var, 0);
            if (ar4Var.a(rva.a) == a6bVar) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z23 = ar4Var.b;
            if (i12 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object P8 = rv4Var.P();
            if (z9 || P8 == obj2) {
                P8 = new w93(yt2Var, 2);
                rv4Var.o0(P8);
            }
            h(c5, z8, z23, (vt4) P8, rv4Var, 0, 0);
            ar5 c6 = rp5.c((wk3) rk3.b.getValue(), rv4Var, 0);
            if (ar4Var.a(qva.a) == a6bVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z24 = ar4Var.b;
            if (i12 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object P9 = rv4Var.P();
            if (z11 || P9 == obj2) {
                P9 = new w93(yt2Var, 3);
                rv4Var.o0(P9);
            }
            h(c6, z10, z24, (vt4) P9, rv4Var, 0, 0);
            i(0, rv4Var);
            ar5 c7 = rp5.c((wk3) jk3.z.getValue(), rv4Var, 0);
            if (ar4Var.a(lva.a) == a6bVar) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z25 = ar4Var.b;
            if (i12 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object P10 = rv4Var.P();
            if (z13 || P10 == obj2) {
                P10 = new w93(yt2Var, 4);
                rv4Var.o0(P10);
            }
            h(c7, z12, z25, (vt4) P10, rv4Var, 0, 0);
            i(0, rv4Var);
            int i13 = (57344 & (i10 << 6)) | 48;
            hn0 hn0Var2 = hn0Var;
            e(rp5.c((wk3) jk3.j0.getValue(), rv4Var, 0), 1, hn0Var2, ar4Var.c, uo3Var, rv4Var, i13);
            e(rp5.c((wk3) jk3.k0.getValue(), rv4Var, 0), 2, hn0Var2, ar4Var.c, uo3Var, rv4Var, i13);
            e(rp5.c((wk3) jk3.l0.getValue(), rv4Var, 0), 3, hn0Var2, ar4Var.c, uo3Var, rv4Var, i13);
            i(0, rv4Var);
            long j = ((zl1) aw7Var5.getValue()).a;
            boolean z26 = ar4Var.b;
            Object P11 = rv4Var.P();
            if (P11 == obj2) {
                aw7Var = aw7Var3;
                P11 = new ae1(aw7Var, 28);
                rv4Var.o0(P11);
            } else {
                aw7Var = aw7Var3;
            }
            g(384, j, (vt4) P11, rv4Var, z26);
            long j2 = ((zl1) aw7Var5.getValue()).a;
            long j3 = ((zl1) aw7Var6.getValue()).a;
            boolean z27 = ar4Var.b;
            Object P12 = rv4Var.P();
            if (P12 == obj2) {
                P12 = new ae1(aw7Var4, 29);
                rv4Var.o0(P12);
            }
            a(j2, j3, z27, (vt4) P12, rv4Var, 3072);
            i(0, rv4Var);
            ar5 c8 = rp5.c((wk3) jk3.i0.getValue(), rv4Var, 0);
            boolean z28 = ar4Var.b;
            if (i12 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            Object P13 = rv4Var.P();
            if (z14 || P13 == obj2) {
                P13 = new y93(yt2Var, aw7Var5, aw7Var6, 0);
                rv4Var.o0(P13);
            }
            h(c8, false, z28, (vt4) P13, rv4Var, 0, 2);
            rv4Var.q(true);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            boolean e = rv4Var.e(((zl1) aw7Var5.getValue()).a);
            Object P14 = rv4Var.P();
            if (e || P14 == obj2) {
                P14 = kve.A(((zl1) aw7Var5.getValue()).a, true, false);
                rv4Var.o0(P14);
            }
            String str2 = (String) P14;
            Object P15 = rv4Var.P();
            if (P15 == obj2) {
                P15 = new as1(aw7Var, 20);
                rv4Var.o0(P15);
            }
            xt4 xt4Var = (xt4) P15;
            int i14 = i10 & 14;
            if (i14 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i12 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z29 = z15 | z16;
            Object P16 = rv4Var.P();
            if (!z29 && P16 != obj2) {
                aw7Var2 = aw7Var6;
            } else {
                aw7Var2 = aw7Var6;
                Object v93Var = new v93(yyaVar, yt2Var, aw7Var, aw7Var5, 0);
                rv4Var.o0(v93Var);
                P16 = v93Var;
            }
            tc4.h(384, xt4Var, (xt4) P16, rv4Var, str2, booleanValue);
            boolean booleanValue2 = ((Boolean) aw7Var4.getValue()).booleanValue();
            boolean e2 = rv4Var.e(((zl1) aw7Var2.getValue()).a);
            Object P17 = rv4Var.P();
            if (!e2 && P17 != obj2) {
                z17 = true;
                z18 = false;
            } else {
                z17 = true;
                z18 = false;
                P17 = kve.A(((zl1) aw7Var2.getValue()).a, true, false);
                rv4Var.o0(P17);
            }
            String str3 = (String) P17;
            Object P18 = rv4Var.P();
            if (P18 == obj2) {
                P18 = new as1(aw7Var4, 19);
                rv4Var.o0(P18);
            }
            xt4 xt4Var2 = (xt4) P18;
            if (i14 == 4) {
                z19 = z17;
            } else {
                z19 = z18;
            }
            if (i12 != 32) {
                z17 = z18;
            }
            boolean z30 = z19 | z17;
            Object P19 = rv4Var.P();
            if (z30 || P19 == obj2) {
                Object v93Var2 = new v93(yyaVar, yt2Var, aw7Var4, aw7Var2, 1);
                rv4Var.o0(v93Var2);
                P19 = v93Var2;
            }
            tc4.h(384, xt4Var2, (xt4) P19, rv4Var, str3, booleanValue2);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(yyaVar, yt2Var, uo3Var, z, vt4Var, vt4Var2, kq7Var, i);
        }
    }

    public static final void c(final int i, final cz7 cz7Var, nq7 nq7Var, final Integer num, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        final kq7 kq7Var;
        Object obj;
        boolean z2;
        boolean z3;
        pb2 pb2Var;
        int i6;
        int i7;
        List list;
        ym0 ym0Var;
        wm0 wm0Var;
        boolean z4;
        boolean z5;
        boolean z6;
        y3b y3bVar;
        cz7Var.getClass();
        rv4Var.g0(373959541);
        if (rv4Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(cz7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4 | 384;
        if (rv4Var.f(num)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            if (num == null) {
                obj = "new";
            } else {
                obj = num;
            }
            String str = "create_topic_" + obj + "_" + i;
            if ((i10 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i11 = i10 & 7168;
            if (i11 == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z2 | z3;
            Object P = rv4Var.P();
            Object obj2 = ax1.a;
            if (z7 || P == obj2) {
                P = new t93(i, num, 0);
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
                gi1 a4 = cm9.a(bic.class);
                bic bicVar = (bic) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                aw7 z8 = jsc.z(bicVar.f, rv4Var);
                if (num != null) {
                    rv4Var.e0(-515876662);
                    rv4Var.q(false);
                    list = ((aic) z8.getValue()).e;
                    i6 = 4;
                    i7 = 2;
                } else {
                    rv4Var.e0(-515835122);
                    Object P2 = rv4Var.P();
                    if (P2 == obj2) {
                        i6 = 4;
                        i7 = 2;
                        P2 = tl1.A(new xl0(hre.q().toString(), en0.a, new cm0("", ks3.a)));
                        rv4Var.o0(P2);
                    } else {
                        i6 = 4;
                        i7 = 2;
                    }
                    list = (List) P2;
                    rv4Var.q(false);
                }
                final kq7 kq7Var2 = kq7.a;
                if (list == null) {
                    rv4Var.e0(-515729412);
                    fxe.h(yqe.A((y3b) o2b.s.getValue(), rv4Var), pna.c, false, jce.E(1664701566, new p7(cz7Var, 18), rv4Var), null, null, fre.a, rv4Var, 1575936, 52);
                    rv4Var.q(false);
                    ek9 u = rv4Var.u();
                    if (u != null) {
                        u.d = new lu4(i, cz7Var, kq7Var2, num, i2, 0) { // from class: x93
                            public final /* synthetic */ int a;
                            public final /* synthetic */ int b;
                            public final /* synthetic */ cz7 c;
                            public final /* synthetic */ nq7 d;
                            public final /* synthetic */ Integer e;

                            {
                                this.a = r6;
                            }

                            @Override // defpackage.lu4
                            public final Object invoke(Object obj3, Object obj4) {
                                int i12 = this.a;
                                pvc pvcVar = pvc.a;
                                switch (i12) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int p = xoe.p(1);
                                        fa3.c(this.b, this.c, this.d, this.e, (rv4) obj3, p);
                                        return pvcVar;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int p2 = xoe.p(1);
                                        fa3.c(this.b, this.c, this.d, this.e, (rv4) obj3, p2);
                                        return pvcVar;
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                rv4Var.e0(-515221043);
                rv4Var.q(false);
                uo3 o = uwe.o(list, rv4Var);
                Object P3 = rv4Var.P();
                if (P3 == obj2) {
                    P3 = new ym0();
                    rv4Var.o0(P3);
                }
                ym0 ym0Var2 = (ym0) P3;
                Object P4 = rv4Var.P();
                if (P4 == obj2) {
                    P4 = new wm0();
                    rv4Var.o0(P4);
                }
                wm0 wm0Var2 = (wm0) P4;
                boolean f = rv4Var.f(o);
                Object P5 = rv4Var.P();
                if (f || P5 == obj2) {
                    P5 = new zua(new mz1(1, o, uo3.class, "dispatch", "dispatch(Lio/github/linreal/cascade/editor/action/EditorAction;)V", 0, 8), ym0Var2, wm0Var2, o);
                    rv4Var.o0(P5);
                }
                zua zuaVar = (zua) P5;
                Object P6 = rv4Var.P();
                Object obj3 = P6;
                if (P6 == obj2) {
                    rm0 m = qwe.m();
                    dxe.B(m, true, new ln1(7));
                    rv4Var.o0(m);
                    obj3 = m;
                }
                rm0 rm0Var = (rm0) obj3;
                mu4 k = k(rv4Var);
                boolean f2 = rv4Var.f(k);
                Object P7 = rv4Var.P();
                if (f2 || P7 == obj2) {
                    P7 = new q71(k, 31);
                    rv4Var.o0(P7);
                }
                q71 q71Var = (q71) P7;
                Object P8 = rv4Var.P();
                if (P8 == obj2) {
                    P8 = yte.s(rv4Var);
                    rv4Var.o0(P8);
                }
                m82 m82Var = (m82) P8;
                bsa bsaVar = (bsa) rv4Var.j(dy1.q);
                f99 f99Var = dy1.h;
                int X0 = ((r13) rv4Var.j(f99Var)).X0(300.0f);
                boolean f3 = rv4Var.f(m82Var) | rv4Var.f(bsaVar);
                Object P9 = rv4Var.P();
                if (f3 || P9 == obj2) {
                    P9 = new z86(X0, m82Var, bsaVar);
                    rv4Var.o0(P9);
                }
                z86 z86Var = (z86) P9;
                boolean f4 = rv4Var.f(o);
                Object P10 = rv4Var.P();
                if (f4 || P10 == obj2) {
                    P10 = new w71(o, 3);
                    rv4Var.o0(P10);
                }
                kd4 v = w92.v(av8.a, (xt4) P10, rv4Var, 6);
                boolean f5 = rv4Var.f(v) | rv4Var.g(z86Var.e());
                Object P11 = rv4Var.P();
                if (!f5 && P11 != obj2) {
                    ym0Var = ym0Var2;
                    wm0Var = wm0Var2;
                } else {
                    tva[] tvaVarArr = new tva[7];
                    tvaVarArr[0] = hva.a;
                    tvaVarArr[1] = ova.a;
                    tvaVarArr[i7] = rva.a;
                    tvaVarArr[3] = qva.a;
                    tvaVarArr[i6] = lva.a;
                    tvaVarArr[5] = a;
                    tvaVarArr[6] = b;
                    ym0Var = ym0Var2;
                    wm0Var = wm0Var2;
                    P11 = new tfc(tl1.B(tvaVarArr), new tu1(new cq1(o, z86Var, v, 1), true, -2102240062));
                    rv4Var.o0(P11);
                }
                tfc tfcVar = (tfc) P11;
                WeakHashMap weakHashMap = yjd.w;
                rp rpVar = h88.n(rv4Var).c;
                r13 r13Var = (r13) rv4Var.j(f99Var);
                aw7 D = yae.D(Integer.valueOf(rpVar.e().d), rv4Var);
                boolean f6 = rv4Var.f(D) | rv4Var.f(z86Var);
                Object P12 = rv4Var.P();
                if (f6 || P12 == obj2) {
                    P12 = new ue1(D, z86Var, null, i7);
                    rv4Var.o0(P12);
                }
                yte.g((lu4) P12, rv4Var, pvc.a);
                if (!z86Var.d() && !z86Var.e()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean f7 = rv4Var.f(z86Var);
                Object P13 = rv4Var.P();
                if (f7 || P13 == obj2) {
                    P13 = new je1(z86Var, i6);
                    rv4Var.o0(P13);
                }
                sf0.a(z4, (vt4) P13, rv4Var, 0, 0);
                s02 s02Var = bicVar.C;
                if ((i10 & Token.ASSIGN_MOD) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i11 == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z9 = z5 | z6;
                Object P14 = rv4Var.P();
                if (z9 || P14 == obj2) {
                    P14 = new ve1(cz7Var, num, (m42) null, 1);
                    rv4Var.o0(P14);
                }
                jye.b(s02Var, null, (mu4) P14, rv4Var, 0);
                ze4 ze4Var = pna.c;
                if (num != null) {
                    y3bVar = (y3b) o2b.s.getValue();
                } else {
                    y3bVar = (y3b) o2b.u.getValue();
                }
                fxe.h(yqe.A(y3bVar, rv4Var), ze4Var, true, jce.E(-1770709639, new p7(cz7Var, 19), rv4Var), jce.E(476278832, new ld1(11, bicVar, o, z8), rv4Var), null, jce.E(933446474, new da3(bicVar, z8, o, ym0Var, wm0Var, rm0Var, tfcVar, q71Var, z86Var, zuaVar, 0), rv4Var), rv4Var, 1600896, 32);
                kq7Var = kq7Var2;
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new lu4(i, cz7Var, kq7Var, num, i2, 1) { // from class: x93
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ cz7 c;
                public final /* synthetic */ nq7 d;
                public final /* synthetic */ Integer e;

                {
                    this.a = r6;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj32, Object obj4) {
                    int i12 = this.a;
                    pvc pvcVar = pvc.a;
                    switch (i12) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int p = xoe.p(1);
                            fa3.c(this.b, this.c, this.d, this.e, (rv4) obj32, p);
                            return pvcVar;
                        default:
                            ((Integer) obj4).getClass();
                            int p2 = xoe.p(1);
                            fa3.c(this.b, this.c, this.d, this.e, (rv4) obj32, p2);
                            return pvcVar;
                    }
                }
            };
        }
    }

    public static final void d(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        float f;
        rv4Var.g0(-278854611);
        if (rv4Var.f(nq7Var)) {
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
            lk0 lk0Var = kh5.I;
            xn1 a2 = wn1.a(lz.c, lk0Var, rv4Var, 0);
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
            dpe.g(pna.h(pna.f(zbe.z(kq7Var, 24.0f, 14.0f), 0.6f), 24.0f), null, rv4Var, 6, 2);
            vqe.m(nae.e, 6, 2, ((h27) rv4Var.j(j27.a)).a.r, rv4Var, zbe.A(kq7Var, 16.0f, nae.e, 2));
            nq7 z2 = zbe.z(pna.f(kq7Var, 1.0f), 24.0f, 14.0f);
            xn1 a3 = wn1.a(new hz(12.0f, true, new vs(2)), lk0Var, rv4Var, 6);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, z2);
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
            rv4Var.e0(709136171);
            for (int i4 = 0; i4 < 5; i4++) {
                if (i4 == 4) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                dpe.g(pna.h(pna.f(kq7Var, f), 16.0f), null, rv4Var, 0, 2);
            }
            hl5.v(rv4Var, false, true, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 6);
        }
    }

    public static final void e(ar5 ar5Var, final int i, hn0 hn0Var, final String str, final uo3 uo3Var, rv4 rv4Var, int i2) {
        Object obj;
        int i3;
        boolean z;
        final boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        pm0 pm0Var;
        int i5;
        boolean h;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(1046594198);
        if ((i2 & 6) == 0) {
            obj = ar5Var;
            if (rv4Var.f(obj)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            obj = ar5Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.d(i)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                h = rv4Var.f(hn0Var);
            } else {
                h = rv4Var.h(hn0Var);
            }
            if (h) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (str != null) {
                pm0Var = new pm0(str);
            } else {
                pm0Var = null;
            }
            if (rv4Var.f(pm0Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.f(uo3Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        boolean z6 = false;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((hn0Var instanceof cn0) && ((cn0) hn0Var).a == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (str != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean g = z4 | rv4Var.g(z2);
            if ((i3 & Token.ASSIGN_MOD) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = z5 | g;
            if ((57344 & i3) == 16384) {
                z6 = true;
            }
            boolean z8 = z7 | z6;
            Object P = rv4Var.P();
            if (z8 || P == ax1.a) {
                P = new vt4() { // from class: ba3
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        hn0 cn0Var;
                        String str2 = str;
                        pvc pvcVar = pvc.a;
                        if (str2 == null) {
                            return pvcVar;
                        }
                        if (z2) {
                            cn0Var = en0.a;
                        } else {
                            cn0Var = new cn0(i);
                        }
                        uo3Var.d(new v62(str2, cn0Var));
                        return pvcVar;
                    }
                };
                rv4Var.o0(P);
            }
            int i9 = i3 & 14;
            h(obj, z2, z3, (vt4) P, rv4Var, i9, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xj7(ar5Var, i, hn0Var, str, uo3Var, i2);
        }
    }

    public static final void f(boolean z, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        long b2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1306413951);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i6 & 1, z2)) {
            nq7 k = tte.k(pna.n(kq7.a, 32.0f), uu9.a);
            if ((i6 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            if (z3 || P == ax1.a) {
                P = new pp1(23, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 f = lbe.f(14, (vt4) P, k, null, z);
            b37 d = fu0.d(kh5.e, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            if (z) {
                rv4Var2.e0(780141018);
                b2 = ((h27) rv4Var2.j(j27.a)).a.q;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(780214054);
                b2 = zl1.b(0.38f, ((h27) rv4Var2.j(j27.a)).a.q);
                rv4Var2.q(false);
            }
            i4 = 1;
            cvb.c("/", null, b2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.h, rv4Var, 6, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            i4 = 1;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new hd1(z, vt4Var, i, i4);
        }
    }

    public static final void g(int i, long j, vt4 vt4Var, rv4 rv4Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        long b2;
        long j2;
        rv4Var.g0(-797661575);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            kq7 kq7Var = kq7.a;
            nq7 n = pna.n(kq7Var, 32.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, n);
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
            ar5 c2 = rp5.c((wk3) jk3.A.getValue(), rv4Var, 0);
            if (z) {
                rv4Var.e0(-1116976640);
                b2 = ((h27) rv4Var.j(j27.a)).a.q;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1116903604);
                b2 = zl1.b(0.38f, ((h27) rv4Var.j(j27.a)).a.q);
                rv4Var.q(false);
            }
            long j3 = b2;
            nk0 nk0Var = kh5.e;
            pu0 pu0Var = pu0.a;
            nq7 k = tte.k(pna.n(pu0Var.a(kq7Var, nk0Var), 32.0f), uu9.a);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new pp1(21, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(c2, null, zbe.y(lbe.f(14, (vt4) P, k, null, z), 6.0f), j3, rv4Var, 48, 0);
            if (j == 16) {
                rv4Var.e0(-1116477664);
                long j4 = ((h27) rv4Var.j(j27.a)).a.q;
                rv4Var.q(false);
                j2 = j4;
            } else {
                rv4Var.e0(-1116406178);
                rv4Var.q(false);
                j2 = j;
            }
            vqe.m(2.0f, 48, 0, j2, rv4Var, zbe.C(zbe.A(pu0Var.a(kq7Var, kh5.D), 6.0f, nae.e, 2), nae.e, nae.e, nae.e, 4.0f, 7));
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new aa3(j, z, vt4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.ar5 r16, boolean r17, boolean r18, defpackage.vt4 r19, defpackage.rv4 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa3.h(ar5, boolean, boolean, vt4, rv4, int, int):void");
    }

    public static final void i(int i, rv4 rv4Var) {
        boolean z;
        rv4Var.g0(-217480328);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            fu0.a(nmd.v(pna.s(pna.h(kq7.a, 24.0f), 1.0f), ((h27) rv4Var.j(j27.a)).a.B, lre.g), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pg2(i, 7);
        }
    }

    public static final boolean j(uo3 uo3Var, ym0 ym0Var, rv4 rv4Var) {
        String str;
        uo3Var.getClass();
        ym0Var.getClass();
        rv4Var.e0(-711518215);
        List list = uo3Var.e().a;
        boolean z = true;
        if (list.size() != 1) {
            rv4Var.q(false);
            return false;
        }
        xl0 xl0Var = (xl0) sl1.c0(list);
        if (!c16.i(xl0Var.b, en0.a)) {
            rv4Var.q(false);
            return false;
        }
        dub b2 = ym0Var.b(xl0Var.a);
        if (b2 != null) {
            str = b23.s(b2);
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        rv4Var.q(false);
        return z;
    }

    public static final mu4 k(rv4 rv4Var) {
        io5 io5Var = (io5) rv4Var.j(do5.a);
        boolean f = rv4Var.f(io5Var);
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            P = new xq1(io5Var, 1);
            rv4Var.o0(P);
        }
        return (mu4) P;
    }
}
