package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nj3  reason: default package */
/* loaded from: classes.dex */
public abstract class nj3 {
    public static final ij3 a = new ij3(3, 0, null);
    public static final ij3 b = new ij3(3, 1, null);

    public static nq7 a(nq7 nq7Var, qj3 qj3Var, ff8 ff8Var, boolean z, yu7 yu7Var, boolean z2, mu4 mu4Var, mu4 mu4Var2, boolean z3, int i) {
        boolean z4;
        ij3 ij3Var;
        boolean z5;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            yu7Var = null;
        }
        yu7 yu7Var2 = yu7Var;
        if ((i & 16) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 32) != 0) {
            ij3Var = a;
        } else {
            ij3Var = mu4Var;
        }
        if ((i & Token.CASE) != 0) {
            z5 = false;
        } else {
            z5 = z3;
        }
        return nq7Var.a0(new gj3(qj3Var, ff8Var, z6, yu7Var2, z4, ij3Var, mu4Var2, z5));
    }

    public static final qj3 b(xt4 xt4Var, rv4 rv4Var, int i) {
        aw7 D = yae.D(xt4Var, rv4Var);
        Object P = rv4Var.P();
        if (P == ax1.a) {
            kt2 kt2Var = new kt2(new as1(D, 27));
            rv4Var.o0(kt2Var);
            P = kt2Var;
        }
        return (qj3) P;
    }

    public static final long c(long j) {
        float b2;
        boolean isNaN = Float.isNaN(z4d.b(j));
        float f = nae.e;
        if (isNaN) {
            b2 = 0.0f;
        } else {
            b2 = z4d.b(j);
        }
        if (!Float.isNaN(z4d.c(j))) {
            f = z4d.c(j);
        }
        return ese.q(b2, f);
    }
}
