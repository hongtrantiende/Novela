package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: um9  reason: default package */
/* loaded from: classes.dex */
public final class um9 extends ws5 {
    public static final um9 D;
    public final transient qs5 C;

    static {
        ms5 ms5Var = qs5.b;
        D = new um9(mm9.e, az7.b);
    }

    public um9(qs5 qs5Var, Comparator comparator) {
        super(comparator);
        this.C = qs5Var;
    }

    @Override // defpackage.ts5, defpackage.is5
    public final qs5 a() {
        return this.C;
    }

    @Override // defpackage.is5
    public final int b(int i, Object[] objArr) {
        return this.C.b(i, objArr);
    }

    @Override // defpackage.is5
    public final Object[] c() {
        return this.C.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int r = r(obj, true);
        qs5 qs5Var = this.C;
        if (r == qs5Var.size()) {
            return null;
        }
        return qs5Var.get(r);
    }

    @Override // defpackage.is5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.C, obj, this.d) >= 0) {
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
        if (collection instanceof sm9) {
            collection = ((sm9) collection).h();
        }
        Comparator comparator = this.d;
        if (cbe.o(comparator, collection) && collection.size() > 1) {
            jwc g = g();
            Iterator it = collection.iterator();
            ms5 ms5Var = (ms5) g;
            if (ms5Var.hasNext()) {
                Object next = it.next();
                Object next2 = ms5Var.next();
                while (true) {
                    try {
                        int compare = comparator.compare(next2, next);
                        if (compare < 0) {
                            if (ms5Var.hasNext()) {
                                next2 = ms5Var.next();
                            } else {
                                return false;
                            }
                        } else if (compare == 0) {
                            if (!it.hasNext()) {
                                return true;
                            }
                            next = it.next();
                        } else if (compare > 0) {
                            return false;
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return super.containsAll(collection);
        }
    }

    @Override // defpackage.is5
    public final int d() {
        return this.C.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.C.u().listIterator(0);
    }

    @Override // defpackage.is5
    public final int e() {
        return this.C.e();
    }

    @Override // defpackage.ts5, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (this.C.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.d;
                        if (cbe.o(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                jwc g = g();
                                do {
                                    ms5 ms5Var = (ms5) g;
                                    if (ms5Var.hasNext()) {
                                        next = ms5Var.next();
                                        next2 = it.next();
                                        if (next2 == null) {
                                            return false;
                                        }
                                    } else {
                                        return true;
                                    }
                                } while (comparator.compare(next, next2) == 0);
                                return false;
                            } catch (ClassCastException | NoSuchElementException unused) {
                                return false;
                            }
                        }
                        return containsAll(set);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return this.C.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.C.get(0);
        }
        xk5.g();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int p = p(obj, true) - 1;
        if (p == -1) {
            return null;
        }
        return this.C.get(p);
    }

    @Override // defpackage.is5
    public final jwc g() {
        return this.C.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int r = r(obj, false);
        qs5 qs5Var = this.C;
        if (r == qs5Var.size()) {
            return null;
        }
        return qs5Var.get(r);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            qs5 qs5Var = this.C;
            return qs5Var.get(qs5Var.size() - 1);
        }
        xk5.g();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int p = p(obj, false) - 1;
        if (p == -1) {
            return null;
        }
        return this.C.get(p);
    }

    public final um9 n(int i, int i2) {
        qs5 qs5Var = this.C;
        if (i == 0 && i2 == qs5Var.size()) {
            return this;
        }
        Comparator comparator = this.d;
        if (i < i2) {
            return new um9(qs5Var.subList(i, i2), comparator);
        }
        if (az7.b != comparator) {
            return new um9(mm9.e, comparator);
        }
        return D;
    }

    public final int p(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.C, obj, this.d);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int r(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.C, obj, this.d);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.C.size();
    }
}
