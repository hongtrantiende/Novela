package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o81  reason: default package */
/* loaded from: classes3.dex */
public final class o81 extends AbstractCollection implements Collection, k76 {
    public final /* synthetic */ int a;
    public final Object b;

    public o81(p81 p81Var) {
        this.a = 0;
        this.b = p81Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                obj.getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.values does not support add");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 1:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        switch (this.a) {
            case 1:
                ((r07) this.b).clear();
                return;
            case 2:
                ((au8) this.b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                return ((r07) this.b).containsValue(obj);
            case 2:
                return ((au8) this.b).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return ((r07) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new l81((p81) obj, 2);
            case 1:
                r07 r07Var = (r07) obj;
                r07Var.getClass();
                return new o07(r07Var, 2);
            default:
                au8 au8Var = (au8) obj;
                aoc[] aocVarArr = new aoc[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    aocVarArr[i2] = new boc(2);
                }
                return new bu8(au8Var, aocVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                r07 r07Var = (r07) this.b;
                r07Var.c();
                int h = r07Var.h(obj);
                if (h < 0) {
                    return false;
                }
                r07Var.k(h);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 1:
                collection.getClass();
                ((r07) this.b).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 1:
                collection.getClass();
                ((r07) this.b).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((p81) obj).c;
            case 1:
                return ((r07) obj).E;
            default:
                return ((au8) obj).f;
        }
    }

    public /* synthetic */ o81(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
