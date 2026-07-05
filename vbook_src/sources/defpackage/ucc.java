package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ucc  reason: default package */
/* loaded from: classes.dex */
public final class ucc extends ifc {
    public ucc() {
        super("AfterDoctypeName", 54);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vbc vbcVar = rccVar.l;
        vc1Var.getClass();
        boolean g0 = vc1Var.g0();
        udc udcVar = ifc.d;
        if (g0) {
            rccVar.m(this);
            vbcVar.h = true;
            rccVar.k();
            rccVar.p(udcVar);
        } else if (vc1Var.I0('\t', '\n', '\r', '\f', ' ')) {
            vc1Var.o();
        } else if (vc1Var.y0('>')) {
            rccVar.k();
            rccVar.a(udcVar);
        } else if (vc1Var.p0("PUBLIC")) {
            vbcVar.e = "PUBLIC";
            rccVar.p(ifc.C0);
        } else if (vc1Var.p0("SYSTEM")) {
            vbcVar.e = "SYSTEM";
            rccVar.p(ifc.I0);
        } else {
            rccVar.n(this);
            vbcVar.h = true;
            rccVar.a(ifc.N0);
        }
    }
}
