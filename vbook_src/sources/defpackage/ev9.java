package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ev9  reason: default package */
/* loaded from: classes.dex */
public abstract class ev9 {
    public static final gv9 a = new gv9(lz.a, kh5.F);

    public static final gv9 a(fz fzVar, mk0 mk0Var, rv4 rv4Var, int i) {
        boolean z;
        if (fzVar.equals(lz.a) && c16.i(mk0Var, kh5.F)) {
            rv4Var.e0(-1073830487);
            rv4Var.q(false);
            return a;
        }
        rv4Var.e0(-1073779616);
        boolean z2 = true;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(fzVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !rv4Var.f(mk0Var)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object P = rv4Var.P();
        if (z3 || P == ax1.a) {
            P = new gv9(fzVar, mk0Var);
            rv4Var.o0(P);
        }
        gv9 gv9Var = (gv9) P;
        rv4Var.q(false);
        return gv9Var;
    }
}
