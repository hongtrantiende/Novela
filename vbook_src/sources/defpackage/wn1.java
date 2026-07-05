package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wn1  reason: default package */
/* loaded from: classes.dex */
public abstract class wn1 {
    public static final xn1 a = new xn1(lz.c, kh5.I);

    public static final xn1 a(jz jzVar, lk0 lk0Var, rv4 rv4Var, int i) {
        boolean z;
        if (jzVar.equals(lz.c) && lk0Var.equals(kh5.I)) {
            rv4Var.e0(-1446604504);
            rv4Var.q(false);
            return a;
        }
        rv4Var.e0(-1446550657);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(jzVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !rv4Var.f(lk0Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object P = rv4Var.P();
        if (z3 || P == ax1.a) {
            P = new xn1(jzVar, lk0Var);
            rv4Var.o0(P);
        }
        xn1 xn1Var = (xn1) P;
        rv4Var.q(false);
        return xn1Var;
    }
}
