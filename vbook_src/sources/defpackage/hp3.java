package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hp3  reason: default package */
/* loaded from: classes.dex */
public final class hp3 implements List, l76 {
    public final ArrayList a = new ArrayList();

    public final String a(String str) {
        cp3 cp3Var;
        Iterator it = iterator();
        do {
            ak akVar = (ak) it;
            if (((Iterator) akVar.b).hasNext()) {
                cp3Var = (cp3) akVar.next();
            } else {
                return "";
            }
        } while (!cp3Var.n(str));
        return cp3Var.c(str);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        y28 y28Var = (y28) obj;
        y28Var.getClass();
        return this.a.add(y28Var);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        return this.a.addAll(i, collection);
    }

    public final y28 b() {
        if (this.a.isEmpty()) {
            return null;
        }
        return get(0);
    }

    @Override // java.util.List
    /* renamed from: c */
    public final y28 get(int i) {
        return (y28) this.a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        d();
        this.a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof y28)) {
            return false;
        }
        return this.a.contains((y28) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.a.containsAll(collection);
    }

    public final void d() {
        Iterator it = iterator();
        while (true) {
            ak akVar = (ak) it;
            if (((Iterator) akVar.b).hasNext()) {
                ((y28) akVar.next()).D();
            } else {
                return;
            }
        }
    }

    public final hp3 e(String str) {
        if (str.length() != 0) {
            char[] cArr = rf9.d;
            ex3 I = xbe.I(str);
            hp3 hp3Var = new hp3();
            HashSet hashSet = new HashSet();
            Iterator it = iterator();
            while (true) {
                ak akVar = (ak) it;
                if (((Iterator) akVar.b).hasNext()) {
                    cp3 cp3Var = (cp3) akVar.next();
                    cp3Var.getClass();
                    I.e();
                    ef4 ef4Var = new ef4(new ff4(new ff4(g9a.b0(new n38(cp3Var, cm9.a(cp3.class))), true, new uw3(I, cp3Var, 1)), true, new mp6(1, hashSet, HashSet.class, "add", "add(Ljava/lang/Object;)Z", 0, 20)));
                    while (ef4Var.hasNext()) {
                        cp3 cp3Var2 = (cp3) ef4Var.next();
                        cp3Var2.getClass();
                        hp3Var.a.add(cp3Var2);
                    }
                } else {
                    return hp3Var;
                }
            }
        } else {
            cy7.i("String must not be empty");
            return null;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hp3) {
                ArrayList arrayList = this.a;
                hp3 hp3Var = (hp3) obj;
                if (arrayList.size() == hp3Var.a.size()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        if (c16.i(get(i), hp3Var.get(i))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final String f() {
        return sl1.i0(this, " ", null, null, gp3.a, 30);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof y28)) {
            return -1;
        }
        return this.a.indexOf((y28) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ak(this.a.iterator(), 1);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y28)) {
            return -1;
        }
        return this.a.lastIndexOf((y28) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf;
        if (!(obj instanceof y28) || (indexOf = indexOf((y28) obj)) == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove((y28) it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (true) {
            ak akVar = (ak) it;
            if (!((Iterator) akVar.b).hasNext()) {
                break;
            }
            y28 y28Var = (y28) akVar.next();
            if (!collection.contains(y28Var)) {
                arrayList.add(y28Var);
            }
        }
        if (!arrayList.isEmpty()) {
            removeAll(arrayList);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        y28 y28Var = (y28) obj;
        y28Var.getClass();
        y28 y28Var2 = (y28) this.a.set(i, y28Var);
        y28Var2.F(y28Var);
        return y28Var2;
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
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return pbe.q(this, objArr);
    }

    public final String toString() {
        return sl1.i0(this, "\n", null, null, new bo7(20), 30);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        return this.a.addAll(collection);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        y28 y28Var = (y28) obj;
        y28Var.getClass();
        this.a.add(i, y28Var);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        y28 y28Var = (y28) this.a.remove(i);
        y28Var.D();
        return (cp3) y28Var;
    }
}
