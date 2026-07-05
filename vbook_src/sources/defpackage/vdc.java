package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vdc  reason: default package */
/* loaded from: classes.dex */
public final class vdc extends ifc {
    public vdc() {
        super("Doctype", 51);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vbc vbcVar = rccVar.l;
        vc1Var.getClass();
        char C = vc1Var.C();
        fdc fdcVar = ifc.z0;
        if (C != '\t' && C != '\n' && C != '\f' && C != '\r' && C != ' ') {
            udc udcVar = ifc.d;
            if (C != '>') {
                if (C != 65535) {
                    rccVar.n(this);
                    rccVar.p(fdcVar);
                    return;
                }
                rccVar.m(this);
                rccVar.n(this);
                rccVar.d();
                vbcVar.h = true;
                rccVar.k();
                rccVar.p(udcVar);
                return;
            }
            rccVar.n(this);
            rccVar.d();
            vbcVar.h = true;
            rccVar.k();
            rccVar.p(udcVar);
            return;
        }
        rccVar.p(fdcVar);
    }
}
