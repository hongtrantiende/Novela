package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ie2  reason: default package */
/* loaded from: classes3.dex */
public abstract class ie2 {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781};
    public static final tu1 e = new tu1(new nv1(6), false, 1437436872);
    public static final tu1 f = new tu1(new nv1(7), false, 1466748555);
    public static final tu1 g = new tu1(new mv1(13), false, 113685519);
    public static final tu1 h = new tu1(new mv1(14), false, -1038417565);
    public static final tu1 i = new tu1(new nv1(8), false, 358236350);
    public static final tu1 j = new tu1(new nv1(9), false, -723142783);
    public static final String[] k = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] l = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] m = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static final boolean A(z09 z09Var) {
        return !y78.d(z(z09Var, false), 0L);
    }

    public static final yha B(boolean z, boolean z2, xt4 xt4Var, rv4 rv4Var) {
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new yha(z, z2, r13Var, xt4Var);
            rv4Var.o0(P);
        }
        return (yha) P;
    }

    public static void C(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                xk5.k(nk2.s(i3, "at index ", new StringBuilder(String.valueOf(i3).length() + 9)));
                return;
            }
        }
    }

    public static final void a(int i2, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str, String str2, String str3) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        String str4;
        String str5;
        rv4Var.g0(1813244972);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(str3)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(vt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6 | 24576;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 y = zbe.y(lbe.f(15, vt4Var, nmd.v(tte.k(f2, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 2.0f), lre.g), null, false), 16.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p = lye.p(rv4Var, y);
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
            jce.F(npVar2, rv4Var, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            we6 f3 = s21.f(rv4Var, p, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            nq7Var = kq7Var;
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f3);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            if (str3 == null) {
                str4 = str;
            } else {
                str4 = str3;
            }
            cvb.c(str4, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.i, rv4Var, 0, 0, 131070);
            if (str3 != null) {
                str5 = str;
            } else {
                str5 = str2;
            }
            cvb.c(str5, null, ((h27) rv4Var.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 0, 0, 131066);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        nq7 nq7Var2 = nq7Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new he7(str, str2, str3, vt4Var, nq7Var2, i2);
        }
    }

    public static final void b(m9 m9Var, xt4 xt4Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        aw7 aw7Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-549656032);
        if (rv4Var2.d(m9Var.ordinal())) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var2.f(nq7Var)) {
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
        if (rv4Var2.U(i8 & 1, z)) {
            Map s = o17.s(new yk8(m9.c, yqe.A((y3b) v1b.M.getValue(), rv4Var2)), new yk8(m9.d, yqe.A((y3b) v1b.L.getValue(), rv4Var2)), new yk8(m9.e, yqe.A((y3b) v1b.N.getValue(), rv4Var2)));
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
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
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f2, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new nd7(aw7Var2, 7);
                rv4Var2.o0(P2);
            }
            nq7 z2 = zbe.z(lbe.f(15, (vt4) P2, v, null, false), 14.0f, 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, z2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            we6 f3 = s21.f(rv4Var2, p2, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l4);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            String A = yqe.A((y3b) v1b.K.getValue(), rv4Var2);
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.n;
            ly1 ly1Var = r12.a;
            cvb.c(A, null, zl1.b(0.62f, ((zl1) rv4Var2.j(ly1Var)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131066);
            String str = (String) s.get(m9Var);
            if (str == null) {
                str = "";
            }
            cvb.c(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 18.0f), zl1.b(0.6f, ((zl1) rv4Var2.j(ly1Var)).a), rv4Var2, 432, 0);
            rv4Var2.q(true);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                aw7Var = aw7Var2;
                P3 = new nd7(aw7Var, 8);
                rv4Var2.o0(P3);
            } else {
                aw7Var = aw7Var2;
            }
            iue.e(booleanValue, null, 0L, null, nae.e, null, (vt4) P3, jce.E(250453990, new g83(16, xt4Var, s, m9Var, aw7Var), rv4Var2), rv4Var2, 14155776, 62);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ax(m9Var, xt4Var, nq7Var, i2, 28);
        }
    }

    public static final void c(int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i3;
        int i4;
        int i5;
        boolean z;
        xt4 xt4Var2;
        boolean z2;
        Object gs9Var;
        mv6 mv6Var;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1497035070);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (rv4Var2.h(xt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.f(nq7Var)) {
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
        if (rv4Var2.U(i8 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = tl1.B("vi", "en", "zh", "ja", "ko", "fr", "de", "es", "ar", "cs", "el", "hi", "in", "it", "nl", "pl", "pt", "ru", "th", "tr", "uk");
                rv4Var2.o0(P);
            }
            List list = (List) P;
            if ((i8 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            String P2 = rv4Var2.P();
            if (z2 || P2 == lh9Var) {
                String j2 = rs8.j(str, '_', '-');
                j2 = (j2.length() == 0 || j2.equalsIgnoreCase("und")) ? null : null;
                if (j2 == null) {
                    mv6Var = null;
                } else {
                    try {
                        gs9Var = new mv6(xve.c(j2));
                    } catch (Throwable th) {
                        gs9Var = new gs9(th);
                    }
                    if (gs9Var instanceof gs9) {
                        gs9Var = null;
                    }
                    mv6Var = (mv6) gs9Var;
                }
                if (mv6Var != null) {
                    P2 = mv6Var.b();
                } else {
                    P2 = str;
                }
                rv4Var2.o0(P2);
            }
            String str3 = (String) P2;
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                P3 = yae.z(Boolean.FALSE);
                rv4Var2.o0(P3);
            }
            aw7 aw7Var = (aw7) P3;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
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
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f2, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g);
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var) {
                P4 = new nd7(aw7Var, 5);
                rv4Var2.o0(P4);
            }
            nq7 z3 = zbe.z(lbe.f(15, (vt4) P4, v, null, false), 14.0f, 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, z3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            we6 f3 = s21.f(rv4Var2, p2, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l4);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            String A = yqe.A((y3b) v1b.O.getValue(), rv4Var2);
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.n;
            ly1 ly1Var = r12.a;
            cvb.c(A, null, zl1.b(0.62f, ((zl1) rv4Var2.j(ly1Var)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131066);
            if (str3.length() == 0) {
                str2 = "-";
            } else {
                str2 = str3;
            }
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 18.0f), zl1.b(0.6f, ((zl1) rv4Var2.j(ly1Var)).a), rv4Var2, 432, 0);
            rv4Var2.q(true);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P5 = rv4Var2.P();
            if (P5 == lh9Var) {
                P5 = new nd7(aw7Var, 6);
                rv4Var2.o0(P5);
            }
            xt4Var2 = xt4Var;
            iue.e(booleanValue, null, 0L, null, nae.e, null, (vt4) P5, jce.E(1136492856, new ox0(list, str, xt4Var, aw7Var, 2), rv4Var2), rv4Var2, 14155776, 62);
            rv4Var2.q(true);
        } else {
            xt4Var2 = xt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ge7(str, xt4Var2, nq7Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.nq7 r32, boolean r33, float r34, boolean r35, defpackage.rv4 r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie2.d(nq7, boolean, float, boolean, rv4, int, int):void");
    }

    public static final long e(float f2, float f3, float f4, float f5, float f6, float f7, aa7 aa7Var) {
        float sin;
        float f8 = aa7Var.a;
        float f9 = aa7Var.b;
        float f10 = f8 + f9;
        float f11 = (0.4f * f10) + 0.8f;
        float f12 = f10 * 1.5f * 3.1415927f;
        float sin2 = (aa7Var.c * ((float) Math.sin((((f8 * 0.5f) + 1.0f) * f2) + (2.0f * f8 * 3.1415927f)))) + f8;
        float cos = (aa7Var.d * ((float) Math.cos((((0.6f * f9) + 1.2f) * f2) + (3.0f * f9 * 3.1415927f)))) + f9;
        float f13 = aa7Var.a - 0.5f;
        float f14 = f9 - 0.5f;
        float sqrt = ((f3 * 1.6f) - (((float) Math.sqrt((f14 * f14) + (f13 * f13))) * ((float) Math.sqrt(2.0d)))) / 0.25f;
        float f15 = nae.e;
        if (f3 > nae.e && nae.e <= sqrt && sqrt <= 1.0f) {
            f15 = nk2.c(f3, 0.5f, 1.0f, ((float) Math.sin(sqrt * 3.1415927f)) * 0.35f);
        }
        float sin3 = (aa7Var.f * ((float) Math.sin((f2 * f11) + f12))) + f15;
        float f16 = (cos - 0.5f) * 2.8f;
        float cos2 = (((float) Math.cos(0.1745329350233078d)) * f16) - (((float) Math.sin(0.1745329350233078d)) * sin3);
        float cos3 = sin3 * ((float) Math.cos(0.1745329350233078d));
        float f17 = aa7Var.e * 60.0f;
        float f18 = f5 * f17;
        float f19 = f17 * f7;
        return (Float.floatToRawIntBits(f19 + (f6 * 0.5f) + (cos2 * sin * f6 * 0.48f)) & 4294967295L) | (Float.floatToRawIntBits(f18 + ((f4 * 0.5f) + (((((sin2 - 0.5f) * 3.8f) * (1.6f / (1.6f - (cos3 + (f16 * ((float) Math.sin(0.1745329350233078d))))))) * f4) * 0.48f))) << 32);
    }

    public static final void f(int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        nq7 nq7Var2;
        pb2 pb2Var;
        xt4Var.getClass();
        rv4Var.g0(1733704013);
        if (rv4Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2 | 384;
        if ((i4 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                final s9 s9Var = (s9) ((fdd) voe.z(cm9.a(s9.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z4 = jsc.z(s9Var.d, rv4Var);
                Object obj = (kb) rv4Var.j(yb.a);
                s02 s02Var = s9Var.e;
                boolean f2 = rv4Var.f(obj);
                Object P = rv4Var.P();
                Object obj2 = ax1.a;
                if (f2 || P == obj2) {
                    P = new we1(obj, xt4Var, (m42) null, 11);
                    rv4Var.o0(P);
                }
                jye.b(s02Var, null, (mu4) P, rv4Var, 0);
                zu8 zu8Var = new zu8(tl1.A("onnx"));
                boolean f3 = rv4Var.f(s9Var);
                Object P2 = rv4Var.P();
                if (f3 || P2 == obj2) {
                    P2 = new xt4() { // from class: fe7
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj3) {
                            Object value;
                            q9 q9Var;
                            String str;
                            Object value2;
                            int i5 = r2;
                            pvc pvcVar = pvc.a;
                            s9 s9Var2 = s9Var;
                            switch (i5) {
                                case 0:
                                    f76 f76Var = (f76) obj3;
                                    cza czaVar = s9Var2.d;
                                    if (czaVar != null) {
                                        do {
                                            value = czaVar.getValue();
                                            q9Var = (q9) value;
                                            if (k4b.j0(q9Var.c) && f76Var != null) {
                                                str = k4b.J0(f76Var.getName(), ".");
                                            } else {
                                                str = q9Var.c;
                                            }
                                        } while (!czaVar.l(value, q9.a(q9Var, f76Var, null, str, null, null, false, 58)));
                                        return pvcVar;
                                    }
                                    return pvcVar;
                                default:
                                    f76 f76Var2 = (f76) obj3;
                                    cza czaVar2 = s9Var2.d;
                                    if (czaVar2 != null) {
                                        do {
                                            value2 = czaVar2.getValue();
                                        } while (!czaVar2.l(value2, q9.a((q9) value2, null, f76Var2, null, null, null, false, 61)));
                                        return pvcVar;
                                    }
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P2);
                }
                kd4 v = w92.v(zu8Var, (xt4) P2, rv4Var, 8);
                zu8 zu8Var2 = new zu8(tl1.A("txt"));
                boolean f4 = rv4Var.f(s9Var);
                Object P3 = rv4Var.P();
                if (f4 || P3 == obj2) {
                    P3 = new xt4() { // from class: fe7
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj3) {
                            Object value;
                            q9 q9Var;
                            String str;
                            Object value2;
                            int i5 = r2;
                            pvc pvcVar = pvc.a;
                            s9 s9Var2 = s9Var;
                            switch (i5) {
                                case 0:
                                    f76 f76Var = (f76) obj3;
                                    cza czaVar = s9Var2.d;
                                    if (czaVar != null) {
                                        do {
                                            value = czaVar.getValue();
                                            q9Var = (q9) value;
                                            if (k4b.j0(q9Var.c) && f76Var != null) {
                                                str = k4b.J0(f76Var.getName(), ".");
                                            } else {
                                                str = q9Var.c;
                                            }
                                        } while (!czaVar.l(value, q9.a(q9Var, f76Var, null, str, null, null, false, 58)));
                                        return pvcVar;
                                    }
                                    return pvcVar;
                                default:
                                    f76 f76Var2 = (f76) obj3;
                                    cza czaVar2 = s9Var2.d;
                                    if (czaVar2 != null) {
                                        do {
                                            value2 = czaVar2.getValue();
                                        } while (!czaVar2.l(value2, q9.a((q9) value2, null, f76Var2, null, null, null, false, 61)));
                                        return pvcVar;
                                    }
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P3);
                }
                nq7Var2 = kq7.a;
                z3 = z;
                nmd.d(z3, xt4Var, nq7Var2, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-164949135, new g83(v, w92.v(zu8Var2, (xt4) P3, rv4Var, 8), s9Var, z4, 15), rv4Var), rv4Var, (i4 & 14) | 3504, 48, 2032);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            z3 = z;
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new t32(z3, xt4Var, nq7Var2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, ped] */
    public static final void g(s8c s8cVar, nq7 nq7Var, int i2, rv4 rv4Var, int i3) {
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        nq7 nq7Var2;
        int i6;
        int i7;
        final s8c s8cVar2 = s8cVar;
        s8cVar2.getClass();
        rv4Var.g0(-1979862078);
        if ((i3 & 6) == 0) {
            if (rv4Var.f(s8cVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i3 | i7;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i8 = i4 | 384;
        boolean z6 = true;
        if ((i8 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            Object obj = P;
            if (P == lh9Var) {
                ?? obj2 = new Object();
                obj2.a = 0L;
                obj2.b = 0L;
                rv4Var.o0(obj2);
                obj = obj2;
            }
            final ped pedVar = (ped) obj;
            final long b2 = ((zk6) ((oid) rv4Var.j(dy1.u))).b();
            boolean h2 = rv4Var.h(pedVar);
            int i9 = i8 & 14;
            if (i9 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean e2 = h2 | z2 | rv4Var.e(b2);
            int i10 = i8 & 896;
            if (i10 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z3 | e2;
            Object P2 = rv4Var.P();
            if (z7 || P2 == lh9Var) {
                xt4 xt4Var = new xt4() { // from class: o8c
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj3) {
                        int i11 = r5;
                        pvc pvcVar = pvc.a;
                        long j2 = b2;
                        s8c s8cVar3 = s8cVar2;
                        ped pedVar2 = pedVar;
                        switch (i11) {
                            case 0:
                                long j3 = ((zy5) obj3).a;
                                pedVar2.a = j3;
                                s8cVar3.d.setValue(new zy5(j3));
                                ie2.n(s8cVar3, pedVar2, j2);
                                return pvcVar;
                            default:
                                sc6 sc6Var = (sc6) obj3;
                                sc6Var.getClass();
                                pedVar2.b = sc6Var.m(0L);
                                ie2.n(s8cVar3, pedVar2, j2);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(xt4Var);
                P2 = xt4Var;
            }
            nq7 l2 = pbe.l(nq7Var, (xt4) P2);
            boolean h3 = rv4Var.h(pedVar);
            if (i9 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean e3 = h3 | z4 | rv4Var.e(b2);
            if (i10 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = e3 | z5;
            Object P3 = rv4Var.P();
            if (!z8 && P3 != lh9Var) {
                s8cVar2 = s8cVar;
                nq7Var2 = l2;
            } else {
                nq7Var2 = l2;
                s8cVar2 = s8cVar;
                xt4 xt4Var2 = new xt4() { // from class: o8c
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj3) {
                        int i11 = r5;
                        pvc pvcVar = pvc.a;
                        long j2 = b2;
                        s8c s8cVar3 = s8cVar2;
                        ped pedVar2 = pedVar;
                        switch (i11) {
                            case 0:
                                long j3 = ((zy5) obj3).a;
                                pedVar2.a = j3;
                                s8cVar3.d.setValue(new zy5(j3));
                                ie2.n(s8cVar3, pedVar2, j2);
                                return pvcVar;
                            default:
                                sc6 sc6Var = (sc6) obj3;
                                sc6Var.getClass();
                                pedVar2.b = sc6Var.m(0L);
                                ie2.n(s8cVar3, pedVar2, j2);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(xt4Var2);
                P3 = xt4Var2;
            }
            nq7 y = obe.y(nq7Var2, (xt4) P3);
            if (i9 != 4) {
                z6 = false;
            }
            Object P4 = rv4Var.P();
            if (z6 || P4 == lh9Var) {
                P4 = new zub(s8cVar2, 3);
                rv4Var.o0(P4);
            }
            bce.a(y, (xt4) P4, rv4Var, 0);
            i5 = 2;
        } else {
            rv4Var.X();
            i5 = i2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ns1(i5, i3, 6, s8cVar2, nq7Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p51] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kq9, java.lang.Object] */
    public static s51 h(hz2 hz2Var) {
        ?? obj = new Object();
        obj.c = new Object();
        s51 s51Var = new s51(obj);
        obj.b = s51Var;
        obj.a = a82.class;
        try {
            hz2Var.invokeOnCompletion(new jk(8, obj, hz2Var));
            obj.a = "Deferred.asListenableFuture";
            return s51Var;
        } catch (Exception e2) {
            s51Var.b.k(e2);
            return s51Var;
        }
    }

    public static final Object i(f03 f03Var, vt4 vt4Var, n42 n42Var) {
        vu0 vu0Var;
        i38 u;
        Object l0;
        kn knVar;
        if (((mq7) f03Var).a.J) {
            mq7 mq7Var = (mq7) f03Var;
            if (!mq7Var.a.J) {
                lv5.c("visitAncestors called on an unattached node");
            }
            mq7 mq7Var2 = mq7Var.a.e;
            od6 v = voe.v(f03Var);
            loop0: while (true) {
                vu0Var = null;
                if (v == null) {
                    break;
                }
                if ((((mq7) v.c0.C).d & 524288) != 0) {
                    while (mq7Var2 != null) {
                        if ((mq7Var2.c & 524288) != 0) {
                            mq7 mq7Var3 = mq7Var2;
                            gw7 gw7Var = null;
                            while (mq7Var3 != null) {
                                if (mq7Var3 instanceof vu0) {
                                    vu0Var = mq7Var3;
                                    break loop0;
                                }
                                if ((mq7Var3.c & 524288) != 0 && (mq7Var3 instanceof m03)) {
                                    int i2 = 0;
                                    for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                        if ((mq7Var4.c & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                mq7Var3 = mq7Var4;
                                            } else {
                                                if (gw7Var == null) {
                                                    gw7Var = new gw7(new mq7[16], 0);
                                                }
                                                if (mq7Var3 != null) {
                                                    gw7Var.b(mq7Var3);
                                                    mq7Var3 = null;
                                                }
                                                gw7Var.b(mq7Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                mq7Var3 = voe.h(gw7Var);
                            }
                            continue;
                        }
                        mq7Var2 = mq7Var2.e;
                    }
                }
                v = v.v();
                if (v != null && (knVar = v.c0) != null) {
                    mq7Var2 = (hkb) knVar.f;
                } else {
                    mq7Var2 = null;
                }
            }
            vu0 vu0Var2 = vu0Var;
            if (vu0Var2 != null && (l0 = vu0Var2.l0((u = voe.u(f03Var)), new hg(3, vt4Var, u), n42Var)) == n82.a) {
                return l0;
            }
        }
        return pvc.a;
    }

    public static final boolean j(z09 z09Var) {
        if (!z09Var.c() && !z09Var.h && z09Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean k(z09 z09Var) {
        if (!z09Var.h && z09Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean l(z09 z09Var) {
        if (!z09Var.c() && z09Var.h && !z09Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean m(z09 z09Var) {
        if (z09Var.h && !z09Var.d) {
            return true;
        }
        return false;
    }

    public static final void n(s8c s8cVar, ped pedVar, long j2) {
        int i2;
        long j3 = pedVar.a;
        long j4 = pedVar.b;
        int i3 = (int) (j3 >> 32);
        rk9 rk9Var = rk9.e;
        if (i3 > 0 && (i2 = (int) (j3 & 4294967295L)) > 0) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            float f2 = i3;
            float f3 = i2;
            float f4 = (int) (j2 >> 32);
            float f5 = f4 * 2.0f;
            float f6 = (int) (j2 & 4294967295L);
            float f7 = 2.0f * f6;
            float max = Math.max(intBitsToFloat, -f5) - intBitsToFloat;
            float max2 = Math.max(intBitsToFloat2, -f7) - intBitsToFloat2;
            float min = Math.min(intBitsToFloat + f2, f4 + f5) - intBitsToFloat;
            float min2 = Math.min(intBitsToFloat2 + f3, f6 + f7) - intBitsToFloat2;
            if (min > max && min2 > max2) {
                rk9Var = new rk9(dce.m(max, nae.e, f2), dce.m(max2, nae.e, f3), dce.m(min, nae.e, f2), dce.m(min2, nae.e, f3));
            }
        }
        if (!c16.i((rk9) s8cVar.e.getValue(), rk9Var)) {
            s8cVar.e.setValue(rk9Var);
        }
    }

    public static final Object o(r36 r36Var, s76 s76Var, wj9 wj9Var) {
        r36Var.getClass();
        s76Var.getClass();
        uh9 q = fce.q(r36Var, new eb5(wj9Var), yb1.d.H(16384));
        try {
            Object d2 = new m1b(r36Var, znd.c, q, s76Var.e(), null).d(s76Var);
            q.p();
            return d2;
        } finally {
            q.G();
        }
    }

    public static final b9a p(r36 r36Var, psa psaVar, s76 s76Var) {
        r36Var.getClass();
        psaVar.getClass();
        s76Var.getClass();
        return jsc.C(r36Var, new eb5(psaVar), s76Var, uq2.c);
    }

    public static final void q(r36 r36Var, s76 s76Var, Object obj, uj9 uj9Var) {
        r36Var.getClass();
        s76Var.getClass();
        jsc.D(r36Var, new uwd(uj9Var, 24), s76Var, obj);
    }

    public static final hn8 r(pe4 pe4Var) {
        pe4Var.getClass();
        return hn8.f(k73.a().a(), "books");
    }

    public static final hn8 s(pe4 pe4Var) {
        pe4Var.getClass();
        ck a2 = k73.a();
        a2.getClass();
        String str = hn8.b;
        String absolutePath = a2.a.getCacheDir().getAbsolutePath();
        absolutePath.getClass();
        return fn8.d(absolutePath, false);
    }

    public static final hn8[] t(pe4 pe4Var) {
        hn8 hn8Var;
        String absolutePath;
        pe4Var.getClass();
        ck a2 = k73.a();
        File[] externalFilesDirs = a2.a.getExternalFilesDirs(null);
        externalFilesDirs.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : externalFilesDirs) {
            if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                String str = hn8.b;
                hn8Var = fn8.d(absolutePath, false);
            } else {
                hn8Var = null;
            }
            if (hn8Var != null) {
                arrayList.add(hn8Var);
            }
        }
        Object[] array = arrayList.toArray(new hn8[0]);
        if (array.length == 0) {
            array = new hn8[]{a2.a()};
        }
        return (hn8[]) array;
    }

    public static final hn8 u(pe4 pe4Var) {
        pe4Var.getClass();
        return k73.a().a();
    }

    public static final m66 v() {
        return pe4.a;
    }

    public static final boolean w(z09 z09Var, long j2, long j3) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (z09Var.i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        long j4 = z09Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        float f4 = ((int) (j2 & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 > f4) {
            z4 = true;
        }
        return z6 | z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r6 == (-1)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zg1 x(java.lang.String r19) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = defpackage.nxe.y(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcf
            ms5 r2 = defpackage.qs5.b
            mm9 r2 = defpackage.mm9.e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = defpackage.nxe.y(r0, r8)
            r9 = 2
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = r2
        L36:
            r7 = 4
            if (r6 >= r7) goto Lc8
            java.lang.String[] r8 = defpackage.ie2.k
            r8 = r8[r6]
            java.lang.String r8 = defpackage.nxe.v(r0, r8)
            if (r8 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r8)
            r8 = 1
            if (r6 != r8) goto Lc8
            r6 = r2
        L4b:
            if (r6 >= r7) goto L61
            java.lang.String[] r8 = defpackage.ie2.l
            r8 = r8[r6]
            java.lang.String r8 = defpackage.nxe.v(r0, r8)
            if (r8 == 0) goto L63
            long r6 = java.lang.Long.parseLong(r8)
            r10 = -1
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L66
        L61:
            r6 = r4
            goto L66
        L63:
            int r6 = r6 + 1
            goto L4b
        L66:
            if (r2 >= r9) goto L93
            java.lang.String[] r8 = defpackage.ie2.m
            r8 = r8[r2]
            java.lang.String r8 = defpackage.nxe.v(r0, r8)
            if (r8 == 0) goto L90
            long r11 = java.lang.Long.parseLong(r8)
            or7 r13 = new or7
            r14 = 0
            r16 = 0
            java.lang.String r18 = "image/jpeg"
            r13.<init>(r14, r16, r18)
            r2 = r13
            or7 r10 = new or7
            java.lang.String r15 = "video/mp4"
            r13 = 0
            r10.<init>(r11, r13, r15)
            mm9 r2 = defpackage.qs5.s(r2, r10)
            goto Lbc
        L90:
            int r2 = r2 + 1
            goto L66
        L93:
            ms5 r2 = defpackage.qs5.b
            mm9 r2 = defpackage.mm9.e
            goto Lbc
        L98:
            int r6 = r6 + 1
            goto L36
        L9b:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = defpackage.nxe.y(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            mm9 r2 = y(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = defpackage.nxe.y(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            mm9 r2 = y(r0, r2, r8)
        Lbc:
            boolean r8 = defpackage.nxe.x(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc9
        Lc8:
            return r3
        Lc9:
            zg1 r0 = new zg1
            r0.<init>(r6, r2, r9)
            return r0
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            xm8 r0 = defpackage.xm8.a(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie2.x(java.lang.String):zg1");
    }

    public static mm9 y(XmlPullParser xmlPullParser, String str, String str2) {
        long j2;
        ls5 i2 = qs5.i();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (nxe.y(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String v = nxe.v(xmlPullParser, concat3);
                String v2 = nxe.v(xmlPullParser, concat4);
                String v3 = nxe.v(xmlPullParser, concat5);
                String v4 = nxe.v(xmlPullParser, concat6);
                if (v != null && v2 != null) {
                    long j3 = 0;
                    if (v3 != null) {
                        j2 = Long.parseLong(v3);
                    } else {
                        j2 = 0;
                    }
                    if (v4 != null) {
                        j3 = Long.parseLong(v4);
                    }
                    i2.b(new or7(j2, j3, v));
                } else {
                    return mm9.e;
                }
            }
        } while (!nxe.x(xmlPullParser, concat2));
        return i2.g();
    }

    public static final long z(z09 z09Var, boolean z) {
        long i2 = y78.i(z09Var.c, z09Var.g);
        if (!z && z09Var.c()) {
            return 0L;
        }
        return i2;
    }
}
