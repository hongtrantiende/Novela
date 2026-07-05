package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h6b  reason: default package */
/* loaded from: classes.dex */
public final class h6b implements List, l76 {
    public final ora a;
    public final int b;
    public int c;
    public int d;

    public h6b(ora oraVar, int i, int i2) {
        this.a = oraVar;
        this.b = i;
        this.c = sve.p(oraVar);
        this.d = i2 - i;
    }

    public final void a() {
        if (sve.p(this.a) == this.c) {
            return;
        }
        vs.f();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.b + this.d;
        ora oraVar = this.a;
        oraVar.add(i, obj);
        this.d++;
        this.c = sve.p(oraVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.b;
        ora oraVar = this.a;
        boolean addAll = oraVar.addAll(i2, collection);
        if (addAll) {
            this.d = collection.size() + this.d;
            this.c = sve.p(oraVar);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        d3 d3Var;
        zqa j;
        boolean i2;
        if (this.d > 0) {
            a();
            ora oraVar = this.a;
            int i3 = this.b;
            int i4 = this.d + i3;
            do {
                synchronized (sve.n) {
                    fza fzaVar = oraVar.a;
                    fzaVar.getClass();
                    fza fzaVar2 = (fza) dra.h(fzaVar);
                    i = fzaVar2.d;
                    d3Var = fzaVar2.c;
                }
                d3Var.getClass();
                ku8 e = d3Var.e();
                e.subList(i3, i4).clear();
                d3 c = e.c();
                if (c16.i(c, d3Var)) {
                    break;
                }
                fza fzaVar3 = oraVar.a;
                fzaVar3.getClass();
                synchronized (dra.c) {
                    j = dra.j();
                    i2 = sve.i((fza) dra.w(fzaVar3, oraVar, j), i, c, true);
                }
                dra.n(j, oraVar);
            } while (!i2);
            this.d = 0;
            this.c = sve.p(this.a);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        sve.h(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int nextInt;
        a();
        int i = this.d;
        int i2 = this.b;
        Iterator it = dce.F(i2, i + i2).iterator();
        do {
            sy5 sy5Var = (sy5) it;
            if (sy5Var.c) {
                nextInt = sy5Var.nextInt();
            } else {
                return -1;
            }
        } while (!c16.i(obj, this.a.get(nextInt)));
        return nextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.d;
        int i2 = this.b;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (c16.i(obj, this.a.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xl9, java.lang.Object] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ?? obj = new Object();
        obj.a = i - 1;
        return new ss9((xl9) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.b + i;
        ora oraVar = this.a;
        Object remove = oraVar.remove(i2);
        this.d--;
        this.c = sve.p(oraVar);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        d3 d3Var;
        zqa j;
        boolean i2;
        a();
        ora oraVar = this.a;
        int i3 = this.b;
        int i4 = this.d + i3;
        int size = oraVar.size();
        do {
            synchronized (sve.n) {
                fza fzaVar = oraVar.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            ku8 e = d3Var.e();
            e.subList(i3, i4).retainAll(collection);
            d3 c = e.c();
            if (c16.i(c, d3Var)) {
                break;
            }
            fza fzaVar3 = oraVar.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = sve.i((fza) dra.w(fzaVar3, oraVar, j), i, c, true);
            }
            dra.n(j, oraVar);
        } while (!i2);
        int size2 = size - oraVar.size();
        if (size2 > 0) {
            this.c = sve.p(this.a);
            this.d -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        sve.h(i, this.d);
        a();
        int i2 = i + this.b;
        ora oraVar = this.a;
        Object obj2 = oraVar.set(i2, obj);
        this.c = sve.p(oraVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.d) {
            e39.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.b;
        return new h6b(this.a, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pbe.q(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.b + i;
        ora oraVar = this.a;
        oraVar.add(i2, obj);
        this.d++;
        this.c = sve.p(oraVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.d, collection);
    }
}
