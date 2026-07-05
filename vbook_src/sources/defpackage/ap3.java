package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ap3  reason: default package */
/* loaded from: classes.dex */
public final class ap3 implements List, l76 {
    public boolean a = true;
    public final ArrayList b;
    public int c;

    public ap3(int i) {
        this.b = new ArrayList(i);
    }

    @Override // java.util.List
    /* renamed from: a */
    public final y28 get(int i) {
        Object obj = this.b.get(i);
        obj.getClass();
        return (y28) obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        y28 y28Var = (y28) obj;
        y28Var.getClass();
        this.c++;
        return this.b.add(y28Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            this.c++;
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c++;
        this.b.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof y28)) {
            return false;
        }
        return this.b.contains((y28) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.b.containsAll(collection);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof y28)) {
            return -1;
        }
        return this.b.indexOf((y28) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return sl1.E0(this.b).iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y28)) {
            return -1;
        }
        return this.b.lastIndexOf((y28) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        ListIterator listIterator = this.b.listIterator();
        listIterator.getClass();
        return listIterator;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof y28)) {
            return false;
        }
        boolean remove = this.b.remove((y28) obj);
        if (remove) {
            this.c++;
        }
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            this.c++;
        }
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            this.c++;
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        y28 y28Var = (y28) obj;
        y28Var.getClass();
        this.c++;
        Object obj2 = this.b.set(i, y28Var);
        obj2.getClass();
        return (y28) obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        List subList = this.b.subList(i, i2);
        subList.getClass();
        return subList;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return pbe.q(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        ListIterator listIterator = this.b.listIterator(i);
        listIterator.getClass();
        return listIterator;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        y28 y28Var = (y28) obj;
        y28Var.getClass();
        this.c++;
        this.b.add(i, y28Var);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        boolean addAll = this.b.addAll(i, collection);
        if (addAll) {
            this.c++;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        this.c++;
        Object remove = this.b.remove(i);
        remove.getClass();
        return (y28) remove;
    }
}
