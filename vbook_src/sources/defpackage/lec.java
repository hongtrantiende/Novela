package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lec  reason: default package */
/* loaded from: classes.dex */
public final class lec extends ifc {
    public lec() {
        super("Rcdata", 2);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char V = vc1Var.V();
        if (V != 0) {
            if (V != '&') {
                if (V != '<') {
                    if (V != 65535) {
                        rccVar.i(vc1Var.G(-1, new v71(10)));
                        return;
                    } else {
                        rccVar.h(new wbc());
                        return;
                    }
                }
                rccVar.a(ifc.J);
                return;
            }
            rccVar.a(ifc.C);
            return;
        }
        rccVar.n(this);
        vc1Var.o();
        rccVar.g((char) 65533);
    }
}
