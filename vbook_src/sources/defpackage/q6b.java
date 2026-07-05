package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q6b  reason: default package */
/* loaded from: classes.dex */
public final class q6b implements Collection, j76 {
    public final /* synthetic */ int a;
    public final Object b;

    public q6b() {
        this.a = 0;
        this.b = df8.a();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                return ((lv7) this.b).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((lv7) this.b).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((lv7) this.b).c(obj);
            default:
                return ((tv7) this.b).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                for (Object obj2 : collection) {
                    if (!((lv7) obj).c(obj2)) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection<Object> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Object obj3 : collection2) {
                        if (!((tv7) obj).d(obj3)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                if (((lv7) this.b).g == 0) {
                    return true;
                }
                return false;
            default:
                return ((tv7) this.b).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                lv7 lv7Var = (lv7) this.b;
                lv7Var.getClass();
                return new sw4(new nv7(lv7Var));
            default:
                return h9a.O(new lu3(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                return ((lv7) this.b).h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((lv7) this.b).h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((lv7) this.b).j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((lv7) this.b).g;
            default:
                return ((tv7) this.b).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                return pbe.q(this, objArr);
            default:
                objArr.getClass();
                return pbe.q(this, objArr);
        }
    }

    public q6b(tv7 tv7Var) {
        this.a = 1;
        tv7Var.getClass();
        this.b = tv7Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return pbe.p(this);
            default:
                return pbe.p(this);
        }
    }
}
