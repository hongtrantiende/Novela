package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tcc  reason: default package */
/* loaded from: classes.dex */
public final class tcc extends ifc {
    public tcc() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        ddc ddcVar = ifc.g0;
        if (C != '\t' && C != '\n' && C != '\f' && C != '\r' && C != ' ') {
            if (C != '/') {
                udc udcVar = ifc.d;
                if (C != 65535) {
                    if (C != '>') {
                        if (C != '?') {
                            vc1Var.l1();
                            rccVar.n(this);
                            rccVar.p(ddcVar);
                            return;
                        } else if (!(rccVar.j instanceof bcc)) {
                            vc1Var.l1();
                            rccVar.n(this);
                            rccVar.p(ddcVar);
                            return;
                        } else {
                            return;
                        }
                    }
                    rccVar.l();
                    rccVar.p(udcVar);
                    return;
                }
                rccVar.m(this);
                rccVar.p(udcVar);
                return;
            }
            rccVar.p(ifc.o0);
            return;
        }
        rccVar.p(ddcVar);
    }
}
