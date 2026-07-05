package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: efc  reason: default package */
/* loaded from: classes.dex */
public final class efc extends ifc {
    public efc() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        if (C != '!') {
            if (C != '/') {
                if (C != 65535) {
                    rccVar.g('<');
                    vc1Var.l1();
                    rccVar.p(ifc.E);
                    return;
                }
                rccVar.g('<');
                rccVar.m(this);
                rccVar.p(ifc.d);
                return;
            }
            rccVar.f();
            rccVar.p(ifc.Q);
            return;
        }
        rccVar.i("<!");
        rccVar.p(ifc.S);
    }
}
