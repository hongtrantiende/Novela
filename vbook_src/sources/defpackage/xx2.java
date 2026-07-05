package defpackage;

import android.content.Context;
import android.os.Build;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xx2  reason: default package */
/* loaded from: classes.dex */
public abstract class xx2 {
    public static final m29 a = new m29(30);

    public static final void a(apb apbVar, nob nobVar, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2;
        Context context;
        rv4Var.g0(1904307118);
        if (rv4Var.f(apbVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.h(nobVar)) {
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
            if (Build.VERSION.SDK_INT >= 28) {
                rv4Var.e0(-1009482584);
                context = (Context) rv4Var.j(gh.b);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1009433480);
                rv4Var.q(false);
                context = null;
            }
            boolean h = rv4Var.h(nobVar);
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            boolean h2 = h | z2 | rv4Var.h(context);
            Object P = rv4Var.P();
            if (h2 || P == ax1.a) {
                P = new r7(25, nobVar, context, apbVar);
                rv4Var.o0(P);
            }
            rv4Var2 = rv4Var;
            e42.b(null, null, (xt4) P, rv4Var2, 0, 3);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ah7(apbVar, nobVar, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0489 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final int r48, final long r49, defpackage.rv4 r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx2.b(int, long, rv4, int):void");
    }

    public static final void c(apb apbVar, oob oobVar, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        boolean h2;
        int i5;
        rv4Var.g0(-2040393164);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = rv4Var.f(apbVar);
            } else {
                h2 = rv4Var.h(apbVar);
            }
            if (h2) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(oobVar);
            } else {
                h = rv4Var.h(oobVar);
            }
            if (h) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & Token.ASSIGN_MOD) != 32 && ((i2 & 64) == 0 || !rv4Var.f(oobVar))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new h07(new n07(new t7(28, oobVar, vt4Var), 10));
                rv4Var.o0(P);
            }
            h07 h07Var = (h07) P;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && rv4Var.h(apbVar))) {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new t42(apbVar, 4);
                rv4Var.o0(P2);
            }
            tk.a(h07Var, (vt4) P2, a, jce.E(1315155414, new ah7(23, oobVar, apbVar), rv4Var), rv4Var, 3456, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(apbVar, oobVar, vt4Var, i, 11);
        }
    }

    public static final void d(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(1392105195);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            pye.c(nq7Var, yob.a, tu1Var, rv4Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dn(nq7Var, tu1Var, i, 2);
        }
    }
}
