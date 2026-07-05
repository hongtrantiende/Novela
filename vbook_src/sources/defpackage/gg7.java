package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gg7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ gg7(List list, aw7 aw7Var, int i) {
        this.a = i;
        this.b = list;
        this.c = aw7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = ax1.a;
        int i2 = 0;
        aw7 aw7Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    int size = list.size();
                    while (i2 < size) {
                        v56 v56Var = (v56) list.get(i2);
                        boolean equals = v56Var.b().equals((String) aw7Var.getValue());
                        String b = v56Var.b();
                        boolean h = rv4Var.h(v56Var);
                        Object P = rv4Var.P();
                        if (h || P == obj4) {
                            P = new mf6(22, v56Var, aw7Var);
                            rv4Var.o0(P);
                        }
                        ese.m(0, (vt4) P, rv4Var, null, null, null, b, equals);
                        i2++;
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        String str = (String) list.get(i3);
                        if (((Number) aw7Var.getValue()).intValue() == i3) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean d = rv4Var2.d(i3);
                        Object P2 = rv4Var2.P();
                        if (d || P2 == obj4) {
                            P2 = new rd7(i3, aw7Var, 1);
                            rv4Var2.o0(P2);
                        }
                        ese.m(0, (vt4) P2, rv4Var2, null, null, null, str, z3);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z4)) {
                    int size3 = list.size();
                    while (i2 < size3) {
                        r81 r81Var = (r81) list.get(i2);
                        boolean f = rv4Var3.f((List) aw7Var.getValue()) | rv4Var3.f(r81Var);
                        Object P3 = rv4Var3.P();
                        if (f || P3 == obj4) {
                            P3 = Boolean.valueOf(((List) aw7Var.getValue()).contains(r81Var.a));
                            rv4Var3.o0(P3);
                        }
                        boolean booleanValue = ((Boolean) P3).booleanValue();
                        String str2 = r81Var.b;
                        boolean f2 = rv4Var3.f(aw7Var) | rv4Var3.g(booleanValue) | rv4Var3.h(r81Var);
                        Object P4 = rv4Var3.P();
                        if (f2 || P4 == obj4) {
                            P4 = new as(booleanValue, r81Var, aw7Var, 1);
                            rv4Var3.o0(P4);
                        }
                        ese.m(0, (vt4) P4, rv4Var3, null, null, null, str2, booleanValue);
                        i2++;
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (rv4Var4.U(intValue4 & 1, z5)) {
                    int size4 = list.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        String str3 = (String) list.get(i4);
                        if (((Number) aw7Var.getValue()).intValue() == i4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean d2 = rv4Var4.d(i4);
                        Object P5 = rv4Var4.P();
                        if (d2 || P5 == obj4) {
                            P5 = new rd7(i4, aw7Var, 2);
                            rv4Var4.o0(P5);
                        }
                        ese.m(0, (vt4) P5, rv4Var4, null, null, null, str3, z6);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
