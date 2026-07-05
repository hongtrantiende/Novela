package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ws5  reason: default package */
/* loaded from: classes.dex */
public abstract class ws5 extends ts5 implements NavigableSet, Iterable {
    public static final /* synthetic */ int f = 0;
    public final transient Comparator d;
    public transient ws5 e;

    public ws5(Comparator comparator) {
        this.d = comparator;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        um9 um9Var = this.e;
        if (um9Var == null) {
            um9 um9Var2 = (um9) this;
            Comparator reverseOrder = Collections.reverseOrder(um9Var2.d);
            if (um9Var2.isEmpty()) {
                if (az7.b != reverseOrder) {
                    um9Var = new um9(mm9.e, reverseOrder);
                } else {
                    um9Var = um9.D;
                }
            } else {
                um9Var = new um9(um9Var2.C.u(), reverseOrder);
            }
            this.e = um9Var;
            um9Var.e = this;
        }
        return um9Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        um9 um9Var = (um9) this;
        return um9Var.n(0, um9Var.p(obj, z));
    }

    @Override // java.util.NavigableSet
    /* renamed from: m */
    public final um9 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        obj.getClass();
        obj2.getClass();
        if (this.d.compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        wq9.s(z3);
        um9 um9Var = (um9) this;
        um9 n = um9Var.n(um9Var.r(obj, z), um9Var.C.size());
        return n.n(0, n.p(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        um9 um9Var = (um9) this;
        return um9Var.n(um9Var.r(obj, true), um9Var.C.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        um9 um9Var = (um9) this;
        return um9Var.n(0, um9Var.p(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        um9 um9Var = (um9) this;
        return um9Var.n(um9Var.r(obj, z), um9Var.C.size());
    }
}
