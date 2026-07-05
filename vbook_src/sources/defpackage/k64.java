package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k64  reason: default package */
/* loaded from: classes3.dex */
public final class k64 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ k64(List list, List list2, xt4 xt4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        v72 d;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        v72 d2;
        int i4;
        int i5 = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        List list = this.c;
        List list2 = this.b;
        int i6 = 2;
        boolean z5 = true;
        xt4 xt4Var = this.d;
        switch (i5) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(xg6Var)) {
                        i6 = 4;
                    }
                    i = intValue2 | i6;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    f84 f84Var = (f84) list2.get(intValue);
                    rv4Var.e0(1848911488);
                    if (intValue == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (intValue != tl1.x(list)) {
                        z5 = false;
                    }
                    nq7 a = xg6.a(xg6Var, pna.f(kq7Var, 1.0f));
                    if (!z2 && !z5) {
                        rv4Var.e0(1168031689);
                        d = ((h27) rv4Var.j(j27.a)).c.a;
                        rv4Var.q(false);
                    } else if (z2 && z5) {
                        rv4Var.e0(1168034308);
                        d = ((h27) rv4Var.j(j27.a)).c.d;
                        rv4Var.q(false);
                    } else if (z2) {
                        rv4Var.e0(1849402062);
                        tza tzaVar = j27.a;
                        d = v72.d(((h27) rv4Var.j(tzaVar)).c.d, null, null, ((h27) rv4Var.j(tzaVar)).c.a.c, ((h27) rv4Var.j(tzaVar)).c.a.d, 3);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(1168045672);
                        tza tzaVar2 = j27.a;
                        d = v72.d(((h27) rv4Var.j(tzaVar2)).c.d, ((h27) rv4Var.j(tzaVar2)).c.a.a, ((h27) rv4Var.j(tzaVar2)).c.a.b, null, null, 12);
                        rv4Var.q(false);
                    }
                    nq7 z6 = zbe.z(nmd.v(tte.k(a, d), rm1.g(((h27) rv4Var.j(j27.a)).a, 1.0f), lre.g), 16.0f, 12.0f);
                    boolean f = rv4Var.f(xt4Var) | rv4Var.h(f84Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new w7(12, xt4Var, f84Var);
                        rv4Var.o0(P);
                    }
                    que.f(f84Var, z6, (vt4) P, rv4Var, 0);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                yf6 yf6Var = (yf6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(yf6Var)) {
                        i6 = 4;
                    }
                    i3 = intValue4 | i6;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var2.U(i3 & 1, z3)) {
                    wzc wzcVar = (wzc) list2.get(intValue3);
                    rv4Var2.e0(953940640);
                    if (intValue3 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (intValue3 != tl1.x(list)) {
                        z5 = false;
                    }
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    if (!z4 && !z5) {
                        rv4Var2.e0(446424265);
                        d2 = ((h27) rv4Var2.j(j27.a)).c.a;
                        rv4Var2.q(false);
                    } else if (z4 && z5) {
                        rv4Var2.e0(446427012);
                        d2 = ((h27) rv4Var2.j(j27.a)).c.d;
                        rv4Var2.q(false);
                    } else if (z4) {
                        rv4Var2.e0(954416706);
                        tza tzaVar3 = j27.a;
                        d2 = v72.d(((h27) rv4Var2.j(tzaVar3)).c.d, null, null, ((h27) rv4Var2.j(tzaVar3)).c.a.c, ((h27) rv4Var2.j(tzaVar3)).c.a.d, 3);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(446439028);
                        tza tzaVar4 = j27.a;
                        d2 = v72.d(((h27) rv4Var2.j(tzaVar4)).c.d, ((h27) rv4Var2.j(tzaVar4)).c.a.a, ((h27) rv4Var2.j(tzaVar4)).c.a.b, null, null, 12);
                        rv4Var2.q(false);
                    }
                    nq7 v = nmd.v(tte.k(f2, d2), rm1.g(((h27) rv4Var2.j(j27.a)).a, 1.0f), lre.g);
                    boolean f3 = rv4Var2.f(xt4Var) | rv4Var2.h(wzcVar);
                    Object P2 = rv4Var2.P();
                    if (f3 || P2 == lh9Var) {
                        P2 = new jua(xt4Var, wzcVar, 3);
                        rv4Var2.o0(P2);
                    }
                    hif.f(wzcVar, zbe.z(lbe.f(15, (vt4) P2, v, null, false), 16.0f, 8.0f), rv4Var2, 8);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
