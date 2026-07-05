package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ora  reason: default package */
/* loaded from: classes.dex */
public final class ora implements Parcelable, iza, List, RandomAccess, l76 {
    public static final Parcelable.Creator<ora> CREATOR = new nra(0);
    public fza a;

    public ora(d3 d3Var) {
        zqa j = dra.j();
        fza fzaVar = new fza(j.g(), d3Var);
        if (!(j instanceof lz4)) {
            fzaVar.b = new fza(1L, d3Var);
        }
        this.a = fzaVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        d3 d3Var;
        zqa j;
        boolean i2;
        do {
            synchronized (sve.n) {
                fza fzaVar = this.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            d3 c = d3Var.c(obj);
            if (c.equals(d3Var)) {
                return false;
            }
            fza fzaVar3 = this.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = sve.i((fza) dra.w(fzaVar3, this, j), i, c, true);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        d3 d3Var;
        zqa j;
        boolean i2;
        do {
            synchronized (sve.n) {
                fza fzaVar = this.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            d3 d = d3Var.d(collection);
            if (c16.i(d, d3Var)) {
                return false;
            }
            fza fzaVar3 = this.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = sve.i((fza) dra.w(fzaVar3, this, j), i, d, true);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        zqa j;
        fza fzaVar = this.a;
        fzaVar.getClass();
        synchronized (dra.c) {
            j = dra.j();
            fza fzaVar2 = (fza) dra.w(fzaVar, this, j);
            synchronized (sve.n) {
                fzaVar2.c = hqa.b;
                fzaVar2.d++;
                fzaVar2.e++;
            }
        }
        dra.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return sve.o(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return sve.o(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        kzaVar.b = this.a;
        this.a = (fza) kzaVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return sve.o(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return sve.o(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return sve.o(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return sve.o(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new y65(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        d3 d3Var;
        d3 d3Var2;
        zqa j;
        boolean i2;
        do {
            synchronized (sve.n) {
                fza fzaVar = this.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            int indexOf = d3Var.indexOf(obj);
            if (indexOf != -1) {
                d3Var2 = d3Var.g(indexOf);
            } else {
                d3Var2 = d3Var;
            }
            if (d3Var2.equals(d3Var)) {
                return false;
            }
            fza fzaVar3 = this.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = sve.i((fza) dra.w(fzaVar3, this, j), i, d3Var2, true);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        d3 d3Var;
        zqa j;
        boolean i2;
        do {
            synchronized (sve.n) {
                fza fzaVar = this.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            d3 f = d3Var.f(new c3(0, collection));
            if (c16.i(f, d3Var)) {
                return false;
            }
            fza fzaVar3 = this.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = sve.i((fza) dra.w(fzaVar3, this, j), i, f, true);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return sve.s(this, new c3(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        d3 d3Var;
        zqa j;
        boolean i3;
        Object obj2 = get(i);
        do {
            synchronized (sve.n) {
                fza fzaVar = this.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i2 = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            d3 h = d3Var.h(i, obj);
            if (h.equals(d3Var)) {
                break;
            }
            fza fzaVar3 = this.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i3 = sve.i((fza) dra.w(fzaVar3, this, j), i2, h, false);
            }
            dra.n(j, this);
        } while (!i3);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return sve.o(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            e39.a("fromIndex or toIndex are out of bounds");
        }
        return new h6b(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }

    public final String toString() {
        fza fzaVar = this.a;
        fzaVar.getClass();
        d3 d3Var = ((fza) dra.h(fzaVar)).c;
        int hashCode = hashCode();
        return "SnapshotStateList(value=" + d3Var + ")@" + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d3 d3Var = sve.o(this).c;
        int a = d3Var.a();
        parcel.writeInt(a);
        for (int i2 = 0; i2 < a; i2++) {
            parcel.writeValue(d3Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pbe.q(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new y65(this, i);
    }

    public ora() {
        this(hqa.b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d3 d3Var;
        zqa j;
        boolean i3;
        do {
            synchronized (sve.n) {
                fza fzaVar = this.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i2 = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            d3 b = d3Var.b(i, obj);
            if (b.equals(d3Var)) {
                return;
            }
            fza fzaVar3 = this.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i3 = sve.i((fza) dra.w(fzaVar3, this, j), i2, b, true);
            }
            dra.n(j, this);
        } while (!i3);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return sve.s(this, new al(i, collection, 6));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        d3 d3Var;
        zqa j;
        boolean i3;
        Object obj = get(i);
        do {
            synchronized (sve.n) {
                fza fzaVar = this.a;
                fzaVar.getClass();
                fza fzaVar2 = (fza) dra.h(fzaVar);
                i2 = fzaVar2.d;
                d3Var = fzaVar2.c;
            }
            d3Var.getClass();
            d3 g = d3Var.g(i);
            if (g.equals(d3Var)) {
                break;
            }
            fza fzaVar3 = this.a;
            fzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i3 = sve.i((fza) dra.w(fzaVar3, this, j), i2, g, true);
            }
            dra.n(j, this);
        } while (!i3);
        return obj;
    }
}
