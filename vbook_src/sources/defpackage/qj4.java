package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qj4  reason: default package */
/* loaded from: classes.dex */
public abstract class qj4 {
    public static final tza a = new f99(new k24(13));

    public static final void a(vt4 vt4Var, boolean z, boolean z2, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        vt4Var.getClass();
        rv4Var.g0(1132457652);
        if ((i & 6) == 0) {
            if (rv4Var.h(vt4Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            if (rv4Var.g(z3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            if (rv4Var.g(z4)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        boolean z6 = false;
        if ((i2 & 1171) != 1170) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (rv4Var.U(i2 & 1, z5)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = ube.B();
                rv4Var.o0(P);
            }
            String str2 = (String) P;
            mj4 mj4Var = (mj4) rv4Var.j(a);
            aw7 D = yae.D(Boolean.valueOf(z3), rv4Var);
            aw7 D2 = yae.D(Boolean.valueOf(z4), rv4Var);
            aw7 D3 = yae.D(vt4Var, rv4Var);
            boolean f = rv4Var.f(mj4Var) | rv4Var.f(D) | rv4Var.f(D2) | rv4Var.f(D3);
            if ((i2 & 7168) == 2048) {
                z6 = true;
            }
            boolean z7 = f | z6;
            Object P2 = rv4Var.P();
            if (!z7 && P2 != lh9Var) {
                str = str2;
            } else {
                str = str2;
                hm0 hm0Var = new hm0(mj4Var, str, D3, D, D2, tu1Var, 7);
                rv4Var.o0(hm0Var);
                P2 = hm0Var;
            }
            yte.b(str, (xt4) P2, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oj4(vt4Var, z3, z4, tu1Var, i);
        }
    }

    public static final void b(mj4 mj4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        mj4Var.getClass();
        rv4Var.g0(-1043538473);
        if (rv4Var.f(mj4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z4 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
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
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            int i4 = i3 & 14;
            if (i4 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new t42(mj4Var, 20);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            if (i4 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new pj4(mj4Var);
                rv4Var.o0(P2);
            }
            r1d.e(vt4Var, null, null, (uh6) P2, rv4Var, 0, 6);
            rv4Var.q(true);
            if (i4 == 4) {
                z4 = true;
            }
            Object P3 = rv4Var.P();
            if (z4 || P3 == lh9Var) {
                P3 = new cq2(mj4Var, 28);
                rv4Var.o0(P3);
            }
            yte.b(pvc.a, (xt4) P3, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(mj4Var, nq7Var, i, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.vt4 r19, boolean r20, boolean r21, defpackage.tu1 r22, defpackage.rv4 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj4.c(vt4, boolean, boolean, tu1, rv4, int, int):void");
    }
}
