package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sdc  reason: default package */
/* loaded from: classes.dex */
public final class sdc extends ifc {
    public sdc() {
        super("CommentStart", 45);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        odc odcVar = ifc.u0;
        if (C != 0) {
            if (C != '-') {
                udc udcVar = ifc.d;
                if (C != '>') {
                    if (C != 65535) {
                        vc1Var.l1();
                        rccVar.p(odcVar);
                        return;
                    }
                    rccVar.m(this);
                    rccVar.j();
                    rccVar.p(udcVar);
                    return;
                }
                rccVar.n(this);
                rccVar.j();
                rccVar.p(udcVar);
                return;
            }
            rccVar.p(ifc.t0);
            return;
        }
        rccVar.n(this);
        rccVar.m.O((char) 65533);
        rccVar.p(odcVar);
    }
}
