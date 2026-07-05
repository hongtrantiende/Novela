package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tq3  reason: default package */
/* loaded from: classes3.dex */
public final class tq3 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ as3 d;

    public /* synthetic */ tq3(List list, xt4 xt4Var, as3 as3Var, int i) {
        this.a = i;
        this.b = list;
        this.c = xt4Var;
        this.d = as3Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7 = this.a;
        pvc pvcVar = pvc.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        List list = this.b;
        xt4 xt4Var = this.c;
        as3 as3Var = this.d;
        switch (i7) {
            case 0:
                yf6 yf6Var = (yf6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(yf6Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    i = intValue2 | i3;
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
                int i8 = i;
                if ((i8 & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i8 & 1, z)) {
                    vp3 vp3Var = (vp3) list.get(intValue);
                    rv4Var.e0(895084861);
                    nq7 t = jsc.t(1.0f, pna.f(kq7Var, 1.0f), false);
                    boolean f = rv4Var.f(xt4Var) | rv4Var.f(as3Var) | rv4Var.h(vp3Var);
                    Object P = rv4Var.P();
                    if (f || P == lh9Var) {
                        P = new rq3(vp3Var, xt4Var, as3Var, 0);
                        rv4Var.o0(P);
                    }
                    fxe.b(vp3Var, zbe.y(yf6.a(yf6Var, lbe.f(15, (vt4) P, t, null, false)), 4.0f), rv4Var, 0);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                yf6 yf6Var2 = (yf6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(yf6Var2)) {
                        i6 = 4;
                    } else {
                        i6 = 2;
                    }
                    i4 = intValue4 | i6;
                } else {
                    i4 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (rv4Var2.d(intValue3)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                    i4 |= i5;
                }
                if ((i4 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i4 & 1, z2)) {
                    vp3 vp3Var2 = (vp3) list.get(intValue3);
                    rv4Var2.e0(405148734);
                    nq7 t2 = jsc.t(1.0f, pna.f(kq7Var, 1.0f), false);
                    boolean f2 = rv4Var2.f(xt4Var) | rv4Var2.f(as3Var) | rv4Var2.h(vp3Var2);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new rq3(vp3Var2, xt4Var, as3Var, 1);
                        rv4Var2.o0(P2);
                    }
                    fxe.b(vp3Var2, zbe.y(lbe.f(15, (vt4) P2, t2, null, false), 4.0f), rv4Var2, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
