package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ydc  reason: default package */
/* loaded from: classes.dex */
public final class ydc extends ifc {
    public ydc() {
        super("DoctypePublicIdentifier_singleQuoted", 58);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vbc vbcVar = rccVar.l;
        vc1Var.getClass();
        char C = vc1Var.C();
        if (C != 0) {
            if (C != '\'') {
                udc udcVar = ifc.d;
                if (C != '>') {
                    if (C != 65535) {
                        vbcVar.f.j(C);
                        return;
                    }
                    rccVar.m(this);
                    vbcVar.h = true;
                    rccVar.k();
                    rccVar.p(udcVar);
                    return;
                }
                rccVar.n(this);
                vbcVar.h = true;
                rccVar.k();
                rccVar.p(udcVar);
                return;
            }
            rccVar.p(ifc.G0);
            return;
        }
        rccVar.n(this);
        vbcVar.f.j((char) 65533);
    }
}
