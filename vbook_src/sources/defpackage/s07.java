package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s07  reason: default package */
/* loaded from: classes3.dex */
public final class s07 extends b3 {
    public final /* synthetic */ int a;
    public final r07 b;

    public /* synthetic */ s07(r07 r07Var, int i) {
        this.a = i;
        this.b = r07Var;
    }

    @Override // defpackage.b3
    public final int a() {
        switch (this.a) {
            case 0:
                return this.b.E;
            default:
                return this.b.E;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.a;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        r07 r07Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                r07Var.getClass();
                int g = r07Var.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = r07Var.b;
                objArr.getClass();
                return c16.i(objArr[g], entry.getValue());
            default:
                return r07Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                return this.b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return this.b.isEmpty();
            default:
                return this.b.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        r07 r07Var = this.b;
        switch (i) {
            case 0:
                r07Var.getClass();
                return new o07(r07Var, 0);
            default:
                r07Var.getClass();
                return new o07(r07Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        r07 r07Var = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    r07Var.getClass();
                    r07Var.c();
                    int g = r07Var.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = r07Var.b;
                        objArr.getClass();
                        if (c16.i(objArr[g], entry.getValue())) {
                            r07Var.k(g);
                            return true;
                        }
                    }
                }
                return false;
            default:
                r07Var.c();
                int g2 = r07Var.g(obj);
                if (g2 < 0) {
                    return false;
                }
                r07Var.k(g2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        r07 r07Var = this.b;
        collection.getClass();
        switch (i) {
            case 0:
                r07Var.c();
                return super.removeAll(collection);
            default:
                r07Var.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        r07 r07Var = this.b;
        collection.getClass();
        switch (i) {
            case 0:
                r07Var.c();
                return super.retainAll(collection);
            default:
                r07Var.c();
                return super.retainAll(collection);
        }
    }
}
