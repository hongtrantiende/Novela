package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iv7  reason: default package */
/* loaded from: classes.dex */
public final class iv7 implements List, l76 {
    public final /* synthetic */ int a;
    public final Object b;

    public iv7() {
        this.a = 2;
        this.b = new ArrayList();
    }

    public boolean a(nm8 nm8Var) {
        nm8Var.getClass();
        return ((ArrayList) this.b).add(nm8Var);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                kv7 kv7Var = (kv7) obj2;
                if (i >= 0 && i <= (i2 = kv7Var.b)) {
                    int i4 = i2 + 1;
                    Object[] objArr = kv7Var.a;
                    if (objArr.length < i4) {
                        kv7Var.m(i4, objArr);
                    }
                    Object[] objArr2 = kv7Var.a;
                    int i5 = kv7Var.b;
                    if (i != i5) {
                        b00.W(i + 1, i, i5, objArr2, objArr2);
                    }
                    objArr2[i] = obj;
                    kv7Var.b++;
                    return;
                }
                kv7Var.p(i);
                throw null;
            case 1:
                ((gw7) obj2).a(i, obj);
                return;
            default:
                nm8 nm8Var = (nm8) obj;
                nm8Var.getClass();
                ((ArrayList) obj2).add(i, nm8Var);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                collection.getClass();
                kv7 kv7Var = (kv7) obj;
                if (i >= 0 && i <= kv7Var.b) {
                    int i3 = 0;
                    if (collection.isEmpty()) {
                        return false;
                    }
                    int size = collection.size() + kv7Var.b;
                    Object[] objArr = kv7Var.a;
                    if (objArr.length < size) {
                        kv7Var.m(size, objArr);
                    }
                    Object[] objArr2 = kv7Var.a;
                    if (i != kv7Var.b) {
                        b00.W(collection.size() + i, i, kv7Var.b, objArr2, objArr2);
                    }
                    for (Object obj2 : collection) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            objArr2[i3 + i] = obj2;
                            i3 = i4;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                    kv7Var.b = collection.size() + kv7Var.b;
                    return true;
                }
                kv7Var.p(i);
                throw null;
            case 1:
                return ((gw7) obj).e(i, collection);
            default:
                collection.getClass();
                return ((ArrayList) obj).addAll(i, collection);
        }
    }

    public boolean b() {
        if (((ArrayList) this.b).size() < 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((kv7) obj).d();
                return;
            case 1:
                ((gw7) obj).g();
                return;
            default:
                ((ArrayList) obj).clear();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (((kv7) obj2).g(obj) < 0) {
                    return false;
                }
                return true;
            case 1:
                return ((gw7) obj2).h(obj);
            default:
                if (!(obj instanceof nm8)) {
                    return false;
                }
                return ((ArrayList) obj2).contains((nm8) obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                kv7 kv7Var = (kv7) obj;
                for (Object obj2 : collection) {
                    if (kv7Var.g(obj2) < 0) {
                        return false;
                    }
                }
                return true;
            case 1:
                gw7 gw7Var = (gw7) obj;
                for (Object obj3 : collection) {
                    if (!gw7Var.h(obj3)) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                return ((ArrayList) obj).containsAll(collection);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i78.a(i, this);
                return ((kv7) obj).f(i);
            case 1:
                hw7.a(i, this);
                return ((gw7) obj).a[i];
            default:
                return (nm8) ((ArrayList) obj).get(i);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((kv7) obj2).g(obj);
            case 1:
                return ((gw7) obj2).i(obj);
            default:
                if (!(obj instanceof nm8)) {
                    return -1;
                }
                return ((ArrayList) obj2).indexOf((nm8) obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((kv7) obj).h();
            case 1:
                if (((gw7) obj).c == 0) {
                    return true;
                }
                return false;
            default:
                return ((ArrayList) obj).isEmpty();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new hv7(0, this, 0);
            case 1:
                return new hv7(0, this, 1);
            default:
                return ((ArrayList) this.b).iterator();
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                kv7 kv7Var = (kv7) obj2;
                Object[] objArr = kv7Var.a;
                int i3 = kv7Var.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            case 1:
                gw7 gw7Var = (gw7) obj2;
                Object[] objArr2 = gw7Var.a;
                for (int i4 = gw7Var.c - 1; i4 >= 0; i4--) {
                    if (c16.i(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
            default:
                if (!(obj instanceof nm8)) {
                    return -1;
                }
                return ((ArrayList) obj2).lastIndexOf((nm8) obj);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new hv7(0, this, 0);
            case 1:
                return new hv7(0, this, 1);
            default:
                return ((ArrayList) this.b).listIterator();
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i78.a(i, this);
                return ((kv7) obj).k(i);
            case 1:
                hw7.a(i, this);
                return ((gw7) obj).k(i);
            default:
                return (nm8) ((ArrayList) obj).remove(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                kv7 kv7Var = (kv7) obj;
                int i2 = kv7Var.b;
                for (Object obj2 : collection) {
                    kv7Var.j(obj2);
                }
                if (i2 != kv7Var.b) {
                    return true;
                }
                return false;
            case 1:
                gw7 gw7Var = (gw7) obj;
                if (!collection.isEmpty()) {
                    int i3 = gw7Var.c;
                    for (Object obj3 : collection) {
                        gw7Var.j(obj3);
                    }
                    if (i3 != gw7Var.c) {
                        return true;
                    }
                }
                return false;
            default:
                collection.getClass();
                return ((ArrayList) obj).removeAll(collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                kv7 kv7Var = (kv7) obj;
                int i2 = kv7Var.b;
                Object[] objArr = kv7Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        kv7Var.k(i3);
                    }
                }
                if (i2 == kv7Var.b) {
                    return false;
                }
                return true;
            case 1:
                gw7 gw7Var = (gw7) obj;
                int i4 = gw7Var.c;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(gw7Var.a[i5])) {
                        gw7Var.k(i5);
                    }
                }
                if (i4 == gw7Var.c) {
                    return false;
                }
                return true;
            default:
                collection.getClass();
                return ((ArrayList) obj).retainAll(collection);
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                i78.a(i, this);
                return ((kv7) obj2).n(i, obj);
            case 1:
                hw7.a(i, this);
                Object[] objArr = ((gw7) obj2).a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
            default:
                nm8 nm8Var = (nm8) obj;
                nm8Var.getClass();
                return (nm8) ((ArrayList) obj2).set(i, nm8Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((kv7) obj).b;
            case 1:
                return ((gw7) obj).c;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                i78.b(i, this, i2);
                return new jv7(this, i, i2, 0);
            case 1:
                hw7.b(i, this, i2);
                return new jv7(this, i, i2, 1);
            default:
                return ((ArrayList) this.b).subList(i, i2);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                objArr.getClass();
                return pbe.q(this, objArr);
            case 1:
                return pbe.q(this, objArr);
            default:
                objArr.getClass();
                return pbe.q(this, objArr);
        }
    }

    public /* synthetic */ iv7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return pbe.p(this);
            case 1:
                return pbe.p(this);
            default:
                return pbe.p(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new hv7(i, this, 0);
            case 1:
                return new hv7(i, this, 1);
            default:
                return ((ArrayList) this.b).listIterator(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((kv7) obj2).j(obj);
            case 1:
                return ((gw7) obj2).j(obj);
            default:
                if (obj instanceof nm8) {
                    return ((ArrayList) obj2).remove((nm8) obj);
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((kv7) obj2).a(obj);
                return true;
            case 1:
                ((gw7) obj2).b(obj);
                return true;
            default:
                return a((nm8) obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                collection.getClass();
                kv7 kv7Var = (kv7) obj;
                int i2 = kv7Var.b;
                for (Object obj2 : collection) {
                    kv7Var.a(obj2);
                }
                return i2 != kv7Var.b;
            case 1:
                gw7 gw7Var = (gw7) obj;
                return gw7Var.e(gw7Var.c, collection);
            default:
                collection.getClass();
                return ((ArrayList) obj).addAll(collection);
        }
    }
}
