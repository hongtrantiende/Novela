package defpackage;

import android.content.res.Configuration;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xm5  reason: default package */
/* loaded from: classes.dex */
public abstract class xm5 {
    public static final x53 a = new x53(false, false, false);

    public static final void a(ou0 ou0Var, zc2 zc2Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nk0 nk0Var;
        int i3;
        int i4;
        ou0Var.getClass();
        zc2Var.getClass();
        rv4Var.g0(1714240727);
        if ((i & 6) == 0) {
            if (rv4Var.f(ou0Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(zc2Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && rv4Var.E()) {
            rv4Var.X();
        } else {
            rv4Var.e0(-668512363);
            if (((Configuration) rv4Var.j(gh.a)).orientation == 2) {
                z = true;
            } else {
                z = false;
            }
            rv4Var.q(false);
            if (!z) {
                nk0Var = kh5.D;
            } else {
                nk0Var = kh5.f;
            }
            i62.c(z, zc2Var, zbe.y(ou0Var.a(kq7.a, nk0Var), 12.0f), rv4Var, i2 & Token.ASSIGN_MOD);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gk7(ou0Var, zc2Var, i, 10);
        }
    }

    public static final void b(zc2 zc2Var, rv4 rv4Var, int i) {
        int i2;
        rv4 rv4Var2;
        int i3;
        zc2Var.getClass();
        rv4Var.g0(-1750991800);
        if ((i & 6) == 0) {
            if (rv4Var.f(zc2Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
            rv4Var2 = rv4Var;
        } else {
            tu1 tu1Var = hv1.a;
            rv4Var2 = rv4Var;
            vv.c(null, jce.E(745910722, new g62(zc2Var, 1), rv4Var), jce.E(1786765817, new wx2(zc2Var, 1), rv4Var), nae.e, null, null, rv4Var2, 3462);
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new tm5(zc2Var, i, 0);
        }
    }

    public static final void c(zc2 zc2Var, ed2 ed2Var, x53 x53Var, rh8 rh8Var, wea weaVar, mu4 mu4Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        rh8 th8Var;
        wea a2;
        int i4;
        mu4 mu4Var2;
        nu4 nu4Var2;
        x53 x53Var2;
        boolean z;
        nu4 nu4Var3;
        mu4 mu4Var3;
        wea weaVar2;
        rh8 rh8Var2;
        x53 x53Var3;
        rv4Var.g0(985234867);
        if (rv4Var.f(zc2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(ed2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 1781120;
        if ((599187 & i6) == 599186 && rv4Var.E()) {
            rv4Var.X();
            x53Var3 = x53Var;
            rh8Var2 = rh8Var;
            weaVar2 = weaVar;
            mu4Var3 = mu4Var;
            nu4Var3 = nu4Var;
        } else {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i4 = i6 & (-57345);
                x53Var2 = x53Var;
                th8Var = rh8Var;
                a2 = weaVar;
                mu4Var2 = mu4Var;
                nu4Var2 = nu4Var;
            } else {
                th8Var = new th8(16.0f, 16.0f, 16.0f, 16.0f);
                a2 = uu9.a(8.0f);
                i4 = i6 & (-57345);
                mu4Var2 = hv1.a;
                nu4Var2 = hv1.b;
                x53Var2 = a;
            }
            rv4Var.r();
            rv4Var.e0(-1633490746);
            boolean z2 = true;
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((((i4 & Token.ASSIGN_MOD) ^ 48) <= 32 || !rv4Var.f(ed2Var)) && (i4 & 48) != 32) {
                z2 = false;
            }
            boolean z3 = z | z2;
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = new db(zc2Var, ed2Var, null, 22);
                rv4Var.o0(P);
            }
            rv4Var.q(false);
            yte.g((lu4) P, rv4Var, pvc.a);
            wea weaVar3 = a2;
            nu4 nu4Var4 = nu4Var2;
            x53 x53Var4 = x53Var2;
            pye.a(fd2.b.a(ed2Var), jce.E(-591347469, new wm5(zc2Var, x53Var4, th8Var, weaVar3, mu4Var2, nu4Var4), rv4Var), rv4Var, 56);
            nu4Var3 = nu4Var4;
            mu4Var3 = mu4Var2;
            weaVar2 = weaVar3;
            rh8Var2 = th8Var;
            x53Var3 = x53Var4;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bx(zc2Var, ed2Var, x53Var3, rh8Var2, weaVar2, mu4Var3, nu4Var3, i, 4);
        }
    }
}
