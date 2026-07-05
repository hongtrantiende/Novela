package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lu4 b;

    public /* synthetic */ tb(int i, lu4 lu4Var) {
        this.a = i;
        this.b = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        xx9 xx9Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 a0 = zbe.x(kq7.a, xb.b).a0(new l95(kh5.I));
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, a0);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, d);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    lu4Var.invoke(rv4Var, 0);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    if (lu4Var == null) {
                        rv4Var2.e0(1871239598);
                    } else {
                        rv4Var2.e0(-632374093);
                        lu4Var.invoke(rv4Var2, 0);
                    }
                    rv4Var2.q(false);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                lu4Var.invoke(str, list);
                return pvcVar;
            case 3:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    lu4Var.invoke(rv4Var3, 0);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 4:
                rx9 rx9Var = (rx9) obj;
                List list2 = (List) lu4Var.invoke(rx9Var, obj2);
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list2.get(i2);
                    if (obj3 != null && (xx9Var = rx9Var.b) != null && !xx9Var.c(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (!list2.isEmpty()) {
                    return new ArrayList(list2);
                }
                return null;
            case 5:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                lu4Var.invoke(str2, str3);
                return pvcVar;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                lu4Var.invoke(bool, bool2);
                return pvcVar;
        }
    }
}
