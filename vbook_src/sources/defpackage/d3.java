package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d3  reason: default package */
/* loaded from: classes.dex */
public abstract class d3 extends e2 {
    public abstract d3 b(int i, Object obj);

    public abstract d3 c(Object obj);

    @Override // defpackage.v0, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.v0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public d3 d(Collection collection) {
        ku8 e = e();
        e.addAll(collection);
        return e.c();
    }

    public abstract ku8 e();

    public abstract d3 f(c3 c3Var);

    public abstract d3 g(int i);

    public abstract d3 h(int i, Object obj);

    @Override // defpackage.e2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.e2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.e2, java.util.List
    public final List subList(int i, int i2) {
        return new ps5(this, i, i2);
    }
}
