package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gec  reason: default package */
/* loaded from: classes.dex */
public final class gec extends ifc {
    public gec() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        if (vc1Var.N0()) {
            rccVar.e(false);
            zbc zbcVar = rccVar.j;
            char V = vc1Var.V();
            zbcVar.getClass();
            zbcVar.R(String.valueOf(V));
            rccVar.f.j(vc1Var.V());
            rccVar.a(ifc.L);
            return;
        }
        rccVar.i("</");
        rccVar.p(ifc.f);
    }
}
