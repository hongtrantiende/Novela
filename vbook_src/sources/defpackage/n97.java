package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n97  reason: default package */
/* loaded from: classes3.dex */
public final class n97 implements mo3 {
    public final String a;
    public final String b;

    public n97(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        String str;
        xl0 c;
        cm0 cm0Var;
        cm0 cm0Var2;
        List list;
        so3Var.getClass();
        String str2 = this.a;
        xl0 c2 = so3Var.c(str2);
        if (c2 != null && (c = so3Var.c((str = this.b))) != null) {
            dm0 dm0Var = c2.c;
            if (dm0Var instanceof cm0) {
                cm0Var = (cm0) dm0Var;
            } else {
                cm0Var = null;
            }
            if (cm0Var != null) {
                dm0 dm0Var2 = c.c;
                if (dm0Var2 instanceof cm0) {
                    cm0Var2 = (cm0) dm0Var2;
                } else {
                    cm0Var2 = null;
                }
                if (cm0Var2 != null) {
                    String str3 = cm0Var2.a;
                    String u = nk2.u(str3, cm0Var.a);
                    if (c.b.b()) {
                        list = zbe.v(str3.length(), cm0Var2.b, cm0Var.b);
                    } else {
                        list = ks3.a;
                    }
                    List<xl0> list2 = so3Var.a;
                    ArrayList arrayList = new ArrayList(tl1.s(list2, 10));
                    for (xl0 xl0Var : list2) {
                        if (c16.i(xl0Var.a, str)) {
                            xl0Var = xl0.a(xl0Var, null, new cm0(u, list), null, 11);
                        }
                        arrayList.add(xl0Var);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (!c16.i(((xl0) obj).a, str2)) {
                            arrayList2.add(obj);
                        }
                    }
                    return so3.a(so3Var, tl1.H(qwe.o(arrayList2)), this.b, fca.s(so3Var.c, new pm0(str2)), null, null, 24);
                }
            }
        }
        return so3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n97)) {
            return false;
        }
        n97 n97Var = (n97) obj;
        if (c16.i(this.a, n97Var.a) && c16.i(this.b, n97Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("MergeBlocks(sourceId=", pm0.a(this.a), ", targetId=", pm0.a(this.b), ")");
    }
}
