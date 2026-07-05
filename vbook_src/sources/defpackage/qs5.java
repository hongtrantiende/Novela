package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qs5  reason: default package */
/* loaded from: classes.dex */
public abstract class qs5 extends is5 implements List, RandomAccess {
    public static final ms5 b = new ms5(mm9.e, 0);

    public static mm9 h(int i, Object[] objArr) {
        if (i == 0) {
            return mm9.e;
        }
        return new mm9(objArr, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hs5, ls5] */
    public static ls5 i() {
        return new hs5(4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hs5, ls5] */
    public static ls5 j(int i) {
        kue.e(i, "expectedSize");
        return new hs5(i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hs5, ls5] */
    public static qs5 k(Iterable iterable) {
        if (iterable instanceof Collection) {
            return l((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return mm9.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        ?? hs5Var = new hs5(4);
        hs5Var.b(next);
        while (it.hasNext()) {
            hs5Var.b(it.next());
        }
        return hs5Var.g();
    }

    public static qs5 l(Collection collection) {
        if (collection instanceof is5) {
            qs5 a = ((is5) collection).a();
            if (a.f()) {
                Object[] array = a.toArray(is5.a);
                return h(array.length, array);
            }
            return a;
        }
        Object[] array2 = collection.toArray();
        yte.o(array2.length, array2);
        return h(array2.length, array2);
    }

    public static mm9 m(Object[] objArr) {
        if (objArr.length == 0) {
            return mm9.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        yte.o(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static mm9 p(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        yte.o(5, objArr);
        return h(5, objArr);
    }

    public static mm9 r(Object obj) {
        Object[] objArr = {obj};
        yte.o(1, objArr);
        return h(1, objArr);
    }

    public static mm9 s(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        yte.o(2, objArr);
        return h(2, objArr);
    }

    public static mm9 t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        wq9.r("the total number of elements must fit in an int", z);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        yte.o(length, objArr2);
        return h(length, objArr2);
    }

    public static mm9 v(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            nq2.u(arrayList, it);
            list = arrayList;
        }
        Object[] array = list.toArray();
        yte.o(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.is5
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.is5, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            if (bue.g(get(i), list.get(i))) {
                            }
                        }
                    } else {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                if (!bue.g(obj2, it.next())) {
                                }
                            }
                        }
                        return !it.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.is5
    public final jwc g() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.is5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: n */
    public final ms5 listIterator(int i) {
        wq9.A(i, size());
        if (isEmpty()) {
            return b;
        }
        return new ms5(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public qs5 u() {
        if (size() <= 1) {
            return this;
        }
        return new ns5(this);
    }

    @Override // java.util.List
    /* renamed from: w */
    public qs5 subList(int i, int i2) {
        wq9.B(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return mm9.e;
        }
        return new os5(this, i, i3);
    }

    @Override // defpackage.is5
    public final qs5 a() {
        return this;
    }
}
