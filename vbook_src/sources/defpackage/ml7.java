package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ml7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ pia c;
    public final /* synthetic */ xt4 d;

    public /* synthetic */ ml7(List list, pia piaVar, xt4 xt4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = piaVar;
        this.d = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z5 = false;
        xt4 xt4Var = this.d;
        pia piaVar = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z5 = true;
                }
                if (rv4Var.U(intValue & 1, z5)) {
                    s9e.f(pna.f(kq7.a, 1.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(1271149993, new ml7(list, piaVar, xt4Var, 1), rv4Var), rv4Var, 1573302);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    int i2 = 0;
                    for (Object obj4 : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            String str = (String) obj4;
                            int i4 = piaVar.c;
                            if (i4 == i2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i4 == i2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && piaVar.d == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            boolean f = rv4Var2.f(xt4Var) | rv4Var2.d(i2);
                            Object P = rv4Var2.P();
                            if (f || P == ax1.a) {
                                P = new tp0(xt4Var, i2, 10);
                                rv4Var2.o0(P);
                            }
                            xbe.e(str, z4, z3, null, null, (vt4) P, rv4Var2, 0);
                            i2 = i3;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
