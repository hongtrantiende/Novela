package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: to7  reason: default package */
/* loaded from: classes3.dex */
public final class to7 implements nu4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ aw7 d;

    public to7(List list, int i, xt4 xt4Var, aw7 aw7Var) {
        this.a = list;
        this.b = i;
        this.c = xt4Var;
        this.d = aw7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        Object obj5 = (xg6) obj;
        int intValue = ((Number) obj2).intValue();
        rv4 rv4Var = (rv4) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (rv4Var.f(obj5)) {
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
        boolean z3 = true;
        if ((i & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            gh1 gh1Var = (gh1) this.a.get(intValue);
            rv4Var.e0(-1714494161);
            boolean z4 = gh1Var.c;
            String str = gh1Var.a;
            if (z4) {
                str = nk2.u(str, " (Online)");
            }
            String str2 = str;
            String str3 = gh1Var.b;
            if (this.b == intValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            nq7 f = pna.f(kq7.a, 1.0f);
            Boolean valueOf = Boolean.valueOf(z2);
            xt4 xt4Var = this.c;
            boolean f2 = rv4Var.f(xt4Var);
            if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !rv4Var.d(intValue)) && (i & 48) != 32) {
                z3 = false;
            }
            boolean z5 = f2 | z3;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                P = new ro7(intValue, xt4Var, this.d);
                rv4Var.o0(P);
            }
            iue.g(str2, str3, null, valueOf, f, (vt4) P, rv4Var, 24576, 4);
            rv4Var.q(false);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
