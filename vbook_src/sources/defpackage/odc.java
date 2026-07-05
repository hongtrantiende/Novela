package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: odc  reason: default package */
/* loaded from: classes.dex */
public final class odc extends ifc {
    public odc() {
        super("Comment", 47);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        ubc ubcVar = rccVar.m;
        vc1Var.getClass();
        char V = vc1Var.V();
        if (V != 0) {
            if (V != '-') {
                if (V != 65535) {
                    String G = vc1Var.G(-1, new tc1(new char[]{'-', 0}));
                    ubcVar.getClass();
                    ubcVar.d.k(G);
                    return;
                }
                rccVar.m(this);
                rccVar.j();
                rccVar.p(ifc.d);
                return;
            }
            rccVar.a(ifc.v0);
            return;
        }
        rccVar.n(this);
        vc1Var.o();
        ubcVar.O((char) 65533);
    }
}
