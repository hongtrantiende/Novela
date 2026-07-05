package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ts6  reason: default package */
/* loaded from: classes3.dex */
public abstract class ts6 {
    static {
        new rd2(0.42f, nae.e, 0.58f, 1.0f);
    }

    public static final void a(float f, int i, int i2, long j, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        boolean z;
        rv4 rv4Var2;
        nq7 nq7Var2;
        long j2;
        int i4;
        int i5;
        rv4Var.g0(1062926078);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0 && rv4Var.e(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        if ((i3 & Token.DO) != 130) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else {
                if ((i2 & 1) != 0) {
                    j = ((h27) rv4Var.j(j27.a)).a.q;
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    f = 2.0f;
                }
            }
            j2 = j;
            rv4Var.r();
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            eg0.f(nq7Var2, j2, null, rv4Var2, ((i3 >> 6) & 14) | ((i3 << 3) & Token.ASSIGN_MOD), 4);
        } else {
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            rv4Var2.X();
            j2 = j;
        }
        float f2 = f;
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vb3(j2, f2, nq7Var2, i, i2);
        }
    }
}
