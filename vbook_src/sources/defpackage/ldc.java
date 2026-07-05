package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ldc  reason: default package */
/* loaded from: classes.dex */
public final class ldc extends ifc {
    public ldc() {
        super("CdataSection", 67);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        String g;
        rccVar.getClass();
        s26 s26Var = rccVar.f;
        vc1Var.getClass();
        s26 s26Var2 = vc1.J;
        int b1 = vc1Var.b1("]]>");
        if (b1 != -1) {
            g = cne.g(vc1Var.c, vc1Var.a, vc1Var.d, b1);
            vc1Var.d += b1;
        } else {
            int i = vc1Var.e;
            int i2 = vc1Var.d;
            if (i - i2 < 3) {
                g = vc1Var.S();
            } else {
                int i3 = i - 2;
                g = cne.g(vc1Var.c, vc1Var.a, i2, i3 - i2);
                vc1Var.d = i3;
            }
        }
        s26Var.k(g);
        if (!vc1Var.m0("]]>") && !vc1Var.g0()) {
            return;
        }
        String V = s26Var.V();
        tbc tbcVar = new tbc();
        s26 s26Var3 = tbcVar.d;
        s26Var3.getClass();
        s26Var3.O();
        s26Var3.b = V;
        rccVar.h(tbcVar);
        rccVar.p(ifc.d);
    }
}
