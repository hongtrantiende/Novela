package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hd5  reason: default package */
/* loaded from: classes.dex */
public final class hd5 extends de5 {
    public hd5() {
        super("AfterBody", 18);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        cp3 K = ed5Var.K("html");
        boolean p = lh9.p(de5.a, dccVar);
        nd5 nd5Var = de5.D;
        if (p) {
            if (K != null) {
                ed5Var.P((tbc) dccVar, K);
                return true;
            }
            nd5Var.a(dccVar, ed5Var);
            return true;
        } else if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
            return true;
        } else if (dccVar.b()) {
            ed5Var.H(this);
            return false;
        } else if (dccVar.e() && ((ybc) dccVar).W().equals("html")) {
            return nd5Var.a(dccVar, ed5Var);
        } else {
            if (dccVar.d() && ((xbc) dccVar).W().equals("html")) {
                if (ed5Var.x) {
                    ed5Var.H(this);
                    return false;
                }
                ed5Var.l = de5.S;
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
    }
}
