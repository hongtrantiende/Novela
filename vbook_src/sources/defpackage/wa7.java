package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wa7  reason: default package */
/* loaded from: classes3.dex */
public final class wa7 implements nu4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ xt4 f;

    public wa7(List list, boolean z, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4) {
        this.a = list;
        this.b = z;
        this.c = xt4Var;
        this.d = xt4Var2;
        this.e = xt4Var3;
        this.f = xt4Var4;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        xg6 xg6Var = (xg6) obj;
        int intValue = ((Number) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (rv4Var.f(xg6Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
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
            Object obj5 = this.a.get(intValue);
            rv4Var.e0(-226417468);
            boolean z2 = obj5 instanceof wb3;
            kq7 kq7Var = kq7.a;
            if (z2) {
                rv4Var.e0(-226384330);
                uaf.p(((wb3) obj5).a, zbe.y(pna.f(kq7Var, 1.0f), 4.0f), rv4Var, 48);
                rv4Var.q(false);
            } else if (obj5 instanceof ff1) {
                rv4Var.e0(-226118071);
                ff1 ff1Var = (ff1) obj5;
                nq7 a = xg6.a(xg6Var, pna.f(kq7Var, 1.0f));
                xt4 xt4Var = this.e;
                boolean h = rv4Var.h(obj5) | rv4Var.f(xt4Var);
                Object P = rv4Var.P();
                if (h || P == ax1.a) {
                    P = new w7(16, xt4Var, ff1Var);
                    rv4Var.o0(P);
                }
                uaf.g(this.b, ff1Var, a, this.c, this.d, (vt4) P, this.f, rv4Var, 0);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-225570828);
                rv4Var.q(false);
            }
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
