package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pc2  reason: default package */
/* loaded from: classes3.dex */
public abstract class pc2 {
    public static Context b;
    public static Bundle c;
    public static ar5 i;
    public static final Object a = new Object();
    public static final int[] d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final tu1 f = new tu1(new lv1(26), false, 957826603);
    public static final tu1 g = new tu1(new lv1(27), false, 931185600);
    public static final tu1 h = new tu1(new lv1(28), false, 58775038);

    public static final void a(ar5 ar5Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        ar5Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-850562787);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(ar5Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i7 | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i4 |= i6;
        }
        boolean z2 = true;
        if ((i4 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            if (i8 != 0) {
                nq7Var = kq7.a;
            }
            nq7 n = pna.n(nq7Var, 32.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            if ((i4 & 896) != 256) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new pp1(7, vt4Var);
                rv4Var.o0(P);
            }
            nq7 f2 = lbe.f(15, (vt4) P, k, null, false);
            tza tzaVar = j27.a;
            nk5.a(ar5Var, null, zbe.y(nmd.v(zbe.y(nmd.v(f2, rm1.g(((h27) rv4Var.j(tzaVar)).a, 16.0f), lre.g), 1.0f), rm1.g(((h27) rv4Var.j(tzaVar)).a, 8.0f), su9Var), 6.0f), ((h27) rv4Var.j(tzaVar)).a.q, rv4Var, (i4 & 14) | 48, 0);
        } else {
            rv4Var.X();
        }
        nq7 nq7Var2 = nq7Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qu0(ar5Var, nq7Var2, vt4Var, i2, i3);
        }
    }

    public static final uy5 b(long j, long j2) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        return new uy5(i2, i3, ((int) (j2 >> 32)) + i2, ((int) (j2 & 4294967295L)) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.nq7 r26, defpackage.kj6 r27, defpackage.rh8 r28, defpackage.jz r29, defpackage.lk0 r30, defpackage.li4 r31, boolean r32, defpackage.rh8 r33, long r34, long r36, float r38, defpackage.xt4 r39, defpackage.rv4 r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.c(nq7, kj6, rh8, jz, lk0, li4, boolean, rh8, long, long, float, xt4, rv4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.f25 r27, defpackage.nq7 r28, defpackage.qg6 r29, final defpackage.rh8 r30, defpackage.jz r31, defpackage.fz r32, defpackage.li4 r33, boolean r34, long r35, long r37, final defpackage.rh8 r39, float r40, final defpackage.xt4 r41, defpackage.rv4 r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.d(f25, nq7, qg6, rh8, jz, fz, li4, boolean, long, long, rh8, float, xt4, rv4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.bya r24, defpackage.nq7 r25, defpackage.nk6 r26, defpackage.rh8 r27, float r28, defpackage.fz r29, defpackage.li4 r30, boolean r31, long r32, long r34, defpackage.rh8 r36, defpackage.xt4 r37, defpackage.rv4 r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.e(bya, nq7, nk6, rh8, float, fz, li4, boolean, long, long, rh8, xt4, rv4, int, int, int):void");
    }

    public static final void f(e6c e6cVar, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        long j;
        pm1 pm1Var;
        e6cVar.getClass();
        rv4Var.g0(281643902);
        if (rv4Var.f(e6cVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            boolean z2 = e6cVar.a;
            Object obj = ax1.a;
            if (z2) {
                rv4Var.e0(-1912438021);
                pm1Var = ((h27) rv4Var.j(j27.a)).a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1912383461);
                long j2 = e6cVar.c;
                long j3 = e6cVar.d;
                if (e6cVar.b) {
                    rv4Var.e0(76864773);
                    j = ((h27) rv4Var.j(j27.a)).a.a;
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(76865741);
                    rv4Var.q(false);
                    j = e6cVar.d;
                }
                long j4 = j;
                boolean z3 = !kve.w(j3);
                boolean e2 = rv4Var.e(j2) | rv4Var.e(j3);
                Object P = rv4Var.P();
                if (e2 || P == obj) {
                    rm3.a.getClass();
                    P = pm1.a(tl1.u(j4, z3, false, dl8.a, 0.0d, xm1.d, rm3.b, null), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, j3, j2, j3, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122881, 65535);
                    rv4Var.o0(P);
                }
                pm1Var = (pm1) P;
                rv4Var.q(false);
            }
            vfb vfbVar = (vfb) rv4Var.j(nm3.b);
            boolean e3 = rv4Var.e(pm1Var.p);
            Object P2 = rv4Var.P();
            if (e3 || P2 == obj) {
                P2 = Boolean.valueOf(kve.w(pm1Var.p));
                rv4Var.o0(P2);
            }
            Boolean bool = (Boolean) P2;
            boolean booleanValue = bool.booleanValue();
            boolean f2 = rv4Var.f(vfbVar) | rv4Var.g(booleanValue);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                P3 = new mm3(vfbVar, booleanValue, null, 1);
                rv4Var.o0(P3);
            }
            yte.g((lu4) P3, rv4Var, bool);
            lzb lzbVar = (lzb) rv4Var.j(e1c.a);
            boolean f3 = rv4Var.f(lzbVar) | rv4Var.f(pm1Var);
            Object P4 = rv4Var.P();
            if (f3 || P4 == obj) {
                P4 = new as8(lzbVar, pm1Var, 1);
                rv4Var.o0(P4);
            }
            yte.b(pm1Var, (xt4) P4, rv4Var);
            j27.b(pm1Var, ofa.a, nm3.d(e6cVar.f, rv4Var), jce.E(840308306, new x0a(tu1Var, 16), rv4Var), rv4Var, 3072, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new f58(e6cVar, tu1Var, i2, 20);
        }
    }

    public static final void g(final ubd ubdVar, final cz7 cz7Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2;
        aw7 aw7Var;
        aw7 aw7Var2;
        aw7 aw7Var3;
        kn6 kn6Var;
        cz7Var.getClass();
        rv4Var.g0(-979801812);
        if (rv4Var.f(ubdVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.f(cz7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            final aw7 z2 = jsc.z(ubdVar.R, rv4Var);
            dxe.l(((s6d) z2.getValue()).b, true, ((s6d) z2.getValue()).t, ((s6d) z2.getValue()).u, rv4Var, 48);
            rv4Var2 = rv4Var;
            final aw7 z3 = jsc.z(ubdVar.S, rv4Var2);
            final aw7 z4 = jsc.z(ubdVar.T, rv4Var2);
            final aw7 z5 = jsc.z(ubdVar.U, rv4Var2);
            final aw7 z6 = jsc.z(ubdVar.V, rv4Var2);
            Object[] objArr = new Object[0];
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new tvc(28);
                rv4Var2.o0(P);
            }
            final aw7 aw7Var4 = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new tvc(29);
                rv4Var2.o0(P2);
            }
            final aw7 aw7Var5 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var2, 48);
            Object[] objArr3 = new Object[0];
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                P3 = new u6d(0);
                rv4Var2.o0(P3);
            }
            aw7 aw7Var6 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var2, 48);
            Object[] objArr4 = new Object[0];
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var) {
                P4 = new u6d(2);
                rv4Var2.o0(P4);
            }
            aw7 aw7Var7 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var2, 48);
            Object[] objArr5 = new Object[0];
            Object P5 = rv4Var2.P();
            if (P5 == lh9Var) {
                P5 = new u6d(3);
                rv4Var2.o0(P5);
            }
            aw7 aw7Var8 = (aw7) zpe.k(objArr5, (vt4) P5, rv4Var2, 48);
            nid f2 = gwe.f(rv4Var2);
            boolean f3 = rv4Var2.f(f2);
            Object P6 = rv4Var2.P();
            if (f3 || P6 == lh9Var) {
                P6 = yae.q(new imb(f2, 16));
                rv4Var2.o0(P6);
            }
            final yya yyaVar = (yya) P6;
            vfb vfbVar = (vfb) rv4Var2.j(nm3.b);
            Boolean bool = (Boolean) aw7Var6.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) aw7Var7.getValue();
            bool2.getClass();
            Boolean bool3 = (Boolean) aw7Var8.getValue();
            bool3.getClass();
            boolean f4 = rv4Var2.f(aw7Var6) | rv4Var2.f(aw7Var7) | rv4Var2.f(aw7Var8) | rv4Var2.f(vfbVar);
            Object P7 = rv4Var2.P();
            if (!f4 && P7 != lh9Var) {
                aw7Var = aw7Var8;
                aw7Var2 = aw7Var7;
                aw7Var3 = aw7Var6;
            } else {
                aw7Var = aw7Var8;
                aw7Var2 = aw7Var7;
                aw7Var3 = aw7Var6;
                P7 = new ca(vfbVar, aw7Var3, aw7Var2, aw7Var, null, 10);
                rv4Var2.o0(P7);
            }
            yte.i(bool, bool2, bool3, (lu4) P7, rv4Var2);
            kb kbVar = (kb) rv4Var2.j(yb.a);
            sac sacVar = (sac) rv4Var2.j(uac.a);
            s02 s02Var = ubdVar.Q;
            boolean f5 = rv4Var2.f(sacVar) | rv4Var2.f(kbVar) | rv4Var2.f(z3);
            Object P8 = rv4Var2.P();
            if (!f5 && P8 != lh9Var) {
                kn6Var = null;
            } else {
                P8 = new zp0(sacVar, kbVar, (yya) z3, (m42) null, 5);
                kn6Var = null;
                rv4Var2.o0(P8);
            }
            jye.b(s02Var, kn6Var, (mu4) P8, rv4Var2, 0);
            b37 d2 = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            final aw7 aw7Var9 = aw7Var3;
            final aw7 aw7Var10 = aw7Var2;
            final aw7 aw7Var11 = aw7Var;
            pye.a(i9d.a.a(((iaa) ubdVar).Z), jce.E(-557118682, new lu4() { // from class: x6d
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z7;
                    String str;
                    int i7;
                    Object obj3;
                    final ubd ubdVar2;
                    vt4 vt4Var;
                    aw7 aw7Var12;
                    ubd ubdVar3;
                    char c2;
                    boolean z8;
                    Object obj4;
                    rv4 rv4Var3 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (rv4Var3.U(intValue & 1, z7)) {
                        yya yyaVar2 = z6;
                        xic xicVar = ((fbd) yyaVar2.getValue()).f;
                        Object P9 = rv4Var3.P();
                        Object obj5 = ax1.a;
                        if (P9 == obj5) {
                            P9 = new gcd();
                            rv4Var3.o0(P9);
                        }
                        final gcd gcdVar = (gcd) P9;
                        aw7 z9 = jsc.z(gcdVar.m, rv4Var3);
                        aw7 z10 = jsc.z(gcdVar.l, rv4Var3);
                        aw7 z11 = jsc.z(gcdVar.h, rv4Var3);
                        yya yyaVar3 = z4;
                        boolean d3 = rv4Var3.d(((c8d) yyaVar3.getValue()).a) | rv4Var3.f(xicVar) | rv4Var3.d(((fbd) yyaVar2.getValue()).e);
                        Object P10 = rv4Var3.P();
                        if (d3 || P10 == obj5) {
                            int i8 = ((c8d) yyaVar3.getValue()).a;
                            int i9 = ((fbd) yyaVar2.getValue()).e;
                            if (xicVar != null) {
                                str = xicVar.b;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                i7 = str.hashCode();
                            } else {
                                i7 = 0;
                            }
                            P10 = i8 + "_" + i9 + "_" + i7;
                            rv4Var3.o0(P10);
                        }
                        String str2 = (String) P10;
                        boolean f6 = rv4Var3.f(str2);
                        Object P11 = rv4Var3.P();
                        if (f6 || P11 == obj5) {
                            P11 = yae.z(null);
                            rv4Var3.o0(P11);
                        }
                        aw7 aw7Var13 = (aw7) P11;
                        boolean f7 = rv4Var3.f(str2);
                        Object P12 = rv4Var3.P();
                        if (f7 || P12 == obj5) {
                            P12 = yae.z(Boolean.FALSE);
                            rv4Var3.o0(P12);
                        }
                        aw7 aw7Var14 = (aw7) P12;
                        boolean f8 = rv4Var3.f(str2);
                        Object P13 = rv4Var3.P();
                        if (f8 || P13 == obj5) {
                            P13 = yae.z(Boolean.FALSE);
                            rv4Var3.o0(P13);
                        }
                        aw7 aw7Var15 = (aw7) P13;
                        Object P14 = rv4Var3.P();
                        if (P14 == obj5) {
                            P14 = yae.z(Boolean.FALSE);
                            rv4Var3.o0(P14);
                        }
                        aw7 aw7Var16 = (aw7) P14;
                        aw7 aw7Var17 = z2;
                        s6d s6dVar = (s6d) aw7Var17.getValue();
                        double d4 = ((c8d) yyaVar3.getValue()).d;
                        long longValue = ((Number) z11.getValue()).longValue();
                        Long l2 = (Long) aw7Var13.getValue();
                        boolean booleanValue = ((Boolean) aw7Var14.getValue()).booleanValue();
                        boolean booleanValue2 = ((Boolean) aw7Var16.getValue()).booleanValue();
                        boolean f9 = rv4Var3.f(aw7Var14);
                        Object P15 = rv4Var3.P();
                        if (f9 || P15 == obj5) {
                            P15 = new ozc(aw7Var14, 14);
                            rv4Var3.o0(P15);
                        }
                        xt4 xt4Var = (xt4) P15;
                        boolean f10 = rv4Var3.f(aw7Var13);
                        Object P16 = rv4Var3.P();
                        if (f10 || P16 == obj5) {
                            P16 = new ozc(aw7Var13, 8);
                            rv4Var3.o0(P16);
                        }
                        xt4 xt4Var2 = (xt4) P16;
                        Object P17 = rv4Var3.P();
                        if (P17 == obj5) {
                            P17 = new ozc(aw7Var16, 10);
                            rv4Var3.o0(P17);
                        }
                        xt4 xt4Var3 = (xt4) P17;
                        Object obj6 = ubd.this;
                        boolean f11 = rv4Var3.f(obj6);
                        Object P18 = rv4Var3.P();
                        if (f11 || P18 == obj5) {
                            P18 = new xe1(2, obj6, ubd.class, "saveLastReadProgress", "saveLastReadProgress(JJ)V", 0, 14);
                            rv4Var3.o0(P18);
                        }
                        lu4 lu4Var = (lu4) ((i76) P18);
                        boolean f12 = rv4Var3.f(obj6);
                        Object P19 = rv4Var3.P();
                        if (f12 || P19 == obj5) {
                            P19 = new vja(0, obj6, ubd.class, "onPlaybackFinished", "onPlaybackFinished()V", 0, 23);
                            rv4Var3.o0(P19);
                        }
                        vt4 vt4Var2 = (vt4) ((i76) P19);
                        boolean f13 = rv4Var3.f(obj6);
                        Object P20 = rv4Var3.P();
                        if (!f13 && P20 != obj5) {
                            obj3 = obj6;
                        } else {
                            obj3 = obj6;
                            P20 = new y6d(1, obj3, ubd.class, "changeVolume", "changeVolume(F)V", 0, 3);
                            rv4Var3.o0(P20);
                        }
                        Object obj7 = obj3;
                        pc2.i(gcdVar, xicVar, s6dVar, str2, d4, longValue, l2, booleanValue, booleanValue2, xt4Var, xt4Var2, xt4Var3, lu4Var, vt4Var2, (xt4) ((i76) P20), rv4Var3, 0);
                        fbd fbdVar = (fbd) yyaVar2.getValue();
                        s6d s6dVar2 = (s6d) aw7Var17.getValue();
                        boolean booleanValue3 = ((Boolean) z9.getValue()).booleanValue();
                        boolean booleanValue4 = ((Boolean) z10.getValue()).booleanValue();
                        boolean f14 = rv4Var3.f(obj7);
                        Object P21 = rv4Var3.P();
                        if (!f14 && P21 != obj5) {
                            ubdVar2 = obj7;
                        } else {
                            P21 = new xe1(2, obj7, ubd.class, "saveLastReadProgress", "saveLastReadProgress(JJ)V", 0, 15);
                            ubdVar2 = obj7;
                            rv4Var3.o0(P21);
                        }
                        pc2.h(gcdVar, xicVar, fbdVar, s6dVar2, booleanValue3, booleanValue4, (lu4) ((i76) P21), rv4Var3, 0);
                        yya yyaVar4 = yyaVar;
                        boolean booleanValue5 = ((Boolean) yyaVar4.getValue()).booleanValue();
                        s6d s6dVar3 = (s6d) aw7Var17.getValue();
                        yya yyaVar5 = z3;
                        String str3 = ((p6d) yyaVar5.getValue()).b;
                        String str4 = ((c8d) yyaVar3.getValue()).b;
                        fbd fbdVar2 = (fbd) yyaVar2.getValue();
                        aw7 aw7Var18 = aw7Var10;
                        boolean booleanValue6 = ((Boolean) aw7Var18.getValue()).booleanValue();
                        aw7 aw7Var19 = aw7Var9;
                        boolean booleanValue7 = ((Boolean) aw7Var19.getValue()).booleanValue();
                        aw7 aw7Var20 = aw7Var4;
                        boolean booleanValue8 = ((Boolean) aw7Var20.getValue()).booleanValue();
                        aw7 aw7Var21 = aw7Var5;
                        boolean booleanValue9 = ((Boolean) aw7Var21.getValue()).booleanValue();
                        aw7 aw7Var22 = aw7Var11;
                        boolean booleanValue10 = ((Boolean) aw7Var22.getValue()).booleanValue();
                        Long l3 = (Long) aw7Var13.getValue();
                        boolean booleanValue11 = ((Boolean) aw7Var15.getValue()).booleanValue();
                        boolean f15 = rv4Var3.f(aw7Var15);
                        Object P22 = rv4Var3.P();
                        if (f15 || P22 == obj5) {
                            P22 = new ozc(aw7Var15, 11);
                            rv4Var3.o0(P22);
                        }
                        xt4 xt4Var4 = (xt4) P22;
                        Object obj8 = cz7Var;
                        boolean f16 = rv4Var3.f(obj8);
                        Object P23 = rv4Var3.P();
                        if (f16 || P23 == obj5) {
                            P23 = new vja(0, obj8, cz7.class, "navigateUp", "navigateUp()V", 0, 24);
                            rv4Var3.o0(P23);
                        }
                        vt4 vt4Var3 = (vt4) ((i76) P23);
                        boolean f17 = rv4Var3.f(aw7Var18);
                        Object P24 = rv4Var3.P();
                        if (f17 || P24 == obj5) {
                            P24 = new clc(aw7Var18, 9);
                            rv4Var3.o0(P24);
                        }
                        vt4 vt4Var4 = (vt4) P24;
                        boolean f18 = rv4Var3.f(aw7Var22);
                        Object P25 = rv4Var3.P();
                        if (!f18 && P25 != obj5) {
                            vt4Var = vt4Var4;
                        } else {
                            vt4Var = vt4Var4;
                            P25 = new clc(aw7Var22, 10);
                            rv4Var3.o0(P25);
                        }
                        vt4 vt4Var5 = (vt4) P25;
                        boolean f19 = rv4Var3.f(aw7Var19);
                        Object P26 = rv4Var3.P();
                        if (f19 || P26 == obj5) {
                            P26 = new clc(aw7Var19, 11);
                            rv4Var3.o0(P26);
                        }
                        vt4 vt4Var6 = (vt4) P26;
                        boolean f20 = rv4Var3.f(aw7Var13);
                        Object P27 = rv4Var3.P();
                        if (!f20 && P27 != obj5) {
                            aw7Var12 = aw7Var22;
                        } else {
                            aw7Var12 = aw7Var22;
                            P27 = new ozc(aw7Var13, 12);
                            rv4Var3.o0(P27);
                        }
                        xt4 xt4Var5 = (xt4) P27;
                        boolean f21 = rv4Var3.f(ubdVar2);
                        Object P28 = rv4Var3.P();
                        if (f21 || P28 == obj5) {
                            P28 = new vqc(1, ubdVar2, ubd.class, "changePlaybackSpeed", "changePlaybackSpeed(F)V", 0, 5);
                            rv4Var3.o0(P28);
                        }
                        xt4 xt4Var6 = (xt4) ((i76) P28);
                        boolean f22 = rv4Var3.f(ubdVar2);
                        Object P29 = rv4Var3.P();
                        if (f22 || P29 == obj5) {
                            P29 = new vja(0, ubdVar2, ubd.class, "readNextEpisode", "readNextEpisode()V", 0, 20);
                            rv4Var3.o0(P29);
                        }
                        vt4 vt4Var7 = (vt4) ((i76) P29);
                        boolean f23 = rv4Var3.f(ubdVar2);
                        Object P30 = rv4Var3.P();
                        if (f23 || P30 == obj5) {
                            P30 = new vja(0, ubdVar2, ubd.class, "readPrevEpisode", "readPrevEpisode()V", 0, 21);
                            rv4Var3.o0(P30);
                        }
                        vt4 vt4Var8 = (vt4) ((i76) P30);
                        boolean f24 = rv4Var3.f(ubdVar2);
                        Object P31 = rv4Var3.P();
                        if (f24 || P31 == obj5) {
                            P31 = new vqc(1, ubdVar2, ubd.class, "changeScreenOrientation", "changeScreenOrientation(I)V", 0, 6);
                            rv4Var3.o0(P31);
                        }
                        xt4 xt4Var7 = (xt4) ((i76) P31);
                        boolean f25 = rv4Var3.f(ubdVar2);
                        Object P32 = rv4Var3.P();
                        if (f25 || P32 == obj5) {
                            P32 = new vqc(1, ubdVar2, ubd.class, "changeBrightness", "changeBrightness(F)V", 0, 7);
                            rv4Var3.o0(P32);
                        }
                        xt4 xt4Var8 = (xt4) ((i76) P32);
                        boolean f26 = rv4Var3.f(gcdVar) | rv4Var3.f(ubdVar2);
                        Object P33 = rv4Var3.P();
                        if (f26 || P33 == obj5) {
                            P33 = new xt4() { // from class: t6d
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj9) {
                                    int i10 = r3;
                                    pvc pvcVar = pvc.a;
                                    ubd ubdVar4 = ubdVar2;
                                    gcd gcdVar2 = gcdVar;
                                    Float f27 = (Float) obj9;
                                    switch (i10) {
                                        case 0:
                                            float floatValue = f27.floatValue();
                                            gcdVar2.p = f27;
                                            j9d j9dVar = gcdVar2.n;
                                            if (j9dVar != null) {
                                                j9dVar.k(floatValue);
                                            }
                                            ubdVar4.k(floatValue);
                                            return pvcVar;
                                        default:
                                            float floatValue2 = f27.floatValue();
                                            gcdVar2.p = f27;
                                            j9d j9dVar2 = gcdVar2.n;
                                            if (j9dVar2 != null) {
                                                j9dVar2.k(floatValue2);
                                            }
                                            ubdVar4.k(floatValue2);
                                            return pvcVar;
                                    }
                                }
                            };
                            rv4Var3.o0(P33);
                        }
                        xt4 xt4Var9 = (xt4) P33;
                        boolean f27 = rv4Var3.f(ubdVar2);
                        Object P34 = rv4Var3.P();
                        if (f27 || P34 == obj5) {
                            P34 = new vqc(1, ubdVar2, ubd.class, "changeMuted", "changeMuted(Z)V", 0, 8);
                            rv4Var3.o0(P34);
                        }
                        xt4 xt4Var10 = (xt4) ((i76) P34);
                        boolean f28 = rv4Var3.f(ubdVar2);
                        Object P35 = rv4Var3.P();
                        if (f28 || P35 == obj5) {
                            P35 = new vja(0, ubdVar2, ubd.class, "refreshCurrentEpisode", "refreshCurrentEpisode()V", 0, 22);
                            rv4Var3.o0(P35);
                        }
                        vt4 vt4Var9 = (vt4) ((i76) P35);
                        boolean f29 = rv4Var3.f(ubdVar2);
                        Object P36 = rv4Var3.P();
                        if (f29 || P36 == obj5) {
                            P36 = new xe1(2, ubdVar2, ubd.class, "saveLastReadProgress", "saveLastReadProgress(JJ)V", 0, 13);
                            rv4Var3.o0(P36);
                        }
                        lu4 lu4Var2 = (lu4) ((i76) P36);
                        boolean f30 = rv4Var3.f(ubdVar2);
                        Object P37 = rv4Var3.P();
                        if (f30 || P37 == obj5) {
                            P37 = new vqc(1, ubdVar2, ubd.class, "selectTrack", "selectTrack(I)V", 0, 9);
                            rv4Var3.o0(P37);
                        }
                        xt4 xt4Var11 = (xt4) ((i76) P37);
                        boolean f31 = rv4Var3.f(ubdVar2);
                        Object P38 = rv4Var3.P();
                        if (!f31 && P38 != obj5) {
                            ubdVar3 = ubdVar2;
                        } else {
                            ubdVar3 = ubdVar2;
                            P38 = new vqc(1, ubdVar3, ubd.class, "changeAutoResumeLastPosition", "changeAutoResumeLastPosition(Z)V", 0, 10);
                            rv4Var3.o0(P38);
                        }
                        final ubd ubdVar4 = ubdVar3;
                        pc2.j(booleanValue5, gcdVar, s6dVar3, str3, str4, fbdVar2, xicVar, booleanValue6, booleanValue7, booleanValue8, booleanValue9, booleanValue10, l3, booleanValue11, xt4Var4, vt4Var3, vt4Var, vt4Var5, vt4Var6, xt4Var5, xt4Var6, vt4Var7, vt4Var8, xt4Var7, xt4Var8, xt4Var9, xt4Var10, vt4Var9, lu4Var2, xt4Var11, (xt4) ((i76) P38), rv4Var3, 0);
                        boolean booleanValue12 = ((Boolean) aw7Var20.getValue()).booleanValue();
                        String str5 = ((p6d) yyaVar5.getValue()).b;
                        boolean z12 = ((p6d) yyaVar5.getValue()).j;
                        boolean z13 = ((p6d) yyaVar5.getValue()).i;
                        int i10 = ((p6d) yyaVar5.getValue()).f;
                        boolean f32 = rv4Var3.f(aw7Var20);
                        Object P39 = rv4Var3.P();
                        if (f32 || P39 == obj5) {
                            P39 = new ozc(aw7Var20, 13);
                            rv4Var3.o0(P39);
                        }
                        xt4 xt4Var12 = (xt4) P39;
                        boolean f33 = rv4Var3.f(aw7Var20) | rv4Var3.f(ubdVar4);
                        Object P40 = rv4Var3.P();
                        if (f33 || P40 == obj5) {
                            P40 = new w33(ubdVar4, aw7Var20, 3);
                            rv4Var3.o0(P40);
                        }
                        zr1.e(booleanValue12, str5, z12, z13, i10, xt4Var12, (pu4) P40, rv4Var3, 0, 0);
                        boolean booleanValue13 = ((Boolean) aw7Var21.getValue()).booleanValue();
                        String str6 = ((p6d) yyaVar5.getValue()).b;
                        boolean z14 = ((p6d) yyaVar5.getValue()).i;
                        int i11 = ((p6d) yyaVar5.getValue()).f;
                        boolean f34 = rv4Var3.f(aw7Var21);
                        Object P41 = rv4Var3.P();
                        if (f34 || P41 == obj5) {
                            P41 = new ozc(aw7Var21, 5);
                            rv4Var3.o0(P41);
                        }
                        xt4 xt4Var13 = (xt4) P41;
                        boolean f35 = rv4Var3.f(ubdVar4);
                        Object P42 = rv4Var3.P();
                        if (f35 || P42 == obj5) {
                            P42 = new m0c(ubdVar4, 5);
                            rv4Var3.o0(P42);
                        }
                        yz1.d(str6, z14, i11, booleanValue13, xt4Var13, (lu4) P42, rv4Var3, 0, 0);
                        boolean booleanValue14 = ((Boolean) aw7Var19.getValue()).booleanValue();
                        boolean booleanValue15 = ((Boolean) yyaVar4.getValue()).booleanValue();
                        yya yyaVar6 = z5;
                        String str7 = ((ibd) yyaVar6.getValue()).a;
                        List list = ((ibd) yyaVar6.getValue()).b;
                        p6d p6dVar = (p6d) yyaVar5.getValue();
                        boolean f36 = rv4Var3.f(aw7Var19);
                        Object P43 = rv4Var3.P();
                        if (f36 || P43 == obj5) {
                            P43 = new ozc(aw7Var19, 6);
                            rv4Var3.o0(P43);
                        }
                        xt4 xt4Var14 = (xt4) P43;
                        boolean f37 = rv4Var3.f(ubdVar4) | rv4Var3.f(aw7Var19);
                        Object P44 = rv4Var3.P();
                        if (f37 || P44 == obj5) {
                            P44 = new t3c(ubdVar4, aw7Var19, 14);
                            rv4Var3.o0(P44);
                        }
                        xt4 xt4Var15 = (xt4) P44;
                        boolean f38 = rv4Var3.f(ubdVar4);
                        Object P45 = rv4Var3.P();
                        if (f38 || P45 == obj5) {
                            P45 = new imb(ubdVar4, 13);
                            rv4Var3.o0(P45);
                        }
                        vt4 vt4Var10 = (vt4) P45;
                        boolean f39 = rv4Var3.f(aw7Var19) | rv4Var3.f(aw7Var20);
                        Object P46 = rv4Var3.P();
                        if (f39 || P46 == obj5) {
                            P46 = new cob(aw7Var19, aw7Var20, 1);
                            rv4Var3.o0(P46);
                        }
                        vt4 vt4Var11 = (vt4) P46;
                        boolean f40 = rv4Var3.f(aw7Var19) | rv4Var3.f(aw7Var21);
                        Object P47 = rv4Var3.P();
                        if (f40 || P47 == obj5) {
                            P47 = new cob(aw7Var19, aw7Var21, 2);
                            rv4Var3.o0(P47);
                        }
                        vt4 vt4Var12 = (vt4) P47;
                        boolean f41 = rv4Var3.f(ubdVar4);
                        Object P48 = rv4Var3.P();
                        if (!f41 && P48 != obj5) {
                            c2 = '\t';
                        } else {
                            c2 = '\t';
                            P48 = new zub(ubdVar4, 9);
                            rv4Var3.o0(P48);
                        }
                        eg0.i(booleanValue14, booleanValue15, str7, list, p6dVar, xt4Var14, xt4Var15, vt4Var10, vt4Var11, vt4Var12, (xt4) P48, rv4Var3, 0);
                        boolean booleanValue16 = ((Boolean) aw7Var18.getValue()).booleanValue();
                        boolean booleanValue17 = ((Boolean) yyaVar4.getValue()).booleanValue();
                        s6d s6dVar4 = (s6d) aw7Var17.getValue();
                        List list2 = ((fbd) yyaVar2.getValue()).g;
                        int i12 = ((fbd) yyaVar2.getValue()).h;
                        boolean f42 = rv4Var3.f(aw7Var18);
                        Object P49 = rv4Var3.P();
                        if (f42 || P49 == obj5) {
                            P49 = new ozc(aw7Var18, 7);
                            rv4Var3.o0(P49);
                        }
                        xt4 xt4Var16 = (xt4) P49;
                        boolean f43 = rv4Var3.f(ubdVar4);
                        Object P50 = rv4Var3.P();
                        if (f43 || P50 == obj5) {
                            P50 = new vqc(1, ubdVar4, ubd.class, "changeAutoPlay", "changeAutoPlay(Z)V", 0, 11);
                            rv4Var3.o0(P50);
                        }
                        xt4 xt4Var17 = (xt4) ((i76) P50);
                        boolean f44 = rv4Var3.f(ubdVar4);
                        Object P51 = rv4Var3.P();
                        if (f44 || P51 == obj5) {
                            P51 = new vqc(1, ubdVar4, ubd.class, "changeAutoNextEpisode", "changeAutoNextEpisode(Z)V", 0, 12);
                            rv4Var3.o0(P51);
                        }
                        xt4 xt4Var18 = (xt4) ((i76) P51);
                        boolean f45 = rv4Var3.f(ubdVar4);
                        Object P52 = rv4Var3.P();
                        if (f45 || P52 == obj5) {
                            P52 = new vqc(1, ubdVar4, ubd.class, "changeAutoResumeLastPosition", "changeAutoResumeLastPosition(Z)V", 0, 13);
                            rv4Var3.o0(P52);
                        }
                        xt4 xt4Var19 = (xt4) ((i76) P52);
                        boolean f46 = rv4Var3.f(ubdVar4);
                        Object P53 = rv4Var3.P();
                        if (f46 || P53 == obj5) {
                            P53 = new vqc(1, ubdVar4, ubd.class, "changeSeekForwardSeconds", "changeSeekForwardSeconds(I)V", 0, 14);
                            rv4Var3.o0(P53);
                        }
                        xt4 xt4Var20 = (xt4) ((i76) P53);
                        boolean f47 = rv4Var3.f(ubdVar4);
                        Object P54 = rv4Var3.P();
                        if (f47 || P54 == obj5) {
                            P54 = new vqc(1, ubdVar4, ubd.class, "changeSeekBackwardSeconds", "changeSeekBackwardSeconds(I)V", 0, 15);
                            rv4Var3.o0(P54);
                        }
                        xt4 xt4Var21 = (xt4) ((i76) P54);
                        boolean f48 = rv4Var3.f(ubdVar4);
                        Object P55 = rv4Var3.P();
                        if (f48 || P55 == obj5) {
                            P55 = new vqc(1, ubdVar4, ubd.class, "changeResizeMode", "changeResizeMode(I)V", 0, 16);
                            rv4Var3.o0(P55);
                        }
                        xt4 xt4Var22 = (xt4) ((i76) P55);
                        boolean f49 = rv4Var3.f(ubdVar4);
                        Object P56 = rv4Var3.P();
                        if (f49 || P56 == obj5) {
                            P56 = new vqc(1, ubdVar4, ubd.class, "changeDarkMode", "changeDarkMode(I)V", 0, 17);
                            rv4Var3.o0(P56);
                        }
                        xt4 xt4Var23 = (xt4) ((i76) P56);
                        boolean f50 = rv4Var3.f(ubdVar4);
                        Object P57 = rv4Var3.P();
                        if (f50 || P57 == obj5) {
                            P57 = new vqc(1, ubdVar4, ubd.class, "changeLockOrientationWhenFullscreen", "changeLockOrientationWhenFullscreen(Z)V", 0, 18);
                            rv4Var3.o0(P57);
                        }
                        xt4 xt4Var24 = (xt4) ((i76) P57);
                        boolean f51 = rv4Var3.f(ubdVar4);
                        Object P58 = rv4Var3.P();
                        if (f51 || P58 == obj5) {
                            P58 = new vqc(1, ubdVar4, ubd.class, "changeAlwaysScreenOn", "changeAlwaysScreenOn(Z)V", 0, 19);
                            rv4Var3.o0(P58);
                        }
                        xt4 xt4Var25 = (xt4) ((i76) P58);
                        boolean f52 = rv4Var3.f(ubdVar4);
                        Object P59 = rv4Var3.P();
                        if (f52 || P59 == obj5) {
                            P59 = new vqc(1, ubdVar4, ubd.class, "changeShowSubtitle", "changeShowSubtitle(Z)V", 0, 20);
                            rv4Var3.o0(P59);
                        }
                        xt4 xt4Var26 = (xt4) ((i76) P59);
                        boolean f53 = rv4Var3.f(ubdVar4);
                        Object P60 = rv4Var3.P();
                        if (f53 || P60 == obj5) {
                            P60 = new vqc(1, ubdVar4, ubd.class, "changeSubtitleTextSize", "changeSubtitleTextSize(F)V", 0, 21);
                            rv4Var3.o0(P60);
                        }
                        xt4 xt4Var27 = (xt4) ((i76) P60);
                        boolean f54 = rv4Var3.f(ubdVar4);
                        Object P61 = rv4Var3.P();
                        if (f54 || P61 == obj5) {
                            P61 = new vqc(1, ubdVar4, ubd.class, "changeSubtitleBackgroundOpacity", "changeSubtitleBackgroundOpacity(F)V", 0, 22);
                            rv4Var3.o0(P61);
                        }
                        xt4 xt4Var28 = (xt4) ((i76) P61);
                        boolean f55 = rv4Var3.f(ubdVar4);
                        Object P62 = rv4Var3.P();
                        if (f55 || P62 == obj5) {
                            P62 = new vqc(1, ubdVar4, ubd.class, "changeSubtitleTextColor", "changeSubtitleTextColor(J)V", 0, 23);
                            rv4Var3.o0(P62);
                        }
                        xt4 xt4Var29 = (xt4) ((i76) P62);
                        boolean f56 = rv4Var3.f(ubdVar4);
                        Object P63 = rv4Var3.P();
                        if (f56 || P63 == obj5) {
                            P63 = new vqc(1, ubdVar4, ubd.class, "changeSubtitleBackgroundColor", "changeSubtitleBackgroundColor(J)V", 0, 24);
                            rv4Var3.o0(P63);
                        }
                        xt4 xt4Var30 = (xt4) ((i76) P63);
                        boolean f57 = rv4Var3.f(ubdVar4);
                        Object P64 = rv4Var3.P();
                        if (f57 || P64 == obj5) {
                            P64 = new vqc(1, ubdVar4, ubd.class, "changeSubtitleFontWeight", "changeSubtitleFontWeight(I)V", 0, 25);
                            rv4Var3.o0(P64);
                        }
                        xt4 xt4Var31 = (xt4) ((i76) P64);
                        boolean f58 = rv4Var3.f(ubdVar4);
                        Object P65 = rv4Var3.P();
                        if (f58 || P65 == obj5) {
                            P65 = new vqc(1, ubdVar4, ubd.class, "changeSubtitlePadding", "changeSubtitlePadding(F)V", 0, 26);
                            rv4Var3.o0(P65);
                        }
                        xt4 xt4Var32 = (xt4) ((i76) P65);
                        boolean f59 = rv4Var3.f(ubdVar4);
                        Object P66 = rv4Var3.P();
                        if (f59 || P66 == obj5) {
                            P66 = new vqc(1, ubdVar4, ubd.class, "selectAudioTrack", "selectAudioTrack(I)V", 0, 27);
                            rv4Var3.o0(P66);
                        }
                        xt4 xt4Var33 = (xt4) ((i76) P66);
                        boolean f60 = rv4Var3.f(ubdVar4);
                        Object P67 = rv4Var3.P();
                        if (f60 || P67 == obj5) {
                            P67 = new vqc(1, ubdVar4, ubd.class, "changeAutoBrightness", "changeAutoBrightness(Z)V", 0, 28);
                            rv4Var3.o0(P67);
                        }
                        xt4 xt4Var34 = (xt4) ((i76) P67);
                        boolean f61 = rv4Var3.f(ubdVar4);
                        Object P68 = rv4Var3.P();
                        if (f61 || P68 == obj5) {
                            P68 = new vqc(1, ubdVar4, ubd.class, "changeBrightness", "changeBrightness(F)V", 0, 29);
                            rv4Var3.o0(P68);
                        }
                        xt4 xt4Var35 = (xt4) ((i76) P68);
                        boolean f62 = rv4Var3.f(gcdVar) | rv4Var3.f(ubdVar4);
                        Object P69 = rv4Var3.P();
                        if (!f62 && P69 != obj5) {
                            z8 = booleanValue17;
                        } else {
                            z8 = booleanValue17;
                            P69 = new xt4() { // from class: t6d
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj9) {
                                    int i102 = r3;
                                    pvc pvcVar = pvc.a;
                                    ubd ubdVar42 = ubdVar4;
                                    gcd gcdVar2 = gcdVar;
                                    Float f272 = (Float) obj9;
                                    switch (i102) {
                                        case 0:
                                            float floatValue = f272.floatValue();
                                            gcdVar2.p = f272;
                                            j9d j9dVar = gcdVar2.n;
                                            if (j9dVar != null) {
                                                j9dVar.k(floatValue);
                                            }
                                            ubdVar42.k(floatValue);
                                            return pvcVar;
                                        default:
                                            float floatValue2 = f272.floatValue();
                                            gcdVar2.p = f272;
                                            j9d j9dVar2 = gcdVar2.n;
                                            if (j9dVar2 != null) {
                                                j9dVar2.k(floatValue2);
                                            }
                                            ubdVar42.k(floatValue2);
                                            return pvcVar;
                                    }
                                }
                            };
                            rv4Var3.o0(P69);
                        }
                        xt4 xt4Var36 = (xt4) P69;
                        boolean f63 = rv4Var3.f(ubdVar4);
                        Object P70 = rv4Var3.P();
                        if (f63 || P70 == obj5) {
                            P70 = new y6d(1, ubdVar4, ubd.class, "changeMuted", "changeMuted(Z)V", 0, 0);
                            rv4Var3.o0(P70);
                        }
                        xt4 xt4Var37 = (xt4) ((i76) P70);
                        boolean f64 = rv4Var3.f(ubdVar4);
                        Object P71 = rv4Var3.P();
                        if (!f64 && P71 != obj5) {
                            obj4 = ubdVar4;
                        } else {
                            obj4 = ubdVar4;
                            P71 = new y6d(1, obj4, ubd.class, "changeContinuePlayInPip", "changeContinuePlayInPip(Z)V", 0, 1);
                            rv4Var3.o0(P71);
                        }
                        Object obj9 = obj4;
                        cq7.h(booleanValue16, z8, s6dVar4, list2, i12, xt4Var16, xt4Var17, xt4Var18, xt4Var19, xt4Var20, xt4Var21, xt4Var22, xt4Var23, xt4Var24, xt4Var25, xt4Var26, xt4Var27, xt4Var28, xt4Var29, xt4Var30, xt4Var31, xt4Var32, xt4Var33, xt4Var34, xt4Var35, xt4Var36, xt4Var37, (xt4) ((i76) P71), rv4Var3, 0);
                        boolean booleanValue18 = ((Boolean) aw7Var12.getValue()).booleanValue();
                        boolean booleanValue19 = ((Boolean) yyaVar4.getValue()).booleanValue();
                        s6d s6dVar5 = (s6d) aw7Var17.getValue();
                        List list3 = ((fbd) yyaVar2.getValue()).i;
                        int i13 = ((fbd) yyaVar2.getValue()).j;
                        aw7 aw7Var23 = aw7Var12;
                        boolean f65 = rv4Var3.f(aw7Var23);
                        Object P72 = rv4Var3.P();
                        if (f65 || P72 == obj5) {
                            P72 = new ozc(aw7Var23, 9);
                            rv4Var3.o0(P72);
                        }
                        xt4 xt4Var38 = (xt4) P72;
                        boolean f66 = rv4Var3.f(obj9);
                        Object P73 = rv4Var3.P();
                        if (f66 || P73 == obj5) {
                            P73 = new y6d(1, obj9, ubd.class, "selectSubtitleTrack", "selectSubtitleTrack(I)V", 0, 2);
                            rv4Var3.o0(P73);
                        }
                        xt4 xt4Var39 = (xt4) ((i76) P73);
                        boolean f67 = rv4Var3.f(obj9);
                        Object P74 = rv4Var3.P();
                        if (f67 || P74 == obj5) {
                            P74 = new y6d(1, obj9, ubd.class, "changeShowSubtitle", "changeShowSubtitle(Z)V", 0, 4);
                            rv4Var3.o0(P74);
                        }
                        xt4 xt4Var40 = (xt4) ((i76) P74);
                        boolean f68 = rv4Var3.f(obj9);
                        Object P75 = rv4Var3.P();
                        if (f68 || P75 == obj5) {
                            P75 = new y6d(1, obj9, ubd.class, "changeSubtitleTextSize", "changeSubtitleTextSize(F)V", 0, 5);
                            rv4Var3.o0(P75);
                        }
                        xt4 xt4Var41 = (xt4) ((i76) P75);
                        boolean f69 = rv4Var3.f(obj9);
                        Object P76 = rv4Var3.P();
                        if (f69 || P76 == obj5) {
                            P76 = new y6d(1, obj9, ubd.class, "changeSubtitleBackgroundOpacity", "changeSubtitleBackgroundOpacity(F)V", 0, 6);
                            rv4Var3.o0(P76);
                        }
                        xt4 xt4Var42 = (xt4) ((i76) P76);
                        boolean f70 = rv4Var3.f(obj9);
                        Object P77 = rv4Var3.P();
                        if (f70 || P77 == obj5) {
                            P77 = new y6d(1, obj9, ubd.class, "changeSubtitleTextColor", "changeSubtitleTextColor(J)V", 0, 7);
                            rv4Var3.o0(P77);
                        }
                        xt4 xt4Var43 = (xt4) ((i76) P77);
                        boolean f71 = rv4Var3.f(obj9);
                        Object P78 = rv4Var3.P();
                        if (f71 || P78 == obj5) {
                            P78 = new y6d(1, obj9, ubd.class, "changeSubtitleBackgroundColor", "changeSubtitleBackgroundColor(J)V", 0, 8);
                            rv4Var3.o0(P78);
                        }
                        xt4 xt4Var44 = (xt4) ((i76) P78);
                        boolean f72 = rv4Var3.f(obj9);
                        Object P79 = rv4Var3.P();
                        if (f72 || P79 == obj5) {
                            P79 = new y6d(1, obj9, ubd.class, "changeSubtitleFontWeight", "changeSubtitleFontWeight(I)V", 0, 9);
                            rv4Var3.o0(P79);
                        }
                        xt4 xt4Var45 = (xt4) ((i76) P79);
                        boolean f73 = rv4Var3.f(obj9);
                        Object P80 = rv4Var3.P();
                        if (f73 || P80 == obj5) {
                            P80 = new y6d(obj9);
                            rv4Var3.o0(P80);
                        }
                        xl7.c(booleanValue18, booleanValue19, s6dVar5, list3, i13, xt4Var38, xt4Var39, xt4Var40, xt4Var41, xt4Var42, xt4Var43, xt4Var44, xt4Var45, (xt4) ((i76) P80), rv4Var3, 0);
                    } else {
                        rv4Var3.X();
                    }
                    return pvc.a;
                }
            }, rv4Var2), rv4Var2, 56);
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vg7(ubdVar, cz7Var, nq7Var, i2, 27);
        }
    }

    public static final void h(gcd gcdVar, xic xicVar, fbd fbdVar, s6d s6dVar, boolean z, boolean z2, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        List list;
        boolean z4;
        List list2;
        long j;
        long j2;
        dq4 dq4Var;
        j9d j9dVar;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1328308295);
        if (rv4Var2.f(gcdVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (rv4Var2.f(xicVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (rv4Var2.f(fbdVar)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i12 = i11 | i5;
        if (rv4Var2.f(s6dVar)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (rv4Var2.g(z)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (rv4Var2.g(z2)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i15 = i14 | i8;
        if (rv4Var2.h(lu4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((599187 & i16) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i16 & 1, z3)) {
            ze4 ze4Var = pna.c;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, ze4Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            if (xicVar != null) {
                rv4Var2.e0(1889386470);
                int ordinal = xicVar.a.ordinal();
                lh9 lh9Var = ax1.a;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        rv4Var2.e0(-1893590047);
                        lhd w = sve.w(null, rv4Var2, 1);
                        boolean f2 = rv4Var2.f(w);
                        Object P = rv4Var2.P();
                        if (f2 || P == lh9Var) {
                            P = new phd(w);
                            rv4Var2.o0(P);
                        }
                        j9dVar = (phd) P;
                        rv4Var2.q(false);
                    } else {
                        throw rs8.b(-1893593083, rv4Var2, false);
                    }
                } else {
                    rv4Var2.e0(-1893591968);
                    Context applicationContext = ((Context) rv4Var2.j(gh.b)).getApplicationContext();
                    x04 r = bze.r(rv4Var2);
                    Object P2 = rv4Var2.P();
                    if (P2 == lh9Var) {
                        P2 = dza.a(new zy5(0L));
                        rv4Var2.o0(P2);
                    }
                    bw7 bw7Var = (bw7) P2;
                    boolean h2 = rv4Var2.h(r) | rv4Var2.h(bw7Var);
                    Object P3 = rv4Var2.P();
                    if (h2 || P3 == lh9Var) {
                        P3 = new t3c(16, r, bw7Var);
                        rv4Var2.o0(P3);
                    }
                    yte.b(r, (xt4) P3, rv4Var2);
                    boolean f3 = rv4Var2.f(r);
                    Object P4 = rv4Var2.P();
                    if (f3 || P4 == lh9Var) {
                        P4 = new q9d(r, bw7Var, applicationContext);
                        rv4Var2.o0(P4);
                    }
                    q9d q9dVar = (q9d) P4;
                    x04 r2 = bze.r(rv4Var2);
                    boolean f4 = rv4Var2.f(r2);
                    Object P5 = rv4Var2.P();
                    if (f4 || P5 == lh9Var) {
                        P5 = new t50(r2);
                        rv4Var2.o0(P5);
                    }
                    t50 t50Var = (t50) P5;
                    boolean f5 = rv4Var2.f(q9dVar) | rv4Var2.f(t50Var);
                    Object P6 = rv4Var2.P();
                    if (f5 || P6 == lh9Var) {
                        P6 = new xy7(q9dVar, t50Var);
                        rv4Var2.o0(P6);
                    }
                    j9dVar = (xy7) P6;
                    rv4Var2.q(false);
                }
                int i17 = i16 & 14;
                if (i17 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean f6 = rv4Var2.f(j9dVar) | z5;
                Object P7 = rv4Var2.P();
                if (f6 || P7 == lh9Var) {
                    P7 = new iz7(gcdVar, j9dVar, null, 28);
                    rv4Var2.o0(P7);
                }
                yte.g((lu4) P7, rv4Var2, j9dVar);
                if (i17 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i16 & Token.ASSIGN_MOD) != 32) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                boolean z12 = z7 | z6;
                Object P8 = rv4Var2.P();
                if (z12 || P8 == lh9Var) {
                    P8 = new q4c(gcdVar, xicVar, null, 19);
                    rv4Var2.o0(P8);
                }
                yte.h(xicVar, j9dVar, (lu4) P8, rv4Var2);
                Integer valueOf = Integer.valueOf(fbdVar.h);
                List list3 = fbdVar.g;
                if ((i16 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i17 == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z13 = z9 | z8;
                Object P9 = rv4Var2.P();
                if (!z13 && P9 != lh9Var) {
                    list = null;
                } else {
                    list = null;
                    P9 = new q4c(fbdVar, gcdVar, null, 20);
                    rv4Var2.o0(P9);
                }
                yte.i(j9dVar, valueOf, list3, (lu4) P9, rv4Var2);
                if (i17 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i16 & 3670016) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean f7 = z11 | z10 | rv4Var2.f(j9dVar);
                Object P10 = rv4Var2.P();
                if (f7 || P10 == lh9Var) {
                    P10 = new r6a(24, gcdVar, lu4Var, j9dVar);
                    rv4Var2.o0(P10);
                }
                yte.b(j9dVar, (xt4) P10, rv4Var2);
                yte.m(j9dVar, ze4Var, rv4Var2, 48);
                z4 = false;
                rv4Var2.q(false);
            } else {
                list = null;
                z4 = false;
                rv4Var2.e0(1890876981);
                rv4Var2.q(false);
            }
            aw7 z14 = jsc.z(gcdVar.g, rv4Var2);
            aw7 z15 = jsc.z(gcdVar.i, rv4Var2);
            hbd hbdVar = (hbd) sl1.f0(fbdVar.j, fbdVar.i);
            if (hbdVar != null) {
                list2 = hbdVar.d;
            } else {
                list2 = list;
            }
            if (list2 == null) {
                list2 = ks3.a;
            }
            if (s6dVar.c == 0) {
                j = ((zy5) z15.getValue()).a;
            } else {
                j = 0;
            }
            long longValue = ((Number) z14.getValue()).longValue();
            List list4 = list2;
            boolean z16 = s6dVar.g;
            boolean z17 = z4;
            float f8 = s6dVar.h;
            float f9 = s6dVar.i;
            long j3 = s6dVar.j;
            long j4 = s6dVar.k;
            int i18 = s6dVar.l;
            if (i18 != 0) {
                j2 = j4;
                if (i18 != 2) {
                    dq4Var = dq4.f;
                } else {
                    dq4Var = dq4.D;
                }
            } else {
                j2 = j4;
                dq4Var = dq4.e;
            }
            dq4 dq4Var2 = dq4Var;
            float f10 = s6dVar.m;
            pu0 pu0Var = pu0.a;
            ese.o(list4, longValue, z16, f8, f9, pu0Var.b(), j, j3, j2, dq4Var2, f10, rv4Var, 0);
            rv4Var2 = rv4Var;
            if ((z || z2) && !fbdVar.b) {
                rv4Var2.e0(1892559723);
                ts6.a(nae.e, 0, 3, 0L, rv4Var2, pu0Var.a(pna.n(kq7.a, 54.0f), kh5.e));
                rv4Var2.q(z17);
            } else {
                rv4Var2.e0(1892723093);
                rv4Var2.q(z17);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ih7(gcdVar, xicVar, fbdVar, s6dVar, z, z2, lu4Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.gcd r36, final defpackage.xic r37, final defpackage.s6d r38, java.lang.String r39, final double r40, final long r42, java.lang.Long r44, final boolean r45, final boolean r46, final defpackage.xt4 r47, final defpackage.xt4 r48, final defpackage.xt4 r49, defpackage.lu4 r50, defpackage.vt4 r51, final defpackage.xt4 r52, defpackage.rv4 r53, final int r54) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.i(gcd, xic, s6d, java.lang.String, double, long, java.lang.Long, boolean, boolean, xt4, xt4, xt4, lu4, vt4, xt4, rv4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final boolean r50, final defpackage.gcd r51, final defpackage.s6d r52, final java.lang.String r53, final java.lang.String r54, final defpackage.fbd r55, final defpackage.xic r56, final boolean r57, final boolean r58, final boolean r59, final boolean r60, final boolean r61, final java.lang.Long r62, final boolean r63, final defpackage.xt4 r64, final defpackage.vt4 r65, final defpackage.vt4 r66, final defpackage.vt4 r67, final defpackage.vt4 r68, final defpackage.xt4 r69, final defpackage.xt4 r70, final defpackage.vt4 r71, final defpackage.vt4 r72, final defpackage.xt4 r73, final defpackage.xt4 r74, final defpackage.xt4 r75, final defpackage.xt4 r76, final defpackage.vt4 r77, final defpackage.lu4 r78, final defpackage.xt4 r79, final defpackage.xt4 r80, defpackage.rv4 r81, final int r82) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pc2.j(boolean, gcd, s6d, java.lang.String, java.lang.String, fbd, xic, boolean, boolean, boolean, boolean, boolean, java.lang.Long, boolean, xt4, vt4, vt4, vt4, vt4, xt4, xt4, vt4, vt4, xt4, xt4, xt4, xt4, vt4, lu4, xt4, xt4, rv4, int):void");
    }

    public static Bundle k(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                s0a.o("CronetManifest#getMetaData fetching info");
                try {
                    serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                    bundle2 = new Bundle();
                }
                c = bundle2;
                b = applicationContext;
                Trace.endSection();
            }
            bundle = c;
        }
        return bundle;
    }

    public static int l(ea1 ea1Var) {
        int g2 = ea1Var.g(4);
        if (g2 == 15) {
            if (ea1Var.b() >= 24) {
                return ea1Var.g(24);
            }
            throw xm8.a(null, "AAC header insufficient data");
        } else if (g2 < 13) {
            return d[g2];
        } else {
            throw xm8.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static final nq7 m(nq7 nq7Var, oj ojVar, ol6 ol6Var, gtb gtbVar) {
        return nq7Var.a0(new bl6(ojVar, ol6Var, gtbVar));
    }

    public static w n(ea1 ea1Var, boolean z) {
        int g2 = ea1Var.g(5);
        if (g2 == 31) {
            g2 = ea1Var.g(6) + 32;
        }
        int l = l(ea1Var);
        int g3 = ea1Var.g(4);
        String j = a82.j(g2, "mp4a.40.");
        if (g2 == 5 || g2 == 29) {
            l = l(ea1Var);
            int g4 = ea1Var.g(5);
            if (g4 == 31) {
                g4 = ea1Var.g(6) + 32;
            }
            g2 = g4;
            if (g2 == 22) {
                g3 = ea1Var.g(4);
            }
        }
        if (z) {
            if (g2 != 1 && g2 != 2 && g2 != 3 && g2 != 4 && g2 != 6 && g2 != 7 && g2 != 17) {
                switch (g2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw xm8.c("Unsupported audio object type: " + g2);
                }
            }
            if (ea1Var.f()) {
                st0.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (ea1Var.f()) {
                ea1Var.o(14);
            }
            boolean f2 = ea1Var.f();
            if (g3 != 0) {
                if (g2 == 6 || g2 == 20) {
                    ea1Var.o(3);
                }
                if (f2) {
                    if (g2 == 22) {
                        ea1Var.o(16);
                    }
                    if (g2 == 17 || g2 == 19 || g2 == 20 || g2 == 23) {
                        ea1Var.o(3);
                    }
                    ea1Var.o(1);
                }
                switch (g2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int g5 = ea1Var.g(2);
                        if (g5 == 2 || g5 == 3) {
                            throw xm8.c("Unsupported epConfig: " + g5);
                        }
                }
            } else {
                cp8.q();
                return null;
            }
        }
        int i2 = e[g3];
        if (i2 != -1) {
            return new w(l, i2, j);
        }
        throw xm8.a(null, null);
    }

    public static lv o(km8 km8Var) {
        String str;
        int m = km8Var.m();
        if (km8Var.m() == 1684108385) {
            int m2 = km8Var.m();
            byte[] bArr = nu0.a;
            int i2 = m2 & 16777215;
            if (i2 == 13) {
                str = "image/jpeg";
            } else if (i2 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                a82.y("Unrecognized cover art flags: ", "MetadataUtil", i2);
                return null;
            }
            km8Var.N(4);
            int i3 = m - 16;
            byte[] bArr2 = new byte[i3];
            km8Var.k(bArr2, 0, i3);
            return new lv(str, null, 3, bArr2);
        }
        st0.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static sub p(int i2, km8 km8Var, String str) {
        int m = km8Var.m();
        if (km8Var.m() == 1684108385 && m >= 22) {
            km8Var.N(10);
            int G = km8Var.G();
            if (G > 0) {
                String j = a82.j(G, "");
                int G2 = km8Var.G();
                if (G2 > 0) {
                    j = a82.m(j, "/", G2);
                }
                return new sub(str, null, qs5.r(j));
            }
        }
        st0.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(ny0.e(i2)));
        return null;
    }

    public static int q(km8 km8Var) {
        int m = km8Var.m();
        if (km8Var.m() == 1684108385) {
            km8Var.N(8);
            int i2 = m - 16;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4 && (km8Var.j() & Token.CASE) == 0) {
                            return km8Var.D();
                        }
                    } else {
                        return km8Var.C();
                    }
                } else {
                    return km8Var.G();
                }
            } else {
                return km8Var.z();
            }
        }
        st0.w("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static wk5 r(int i2, String str, km8 km8Var, boolean z, boolean z2) {
        int q = q(km8Var);
        if (z2) {
            q = Math.min(1, q);
        }
        if (q >= 0) {
            if (z) {
                return new sub(str, null, qs5.r(Integer.toString(q)));
            }
            return new gq1("und", str, Integer.toString(q));
        }
        st0.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(ny0.e(i2)));
        return null;
    }

    public static sub s(int i2, km8 km8Var, String str) {
        int m = km8Var.m();
        if (km8Var.m() == 1684108385) {
            km8Var.N(8);
            return new sub(str, null, qs5.r(km8Var.v(m - 16)));
        }
        st0.w("MetadataUtil", "Failed to parse text attribute: ".concat(ny0.e(i2)));
        return null;
    }

    public static final uy5 t(rk9 rk9Var) {
        return new uy5(Math.round(rk9Var.a), Math.round(rk9Var.b), Math.round(rk9Var.c), Math.round(rk9Var.d));
    }

    public static void u(int i2, tb7 tb7Var, uq4 uq4Var, tb7 tb7Var2, tb7... tb7VarArr) {
        rb7[] rb7VarArr;
        if (tb7Var2 == null) {
            tb7Var2 = new tb7(new rb7[0]);
        }
        if (tb7Var != null) {
            ls5 i3 = qs5.i();
            for (rb7 rb7Var : tb7Var.a) {
                if (v27.class.isAssignableFrom(rb7Var.getClass())) {
                    i3.b((rb7) v27.class.cast(rb7Var));
                }
            }
            ms5 listIterator = i3.g().listIterator(0);
            while (listIterator.hasNext()) {
                v27 v27Var = (v27) listIterator.next();
                if (!v27Var.a.equals("com.android.capture.fps") || i2 == 2) {
                    tb7Var2 = tb7Var2.a(v27Var);
                }
            }
        }
        for (tb7 tb7Var3 : tb7VarArr) {
            tb7Var2 = tb7Var2.b(tb7Var3);
        }
        if (tb7Var2.a.length > 0) {
            uq4Var.k = tb7Var2;
        }
    }

    public static Integer v(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 3377875:
                    if (str.equals("news")) {
                        return 6;
                    }
                    return null;
                case 93166550:
                    if (str.equals("audio")) {
                        return 3;
                    }
                    return null;
                case 94843483:
                    if (str.equals("comic")) {
                        return 2;
                    }
                    return null;
                case 96305358:
                    if (str.equals("ebook")) {
                        return 5;
                    }
                    return null;
                case 105010748:
                    if (str.equals("novel")) {
                        return 1;
                    }
                    return null;
                case 112202875:
                    if (str.equals("video")) {
                        return 4;
                    }
                    return null;
                default:
                    return null;
            }
        }
        return null;
    }

    public static int w(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }
}
