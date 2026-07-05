package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nye  reason: default package */
/* loaded from: classes.dex */
public abstract class nye {
    public static final tu1 a = new tu1(new kv1(3), false, 1224853437);
    public static final tu1 b = new tu1(new lv1(1), false, 232674745);
    public static final tu1 c = new tu1(new lv1(2), false, 448752757);
    public static final tu1 d = new tu1(new lv1(3), false, 1706480684);
    public static final tu1 e = new tu1(new lv1(4), false, -425184403);
    public static final float f = 24.0f;
    public static final float g = 24.0f;

    public static final i73 A(i73 i73Var, i73 i73Var2) {
        int ordinal = i73Var2.ordinal();
        i73 i73Var3 = i73.a;
        if (ordinal != 0) {
            i73 i73Var4 = i73.c;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return i73Var4;
                }
                xk5.o();
                return null;
            }
            int ordinal2 = i73Var.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        return i73Var4;
                    }
                    xk5.o();
                    return null;
                }
                return i73.b;
            }
        }
        return i73Var3;
    }

    public static final void a(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(347596029);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var4)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            iue.e(z, null, 0L, null, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var, jce.E(-345249015, new y33(vt4Var3, vt4Var2, vt4Var4, 5), rv4Var), rv4Var, (i11 & 14) | 12779520 | ((i11 << 15) & 3670016), 30);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z33(z, vt4Var, vt4Var2, vt4Var3, vt4Var4, i, 3);
        }
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x051a  */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r52, java.util.List r53, defpackage.rh8 r54, defpackage.nq7 r55, defpackage.xt4 r56, defpackage.xt4 r57, defpackage.xt4 r58, defpackage.rv4 r59, int r60) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nye.c(boolean, java.util.List, rh8, nq7, xt4, xt4, xt4, rv4, int):void");
    }

    public static final void d(String str, String str2, String str3, String str4, String str5, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj;
        int i10;
        int i11;
        boolean z;
        vt4 vt4Var3;
        vt4 vt4Var4;
        int i12;
        int i13;
        rv4 rv4Var2 = rv4Var;
        str2.getClass();
        str5.getClass();
        vt4Var.getClass();
        rv4Var2.g0(-1402891414);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i14 = i | i3;
        if (rv4Var2.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i15 = i14 | i4;
        if (rv4Var2.f(str3)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i16 = i15 | i5;
        if (rv4Var2.f(str4)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i17 = i16 | i6;
        if (rv4Var2.f(str5)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i18 = i17 | i7;
        if (rv4Var2.f(nq7Var)) {
            i8 = 131072;
        } else {
            i8 = Parser.ARGC_LIMIT;
        }
        int i19 = i18 | i8;
        if (rv4Var2.h(vt4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i20 = i19 | i9;
        int i21 = i2 & Token.CASE;
        if (i21 != 0) {
            i11 = i20 | 12582912;
            obj = vt4Var2;
        } else {
            obj = vt4Var2;
            if (rv4Var2.h(obj)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i11 = i20 | i10;
        }
        if ((4793491 & i11) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            if (i21 != 0) {
                vt4Var4 = null;
            } else {
                vt4Var4 = obj;
            }
            int i22 = i11 >> 9;
            nq7 c2 = q1d.c(((i11 >> 15) & 14) | (i22 & 7168) | (57344 & i22), vt4Var, vt4Var4, rv4Var2, nq7Var);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int i23 = i11;
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, c2);
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
            vt4 vt4Var5 = vt4Var4;
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 t = jsc.t(0.6666667f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).b), false);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
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
            int i24 = i23 & 14;
            int i25 = i23 >> 6;
            do5.d(str, str2, str5, r0f.d, pna.c, rv4Var2, i24 | 27648 | (i23 & Token.ASSIGN_MOD) | (i25 & 896));
            if (str4.length() > 0) {
                rv4Var2.e0(-306113996);
                long j = zl1.e;
                oyb oybVar = r0f.A(rv4Var2).l;
                i12 = i25;
                i13 = 3;
                cvb.c(str4, pu0.a.a(zbe.z(nmd.v(zbe.y(kq7Var, 4.0f), zl1.b(0.8f, zl1.b), r0f.z(rv4Var2).a), 4.0f, 2.0f), nk0Var), j, null, zr1.q(10), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i22 & 14) | 24960, 0, 130024);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                i12 = i25;
                i13 = 3;
                rv4Var2.e0(-305477380);
                rv4Var2.q(false);
            }
            rs8.u(rv4Var2, true, kq7Var, 2.0f, rv4Var2);
            cvb.c(str, pna.f(kq7Var, 1.0f), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(i13), 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).k, rv4Var, i24 | 48, 24960, 109560);
            cvb.c(str3, pna.f(kq7Var, 1.0f), zl1.b(0.6f, r0f.y(rv4Var).q), null, 0L, null, null, null, 0L, null, new tlb(i13), 0L, 2, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, (i12 & 14) | 48, 24960, 109560);
            rv4Var2 = rv4Var;
            hl5.w(kq7Var, 12.0f, rv4Var2, true);
            vt4Var3 = vt4Var5;
        } else {
            rv4Var2.X();
            vt4Var3 = obj;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ua(str, str2, str3, str4, str5, nq7Var, vt4Var, vt4Var3, i, i2);
        }
    }

    public static final void e(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-13406421);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
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
            kq7 kq7Var = kq7.a;
            dpe.g(jsc.t(0.6666667f, pna.f(kq7Var, 1.0f), false), null, rv4Var, 6, 2);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            lk0 lk0Var = kh5.J;
            dpe.g(pna.h(pna.f(new l95(lk0Var), 1.0f), 20.0f), null, rv4Var, 0, 2);
            xbe.i(rv4Var, pna.h(kq7Var, 4.0f));
            dpe.g(pna.h(pna.f(new l95(lk0Var), 0.8f), 20.0f), null, rv4Var, 0, 2);
            hl5.w(kq7Var, 12.0f, rv4Var, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 11);
        }
    }

    public static final void f(go0 go0Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        String str;
        pu0 pu0Var;
        tza tzaVar;
        float f2;
        rv4 rv4Var2 = rv4Var;
        go0Var.getClass();
        String str2 = go0Var.e;
        String str3 = go0Var.a;
        vt4Var.getClass();
        rv4Var2.g0(-1100506809);
        if (rv4Var2.f(go0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new ge5(9, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 b2 = q1d.b(nq7Var, false, nae.e, (vt4) P, 3);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, b2);
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
            nq7 f3 = pna.f(kq7Var, 1.0f);
            tza tzaVar2 = j27.a;
            nq7 t = jsc.t(0.6666667f, tte.k(f3, ((h27) rv4Var2.j(tzaVar2)).c.b), false);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
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
            do5.d(str3, go0Var.b, go0Var.c, r0f.d, pna.c, rv4Var2, 27648);
            int length = str2.length();
            pu0 pu0Var2 = pu0.a;
            if (length > 0) {
                rv4Var2.e0(-112458414);
                long j = zl1.e;
                oyb oybVar = ((h27) rv4Var2.j(tzaVar2)).b.l;
                long q = zr1.q(10);
                nq7 a3 = pu0Var2.a(zbe.z(nmd.v(zbe.y(kq7Var, 4.0f), zl1.b(0.8f, zl1.b), ((h27) rv4Var2.j(tzaVar2)).c.a), 4.0f, 2.0f), nk0Var);
                tlb tlbVar = new tlb(3);
                f2 = nae.e;
                str = str3;
                tzaVar = tzaVar2;
                pu0Var = pu0Var2;
                cvb.c(str2, a3, j, null, q, null, null, null, 0L, null, tlbVar, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 24960, 0, 130024);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                str = str3;
                pu0Var = pu0Var2;
                tzaVar = tzaVar2;
                f2 = nae.e;
                rv4Var2.e0(-111816993);
                rv4Var2.q(false);
            }
            long j2 = zl1.e;
            oyb oybVar2 = ((h27) rv4Var2.j(tzaVar)).b.l;
            nq7 a4 = pu0Var.a(pna.f(kq7Var, 1.0f), kh5.D);
            Float valueOf2 = Float.valueOf(f2);
            long j3 = zl1.b;
            cvb.c(str, zbe.y(nmd.u(a4, ox9.C(new yk8[]{new yk8(valueOf2, new zl1(zl1.b(f2, j3))), new yk8(Float.valueOf(0.4f), new zl1(zl1.b(0.6f, j3))), new yk8(Float.valueOf(1.0f), new zl1(zl1.b(1.0f, j3)))})), 4.0f), j2, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 2, false, 2, 0, null, oybVar2, rv4Var, 384, 24960, 109560);
            rv4Var2 = rv4Var;
            rs8.u(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new cv5(go0Var, nq7Var, vt4Var, i, 1);
        }
    }

    public static final void g(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(126380);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
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
            kq7 kq7Var = kq7.a;
            dpe.g(jsc.t(0.6666667f, pna.f(kq7Var, 1.0f), false), null, rv4Var, 6, 2);
            hl5.w(kq7Var, 12.0f, rv4Var, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 12);
        }
    }

    public static final void h(go0 go0Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        np npVar;
        np npVar2;
        np npVar3;
        kq7 kq7Var;
        zx1 zx1Var;
        int i5;
        boolean z3;
        go0 go0Var2 = go0Var;
        rv4 rv4Var2 = rv4Var;
        go0Var2.getClass();
        String str = go0Var2.e;
        String str2 = go0Var2.a;
        vt4Var.getClass();
        rv4Var2.g0(1142614730);
        if (rv4Var2.f(go0Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if ((i8 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i8 & 1, z)) {
            nq7 v = nmd.v(tte.k(nq7Var, r0f.z(rv4Var2).d), rm1.g(r0f.y(rv4Var2), 1.0f), lre.g);
            if ((i8 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new ge5(8, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 z4 = zbe.z(q1d.b(v, false, nae.e, (vt4) P, 3), 12.0f, 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z4);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar4 = qw1.f;
            jce.F(npVar4, rv4Var2, a2);
            np npVar5 = qw1.e;
            jce.F(npVar5, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar6 = qw1.g;
            jce.F(npVar6, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar7 = qw1.d;
            jce.F(npVar7, rv4Var2, p);
            kq7 kq7Var2 = kq7.a;
            nq7 t = jsc.t(0.6666667f, tte.k(pna.s(kq7Var2, 56.0f), r0f.z(rv4Var2).b), false);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar4, rv4Var2, d2);
            jce.F(npVar5, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar6, rv4Var2, kgVar);
            jce.F(npVar7, rv4Var2, p2);
            do5.d(str2, go0Var2.b, go0Var2.c, r0f.d, pna.c, rv4Var2, 27648);
            if (str.length() > 0) {
                rv4Var2.e0(1217778850);
                npVar3 = npVar6;
                npVar2 = npVar5;
                npVar = npVar7;
                z3 = true;
                kq7Var = kq7Var2;
                i5 = 0;
                zx1Var = zx1Var2;
                cvb.c(str, pu0.a.a(zbe.z(nmd.v(zbe.y(kq7Var2, 4.0f), zl1.b(0.8f, zl1.b), r0f.z(rv4Var2).a), 4.0f, 2.0f), nk0Var), zl1.e, null, zr1.q(9), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).l, rv4Var, 24960, 0, 130024);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                npVar = npVar7;
                npVar2 = npVar5;
                npVar3 = npVar6;
                kq7Var = kq7Var2;
                zx1Var = zx1Var2;
                i5 = 0;
                z3 = true;
                rv4Var2.e0(1218419310);
                rv4Var2.q(false);
            }
            rv4Var2.q(z3);
            kq7 kq7Var3 = kq7Var;
            xbe.i(rv4Var2, pna.s(kq7Var3, 14.0f));
            we6 we6Var = new we6(1.0f, z3);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, i5);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar4, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar, rv4Var2, p3);
            cvb.c(str2, pna.f(kq7Var3, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).i, rv4Var, 48, 24960, 109564);
            xbe.i(rv4Var, pna.h(kq7Var3, 6.0f));
            go0Var2 = go0Var;
            cvb.c(go0Var2.d, pna.f(kq7Var3, 1.0f), zl1.b(0.5f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var).l, rv4Var, 48, 24960, 109560);
            rv4Var2 = rv4Var;
            rv4Var2.q(z3);
            rv4Var2.q(z3);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new cv5(go0Var2, nq7Var, vt4Var, i, 0);
        }
    }

    public static final void i(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-277581265);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            tza tzaVar = j27.a;
            nq7 z2 = zbe.z(nmd.v(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 12.0f, 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z2);
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
            dpe.g(jsc.t(0.6666667f, tte.k(pna.s(kq7Var, 56.0f), ((h27) rv4Var.j(tzaVar)).c.b), false), null, rv4Var, 0, 2);
            we6 d2 = rs8.d(kq7Var, 14.0f, rv4Var, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, d2);
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
            dpe.g(pna.h(pna.f(kq7Var, 0.9f), 18.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var, kq7Var, 1.0f), 14.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, 0.6f), 14.0f), null, rv4Var, 6, 2);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 9);
        }
    }

    public static final void j(go0 go0Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        go0Var.getClass();
        vt4Var.getClass();
        rv4Var2.g0(757247947);
        if (rv4Var2.f(go0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            nq7 f2 = pna.f(nq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(tte.k(f2, ((h27) rv4Var2.j(tzaVar)).c.d), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g);
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new ge5(10, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 z3 = zbe.z(q1d.b(v, false, nae.e, (vt4) P, 3), 12.0f, 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z3);
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
            String str = go0Var.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.i;
            kq7 kq7Var = kq7.a;
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, oybVar, rv4Var2, 48, 24960, 109564);
            xbe.i(rv4Var2, pna.h(kq7Var, 6.0f));
            cvb.c(go0Var.d, pna.f(kq7Var, 1.0f), zl1.b(0.5f, ((zl1) rv4Var2.j(r12.a)).a), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var2, 48, 24960, 109560);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new cv5(go0Var, nq7Var, vt4Var, i, 2);
        }
    }

    public static final void k(nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-806500304);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            nq7 f2 = pna.f(nq7Var, 1.0f);
            tza tzaVar = j27.a;
            nq7 z2 = zbe.z(nmd.v(tte.k(f2, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 12.0f, 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z2);
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
            kq7 kq7Var = kq7.a;
            dpe.g(pna.h(pna.f(kq7Var, 0.92f), 18.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 6.0f, rv4Var, kq7Var, 1.0f), 14.0f), null, rv4Var, 6, 2);
            dpe.g(pna.h(hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, 0.7f), 14.0f), null, rv4Var, 6, 2);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 10);
        }
    }

    public static final void l(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        String str2;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-1495083920);
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
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new v85(str, 19);
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
                cqb cqbVar = (cqb) ((fdd) voe.z(cm9.a(cqb.class), a2.i(), null, pb2Var, o96.a(rv4Var), vt4Var));
                aw7 z4 = jsc.z(cqbVar.e, rv4Var);
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = yae.z(null);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var = (aw7) P2;
                zu8 zu8Var = new zu8(tl1.A("json"));
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new wmb(aw7Var, 20);
                    rv4Var.o0(P3);
                }
                kd4 v = w92.v(zu8Var, (xt4) P3, rv4Var, 56);
                Object[] objArr = new Object[0];
                Object P4 = rv4Var.P();
                if (P4 == obj) {
                    P4 = new ekb(22);
                    rv4Var.o0(P4);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P4, rv4Var, 48);
                io3 x = l0e.x(rv4Var);
                Object obj2 = (sac) rv4Var.j(uac.a);
                s02 s02Var = cqbVar.f;
                boolean f2 = rv4Var.f(obj2);
                Object P5 = rv4Var.P();
                if (f2 || P5 == obj) {
                    P5 = new wa(obj2, (m42) null, 21);
                    rv4Var.o0(P5);
                }
                jye.b(s02Var, null, (mu4) P5, rv4Var, 0);
                fxe.h(yqe.A((y3b) x2b.j0.getValue(), rv4Var), pna.c, false, jce.E(-1399683860, new ri9(cz7Var, 23), rv4Var), jce.E(-787592043, new ob9(aw7Var2, cqbVar, v, 3), rv4Var), jce.E(-1488165455, new t81(10, z4, x), rv4Var), jce.E(538466747, new cs1(19, cqbVar, x, z4), rv4Var), rv4Var, 1797168, 4);
                boolean f3 = rv4Var.f(cqbVar);
                Object P6 = rv4Var.P();
                if (f3 || P6 == obj) {
                    P6 = new zd1(cqbVar, 10);
                    rv4Var.o0(P6);
                }
                l0e.c(x, (nu4) P6, rv4Var, 0);
                if (((f76) aw7Var.getValue()) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var != null) {
                    str2 = f76Var.getName();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                Object P7 = rv4Var.P();
                if (P7 == obj) {
                    P7 = new wmb(aw7Var, 21);
                    rv4Var.o0(P7);
                }
                xt4 xt4Var = (xt4) P7;
                boolean f4 = rv4Var.f(cqbVar);
                Object P8 = rv4Var.P();
                if (f4 || P8 == obj) {
                    P8 = new cn9(23, aw7Var, cqbVar);
                    rv4Var.o0(P8);
                }
                rae.b(z3, str3, null, xt4Var, (xt4) P8, rv4Var, 3072);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i, 14);
        }
    }

    public static final void m(final vk8 vk8Var, nq7 nq7Var, dc dcVar, w22 w22Var, float f2, boolean z, final mrd mrdVar, t1a t1aVar, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        nq7 nq7Var2;
        final dc dcVar2;
        final w22 w22Var2;
        final float f3;
        final boolean z3;
        final t1a t1aVar2;
        dc dcVar3;
        w22 w22Var3;
        int i6;
        int i7;
        final t1a t1aVar3;
        boolean z4;
        final float f4;
        boolean z5;
        boolean z6;
        lu4 dv0Var;
        dc dcVar4;
        w22 w22Var4;
        int i8;
        vk8Var.getClass();
        rv4Var.g0(1388374398);
        int i9 = 2;
        if (rv4Var.h(vk8Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i | i3 | 14380416;
        if (rv4Var.f(mrdVar)) {
            i4 = 67108864;
        } else {
            i4 = 33554432;
        }
        int i11 = i10 | i4 | 268435456;
        if ((i2 & 6) == 0) {
            if (rv4Var.h(xt4Var)) {
                i9 = 4;
            }
            i5 = i2 | i9;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        if ((306783379 & i11) == 306783378 && (i5 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i6 = i11 & (-1879048193);
                dcVar3 = dcVar;
                w22Var3 = w22Var;
                z4 = z;
                t1aVar3 = t1aVar;
                i7 = 16;
                f4 = f2;
            } else {
                dcVar3 = kh5.e;
                w22Var3 = r0f.e;
                i6 = i11 & (-1879048193);
                i7 = 16;
                t1aVar3 = t1a.d;
                z4 = true;
                f4 = 1.0f;
            }
            rv4Var.r();
            tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
            Object[] objArr = {mrdVar, tc6Var, vk8Var, null};
            if ((((i6 & 234881024) ^ 100663296) > 67108864 && rv4Var.f(mrdVar)) || (i6 & 100663296) == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean d2 = z5 | rv4Var.d(tc6Var.ordinal());
            if ((i6 & 14) != 4 && !rv4Var.h(vk8Var)) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z7 = d2 | z6;
            Object P = rv4Var.P();
            if (!z7 && P != ax1.a) {
                dv0Var = P;
                dcVar4 = dcVar3;
                w22Var4 = w22Var3;
            } else {
                dcVar4 = dcVar3;
                w22Var4 = w22Var3;
                dv0Var = new dv0(mrdVar, w22Var4, dcVar4, tc6Var, vk8Var, null, 4);
                rv4Var.o0(dv0Var);
            }
            yte.j(objArr, dv0Var, rv4Var);
            nq7 nq7Var3 = kq7.a;
            if (z4) {
                btd btdVar = mrdVar.a;
                if ((btdVar.L.h() & i7) == 0) {
                    nq7Var3 = new es7(btdVar);
                }
            }
            nq7Var2 = nq7Var;
            nq7 a0 = nq7Var2.a0(nq7Var3);
            final w22 w22Var5 = w22Var4;
            final dc dcVar5 = dcVar4;
            final boolean z8 = z4;
            mu4 mu4Var = new mu4() { // from class: hrd
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z9;
                    boolean z10;
                    nq7 nq7Var4;
                    int i12;
                    su0 su0Var = (su0) obj;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i12 = 4;
                        } else {
                            i12 = 2;
                        }
                        intValue |= i12;
                    }
                    if ((intValue & 19) != 18) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z9)) {
                        r13 r13Var = (r13) rv4Var2.j(dy1.h);
                        rg3 rg3Var = new rg3(su0Var.d());
                        rg3 rg3Var2 = new rg3(su0Var.c());
                        boolean f5 = rv4Var2.f(r13Var);
                        if ((intValue & 14) == 4) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        mrd mrdVar2 = mrd.this;
                        boolean f6 = z10 | f5 | rv4Var2.f(mrdVar2);
                        Object P2 = rv4Var2.P();
                        if (f6 || P2 == ax1.a) {
                            a8d a8dVar = new a8d(r13Var, mrdVar2, su0Var, null, 1);
                            rv4Var2.o0(a8dVar);
                            P2 = a8dVar;
                        }
                        yte.i(r13Var, rg3Var, rg3Var2, (lu4) P2, rv4Var2);
                        pu0 pu0Var = pu0.a;
                        nq7 b2 = pu0Var.b();
                        if (z8) {
                            nq7Var4 = new zrd(mrdVar2.a, true, xt4Var, xt4Var2);
                        } else {
                            nq7Var4 = kq7.a;
                        }
                        nq7 a02 = b2.a0(nq7Var4);
                        btd btdVar2 = mrdVar2.a;
                        a02.getClass();
                        lye.a(vk8Var, zj0.n(a02, btdVar2, false), dcVar5, w22Var5, f4, false, true, rv4Var2, 113246264);
                        nq7 n = zj0.n(pu0Var.b(), btdVar2, true);
                        o7b o7bVar = mrdVar2.b;
                        n.getClass();
                        o7bVar.getClass();
                        fu0.a(n.a0(new c7b(btdVar2, o7bVar)), rv4Var2, 0);
                        t1a t1aVar4 = t1aVar3;
                        if (t1aVar4 != null) {
                            rv4Var2.e0(317045046);
                            fu0.a(pu0Var.b().a0(new krd(btdVar2, t1aVar4)), rv4Var2, 0);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(317221870);
                            rv4Var2.q(false);
                        }
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            };
            z3 = z8;
            hc2.b(a0, null, jce.E(1176004948, mu4Var, rv4Var), rv4Var, 3072, 6);
            dcVar2 = dcVar5;
            w22Var2 = w22Var5;
            f3 = f4;
            t1aVar2 = t1aVar3;
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
            dcVar2 = dcVar;
            w22Var2 = w22Var;
            f3 = f2;
            z3 = z;
            t1aVar2 = t1aVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final nq7 nq7Var4 = nq7Var2;
            u.d = new lu4(nq7Var4, dcVar2, w22Var2, f3, z3, mrdVar, t1aVar2, xt4Var, xt4Var2, i, i2) { // from class: ird
                public final /* synthetic */ mrd C;
                public final /* synthetic */ t1a D;
                public final /* synthetic */ xt4 E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ int G;
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ dc c;
                public final /* synthetic */ w22 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;

                {
                    this.G = i2;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nye.m(vk8.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, (rv4) obj, xoe.p(57), xoe.p(this.G));
                    return pvc.a;
                }
            };
        }
    }

    public static final boolean n(ku5 ku5Var) {
        if (ku5Var.h && !ku5Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean o(ku5 ku5Var) {
        if (!ku5Var.h && ku5Var.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6 A[LOOP:2: B:31:0x007f->B:42:0x00d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[EDGE_INSN: B:50:0x00dd->B:43:0x00dd ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cv7 p(defpackage.g6a r18, java.util.List r19, defpackage.xt4 r20, defpackage.lu4 r21, defpackage.nu4 r22) {
        /*
            r0 = r18
            r1 = r20
            r2 = r22
            f6a r3 = r0.a
            long r3 = r3.c
            f6a r5 = r0.b
            long r6 = r5.c
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L1d
            cv7 r1 = defpackage.zx6.a
            cv7 r1 = new cv7
            r1.<init>()
            r1.i(r0, r3)
            return r1
        L1d:
            java.util.Iterator r8 = r19.iterator()
            r9 = 0
            r10 = r9
        L23:
            boolean r11 = r8.hasNext()
            r12 = -1
            if (r11 == 0) goto L40
            java.lang.Object r11 = r8.next()
            java.lang.Object r11 = r1.invoke(r11)
            java.lang.Number r11 = (java.lang.Number) r11
            long r13 = r11.longValue()
            int r11 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r11 != 0) goto L3d
            goto L41
        L3d:
            int r10 = r10 + 1
            goto L23
        L40:
            r10 = r12
        L41:
            java.util.Iterator r8 = r19.iterator()
            r11 = r9
        L46:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L62
            java.lang.Object r13 = r8.next()
            java.lang.Object r13 = r1.invoke(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 != 0) goto L5f
            goto L63
        L5f:
            int r11 = r11 + 1
            goto L46
        L62:
            r11 = r12
        L63:
            if (r10 == r12) goto Lde
            if (r11 != r12) goto L69
            goto Lde
        L69:
            int r8 = java.lang.Math.min(r10, r11)
            int r12 = java.lang.Math.max(r10, r11)
            if (r10 <= r11) goto L74
            r9 = 1
        L74:
            cv7 r10 = defpackage.zx6.a
            cv7 r10 = new cv7
            r10.<init>()
            if (r8 > r12) goto Ldd
            r11 = r19
        L7f:
            java.lang.Object r13 = r11.get(r8)
            java.lang.Object r14 = r1.invoke(r13)
            java.lang.Number r14 = (java.lang.Number) r14
            long r14 = r14.longValue()
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 != 0) goto Laa
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r16 = r3
            f6a r3 = r0.a
            int r3 = r3.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            java.lang.Object r1 = r2.h(r13, r1, r3, r4)
            g6a r1 = (defpackage.g6a) r1
        La7:
            r3 = r21
            goto Lcf
        Laa:
            r16 = r3
            int r1 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r1 != 0) goto Lc3
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            int r3 = r5.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            java.lang.Object r1 = r2.h(r13, r1, r3, r4)
            g6a r1 = (defpackage.g6a) r1
            goto La7
        Lc3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r3 = r21
            java.lang.Object r1 = r3.invoke(r13, r1)
            g6a r1 = (defpackage.g6a) r1
        Lcf:
            if (r1 == 0) goto Ld4
            r10.i(r1, r14)
        Ld4:
            if (r8 == r12) goto Ldd
            int r8 = r8 + 1
            r1 = r20
            r3 = r16
            goto L7f
        Ldd:
            return r10
        Lde:
            cv7 r0 = defpackage.zx6.a
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nye.p(g6a, java.util.List, xt4, lu4, nu4):cv7");
    }

    public static final Object q(wx1 wx1Var, f99 f99Var) {
        if (!((mq7) wx1Var).a.J) {
            lv5.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        xt8 xt8Var = (xt8) voe.v(wx1Var).Y;
        xt8Var.getClass();
        return qye.m(xt8Var, f99Var);
    }

    public static final float[] r(float f2, float f3, float f4, float[] fArr) {
        float f5 = fArr[1] * f3;
        float f6 = fArr[2] * f4;
        return new float[]{f6 + f5 + (fArr[0] * f2), (fArr[5] * f4) + (fArr[4] * f3) + (fArr[3] * f2), (fArr[8] * f4) + (fArr[7] * f3) + (fArr[6] * f2)};
    }

    public static final float[] s(float f2, float f3, float f4, float[] fArr) {
        fArr.getClass();
        return new float[]{fArr[0] * f2, fArr[1] * f3, fArr[2] * f4, fArr[3] * f2, fArr[4] * f3, fArr[5] * f4, fArr[6] * f2, fArr[7] * f3, fArr[8] * f4};
    }

    public static final float t(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i2 * 3;
        float f2 = fArr2[i] * fArr[i3];
        return (fArr[i3 + 2] * fArr2[6 + i]) + (fArr[i3 + 1] * fArr2[3 + i]) + f2;
    }

    public static final float u(fvb fvbVar, int i) {
        if (i >= 0) {
            evb evbVar = fvbVar.a;
            it7 it7Var = fvbVar.b;
            if (evbVar.a.b.length() != 0) {
                int min = Math.min(it7Var.d(i), Math.min(it7Var.b - 1, it7Var.f - 1));
                if (i <= it7Var.c(min, false)) {
                    it7Var.n(min);
                    ArrayList arrayList = it7Var.h;
                    ll8 ll8Var = (ll8) arrayList.get(vqe.w(min, arrayList));
                    tj tjVar = ll8Var.a;
                    return tjVar.d.h(min - ll8Var.d);
                }
                return nae.e;
            }
            return nae.e;
        }
        return nae.e;
    }

    public static final uma v(fvb fvbVar, int i, int i2, int i3, long j, boolean z, boolean z2) {
        g6a g6aVar;
        if (z) {
            g6aVar = null;
        } else {
            int i4 = fxb.c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            g6aVar = new g6a(new f6a(lye.n(fvbVar, i5), i5, 1L), new f6a(lye.n(fvbVar, i6), i6, 1L), fxb.h(j));
        }
        return new uma(z2, 1, 1, g6aVar, new z5a(1L, 1, i, i2, i3, fvbVar));
    }

    public static float[] w(float[] fArr) {
        double d2 = fArr[0];
        double d3 = fArr[1];
        double d4 = fArr[2];
        double d5 = fArr[3];
        double d6 = fArr[4];
        double d7 = fArr[5];
        double d8 = fArr[6];
        double d9 = fArr[7];
        double d10 = fArr[8];
        double d11 = (d6 * d10) - (d9 * d7);
        double d12 = (d9 * d4) - (d3 * d10);
        double d13 = (d3 * d7) - (d6 * d4);
        double d14 = (d8 * d13) + (d5 * d12) + (d2 * d11);
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        copyOf[0] = (float) (d11 / d14);
        copyOf[3] = (float) nk2.b(d5, d10, d8 * d7, d14);
        copyOf[6] = (float) nk2.b(d8, d6, d5 * d9, d14);
        copyOf[1] = (float) (d12 / d14);
        copyOf[4] = (float) nk2.b(d8, d4, d2 * d10, d14);
        copyOf[7] = (float) nk2.b(d2, d9, d8 * d3, d14);
        copyOf[2] = (float) (d13 / d14);
        copyOf[5] = (float) nk2.b(d2, d7, d5 * d4, d14);
        copyOf[8] = (float) nk2.b(d5, d3, d2 * d6, d14);
        return copyOf;
    }

    public static b72 x(zm8 zm8Var, String str, b72 b72Var) {
        String sb;
        b72Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList C = tl1.C(new um8(b72Var, zm8Var, 0));
        while (true) {
            um8 um8Var = (um8) xl1.S(C);
            if (um8Var == null) {
                if (arrayList.size() > 1) {
                    wl1.O(new pa5(17), arrayList);
                }
                if (arrayList.size() == 1) {
                    sb = "Position " + ((mm8) arrayList.get(0)).a + ": " + ((String) ((mm8) arrayList.get(0)).b.invoke());
                } else {
                    StringBuilder sb2 = new StringBuilder(arrayList.size() * 33);
                    sl1.h0(arrayList, sb2, ", ", new rg8(4), 56);
                    sb = sb2.toString();
                }
                throw new Exception(sb);
            }
            b72 b72Var2 = (b72) ((b72) um8Var.a).c();
            int i = um8Var.c;
            zm8 zm8Var2 = um8Var.b;
            List list = zm8Var2.a;
            List list2 = zm8Var2.b;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object a2 = ((ym8) zm8Var2.a.get(i2)).a(b72Var2, str, i);
                    if (a2 instanceof Integer) {
                        i = ((Number) a2).intValue();
                        i2++;
                    } else if (a2 instanceof mm8) {
                        arrayList.add((mm8) a2);
                    } else {
                        xk5.p(a2, "Unexpected parse result: ");
                        return null;
                    }
                } else if (list2.isEmpty()) {
                    if (i == str.length()) {
                        return b72Var2;
                    }
                    arrayList.add(new mm8(i, xd0.E));
                } else {
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            C.add(new um8(b72Var2, (zm8) list2.get(size2), i));
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                }
            }
        }
    }

    public static final long y(ku5 ku5Var, ff8 ff8Var, ju5 ju5Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        long j = ku5Var.g;
        if (ff8Var != null) {
            int i = ju5Var.a;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            if (ff8Var == ff8.b) {
                floatToRawIntBits = Float.floatToRawIntBits(nae.e);
                floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat) << 32;
            } else {
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits2 = Float.floatToRawIntBits(nae.e) << 32;
            }
            j = floatToRawIntBits2 | (floatToRawIntBits & 4294967295L);
        }
        long i2 = y78.i(z(ku5Var, ff8Var, ju5Var), j);
        if (!z && ku5Var.i) {
            return 0L;
        }
        return i2;
    }

    public static final long z(ku5 ku5Var, ff8 ff8Var, ju5 ju5Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        if (ff8Var == null) {
            return ku5Var.c;
        }
        int i = ju5Var.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (ku5Var.c >> 32));
        } else if (i == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (ku5Var.c & 4294967295L));
        } else {
            return ku5Var.c;
        }
        if (ff8Var == ff8.b) {
            floatToRawIntBits = Float.floatToRawIntBits(nae.e);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat) << 32;
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits2 = Float.floatToRawIntBits(nae.e) << 32;
        }
        return floatToRawIntBits2 | (4294967295L & floatToRawIntBits);
    }
}
