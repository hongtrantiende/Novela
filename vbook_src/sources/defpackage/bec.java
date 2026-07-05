package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bec  reason: default package */
/* loaded from: classes.dex */
public final class bec extends ifc {
    public bec() {
        super("EndTagOpen", 8);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        ubc ubcVar = rccVar.m;
        vc1Var.getClass();
        boolean g0 = vc1Var.g0();
        udc udcVar = ifc.d;
        if (g0) {
            rccVar.m(this);
            rccVar.i("</");
            rccVar.p(udcVar);
        } else if (vc1Var.N0()) {
            rccVar.e(false);
            rccVar.p(ifc.I);
        } else if (vc1Var.y0('>')) {
            rccVar.n(this);
            rccVar.a(udcVar);
        } else {
            rccVar.n(this);
            ubcVar.f();
            ubcVar.O('/');
            rccVar.p(ifc.p0);
        }
    }
}
