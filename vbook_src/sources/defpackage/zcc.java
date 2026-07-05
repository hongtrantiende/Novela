package defpackage;

import java.util.Arrays;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zcc  reason: default package */
/* loaded from: classes.dex */
public final class zcc extends ifc {
    public zcc() {
        super("AttributeName", 34);
    }

    @Override // defpackage.ifc
    public final void a(rcc rccVar, vc1 vc1Var) {
        rccVar.getClass();
        vc1Var.getClass();
        ifc.a.getClass();
        char[] cArr = ifc.b;
        String G = vc1Var.G(-1, new tc1(vc1Var, Arrays.copyOf(cArr, cArr.length)));
        zbc zbcVar = rccVar.j;
        zbcVar.getClass();
        String replace = G.replace((char) 0, (char) 65533);
        replace.getClass();
        zbcVar.h.k(replace);
        int g1 = vc1Var.g1();
        char C = vc1Var.C();
        scc sccVar = ifc.i0;
        if (C != '\t' && C != '\n' && C != '\f' && C != '\r' && C != ' ') {
            if (C != '\"' && C != '\'') {
                if (C != '/') {
                    udc udcVar = ifc.d;
                    if (C != 65535) {
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
                            case Token.ENUM_INIT_KEYS /* 63 */:
                                if (rccVar.g == rc3.b && (rccVar.j instanceof bcc)) {
                                    rccVar.p(sccVar);
                                    return;
                                } else {
                                    rccVar.j.O(C, g1, vc1Var.g1());
                                    return;
                                }
                            default:
                                rccVar.j.O(C, g1, vc1Var.g1());
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
            rccVar.j.O(C, g1, vc1Var.g1());
            return;
        }
        rccVar.p(sccVar);
    }
}
