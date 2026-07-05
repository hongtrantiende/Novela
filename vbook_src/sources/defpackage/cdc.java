package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cdc  reason: default package */
/* loaded from: classes.dex */
public final class cdc extends ifc {
    public cdc() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        ifc.a.getClass();
        char[] cArr = ifc.c;
        String G = vc1Var.G(-1, new tc1(vc1Var, Arrays.copyOf(cArr, cArr.length)));
        if (G.length() > 0) {
            rccVar.j.i.k(G);
        }
        int g1 = vc1Var.g1();
        char C = vc1Var.C();
        if (C != 0) {
            if (C != ' ') {
                if (C != '\"' && C != '`') {
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
                                            rccVar.l();
                                            rccVar.p(udcVar);
                                            return;
                                        default:
                                            rccVar.j.P(C, g1, vc1Var.g1());
                                            return;
                                    }
                                }
                            } else {
                                int[] c = rccVar.c('>', true);
                                zbc zbcVar = rccVar.j;
                                if (c != null) {
                                    zbcVar.Q(c, g1, vc1Var.g1());
                                    return;
                                } else {
                                    zbcVar.P('&', g1, vc1Var.g1());
                                    return;
                                }
                            }
                        }
                    } else {
                        rccVar.m(this);
                        rccVar.p(udcVar);
                        return;
                    }
                }
                rccVar.n(this);
                rccVar.j.P(C, g1, vc1Var.g1());
                return;
            }
            rccVar.p(ifc.g0);
            return;
        }
        rccVar.n(this);
        rccVar.j.P((char) 65533, g1, vc1Var.g1());
    }
}
