package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ib6  reason: default package */
/* loaded from: classes3.dex */
public final class ib6 implements tm0 {
    public final tu1 a;

    public ib6(tu1 tu1Var) {
        this.a = tu1Var;
    }

    @Override // defpackage.tm0
    public final void a(xl0 xl0Var, boolean z, boolean z2, nq7 nq7Var, zl0 zl0Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        int i3;
        boolean h;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        xl0Var.getClass();
        nq7Var.getClass();
        zl0Var.getClass();
        rv4Var.g0(-421472638);
        if ((i & 6) == 0) {
            if (rv4Var.f(xl0Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z2)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                h = rv4Var.f(zl0Var);
            } else {
                h = rv4Var.h(zl0Var);
            }
            if (h) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(this)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            this.a.i(xl0Var, Boolean.valueOf(z), Boolean.valueOf(z2), nq7Var, zl0Var, rv4Var, Integer.valueOf(i2 & 65534));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sb3(this, xl0Var, z, z2, nq7Var, zl0Var, i, 1);
        }
    }
}
