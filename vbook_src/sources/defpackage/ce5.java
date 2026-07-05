package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ce5  reason: default package */
/* loaded from: classes.dex */
public final class ce5 extends de5 {
    public ce5() {
        super("Text", 7);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        dccVar.getClass();
        if (((acc) dccVar.c) == acc.e) {
            ed5Var.O((tbc) dccVar, false);
            return true;
        } else if (dccVar.c()) {
            ed5Var.H(this);
            ed5Var.r();
            de5 de5Var = ed5Var.m;
            ed5Var.l = de5Var;
            if (de5Var == this) {
                ed5Var.l = de5.D;
            }
            return ed5Var.s(dccVar);
        } else if (dccVar.d()) {
            ed5Var.r();
            ed5Var.l = ed5Var.m;
            return true;
        } else {
            return true;
        }
    }
}
