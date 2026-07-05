package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wdc  reason: default package */
/* loaded from: classes.dex */
public final class wdc extends ifc {
    public wdc() {
        super("DoctypeName", 53);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vbc vbcVar = rccVar.l;
        vc1Var.getClass();
        if (vc1Var.N0()) {
            vbcVar.d.k(vc1Var.G(-1, new v71(9)));
            return;
        }
        char C = vc1Var.C();
        if (C != 0) {
            if (C != ' ') {
                udc udcVar = ifc.d;
                if (C != '>') {
                    if (C != 65535) {
                        if (C != '\t' && C != '\n' && C != '\f' && C != '\r') {
                            vbcVar.d.j(C);
                            return;
                        }
                    } else {
                        rccVar.m(this);
                        vbcVar.h = true;
                        rccVar.k();
                        rccVar.p(udcVar);
                        return;
                    }
                } else {
                    rccVar.k();
                    rccVar.p(udcVar);
                    return;
                }
            }
            rccVar.p(ifc.B0);
            return;
        }
        rccVar.n(this);
        vbcVar.d.j((char) 65533);
    }
}
