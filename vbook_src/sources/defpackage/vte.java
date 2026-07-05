package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vte  reason: default package */
/* loaded from: classes.dex */
public abstract class vte {
    public static final tu1 a = new tu1(new dv1(5), false, 1673418665);
    public static final tu1 b = new tu1(new wu1(9), false, -1905993143);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v21, types: [int] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v42 */
    public static final void a(String str, String str2, String str3, String str4, nq7 nq7Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        aw7 aw7Var;
        String str5;
        aw7 aw7Var2;
        int i8;
        pu0 pu0Var;
        aw7 aw7Var3;
        lh9 lh9Var;
        float f;
        boolean z5;
        boolean z6;
        rv4 rv4Var2;
        rv4 rv4Var3;
        ?? r7;
        Object obj;
        mv6 mv6Var;
        String str6;
        boolean z7;
        boolean z8;
        int i9;
        lh9 lh9Var2;
        rv4 rv4Var4 = rv4Var;
        u22 u22Var = r0f.d;
        rv4Var4.g0(376562847);
        if (rv4Var4.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (rv4Var4.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (rv4Var4.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i12 = i11 | i4;
        if (rv4Var4.f(str4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (rv4Var4.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (rv4Var4.h(nu4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i15 = i7 | i14;
        if ((74899 & i15) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var4.U(i15 & 1, z)) {
            Object[] objArr = new Object[0];
            int i16 = i15 & Token.ASSIGN_MOD;
            if (i16 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var4.P();
            lh9 lh9Var3 = ax1.a;
            if (z2 || P == lh9Var3) {
                P = new op0(str2, 14);
                rv4Var4.o0(P);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr, (vt4) P, rv4Var4, 0);
            Object[] objArr2 = new Object[0];
            if ((i15 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var4.P();
            if (z3 || P2 == lh9Var3) {
                P2 = new op0(str3, 15);
                rv4Var4.o0(P2);
            }
            aw7 aw7Var5 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var4, 0);
            Object[] objArr3 = new Object[0];
            if ((i15 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P3 = rv4Var4.P();
            if (z4 || P3 == lh9Var3) {
                P3 = new op0(str4, 16);
                rv4Var4.o0(P3);
            }
            aw7 aw7Var6 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var4, 0);
            Object P4 = rv4Var4.P();
            if (P4 == lh9Var3) {
                P4 = yae.z(null);
                rv4Var4.o0(P4);
            }
            aw7 aw7Var7 = (aw7) P4;
            Object P5 = rv4Var4.P();
            if (P5 == lh9Var3) {
                P5 = new as1(aw7Var7, 29);
                rv4Var4.o0(P5);
            }
            kd4 v = w92.v(av8.a, (xt4) P5, rv4Var4, 54);
            Object[] objArr4 = new Object[0];
            Object P6 = rv4Var4.P();
            if (P6 == lh9Var3) {
                P6 = new qk3(18);
                rv4Var4.o0(P6);
            }
            aw7 aw7Var8 = (aw7) zpe.k(objArr4, (vt4) P6, rv4Var4, 48);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var4.T);
            xt8 l = rv4Var4.l();
            nq7 p = lye.p(rv4Var4, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var4, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var4, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var4, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var4);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var4, p);
            kq7 kq7Var = kq7.a;
            nq7 c = pna.c(kq7Var, 1.0f);
            nk0 nk0Var2 = kh5.b;
            pu0 pu0Var2 = pu0.a;
            nq7 C = rte.C(q1d.l(pu0Var2.a(c, nk0Var2), rv4Var4, 0), rte.u(rv4Var4), 14);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var4, 48);
            int hashCode2 = Long.hashCode(rv4Var4.T);
            xt8 l2 = rv4Var4.l();
            nq7 p2 = lye.p(rv4Var4, C);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, a2);
            jce.F(npVar2, rv4Var4, l2);
            s21.t(hashCode2, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p2);
            xbe.i(rv4Var4, pna.h(kq7Var, 44.0f));
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode3 = Long.hashCode(rv4Var4.T);
            xt8 l3 = rv4Var4.l();
            nq7 p3 = lye.p(rv4Var4, kq7Var);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, d2);
            jce.F(npVar2, rv4Var4, l3);
            s21.t(hashCode3, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p3);
            nq7 k = tte.k(pna.p(zbe.C(kq7Var, nae.e, nae.e, nae.e, 16.0f, 7), 120.0f, 180.0f), r0f.z(rv4Var4).b);
            b37 d3 = fu0.d(nk0Var, false);
            int hashCode4 = Long.hashCode(rv4Var4.T);
            xt8 l4 = rv4Var4.l();
            nq7 p4 = lye.p(rv4Var4, k);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, d3);
            jce.F(npVar2, rv4Var4, l4);
            s21.t(hashCode4, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p4);
            if (((f76) aw7Var7.getValue()) == null) {
                rv4Var4.e0(-59390854);
                aw7Var = aw7Var5;
                str5 = null;
                do5.c(str, str2, "", "", u22Var, pna.c, rv4Var4, (i15 & 14) | 224640 | i16);
                rv4Var4.q(false);
                rv4Var3 = rv4Var4;
                r7 = 0;
                pu0Var = pu0Var2;
                aw7Var3 = aw7Var6;
                aw7Var2 = aw7Var4;
                lh9Var = lh9Var3;
                i8 = 15;
                z5 = true;
                f = 1.0f;
            } else {
                aw7Var = aw7Var5;
                str5 = null;
                rv4Var4.e0(-58969626);
                f76 f76Var = (f76) aw7Var7.getValue();
                if (f76Var == null) {
                    rv4Var4.e0(-58969627);
                    rv4Var4.q(false);
                    rv4Var2 = rv4Var4;
                    z6 = false;
                    pu0Var = pu0Var2;
                    aw7Var3 = aw7Var6;
                    aw7Var2 = aw7Var4;
                    lh9Var = lh9Var3;
                    i8 = 15;
                    z5 = true;
                    f = 1.0f;
                } else {
                    rv4Var4.e0(-58969626);
                    aw7Var2 = aw7Var4;
                    i8 = 15;
                    pu0Var = pu0Var2;
                    aw7Var3 = aw7Var6;
                    lh9Var = lh9Var3;
                    f = 1.0f;
                    z5 = true;
                    z6 = false;
                    do5.a(f76Var, u22Var, false, null, null, null, pna.c, null, rv4Var4, 12582960, 892);
                    rv4Var2 = rv4Var4;
                    rv4Var2.q(false);
                }
                rv4Var2.q(z6);
                r7 = z6;
                rv4Var3 = rv4Var2;
            }
            rv4Var3.q(z5);
            ar5 c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var3, r7);
            long j = r0f.y(rv4Var3).b;
            nq7 n = pna.n(pu0Var.a(kq7Var, kh5.D), 32.0f);
            su9 su9Var = uu9.a;
            nq7 v2 = nmd.v(zbe.y(nmd.v(tte.k(n, su9Var), r0f.y(rv4Var3).n, su9Var), 2.0f), r0f.y(rv4Var3).a, su9Var);
            boolean f2 = rv4Var3.f(v);
            Object P7 = rv4Var3.P();
            if (f2 || P7 == lh9Var) {
                P7 = new fe1(v, 5);
                rv4Var3.o0(P7);
            }
            aw7 aw7Var9 = aw7Var3;
            aw7 aw7Var10 = aw7Var2;
            lh9 lh9Var4 = lh9Var;
            rv4 rv4Var5 = rv4Var3;
            float f3 = f;
            nk5.a(c2, null, zbe.y(lbe.f(i8, (vt4) P7, v2, str5, false), 6.0f), j, rv4Var5, 48, 0);
            rs8.u(rv4Var5, true, kq7Var, 12.0f, rv4Var5);
            String str7 = (String) aw7Var10.getValue();
            v72 v72Var = r0f.z(rv4Var5).b;
            nq7 A = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), f3), 24.0f, nae.e, 2);
            boolean f4 = rv4Var5.f(aw7Var10);
            Object P8 = rv4Var5.P();
            if (f4 || P8 == lh9Var4) {
                P8 = new zn3(aw7Var10, 0);
                rv4Var5.o0(P8);
            }
            uwe.h(str7, (xt4) P8, A, false, false, null, ese.a, null, null, null, false, null, null, null, false, 0, 0, v72Var, null, rv4Var5, 1573248, 0, 6291384);
            String str8 = (String) nk2.p(kq7Var, 12.0f, rv4Var5, aw7Var);
            v72 v72Var2 = r0f.z(rv4Var5).b;
            nq7 A2 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), f3), 24.0f, nae.e, 2);
            boolean f5 = rv4Var5.f(aw7Var);
            Object P9 = rv4Var5.P();
            if (f5 || P9 == lh9Var4) {
                P9 = new zn3(aw7Var, 1);
                rv4Var5.o0(P9);
            }
            uwe.h(str8, (xt4) P9, A2, false, false, null, ese.b, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var5, 1573248, 0, 6291384);
            boolean f6 = rv4Var5.f((String) nk2.p(kq7Var, 12.0f, rv4Var5, aw7Var9));
            Object P10 = rv4Var5.P();
            String str9 = P10;
            if (f6 || P10 == lh9Var4) {
                String str10 = "";
                String str11 = str10;
                if (((String) aw7Var9.getValue()).length() != 0) {
                    String str12 = (String) aw7Var9.getValue();
                    str12.getClass();
                    String O = r4b.O(k4b.N0(str12).toString(), '_', '-');
                    O = (O.length() == 0 || O.equalsIgnoreCase("und")) ? null : null;
                    if (O == null) {
                        mv6Var = null;
                    } else {
                        try {
                            obj = new mv6(xve.c(O));
                        } catch (Throwable th) {
                            obj = new gs9(th);
                        }
                        boolean z9 = obj instanceof gs9;
                        Object obj2 = obj;
                        if (z9) {
                            obj2 = null;
                        }
                        mv6Var = (mv6) obj2;
                    }
                    if (mv6Var != null) {
                        str6 = mv6Var.c(mv6Var);
                    } else {
                        str6 = null;
                    }
                    if (str6 != null) {
                        str10 = str6;
                    }
                    str11 = rs8.l(str10, " (", (String) aw7Var9.getValue(), ")");
                }
                rv4Var5.o0(str11);
                str9 = str11;
            }
            String str13 = (String) str9;
            String A3 = yqe.A((y3b) x2b.I.getValue(), rv4Var5);
            boolean f7 = rv4Var5.f(aw7Var8);
            Object P11 = rv4Var5.P();
            if (f7 || P11 == lh9Var4) {
                P11 = new ea3(aw7Var8, 7);
                rv4Var5.o0(P11);
            }
            twe.e(3072, (vt4) P11, rv4Var5, zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2), str13, A3, null);
            rv4Var4 = rv4Var5;
            xbe.i(rv4Var4, pna.h(kq7Var, 12.0f));
            ar5 c3 = rp5.c((wk3) ok3.j0.getValue(), rv4Var4, 0);
            String A4 = yqe.A((y3b) b3b.F.getValue(), rv4Var4);
            if (((String) aw7Var10.getValue()).length() > 0 && ((String) aw7Var9.getValue()).length() > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            nq7 A5 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
            if ((i15 & 458752) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean f8 = z8 | rv4Var4.f(aw7Var10) | rv4Var4.f(aw7Var) | rv4Var4.f(aw7Var9);
            Object P12 = rv4Var4.P();
            if (!f8 && P12 != lh9Var4) {
                i9 = 2;
                lh9Var2 = lh9Var4;
            } else {
                i9 = 2;
                lh9Var2 = lh9Var4;
                mc3 mc3Var = new mc3(nu4Var, aw7Var10, aw7Var, aw7Var9, aw7Var7, 1);
                rv4Var4.o0(mc3Var);
                P12 = mc3Var;
            }
            z1d.f(c3, A4, z7, null, A5, null, null, null, (vt4) P12, rv4Var4, 24576, 232);
            xbe.i(rv4Var4, pna.h(kq7Var, 12.0f));
            rv4Var4.q(true);
            boolean booleanValue = ((Boolean) aw7Var8.getValue()).booleanValue();
            boolean f9 = rv4Var4.f(aw7Var8);
            Object P13 = rv4Var4.P();
            if (f9 || P13 == lh9Var2) {
                P13 = new zn3(aw7Var8, i9);
                rv4Var4.o0(P13);
            }
            xt4 xt4Var = (xt4) P13;
            boolean f10 = rv4Var4.f(aw7Var9) | rv4Var4.f(aw7Var8);
            Object P14 = rv4Var4.P();
            if (f10 || P14 == lh9Var2) {
                P14 = new pr0(aw7Var9, aw7Var8, 8);
                rv4Var4.o0(P14);
            }
            am8.g(booleanValue, xt4Var, (xt4) P14, rv4Var4, 0);
            rv4Var4.q(true);
        } else {
            rv4Var4.X();
        }
        ek9 u = rv4Var4.u();
        if (u != null) {
            u.d = new bn7(str, str2, str3, str4, nq7Var, nu4Var, i, 3);
        }
    }

    public static final void b(vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        vt4Var.getClass();
        rv4Var.g0(-1399368011);
        if (rv4Var.h(vt4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        boolean z2 = true;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            Boolean bool = Boolean.FALSE;
            if ((i3 & Token.ASSIGN_MOD) != 32) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new bs(vt4Var, null, 0);
                rv4Var.o0(P);
            }
            yte.g((lu4) P, rv4Var, bool);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zr(vt4Var, i, 0);
        }
    }

    public static final void c(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        pb2 pb2Var;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-542215852);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new op0(str, 13);
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
                bo3 bo3Var = (bo3) ((fdd) voe.z(cm9.a(bo3.class), a2.i(), null, pb2Var, o96.a(rv4Var), vt4Var));
                aw7 z3 = jsc.z(bo3Var.U, rv4Var);
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = bo3Var.V;
                boolean f = rv4Var.f(kbVar);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new wa(7, kbVar, (m42) null);
                    rv4Var.o0(P2);
                }
                jye.b(s02Var, null, (mu4) P2, rv4Var, 0);
                fxe.h(((ao3) z3.getValue()).b, pna.c, false, jce.E(-1313283376, new p7(cz7Var, 23), rv4Var), null, null, jce.E(1763490783, new cs1(3, str, bo3Var, z3), rv4Var), rv4Var, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i, 4);
        }
    }

    public static final ou9 d(rk9 rk9Var, long j, long j2, long j3, long j4) {
        return new ou9(rk9Var.a, rk9Var.b, rk9Var.c, rk9Var.d, j, j2, j3, j4);
    }

    public static final void e(s6d s6dVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean d;
        s6dVar.getClass();
        int i3 = s6dVar.a;
        rv4Var.g0(938240960);
        if (rv4Var.f(s6dVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        boolean z2 = true;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            om3 om3Var = (om3) rv4Var.j(nm3.a);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                long c = om3Var.c();
                dl8 dl8Var = (dl8) om3Var.k.getValue();
                boolean g = om3Var.g();
                boolean e = om3Var.e();
                boolean booleanValue = ((Boolean) om3Var.d.getValue()).booleanValue();
                if (i3 != 0) {
                    if (i3 != 2) {
                        d = false;
                    } else {
                        d = true;
                    }
                } else {
                    d = om3Var.d();
                }
                Object om3Var2 = new om3(c, d, booleanValue, e, g, om3Var.f(), dl8Var, om3Var.b(), om3Var.a(), (eo4) om3Var.h.getValue());
                rv4Var.o0(om3Var2);
                P = om3Var2;
            }
            om3 om3Var3 = (om3) P;
            if (i3 != 0) {
                if (i3 != 2) {
                    z2 = false;
                }
            } else {
                z2 = om3Var.d();
            }
            om3Var3.c.setValue(Boolean.valueOf(z2));
            lfa lfaVar = ((h27) rv4Var.j(j27.a)).c;
            boolean f = rv4Var.f(om3Var3);
            Object P2 = rv4Var.P();
            if (f || P2 == obj) {
                P2 = new zub(om3Var3, 11);
                rv4Var.o0(P2);
            }
            nm3.a(om3Var3, lfaVar, false, (xt4) P2, jce.E(-437930292, new x0a(tu1Var, 18), rv4Var), rv4Var, 24576, 4);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kbd(s6dVar, tu1Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Type inference failed for: r6v4, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.xn6 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.fo6
            if (r0 == 0) goto L13
            r0 = r6
            fo6 r0 = (defpackage.fo6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fo6 r0 = new fo6
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.d
            pvc r2 = defpackage.pvc.a
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            zl9 r5 = r0.b
            xn6 r0 = r0.a
            defpackage.hre.r(r6)     // Catch: java.lang.Throwable -> L2b
            goto L6e
        L2b:
            r6 = move-exception
            goto L7d
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L34:
            defpackage.hre.r(r6)
            kn6 r6 = r5.h
            kn6 r1 = defpackage.kn6.d
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L42
            return r2
        L42:
            zl9 r6 = new zl9
            r6.<init>()
            r0.a = r5     // Catch: java.lang.Throwable -> L78
            r0.b = r6     // Catch: java.lang.Throwable -> L78
            r0.d = r3     // Catch: java.lang.Throwable -> L78
            f61 r1 = new f61     // Catch: java.lang.Throwable -> L78
            m42 r0 = defpackage.w92.t(r0)     // Catch: java.lang.Throwable -> L78
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L78
            r1.u()     // Catch: java.lang.Throwable -> L78
            go6 r0 = new go6     // Catch: java.lang.Throwable -> L78
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L78
            r6.a = r0     // Catch: java.lang.Throwable -> L78
            r5.a(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r1.s()     // Catch: java.lang.Throwable -> L78
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r0 = r5
            r5 = r6
        L6e:
            java.lang.Object r5 = r5.a
            tn6 r5 = (defpackage.tn6) r5
            if (r5 == 0) goto L77
            r0.f(r5)
        L77:
            return r2
        L78:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L7d:
            java.lang.Object r5 = r5.a
            tn6 r5 = (defpackage.tn6) r5
            if (r5 == 0) goto L86
            r0.f(r5)
        L86:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vte.f(xn6, n42):java.lang.Object");
    }

    public static final boolean g(ou9 ou9Var) {
        long j = ou9Var.e;
        if ((j >>> 32) == (4294967295L & j) && j == ou9Var.f && j == ou9Var.g && j == ou9Var.h) {
            return true;
        }
        return false;
    }

    public static String h(String str) {
        char c;
        String str2;
        String str3;
        char c2 = '0';
        String u = u('0');
        str.getClass();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('0' <= charAt && charAt < ':') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return str;
        }
        int i3 = 2;
        int i4 = 1;
        if (sb2.length() == 2 && k4b.B0(sb2, '0')) {
            return "không ".concat(u(sb2.charAt(1)));
        }
        String S0 = k4b.S0(sb2, '0');
        if (S0.length() == 0) {
            return u;
        }
        ArrayList arrayList = new ArrayList();
        for (int length2 = S0.length(); length2 > 0; length2 -= 3) {
            arrayList.add(S0.substring(Math.max(0, length2 - 3), length2));
        }
        String[] strArr = {"", " nghìn", " triệu", " tỷ"};
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            int i6 = i5 + 1;
            String str4 = (String) it.next();
            if (!c16.i(str4, "000")) {
                str4.getClass();
                if (str4.length() == 0 || str4.equals("000")) {
                    c = c2;
                    str2 = "";
                } else {
                    String r0 = k4b.r0(3, str4);
                    char charAt2 = r0.charAt(i);
                    char charAt3 = r0.charAt(i4);
                    char charAt4 = r0.charAt(i3);
                    ArrayList arrayList3 = new ArrayList();
                    if (charAt2 != c2) {
                        arrayList3.add(u(charAt2).concat(" trăm"));
                    } else if (str4.length() == 3) {
                        arrayList3.add("không trăm");
                    }
                    c = '0';
                    if (charAt3 != '0') {
                        if (charAt3 != '1') {
                            arrayList3.add(u(charAt3).concat(" mươi"));
                        } else {
                            arrayList3.add("mười");
                        }
                    } else if (charAt4 != '0' && (charAt2 != '0' || str4.length() == 3)) {
                        arrayList3.add("lẻ");
                    }
                    if (charAt4 != '0') {
                        if (charAt4 == '1' && charAt3 != '0' && charAt3 != '1') {
                            arrayList3.add("mốt");
                        } else if (charAt4 == '5' && charAt3 != '0') {
                            arrayList3.add("lăm");
                        } else {
                            arrayList3.add(u(charAt4));
                        }
                    }
                    str2 = sl1.i0(arrayList3, " ", null, null, null, 62);
                }
                if (str2.length() > 0) {
                    int i7 = i5 % 3;
                    if (i7 >= 4) {
                        str3 = "";
                    } else {
                        str3 = strArr[i7];
                    }
                    int i8 = i5 / 3;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(str3);
                    for (int i9 = 0; i9 < i8; i9++) {
                        sb3.append(" tỷ");
                    }
                    arrayList2.add(sb3.toString());
                }
            } else {
                c = c2;
            }
            c2 = c;
            i5 = i6;
            i3 = 2;
            i = 0;
            i4 = 1;
        }
        if (arrayList2.isEmpty()) {
            return u;
        }
        Collections.reverse(arrayList2);
        return k4b.N0(sl1.i0(arrayList2, " ", null, null, null, 62)).toString();
    }

    public static String i(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('0' <= charAt && charAt < ':') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        int length2 = sb2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt2 = sb2.charAt(i2);
            if (charAt2 == '5' && i2 == sb2.length() - 1 && i2 > 0 && sb2.charAt(i2 - 1) != '0') {
                arrayList.add("lăm");
            } else {
                String u = u(charAt2);
                if (u.length() > 0) {
                    arrayList.add(u);
                }
            }
        }
        return sl1.i0(arrayList, " ", null, null, null, 62);
    }

    public static String j(String str) {
        String str2;
        str.getClass();
        if (r4b.Q(str, "+84", false)) {
            str2 = "0".concat(str.substring(3));
        } else {
            str2 = str;
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if ('0' <= charAt && charAt < ':') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        ArrayList arrayList = new ArrayList(sb2.length());
        for (int i2 = 0; i2 < sb2.length(); i2++) {
            arrayList.add(u(sb2.charAt(i2)));
        }
        if (arrayList.isEmpty()) {
            return str;
        }
        return sl1.i0(arrayList, " ", null, null, null, 62);
    }

    public static final int k(yeb yebVar) {
        yebVar.getClass();
        return n(yebVar) | (n(yebVar) << 24) | (n(yebVar) << 16) | (n(yebVar) << 8);
    }

    public static final int l(yeb yebVar) {
        yebVar.getClass();
        return (n(yebVar) << 24) | n(yebVar) | (n(yebVar) << 8) | (n(yebVar) << 16);
    }

    public static final int m(yeb yebVar) {
        yebVar.getClass();
        return (n(yebVar) << 8) | n(yebVar);
    }

    public static final int n(yeb yebVar) {
        yebVar.getClass();
        byte[] bArr = yebVar.b;
        if (yebVar.read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public static final dm8 o(float f, boolean z, rv4 rv4Var, int i) {
        boolean z2;
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = hl5.g(nae.e, rv4Var);
        }
        dm8 dm8Var = (dm8) P;
        Object P2 = rv4Var.P();
        if (P2 == lh9Var) {
            P2 = hl5.g(f, rv4Var);
        }
        dm8 dm8Var2 = (dm8) P2;
        boolean z3 = false;
        if ((((i & 14) ^ 6) > 4 && rv4Var.c(f)) || (i & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object P3 = rv4Var.P();
        if (z2 || P3 == lh9Var) {
            P3 = new yr(dm8Var2, f, 0);
            rv4Var.o0(P3);
        }
        yte.k((vt4) P3, rv4Var);
        Boolean valueOf = Boolean.valueOf(z);
        if ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.g(z)) || (i & 48) == 32) {
            z3 = true;
        }
        Object P4 = rv4Var.P();
        if (z3 || P4 == lh9Var) {
            ds dsVar = new ds(z, dm8Var2, dm8Var, null, 0);
            rv4Var.o0(dsVar);
            P4 = dsVar;
        }
        yte.g((lu4) P4, rv4Var, valueOf);
        return dm8Var;
    }

    public static final rl8 p(int i, rv4 rv4Var, boolean z) {
        boolean z2;
        Object P = rv4Var.P();
        lh9 lh9Var = ax1.a;
        if (P == lh9Var) {
            P = hl5.g(nae.e, rv4Var);
        }
        dm8 dm8Var = (dm8) P;
        Object P2 = rv4Var.P();
        if (P2 == lh9Var) {
            P2 = hl5.g(nae.e, rv4Var);
        }
        dm8 dm8Var2 = (dm8) P2;
        if ((((i & 14) ^ 6) > 4 && rv4Var.g(z)) || (i & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object P3 = rv4Var.P();
        if (z2 || P3 == lh9Var) {
            P3 = new as(z, dm8Var, dm8Var2, 0);
            rv4Var.o0(P3);
        }
        yte.k((vt4) P3, rv4Var);
        return new rl8(dm8Var, dm8Var2);
    }

    public static final nq7 q(nq7 nq7Var, boolean z, yu7 yu7Var, ut9 ut9Var, boolean z2, xt9 xt9Var, vt4 vt4Var) {
        nq7 j;
        if (ut9Var != null) {
            j = new y5a(z, yu7Var, ut9Var, false, z2, xt9Var, vt4Var);
        } else if (ut9Var == null) {
            j = new y5a(z, yu7Var, null, false, z2, xt9Var, vt4Var);
        } else {
            kq7 kq7Var = kq7.a;
            if (yu7Var != null) {
                j = fu5.a(kq7Var, yu7Var, ut9Var).a0(new y5a(z, yu7Var, null, false, z2, xt9Var, vt4Var));
            } else {
                j = lye.j(kq7Var, new a6a(ut9Var, z, z2, xt9Var, vt4Var));
            }
        }
        return nq7Var.a0(j);
    }

    public static nq7 r(nq7 nq7Var, boolean z, xt9 xt9Var, vt4 vt4Var) {
        return nq7Var.a0(new y5a(z, null, null, true, true, xt9Var, vt4Var));
    }

    public static final nj1 s(ps psVar) {
        nj1 nj1Var;
        SpannableString spannableString;
        byte b2;
        if (psVar == null) {
            return null;
        }
        List c = psVar.c();
        CharSequence charSequence = psVar.b;
        if (!c.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            n07 n07Var = new n07(16, false);
            n07Var.b = Parcel.obtain();
            List c2 = psVar.c();
            int size = c2.size();
            int i = 0;
            SpannableString spannableString3 = spannableString2;
            while (i < size) {
                os osVar = (os) c2.get(i);
                uva uvaVar = (uva) osVar.a;
                int i2 = osVar.b;
                int i3 = osVar.c;
                ((Parcel) n07Var.b).recycle();
                n07Var.b = Parcel.obtain();
                mub mubVar = uvaVar.a;
                long j = uvaVar.l;
                long j2 = uvaVar.h;
                int i4 = i;
                long j3 = uvaVar.b;
                List list = c2;
                nj1 nj1Var2 = nj1Var;
                long a2 = mubVar.a();
                long j4 = zl1.i;
                if (!zl1.c(a2, j4)) {
                    n07Var.i((byte) 1);
                    spannableString = spannableString3;
                    ((Parcel) n07Var.b).writeLong(uvaVar.a.a());
                } else {
                    spannableString = spannableString3;
                }
                long j5 = e4c.c;
                byte b3 = 2;
                if (!e4c.a(j3, j5)) {
                    n07Var.i((byte) 2);
                    n07Var.l(j3);
                }
                dq4 dq4Var = uvaVar.c;
                if (dq4Var != null) {
                    n07Var.i((byte) 3);
                    ((Parcel) n07Var.b).writeInt(dq4Var.a);
                }
                wp4 wp4Var = uvaVar.d;
                if (wp4Var != null) {
                    int i5 = wp4Var.a;
                    n07Var.i((byte) 4);
                    if (i5 == 0 || i5 != 1) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                    n07Var.i(b2);
                }
                xp4 xp4Var = uvaVar.e;
                if (xp4Var != null) {
                    int i6 = xp4Var.a;
                    n07Var.i((byte) 5);
                    if (i6 != 0) {
                        if (i6 == 65535) {
                            b3 = 1;
                        } else if (i6 != 1) {
                            if (i6 == 2) {
                                b3 = 3;
                            }
                        }
                        n07Var.i(b3);
                    }
                    b3 = 0;
                    n07Var.i(b3);
                }
                String str = uvaVar.g;
                if (str != null) {
                    n07Var.i((byte) 6);
                    ((Parcel) n07Var.b).writeString(str);
                }
                if (!e4c.a(j2, j5)) {
                    n07Var.i((byte) 7);
                    n07Var.l(j2);
                }
                oi0 oi0Var = uvaVar.i;
                if (oi0Var != null) {
                    float f = oi0Var.a;
                    n07Var.i((byte) 8);
                    n07Var.j(f);
                }
                nub nubVar = uvaVar.j;
                if (nubVar != null) {
                    n07Var.i((byte) 9);
                    n07Var.j(nubVar.a);
                    n07Var.j(nubVar.b);
                }
                if (!zl1.c(j, j4)) {
                    n07Var.i((byte) 10);
                    ((Parcel) n07Var.b).writeLong(j);
                }
                gpb gpbVar = uvaVar.m;
                if (gpbVar != null) {
                    n07Var.i((byte) 11);
                    ((Parcel) n07Var.b).writeInt(gpbVar.a);
                }
                nea neaVar = uvaVar.n;
                if (neaVar != null) {
                    n07Var.i((byte) 12);
                    ((Parcel) n07Var.b).writeLong(neaVar.a);
                    long j6 = neaVar.b;
                    n07Var.j(Float.intBitsToFloat((int) (j6 >> 32)));
                    n07Var.j(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    n07Var.j(neaVar.c);
                }
                SpannableString spannableString4 = spannableString;
                spannableString4.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) n07Var.b).marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                nj1Var = nj1Var2;
                c2 = list;
                spannableString3 = spannableString4;
            }
            charSequence = spannableString3;
        }
        return new nj1(ClipData.newPlainText("plain text", charSequence));
    }

    public static gc5 t(dc5 dc5Var) {
        dc5Var.getClass();
        if (dc5Var instanceof bc5) {
            bc5 bc5Var = (bc5) dc5Var;
            String str = bc5Var.a;
            Map map = bc5Var.b;
            List<dc5> list = bc5Var.c;
            ArrayList arrayList = new ArrayList(tl1.s(list, 10));
            for (dc5 dc5Var2 : list) {
                arrayList.add(t(dc5Var2));
            }
            return new ec5(str, map, arrayList, bc5Var.d, bc5Var.e);
        } else if (dc5Var instanceof cc5) {
            cc5 cc5Var = (cc5) dc5Var;
            return new fc5(cc5Var.a, cc5Var.b, cc5Var.c);
        } else {
            xk5.o();
            return null;
        }
    }

    public static String u(char c) {
        switch (c) {
            case Token.THIS /* 48 */:
                return "không";
            case Token.FALSE /* 49 */:
                return "một";
            case Token.TRUE /* 50 */:
                return "hai";
            case Token.SHEQ /* 51 */:
                return "ba";
            case Token.SHNE /* 52 */:
                return "bốn";
            case Token.REGEXP /* 53 */:
                return "năm";
            case Token.BINDNAME /* 54 */:
                return "sáu";
            case Token.THROW /* 55 */:
                return "bảy";
            case Token.RETHROW /* 56 */:
                return "tám";
            case Token.IN /* 57 */:
                return "chín";
            default:
                return "";
        }
    }
}
