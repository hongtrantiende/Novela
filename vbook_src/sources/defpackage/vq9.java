package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq9  reason: default package */
/* loaded from: classes3.dex */
public abstract class vq9 {
    public static final tq9 a = new Object();
    public static final tza b = new f99(new pa9(10));
    public static final uq9 c = uq9.a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    public static final cr9 a(pq9 pq9Var, sq9 sq9Var) {
        pq9Var.getClass();
        sq9Var.getClass();
        List C0 = sl1.C0(pq9Var.b);
        ub6 ub6Var = sq9Var.a;
        km9 km9Var = sq9Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : C0) {
            Set set = ((cr9) obj).a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c16.i((of9) it.next(), ub6Var)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            Set set2 = ((cr9) obj2).a;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (c16.i((of9) it2.next(), km9Var)) {
                            arrayList2.add(obj2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj3 = arrayList.get(i3);
                i3++;
                Set<of9> set3 = ((cr9) obj3).a;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (of9 of9Var : set3) {
                        if (of9Var instanceof km9) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj3);
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
                for (Object obj4 : C0) {
                    Set<of9> set4 = ((cr9) obj4).a;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        for (of9 of9Var2 : set4) {
                            if (of9Var2 instanceof ub6) {
                                break;
                            } else if (of9Var2 instanceof km9) {
                                break;
                            }
                        }
                    }
                    arrayList2.add(obj4);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (cr9) sl1.c0(arrayList2);
        }
        h6c h6cVar = sq9Var.c;
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj5 = arrayList2.get(i4);
            i4++;
            Set set5 = ((cr9) obj5).a;
            if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                Iterator it3 = set5.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (c16.i((of9) it3.next(), h6cVar)) {
                            arrayList3.add(obj5);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = new ArrayList();
            int size4 = arrayList2.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj6 = arrayList2.get(i5);
                i5++;
                Set<of9> set6 = ((cr9) obj6).a;
                if (!(set6 instanceof Collection) || !set6.isEmpty()) {
                    for (of9 of9Var3 : set6) {
                        if (of9Var3.getClass() == h6c.class) {
                            break;
                        }
                    }
                }
                arrayList3.add(obj6);
            }
        }
        if (arrayList3.size() == 1) {
            return (cr9) sl1.c0(arrayList3);
        }
        int i6 = sq9Var.d.a;
        ArrayList arrayList4 = new ArrayList();
        qu3 qu3Var = v13.F;
        Iterator it4 = qu3Var.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (((v13) next).a >= i6) {
                arrayList4.add(next);
            }
        }
        Iterator it5 = sl1.u0(arrayList4, new pa5(25)).iterator();
        ks3 ks3Var = ks3.a;
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            v13 v13Var = (v13) it5.next();
            ?? arrayList5 = new ArrayList();
            int size5 = arrayList3.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj7 = arrayList3.get(i7);
                i7++;
                Set set7 = ((cr9) obj7).a;
                if (!(set7 instanceof Collection) || !set7.isEmpty()) {
                    Iterator it6 = set7.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (((of9) it6.next()) == v13Var) {
                                arrayList5.add(obj7);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (!arrayList5.isEmpty()) {
                ks3Var = arrayList5;
                break;
            }
            ks3Var = arrayList5;
        }
        if (ks3Var.isEmpty()) {
            v13 v13Var2 = v13.c;
            ArrayList l0 = sl1.l0(qu3Var, v13Var2);
            ArrayList arrayList6 = new ArrayList();
            int size6 = l0.size();
            int i8 = 0;
            while (i8 < size6) {
                Object obj8 = l0.get(i8);
                i8++;
                if (((v13) obj8).a < i6) {
                    arrayList6.add(obj8);
                }
            }
            ks3Var = ks3Var;
            for (v13 v13Var3 : sl1.u0(arrayList6, new pa5(26))) {
                ks3Var = new ArrayList();
                int size7 = arrayList3.size();
                int i9 = 0;
                while (i9 < size7) {
                    Object obj9 = arrayList3.get(i9);
                    i9++;
                    Set set8 = ((cr9) obj9).a;
                    if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                        Iterator it7 = set8.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (((of9) it7.next()) == v13Var3) {
                                    ks3Var.add(obj9);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                boolean isEmpty = ks3Var.isEmpty();
                ks3Var = ks3Var;
                if (!isEmpty) {
                    break;
                }
            }
            if (ks3Var.isEmpty()) {
                ks3Var = new ArrayList();
                int size8 = arrayList3.size();
                int i10 = 0;
                while (i10 < size8) {
                    Object obj10 = arrayList3.get(i10);
                    i10++;
                    Set<of9> set9 = ((cr9) obj10).a;
                    if (!(set9 instanceof Collection) || !set9.isEmpty()) {
                        for (of9 of9Var4 : set9) {
                            if (of9Var4 instanceof v13) {
                                break;
                            }
                        }
                    }
                    ks3Var.add(obj10);
                }
                if (ks3Var.isEmpty()) {
                    ks3Var = new ArrayList();
                    int size9 = arrayList3.size();
                    while (i < size9) {
                        Object obj11 = arrayList3.get(i);
                        i++;
                        Set set10 = ((cr9) obj11).a;
                        if (!(set10 instanceof Collection) || !set10.isEmpty()) {
                            Iterator it8 = set10.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    if (((of9) it8.next()) == v13Var2) {
                                        ks3Var.add(obj11);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        List list = ks3Var;
        if (list.size() == 1) {
            return (cr9) sl1.c0(list);
        }
        boolean isEmpty2 = list.isEmpty();
        String str = pq9Var.a;
        if (isEmpty2) {
            cp8.m(str, "' not found", "Resource with ID='");
            return null;
        }
        throw new IllegalStateException(("Resource with ID='" + str + "' has more than one file: " + sl1.i0(list, null, null, null, new rg8(28), 31)).toString());
    }
}
