package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yec  reason: default package */
/* loaded from: classes.dex */
public final class yec extends ifc {
    public yec() {
        super("ScriptDataEscaped", 21);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        if (vc1Var.g0()) {
            rccVar.m(this);
            rccVar.p(ifc.d);
            return;
        }
        char V = vc1Var.V();
        if (V != 0) {
            if (V != '-') {
                if (V != '<') {
                    rccVar.i(vc1Var.G(-1, new tc1(new char[]{'-', '<', 0})));
                    return;
                } else {
                    rccVar.a(ifc.X);
                    return;
                }
            }
            rccVar.g('-');
            rccVar.a(ifc.V);
            return;
        }
        rccVar.n(this);
        vc1Var.o();
        rccVar.g((char) 65533);
    }
}
