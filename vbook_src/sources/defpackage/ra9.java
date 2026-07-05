package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ra9  reason: default package */
/* loaded from: classes.dex */
public abstract class ra9 {
    public static final float a;
    public static final float b;

    static {
        float f = ms6.a;
        a = ms6.b;
        b = ms6.a;
    }

    public static final void a(final boolean z, final vt4 vt4Var, final nq7 nq7Var, final ya9 ya9Var, dc dcVar, final mu4 mu4Var, boolean z2, float f, final tu1 tu1Var, rv4 rv4Var, final int i) {
        int i2;
        boolean z3;
        final dc dcVar2;
        final boolean z4;
        final float f2;
        dc dcVar3;
        float f3;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(492221845);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(ya9Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        int i9 = i2 | 24576;
        if ((196608 & i) == 0) {
            if (rv4Var.h(mu4Var)) {
                i4 = 131072;
            } else {
                i4 = Parser.ARGC_LIMIT;
            }
            i9 |= i4;
        }
        int i10 = i9 | 14155776;
        if ((100663296 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i10 |= i3;
        }
        if ((38347923 & i10) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i10 & 1, z3)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                dcVar3 = dcVar;
                z5 = z2;
                f3 = f;
            } else {
                dcVar3 = kh5.a;
                f3 = na9.c;
                z5 = true;
            }
            rv4Var.r();
            nq7 a0 = nq7Var.a0(new oa9(z, vt4Var, z5, ya9Var, f3));
            b37 d = fu0.d(dcVar3, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, a0);
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
            Integer valueOf = Integer.valueOf(((i10 >> 21) & Token.ASSIGN_MOD) | 6);
            pu0 pu0Var = pu0.a;
            tu1Var.c(pu0Var, rv4Var, valueOf);
            mu4Var.c(pu0Var, rv4Var, Integer.valueOf(((i10 >> 12) & Token.ASSIGN_MOD) | 6));
            rv4Var.q(true);
            dcVar2 = dcVar3;
            z4 = z5;
            f2 = f3;
        } else {
            rv4Var.X();
            dcVar2 = dcVar;
            z4 = z2;
            f2 = f;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: qa9
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ra9.a(z, vt4Var, nq7Var, ya9Var, dcVar2, mu4Var, z4, f2, tu1Var, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final ya9 b(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new pa9(0);
            rv4Var.o0(P);
        }
        return (ya9) zpe.m(objArr, ya9.b, (vt4) P, rv4Var, 384);
    }
}
