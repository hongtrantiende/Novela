package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: afc  reason: default package */
/* loaded from: classes.dex */
public final class afc extends ifc {
    public afc() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        if (vc1Var.g0()) {
            rccVar.m(this);
            rccVar.p(ifc.d);
            return;
        }
        char C = vc1Var.C();
        yec yecVar = ifc.U;
        if (C != 0) {
            if (C != '-') {
                if (C != '<') {
                    if (C != '>') {
                        rccVar.g(C);
                        rccVar.p(yecVar);
                        return;
                    }
                    rccVar.g(C);
                    rccVar.p(ifc.E);
                    return;
                }
                rccVar.p(ifc.X);
                return;
            }
            rccVar.g(C);
            return;
        }
        rccVar.n(this);
        rccVar.g((char) 65533);
        rccVar.p(yecVar);
    }
}
