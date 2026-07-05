package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: edc  reason: default package */
/* loaded from: classes.dex */
public final class edc extends ifc {
    public edc() {
        super("BeforeAttributeValue", 36);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        char C = vc1Var.C();
        cdc cdcVar = ifc.m0;
        if (C != 0) {
            if (C != ' ') {
                if (C != '\"') {
                    if (C != '`') {
                        udc udcVar = ifc.d;
                        if (C != 65535) {
                            if (C != '\t' && C != '\n' && C != '\f' && C != '\r') {
                                if (C != '&') {
                                    if (C != '\'') {
                                        switch (C) {
                                            case Token.GETVAR /* 60 */:
                                            case Token.SETVAR /* 61 */:
                                                break;
                                            case Token.CATCH_SCOPE /* 62 */:
                                                rccVar.n(this);
                                                rccVar.l();
                                                rccVar.p(udcVar);
                                                return;
                                            default:
                                                vc1Var.l1();
                                                rccVar.p(cdcVar);
                                                return;
                                        }
                                    } else {
                                        rccVar.p(ifc.l0);
                                        return;
                                    }
                                } else {
                                    vc1Var.l1();
                                    rccVar.p(cdcVar);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            rccVar.m(this);
                            rccVar.l();
                            rccVar.p(udcVar);
                            return;
                        }
                    }
                    rccVar.n(this);
                    rccVar.j.P(C, vc1Var.g1() - 1, vc1Var.g1());
                    rccVar.p(cdcVar);
                    return;
                }
                rccVar.p(ifc.k0);
                return;
            }
            return;
        }
        rccVar.n(this);
        rccVar.j.P((char) 65533, vc1Var.g1() - 1, vc1Var.g1());
        rccVar.p(cdcVar);
    }
}
