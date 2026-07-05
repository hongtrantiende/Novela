package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ffc  reason: default package */
/* loaded from: classes.dex */
public final class ffc extends ifc {
    public ffc() {
        super("SelfClosingStartTag", 41);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        udc udcVar = ifc.d;
        if (C != '>') {
            if (C != 65535) {
                vc1Var.l1();
                rccVar.n(this);
                rccVar.p(ifc.g0);
                return;
            }
            rccVar.m(this);
            rccVar.p(udcVar);
            return;
        }
        rccVar.j.f = true;
        rccVar.l();
        rccVar.p(udcVar);
    }
}
