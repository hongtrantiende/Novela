package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jce  reason: default package */
/* loaded from: classes3.dex */
public abstract class jce {
    public static final Object a = new Object();
    public static final tu1 b = new tu1(new sv1(12), false, -1236855399);
    public static final tu1 c = new tu1(new sv1(13), false, 785237613);

    public jce(kwa kwaVar) {
        kwaVar.getClass();
    }

    public static final void A(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new li9(str));
    }

    public static nq7 B(nq7 nq7Var, vk8 vk8Var, dc dcVar, w22 w22Var, float f, em1 em1Var, int i) {
        if ((i & 4) != 0) {
            dcVar = kh5.e;
        }
        dc dcVar2 = dcVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return nq7Var.a0(new wk8(vk8Var, dcVar2, w22Var, f, em1Var));
    }

    public static final void C(xt4 xt4Var, rv4 rv4Var) {
        rv4Var.b(pvc.a, new id1(xt4Var, 29, (byte) 0));
    }

    public static final vi1 D(xt4 xt4Var, rv4 rv4Var, int i, int i2) {
        String str;
        xt4Var.getClass();
        boolean z = true;
        if ((i2 & 1) != 0) {
            str = "clickable_span";
        } else {
            str = "androidx.compose.foundation.text.linkContent";
        }
        boolean f = rv4Var.f(xt4Var);
        if ((((i & 14) ^ 6) <= 4 || !rv4Var.f(str)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = f | z;
        Object P = rv4Var.P();
        if (z2 || P == ax1.a) {
            P = new vi1(xt4Var, str);
            rv4Var.o0(P);
        }
        return (vi1) P;
    }

    public static final tu1 E(int i, hu4 hu4Var, rv4 rv4Var) {
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new tu1(hu4Var, true, i);
            rv4Var.o0(P);
        }
        tu1 tu1Var = (tu1) P;
        tu1Var.p(hu4Var);
        return tu1Var;
    }

    public static final void F(lu4 lu4Var, rv4 rv4Var, Object obj) {
        if (!rv4Var.S && c16.i(rv4Var.P(), obj)) {
            return;
        }
        rv4Var.o0(obj);
        rv4Var.b(obj, lu4Var);
    }

    public static fje G(fye fyeVar) {
        if (fyeVar == fye.d) {
            return new fje(7, "HmacSha256", false);
        }
        if (fyeVar == fye.e) {
            return new fje(7, "HmacSha384", false);
        }
        if (fyeVar == fye.f) {
            return new fje(7, "HmacSha512", false);
        }
        vs.m("Unrecognized HPKE KDF identifier");
        return null;
    }

    public static x0f H(eye eyeVar) {
        if (eyeVar == eye.d) {
            return new r95(16);
        }
        if (eyeVar == eye.e) {
            return new r95(32);
        }
        if (eyeVar == eye.f) {
            return new d38(27);
        }
        vs.m("Unrecognized HPKE AEAD identifier");
        return null;
    }

    public static f1f I(hye hyeVar) {
        if (hyeVar == hye.C) {
            return new hvc(new fje(7, "HmacSha256", false));
        }
        if (hyeVar == hye.d) {
            return rwa.z(bkf.a);
        }
        if (hyeVar == hye.e) {
            return rwa.z(bkf.b);
        }
        if (hyeVar == hye.f) {
            return rwa.z(bkf.c);
        }
        vs.m("Unrecognized HPKE KEM identifier");
        return null;
    }

    public static final void a(String str, int i, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1322551023);
        int i4 = i2 | 384;
        if (rv4Var2.h(vt4Var)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i5 = i4 | i3;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            tza tzaVar = j27.a;
            v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
            kq7 kq7Var2 = kq7.a;
            nq7 k = tte.k(kq7Var2, v72Var);
            if ((i5 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new on7(2, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 A = zbe.A(lbe.f(15, (vt4) P, k, null, false), 4.0f, nae.e, 2);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            F(qw1.f, rv4Var2, d);
            F(qw1.e, rv4Var2, l);
            F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            C(qw1.h, rv4Var2);
            F(qw1.d, rv4Var2, p);
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.k;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            nk0 nk0Var = kh5.e;
            pu0 pu0Var = pu0.a;
            cvb.c(str, zbe.y(pu0Var.a(kq7Var2, nk0Var), 4.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var2, 6, 0, 131064);
            if (i > 0) {
                rv4Var2.e0(1400873061);
                cvb.c(String.valueOf(i), pu0Var.a(kq7Var2, kh5.c), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var2, 0, 0, 131064);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var2;
                rv4Var2.e0(1401117465);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new tn7(str, vt4Var, kq7Var, i, i2);
        }
    }

    public static final void b(nq7 nq7Var, wea weaVar, v61 v61Var, w61 w61Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        v61 v61Var2;
        int i5;
        v61 v61Var3;
        rv4Var.g0(1359693790);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(weaVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | Token.CASE;
        if (rv4Var.f(w61Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4 | 24576;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i5 = i8 & (-897);
                v61Var3 = v61Var;
            } else {
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                v61 v61Var4 = pm1Var.a0;
                if (v61Var4 == null) {
                    qm1 qm1Var = zve.b;
                    v61Var4 = new v61(rm1.d(pm1Var, qm1Var), rm1.a(pm1Var, rm1.d(pm1Var, qm1Var)), sve.l(zl1.b(zve.d, rm1.d(pm1Var, zve.c)), rm1.d(pm1Var, qm1Var)), zl1.b(0.38f, rm1.a(pm1Var, rm1.d(pm1Var, qm1Var))));
                    pm1Var.a0 = v61Var4;
                }
                i5 = i8 & (-897);
                v61Var3 = v61Var4;
            }
            rv4Var.r();
            long j = v61Var3.a;
            long j2 = v61Var3.b;
            float f = w61Var.a;
            rv4Var.e0(-1763481333);
            rv4Var.e0(167726411);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yae.z(new rg3(f));
                rv4Var.o0(P);
            }
            rv4Var.q(false);
            rv4Var.q(false);
            v9b.a(nq7Var, weaVar, j, j2, nae.e, ((rg3) ((aw7) P).getValue()).a, null, E(-97109725, new x0a(tu1Var, 3), rv4Var), rv4Var, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 12582912 | 1572864, 16);
            v61Var2 = v61Var3;
        } else {
            rv4Var.X();
            v61Var2 = v61Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wp0(nq7Var, weaVar, v61Var2, w61Var, tu1Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x054d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final int r71, final int r72, int r73, defpackage.lu4 r74, defpackage.rv4 r75, defpackage.nq7 r76, final java.lang.String r77) {
        /*
            Method dump skipped, instructions count: 1443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jce.c(int, int, int, lu4, rv4, nq7, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.nq7 r20, defpackage.kj6 r21, defpackage.rh8 r22, boolean r23, defpackage.jz r24, defpackage.lk0 r25, defpackage.li4 r26, boolean r27, defpackage.wi r28, defpackage.xt4 r29, defpackage.rv4 r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jce.d(nq7, kj6, rh8, boolean, jz, lk0, li4, boolean, wi, xt4, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.nq7 r20, defpackage.kj6 r21, defpackage.rh8 r22, boolean r23, defpackage.fz r24, defpackage.mk0 r25, defpackage.li4 r26, boolean r27, defpackage.wi r28, defpackage.xt4 r29, defpackage.rv4 r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jce.e(nq7, kj6, rh8, boolean, fz, mk0, li4, boolean, wi, xt4, rv4, int, int):void");
    }

    public static final void f(boolean z, exb exbVar, xt4 xt4Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, lu4 lu4Var3, mu4 mu4Var2, nu4 nu4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        aw7 aw7Var;
        ywb ywbVar;
        boolean z3;
        exbVar.getClass();
        xt4Var.getClass();
        lu4Var.getClass();
        lu4Var2.getClass();
        mu4Var.getClass();
        lu4Var3.getClass();
        mu4Var2.getClass();
        nu4Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(1615054337);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (rv4Var.f(exbVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if (rv4Var.h(lu4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (rv4Var.h(lu4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (rv4Var.h(mu4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i17 = i16 | i7;
        if (rv4Var.h(lu4Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (rv4Var.h(mu4Var2)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        if (rv4Var.h(nu4Var)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i20 = i19 | i10;
        if (rv4Var.h(vt4Var)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i21 = i20 | i11;
        if ((i21 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i21 & 1, z2)) {
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = new rh7(16);
                rv4Var.o0(P);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            Object[] objArr2 = new Object[0];
            yy9 yy9Var = ywb.c;
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = new rh7(15);
                rv4Var.o0(P2);
            }
            final ywb ywbVar2 = (ywb) zpe.m(objArr2, yy9Var, (vt4) P2, rv4Var, 384);
            if (ikd.a(rv4Var)) {
                rv4Var.e0(1860795232);
                boolean f = rv4Var.f(aw7Var2);
                Object P3 = rv4Var.P();
                if (f || P3 == obj) {
                    P3 = new nd7(aw7Var2, 27);
                    rv4Var.o0(P3);
                }
                vt4 vt4Var2 = (vt4) P3;
                boolean f2 = rv4Var.f(ywbVar2);
                Object P4 = rv4Var.P();
                if (!f2 && P4 != obj) {
                    z3 = false;
                } else {
                    z3 = false;
                    P4 = new lu4() { // from class: kn7
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj2, Object obj3) {
                            int i22 = r2;
                            pvc pvcVar = pvc.a;
                            ywb ywbVar3 = ywbVar2;
                            String str = (String) obj2;
                            String str2 = (String) obj3;
                            switch (i22) {
                                case 0:
                                    str.getClass();
                                    str2.getClass();
                                    ywbVar3.getClass();
                                    ywbVar3.a.setValue(Boolean.TRUE);
                                    ywbVar3.b.setValue(str2);
                                    return pvcVar;
                                default:
                                    str.getClass();
                                    str2.getClass();
                                    ywbVar3.getClass();
                                    ywbVar3.a.setValue(Boolean.TRUE);
                                    ywbVar3.b.setValue(str2);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P4);
                }
                aw7Var = aw7Var2;
                g(z, exbVar, xt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, vt4Var2, (lu4) P4, vt4Var, rv4Var, i21 & 33554430, (i21 >> 27) & 14);
                rv4Var.q(z3);
                ywbVar = ywbVar2;
                obj = obj;
            } else {
                aw7Var = aw7Var2;
                rv4Var.e0(1861468769);
                boolean f3 = rv4Var.f(aw7Var);
                Object P5 = rv4Var.P();
                if (f3 || P5 == obj) {
                    P5 = new nd7(aw7Var, 29);
                    rv4Var.o0(P5);
                }
                vt4 vt4Var3 = (vt4) P5;
                boolean f4 = rv4Var.f(ywbVar2);
                Object P6 = rv4Var.P();
                if (f4 || P6 == obj) {
                    P6 = new lu4() { // from class: kn7
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj2, Object obj3) {
                            int i22 = r2;
                            pvc pvcVar = pvc.a;
                            ywb ywbVar3 = ywbVar2;
                            String str = (String) obj2;
                            String str2 = (String) obj3;
                            switch (i22) {
                                case 0:
                                    str.getClass();
                                    str2.getClass();
                                    ywbVar3.getClass();
                                    ywbVar3.a.setValue(Boolean.TRUE);
                                    ywbVar3.b.setValue(str2);
                                    return pvcVar;
                                default:
                                    str.getClass();
                                    str2.getClass();
                                    ywbVar3.getClass();
                                    ywbVar3.a.setValue(Boolean.TRUE);
                                    ywbVar3.b.setValue(str2);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P6);
                }
                ywbVar = ywbVar2;
                h(z, exbVar, xt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, vt4Var3, (lu4) P6, vt4Var, rv4Var, i21 & 33554430, (i21 >> 27) & 14);
                rv4Var.q(false);
            }
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            boolean f5 = rv4Var.f(aw7Var);
            Object P7 = rv4Var.P();
            if (f5 || P7 == obj) {
                P7 = new dk7(aw7Var, 24);
                rv4Var.o0(P7);
            }
            ade.f(booleanValue, exbVar, (xt4) P7, nu4Var, rv4Var, (i21 & Token.ASSIGN_MOD) | ((i21 >> 15) & 7168));
            ywb ywbVar3 = ywbVar;
            boolean f6 = rv4Var.f(ywbVar3);
            Object P8 = rv4Var.P();
            if (f6 || P8 == obj) {
                P8 = new cl7(ywbVar3, 2);
                rv4Var.o0(P8);
            }
            fce.k(ywbVar3, (xt4) P8, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new od1(z, exbVar, xt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, nu4Var, vt4Var, i);
        }
    }

    public static final void g(boolean z, exb exbVar, xt4 xt4Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, lu4 lu4Var3, mu4 mu4Var2, vt4 vt4Var, lu4 lu4Var4, vt4 vt4Var2, rv4 rv4Var, int i, int i2) {
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
        Object obj;
        int i13;
        boolean z2;
        rv4Var.g0(-852352864);
        int i14 = 4;
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i | i3;
        if (rv4Var.f(exbVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i16 = i15 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i17 = i16 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i18 = i17 | i6;
        if (rv4Var.h(lu4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i19 = i18 | i7;
        if (rv4Var.h(mu4Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i8;
        if (rv4Var.h(lu4Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i21 = i20 | i9;
        if (rv4Var.h(mu4Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i22 = i21 | i10;
        if (rv4Var.h(vt4Var)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i23 = i22 | i11;
        if (rv4Var.h(lu4Var4)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i24 = i23 | i12;
        if ((i2 & 6) == 0) {
            obj = vt4Var2;
            if (!rv4Var.h(obj)) {
                i14 = 2;
            }
            i13 = i2 | i14;
        } else {
            obj = vt4Var2;
            i13 = i2;
        }
        if ((306783379 & i24) == 306783378 && (i13 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i24 & 1, z2)) {
            nk0 nk0Var = kh5.D;
            nq7 y = zbe.y(mwe.x(pna.f(kq7.a, 1.0f), 15), 24.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(23);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i25 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(24);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i25.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, y, E(1425442818, new gn7(exbVar, xt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, vt4Var, lu4Var4, obj, 0), rv4Var), rv4Var, (i24 & 14) | 805531008 | ((i24 >> 3) & Token.ASSIGN_MOD), 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new hn7(z, exbVar, xt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, vt4Var, lu4Var4, vt4Var2, i, i2, 0);
        }
    }

    public static final void h(boolean z, exb exbVar, xt4 xt4Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, lu4 lu4Var3, mu4 mu4Var2, vt4 vt4Var, lu4 lu4Var4, vt4 vt4Var2, rv4 rv4Var, int i, int i2) {
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
        Object obj;
        int i13;
        boolean z2;
        rv4Var.g0(1959208605);
        int i14 = 4;
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i15 = i | i3;
        if (rv4Var.f(exbVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i16 = i15 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i17 = i16 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i18 = i17 | i6;
        if (rv4Var.h(lu4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i19 = i18 | i7;
        if (rv4Var.h(mu4Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i8;
        if (rv4Var.h(lu4Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i21 = i20 | i9;
        if (rv4Var.h(mu4Var2)) {
            i10 = 8388608;
        } else {
            i10 = 4194304;
        }
        int i22 = i21 | i10;
        if (rv4Var.h(vt4Var)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i23 = i22 | i11;
        if (rv4Var.h(lu4Var4)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i24 = i23 | i12;
        if ((i2 & 6) == 0) {
            obj = vt4Var2;
            if (!rv4Var.h(obj)) {
                i14 = 2;
            }
            i13 = i2 | i14;
        } else {
            obj = vt4Var2;
            i13 = i2;
        }
        if ((306783379 & i24) == 306783378 && (i13 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i24 & 1, z2)) {
            nk0 nk0Var = kh5.e;
            nq7 y = zbe.y(mwe.x(pna.u(kq7.a, nae.e, 600.0f, 1), 15), 24.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(20);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i25 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(21);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i25.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, y, E(-184071429, new gn7(exbVar, xt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, vt4Var, lu4Var4, obj, 1), rv4Var), rv4Var, (i24 & 14) | 818113920 | ((i24 >> 3) & Token.ASSIGN_MOD), 64);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new hn7(z, exbVar, xt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, vt4Var, lu4Var4, vt4Var2, i, i2, 1);
        }
    }

    public static final void i(String str, boolean z, boolean z2, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i) {
        Object obj;
        int i2;
        boolean z3;
        kq7 kq7Var;
        long g;
        kq7 kq7Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-743789421);
        if ((i & 6) == 0) {
            obj = str;
            if (rv4Var2.f(obj)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            obj = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.g(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z2)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        int i8 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i8 |= i3;
        }
        if ((74899 & i8) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i8 & 1, z3)) {
            if (z2) {
                rv4Var2.e0(-494093229);
                g = zl1.b(0.2f, ((h27) rv4Var2.j(j27.a)).a.a);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-493995920);
                g = rm1.g(((h27) rv4Var2.j(j27.a)).a, 1.0f);
                rv4Var2.q(false);
            }
            ba5 ba5Var = lre.g;
            kq7 kq7Var3 = kq7.a;
            nq7 h = lbe.h(nmd.v(kq7Var3, g, ba5Var), vt4Var2, vt4Var);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            F(qw1.f, rv4Var2, d);
            F(qw1.e, rv4Var2, l);
            F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            C(qw1.h, rv4Var2);
            F(qw1.d, rv4Var2, p);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.k;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            nk0 nk0Var = kh5.e;
            pu0 pu0Var = pu0.a;
            cvb.c(obj, zbe.z(pu0Var.a(kq7Var3, nk0Var), 12.0f, 8.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, i8 & 14, 24576, 114680);
            rv4Var2 = rv4Var;
            if (z) {
                rv4Var2.e0(-1352649017);
                kq7Var2 = kq7Var3;
                nk5.a(rp5.c((wk3) ok3.s.getValue(), rv4Var2, 0), null, pna.n(tte.t(zbe.y(pu0Var.a(kq7Var2, kh5.c), 2.0f), 45.0f), 12.0f), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 48, 0);
                rv4Var2.q(false);
            } else {
                kq7Var2 = kq7Var3;
                rv4Var2.e0(-1352298903);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new sb3(str, z, z2, kq7Var, vt4Var, vt4Var2, i);
        }
    }

    public static final void j(exb exbVar, nq7 nq7Var, vt4 vt4Var, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, lu4 lu4Var3, mu4 mu4Var2, vt4 vt4Var2, lu4 lu4Var4, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
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
        boolean z;
        lu4 lu4Var5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        int i13;
        boolean z6;
        boolean z7;
        int i14;
        boolean z8;
        int i15;
        boolean z9;
        boolean z10;
        boolean z11;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1979972751);
        if (rv4Var2.f(exbVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i16 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i17 = i16 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i18 = i17 | i4;
        if (rv4Var2.h(lu4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i19 = i18 | i5;
        if (rv4Var2.h(lu4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i20 = i19 | i6;
        if (rv4Var2.h(mu4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i21 = i20 | i7;
        if (rv4Var2.h(lu4Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i22 = i21 | i8;
        if (rv4Var2.h(mu4Var2)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i23 = i22 | i9;
        if (rv4Var2.h(vt4Var2)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i24 = i23 | i10;
        if (rv4Var2.h(lu4Var4)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i25 = i24 | i11;
        if (rv4Var2.h(vt4Var3)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        if ((i25 & 306783379) == 306783378 && (i12 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var2.U(i25 & 1, z)) {
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
            F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 C = zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2), nae.e, 8.0f, nae.e, nae.e, 13);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, C);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            F(npVar, rv4Var2, a3);
            F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            F(npVar4, rv4Var2, p2);
            String A = yqe.A((y3b) o3b.W.getValue(), rv4Var2);
            tza tzaVar = j27.a;
            cvb.c(A, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131064);
            ar5 c2 = rp5.c((wk3) jk3.w.getValue(), rv4Var, 0);
            long j = ((h27) rv4Var.j(tzaVar)).a.q;
            nq7 k = tte.k(pna.n(kq7Var, 32.0f), uu9.a);
            if ((i25 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new hi7(29, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 6.0f), j, rv4Var, 48, 0);
            rv4Var.q(true);
            String str2 = exbVar.a;
            boolean z12 = exbVar.k;
            boolean z13 = exbVar.j;
            String str3 = exbVar.b;
            int i26 = exbVar.c;
            int i27 = exbVar.d;
            nq7 d = st0.d(zbe.y(kq7Var, 8.0f), 1.0f, rm1.g(((h27) rv4Var.j(tzaVar)).a, 4.0f), ((h27) rv4Var.j(tzaVar)).c.b);
            if ((458752 & i25) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (!z3 && P2 != lh9Var) {
                z4 = true;
            } else {
                z4 = true;
                P2 = new ug0(mu4Var, 1);
                rv4Var.o0(P2);
            }
            c(i26, i27, 0, (lu4) P2, rv4Var, d, str2);
            int i28 = i25 & 14;
            if (i28 == 4) {
                z5 = z4;
            } else {
                z5 = false;
            }
            Object P3 = rv4Var.P();
            if (z5 || P3 == lh9Var) {
                P3 = new u76(exbVar, 15);
                rv4Var.o0(P3);
            }
            h23 q = yae.q((vt4) P3);
            boolean f = rv4Var.f(str3);
            Object P4 = rv4Var.P();
            if (f || P4 == lh9Var) {
                if (str3 == null) {
                    str = "";
                } else {
                    str = str3;
                }
                P4 = yae.z(str);
                rv4Var.o0(P4);
            }
            aw7 aw7Var = (aw7) P4;
            String str4 = exbVar.e;
            List list = exbVar.i;
            wmc wmcVar = (wmc) q.getValue();
            String str5 = (String) aw7Var.getValue();
            int i29 = exbVar.c;
            int i30 = exbVar.d;
            if (str3 == null) {
                i13 = i30;
                z6 = z4;
            } else {
                i13 = i30;
                z6 = false;
            }
            List list2 = exbVar.g;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            boolean f3 = rv4Var.f(aw7Var);
            Object P5 = rv4Var.P();
            if (f3 || P5 == lh9Var) {
                P5 = new dk7(aw7Var, 21);
                rv4Var.o0(P5);
            }
            xt4 xt4Var = (xt4) P5;
            if ((i25 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object P6 = rv4Var.P();
            if (!z7 && P6 != lh9Var) {
                i14 = i13;
            } else {
                i14 = i13;
                P6 = new tb(5, lu4Var);
                rv4Var.o0(P6);
            }
            k(str4, list, wmcVar, z6, str5, i29, i14, list2, f2, xt4Var, (lu4) P6, lu4Var2, mu4Var, vt4Var2, rv4Var, 100663808, ((i25 >> 9) & 1008) | ((i25 >> 15) & 7168));
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            boolean g = rv4Var.g(z13);
            Object P7 = rv4Var.P();
            if (g || P7 == lh9Var) {
                P7 = yae.z(Boolean.valueOf(z13));
                rv4Var.o0(P7);
            }
            aw7 aw7Var2 = (aw7) P7;
            boolean g2 = rv4Var.g(z12);
            Object P8 = rv4Var.P();
            if (g2 || P8 == lh9Var) {
                P8 = yae.z(Boolean.valueOf(z12));
                rv4Var.o0(P8);
            }
            aw7 aw7Var3 = (aw7) P8;
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            boolean z14 = exbVar.j;
            boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
            boolean z15 = exbVar.k;
            nq7 A2 = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
            boolean f4 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var3);
            Object P9 = rv4Var.P();
            if (f4 || P9 == lh9Var) {
                P9 = new oi1(aw7Var2, aw7Var3, 4);
                rv4Var.o0(P9);
            }
            lu4 lu4Var6 = (lu4) P9;
            if ((i25 & 3670016) == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P10 = rv4Var.P();
            if (!z8 && P10 != lh9Var) {
                i15 = i28;
            } else {
                i15 = i28;
                P10 = new tb(6, lu4Var3);
                rv4Var.o0(P10);
            }
            lu4 lu4Var7 = (lu4) P10;
            if ((i25 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean f5 = z9 | rv4Var.f(aw7Var) | rv4Var.f(aw7Var2) | rv4Var.f(aw7Var3);
            Object P11 = rv4Var.P();
            if (f5 || P11 == lh9Var) {
                P11 = new ee7(mu4Var2, aw7Var, aw7Var2, aw7Var3, 2);
                rv4Var.o0(P11);
            }
            q(booleanValue, z14, booleanValue2, z15, A2, lu4Var6, lu4Var7, (vt4) P11, rv4Var, 24576);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 6.0f));
            List list3 = exbVar.h;
            nq7 A3 = zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2);
            if ((i25 & 1879048192) == 536870912) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i15 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z16 = z10 | z11;
            Object P12 = rv4Var2.P();
            if (!z16 && P12 != lh9Var) {
                lu4Var5 = lu4Var4;
            } else {
                lu4Var5 = lu4Var4;
                P12 = new sv4(24, lu4Var5, exbVar);
                rv4Var2.o0(P12);
            }
            o(list3, A3, (lu4) P12, vt4Var3, rv4Var2, ((i12 << 9) & 7168) | 48);
            hl5.w(kq7Var, 12.0f, rv4Var2, true);
        } else {
            lu4Var5 = lu4Var4;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new jn7(exbVar, nq7Var, vt4Var, lu4Var, lu4Var2, mu4Var, lu4Var3, mu4Var2, vt4Var2, lu4Var5, vt4Var3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0366  */
    /* JADX WARN: Type inference failed for: r13v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r15v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final java.lang.String r61, final java.util.List r62, final defpackage.wmc r63, final boolean r64, java.lang.String r65, final int r66, final int r67, final java.util.List r68, final defpackage.nq7 r69, defpackage.xt4 r70, final defpackage.lu4 r71, final defpackage.lu4 r72, final defpackage.mu4 r73, final defpackage.vt4 r74, defpackage.rv4 r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jce.k(java.lang.String, java.util.List, wmc, boolean, java.lang.String, int, int, java.util.List, nq7, xt4, lu4, lu4, mu4, vt4, rv4, int, int):void");
    }

    public static final int l(aw7 aw7Var) {
        return ((Number) aw7Var.getValue()).intValue();
    }

    public static final int m(aw7 aw7Var) {
        return ((Number) aw7Var.getValue()).intValue();
    }

    public static final void n(final wmc wmcVar, final int i, final int i2, final nq7 nq7Var, final mu4 mu4Var, xt4 xt4Var, rv4 rv4Var, final int i3, final int i4) {
        int i5;
        Object obj;
        int i6;
        boolean z;
        final xt4 xt4Var2;
        xt4 xt4Var3;
        int i7;
        int i8;
        Object obj2;
        int i9;
        xt4 xt4Var4;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        boolean z4;
        oyb oybVar;
        int i12;
        Object obj3;
        xt4 xt4Var5;
        boolean z5;
        boolean z6;
        ArrayList arrayList;
        Object obj4;
        xt4 xt4Var6;
        Object obj5;
        boolean z7;
        xt4 xt4Var7;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean h;
        int i17;
        rv4Var.g0(613526294);
        if ((i3 & 6) == 0) {
            if ((i3 & 8) == 0) {
                h = rv4Var.f(wmcVar);
            } else {
                h = rv4Var.h(wmcVar);
            }
            if (h) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i5 = i17 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.d(i)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i5 |= i16;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.d(i2)) {
                i15 = 256;
            } else {
                i15 = Token.CASE;
            }
            i5 |= i15;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i5 |= i14;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var.h(mu4Var)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i5 |= i13;
        }
        int i18 = i4 & 32;
        if (i18 != 0) {
            i5 |= 196608;
            obj = xt4Var;
        } else {
            obj = xt4Var;
            if ((i3 & 196608) == 0) {
                if (rv4Var.h(obj)) {
                    i6 = 131072;
                } else {
                    i6 = Parser.ARGC_LIMIT;
                }
                i5 |= i6;
            }
        }
        if ((i5 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            Object obj6 = ax1.a;
            if (i18 != 0) {
                Object P = rv4Var.P();
                if (P == obj6) {
                    P = new si7(22);
                    rv4Var.o0(P);
                }
                xt4Var3 = (xt4) P;
            } else {
                xt4Var3 = obj;
            }
            r13 r13Var = (r13) rv4Var.j(dy1.h);
            boolean f = rv4Var.f(r13Var);
            Object P2 = rv4Var.P();
            if (!f && P2 != obj6) {
                i7 = 2;
                i8 = 1;
                obj2 = P2;
            } else {
                i7 = 2;
                i8 = 1;
                float[] fArr = {r13Var.k1(zr1.q(4)), r13Var.k1(zr1.q(4))};
                rv4Var.o0(fArr);
                obj2 = fArr;
            }
            float[] fArr2 = (float[]) obj2;
            Object P3 = rv4Var.P();
            if (P3 == obj6) {
                i9 = i7;
                ixa ixaVar = new ixa(zr1.p(1.5d));
                xt4Var4 = xt4Var3;
                rf2 rf2Var = new rf2(zr1.p(1.5d), fArr2);
                fvc fvcVar = new fvc(zr1.p(1.5d));
                d34[] d34VarArr = new d34[3];
                d34VarArr[0] = ixaVar;
                d34VarArr[i8] = rf2Var;
                d34VarArr[i9] = fvcVar;
                P3 = new e34(d34VarArr);
                rv4Var.o0(P3);
            } else {
                i9 = i7;
                xt4Var4 = xt4Var3;
            }
            e34 e34Var = (e34) P3;
            f99 f99Var = j27.a;
            long j = ((h27) rv4Var.j(f99Var)).a.q;
            if ((57344 & i5) == 16384) {
                i10 = i8;
            } else {
                i10 = 0;
            }
            Object P4 = rv4Var.P();
            if (i10 == 0 && P4 != obj6) {
                i11 = i8;
            } else {
                i11 = i8;
                P4 = new cl7(mu4Var, i11);
                rv4Var.o0(P4);
            }
            Object D = D((xt4) P4, rv4Var, 0, i11);
            nq7Var.getClass();
            e34Var.getClass();
            nq7 r = ote.r(nq7Var, new cq2(e34Var, 23));
            r.getClass();
            D.getClass();
            nq7 b2 = dab.b(r, pvc.a, new vi(D, 10));
            oyb oybVar2 = ((h27) rv4Var.j(f99Var)).b.j;
            if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !rv4Var.f(wmcVar))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z3 | z2;
            if ((i5 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z8 | z4;
            Object P5 = rv4Var.P();
            if (!z9 && P5 != obj6) {
                oybVar = oybVar2;
                i12 = i5;
                obj3 = obj6;
                xt4Var5 = xt4Var4;
                z6 = false;
                z5 = true;
            } else {
                ns nsVar = new ns();
                String str = wmcVar.a;
                nsVar.f(str);
                if (i < i2) {
                    nsVar.b(i, i2, new uva(0L, 0L, null, null, null, null, null, 0L, null, null, null, zl1.b(0.2f, j), null, null, 63487));
                }
                List list = wmcVar.b;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        xmc xmcVar = (xmc) it.next();
                        int i19 = xmcVar.e;
                        boolean z10 = xmcVar.f;
                        int i20 = xmcVar.b;
                        int i21 = xmcVar.a;
                        oyb oybVar3 = oybVar2;
                        int i22 = xmcVar.d;
                        int i23 = xmcVar.c;
                        int i24 = i5;
                        Iterator it2 = it;
                        if (i19 != 1) {
                            if (i19 != i9) {
                                if (i19 != 3) {
                                    if (i19 != 5) {
                                        int i25 = i23 + i22;
                                        String substring = str.substring(i23, i25);
                                        xt4Var6 = xt4Var4;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(i21);
                                        sb.append("-");
                                        sb.append((i21 + i20) - 1);
                                        sb.append("-");
                                        sb.append(substring);
                                        nsVar.a("clickable_span", i23, i25, sb.toString());
                                        obj4 = obj6;
                                    } else {
                                        obj5 = obj6;
                                        xt4Var6 = xt4Var4;
                                        int i26 = i23 + i22;
                                        nsVar.a("dash_underline_span", i23, i26, zve.h(new zl1(bb9.c)));
                                        String substring2 = str.substring(i23, i26);
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(i21);
                                        sb2.append("-");
                                        sb2.append((i21 + i20) - 1);
                                        sb2.append("-");
                                        sb2.append(substring2);
                                        nsVar.a("clickable_span", i23, i26, sb2.toString());
                                    }
                                } else {
                                    obj5 = obj6;
                                    xt4Var6 = xt4Var4;
                                    int i27 = i23 + i22;
                                    t(nsVar, j, i23, i27);
                                    String substring3 = str.substring(i23, i27);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(i21);
                                    sb3.append("-");
                                    sb3.append((i21 + i20) - 1);
                                    sb3.append("-");
                                    sb3.append(substring3);
                                    nsVar.a("clickable_span", i23, i27, sb3.toString());
                                }
                                obj4 = obj5;
                            } else {
                                Object obj7 = obj6;
                                xt4Var6 = xt4Var4;
                                if (z10) {
                                    obj4 = obj7;
                                    nsVar.a("squiggly_underline_span", i23, i23 + i22, zve.h(new zl1(bb9.a)));
                                } else {
                                    obj4 = obj7;
                                    t(nsVar, bb9.a, i23, i23 + i22);
                                }
                                int i28 = i23 + i22;
                                String substring4 = str.substring(i23, i28);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(i21);
                                sb4.append("-");
                                sb4.append((i21 + i20) - 1);
                                sb4.append("-");
                                sb4.append(substring4);
                                nsVar.a("clickable_span", i23, i28, sb4.toString());
                            }
                        } else {
                            obj4 = obj6;
                            xt4Var6 = xt4Var4;
                            if (z10) {
                                nsVar.a("squiggly_underline_span", i23, i23 + i22, zve.h(new zl1(bb9.b)));
                            } else {
                                t(nsVar, bb9.b, i23, i23 + i22);
                            }
                            int i29 = i23 + i22;
                            String substring5 = str.substring(i23, i29);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(i21);
                            sb5.append("-");
                            sb5.append((i21 + i20) - 1);
                            sb5.append("-");
                            sb5.append(substring5);
                            nsVar.a("clickable_span", i23, i29, sb5.toString());
                        }
                        oybVar2 = oybVar3;
                        i5 = i24;
                        it = it2;
                        xt4Var4 = xt4Var6;
                        obj6 = obj4;
                        i9 = 2;
                    }
                }
                oybVar = oybVar2;
                i12 = i5;
                obj3 = obj6;
                xt4Var5 = xt4Var4;
                z5 = true;
                ps k = nsVar.k();
                ns nsVar2 = new ns();
                String str2 = k.b;
                nsVar2.f(str2);
                nsVar2.a("extended_spans_marker", 0, 0, String.valueOf(e34Var.hashCode()));
                List c2 = k.c();
                int size = c2.size();
                for (int i30 = 0; i30 < size; i30++) {
                    os osVar = (os) c2.get(i30);
                    nsVar2.b(osVar.b, osVar.c, (uva) osVar.a);
                }
                List b3 = k.b();
                int size2 = b3.size();
                for (int i31 = 0; i31 < size2; i31++) {
                    os osVar2 = (os) b3.get(i31);
                    nsVar2.c((pl8) osVar2.a, osVar2.b, osVar2.c);
                }
                z6 = false;
                List d = k.d(0, str2.length());
                int size3 = d.size();
                for (int i32 = 0; i32 < size3; i32++) {
                    os osVar3 = (os) d.get(i32);
                    nsVar2.a(osVar3.d, osVar3.b, osVar3.c, (String) osVar3.a);
                }
                List f2 = k.f(str2.length());
                int size4 = f2.size();
                int i33 = 0;
                while (true) {
                    arrayList = nsVar2.c;
                    if (i33 >= size4) {
                        break;
                    }
                    os osVar4 = (os) f2.get(i33);
                    arrayList.add(new ms(osVar4.b, osVar4.c, 8, (f5d) osVar4.a, null));
                    i33++;
                }
                List g = k.g(str2.length());
                int size5 = g.size();
                for (int i34 = 0; i34 < size5; i34++) {
                    os osVar5 = (os) g.get(i34);
                    arrayList.add(new ms(osVar5.b, osVar5.c, 8, (wyc) osVar5.a, null));
                }
                List a2 = k.a(str2.length());
                int size6 = a2.size();
                for (int i35 = 0; i35 < size6; i35++) {
                    os osVar6 = (os) a2.get(i35);
                    fp6 fp6Var = (fp6) osVar6.a;
                    if (fp6Var instanceof ep6) {
                        arrayList.add(new ms(osVar6.b, osVar6.c, 8, (ep6) fp6Var, null));
                    } else if (fp6Var instanceof dp6) {
                        arrayList.add(new ms(osVar6.b, osVar6.c, 8, (dp6) fp6Var, null));
                    }
                }
                P5 = nsVar2.k();
                rv4Var.o0(P5);
            }
            ps psVar = (ps) P5;
            boolean f3 = rv4Var.f(D);
            if ((i12 & 458752) == 131072) {
                z7 = z5;
            } else {
                z7 = z6;
            }
            boolean z11 = f3 | z7;
            Object P6 = rv4Var.P();
            if (!z11 && P6 != obj3) {
                xt4Var7 = xt4Var5;
            } else {
                xt4Var7 = xt4Var5;
                P6 = new nq3(D, e34Var, xt4Var7, 16);
                rv4Var.o0(P6);
            }
            cvb.d(psVar, b2, j, 0L, 0L, null, 0L, 0, false, 0, 0, null, (xt4) P6, oybVar, rv4Var, 0, 0, 131064);
            xt4Var2 = xt4Var7;
        } else {
            rv4Var.X();
            xt4Var2 = obj;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: rn7
                @Override // defpackage.lu4
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    jce.n(wmc.this, i, i2, nq7Var, mu4Var, xt4Var2, (rv4) obj8, xoe.p(i3 | 1), i4);
                    return pvc.a;
                }
            };
        }
    }

    public static final void o(List list, nq7 nq7Var, lu4 lu4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        vt4 vt4Var2;
        kq7 kq7Var;
        lh9 lh9Var;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1659848749);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(lu4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
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
            F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            nq7 q = rte.q(s21.f(rv4Var2, p, npVar4, 1.0f, true), rte.u(rv4Var2), 14);
            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, q);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            F(npVar, rv4Var2, a3);
            F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            F(npVar4, rv4Var2, p2);
            rv4Var2.e0(1057685664);
            int size = list.size();
            int i7 = 0;
            while (true) {
                kq7Var = kq7.a;
                lh9Var = ax1.a;
                if (i7 >= size) {
                    break;
                }
                o3c o3cVar = (o3c) list.get(i7);
                String str = o3cVar.a;
                tza tzaVar = j27.a;
                oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.k;
                long j = ((h27) rv4Var2.j(tzaVar)).a.q;
                nq7 k = tte.k(kq7Var, ((h27) rv4Var2.j(tzaVar)).c.b);
                if ((i2 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean h2 = z3 | rv4Var2.h(o3cVar);
                Object P = rv4Var2.P();
                if (!h2 && P != lh9Var) {
                    z4 = true;
                } else {
                    z4 = true;
                    P = new mm7(1, lu4Var, o3cVar);
                    rv4Var2.o0(P);
                }
                cvb.c(str, zbe.z(lbe.f(15, (vt4) P, k, null, false), 8.0f, 2.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131064);
                i7++;
                rv4Var2 = rv4Var;
                i2 = i2;
            }
            int i8 = i2;
            rv4 rv4Var3 = rv4Var2;
            rv4Var3.q(false);
            rv4Var3.q(true);
            ar5 c2 = rp5.c((wk3) ok3.p0.getValue(), rv4Var3, 0);
            long j2 = ((h27) rv4Var3.j(j27.a)).a.q;
            nq7 k2 = tte.k(pna.n(zbe.C(kq7Var, 4.0f, nae.e, nae.e, nae.e, 14), 24.0f), uu9.a);
            if ((i8 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var3.P();
            if (!z2 && P2 != lh9Var) {
                vt4Var2 = vt4Var;
            } else {
                vt4Var2 = vt4Var;
                P2 = new on7(0, vt4Var2);
                rv4Var3.o0(P2);
            }
            rv4Var2 = rv4Var3;
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 4.0f), j2, rv4Var2, 48, 0);
            rv4Var2.q(true);
        } else {
            vt4Var2 = vt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new x90((Object) list, nq7Var, (hu4) lu4Var, (hu4) vt4Var2, i, 10);
        }
    }

    public static final void p(List list, nq7 nq7Var, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        xt4 xt4Var2;
        lh9 lh9Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        nk0 nk0Var;
        nk0 nk0Var2;
        int i4;
        boolean z7;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        List list2 = list;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var3 = kh5.c;
        nk0 nk0Var4 = kh5.e;
        rv4Var2.g0(512055462);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(list2);
            } else {
                h = rv4Var2.h(list2);
            }
            if (h) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(lu4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
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
            F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            nq7 q = rte.q(s21.f(rv4Var2, p, npVar4, 1.0f, true), rte.u(rv4Var2), 14);
            nk0 nk0Var5 = nk0Var3;
            gv9 a3 = ev9.a(dzVar, kh5.F, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, q);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            F(npVar, rv4Var2, a3);
            F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            F(npVar4, rv4Var2, p2);
            rv4Var2.e0(2040774038);
            int size = list2.size();
            int i9 = 0;
            while (true) {
                lh9Var = ax1.a;
                if (i9 >= size) {
                    break;
                }
                n3c n3cVar = (n3c) list2.get(i9);
                v72 v72Var = r0f.z(rv4Var2).b;
                kq7 kq7Var = kq7.a;
                nq7 h2 = pna.h(tte.k(kq7Var, v72Var), 30.0f);
                if ((i2 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean h3 = z6 | rv4Var2.h(n3cVar);
                Object P = rv4Var2.P();
                if (h3 || P == lh9Var) {
                    P = new qj7(lu4Var, n3cVar, 1);
                    rv4Var2.o0(P);
                }
                nq7 f = lbe.f(15, (vt4) P, h2, null, false);
                nk0 nk0Var6 = kh5.a;
                b37 d = fu0.d(nk0Var6, false);
                int hashCode3 = Long.hashCode(rv4Var2.T);
                xt8 l3 = rv4Var2.l();
                nq7 p3 = lye.p(rv4Var2, f);
                rw1.k.getClass();
                zx1 zx1Var2 = qw1.b;
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var2);
                } else {
                    rv4Var2.r0();
                }
                np npVar5 = qw1.f;
                F(npVar5, rv4Var2, d);
                np npVar6 = qw1.e;
                F(npVar6, rv4Var2, l3);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                np npVar7 = qw1.g;
                F(npVar7, rv4Var2, valueOf2);
                kg kgVar2 = qw1.h;
                C(kgVar2, rv4Var2);
                np npVar8 = qw1.d;
                F(npVar8, rv4Var2, p3);
                String str = n3cVar.a;
                int i10 = size;
                String str2 = n3cVar.a;
                int length = str.length();
                int i11 = i2;
                pu0 pu0Var = pu0.a;
                if (length > 0 && !c16.i(str2, "qt")) {
                    rv4Var2.e0(-1976584728);
                    i3 = i9;
                    nq7 p4 = pna.p(zbe.A(kq7Var, 4.0f, nae.e, 2), 40.0f, 30.0f);
                    b37 d2 = fu0.d(nk0Var6, false);
                    int hashCode4 = Long.hashCode(rv4Var2.T);
                    xt8 l4 = rv4Var2.l();
                    nq7 p5 = lye.p(rv4Var2, p4);
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var2);
                    } else {
                        rv4Var2.r0();
                    }
                    F(npVar5, rv4Var2, d2);
                    F(npVar6, rv4Var2, l4);
                    s21.t(hashCode4, rv4Var2, npVar7, rv4Var2, kgVar2);
                    F(npVar8, rv4Var2, p5);
                    nk0 nk0Var7 = nk0Var5;
                    do5.a(new h54(str2), r0f.d, false, null, null, null, tte.k(pna.n(pu0Var.a(kq7Var, nk0Var4), 20.0f), uu9.a), null, rv4Var, 805306416, 380);
                    cvb.c(n3cVar.c, pu0Var.a(kq7Var, nk0Var7), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).o, rv4Var, 0, 0, 131064);
                    rv4Var2 = rv4Var;
                    rv4Var2.q(true);
                    rv4Var2.q(false);
                    i4 = i11;
                    nk0Var2 = nk0Var4;
                    z7 = true;
                    nk0Var = nk0Var7;
                } else {
                    i3 = i9;
                    nk0 nk0Var8 = nk0Var5;
                    if (n3cVar.b.length() > 0) {
                        rv4Var2.e0(-1975342930);
                        nk0Var = nk0Var8;
                        nq7 A = zbe.A(pna.h(kq7Var, 30.0f), 4.0f, nae.e, 2);
                        b37 d3 = fu0.d(nk0Var6, false);
                        int hashCode5 = Long.hashCode(rv4Var2.T);
                        xt8 l5 = rv4Var2.l();
                        nq7 p6 = lye.p(rv4Var2, A);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var2);
                        } else {
                            rv4Var2.r0();
                        }
                        F(npVar5, rv4Var2, d3);
                        F(npVar6, rv4Var2, l5);
                        s21.t(hashCode5, rv4Var2, npVar7, rv4Var2, kgVar2);
                        F(npVar8, rv4Var2, p6);
                        nk0Var2 = nk0Var4;
                        i4 = i11;
                        cvb.c(n3cVar.b, zbe.A(pu0Var.a(kq7Var, nk0Var4), 4.0f, nae.e, 2), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).k, rv4Var, 0, 0, 131064);
                        cvb.c(n3cVar.c, pu0Var.a(kq7Var, nk0Var), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).o, rv4Var, 0, 0, 131064);
                        rv4Var2 = rv4Var;
                        rv4Var2.q(true);
                        rv4Var2.q(false);
                        z7 = true;
                    } else {
                        nk0Var = nk0Var8;
                        nk0Var2 = nk0Var4;
                        i4 = i11;
                        rv4Var2.e0(-1974238834);
                        String upperCase = n3cVar.c.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        cvb.c(upperCase, zbe.A(pu0Var.a(kq7Var, nk0Var2), 8.0f, nae.e, 2), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).k, rv4Var, 0, 0, 130040);
                        rv4Var2 = rv4Var;
                        rv4Var2.q(false);
                        z7 = true;
                    }
                }
                rv4Var2.q(z7);
                i9 = i3 + 1;
                nk0Var4 = nk0Var2;
                i2 = i4;
                size = i10;
                nk0Var5 = nk0Var;
                list2 = list;
            }
            boolean z8 = false;
            rv4Var2.q(false);
            rv4Var2.q(true);
            int i12 = i2 & 896;
            if (i12 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var2.P();
            if (!z2 && P2 != lh9Var) {
                xt4Var2 = xt4Var;
            } else {
                xt4Var2 = xt4Var;
                P2 = new in7(3, xt4Var2);
                rv4Var2.o0(P2);
            }
            a("aa", 0, null, (vt4) P2, rv4Var2, 54);
            if (i12 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P3 = rv4Var2.P();
            if (z3 || P3 == lh9Var) {
                P3 = new in7(4, xt4Var2);
                rv4Var2.o0(P3);
            }
            a("Aa", 1, null, (vt4) P3, rv4Var2, 54);
            if (i12 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P4 = rv4Var2.P();
            if (z4 || P4 == lh9Var) {
                P4 = new in7(5, xt4Var2);
                rv4Var2.o0(P4);
            }
            a("Aa", 2, null, (vt4) P4, rv4Var2, 54);
            if (i12 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P5 = rv4Var2.P();
            if (z5 || P5 == lh9Var) {
                P5 = new in7(6, xt4Var2);
                rv4Var2.o0(P5);
            }
            a("Aa", 0, null, (vt4) P5, rv4Var2, 54);
            if (i12 == 256) {
                z8 = true;
            }
            Object P6 = rv4Var2.P();
            if (z8 || P6 == lh9Var) {
                P6 = new in7(7, xt4Var2);
                rv4Var2.o0(P6);
            }
            a("AA", 0, null, (vt4) P6, rv4Var2, 54);
            rv4Var2.q(true);
        } else {
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new x90((Object) list, nq7Var, (hu4) xt4Var2, (hu4) lu4Var, i, 11);
        }
    }

    public static final void q(boolean z, final boolean z2, final boolean z3, final boolean z4, final nq7 nq7Var, lu4 lu4Var, final lu4 lu4Var2, final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        final boolean z6;
        final lu4 lu4Var3;
        boolean z7;
        boolean z8;
        np npVar;
        boolean z9;
        boolean z10;
        int i9;
        int i10;
        np npVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        rv4Var.g0(-1202240054);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (rv4Var.g(z3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i13 = i12 | i4;
        if (rv4Var.g(z4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (rv4Var.h(lu4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i6;
        if (rv4Var.h(lu4Var2)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i16 = i15 | i7;
        if (rv4Var.h(vt4Var)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i17 = i16 | i8;
        if ((i17 & 4793491) != 4793490) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (rv4Var.U(i17 & 1, z5)) {
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
            np npVar3 = qw1.f;
            F(npVar3, rv4Var, a2);
            np npVar4 = qw1.e;
            F(npVar4, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            F(npVar5, rv4Var, valueOf);
            kg kgVar = qw1.h;
            C(kgVar, rv4Var);
            np npVar6 = qw1.d;
            F(npVar6, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            F(npVar3, rv4Var, a3);
            F(npVar4, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar5, rv4Var, kgVar);
            nq7 q = rte.q(s21.f(rv4Var, p2, npVar6, 1.0f, true), rte.u(rv4Var), 14);
            mk0 mk0Var2 = kh5.F;
            gv9 a4 = ev9.a(dzVar, mk0Var2, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, q);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            F(npVar3, rv4Var, a4);
            F(npVar4, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar5, rv4Var, kgVar);
            F(npVar6, rv4Var, p3);
            nq7 d = st0.d(tte.k(kq7Var, r0f.z(rv4Var).b), 1.0f, rm1.g(r0f.y(rv4Var), 4.0f), r0f.z(rv4Var).b);
            gv9 a5 = ev9.a(dzVar, mk0Var2, rv4Var, 0);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, d);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            F(npVar3, rv4Var, a5);
            F(npVar4, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar5, rv4Var, kgVar);
            F(npVar6, rv4Var, p4);
            int i18 = i17 & 458752;
            if (i18 == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i19 = i17 & 896;
            if (i19 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z23 = z7 | z8;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (!z23 && P != lh9Var) {
                npVar = npVar5;
                lu4Var3 = lu4Var;
            } else {
                npVar = npVar5;
                lu4Var3 = lu4Var;
                P = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i20 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z24 = z3;
                        lu4 lu4Var4 = lu4Var3;
                        switch (i20) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z24));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z24));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z24));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z24));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z24), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z24), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z24), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z24), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P);
            }
            vt4 vt4Var2 = (vt4) P;
            int i20 = 3670016 & i17;
            if (i20 == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i21 = i17 & 7168;
            if (i21 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z24 = z9 | z10;
            Object P2 = rv4Var.P();
            if (!z24 && P2 != lh9Var) {
                i9 = i17;
                i10 = i21;
                npVar2 = npVar4;
            } else {
                i9 = i17;
                i10 = i21;
                npVar2 = npVar4;
                P2 = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i202 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z242 = z4;
                        lu4 lu4Var4 = lu4Var2;
                        switch (i202) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P2);
            }
            int i22 = i9 & Token.ASSIGN_MOD;
            int i23 = i10;
            i("NE", z2, z, null, vt4Var2, (vt4) P2, rv4Var, i22 | 6 | ((i9 << 6) & 896));
            boolean z25 = !z2;
            boolean z26 = !z;
            if (i18 == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i19 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z27 = z12 | z11;
            Object P3 = rv4Var.P();
            if (z27 || P3 == lh9Var) {
                P3 = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i202 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z242 = z3;
                        lu4 lu4Var4 = lu4Var3;
                        switch (i202) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P3);
            }
            vt4 vt4Var3 = (vt4) P3;
            if (i20 == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i23 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z28 = z14 | z13;
            Object P4 = rv4Var.P();
            if (z28 || P4 == lh9Var) {
                P4 = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i202 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z242 = z4;
                        lu4 lu4Var4 = lu4Var2;
                        switch (i202) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P4);
            }
            z6 = z;
            i("VP", z25, z26, null, vt4Var3, (vt4) P4, rv4Var, 6);
            s21.x(rv4Var, true, kq7Var, 8.0f, rv4Var);
            nq7 d2 = st0.d(tte.k(kq7Var, r0f.z(rv4Var).b), 1.0f, rm1.g(r0f.y(rv4Var), 4.0f), r0f.z(rv4Var).b);
            gv9 a6 = ev9.a(dzVar, mk0Var2, rv4Var, 0);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, d2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            F(npVar3, rv4Var, a6);
            F(npVar2, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar, rv4Var, kgVar);
            F(npVar6, rv4Var, p5);
            String A = yqe.A((y3b) b3b.k.getValue(), rv4Var);
            if (i18 == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            int i24 = i9 & 14;
            if (i24 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z29 = z15 | z16;
            Object P5 = rv4Var.P();
            if (z29 || P5 == lh9Var) {
                P5 = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i202 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z242 = z6;
                        lu4 lu4Var4 = lu4Var3;
                        switch (i202) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P5);
            }
            vt4 vt4Var4 = (vt4) P5;
            if (i20 == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i22 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z30 = z17 | z18;
            Object P6 = rv4Var.P();
            if (z30 || P6 == lh9Var) {
                P6 = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i202 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z242 = z2;
                        lu4 lu4Var4 = lu4Var2;
                        switch (i202) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P6);
            }
            i(A, z4, z3, null, vt4Var4, (vt4) P6, rv4Var, ((i9 >> 6) & Token.ASSIGN_MOD) | i19);
            String A2 = yqe.A((y3b) s2b.q0.getValue(), rv4Var);
            boolean z31 = !z4;
            boolean z32 = !z3;
            if (i18 == 131072) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (i24 == 4) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean z33 = z19 | z20;
            Object P7 = rv4Var.P();
            if (z33 || P7 == lh9Var) {
                P7 = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i202 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z242 = z6;
                        lu4 lu4Var4 = lu4Var3;
                        switch (i202) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P7);
            }
            vt4 vt4Var5 = (vt4) P7;
            if (i20 == 1048576) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (i22 == 32) {
                z22 = true;
            } else {
                z22 = false;
            }
            boolean z34 = z21 | z22;
            Object P8 = rv4Var.P();
            if (z34 || P8 == lh9Var) {
                P8 = new vt4() { // from class: mn7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i202 = r3;
                        pvc pvcVar = pvc.a;
                        boolean z242 = z2;
                        lu4 lu4Var4 = lu4Var2;
                        switch (i202) {
                            case 0:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 1:
                                lu4Var4.invoke(Boolean.TRUE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 2:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 3:
                                lu4Var4.invoke(Boolean.FALSE, Boolean.valueOf(z242));
                                return pvcVar;
                            case 4:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 5:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.TRUE);
                                return pvcVar;
                            case 6:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                            default:
                                lu4Var4.invoke(Boolean.valueOf(z242), Boolean.FALSE);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P8);
            }
            i(A2, z31, z32, null, vt4Var5, (vt4) P8, rv4Var, 0);
            hl5.v(rv4Var, true, true, true);
            z1d.f(rp5.c((wk3) ok3.j0.getValue(), rv4Var, 0), yqe.A((y3b) z1b.q0.getValue(), rv4Var), false, null, hl5.f(kq7Var, 8.0f, rv4Var, kq7Var, 1.0f), null, null, null, vt4Var, rv4Var, (234881024 & (i9 << 3)) | 24576, 236);
            rv4Var.q(true);
        } else {
            z6 = z;
            lu4Var3 = lu4Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final lu4 lu4Var4 = lu4Var3;
            final boolean z35 = z6;
            u.d = new lu4(z35, z2, z3, z4, nq7Var, lu4Var4, lu4Var2, vt4Var, i) { // from class: nn7
                public final /* synthetic */ lu4 C;
                public final /* synthetic */ vt4 D;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ nq7 e;
                public final /* synthetic */ lu4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p6 = xoe.p(24577);
                    jce.q(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, (rv4) obj, p6);
                    return pvc.a;
                }
            };
        }
    }

    public static final void r(List list, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        kq7 kq7Var;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-606963875);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
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
            F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            nq7 q = rte.q(s21.f(rv4Var2, p, npVar4, 1.0f, true), rte.u(rv4Var2), 14);
            gv9 a3 = ev9.a(dzVar, kh5.F, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, q);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            F(npVar, rv4Var2, a3);
            F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            F(npVar4, rv4Var2, p2);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var2.f(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            ArrayList arrayList = P;
            if (z2 || P == lh9Var) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (hashSet.add(((r3c) obj).a)) {
                        arrayList2.add(obj);
                    }
                }
                rv4Var2.o0(arrayList2);
                arrayList = arrayList2;
            }
            List list2 = (List) arrayList;
            rv4Var2.e0(742190271);
            int size = list2.size();
            int i7 = 0;
            while (true) {
                kq7Var = kq7.a;
                if (i7 >= size) {
                    break;
                }
                r3c r3cVar = (r3c) list2.get(i7);
                String str = r3cVar.a;
                tza tzaVar = j27.a;
                oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.k;
                long j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
                int i8 = size;
                nq7 k = tte.k(zbe.A(kq7Var, 3.0f, nae.e, 2), ((h27) rv4Var.j(tzaVar)).c.a);
                int i9 = r3cVar.b;
                List list3 = list2;
                if (i9 != 1) {
                    if (i9 != 2) {
                        rv4Var.e0(1380049734);
                        j = ((h27) rv4Var.j(tzaVar)).a.q;
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(1380047519);
                        rv4Var.q(false);
                        j = bb9.a;
                    }
                } else {
                    rv4Var.e0(1380045215);
                    rv4Var.q(false);
                    j = bb9.b;
                }
                nq7 d = st0.d(k, 1.0f, zl1.b(0.5f, j), ((h27) rv4Var.j(tzaVar)).c.a);
                if ((i2 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean h2 = z4 | rv4Var.h(r3cVar);
                Object P2 = rv4Var.P();
                if (!h2 && P2 != lh9Var) {
                    z5 = false;
                } else {
                    z5 = false;
                    P2 = new sn7(xt4Var, r3cVar, 0);
                    rv4Var.o0(P2);
                }
                cvb.c(str, zbe.z(lbe.f(15, (vt4) P2, d, null, z5), 8.0f, 2.0f), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131064);
                i7++;
                i2 = i2;
                rv4Var2 = rv4Var;
                size = i8;
                list2 = list3;
                lh9Var = lh9Var;
            }
            int i10 = i2;
            lh9 lh9Var2 = lh9Var;
            rv4 rv4Var3 = rv4Var2;
            rv4Var3.q(false);
            rv4Var3.q(true);
            ar5 c2 = rp5.c((wk3) ok3.l0.getValue(), rv4Var3, 0);
            long j3 = ((h27) rv4Var3.j(j27.a)).a.q;
            nq7 k2 = tte.k(pna.n(zbe.C(kq7Var, 4.0f, nae.e, nae.e, nae.e, 14), 24.0f), uu9.a);
            if ((i10 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P3 = rv4Var3.P();
            if (z3 || P3 == lh9Var2) {
                P3 = new on7(1, vt4Var);
                rv4Var3.o0(P3);
            }
            rv4Var2 = rv4Var;
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P3, k2, null, false), 4.0f), j3, rv4Var2, 48, 0);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new il7(list, nq7Var, xt4Var, vt4Var, i, 1);
        }
    }

    public static final void s(String str, List list, nq7 nq7Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        int i7;
        rv4Var.g0(-1296763688);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(lu4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            Object obj2 = P;
            if (P == obj) {
                ora oraVar = new ora();
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    oraVar.add(new rg3(nae.e));
                }
                rv4Var.o0(oraVar);
                obj2 = oraVar;
            }
            ora oraVar2 = (ora) obj2;
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & Token.ASSIGN_MOD) != 32 && ((i2 & 64) == 0 || !rv4Var.f(list))) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P2 = rv4Var.P();
            if (z4 || P2 == obj) {
                Iterator it = list.iterator();
                int i9 = 0;
                while (true) {
                    if (it.hasNext()) {
                        n3c n3cVar = (n3c) it.next();
                        if ((n3cVar.a + "-" + n3cVar.c).equals(str)) {
                            break;
                        }
                        i9++;
                    } else {
                        i9 = -1;
                        break;
                    }
                }
                Integer valueOf = Integer.valueOf(i9);
                if (i9 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i3 = valueOf.intValue();
                } else {
                    i3 = 0;
                }
                P2 = Integer.valueOf(i3);
                rv4Var.o0(P2);
            }
            int intValue = ((Number) P2).intValue();
            d3a.c(intValue, nq7Var, zl1.h, 0L, nae.e, E(870757368, new qe1(intValue, oraVar2, 2), rv4Var), w92.a, E(1977795064, new va(list, intValue, lu4Var, oraVar2), rv4Var), rv4Var, ((i2 >> 3) & Token.ASSIGN_MOD) | 14377344, 8);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(str, list, nq7Var, lu4Var, i, 12);
        }
    }

    public static final void t(ns nsVar, long j, int i, int i2) {
        nsVar.a("underline_span", i, i2, zve.h(new zl1(j)));
    }

    public static final int u(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final tu1 v(rv4 rv4Var, int i, fb6 fb6Var) {
        tu1 tu1Var;
        rv4Var.b0(Integer.rotateLeft(i, 1), a);
        Object P = rv4Var.P();
        if (P == ax1.a) {
            tu1Var = new tu1(fb6Var, true, i);
            rv4Var.o0(tu1Var);
        } else {
            P.getClass();
            tu1Var = (tu1) P;
            tu1Var.p(fb6Var);
        }
        rv4Var.q(false);
        return tu1Var;
    }

    public static px4 w(String str, String str2) {
        Exception p;
        try {
            ox4 ox4Var = new ox4(new x(26), (String) null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                p = ase.p(new x(0), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                p = ase.p(new x(1), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_DATA_CLONE_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                p = ase.p(new x(3), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                p = ase.p(new x(4), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                p = ase.p(new x(10), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_NAMESPACE_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                p = ase.p(new x(12), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                p = ase.p(new x(14), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_NOT_FOUND_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                p = ase.p(new x(16), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                p = ase.p(new x(17), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_OPERATION_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_OPT_OUT_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_READ_ONLY_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                p = ase.p(new x(22), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_SYNTAX_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                p = ase.p(new x(24), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                p = ase.p(new x(26), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_VERSION_ERROR"), str2, ox4Var);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                p = ase.p(new x("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), str2, ox4Var);
            } else {
                throw new Exception();
            }
            return (px4) p;
        } catch (ft4 unused) {
            return new ox4(0, str2, str);
        }
    }

    public static final void x(rv4 rv4Var, Integer num, lu4 lu4Var) {
        if (rv4Var.S) {
            rv4Var.b(num, lu4Var);
        }
    }

    public static final pu7 z(q5... q5VarArr) {
        ArrayList arrayList = new ArrayList(q5VarArr.length);
        if (q5VarArr.length <= 0) {
            yk8[] yk8VarArr = (yk8[]) arrayList.toArray(new yk8[0]);
            return new pu7(o17.t((yk8[]) Arrays.copyOf(yk8VarArr, yk8VarArr.length)));
        }
        q5 q5Var = q5VarArr[0];
        throw null;
    }

    public boolean y() {
        throw null;
    }
}
