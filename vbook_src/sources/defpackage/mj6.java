package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mj6  reason: default package */
/* loaded from: classes.dex */
public abstract class mj6 {
    public static final fj6 a = new fj6(null, 0, false, nae.e, new sg6(1), nae.e, false, k27.a(gs3.a), fpe.d(), y02.b(0, 0, 0, 0, 15), ks3.a, 0, 0, 0, false, ff8.a, 0, 0);

    public static final kj6 a(int i, rv4 rv4Var, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        yy9 yy9Var = kj6.y;
        if ((((i2 & 14) ^ 6) > 4 && rv4Var.d(i)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i2 & Token.ASSIGN_MOD) ^ 48) <= 32 || !rv4Var.d(0)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object P = rv4Var.P();
        if (z3 || P == ax1.a) {
            P = new lj6(i, 0, 0);
            rv4Var.o0(P);
        }
        return (kj6) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 0);
    }
}
