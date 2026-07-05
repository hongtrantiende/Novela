package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: is0  reason: default package */
/* loaded from: classes3.dex */
public final class is0 implements cs0 {
    public final ii2 a;

    public is0(ii2 ii2Var) {
        this.a = ii2Var;
    }

    public static boolean a(xl2 xl2Var, int i, int i2, int i3) {
        int i4 = xl2Var.c;
        long j = xl2Var.j;
        if (i4 == i) {
            long j2 = i2;
            long j3 = xl2Var.i;
            if (j2 < j3 || j2 > j) {
                long j4 = i3;
                if (j4 >= j3 && j4 <= j) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void b(final String str, final int i, final String str2, final String str3, final int i2, final int i3) {
        gk2 gk2Var = this.a.d;
        gk2Var.getClass();
        str.getClass();
        cm2 cm2Var = cm2.a;
        List c = new zl2(gk2Var, str, 0, new yl2(gk2Var, 1)).c();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (a((xl2) obj, i, i2, i3)) {
                arrayList.add(obj);
            }
        }
        l0e.z(gk2Var, new xt4() { // from class: ds0
            @Override // defpackage.xt4
            public final Object invoke(Object obj2) {
                String B;
                long b;
                ii2 ii2Var = this.a;
                ((vjc) obj2).getClass();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    ii2Var.d.a0(((xl2) obj3).a);
                }
                gk2 gk2Var2 = ii2Var.d;
                xl2 xl2Var = (xl2) sl1.e0(arrayList2);
                if (xl2Var == null || (B = xl2Var.a) == null) {
                    B = ube.B();
                }
                long j = i2;
                long j2 = i3;
                xl2 xl2Var2 = (xl2) sl1.e0(arrayList2);
                if (xl2Var2 != null) {
                    b = xl2Var2.k;
                } else {
                    b = by5.a.k().b();
                }
                gk2Var2.y0(new xl2(B, str, i, str2, 0, str3, "", "", j, j2, b));
                return pvc.a;
            }
        });
    }

    public final void c(final String str, final int i, final String str2, final String str3, final String str4, final String str5, final int i2, final int i3) {
        gk2 gk2Var = this.a.d;
        gk2Var.getClass();
        str.getClass();
        cm2 cm2Var = cm2.a;
        List c = new zl2(gk2Var, str, 1, new yl2(gk2Var, 1)).c();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (a((xl2) obj, i, i2, i3)) {
                arrayList.add(obj);
            }
        }
        l0e.z(gk2Var, new xt4() { // from class: es0
            @Override // defpackage.xt4
            public final Object invoke(Object obj2) {
                String B;
                long b;
                ii2 ii2Var = this.a;
                ((vjc) obj2).getClass();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    ii2Var.d.a0(((xl2) obj3).a);
                }
                gk2 gk2Var2 = ii2Var.d;
                xl2 xl2Var = (xl2) sl1.e0(arrayList2);
                if (xl2Var == null || (B = xl2Var.a) == null) {
                    B = ube.B();
                }
                String str6 = str4;
                if (str6 == null) {
                    xl2 xl2Var2 = (xl2) sl1.e0(arrayList2);
                    if (xl2Var2 != null) {
                        str6 = xl2Var2.g;
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str6 = "";
                    }
                }
                String str7 = str6;
                long j = i2;
                long j2 = i3;
                xl2 xl2Var3 = (xl2) sl1.e0(arrayList2);
                if (xl2Var3 != null) {
                    b = xl2Var3.k;
                } else {
                    b = by5.a.k().b();
                }
                gk2Var2.y0(new xl2(B, str, i, str2, 1, str3, str7, str5, j, j2, b));
                return pvc.a;
            }
        });
    }
}
