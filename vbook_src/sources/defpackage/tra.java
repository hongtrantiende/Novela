package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tra  reason: default package */
/* loaded from: classes.dex */
public final class tra implements Parcelable, iza, Set, RandomAccess, o76 {
    public static final Parcelable.Creator<tra> CREATOR = new gm8(2);
    public mza a;

    public tra() {
        gu8 gu8Var = gu8.d;
        mza mzaVar = new mza(dra.j().g(), gu8Var);
        if (dra.b.get() != null) {
            mzaVar.b = new mza(1L, gu8Var);
        }
        this.a = mzaVar;
    }

    @Override // defpackage.iza
    public final kza a() {
        return this.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        gu8 gu8Var;
        zqa j;
        boolean i2;
        do {
            synchronized (xve.i) {
                mza mzaVar = this.a;
                mzaVar.getClass();
                mza mzaVar2 = (mza) dra.h(mzaVar);
                i = mzaVar2.d;
                gu8Var = mzaVar2.c;
            }
            gu8Var.getClass();
            gu8 b = gu8Var.b(obj);
            if (b.equals(gu8Var)) {
                return false;
            }
            mza mzaVar3 = this.a;
            mzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = xve.i((mza) dra.w(mzaVar3, this, j), i, b);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        gu8 gu8Var;
        zqa j;
        boolean i2;
        do {
            synchronized (xve.i) {
                mza mzaVar = this.a;
                mzaVar.getClass();
                mza mzaVar2 = (mza) dra.h(mzaVar);
                i = mzaVar2.d;
                gu8Var = mzaVar2.c;
            }
            gu8Var.getClass();
            hu8 hu8Var = new hu8(gu8Var);
            hu8Var.addAll(collection);
            gu8 b = hu8Var.b();
            if (b.equals(gu8Var)) {
                return false;
            }
            mza mzaVar3 = this.a;
            mzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = xve.i((mza) dra.w(mzaVar3, this, j), i, b);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        zqa j;
        mza mzaVar = this.a;
        mzaVar.getClass();
        synchronized (dra.c) {
            j = dra.j();
            mza mzaVar2 = (mza) dra.w(mzaVar, this, j);
            synchronized (xve.i) {
                mzaVar2.c = gu8.d;
                mzaVar2.d++;
            }
        }
        dra.n(j, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return xve.k(this).c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return xve.k(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.iza
    public final void e(kza kzaVar) {
        kzaVar.b = this.a;
        this.a = (mza) kzaVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return xve.k(this).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new lza(this, xve.k(this).c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        gu8 gu8Var;
        zqa j;
        boolean i2;
        do {
            synchronized (xve.i) {
                mza mzaVar = this.a;
                mzaVar.getClass();
                mza mzaVar2 = (mza) dra.h(mzaVar);
                i = mzaVar2.d;
                gu8Var = mzaVar2.c;
            }
            gu8Var.getClass();
            gu8 c = gu8Var.c(obj);
            if (c.equals(gu8Var)) {
                return false;
            }
            mza mzaVar3 = this.a;
            mzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = xve.i((mza) dra.w(mzaVar3, this, j), i, c);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        gu8 gu8Var;
        zqa j;
        boolean i2;
        do {
            synchronized (xve.i) {
                mza mzaVar = this.a;
                mzaVar.getClass();
                mza mzaVar2 = (mza) dra.h(mzaVar);
                i = mzaVar2.d;
                gu8Var = mzaVar2.c;
            }
            gu8Var.getClass();
            hu8 hu8Var = new hu8(gu8Var);
            hu8Var.removeAll(collection);
            gu8 b = hu8Var.b();
            if (b.equals(gu8Var)) {
                return false;
            }
            mza mzaVar3 = this.a;
            mzaVar3.getClass();
            synchronized (dra.c) {
                j = dra.j();
                i2 = xve.i((mza) dra.w(mzaVar3, this, j), i, b);
            }
            dra.n(j, this);
        } while (!i2);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        gu8 gu8Var;
        boolean retainAll;
        zqa j;
        boolean i2;
        do {
            synchronized (xve.i) {
                mza mzaVar = this.a;
                mzaVar.getClass();
                mza mzaVar2 = (mza) dra.h(mzaVar);
                i = mzaVar2.d;
                gu8Var = mzaVar2.c;
            }
            if (gu8Var != null) {
                hu8 hu8Var = new hu8(gu8Var);
                retainAll = hu8Var.retainAll(sl1.H0(collection));
                gu8 b = hu8Var.b();
                if (b.equals(gu8Var)) {
                    break;
                }
                mza mzaVar3 = this.a;
                mzaVar3.getClass();
                synchronized (dra.c) {
                    j = dra.j();
                    i2 = xve.i((mza) dra.w(mzaVar3, this, j), i, b);
                }
                dra.n(j, this);
            } else {
                vs.k("No set to mutate");
                return false;
            }
        } while (!i2);
        return retainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return xve.k(this).c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }

    public final String toString() {
        mza mzaVar = this.a;
        mzaVar.getClass();
        gu8 gu8Var = ((mza) dra.h(mzaVar)).c;
        int hashCode = hashCode();
        return "SnapshotStateSet(value=" + gu8Var + ")@" + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        gu8 gu8Var = xve.k(this).c;
        parcel.writeInt(size());
        Iterator it = gu8Var.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return pbe.q(this, objArr);
    }
}
