package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wd5  reason: default package */
/* loaded from: classes.dex */
public final class wd5 extends de5 {
    public wd5() {
        super("InSelectInTable", 16);
    }

    @Override // defpackage.de5
    public final boolean a(dcc dccVar, ed5 ed5Var) {
        String[] strArr = xxe.I;
        dccVar.getClass();
        if (dccVar.e()) {
            String[] strArr2 = d4b.a;
            if (d4b.c(((ybc) dccVar).W(), strArr)) {
                ed5Var.H(this);
                ed5Var.Z("select");
                ed5Var.e0();
                return ed5Var.s(dccVar);
            }
        }
        if (dccVar.d()) {
            String[] strArr3 = d4b.a;
            xbc xbcVar = (xbc) dccVar;
            if (d4b.c(xbcVar.W(), strArr)) {
                ed5Var.H(this);
                if (ed5Var.M(xbcVar.W(), ed5.E, null)) {
                    ed5Var.Z("select");
                    ed5Var.e0();
                    return ed5Var.s(dccVar);
                }
                return false;
            }
        }
        return de5.M.a(dccVar, ed5Var);
    }
}
