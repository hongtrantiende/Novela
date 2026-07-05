package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h62  reason: default package */
/* loaded from: classes.dex */
public final class h62 implements mu4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ wc2 b;
    public final /* synthetic */ xt4 c;

    public h62(List list, wc2 wc2Var, xt4 xt4Var) {
        this.a = list;
        this.b = wc2Var;
        this.c = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        int intValue = ((Number) obj).intValue();
        rv4 rv4Var = (rv4) obj2;
        int intValue2 = ((Number) obj3).intValue();
        if ((intValue2 & 6) == 0) {
            if (rv4Var.d(intValue)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue2 |= i;
        }
        if ((intValue2 & 19) == 18 && rv4Var.E()) {
            rv4Var.X();
        } else {
            wc2 wc2Var = (wc2) this.a.get(intValue);
            boolean i2 = c16.i(this.b, wc2Var);
            rv4Var.e0(-1633490746);
            Object obj4 = this.c;
            boolean f = rv4Var.f(obj4) | rv4Var.f(wc2Var);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new t7(25, obj4, wc2Var);
                rv4Var.o0(P);
            }
            rv4Var.q(false);
            i62.d(wc2Var, i2, (vt4) P, null, rv4Var, 0);
        }
        return pvc.a;
    }
}
