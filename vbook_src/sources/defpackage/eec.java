package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eec  reason: default package */
/* loaded from: classes.dex */
public final class eec extends ifc {
    public eec() {
        super("PLAINTEXT", 6);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char V = vc1Var.V();
        if (V != 0) {
            if (V != 65535) {
                rccVar.i(vc1Var.Q((char) 0));
                return;
            } else {
                rccVar.h(new wbc());
                return;
            }
        }
        rccVar.n(this);
        vc1Var.o();
        rccVar.g((char) 65533);
    }
}
