package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ufe  reason: default package */
/* loaded from: classes.dex */
public final class ufe extends pee {
    public static final ufe H;
    public final transient vde G;

    static {
        wce wceVar = vde.C;
        H = new ufe(nfe.F, efe.b);
    }

    public ufe(vde vdeVar, Comparator comparator) {
        super(comparator);
        this.G = vdeVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int x = x(obj, true);
        vde vdeVar = this.G;
        if (x == vdeVar.size()) {
            return null;
        }
        return vdeVar.get(x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.G, obj, this.E) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof afe) {
            collection = ((afe) collection).zza();
        }
        Comparator comparator = this.E;
        if (dae.K(comparator, collection) && collection.size() > 1) {
            wce listIterator = this.G.listIterator(0);
            Iterator it = collection.iterator();
            if (listIterator.hasNext()) {
                Object next = it.next();
                Object next2 = listIterator.next();
                while (true) {
                    try {
                        int compare = comparator.compare(next2, next);
                        if (compare < 0) {
                            if (!listIterator.hasNext()) {
                                break;
                            }
                            next2 = listIterator.next();
                        } else if (compare != 0) {
                            break;
                        } else if (!it.hasNext()) {
                            return true;
                        } else {
                            next = it.next();
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
            }
            return false;
        }
        return super.containsAll(collection);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.G.n().listIterator(0);
    }

    @Override // defpackage.dee, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                vde vdeVar = this.G;
                if (vdeVar.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.E;
                        if (dae.K(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                wce listIterator = vdeVar.listIterator(0);
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    Object next2 = it.next();
                                    if (next2 != null) {
                                        if (comparator.compare(next, next2) != 0) {
                                        }
                                    }
                                }
                                return true;
                            } catch (ClassCastException | NoSuchElementException unused) {
                            }
                        } else {
                            return containsAll(set);
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.hwd
    public final int f(Object[] objArr) {
        return this.G.f(objArr);
    }

    @Override // defpackage.pee, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.G.get(0);
        }
        xk5.g();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int w = w(obj, true) - 1;
        if (w == -1) {
            return null;
        }
        return this.G.get(w);
    }

    @Override // defpackage.hwd
    public final int g() {
        return this.G.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int x = x(obj, false);
        vde vdeVar = this.G;
        if (x == vdeVar.size()) {
            return null;
        }
        return vdeVar.get(x);
    }

    @Override // defpackage.hwd
    public final int i() {
        return this.G.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.G.listIterator(0);
    }

    @Override // defpackage.hwd
    public final jwc k() {
        return this.G.listIterator(0);
    }

    @Override // defpackage.hwd
    public final Object[] l() {
        return this.G.l();
    }

    @Override // defpackage.pee, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            vde vdeVar = this.G;
            return vdeVar.get(vdeVar.size() - 1);
        }
        xk5.g();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int w = w(obj, false) - 1;
        if (w == -1) {
            return null;
        }
        return this.G.get(w);
    }

    @Override // defpackage.dee
    public final vde r() {
        return this.G;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.G.size();
    }

    public final int w(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.G, obj, this.E);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int x(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.G, obj, this.E);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    public final ufe y(int i, int i2) {
        vde vdeVar = this.G;
        if (i == 0) {
            if (i2 != vdeVar.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        Comparator comparator = this.E;
        if (i < i2) {
            return new ufe(vdeVar.subList(i, i2), comparator);
        }
        return pee.v(comparator);
    }
}
