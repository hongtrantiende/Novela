package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ri7  reason: default package */
/* loaded from: classes3.dex */
public final class ri7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ lu4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ ri7(int i, xt4 xt4Var, lu4 lu4Var, String str, List list, Set set) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = set;
        this.e = lu4Var;
        this.f = xt4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        long j;
        int i2;
        int i3;
        int i4;
        boolean z2;
        long j2;
        int i5;
        int i6;
        int i7 = this.a;
        kq7 kq7Var = kq7.a;
        String str = this.c;
        List list = this.b;
        Object obj5 = ax1.a;
        Set set = this.d;
        lu4 lu4Var = this.e;
        xt4 xt4Var = this.f;
        switch (i7) {
            case 0:
                Object obj6 = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(obj6)) {
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
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    mq5 mq5Var = (mq5) list.get(intValue);
                    rv4Var.e0(661320626);
                    Object obj7 = mq5Var.a;
                    boolean i8 = c16.i(str, obj7);
                    boolean f = rv4Var.f(set) | rv4Var.f(obj7);
                    Object P = rv4Var.P();
                    if (f || P == obj5) {
                        P = Boolean.valueOf(set.contains(obj7));
                        rv4Var.o0(P);
                    }
                    boolean booleanValue = ((Boolean) P).booleanValue();
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    boolean f3 = rv4Var.f(lu4Var) | rv4Var.h(mq5Var);
                    Object P2 = rv4Var.P();
                    if (f3 || P2 == obj5) {
                        P2 = new w7(18, lu4Var, mq5Var);
                        rv4Var.o0(P2);
                    }
                    nq7 f4 = lbe.f(15, (vt4) P2, f2, null, false);
                    if (i8) {
                        rv4Var.e0(662033191);
                        j = rm1.g(((h27) rv4Var.j(j27.a)).a, 1.0f);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(662239868);
                        rv4Var.q(false);
                        j = zl1.h;
                    }
                    nq7 z3 = zbe.z(nmd.v(f4, j, lre.g), 24.0f, 4.0f);
                    boolean f5 = rv4Var.f(xt4Var) | rv4Var.h(mq5Var);
                    Object P3 = rv4Var.P();
                    if (f5 || P3 == obj5) {
                        P3 = new qi7(xt4Var, mq5Var, 0);
                        rv4Var.o0(P3);
                    }
                    o28.p(mq5Var, i8, booleanValue, z3, (vt4) P3, rv4Var, 0);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvc.a;
            default:
                xg6 xg6Var = (xg6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var2.f(xg6Var)) {
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
                    u2c u2cVar = (u2c) list.get(intValue3);
                    rv4Var2.e0(1524020321);
                    String str2 = u2cVar.a;
                    boolean i9 = c16.i(str, str2);
                    boolean f6 = rv4Var2.f(set) | rv4Var2.f(str2);
                    Object P4 = rv4Var2.P();
                    if (f6 || P4 == obj5) {
                        P4 = Boolean.valueOf(set.contains(str2));
                        rv4Var2.o0(P4);
                    }
                    boolean booleanValue2 = ((Boolean) P4).booleanValue();
                    nq7 f7 = pna.f(kq7Var, 1.0f);
                    boolean f8 = rv4Var2.f(lu4Var) | rv4Var2.h(u2cVar);
                    Object P5 = rv4Var2.P();
                    if (f8 || P5 == obj5) {
                        P5 = new do7(lu4Var, u2cVar, 0);
                        rv4Var2.o0(P5);
                    }
                    nq7 f9 = lbe.f(15, (vt4) P5, f7, null, false);
                    if (i9) {
                        rv4Var2.e0(1524732886);
                        j2 = rm1.g(((h27) rv4Var2.j(j27.a)).a, 1.0f);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(1524939563);
                        rv4Var2.q(false);
                        j2 = zl1.h;
                    }
                    nq7 z4 = zbe.z(nmd.v(f9, j2, lre.g), 24.0f, 4.0f);
                    boolean f10 = rv4Var2.f(xt4Var) | rv4Var2.h(u2cVar);
                    Object P6 = rv4Var2.P();
                    if (f10 || P6 == obj5) {
                        P6 = new w7(22, xt4Var, u2cVar);
                        rv4Var2.o0(P6);
                    }
                    l0e.t(u2cVar, i9, booleanValue2, z4, (vt4) P6, rv4Var2, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvc.a;
        }
    }
}
