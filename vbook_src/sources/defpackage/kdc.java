package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kdc  reason: default package */
/* loaded from: classes.dex */
public final class kdc extends ifc {
    public kdc() {
        super("BogusDoctype", 66);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        udc udcVar = ifc.d;
        if (C != '>') {
            if (C != 65535) {
                return;
            }
            rccVar.k();
            rccVar.p(udcVar);
            return;
        }
        rccVar.k();
        rccVar.p(udcVar);
    }
}
