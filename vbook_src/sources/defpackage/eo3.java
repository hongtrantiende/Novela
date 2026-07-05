package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eo3  reason: default package */
/* loaded from: classes3.dex */
public final class eo3 {
    public static final yy9 f = oue.G(new pg2(12), new u83(15));
    public final hm8 a;
    public final hm8 b;
    public long c;
    public final hm8 d;
    public final hm8 e = yae.z(Boolean.FALSE);

    public eo3(String str, String str2, boolean z) {
        this.a = yae.z(Boolean.valueOf(z));
        this.b = yae.z(str);
        this.d = yae.z(b(str2));
    }

    public static void g(eo3 eo3Var, String str, String str2, int i) {
        boolean z;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        eo3Var.getClass();
        str.getClass();
        str2.getClass();
        eo3Var.b.setValue(str);
        eo3Var.f(eo3Var.b(str2));
        eo3Var.e.setValue(Boolean.valueOf(z));
        eo3Var.a.setValue(Boolean.TRUE);
    }

    public final nc9 a(String str) {
        long j = this.c;
        this.c = 1 + j;
        return new nc9(j, str);
    }

    public final ArrayList b(String str) {
        ArrayList G = nmd.G(str);
        boolean isEmpty = G.isEmpty();
        Collection<String> collection = G;
        if (isEmpty) {
            collection = tl1.A("");
        }
        ArrayList arrayList = new ArrayList(tl1.s(collection, 10));
        for (String str2 : collection) {
            arrayList.add(a(str2));
        }
        return arrayList;
    }

    public final List c() {
        return (List) this.d.getValue();
    }

    public final String d() {
        List<nc9> c = c();
        ArrayList arrayList = new ArrayList(tl1.s(c, 10));
        for (nc9 nc9Var : c) {
            arrayList.add(nc9Var.b);
        }
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(k4b.N0((String) obj).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (((String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        return sl1.i0(sl1.C0(sl1.G0(arrayList3)), "¦", null, null, null, 62);
    }

    public final void e() {
        this.a.setValue(Boolean.FALSE);
        this.b.setValue("");
        f(tl1.A(a("")));
    }

    public final void f(List list) {
        this.d.setValue(list);
    }
}
