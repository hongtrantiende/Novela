package defpackage;

import java.util.List;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lf3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf3 implements lu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lf3(ef3 ef3Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, vt4 vt4Var5, vt4 vt4Var6, vt4 vt4Var7, int i) {
        this.b = ef3Var;
        this.c = nq7Var;
        this.d = vt4Var;
        this.e = vt4Var2;
        this.f = vt4Var3;
        this.C = vt4Var4;
        this.D = vt4Var5;
        this.E = vt4Var6;
        this.F = vt4Var7;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.D;
        hu4 hu4Var = this.C;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ese.d((ef3) obj10, (nq7) obj9, (vt4) obj8, (vt4) obj7, (vt4) obj6, (vt4) hu4Var, (vt4) obj5, (vt4) obj4, (vt4) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                final aw7 aw7Var = (aw7) obj10;
                final pu4 pu4Var = (pu4) obj9;
                final aw7 aw7Var2 = (aw7) obj8;
                final aw7 aw7Var3 = (aw7) obj7;
                final aw7 aw7Var4 = (aw7) obj6;
                final xt4 xt4Var = (xt4) hu4Var;
                final aw7 aw7Var5 = (aw7) obj5;
                final aw7 aw7Var6 = (aw7) obj4;
                final aw7 aw7Var7 = (aw7) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean f = rv4Var.f(aw7Var) | rv4Var.f(pu4Var) | rv4Var.f(aw7Var2) | rv4Var.f(aw7Var3) | rv4Var.f(aw7Var4) | rv4Var.f(xt4Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        vt4 vt4Var = new vt4() { // from class: md7
                            @Override // defpackage.vt4
                            public final Object invoke() {
                                int i2;
                                int i3;
                                int intValue2 = ((Number) aw7Var.getValue()).intValue();
                                pu4 pu4Var2 = pu4Var;
                                aw7 aw7Var8 = aw7Var2;
                                aw7 aw7Var9 = aw7Var3;
                                aw7 aw7Var10 = aw7Var4;
                                aw7 aw7Var11 = aw7Var5;
                                if (intValue2 != 0) {
                                    if (intValue2 != 1) {
                                        if (intValue2 != 2) {
                                            if (intValue2 != 3) {
                                                if (intValue2 == 4) {
                                                    Integer S = r4b.S((String) aw7Var6.getValue());
                                                    int i4 = 0;
                                                    if (S != null) {
                                                        i2 = S.intValue();
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                    if (i2 < 1) {
                                                        i2 = 1;
                                                    }
                                                    int i5 = i2 - 1;
                                                    Integer S2 = r4b.S((String) aw7Var7.getValue());
                                                    if (S2 != null) {
                                                        i3 = S2.intValue();
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    if (i3 < 1) {
                                                        i3 = 1;
                                                    }
                                                    Integer valueOf = Integer.valueOf(i5);
                                                    int i6 = (i3 - 1) - i5;
                                                    if (i6 >= 0) {
                                                        i4 = i6;
                                                    }
                                                    pu4Var2.j(valueOf, Integer.valueOf(i4 + 1), Boolean.FALSE, Boolean.valueOf(zr1.h(aw7Var9)), Boolean.valueOf(zr1.f(aw7Var10)), (List) aw7Var11.getValue());
                                                }
                                            } else {
                                                pu4Var2.j(-1, Integer.valueOf((int) Context.VERSION_ES6), Boolean.valueOf(zr1.g(aw7Var8)), Boolean.valueOf(zr1.h(aw7Var9)), Boolean.valueOf(zr1.f(aw7Var10)), (List) aw7Var11.getValue());
                                            }
                                        } else {
                                            pu4Var2.j(-1, 100, Boolean.valueOf(zr1.g(aw7Var8)), Boolean.valueOf(zr1.h(aw7Var9)), Boolean.valueOf(zr1.f(aw7Var10)), (List) aw7Var11.getValue());
                                        }
                                    } else {
                                        pu4Var2.j(-1, 50, Boolean.valueOf(zr1.g(aw7Var8)), Boolean.valueOf(zr1.h(aw7Var9)), Boolean.valueOf(zr1.f(aw7Var10)), (List) aw7Var11.getValue());
                                    }
                                } else {
                                    pu4Var2.j(-1, -1, Boolean.valueOf(zr1.g(aw7Var8)), Boolean.valueOf(zr1.h(aw7Var9)), Boolean.valueOf(zr1.f(aw7Var10)), (List) aw7Var11.getValue());
                                }
                                xt4Var.invoke(Boolean.FALSE);
                                return pvc.a;
                            }
                        };
                        rv4Var.o0(vt4Var);
                        P = vt4Var;
                    }
                    nmd.j((vt4) P, null, false, null, null, null, mwe.a, rv4Var, 805306368, 510);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ lf3(xt4 xt4Var, pu4 pu4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5, aw7 aw7Var6, aw7 aw7Var7) {
        this.b = aw7Var;
        this.c = pu4Var;
        this.d = aw7Var2;
        this.e = aw7Var3;
        this.f = aw7Var4;
        this.C = xt4Var;
        this.D = aw7Var5;
        this.E = aw7Var6;
        this.F = aw7Var7;
    }
}
