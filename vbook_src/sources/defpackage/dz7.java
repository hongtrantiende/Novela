package defpackage;

import defpackage.lz7;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = ru3.class)
/* renamed from: dz7  reason: default package */
/* loaded from: classes.dex */
public final class dz7<T extends lz7> implements List<T>, iza, RandomAccess, l76 {
    public static final bz7 Companion = new Object();
    public final ora a;

    public dz7(ora oraVar) {
        this.a = oraVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.a.a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.add((lz7) obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.addAll(i, collection);
    }

    @Override // defpackage.iza
    public final kza b(kza kzaVar, kza kzaVar2, kza kzaVar3) {
        this.a.getClass();
        return null;
    }

    public final void c(lz7 lz7Var) {
        this.a.add(lz7Var);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof lz7)) {
            return false;
        }
        return this.a.contains((lz7) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        this.a.e(kzaVar);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (lz7) this.a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof lz7)) {
            return -1;
        }
        return this.a.indexOf((lz7) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof lz7)) {
            return -1;
        }
        return this.a.lastIndexOf((lz7) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        ora oraVar = this.a;
        oraVar.getClass();
        return new y65(oraVar, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof lz7)) {
            return false;
        }
        return this.a.remove((lz7) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return (lz7) this.a.set(i, (lz7) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pbe.q(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.a.addAll(collection);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.add(i, (lz7) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return (lz7) this.a.remove(i);
    }
}
