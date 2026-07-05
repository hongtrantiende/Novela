package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fec  reason: default package */
/* loaded from: classes.dex */
public final class fec extends ifc {
    public fec() {
        super("RCDATAEndTagName", 12);
    }

    public static void b(rcc rccVar, vc1 vc1Var) {
        rccVar.i("</");
        rccVar.i(rccVar.f.V());
        vc1Var.l1();
        rccVar.p(ifc.f);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        if (vc1Var.N0()) {
            String G = vc1Var.G(-1, new v71(12));
            rccVar.j.R(G);
            rccVar.f.k(G);
            return;
        }
        char C = vc1Var.C();
        if (C != '\t' && C != '\n' && C != '\f' && C != '\r' && C != ' ') {
            if (C != '/') {
                if (C != '>') {
                    b(rccVar, vc1Var);
                } else if (rccVar.o()) {
                    rccVar.l();
                    rccVar.p(ifc.d);
                } else {
                    b(rccVar, vc1Var);
                }
            } else if (rccVar.o()) {
                rccVar.p(ifc.o0);
            } else {
                b(rccVar, vc1Var);
            }
        } else if (rccVar.o()) {
            rccVar.p(ifc.g0);
        } else {
            b(rccVar, vc1Var);
        }
    }
}
