package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gfc  reason: default package */
/* loaded from: classes.dex */
public final class gfc extends ifc {
    public gfc() {
        super("TagName", 9);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        rccVar.j.R(vc1Var.G(-1, new v71(12)));
        char C = vc1Var.C();
        if (C != 0) {
            if (C != ' ') {
                if (C != '/') {
                    udc udcVar = ifc.d;
                    if (C != '>') {
                        if (C != 65535) {
                            if (C != '\t' && C != '\n' && C != '\f' && C != '\r') {
                                zbc zbcVar = rccVar.j;
                                zbcVar.getClass();
                                zbcVar.R(String.valueOf(C));
                                return;
                            }
                        } else {
                            rccVar.m(this);
                            rccVar.p(udcVar);
                            return;
                        }
                    } else {
                        rccVar.l();
                        rccVar.p(udcVar);
                        return;
                    }
                } else {
                    rccVar.p(ifc.o0);
                    return;
                }
            }
            rccVar.p(ifc.g0);
            return;
        }
        rccVar.j.R("�");
    }
}
