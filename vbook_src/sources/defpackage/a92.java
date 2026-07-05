package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a92  reason: default package */
/* loaded from: classes3.dex */
public abstract class a92 {
    public static final List a = tl1.B(new zl1(sve.b(855638016)), new zl1(sve.b(0)));
    public static final float b = 15.0f;

    public static final void a(h2a h2aVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(-165495639);
        if ((i & 6) == 0) {
            if (rv4Var.f(h2aVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z2 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new y82(h2aVar, 0);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, (i2 >> 3) & 14);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z82(h2aVar, nq7Var, i, 0);
        }
    }

    public static final void b(ak3 ak3Var, float f) {
        ij1 Q0 = ak3Var.Q0();
        long G = Q0.G();
        Q0.w().i();
        try {
            mu9.E((mu9) Q0.b, f, nae.e, 2);
            List list = a;
            float f2 = b;
            vo6 v = ox9.v(list, ak3Var.L0(f2), 8);
            float L0 = ak3Var.L0(f2);
            float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L));
            ak3.h1(ak3Var, v, 0L, (Float.floatToRawIntBits(L0) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), nae.e, null, null, 0, Token.FUNCTION);
        } finally {
            rs8.r(Q0, G);
        }
    }
}
