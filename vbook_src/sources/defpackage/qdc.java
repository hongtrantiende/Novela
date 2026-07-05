package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qdc  reason: default package */
/* loaded from: classes.dex */
public final class qdc extends ifc {
    public qdc() {
        super("CommentEndBang", 50);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        ubc ubcVar = rccVar.m;
        vc1Var.getClass();
        char C = vc1Var.C();
        odc odcVar = ifc.u0;
        if (C != 0) {
            if (C != '-') {
                udc udcVar = ifc.d;
                if (C != '>') {
                    if (C != 65535) {
                        ubcVar.getClass();
                        ubcVar.d.k("--!");
                        ubcVar.O(C);
                        rccVar.p(odcVar);
                        return;
                    }
                    rccVar.m(this);
                    rccVar.j();
                    rccVar.p(udcVar);
                    return;
                }
                rccVar.j();
                rccVar.p(udcVar);
                return;
            }
            ubcVar.getClass();
            ubcVar.d.k("--!");
            rccVar.p(ifc.v0);
            return;
        }
        rccVar.n(this);
        ubcVar.getClass();
        ubcVar.d.k("--!");
        ubcVar.O((char) 65533);
        rccVar.p(odcVar);
    }
}
