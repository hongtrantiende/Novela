package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hfc  reason: default package */
/* loaded from: classes.dex */
public final class hfc extends ifc {
    public hfc() {
        super("TagOpen", 7);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char V = vc1Var.V();
        if (V != '!') {
            if (V != '/') {
                if (V != '?') {
                    if (vc1Var.N0()) {
                        rccVar.e(true);
                        rccVar.p(ifc.I);
                        return;
                    }
                    rccVar.n(this);
                    rccVar.g('<');
                    rccVar.p(ifc.d);
                    return;
                } else if (rccVar.g == rc3.b) {
                    rccVar.a(ifc.r0);
                    return;
                } else {
                    rccVar.m.f();
                    rccVar.p(ifc.p0);
                    return;
                }
            }
            rccVar.a(ifc.H);
            return;
        }
        rccVar.a(ifc.q0);
    }
}
