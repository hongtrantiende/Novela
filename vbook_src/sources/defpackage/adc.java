package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: adc  reason: default package */
/* loaded from: classes.dex */
public final class adc extends ifc {
    public adc() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        String G = vc1Var.G(-1, new uc1(0, false));
        int length = G.length();
        zbc zbcVar = rccVar.j;
        if (length > 0) {
            zbcVar.i.k(G);
        } else {
            zbcVar.j = true;
        }
        int g1 = vc1Var.g1();
        char C = vc1Var.C();
        if (C != 0) {
            if (C != '\"') {
                if (C != '&') {
                    if (C != 65535) {
                        rccVar.j.P(C, g1, vc1Var.g1());
                        return;
                    }
                    rccVar.m(this);
                    rccVar.p(ifc.d);
                    return;
                }
                int[] c = rccVar.c('\"', true);
                zbc zbcVar2 = rccVar.j;
                if (c != null) {
                    zbcVar2.Q(c, g1, vc1Var.g1());
                    return;
                } else {
                    zbcVar2.P('&', g1, vc1Var.g1());
                    return;
                }
            }
            rccVar.p(ifc.n0);
            return;
        }
        rccVar.n(this);
        rccVar.j.P((char) 65533, g1, vc1Var.g1());
    }
}
