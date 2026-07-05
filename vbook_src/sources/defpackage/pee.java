package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pee  reason: default package */
/* loaded from: classes.dex */
public abstract class pee extends dee implements NavigableSet, Iterable {
    public final transient Comparator E;
    public transient pee F;

    public pee(Comparator comparator) {
        super(4);
        this.E = comparator;
    }

    public static ufe v(Comparator comparator) {
        if (efe.b != comparator) {
            wce wceVar = vde.C;
            return new ufe(nfe.F, comparator);
        }
        return ufe.H;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.E;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        ufe ufeVar = (ufe) this;
        return ufeVar.y(0, ufeVar.w(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: t */
    public final pee descendingSet() {
        ufe ufeVar = this.F;
        if (ufeVar == null) {
            ufe ufeVar2 = (ufe) this;
            Comparator reverseOrder = Collections.reverseOrder(ufeVar2.E);
            if (ufeVar2.isEmpty()) {
                ufeVar = v(reverseOrder);
            } else {
                ufeVar = new ufe(ufeVar2.G.n(), reverseOrder);
            }
            this.F = ufeVar;
            ufeVar.F = this;
        }
        return ufeVar;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        ufe ufeVar = (ufe) this;
        return ufeVar.y(ufeVar.x(obj, true), ufeVar.G.size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: u */
    public final ufe subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.E.compare(obj, obj2) <= 0) {
            ufe ufeVar = (ufe) this;
            ufe y = ufeVar.y(ufeVar.x(obj, z), ufeVar.G.size());
            return y.y(0, y.w(obj2, z2));
        }
        p1a.g();
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        ufe ufeVar = (ufe) this;
        return ufeVar.y(0, ufeVar.w(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        ufe ufeVar = (ufe) this;
        return ufeVar.y(ufeVar.x(obj, z), ufeVar.G.size());
    }
}
