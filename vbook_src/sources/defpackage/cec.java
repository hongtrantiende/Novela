package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cec  reason: default package */
/* loaded from: classes.dex */
public final class cec extends ifc {
    public cec() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        ubc ubcVar = rccVar.m;
        vc1Var.getClass();
        if (vc1Var.m0("--")) {
            ubcVar.f();
            rccVar.p(ifc.s0);
        } else if (vc1Var.p0("DOCTYPE")) {
            rccVar.p(ifc.y0);
        } else if (vc1Var.m0("[CDATA[")) {
            rccVar.f();
            rccVar.p(ifc.O0);
        } else if (rccVar.g == rc3.b && vc1Var.N0()) {
            bcc bccVar = rccVar.n;
            bccVar.f();
            bccVar.k = true;
            rccVar.j = bccVar;
            rccVar.p(ifc.I);
        } else {
            rccVar.n(this);
            ubcVar.f();
            rccVar.p(ifc.p0);
        }
    }
}
