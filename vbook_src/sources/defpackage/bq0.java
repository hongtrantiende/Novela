package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bq0  reason: default package */
/* loaded from: classes3.dex */
public final class bq0 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ bq0(List list, xt4 xt4Var, xt4 xt4Var2, int i) {
        this.a = i;
        this.b = list;
        this.c = xt4Var;
        this.d = xt4Var2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        int i8;
        int i9;
        boolean z6;
        int i10;
        int i11 = this.a;
        xt4 xt4Var = this.c;
        Object obj5 = ax1.a;
        xt4 xt4Var2 = this.d;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        List list = this.b;
        int i12 = 32;
        int i13 = 2;
        int i14 = 4;
        switch (i11) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(xg6Var)) {
                        i13 = 4;
                    }
                    i = i13 | intValue2;
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
                    go0 go0Var = (go0) list.get(intValue);
                    rv4Var.e0(1824990833);
                    String str = go0Var.a;
                    String str2 = go0Var.b;
                    String str3 = go0Var.d;
                    String str4 = go0Var.e;
                    String str5 = go0Var.c;
                    nq7 a = xg6.a(xg6Var, pna.s(kq7Var, 120.0f));
                    boolean f = rv4Var.f(xt4Var) | rv4Var.h(go0Var);
                    Object P = rv4Var.P();
                    if (f || P == obj5) {
                        P = new aq0(xt4Var, go0Var, 0);
                        rv4Var.o0(P);
                    }
                    vt4 vt4Var = (vt4) P;
                    boolean f2 = rv4Var.f(xt4Var2) | rv4Var.h(go0Var);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == obj5) {
                        P2 = new aq0(xt4Var2, go0Var, 1);
                        rv4Var.o0(P2);
                    }
                    nye.d(str, str2, str3, str4, str5, a, vt4Var, (vt4) P2, rv4Var, 0, 0);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                yf6 yf6Var = (yf6) obj;
                int intValue3 = ((Number) obj2).intValue();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    if (!rv4Var2.f(yf6Var)) {
                        i14 = 2;
                    }
                    i3 = intValue4 | i14;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (!rv4Var2.d(intValue3)) {
                        i12 = 16;
                    }
                    i3 |= i12;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i3 & 1, z2)) {
                    l54 l54Var = (l54) list.get(intValue3);
                    rv4Var2.e0(899501514);
                    nq7 a2 = yf6.a(yf6Var, kq7Var);
                    tza tzaVar = j27.a;
                    nq7 k = tte.k(a2, ((h27) rv4Var2.j(tzaVar)).c.a);
                    boolean z7 = l54Var.p;
                    boolean f3 = rv4Var2.f(xt4Var) | rv4Var2.h(l54Var);
                    Object P3 = rv4Var2.P();
                    if (f3 || P3 == obj5) {
                        P3 = new bw0(xt4Var, l54Var, 1);
                        rv4Var2.o0(P3);
                    }
                    nq7 z8 = zbe.z(nmd.v(lbe.f(14, (vt4) P3, k, null, z7), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 1.0f), lre.g), 16.0f, 8.0f);
                    boolean f4 = rv4Var2.f(xt4Var2) | rv4Var2.h(l54Var);
                    Object P4 = rv4Var2.P();
                    if (f4 || P4 == obj5) {
                        P4 = new bw0(xt4Var2, l54Var, 2);
                        rv4Var2.o0(P4);
                    }
                    sue.a(l54Var, g34.b, false, z8, (vt4) P4, rv4Var2, 48, 4);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                yf6 yf6Var2 = (yf6) obj;
                int intValue5 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    if (rv4Var3.f(yf6Var2)) {
                        i13 = 4;
                    }
                    i4 = intValue6 | i13;
                } else {
                    i4 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (!rv4Var3.d(intValue5)) {
                        i12 = 16;
                    }
                    i4 |= i12;
                }
                if ((i4 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i4 & 1, z3)) {
                    qn4 qn4Var = (qn4) list.get(intValue5);
                    rv4Var3.e0(2109053080);
                    nq7 a3 = yf6.a(yf6Var2, pna.f(kq7Var, 1.0f));
                    boolean f5 = rv4Var3.f(xt4Var) | rv4Var3.h(qn4Var);
                    Object P5 = rv4Var3.P();
                    if (f5 || P5 == obj5) {
                        P5 = new w7(13, xt4Var, qn4Var);
                        rv4Var3.o0(P5);
                    }
                    vt4 vt4Var2 = (vt4) P5;
                    boolean f6 = rv4Var3.f(xt4Var2) | rv4Var3.h(qn4Var);
                    Object P6 = rv4Var3.P();
                    if (f6 || P6 == obj5) {
                        P6 = new y74(4, xt4Var2, qn4Var);
                        rv4Var3.o0(P6);
                    }
                    qwe.d(qn4Var, a3, vt4Var2, (xt4) P6, rv4Var3, 0);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                xg6 xg6Var2 = (xg6) obj;
                int intValue7 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (rv4Var4.f(xg6Var2)) {
                        i13 = 4;
                    }
                    i5 = intValue8 | i13;
                } else {
                    i5 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (rv4Var4.d(intValue7)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    i5 |= i6;
                }
                if ((i5 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(i5 & 1, z4)) {
                    v8b v8bVar = (v8b) list.get(intValue7);
                    rv4Var4.e0(-1083893663);
                    k27.j(v8bVar, zbe.z(kq7Var, 24.0f, 6.0f), this.c, this.d, rv4Var4, 48);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 4:
                yf6 yf6Var3 = (yf6) obj;
                int intValue9 = ((Number) obj2).intValue();
                rv4 rv4Var5 = (rv4) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    if (rv4Var5.f(yf6Var3)) {
                        i13 = 4;
                    }
                    i7 = i13 | intValue10;
                } else {
                    i7 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (rv4Var5.d(intValue9)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & Token.EXPR_VOID) != 146) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var5.U(i7 & 1, z5)) {
                    cia ciaVar = (cia) list.get(intValue9);
                    rv4Var5.e0(709105337);
                    tl1.d(ciaVar, yf6.a(yf6Var3, zbe.C(zbe.y(pna.f(kq7Var, 1.0f), 4.0f), nae.e, nae.e, nae.e, 8.0f, 7)), this.c, this.d, rv4Var5, 0);
                    rv4Var5.q(false);
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
            default:
                yf6 yf6Var4 = (yf6) obj;
                int intValue11 = ((Number) obj2).intValue();
                rv4 rv4Var6 = (rv4) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    if (rv4Var6.f(yf6Var4)) {
                        i13 = 4;
                    }
                    i9 = i13 | intValue12;
                } else {
                    i9 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (rv4Var6.d(intValue11)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    i9 |= i10;
                }
                if ((i9 & Token.EXPR_VOID) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (rv4Var6.U(i9 & 1, z6)) {
                    cia ciaVar2 = (cia) list.get(intValue11);
                    rv4Var6.e0(1133375330);
                    tl1.d(ciaVar2, yf6.a(yf6Var4, pna.f(kq7Var, 1.0f)), this.c, this.d, rv4Var6, 0);
                    rv4Var6.q(false);
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
        }
    }
}
