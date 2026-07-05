package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.List;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ape  reason: default package */
/* loaded from: classes3.dex */
public abstract class ape {
    public static final tu1 a;
    public static final tu1 b;
    public static final tu1 c;
    public static final String[] d;

    static {
        new tu1(new wu1(0), false, 208584043);
        a = new tu1(new xu1(6), false, 1389159917);
        b = new tu1(new tv1(20), false, -1643121069);
        c = new tu1(new tv1(21), false, 687314762);
        d = new String[]{"#F2C24F", "#EE7950", "#97C15C", "#60C3D7"};
    }

    public static final void a(final float f, final float f2, final tu1 tu1Var, final nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-701397194);
        if ((i & 6) == 0) {
            if (rv4Var.c(f)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.c(f2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
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
        if (rv4Var.U(i2 & 1, z)) {
            v72 v72Var = ((h27) rv4Var.j(j27.a)).c.c;
            nq7 a0 = zbe.C(qwe.r(pna.v(nq7Var), f, f), 16.0f, nae.e, 16.0f, f2, 2).a0(nq7Var);
            if (true & true) {
                f3 = nae.e;
            } else {
                f3 = 4.0f;
            }
            jce.b(a0, v72Var, null, new w61(f3, zve.f, zve.e), jce.E(57969064, new z0a(tu1Var, 6), rv4Var), rv4Var, 196608);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: vxa
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ape.a(f, f2, tu1Var, nq7Var, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(final String str, final List list, final int i, final nq7 nq7Var, boolean z, final xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj;
        int i10;
        int i11;
        boolean z2;
        final boolean z3;
        final vt4 vt4Var2;
        boolean z4;
        vt4 vt4Var3;
        boolean z5;
        vt4 vt4Var4;
        int i12;
        aw7 aw7Var;
        int i13;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(636504481);
        if (rv4Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i14 = i4 | i2;
        if (rv4Var2.f(list)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i15 = i14 | i5;
        if (rv4Var2.d(i)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i16 = i15 | i6;
        if ((i2 & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i16 |= i13;
        }
        int i17 = i3 & 16;
        if (i17 != 0) {
            i8 = i16 | 24576;
        } else {
            if (rv4Var2.g(z)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i8 = i16 | i7;
        }
        if (rv4Var2.h(xt4Var)) {
            i9 = 131072;
        } else {
            i9 = Parser.ARGC_LIMIT;
        }
        int i18 = i8 | i9;
        int i19 = i3 & 64;
        if (i19 != 0) {
            i11 = i18 | 1572864;
            obj = vt4Var;
        } else {
            obj = vt4Var;
            if (rv4Var2.h(obj)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i11 = i18 | i10;
        }
        if ((599187 & i11) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i11 & 1, z2)) {
            if (i17 != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            lh9 lh9Var = ax1.a;
            if (i19 != 0) {
                Object P = rv4Var2.P();
                if (P == lh9Var) {
                    P = new cd1(15);
                    rv4Var2.o0(P);
                }
                vt4Var3 = (vt4) P;
            } else {
                vt4Var3 = obj;
            }
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = yae.z(Boolean.FALSE);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var2 = (aw7) P2;
            int i20 = i11 >> 9;
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
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
            int i21 = i11;
            nq7 f = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g);
            if ((i21 & Token.ASSIGN_MOD) != 32) {
                z5 = false;
            } else {
                z5 = true;
            }
            Object P3 = rv4Var2.P();
            if (z5 || P3 == lh9Var) {
                P3 = new mm7(3, list, aw7Var2);
                rv4Var2.o0(P3);
            }
            nq7 z6 = zbe.z(lbe.f(15, (vt4) P3, v, null, false), 14.0f, 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, z6);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            we6 f2 = s21.f(rv4Var2, p2, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            String str2 = null;
            j(str, null, rv4Var2, i21 & 14);
            gh1 gh1Var = (gh1) sl1.f0(i, list);
            if (gh1Var != null) {
                str2 = gh1Var.a;
            }
            if (str2 == null) {
                str2 = "";
            }
            cvb.c(str2, pna.f(kq7Var, 1.0f), zl1.b(0.62f, ((zl1) rv4Var2.j(r12.a)).a), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 48, 24960, 109560);
            rv4Var.q(true);
            if (z4) {
                rv4Var.e0(-897473020);
                i12 = 0;
                vt4 vt4Var5 = vt4Var3;
                kwe.d(rp5.c((wk3) ok3.p0.getValue(), rv4Var, 0), null, 0L, vt4Var5, rv4Var, i20 & 7168, 6);
                vt4Var4 = vt4Var5;
                rv4Var.q(false);
            } else {
                vt4Var4 = vt4Var3;
                i12 = 0;
                rv4Var.e0(-897301001);
                rv4Var.q(false);
            }
            xbe.i(rv4Var, pna.s(kq7Var, 8.0f));
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var, i12), null, pna.n(kq7Var, 18.0f), zl1.b(0.6f, ((h27) rv4Var.j(tzaVar)).a.q), rv4Var, 432, 0);
            rv4Var.q(true);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            nk0 nk0Var = kh5.f;
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                aw7Var = aw7Var2;
                P4 = new ao7(aw7Var, 4);
                rv4Var.o0(P4);
            } else {
                aw7Var = aw7Var2;
            }
            iue.e(booleanValue, nk0Var, 0L, kq7Var, nae.e, null, (vt4) P4, jce.E(303791771, new qm7(list, i, xt4Var, aw7Var, 1), rv4Var), rv4Var, 14158896, 52);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            vt4Var2 = vt4Var4;
            z3 = z4;
        } else {
            rv4Var2.X();
            z3 = z;
            vt4Var2 = obj;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: no7
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ape.b(str, list, i, nq7Var, z3, xt4Var, vt4Var2, (rv4) obj2, xoe.p(i2 | 1), i3);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r38, final java.lang.String r39, boolean r40, int r41, int r42, defpackage.t86 r43, final defpackage.nq7 r44, final defpackage.xt4 r45, defpackage.rv4 r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ape.c(java.lang.String, java.lang.String, boolean, int, int, t86, nq7, xt4, rv4, int, int):void");
    }

    public static final void d(final boolean z, final String str, final String str2, String str3, final boolean z2, final int i, final int i2, final t86 t86Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, final int i3) {
        int i4;
        boolean z3;
        final String str4;
        String str5;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        rv4Var.g0(908330413);
        if ((i3 & 6) == 0) {
            if (rv4Var.g(z)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i4 = i13 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (rv4Var.f(str)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i4 |= i12;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var.f(str2)) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i4 |= i11;
        }
        int i14 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            if (rv4Var.g(z2)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i14 |= i10;
        }
        if ((196608 & i3) == 0) {
            if (rv4Var.d(i)) {
                i9 = 131072;
            } else {
                i9 = Parser.ARGC_LIMIT;
            }
            i14 |= i9;
        }
        if ((1572864 & i3) == 0) {
            if (rv4Var.d(i2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i14 |= i8;
        }
        if ((12582912 & i3) == 0) {
            if (rv4Var.f(t86Var)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i14 |= i7;
        }
        if ((100663296 & i3) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i14 |= i6;
        }
        if ((805306368 & i3) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i14 |= i5;
        }
        int i15 = i14;
        boolean z4 = false;
        if ((306783379 & i15) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i15 & 1, z3)) {
            rv4Var.Z();
            if ((i3 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                str5 = str3;
            } else {
                str5 = "";
            }
            rv4Var.r();
            if ((i15 & 896) == 256) {
                z4 = true;
            }
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                int length = str2.length();
                P = yae.z(new jub(str2, sze.a(length, length), 4));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            String str6 = str5;
            xb.d(z, xt4Var, jce.E(345588737, new yd7(xt4Var, xt4Var2, aw7Var, str2), rv4Var), null, mwe.x(kq7.a, 14), jce.E(-735790396, new zd7(1, xt4Var, aw7Var, str2), rv4Var), jce.E(-1096250107, new jd1(str, 22), rv4Var), null, 0L, 0L, nae.e, false, false, jce.E(1481804377, new eh1(aw7Var, t86Var, z2, i, i2, str6, str), rv4Var), rv4Var, (i15 & 14) | 1769856 | ((i15 >> 21) & Token.ASSIGN_MOD), 8072);
            str4 = str6;
        } else {
            rv4Var.X();
            str4 = str3;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: po7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ape.d(z, str, str2, str4, z2, i, i2, t86Var, xt4Var, xt4Var2, (rv4) obj, xoe.p(i3 | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void e(boolean z, boolean z2, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        xt4Var.getClass();
        rv4Var.g0(-1663776264);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i;
        if ((i & 48) == 0) {
            if (rv4Var.g(z2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i7 |= i5;
        }
        if (rv4Var.h(xt4Var2)) {
            i3 = 16384;
        } else {
            i3 = 8192;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 131072;
        } else {
            i4 = Parser.ARGC_LIMIT;
        }
        int i9 = i8 | i4;
        if ((74771 & i9) != 74770) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i9 & 1, z3)) {
            if (z2) {
                rv4Var.e0(-1635822505);
                int i10 = i9 & 14;
                int i11 = i9 >> 3;
                g(z, null, xt4Var, xt4Var2, vt4Var, rv4Var, i10 | (i11 & 896) | (i11 & 7168) | (57344 & i11));
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1635575342);
                int i12 = i9 & 14;
                int i13 = i9 >> 3;
                f(z, null, xt4Var, xt4Var2, vt4Var, rv4Var, i12 | (i13 & 896) | (i13 & 7168) | (57344 & i13));
                rv4Var.q(false);
            }
            nq7Var = kq7.a;
        } else {
            rv4Var.X();
        }
        nq7 nq7Var2 = nq7Var;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sb3(z, z2, nq7Var2, xt4Var, xt4Var2, vt4Var, i);
        }
    }

    public static final void f(boolean z, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        kq7 kq7Var;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-107482386);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i7 |= i3;
        }
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            kq7 kq7Var2 = kq7.a;
            hc2.b(kq7Var2, null, jce.E(1077503320, new xsa(4, xt4Var, xt4Var2, vt4Var, z), rv4Var), rv4Var, ((i7 >> 3) & 14) | 3072, 6);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mo7(z, kq7Var, xt4Var, xt4Var2, vt4Var, i, 0);
        }
    }

    public static final void g(boolean z, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z2;
        kq7 kq7Var;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(773722083);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        } else {
            obj = xt4Var;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i7 |= i3;
        }
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            tu1 E = jce.E(1648939220, new oo7(vt4Var, xt4Var2), rv4Var);
            int i8 = (i7 & 14) | 805309440 | ((i7 >> 3) & Token.ASSIGN_MOD) | ((i7 << 3) & 896);
            kq7 kq7Var2 = kq7.a;
            nmd.f(z, obj, kq7Var2, true, 0L, 0L, nae.e, 0L, nae.e, E, rv4Var, i8, 496);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mo7(z, kq7Var, xt4Var, xt4Var2, vt4Var, i, 1);
        }
    }

    public static final void h(final sxa sxaVar, float f, float f2, final vt4 vt4Var, nq7 nq7Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f3;
        rv4 rv4Var2;
        final float f4;
        final nq7 nq7Var2;
        rv4Var.g0(2570796);
        if (rv4Var.f(sxaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i;
        if (rv4Var.c(f)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.c(f2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.f(nq7Var)) {
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
        if (rv4Var.U(i11 & 1, z)) {
            int i12 = i11 >> 3;
            f3 = f2;
            rv4Var2 = rv4Var;
            a(f, f3, jce.E(307230189, new el7(sxaVar, vt4Var), rv4Var), nq7Var, rv4Var2, (i12 & 14) | 384 | (i12 & Token.ASSIGN_MOD) | (i12 & 7168));
            f4 = f;
            nq7Var2 = nq7Var;
        } else {
            f3 = f2;
            rv4Var2 = rv4Var;
            f4 = f;
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            final float f5 = f3;
            u.d = new lu4(f4, f5, vt4Var, nq7Var2, i) { // from class: xxa
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ vt4 d;
                public final /* synthetic */ nq7 e;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    ape.h(sxa.this, this.b, this.c, this.d, this.e, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(boolean z, yp8 yp8Var, List list, nq7 nq7Var, boolean z2, String str, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        String str2;
        list.getClass();
        xt4Var.getClass();
        rv4Var.g0(798038026);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(yp8Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(list)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4 | 221184;
        if (rv4Var.h(xt4Var)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        int i9 = i8 | i5;
        if ((4793491 & i9) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i9 & 1, z3)) {
            WeakHashMap weakHashMap = yjd.w;
            rp rpVar = h88.n(rv4Var).b;
            tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yae.z(null);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            if (yp8Var != null) {
                aw7Var.setValue(yp8Var);
            }
            hc2.b(nq7Var, null, jce.E(-1923967648, new gj7(z, yp8Var, rpVar, tc6Var, aw7Var, list, xt4Var2, xt4Var), rv4Var), rv4Var, 3078, 6);
            str2 = "";
            z4 = true;
        } else {
            rv4Var.X();
            z4 = z2;
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kw0(z, yp8Var, list, nq7Var, z4, str2, xt4Var, xt4Var2, i);
        }
    }

    public static final void j(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        int i3;
        rv4Var.g0(-1195877089);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.j;
            long j = ((h27) rv4Var.j(tzaVar)).a.q;
            int i5 = i4 & Token.ELSE;
            nq7Var2 = kq7.a;
            cvb.c(str, nq7Var2, j, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oybVar, rv4Var, i5, 24960, 110584);
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ma(str, nq7Var2, i, 4);
        }
    }

    public static final void k(List list, rxa rxaVar, vt4 vt4Var, boolean z, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        lz3 v;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h;
        int i8;
        final List list2 = list;
        rxa rxaVar2 = rxaVar;
        rv4 rv4Var2 = rv4Var;
        list2.getClass();
        rxaVar2.getClass();
        lf4 lf4Var = rxaVar2.b;
        vt4Var.getClass();
        rv4Var2.g0(532895194);
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
            if (rv4Var2.d(Integer.MAX_VALUE)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.d(rxaVar2.ordinal())) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        Object obj = vt4Var;
        if ((i & 3072) == 0) {
            if (rv4Var2.h(obj)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.g(z)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            int size = list2.size();
            b37 d2 = fu0.d(kh5.b, false);
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
            rv4Var2.e0(635711045);
            int i9 = 0;
            for (Object obj2 : list2) {
                int i10 = i9 + 1;
                if (i9 >= 0) {
                    final sxa sxaVar = (sxa) obj2;
                    int i11 = size - 1;
                    float abs = Math.abs(i9 - i11);
                    final yya b2 = nq.b(1.0f - (0.05f * abs), lf4Var, null, rv4Var2, 0, 28);
                    final yya b3 = nq.b(nae.e, lf4Var, null, rv4Var, 6, 28);
                    lf4 lf4Var2 = lf4Var;
                    final yya a2 = nq.a((abs * 6.0f) + 6.0f, rxaVar2.a, null, rv4Var, 0, 12);
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (P == lh9Var) {
                        P = yae.z(Float.valueOf(-1.0f));
                        rv4Var.o0(P);
                    }
                    final aw7 aw7Var = (aw7) P;
                    if (i11 == i9) {
                        z3 = z;
                    } else {
                        z3 = true;
                    }
                    lf4 lf4Var3 = rxaVar2.c;
                    Object P2 = rv4Var.P();
                    if (P2 == lh9Var) {
                        P2 = new dva(2);
                        rv4Var.o0(P2);
                    }
                    eu3 q = zt3.q(lf4Var3, (xt4) P2);
                    if (((Number) aw7Var.getValue()).floatValue() == -1.0f) {
                        rv4Var.e0(-1501789910);
                        lf4 lf4Var4 = rxaVar2.d;
                        Object P3 = rv4Var.P();
                        if (P3 == lh9Var) {
                            P3 = new dva(3);
                            rv4Var.o0(P3);
                        }
                        v = zt3.u(lf4Var4, (xt4) P3);
                        z4 = false;
                        rv4Var.q(false);
                    } else {
                        z4 = false;
                        rv4Var.e0(-1501560541);
                        arc x = tte.x(0, 0, on3.d, 3);
                        Object P4 = rv4Var.P();
                        if (P4 == lh9Var) {
                            P4 = new jia(aw7Var, 11);
                            rv4Var.o0(P4);
                        }
                        v = zt3.v(x, (xt4) P4);
                        rv4Var.q(false);
                    }
                    final int i12 = size;
                    lz3 lz3Var = v;
                    final int i13 = i9;
                    final vt4 vt4Var2 = obj;
                    rte.c(z3, null, q, lz3Var, null, jce.E(-292673573, new mu4() { // from class: wxa
                        @Override // defpackage.mu4
                        public final Object c(Object obj3, Object obj4, Object obj5) {
                            boolean z5;
                            float floatValue;
                            rv4 rv4Var3 = (rv4) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            ((qr) obj3).getClass();
                            if ((intValue & 17) != 16) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (rv4Var3.U(intValue & 1, z5)) {
                                int x2 = tl1.x(list2);
                                nq7 nq7Var2 = kq7.a;
                                int i14 = i13;
                                vt4 vt4Var3 = vt4Var2;
                                Object obj6 = ax1.a;
                                if (x2 == i14) {
                                    rv4Var3.e0(-254577518);
                                    Object P5 = rv4Var3.P();
                                    aw7 aw7Var2 = aw7Var;
                                    if (P5 == obj6) {
                                        P5 = new jia(aw7Var2, 12);
                                        rv4Var3.o0(P5);
                                    }
                                    nq7 p2 = lbe.p(nq7Var2, (xt4) P5);
                                    Object P6 = rv4Var3.P();
                                    if (P6 == obj6) {
                                        P6 = new jia(aw7Var2, 13);
                                        rv4Var3.o0(P6);
                                    }
                                    qj3 b4 = nj3.b((xt4) P6, rv4Var3, 6);
                                    boolean f = rv4Var3.f(vt4Var3);
                                    yya yyaVar = b3;
                                    boolean f2 = f | rv4Var3.f(yyaVar);
                                    Object P7 = rv4Var3.P();
                                    if (f2 || P7 == obj6) {
                                        P7 = new ve1(vt4Var3, aw7Var2, yyaVar, (m42) null);
                                        rv4Var3.o0(P7);
                                    }
                                    nq7Var2 = nj3.a(p2, b4, ff8.b, false, null, false, null, (mu4) P7, false, 188);
                                    rv4Var3.q(false);
                                } else {
                                    rv4Var3.e0(-253917001);
                                    rv4Var3.q(false);
                                }
                                nq7 nq7Var3 = nq7Var2;
                                if (i12 - i14 > Integer.MAX_VALUE) {
                                    floatValue = nae.e;
                                } else {
                                    floatValue = ((Number) b2.getValue()).floatValue();
                                }
                                float f3 = floatValue;
                                sxa sxaVar2 = sxaVar;
                                if (sxaVar2 instanceof sxa) {
                                    rv4Var3.e0(-253045901);
                                    float f4 = ((rg3) a2.getValue()).a;
                                    boolean f5 = rv4Var3.f(vt4Var3) | rv4Var3.f(sxaVar2);
                                    Object P8 = rv4Var3.P();
                                    if (f5 || P8 == obj6) {
                                        P8 = new mm7(29, vt4Var3, sxaVar2);
                                        rv4Var3.o0(P8);
                                    }
                                    ape.h(sxaVar2, f3, f4, (vt4) P8, nq7Var3, rv4Var3, 0);
                                    rv4Var3.q(false);
                                } else {
                                    throw rs8.b(-2086390839, rv4Var3, false);
                                }
                            } else {
                                rv4Var3.X();
                            }
                            return pvc.a;
                        }
                    }, rv4Var), rv4Var, 196608, 18);
                    list2 = list;
                    rxaVar2 = rxaVar;
                    obj = vt4Var;
                    rv4Var2 = rv4Var;
                    size = i12;
                    i9 = i10;
                    lf4Var = lf4Var2;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            rv4Var2.q(false);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new a83(list, rxaVar, vt4Var, z, nq7Var, i);
        }
    }

    public static final void l(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str, String str2, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2047727356);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.f(str2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i9 & 1, z2)) {
            nq7 f = pna.f(nq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g);
            if ((57344 & i9) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var2.P();
            if (z5 || P == ax1.a) {
                P = new up0(15, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7 z6 = zbe.z(lbe.f(15, (vt4) P, v, null, false), 14.0f, 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z6);
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
            we6 f2 = s21.f(rv4Var2, p, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f2);
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
            cvb.c(str, null, ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var2, i9 & 14, 0, 131066);
            rv4Var2 = rv4Var2;
            if (str2 != null && str2.length() != 0) {
                rv4Var2.e0(-576658719);
                cvb.c(str2, null, zl1.b(0.62f, ((zl1) rv4Var2.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var2, (i9 >> 9) & 14, 0, 131066);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-576449748);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            tte.g(z, false, null, xt4Var, rv4Var2, (i9 >> 3) & 7182, 6);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new kj7(str, z, nq7Var, str2, xt4Var, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0215, code lost:
        if (r4 == r3) goto L266;
     */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Throwable, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.nq7 r37, defpackage.xt4 r38, defpackage.vt4 r39, defpackage.rv4 r40, int r41) {
        /*
            Method dump skipped, instructions count: 2746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ape.m(nq7, xt4, vt4, rv4, int):void");
    }

    public static final nzb n(aw7 aw7Var) {
        return (nzb) aw7Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(java.lang.String r39, java.lang.String r40, defpackage.nq7 r41, defpackage.vt4 r42, defpackage.rv4 r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ape.o(java.lang.String, java.lang.String, nq7, vt4, rv4, int, int):void");
    }

    public static final vf9 p(byte[] bArr) {
        if (bArr.length < 4) {
            return null;
        }
        return new vf9(cbe.w(bArr, 0), cbe.w(bArr, 2), 1);
    }

    public static final double q(int i) {
        boolean z;
        double longBitsToDouble;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        int i2 = i >> 2;
        if (z2) {
            longBitsToDouble = i2;
        } else {
            longBitsToDouble = Double.longBitsToDouble((i & 4294967292L) << 32);
        }
        if (z) {
            return longBitsToDouble / 100.0d;
        }
        return longBitsToDouble;
    }

    public static final int r(fg6 fg6Var, ff8 ff8Var) {
        long j;
        if (ff8Var == ff8.a) {
            j = fg6Var.x & 4294967295L;
        } else {
            j = fg6Var.x >> 32;
        }
        return (int) j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(defpackage.tu1 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ly4
            if (r0 == 0) goto L13
            r0 = r5
            ly4 r0 = (defpackage.ly4) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ly4 r0 = new ly4
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L27:
            gt1 r4 = defpackage.a82.e(r5)
            throw r4
        L2c:
            defpackage.hre.r(r5)
            d82 r5 = r0.getContext()
            cne r1 = defpackage.cne.c
            b82 r5 = r5.get(r1)
            gy r5 = (defpackage.gy) r5
            if (r5 == 0) goto L43
            r0.b = r2
            r5.a(r4, r0)
            return
        L43:
            java.lang.String r4 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            defpackage.vs.k(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ape.s(tu1, n42):void");
    }

    public static final vf9 t(byte[] bArr) {
        if (bArr.length < 6) {
            return null;
        }
        int w = cbe.w(bArr, 0);
        int w2 = cbe.w(bArr, 2);
        cbe.w(bArr, 4);
        return new vf9(w, w2, 2);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, r71] */
    public static final e81 u(rv4 rv4Var) {
        p71 r;
        boolean d2 = ((om3) rv4Var.j(nm3.a)).d();
        etc etcVar = ((h27) rv4Var.j(j27.a)).b;
        boolean g = rv4Var.g(d2) | rv4Var.f(etcVar);
        Object P = rv4Var.P();
        if (g || P == ax1.a) {
            if (d2) {
                r = new p71(sve.d(4287280376L), sve.d(4279966495L), sve.d(4293454061L), sve.d(4280163880L), sve.d(4282006078L), sve.d(4292927712L), sve.d(4284900966L), sve.d(4292927712L), sve.d(4287137928L), sve.d(4288256409L), sve.d(4282269250L), sve.d(4282269250L), sve.d(4279907154L), sve.b(704643071), sve.d(2583685947L), sve.d(4287280376L), sve.b(1720366328), sve.d(4285887861L), sve.b(352321535), sve.d(2147541759L), sve.d(4287280376L), sve.d(4294097077L), sve.b(536870911));
            } else {
                r = fpe.r();
            }
            oyb oybVar = etcVar.j;
            oyb oybVar2 = etcVar.d;
            dq4 dq4Var = dq4.D;
            oyb a2 = oyb.a(oybVar2, 0L, 0L, dq4Var, null, null, 0L, null, 0, 0L, null, 16777211);
            oyb a3 = oyb.a(etcVar.e, 0L, 0L, dq4Var, null, null, 0L, null, 0, 0L, null, 16777211);
            oyb oybVar3 = etcVar.f;
            dq4 dq4Var2 = dq4.C;
            oyb a4 = oyb.a(oybVar3, 0L, 0L, dq4Var2, null, null, 0L, null, 0, 0L, null, 16777211);
            oyb a5 = oyb.a(etcVar.g, 0L, 0L, dq4Var2, null, null, 0L, null, 0, 0L, null, 16777211);
            oyb a6 = oyb.a(etcVar.h, 0L, 0L, dq4Var2, null, null, 0L, null, 0, 0L, null, 16777211);
            oyb a7 = oyb.a(etcVar.i, 0L, 0L, dq4Var2, null, null, 0L, null, 0, 0L, null, 16777211);
            oyb a8 = oyb.a(etcVar.k, 0L, 0L, null, null, eo4.d, 0L, null, 0, 0L, null, 16777183);
            oyb oybVar4 = etcVar.k;
            P = new e81(r, new f81(oybVar, a2, a3, a4, a5, a6, a7, a8, oybVar4, oybVar4, oyb.a(etcVar.m, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211)), new Object());
            rv4Var.o0(P);
        }
        return (e81) P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [te5, g03] */
    public static final g03 v(te5 te5Var, n45 n45Var, xt4 xt4Var) {
        te5Var.getClass();
        n45Var.getClass();
        re5 re5Var = te5Var.a;
        re5Var.getClass();
        ?? te5Var2 = new te5(re5Var);
        te5Var2.b = new h03(te5Var2, te5Var.c(), 0);
        te5Var2.c = new i03(te5Var2, te5Var.d(), xt4Var, n45Var);
        return te5Var2;
    }

    public static final ufd x(z5 z5Var) {
        vyc vycVar;
        Uri data;
        z5Var.getClass();
        if (z5Var.a == -1) {
            Intent intent = z5Var.b;
            if (intent != null && (data = intent.getData()) != null) {
                String uri = data.toString();
                uri.getClass();
                vycVar = obe.o(uri).b();
            } else {
                vycVar = null;
            }
            return new tfd(vycVar);
        }
        return sfd.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(defpackage.aib r8, android.content.Context r9, defpackage.n42 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.my4
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r10
            my4 r0 = (defpackage.my4) r0
            int r2 = r0.e
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.e = r2
            goto L18
        L13:
            my4 r0 = new my4
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            int r2 = r0.e
            r3 = 0
            n82 r4 = defpackage.n82.a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L39
            if (r2 != r5) goto L33
            java.util.Iterator r8 = r0.c
            java.util.Iterator r8 = (java.util.Iterator) r8
            android.content.Context r9 = r0.b
            aib r2 = r0.a
            defpackage.hre.r(r10)
            goto L62
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r3
        L39:
            android.content.Context r9 = r0.b
            aib r8 = r0.a
            defpackage.hre.r(r10)
            goto L5a
        L41:
            defpackage.hre.r(r10)
            sy4 r10 = new sy4
            r10.<init>(r9)
            java.lang.Class r2 = r8.getClass()
            r0.a = r8
            r0.b = r9
            r0.e = r6
            java.io.Serializable r10 = r10.a(r2, r0)
            if (r10 != r4) goto L5a
            goto L94
        L5a:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r8
            r8 = r10
        L62:
            boolean r10 = r8.hasNext()
            pvc r6 = defpackage.pvc.a
            if (r10 == 0) goto L9b
            java.lang.Object r10 = r8.next()
            uy4 r10 = (defpackage.uy4) r10
            r0.a = r2
            r0.b = r9
            r7 = r8
            java.util.Iterator r7 = (java.util.Iterator) r7
            r0.c = r7
            r0.e = r5
            r2.getClass()
            boolean r7 = r10 instanceof defpackage.ux
            if (r7 == 0) goto L95
            ux r10 = (defpackage.ux) r10
            int r10 = r10.a
            if (r1 > r10) goto L8b
            r7 = -1
            if (r10 < r7) goto L95
        L8b:
            java.lang.Object r10 = defpackage.aib.d(r2, r9, r10, r0)
            if (r10 != r4) goto L92
            r6 = r10
        L92:
            if (r6 != r4) goto L62
        L94:
            return r4
        L95:
            java.lang.String r8 = "Invalid Glance ID"
            defpackage.vs.m(r8)
            return r3
        L9b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ape.y(aib, android.content.Context, n42):java.lang.Object");
    }

    public static void z(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
