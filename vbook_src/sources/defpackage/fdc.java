package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fdc  reason: default package */
/* loaded from: classes.dex */
public final class fdc extends ifc {
    public fdc() {
        super("BeforeDoctypeName", 52);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vbc vbcVar = rccVar.l;
        vc1Var.getClass();
        boolean N0 = vc1Var.N0();
        wdc wdcVar = ifc.A0;
        if (N0) {
            rccVar.d();
            rccVar.p(wdcVar);
            return;
        }
        char C = vc1Var.C();
        if (C != 0) {
            if (C != ' ') {
                if (C != 65535) {
                    if (C != '\t' && C != '\n' && C != '\f' && C != '\r') {
                        rccVar.d();
                        vbcVar.d.j(C);
                        rccVar.p(wdcVar);
                        return;
                    }
                    return;
                }
                rccVar.m(this);
                rccVar.d();
                vbcVar.h = true;
                rccVar.k();
                rccVar.p(ifc.d);
                return;
            }
            return;
        }
        rccVar.n(this);
        rccVar.d();
        vbcVar.d.j((char) 65533);
        rccVar.p(wdcVar);
    }
}
