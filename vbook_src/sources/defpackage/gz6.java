package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gz6  reason: default package */
/* loaded from: classes3.dex */
public final class gz6 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ vo9 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ mu4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ gz6(List list, vo9 vo9Var, aw7 aw7Var, mu4 mu4Var, xt4 xt4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = vo9Var;
        this.d = aw7Var;
        this.e = mu4Var;
        this.f = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        List list = this.b;
        int i4 = 16;
        int i5 = 2;
        switch (i3) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(xg6Var)) {
                        i5 = 4;
                    }
                    i = i5 | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    mvb mvbVar = (mvb) list.get(intValue);
                    rv4Var.e0(1434014689);
                    if (intValue == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (intValue == tl1.x((List) aw7Var.getValue())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    vqe.p(xg6Var, this.c, mvbVar.a, null, false, null, jce.E(3624498, new pr3(z2, z3, this.e, mvbVar, this.f, this.d, 1), rv4Var), rv4Var, (i & 14) | 1572864, 28);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var2 = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(xg6Var2)) {
                        i5 = 4;
                    }
                    i2 = i5 | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((i2 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var2.U(i2 & 1, z4)) {
                    gc9 gc9Var = (gc9) list.get(intValue3);
                    rv4Var2.e0(-1663186337);
                    if (intValue3 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (intValue3 == tl1.x((List) aw7Var.getValue())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    vqe.p(xg6Var2, this.c, gc9Var.a, null, false, null, jce.E(1400808167, new pr3(z5, z6, this.e, gc9Var, this.f, this.d, 2), rv4Var2), rv4Var2, (i2 & 14) | 1572864, 28);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
