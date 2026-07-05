package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: scc  reason: default package */
/* loaded from: classes.dex */
public final class scc extends ifc {
    public scc() {
        super("AfterAttributeName", 35);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        zcc zccVar = ifc.h0;
        if (C != 0) {
            if (C != ' ') {
                if (C != '\"' && C != '\'') {
                    if (C != '/') {
                        udc udcVar = ifc.d;
                        if (C != 65535) {
                            if (C != '\t' && C != '\n' && C != '\f' && C != '\r') {
                                switch (C) {
                                    case Token.GETVAR /* 60 */:
                                        break;
                                    case Token.SETVAR /* 61 */:
                                        rccVar.p(ifc.j0);
                                        return;
                                    case Token.CATCH_SCOPE /* 62 */:
                                        rccVar.l();
                                        rccVar.p(udcVar);
                                        return;
                                    default:
                                        rccVar.j.U();
                                        vc1Var.l1();
                                        rccVar.p(zccVar);
                                        return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            rccVar.m(this);
                            rccVar.p(udcVar);
                            return;
                        }
                    } else {
                        rccVar.p(ifc.o0);
                        return;
                    }
                }
                rccVar.n(this);
                rccVar.j.U();
                rccVar.j.O(C, vc1Var.g1() - 1, vc1Var.g1());
                rccVar.p(zccVar);
                return;
            }
            return;
        }
        rccVar.n(this);
        rccVar.j.O((char) 65533, vc1Var.g1() - 1, vc1Var.g1());
        rccVar.p(zccVar);
    }
}
