package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r2  reason: default package */
/* loaded from: classes.dex */
public class r2 extends AbstractCollection implements List {
    public final Object a;
    public Collection b;
    public final r2 c;
    public final Collection d;
    public final /* synthetic */ gu7 e;
    public final /* synthetic */ gu7 f;

    public r2(gu7 gu7Var, Object obj, List list, r2 r2Var) {
        Collection collection;
        this.f = gu7Var;
        this.e = gu7Var;
        this.a = obj;
        this.b = list;
        this.c = r2Var;
        if (r2Var == null) {
            collection = null;
        } else {
            collection = r2Var.b;
        }
        this.d = collection;
    }

    public final void a() {
        r2 r2Var = this.c;
        if (r2Var != null) {
            r2Var.a();
        } else {
            this.e.e.put(this.a, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            this.e.f++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.b).addAll(i, collection);
        if (addAll) {
            this.f.f += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        r2 r2Var = this.c;
        if (r2Var != null) {
            r2Var.b();
            if (r2Var.b != this.d) {
                vs.f();
            }
        } else if (this.b.isEmpty() && (collection = (Collection) this.e.e.get(this.a)) != null) {
            this.b = collection;
        }
    }

    public final void c() {
        r2 r2Var = this.c;
        if (r2Var != null) {
            r2Var.c();
        } else if (this.b.isEmpty()) {
            this.e.e.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.f -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new i2(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new q2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.b.remove(obj);
        if (remove) {
            gu7 gu7Var = this.e;
            gu7Var.f--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            this.e.f += this.b.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.e.f += this.b.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List subList = ((List) this.b).subList(i, i2);
        r2 r2Var = this.c;
        if (r2Var == null) {
            r2Var = this;
        }
        boolean z = subList instanceof RandomAccess;
        gu7 gu7Var = this.f;
        Object obj = this.a;
        if (z) {
            return new r2(gu7Var, obj, subList, r2Var);
        }
        return new r2(gu7Var, obj, subList, r2Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new q2(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = ((List) this.b).remove(i);
        gu7 gu7Var = this.f;
        gu7Var.f--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.f++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            this.e.f += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}
