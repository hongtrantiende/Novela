package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rdc  reason: default package */
/* loaded from: classes.dex */
public final class rdc extends ifc {
    public rdc() {
        super("CommentEndDash", 48);
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
                if (C != 65535) {
                    ubcVar.d.j('-');
                    ubcVar.O(C);
                    rccVar.p(odcVar);
                    return;
                }
                rccVar.m(this);
                rccVar.j();
                rccVar.p(ifc.d);
                return;
            }
            rccVar.p(ifc.w0);
            return;
        }
        rccVar.n(this);
        ubcVar.d.j('-');
        ubcVar.O((char) 65533);
        rccVar.p(odcVar);
    }
}
