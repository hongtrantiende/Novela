package defpackage;

import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x74  reason: default package */
/* loaded from: classes3.dex */
public final class x74 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;

    public /* synthetic */ x74(List list, Set set, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = set;
        this.d = xt4Var;
        this.e = xt4Var2;
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
        kq7 kq7Var = kq7.a;
        Set set = this.c;
        List list = this.b;
        xt4 xt4Var = this.d;
        Object obj5 = ax1.a;
        xt4 xt4Var2 = this.e;
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
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    l54 l54Var = (l54) list.get(intValue);
                    rv4Var.e0(-842719754);
                    boolean contains = set.contains(l54Var.a);
                    nq7 a = yf6.a(yf6Var, kq7Var);
                    f99 f99Var = j27.a;
                    nq7 k = tte.k(a, ((h27) rv4Var.j(f99Var)).c.a);
                    boolean z3 = l54Var.p;
                    boolean f = rv4Var.f(xt4Var) | rv4Var.h(l54Var);
                    Object P = rv4Var.P();
                    if (f || P == obj5) {
                        P = new bw0(xt4Var, l54Var, 3);
                        rv4Var.o0(P);
                    }
                    nq7 z4 = zbe.z(nmd.v(lbe.f(14, (vt4) P, k, null, z3), rm1.g(((h27) rv4Var.j(f99Var)).a, 1.0f), lre.g), 16.0f, 8.0f);
                    boolean f2 = rv4Var.f(xt4Var2) | rv4Var.h(l54Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == obj5) {
                        P2 = new bw0(xt4Var2, l54Var, 4);
                        rv4Var.o0(P2);
                    }
                    sue.a(l54Var, g34.a, contains, z4, (vt4) P2, rv4Var, 48, 0);
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
                int i8 = i4;
                if ((i8 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i8 & 1, z2)) {
                    l54 l54Var2 = (l54) list.get(intValue3);
                    rv4Var2.e0(997352399);
                    boolean contains2 = set.contains(l54Var2.a);
                    nq7 a2 = yf6.a(yf6Var2, kq7Var);
                    tza tzaVar = j27.a;
                    nq7 k2 = tte.k(a2, ((h27) rv4Var2.j(tzaVar)).c.a);
                    boolean z5 = l54Var2.p;
                    boolean f3 = rv4Var2.f(xt4Var) | rv4Var2.h(l54Var2);
                    Object P3 = rv4Var2.P();
                    if (f3 || P3 == obj5) {
                        P3 = new bw0(xt4Var, l54Var2, 5);
                        rv4Var2.o0(P3);
                    }
                    nq7 z6 = zbe.z(nmd.v(lbe.f(14, (vt4) P3, k2, null, z5), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g), 16.0f, 8.0f);
                    boolean f4 = rv4Var2.f(xt4Var2) | rv4Var2.h(l54Var2);
                    Object P4 = rv4Var2.P();
                    if (f4 || P4 == obj5) {
                        P4 = new bw0(xt4Var2, l54Var2, 6);
                        rv4Var2.o0(P4);
                    }
                    sue.a(l54Var2, g34.c, contains2, z6, (vt4) P4, rv4Var2, 48, 0);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
