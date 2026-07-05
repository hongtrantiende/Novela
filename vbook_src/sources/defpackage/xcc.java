package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xcc  reason: default package */
/* loaded from: classes.dex */
public final class xcc extends ifc {
    public xcc() {
        super("AfterDoctypeSystemIdentifier", 65);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        if (C != '\t' && C != '\n' && C != '\f' && C != '\r' && C != ' ') {
            udc udcVar = ifc.d;
            if (C != '>') {
                if (C != 65535) {
                    rccVar.n(this);
                    rccVar.p(ifc.N0);
                    return;
                }
                rccVar.m(this);
                rccVar.l.h = true;
                rccVar.k();
                rccVar.p(udcVar);
                return;
            }
            rccVar.k();
            rccVar.p(udcVar);
        }
    }
}
