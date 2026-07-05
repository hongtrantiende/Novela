package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e69  reason: default package */
/* loaded from: classes.dex */
public final class e69 implements Collection, j76 {
    public Object[] a;
    public int b;

    public final void a(am1 am1Var) {
        Object[] objArr = this.a;
        if (objArr == null) {
            objArr = new Object[8];
        } else {
            int i = this.b;
            if (i == objArr.length) {
                objArr = Arrays.copyOf(objArr, i * 2);
            }
        }
        this.a = objArr;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = am1Var;
        dae.r(i2, objArr);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a = null;
        this.b = 0;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.a;
        if (objArr != null) {
            return b00.S(obj, objArr);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean z;
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            Object[] objArr = this.a;
            if (objArr != null) {
                z = b00.S(obj, objArr);
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b2(this, 3);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return pbe.q(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return pbe.p(this);
    }
}
