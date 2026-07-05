package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gd5  reason: default package */
/* loaded from: classes.dex */
public final class gd5 extends de5 {
    public gd5() {
        super("AfterAfterFrameset", 22);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (dccVar.a()) {
            ed5Var.Q((ubc) dccVar);
            return true;
        } else if (!dccVar.b() && !lh9.p(de5.a, dccVar) && (!dccVar.e() || !((ybc) dccVar).W().equals("html"))) {
            if (!dccVar.c()) {
                if (dccVar.e() && ((ybc) dccVar).W().equals("noframes")) {
                    return de5.e.a(dccVar, ed5Var);
                }
                ed5Var.H(this);
                return false;
            }
            return true;
        } else {
            return de5.D.a(dccVar, ed5Var);
        }
    }
}
