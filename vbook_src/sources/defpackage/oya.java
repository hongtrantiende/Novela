package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oya  reason: default package */
/* loaded from: classes3.dex */
public final class oya implements mo3 {
    public final String a;
    public final float b;

    public oya(String str, float f) {
        this.a = str;
        this.b = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        ?? A;
        LinkedHashMap linkedHashMap;
        Iterator it;
        LinkedHashMap linkedHashMap2;
        so3Var.getClass();
        String str = this.a;
        int e = so3Var.e(str);
        if (e != -1) {
            List list = so3Var.a;
            Set set = so3Var.c;
            list.getClass();
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (c16.i(((xl0) it2.next()).a, str)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            vf8 vf8Var = null;
            if (i != -1) {
                if (set.contains(new pm0(str))) {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    for (Object obj : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            Integer valueOf = Integer.valueOf(i2);
                            if (!set.contains(new pm0(((xl0) obj).a))) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                            i2 = i3;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                    A = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        int intValue = ((Number) obj2).intValue();
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj3 = arrayList.get(i5);
                                i5++;
                                int intValue2 = ((Number) obj3).intValue();
                                if (intValue2 >= intValue || intValue >= qwe.x(intValue2, list)) {
                                }
                            }
                        }
                        A.add(obj2);
                    }
                } else {
                    A = tl1.A(Integer.valueOf(i));
                }
                if (!A.isEmpty()) {
                    Iterator it3 = A.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        ?? next = it3.next();
                        int intValue3 = ((Number) next).intValue();
                        if (intValue3 <= i && i < qwe.x(intValue3, list)) {
                            vf8Var = next;
                            break;
                        }
                    }
                    Integer num = (Integer) vf8Var;
                    if (num != null) {
                        i = num.intValue();
                    }
                    int i6 = i;
                    int k = p17.k(tl1.s(A, 10));
                    int i7 = 16;
                    if (k < 16) {
                        k = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(k);
                    for (Object obj4 : A) {
                        int intValue4 = ((Number) obj4).intValue();
                        linkedHashMap3.put(obj4, dce.F(intValue4, qwe.x(intValue4, list)));
                    }
                    ty5 w = tl1.w(list);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = w.iterator();
                    while (true) {
                        sy5 sy5Var = (sy5) it4;
                        if (!sy5Var.c) {
                            break;
                        }
                        Object next2 = sy5Var.next();
                        int intValue5 = ((Number) next2).intValue();
                        Collection values = linkedHashMap3.values();
                        if (!(values instanceof Collection) || !values.isEmpty()) {
                            Iterator it5 = values.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    ty5 ty5Var = (ty5) it5.next();
                                    int i8 = ty5Var.a;
                                    if (intValue5 <= ty5Var.b && i8 <= intValue5) {
                                        arrayList2.add(next2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
                    int size3 = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj5 = arrayList2.get(i9);
                        i9++;
                        arrayList3.add(new pm0(((xl0) list.get(((Number) obj5).intValue())).a));
                    }
                    ArrayList arrayList4 = new ArrayList(tl1.s(A, 10));
                    for (Number number : A) {
                        arrayList4.add(new pm0(((xl0) list.get(number.intValue())).a));
                    }
                    int k2 = p17.k(tl1.s(A, 10));
                    if (k2 >= 16) {
                        i7 = k2;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(i7);
                    for (Number number2 : A) {
                        int intValue6 = number2.intValue();
                        linkedHashMap4.put(new pm0(((xl0) list.get(intValue6)).a), Integer.valueOf(((xl0) list.get(intValue6)).d.a));
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    Iterator it6 = A.iterator();
                    while (it6.hasNext()) {
                        int intValue7 = ((Number) it6.next()).intValue();
                        xl0 xl0Var = (xl0) list.get(intValue7);
                        int i10 = xl0Var.d.a;
                        ty5 ty5Var2 = (ty5) o17.p(Integer.valueOf(intValue7), linkedHashMap3);
                        int i11 = ty5Var2.a;
                        int i12 = ty5Var2.b;
                        if (i11 <= i12) {
                            while (true) {
                                linkedHashMap = linkedHashMap3;
                                xl0 xl0Var2 = (xl0) list.get(i11);
                                it = it6;
                                linkedHashMap2 = linkedHashMap4;
                                linkedHashMap5.put(new pm0(xl0Var2.a), Integer.valueOf(xl0Var2.d.a - i10));
                                linkedHashMap6.put(new pm0(xl0Var2.a), new pm0(xl0Var.a));
                                if (i11 == i12) {
                                    break;
                                }
                                i11++;
                                it6 = it;
                                linkedHashMap3 = linkedHashMap;
                                linkedHashMap4 = linkedHashMap2;
                            }
                            it6 = it;
                            linkedHashMap3 = linkedHashMap;
                            linkedHashMap4 = linkedHashMap2;
                        }
                    }
                    vf8Var = new vf8(((xl0) list.get(i6)).a, i6, ((xl0) list.get(i6)).b.a(), arrayList4, arrayList3, sl1.H0(arrayList3), arrayList2, sl1.H0(arrayList2), qwe.y(arrayList2), linkedHashMap4, linkedHashMap5, linkedHashMap6);
                }
            }
            if (vf8Var != null) {
                ArrayList arrayList5 = vf8Var.e;
                String str2 = vf8Var.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new pm0(str2));
                ArrayList arrayList6 = new ArrayList();
                int size4 = arrayList5.size();
                int i13 = 0;
                while (i13 < size4) {
                    Object obj6 = arrayList5.get(i13);
                    i13++;
                    if (!c16.i(((pm0) obj6).a, str2)) {
                        arrayList6.add(obj6);
                    }
                }
                int size5 = arrayList6.size();
                int i14 = 0;
                while (i14 < size5) {
                    Object obj7 = arrayList6.get(i14);
                    i14++;
                    linkedHashSet.add(new pm0(((pm0) obj7).a));
                }
                ArrayList arrayList7 = vf8Var.d;
                Set set2 = vf8Var.f;
                ArrayList arrayList8 = vf8Var.g;
                Set set3 = vf8Var.h;
                List list2 = vf8Var.i;
                String str3 = vf8Var.a;
                int i15 = vf8Var.b;
                Boolean valueOf2 = Boolean.valueOf(vf8Var.c);
                LinkedHashMap linkedHashMap7 = vf8Var.j;
                return so3.a(so3Var, null, null, null, new cj3(linkedHashSet, null, this.b, e, arrayList7, arrayList5, set2, arrayList8, set3, list2, str3, i15, valueOf2, linkedHashMap7, vf8Var.k, vf8Var.l, ((Number) o17.p(new pm0(str2), linkedHashMap7)).intValue()), null, 23);
            }
        }
        return so3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oya) {
                oya oyaVar = (oya) obj;
                if (!this.a.equals(oyaVar.a) || Float.compare(this.b, oyaVar.b) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String a = pm0.a(this.a);
        return "StartDrag(blockId=" + a + ", touchOffsetY=" + this.b + ")";
    }
}
