package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dca  reason: default package */
/* loaded from: classes.dex */
public final class dca extends cca implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        i39 i39Var = this.b;
        i39Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (i39Var.apply(next)) {
                return next;
            }
        }
        xk5.g();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cca, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new cca(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            Object last = sortedSet.last();
            if (this.b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cca, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new cca(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cca, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new cca(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
