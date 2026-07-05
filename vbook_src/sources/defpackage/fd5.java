package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fd5  reason: default package */
/* loaded from: classes.dex */
public final class fd5 extends de5 {
    public fd5() {
        super("AfterAfterBody", 21);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
            return true;
        }
        boolean b = dccVar.b();
        nd5 nd5Var = de5.D;
        if (!b && (!dccVar.e() || !((ybc) dccVar).W().equals("html"))) {
            if (lh9.p(de5.a, dccVar)) {
                ed5Var.P((tbc) dccVar, ed5Var.j());
                return true;
            } else if (!dccVar.c()) {
                ed5Var.H(this);
                if (!ed5Var.X("body")) {
                    ArrayList arrayList = ed5Var.e;
                    arrayList.getClass();
                    arrayList.add(ed5Var.j().a0());
                }
                ed5Var.l = nd5Var;
                return ed5Var.s(dccVar);
            } else {
                return true;
            }
        }
        return nd5Var.a(dccVar, ed5Var);
    }
}
