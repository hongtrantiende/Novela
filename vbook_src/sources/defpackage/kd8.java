package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kd8  reason: default package */
/* loaded from: classes.dex */
public final class kd8 extends pe8 {
    public static final kd8 c = new pe8(0, 4, 1);

    @Override // defpackage.pe8
    public final void a(vh1 vh1Var, ny nyVar, eqa eqaVar, zm9 zm9Var, qe8 qe8Var) {
        ls7 ls7Var = (ls7) vh1Var.d(2);
        ls7 ls7Var2 = (ls7) vh1Var.d(3);
        px1 px1Var = (px1) vh1Var.d(1);
        ks7 ks7Var = (ks7) vh1Var.d(0);
        if (ks7Var == null && (ks7Var = px1Var.p(ls7Var)) == null) {
            ex1.b("Could not resolve state for movable content");
            ls2.c();
            return;
        }
        bqa d = dqa.d(ks7Var.a);
        if (eqaVar.n > 0 || eqaVar.u(eqaVar.t + 1) != 1) {
            ex1.a("Check failed");
        }
        int i = eqaVar.t;
        int i2 = eqaVar.i;
        int i3 = eqaVar.j;
        eqaVar.a(1);
        eqaVar.R();
        eqaVar.d();
        eqa f = d.f();
        try {
            List k = gae.k(f, 2, eqaVar, false, true, true);
            f.e(true);
            eqaVar.k();
            eqaVar.j();
            eqaVar.t = i;
            eqaVar.i = i2;
            eqaVar.j = i3;
            voe.i(eqaVar, k, ls7Var2.c);
        } catch (Throwable th) {
            f.e(false);
            throw th;
        }
    }
}
