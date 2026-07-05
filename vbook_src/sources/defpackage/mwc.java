package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mwc  reason: default package */
/* loaded from: classes.dex */
public final class mwc extends AbstractList implements qk6, RandomAccess {
    public final pk6 a;

    public mwc(pk6 pk6Var) {
        this.a = pk6Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        lwc lwcVar = new lwc();
        lwcVar.b = this.a.iterator();
        return lwcVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, kwc, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ?? obj = new Object();
        obj.a = this.a.listIterator(i);
        return obj;
    }

    @Override // defpackage.qk6
    public final List o() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // defpackage.qk6
    public final void q(b31 b31Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.qk6
    public final qk6 S() {
        return this;
    }
}
