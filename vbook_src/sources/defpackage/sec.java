package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sec  reason: default package */
/* loaded from: classes.dex */
public final class sec extends ifc {
    public sec() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        qec qecVar = ifc.b0;
        if (C != 0) {
            if (C != '-') {
                if (C != '<') {
                    if (C != '>') {
                        if (C != 65535) {
                            rccVar.g(C);
                            rccVar.p(qecVar);
                            return;
                        }
                        rccVar.m(this);
                        rccVar.p(ifc.d);
                        return;
                    }
                    rccVar.g(C);
                    rccVar.p(ifc.E);
                    return;
                }
                rccVar.g(C);
                rccVar.p(ifc.e0);
                return;
            }
            rccVar.g(C);
            return;
        }
        rccVar.n(this);
        rccVar.g((char) 65533);
        rccVar.p(qecVar);
    }
}
