package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: idc  reason: default package */
/* loaded from: classes.dex */
public final class idc extends ifc {
    public idc() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 60);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vbc vbcVar = rccVar.l;
        vc1Var.getClass();
        char C = vc1Var.C();
        if (C != '\t' && C != '\n' && C != '\f' && C != '\r' && C != ' ') {
            if (C != '\"') {
                if (C != '\'') {
                    udc udcVar = ifc.d;
                    if (C != '>') {
                        if (C != 65535) {
                            rccVar.n(this);
                            vbcVar.h = true;
                            rccVar.p(ifc.N0);
                            return;
                        }
                        rccVar.m(this);
                        vbcVar.h = true;
                        rccVar.k();
                        rccVar.p(udcVar);
                        return;
                    }
                    rccVar.k();
                    rccVar.p(udcVar);
                    return;
                }
                rccVar.n(this);
                rccVar.p(ifc.L0);
                return;
            }
            rccVar.n(this);
            rccVar.p(ifc.K0);
        }
    }
}
