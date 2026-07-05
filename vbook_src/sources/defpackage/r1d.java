package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r1d  reason: default package */
/* loaded from: classes.dex */
public final class r1d implements z8f {
    public static final tu1 b = new tu1(new xu1(0), false, 704592392);
    public static final s76[] c = new s76[0];
    public final /* synthetic */ int a;

    public /* synthetic */ r1d(int i) {
        this.a = i;
    }

    public static final void a(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(-1447776307);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = true;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a = kv6.a(rv4Var);
            if (a != null) {
                if (a instanceof y35) {
                    pb2Var = ((y35) a).f();
                } else {
                    pb2Var = ob2.b;
                }
                lb2 lb2Var = (lb2) ((fdd) voe.z(cm9.a(lb2.class), a.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(lb2Var.e, rv4Var);
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = yae.z(null);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) P;
                Object[] objArr = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == lh9Var) {
                    P2 = new cd1(25);
                    rv4Var.o0(P2);
                }
                aw7 j = zpe.j(objArr, (vt4) P2, rv4Var, 384);
                Object P3 = rv4Var.P();
                if (P3 == lh9Var) {
                    P3 = new as1(aw7Var, 3);
                    rv4Var.o0(P3);
                }
                kd4 v = w92.v(av8.a, (xt4) P3, rv4Var, 54);
                s02 s02Var = lb2Var.f;
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                Object P4 = rv4Var.P();
                if (z2 || P4 == lh9Var) {
                    P4 = new u7(cz7Var, (m42) null, 3);
                    rv4Var.o0(P4);
                }
                jye.b(s02Var, null, (mu4) P4, rv4Var, 0);
                fxe.h(yqe.A((y3b) k2b.m.getValue(), rv4Var), pna.c, false, jce.E(1464795089, new p7(cz7Var, 14), rv4Var), jce.E(-1009311992, new ld1(8, lb2Var, z3, aw7Var), rv4Var), null, jce.E(-966535902, new jb2(lb2Var, z3, v, j, aw7Var), rv4Var), rv4Var, 1600560, 36);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var, i, 15);
        }
    }

    public static final void b(String str, int i, f76 f76Var, boolean z, String str2, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        xt4 xt4Var3;
        kq7 kq7Var;
        np npVar;
        zx1 zx1Var;
        np npVar2;
        np npVar3;
        int i11;
        kg kgVar;
        ez ezVar;
        lk0 lk0Var;
        rv4 rv4Var2;
        zx1 zx1Var2;
        int i12;
        boolean z3;
        boolean z4;
        Object obj = str2;
        rv4 rv4Var3 = rv4Var;
        rv4Var3.g0(-656949016);
        if (rv4Var3.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (rv4Var3.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (rv4Var3.f(f76Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i15 = i14 | i5;
        if (rv4Var3.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (rv4Var3.f(obj)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i17 = i16 | i7;
        if (rv4Var3.h(xt4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (rv4Var3.h(vt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        if (rv4Var3.h(xt4Var2)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i20 = i19 | i10;
        if ((i20 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var3.U(i20 & 1, z2)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var3).d);
            long g = rm1.g(r0f.y(rv4Var3), 1.0f);
            ba5 ba5Var = lre.g;
            nq7 z5 = zbe.z(nmd.v(k, g, ba5Var), 12.0f, 12.0f);
            lk0 lk0Var2 = kh5.I;
            ez ezVar2 = lz.c;
            xn1 a = wn1.a(ezVar2, lk0Var2, rv4Var3, 0);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, z5);
            rw1.k.getClass();
            zx1 zx1Var3 = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var3);
            } else {
                rv4Var3.r0();
            }
            np npVar4 = qw1.f;
            jce.F(npVar4, rv4Var3, a);
            np npVar5 = qw1.e;
            jce.F(npVar5, rv4Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar6 = qw1.g;
            jce.F(npVar6, rv4Var3, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var3);
            np npVar7 = qw1.d;
            jce.F(npVar7, rv4Var3, p);
            kq7 kq7Var2 = kq7.a;
            nq7 f = pna.f(kq7Var2, 1.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
            int hashCode2 = Long.hashCode(rv4Var3.T);
            xt8 l2 = rv4Var3.l();
            nq7 p2 = lye.p(rv4Var3, f);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var3);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar4, rv4Var3, a2);
            jce.F(npVar5, rv4Var3, l2);
            s21.t(hashCode2, rv4Var3, npVar6, rv4Var3, kgVar2);
            jce.F(npVar7, rv4Var3, p2);
            nq7 f2 = lbe.f(15, vt4Var, a82.g(rv4Var3, 4.0f, tte.k(pna.n(kq7Var2, 72.0f), r0f.z(rv4Var3).c), ba5Var), null, false);
            b37 d = fu0.d(kh5.e, false);
            int hashCode3 = Long.hashCode(rv4Var3.T);
            xt8 l3 = rv4Var3.l();
            nq7 p3 = lye.p(rv4Var3, f2);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var3);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar4, rv4Var3, d);
            jce.F(npVar5, rv4Var3, l3);
            s21.t(hashCode3, rv4Var3, npVar6, rv4Var3, kgVar2);
            jce.F(npVar7, rv4Var3, p3);
            if (f76Var != null) {
                rv4Var3.e0(-181490574);
                kq7Var = kq7Var2;
                npVar3 = npVar5;
                kgVar = kgVar2;
                npVar = npVar4;
                i11 = 0;
                ezVar = ezVar2;
                lk0Var = lk0Var2;
                zx1Var = zx1Var3;
                npVar2 = npVar7;
                do5.a(f76Var, r0f.d, false, null, null, null, pna.c, null, rv4Var, ((i20 >> 6) & 14) | 12582960, 892);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                kq7Var = kq7Var2;
                npVar = npVar4;
                zx1Var = zx1Var3;
                npVar2 = npVar7;
                npVar3 = npVar5;
                i11 = 0;
                kgVar = kgVar2;
                ezVar = ezVar2;
                lk0Var = lk0Var2;
                rv4Var3.e0(-181231383);
                nk5.a(rp5.c((wk3) jk3.a.getValue(), rv4Var3, 0), null, pna.n(kq7Var, 24.0f), r0f.y(rv4Var3).a, rv4Var, 432, 0);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            s21.x(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
            jv9 jv9Var = jv9.a;
            nq7 a3 = jv9Var.a(1.0f, kq7Var, true);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var2, i11);
            int hashCode4 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p4 = lye.p(rv4Var2, a3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var2 = zx1Var;
                rv4Var2.k(zx1Var2);
            } else {
                zx1Var2 = zx1Var;
                rv4Var2.r0();
            }
            np npVar8 = npVar;
            jce.F(npVar8, rv4Var2, a4);
            np npVar9 = npVar3;
            jce.F(npVar9, rv4Var2, l4);
            s21.t(hashCode4, rv4Var2, npVar6, rv4Var2, kgVar);
            np npVar10 = npVar2;
            jce.F(npVar10, rv4Var2, p4);
            cvb.c(yqe.A((y3b) k2b.w.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).i, rv4Var2, 0, 0, 131070);
            xbe.i(rv4Var2, pna.h(kq7Var, 2.0f));
            zx1 zx1Var4 = zx1Var2;
            kg kgVar3 = kgVar;
            nmd.j(vt4Var, zbe.y(kq7Var, nae.e), false, null, null, null, jqe.d, rv4Var, 805306416 | ((i20 >> 21) & 14), 508);
            rv4Var3 = rv4Var;
            xbe.i(rv4Var3, hl5.e(rv4Var3, true, true, kq7Var, 12.0f));
            uwe.h(str, xt4Var, pna.f(kq7Var, 1.0f), false, false, null, null, jqe.e, null, null, false, null, null, null, true, 0, 0, r0f.z(rv4Var3).b, null, rv4Var3, (i20 & 14) | 12583296 | ((i20 >> 15) & Token.ASSIGN_MOD), 12582912, 6160248);
            if (z) {
                s21.w(rv4Var3, 730558347, kq7Var, 12.0f, rv4Var3);
                cvb.c(yqe.A((y3b) k2b.d0.getValue(), rv4Var3), null, r0f.y(rv4Var3).s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var3).i, rv4Var3, 0, 0, 131066);
                xbe.i(rv4Var3, pna.h(kq7Var, 8.0f));
                i12 = 2;
                hz hzVar = new hz(8.0f, true, new vs(2));
                nq7 f3 = pna.f(kq7Var, 1.0f);
                gv9 a5 = ev9.a(hzVar, kh5.F, rv4Var3, 6);
                int hashCode5 = Long.hashCode(rv4Var3.T);
                xt8 l5 = rv4Var3.l();
                nq7 p5 = lye.p(rv4Var3, f3);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var4);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar8, rv4Var3, a5);
                jce.F(npVar9, rv4Var3, l5);
                s21.t(hashCode5, rv4Var3, npVar6, rv4Var3, kgVar3);
                jce.F(npVar10, rv4Var3, p5);
                String A = yqe.A((y3b) k2b.I.getValue(), rv4Var3);
                obj = str2;
                boolean equals = obj.equals("private");
                nq7 a6 = jv9Var.a(1.0f, kq7Var, true);
                int i21 = i20 & 234881024;
                if (i21 == 67108864) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object P = rv4Var3.P();
                lh9 lh9Var = ax1.a;
                if (!z3 && P != lh9Var) {
                    xt4Var3 = xt4Var2;
                } else {
                    xt4Var3 = xt4Var2;
                    P = new ux0(3, xt4Var3);
                    rv4Var3.o0(P);
                }
                f(A, equals, a6, (vt4) P, rv4Var3, 0);
                String A2 = yqe.A((y3b) k2b.J.getValue(), rv4Var3);
                boolean equals2 = obj.equals("public");
                nq7 a7 = jv9Var.a(1.0f, kq7Var, true);
                if (i21 == 67108864) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object P2 = rv4Var3.P();
                if (z4 || P2 == lh9Var) {
                    P2 = new ux0(4, xt4Var3);
                    rv4Var3.o0(P2);
                }
                f(A2, equals2, a7, (vt4) P2, rv4Var3, 0);
                rv4Var3.q(true);
                rv4Var3.q(false);
            } else {
                obj = str2;
                xt4Var3 = xt4Var2;
                i12 = 2;
                rv4Var3.e0(731639472);
                rv4Var3.q(false);
            }
            xbe.i(rv4Var3, pna.h(kq7Var, 8.0f));
            cvb.c(yqe.B((y3b) k2b.R.getValue(), new Object[]{Integer.valueOf(i)}, rv4Var3), zbe.A(kq7Var, 4.0f, nae.e, i12), r0f.y(rv4Var3).s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var3).l, rv4Var3, 48, 0, 131064);
            rv4Var3.q(true);
        } else {
            xt4Var3 = xt4Var2;
            rv4Var3.X();
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new c01(str, i, f76Var, z, obj, nq7Var, xt4Var, vt4Var, xt4Var3, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r6 == defpackage.ax1.a) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.bzc r26, boolean r27, defpackage.nq7 r28, defpackage.rv4 r29, int r30) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1d.c(bzc, boolean, nq7, rv4, int):void");
    }

    public static final void e(vt4 vt4Var, nq7 nq7Var, ei6 ei6Var, uh6 uh6Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        uh6 uh6Var2;
        ei6 ei6Var2;
        nq7 nq7Var2;
        rv4Var.g0(1055276397);
        if (rv4Var.h(vt4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i3 | i;
        int i10 = i2 & 2;
        if (i10 != 0) {
            i5 = i9 | 48;
        } else {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i9 | i4;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i7 = i5 | 384;
        } else {
            if (rv4Var.f(ei6Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i7 = i5 | i6;
        }
        if (rv4Var.f(uh6Var)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i12 = i7 | i8;
        if ((i12 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i12 & 1, z)) {
            if (i10 != 0) {
                nq7Var = kq7.a;
            }
            nq7 nq7Var3 = nq7Var;
            if (i11 != 0) {
                ei6Var = null;
            }
            ei6 ei6Var3 = ei6Var;
            uh6Var2 = uh6Var;
            yqe.g(jce.E(-933153643, new g83(ei6Var3, nq7Var3, uh6Var2, yae.D(vt4Var, rv4Var), 3), rv4Var), rv4Var, 6);
            ei6Var2 = ei6Var3;
            nq7Var2 = nq7Var3;
        } else {
            uh6Var2 = uh6Var;
            rv4Var.X();
            ei6Var2 = ei6Var;
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(vt4Var, nq7Var2, ei6Var2, uh6Var2, i, i2);
        }
    }

    public static final void f(String str, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4 rv4Var2;
        long g;
        long j;
        long j2;
        rv4Var.g0(-1561235592);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var).b);
            if (z) {
                rv4Var.e0(-568409386);
                g = r0f.y(rv4Var).h;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-568319765);
                g = rm1.g(r0f.y(rv4Var), 3.0f);
                rv4Var.q(false);
            }
            nq7 v = nmd.v(k, g, lre.g);
            if (z) {
                rv4Var.e0(-568121458);
                j = zl1.b(0.5f, r0f.y(rv4Var).a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-568024614);
                j = r0f.y(rv4Var).B;
                rv4Var.q(false);
            }
            nq7 z3 = zbe.z(lbe.f(15, vt4Var, st0.d(v, 1.0f, j, r0f.z(rv4Var).b), null, false), 12.0f, 10.0f);
            b37 d = fu0.d(kh5.e, false);
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
            oyb oybVar = r0f.A(rv4Var).k;
            if (z) {
                rv4Var.e0(1089530370);
                j2 = r0f.y(rv4Var).i;
                rv4Var.q(false);
            } else {
                rv4Var.e0(1089613357);
                j2 = r0f.y(rv4Var).q;
                rv4Var.q(false);
            }
            cvb.c(str, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, i9 & 14, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ib2(str, z, nq7Var, vt4Var, i, 0);
        }
    }

    public static final tu7 g(float f, List list, boolean z) {
        float f2;
        float b2;
        int i = xi4.a;
        tu7 tu7Var = new tu7(1);
        tu7Var.a(nae.e);
        if (f != nae.e && !list.isEmpty()) {
            ty5 F = dce.F(1, list.size());
            ArrayList arrayList = new ArrayList(tl1.s(F, 10));
            Iterator it = F.iterator();
            while (true) {
                sy5 sy5Var = (sy5) it;
                if (!sy5Var.c) {
                    break;
                }
                int nextInt = sy5Var.nextInt();
                int i2 = nextInt - 1;
                g96 g96Var = (g96) list.get(i2);
                g96 g96Var2 = (g96) list.get(nextInt);
                if (z) {
                    f2 = ((f96) sl1.c0(g96Var2)).c - ((f96) sl1.c0(g96Var)).c;
                } else {
                    f2 = ((f96) sl1.j0(g96Var)).c - ((f96) sl1.j0(g96Var2)).c;
                }
                float f3 = f2 / f;
                if (nextInt == list.size() - 1) {
                    b2 = 1.0f;
                } else {
                    b2 = tu7Var.b(i2) + f3;
                }
                tu7Var.a(b2);
                arrayList.add(Boolean.TRUE);
            }
        }
        return tu7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.vt4 r4, defpackage.lu4 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.qd
            if (r0 == 0) goto L13
            r0 = r6
            qd r0 = (defpackage.qd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            qd r0 = new qd
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r6)     // Catch: defpackage.kd -> L40
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2c:
            defpackage.hre.r(r6)
            wd r6 = new wd     // Catch: defpackage.kd -> L40
            r1 = 0
            r6.<init>(r4, r5, r3, r1)     // Catch: defpackage.kd -> L40
            r0.b = r2     // Catch: defpackage.kd -> L40
            java.lang.Object r4 = defpackage.k27.p(r6, r0)     // Catch: defpackage.kd -> L40
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L40
            return r5
        L40:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1d.h(vt4, lu4, n42):java.lang.Object");
    }

    public static final g96 i(g96 g96Var, float f, float f2, float f3, f96 f96Var, int i) {
        ArrayList arrayList = new ArrayList(g96Var.a.size());
        List list = g96Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            f96 f96Var2 = g96Var.get(i2);
            if (!f96Var2.e) {
                arrayList.add(f96Var2);
            }
        }
        float size2 = f3 / arrayList.size();
        float f4 = (f96Var.b - (size2 / 2.0f)) + f3;
        ArrayList arrayList2 = new ArrayList();
        int size3 = list.size();
        float f5 = 0.0f;
        int i3 = -1;
        for (int i4 = 0; i4 < size3; i4++) {
            f96 f96Var3 = g96Var.get(i4);
            float abs = f96Var3.a - Math.abs(size2);
            arrayList2.add(new h96(abs, f96Var3.e));
            if (abs > f5) {
                i3 = tl1.x(arrayList2);
                f5 = abs;
            }
        }
        int i5 = i3;
        while (i5 < tl1.x(arrayList2)) {
            int i6 = i5 + 1;
            if (((h96) arrayList2.get(i6)).a != f5) {
                break;
            }
            i5 = i6;
        }
        ArrayList b2 = i96.b(i, f4, i3, i5, f5, f, f2, arrayList2);
        g96 g96Var2 = new g96(b2);
        ArrayList arrayList3 = new ArrayList(b2.size());
        int size4 = b2.size();
        for (int i7 = 0; i7 < size4; i7++) {
            f96 f96Var4 = g96Var2.get(i7);
            arrayList3.add(new f96(f96Var4.a, f96Var4.b, g96Var.get(i7).c, f96Var4.d, f96Var4.e, f96Var4.f, f96Var4.g));
        }
        return new g96(arrayList3);
    }

    public static Map k(t25 t25Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator l = t25Var.l();
        while (l.hasNext()) {
            String b2 = t25Var.b(l.next());
            Object obj = linkedHashMap.get(b2);
            if (obj == null && !linkedHashMap.containsKey(b2)) {
                obj = new Object();
            }
            xl9 xl9Var = (xl9) obj;
            xl9Var.a++;
            linkedHashMap.put(b2, xl9Var);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof j76) && !(entry instanceof m76)) {
                jsc.K(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((xl9) entry.getValue()).a));
        }
        return jsc.s(linkedHashMap);
    }

    public static final nq7 m(nq7 nq7Var, boolean z, mu4 mu4Var, rv4 rv4Var, int i) {
        nq7Var.getClass();
        if (z) {
            rv4Var.e0(1394380953);
            nq7 nq7Var2 = (nq7) mu4Var.c(nq7Var, rv4Var, Integer.valueOf((i & 14) | ((i >> 3) & Token.ASSIGN_MOD)));
            rv4Var.q(false);
            return nq7Var2;
        }
        rv4Var.e0(1394400731);
        rv4Var.q(false);
        return nq7Var;
    }

    public static boolean n(char c2) {
        if (c2 != ' ' && c2 != '\t' && c2 != '\n' && c2 != '\r' && c2 != 11 && c2 != '\f') {
            return false;
        }
        return true;
    }

    public static boolean o(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case Token.GETPROP /* 33 */:
                if (!str.equals("!")) {
                    return false;
                }
                return true;
            case Token.NAME /* 44 */:
                if (!str.equals(",")) {
                    return false;
                }
                return true;
            case Token.STRING /* 46 */:
                if (!str.equals(".")) {
                    return false;
                }
                return true;
            case Token.LOCAL_LOAD /* 59 */:
                if (!str.equals(";")) {
                    return false;
                }
                return true;
            case Token.ENUM_INIT_KEYS /* 63 */:
                if (!str.equals("?")) {
                    return false;
                }
                return true;
            case 12289:
                if (!str.equals("、")) {
                    return false;
                }
                return true;
            case 12290:
                if (!str.equals("。")) {
                    return false;
                }
                return true;
            case 65281:
                if (!str.equals("！")) {
                    return false;
                }
                return true;
            case 65292:
                if (!str.equals("，")) {
                    return false;
                }
                return true;
            case 65306:
                if (!str.equals("：")) {
                    return false;
                }
                return true;
            case 65307:
                if (!str.equals("；")) {
                    return false;
                }
                return true;
            case 65311:
                if (!str.equals("？")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static final float p(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return b23.o(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static final g96 q(g96 g96Var, int i, int i2, float f, float f2) {
        int i3;
        if (i > i2) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        float f3 = ((g96Var.get(i).a - g96Var.get(i).g) + f2) * i3;
        int i4 = g96Var.b;
        int i5 = i4 + i3;
        float f4 = g96Var.get(i4).b + f3;
        ArrayList arrayList = new ArrayList();
        ArrayList E0 = sl1.E0(g96Var);
        E0.remove(i);
        E0.add(i2, (f96) E0.get(i));
        int size = E0.size();
        float f5 = 0.0f;
        int i6 = -1;
        for (int i7 = 0; i7 < size; i7++) {
            f96 f96Var = (f96) E0.get(i7);
            float f6 = f96Var.a;
            arrayList.add(new h96(f6, f96Var.e));
            if (f6 > f5) {
                i6 = tl1.x(arrayList);
                f5 = f6;
            }
        }
        int i8 = i6;
        while (i8 < tl1.x(arrayList)) {
            int i9 = i8 + 1;
            if (((h96) arrayList.get(i9)).a != f5) {
                break;
            }
            i8 = i9;
        }
        return new g96(i96.b(i5, f4, i6, i8, f5, f, f2, arrayList));
    }

    public static final cw1 r(kn6 kn6Var, rv4 rv4Var) {
        Object obj = (un6) rv4Var.j(nu6.a);
        boolean f = rv4Var.f(obj);
        Object P = rv4Var.P();
        Object obj2 = ax1.a;
        if (f || P == obj2) {
            P = new cw1();
            rv4Var.o0(P);
        }
        cw1 cw1Var = (cw1) P;
        boolean h = rv4Var.h(cw1Var) | rv4Var.h(obj);
        Object P2 = rv4Var.P();
        if (h || P2 == obj2) {
            P2 = new fl7(28, obj, cw1Var);
            rv4Var.o0(P2);
        }
        yte.c(cw1Var, obj, (xt4) P2, rv4Var);
        boolean h2 = rv4Var.h(cw1Var) | rv4Var.d(kn6Var.ordinal());
        Object P3 = rv4Var.P();
        if (h2 || P3 == obj2) {
            P3 = new iz7(cw1Var, kn6Var, null, 6);
            rv4Var.o0(P3);
        }
        yte.h(cw1Var, kn6Var, (lu4) P3, rv4Var);
        return cw1Var;
    }

    public static int s(char c2) {
        if (c2 != '!') {
            if (c2 != '\"') {
                if (c2 != ':') {
                    if (c2 != ';') {
                        if (c2 != '?') {
                            switch (c2) {
                                case Token.GETELEM /* 39 */:
                                    return 5;
                                case Token.GETELEM_SUPER /* 40 */:
                                    return 6;
                                case Token.SETELEM /* 41 */:
                                    return 7;
                                default:
                                    switch (c2) {
                                        case Token.NAME /* 44 */:
                                            return 8;
                                        case Token.NUMBER /* 45 */:
                                            return 9;
                                        case Token.STRING /* 46 */:
                                            return 10;
                                        default:
                                            return -1;
                                    }
                            }
                        }
                        return 13;
                    }
                    return 12;
                }
                return 11;
            }
            return 150;
        }
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.d82 r5, java.lang.Object r6, java.lang.Object r7, defpackage.lu4 r8, defpackage.m42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ya1
            if (r0 == 0) goto L13
            r0 = r9
            ya1 r0 = (defpackage.ya1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ya1 r0 = new ya1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.c
            d82 r6 = r0.b
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2b
            r7 = r5
            r5 = r6
            goto L64
        L2b:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L68
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L38:
            defpackage.hre.r(r9)
            java.lang.Object r7 = defpackage.a7c.c(r5, r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L54
            r0.b = r5     // Catch: java.lang.Throwable -> L54
            r0.c = r7     // Catch: java.lang.Throwable -> L54
            r0.e = r2     // Catch: java.lang.Throwable -> L54
            nxa r9 = new nxa     // Catch: java.lang.Throwable -> L54
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L54
            if (r8 != 0) goto L56
            java.lang.Object r6 = defpackage.w92.z(r8, r6, r9)     // Catch: java.lang.Throwable -> L54
        L52:
            r9 = r6
            goto L5f
        L54:
            r6 = move-exception
            goto L68
        L56:
            r0 = 2
            defpackage.jsc.u(r0, r8)     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r8.invoke(r6, r9)     // Catch: java.lang.Throwable -> L54
            goto L52
        L5f:
            n82 r6 = defpackage.n82.a
            if (r9 != r6) goto L64
            return r6
        L64:
            defpackage.a7c.a(r5, r7)
            return r9
        L68:
            defpackage.a7c.a(r5, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1d.t(d82, java.lang.Object, java.lang.Object, lu4, m42):java.lang.Object");
    }

    public static final InputStream u(x8f x8fVar) {
        u8f u8fVar;
        faf a = x8fVar.a.a(x8fVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        ArrayList arrayList2 = x8fVar.c;
        if (!arrayList2.isEmpty()) {
            int i = u8f.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                if (!arrayList3.isEmpty()) {
                    u8fVar = new u8f(a, arrayList3);
                } else {
                    u8fVar = null;
                }
                if (u8fVar != null) {
                    arrayList.add(u8fVar);
                }
            } else {
                throw rs8.f(it);
            }
        }
        Iterator it2 = x8fVar.b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        } else if (it2.next() != null) {
            vm1.h();
            return null;
        } else {
            InputStream inputStream = (InputStream) yf2.t(arrayList);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1d.j(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(java.lang.String r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1d.l(java.lang.String, byte[], int, int):int");
    }
}
