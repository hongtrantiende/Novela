package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rz  reason: default package */
/* loaded from: classes.dex */
public final class rz extends a3 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public rz(z17 z17Var) {
        Object[] q = pbe.q(z17Var, new Object[0]);
        this.b = q;
        this.c = q.length;
        if (q.length == 0) {
            this.b = d;
        }
    }

    @Override // defpackage.a3
    public final int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.c;
        if (i >= 0 && i <= i3) {
            if (i == i3) {
                addLast(obj);
                return;
            } else if (i == 0) {
                addFirst(obj);
                return;
            } else {
                k();
                d(this.c + 1);
                int j = j(this.a + i);
                int i4 = this.c;
                if (i < ((i4 + 1) >> 1)) {
                    if (j == 0) {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        i2 = objArr.length - 1;
                    } else {
                        i2 = j - 1;
                    }
                    int i5 = this.a;
                    if (i5 == 0) {
                        Object[] objArr2 = this.b;
                        objArr2.getClass();
                        i5 = objArr2.length;
                    }
                    int i6 = i5 - 1;
                    int i7 = this.a;
                    Object[] objArr3 = this.b;
                    if (i2 >= i7) {
                        objArr3[i6] = objArr3[i7];
                        b00.W(i7, i7 + 1, i2 + 1, objArr3, objArr3);
                    } else {
                        b00.W(i7 - 1, i7, objArr3.length, objArr3, objArr3);
                        Object[] objArr4 = this.b;
                        objArr4[objArr4.length - 1] = objArr4[0];
                        b00.W(0, 1, i2 + 1, objArr4, objArr4);
                    }
                    this.b[i2] = obj;
                    this.a = i6;
                } else {
                    int j2 = j(i4 + this.a);
                    Object[] objArr5 = this.b;
                    if (j < j2) {
                        b00.W(j + 1, j, j2, objArr5, objArr5);
                    } else {
                        b00.W(1, 0, j2, objArr5, objArr5);
                        Object[] objArr6 = this.b;
                        objArr6[0] = objArr6[objArr6.length - 1];
                        b00.W(j + 1, j, objArr6.length - 1, objArr6, objArr6);
                    }
                    this.b[j] = obj;
                }
                this.c++;
                return;
            }
        }
        cy7.k(rs8.k("index: ", i, i3, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.c;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.c) {
                return addAll(collection);
            }
            k();
            d(collection.size() + this.c);
            int j = j(this.c + this.a);
            int j2 = j(this.a + i);
            int size = collection.size();
            if (i < ((this.c + 1) >> 1)) {
                int i3 = this.a;
                int i4 = i3 - size;
                Object[] objArr = this.b;
                if (j2 >= i3) {
                    if (i4 >= 0) {
                        b00.W(i4, i3, j2, objArr, objArr);
                    } else {
                        i4 += objArr.length;
                        int i5 = j2 - i3;
                        int length = objArr.length - i4;
                        if (length >= i5) {
                            b00.W(i4, i3, j2, objArr, objArr);
                        } else {
                            b00.W(i4, i3, i3 + length, objArr, objArr);
                            Object[] objArr2 = this.b;
                            b00.W(0, this.a + length, j2, objArr2, objArr2);
                        }
                    }
                } else {
                    b00.W(i4, i3, objArr.length, objArr, objArr);
                    Object[] objArr3 = this.b;
                    if (size >= j2) {
                        b00.W(objArr3.length - size, 0, j2, objArr3, objArr3);
                    } else {
                        b00.W(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.b;
                        b00.W(0, size, j2, objArr4, objArr4);
                    }
                }
                this.a = i4;
                c(h(j2 - size), collection);
                return true;
            }
            int i6 = j2 + size;
            Object[] objArr5 = this.b;
            if (j2 < j) {
                int i7 = size + j;
                if (i7 <= objArr5.length) {
                    b00.W(i6, j2, j, objArr5, objArr5);
                } else if (i6 >= objArr5.length) {
                    b00.W(i6 - objArr5.length, j2, j, objArr5, objArr5);
                } else {
                    int length2 = j - (i7 - objArr5.length);
                    b00.W(0, length2, j, objArr5, objArr5);
                    Object[] objArr6 = this.b;
                    b00.W(i6, j2, length2, objArr6, objArr6);
                }
            } else {
                b00.W(size, 0, j, objArr5, objArr5);
                Object[] objArr7 = this.b;
                if (i6 >= objArr7.length) {
                    b00.W(i6 - objArr7.length, j2, objArr7.length, objArr7, objArr7);
                } else {
                    b00.W(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                    Object[] objArr8 = this.b;
                    b00.W(i6, j2, objArr8.length - size, objArr8, objArr8);
                }
            }
            c(j2, collection);
            return true;
        }
        cy7.k(rs8.k("index: ", i, i2, ", size: "));
        return false;
    }

    public final void addFirst(Object obj) {
        k();
        d(this.c + 1);
        int i = this.a;
        if (i == 0) {
            Object[] objArr = this.b;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.a = i2;
        this.b[i2] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        k();
        d(a() + 1);
        this.b[j(a() + this.a)] = obj;
        this.c = a() + 1;
    }

    @Override // defpackage.a3
    public final Object b(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            if (i == a() - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            k();
            int j = j(this.a + i);
            Object[] objArr = this.b;
            Object obj = objArr[j];
            int i3 = this.c >> 1;
            int i4 = this.a;
            if (i < i3) {
                if (j >= i4) {
                    b00.W(i4 + 1, i4, j, objArr, objArr);
                } else {
                    b00.W(1, 0, j, objArr, objArr);
                    Object[] objArr2 = this.b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.a;
                    b00.W(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.b;
                int i6 = this.a;
                objArr3[i6] = null;
                this.a = f(i6);
            } else {
                int j2 = j((a() - 1) + i4);
                Object[] objArr4 = this.b;
                if (j <= j2) {
                    b00.W(j, j + 1, j2 + 1, objArr4, objArr4);
                } else {
                    b00.W(j, j + 1, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    b00.W(0, 1, j2 + 1, objArr5, objArr5);
                }
                this.b[j2] = null;
            }
            this.c--;
            return obj;
        }
        cy7.k(rs8.k("index: ", i, i2, ", size: "));
        return null;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.a, j(a() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0) {
            Object[] objArr = this.b;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == d) {
                if (i < 10) {
                    i = 10;
                }
                this.b = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            b00.W(0, this.a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.b;
            int length2 = objArr3.length;
            int i3 = this.a;
            b00.W(length2 - i3, 0, i3, objArr3, objArr2);
            this.a = 0;
            this.b = objArr2;
            return;
        }
        vs.k("Deque is too big.");
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final int f(int i) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.b[this.a];
        }
        p1a.l("ArrayDeque is empty.");
        return null;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.b[j((size() - 1) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a = a();
        if (i >= 0 && i < a) {
            return this.b[j(this.a + i)];
        }
        cy7.k(rs8.k("index: ", i, a, ", size: "));
        return null;
    }

    public final int h(int i) {
        if (i < 0) {
            return i + this.b.length;
        }
        return i;
    }

    public final void i(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            b00.g0(i, i2, null, objArr);
            return;
        }
        b00.g0(i, objArr.length, null, objArr);
        b00.g0(0, i2, null, this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int j = j(a() + this.a);
        int i2 = this.a;
        if (i2 < j) {
            while (i2 < j) {
                if (c16.i(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (!isEmpty() && (i2 = this.a) >= j) {
            int length = this.b.length;
            while (true) {
                if (i2 < length) {
                    if (c16.i(obj, this.b[i2])) {
                        i = this.a;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < j; i3++) {
                        if (c16.i(obj, this.b[i3])) {
                            i2 = i3 + this.b.length;
                            i = this.a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        Object[] objArr = this.b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.b[j((size() - 1) + this.a)];
        }
        p1a.l("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int j = j(this.c + this.a);
        int i2 = this.a;
        if (i2 < j) {
            length = j - 1;
            if (i2 <= length) {
                while (!c16.i(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= j) {
            while (true) {
                j--;
                Object[] objArr = this.b;
                if (-1 < j) {
                    if (c16.i(obj, objArr[j])) {
                        length = j + this.b.length;
                        i = this.a;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!c16.i(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int j2 = j(a() + this.a);
            int i = this.a;
            if (i < j2) {
                j = i;
                while (true) {
                    objArr = this.b;
                    if (i >= j2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.b[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                b00.g0(j, j2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[j] = obj3;
                        j = f(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.c = h(j - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            k();
            Object[] objArr = this.b;
            int i = this.a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.a = f(i);
            this.c = a() - 1;
            return obj;
        }
        p1a.l("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            k();
            int j = j((size() - 1) + this.a);
            Object[] objArr = this.b;
            Object obj = objArr[j];
            objArr[j] = null;
            this.c = a() - 1;
            return obj;
        }
        p1a.l("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ube.t(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
        } else if (i3 == 1) {
            b(i);
        } else {
            k();
            int i4 = this.c - i2;
            int i5 = this.a;
            if (i < i4) {
                int j = j((i - 1) + i5);
                int j2 = j(this.a + (i2 - 1));
                while (i > 0) {
                    int i6 = j + 1;
                    int min = Math.min(i, Math.min(i6, j2 + 1));
                    Object[] objArr = this.b;
                    int i7 = j2 - min;
                    int i8 = j - min;
                    b00.W(i7 + 1, i8 + 1, i6, objArr, objArr);
                    j = h(i8);
                    j2 = h(i7);
                    i -= min;
                }
                int j3 = j(this.a + i3);
                i(this.a, j3);
                this.a = j3;
            } else {
                int j4 = j(i5 + i2);
                int j5 = j(this.a + i);
                int i9 = this.c;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.b;
                    i2 = Math.min(i9, Math.min(objArr2.length - j4, objArr2.length - j5));
                    Object[] objArr3 = this.b;
                    int i10 = j4 + i2;
                    b00.W(j5, j4, i10, objArr3, objArr3);
                    j4 = j(i10);
                    j5 = j(j5 + i2);
                }
                int j6 = j(this.c + this.a);
                i(h(j6 - i3), j6);
            }
            this.c -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int j2 = j(a() + this.a);
            int i = this.a;
            if (i < j2) {
                j = i;
                while (true) {
                    objArr = this.b;
                    if (i >= j2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                b00.g0(j, j2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[j] = obj3;
                        j = f(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.c = h(j - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a = a();
        if (i >= 0 && i < a) {
            int j = j(this.a + i);
            Object[] objArr = this.b;
            Object obj2 = objArr[j];
            objArr[j] = obj;
            return obj2;
        }
        cy7.k(rs8.k("index: ", i, a, ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int j = j(this.c + this.a);
        int i2 = this.a;
        if (i2 < j) {
            b00.a0(i2, j, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            b00.W(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            b00.W(objArr3.length - this.a, 0, j, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public rz(int i) {
        this.b = new Object[16];
    }

    public rz() {
        this.b = d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        d(collection.size() + a());
        c(j(a() + this.a), collection);
        return true;
    }
}
