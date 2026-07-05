package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns5  reason: default package */
/* loaded from: classes.dex */
public final class ns5 extends qs5 {
    public final transient qs5 c;

    public ns5(qs5 qs5Var) {
        this.c = qs5Var;
    }

    @Override // defpackage.qs5, defpackage.is5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // defpackage.is5
    public final boolean f() {
        return this.c.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        qs5 qs5Var = this.c;
        wq9.w(i, qs5Var.size());
        return qs5Var.get((qs5Var.size() - 1) - i);
    }

    @Override // defpackage.qs5, java.util.List
    public final int indexOf(Object obj) {
        qs5 qs5Var = this.c;
        int lastIndexOf = qs5Var.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (qs5Var.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.qs5, defpackage.is5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.qs5, java.util.List
    public final int lastIndexOf(Object obj) {
        qs5 qs5Var = this.c;
        int indexOf = qs5Var.indexOf(obj);
        if (indexOf >= 0) {
            return (qs5Var.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.qs5, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.qs5
    public final qs5 u() {
        return this.c;
    }

    @Override // defpackage.qs5, java.util.List
    /* renamed from: w */
    public final qs5 subList(int i, int i2) {
        qs5 qs5Var = this.c;
        wq9.B(i, i2, qs5Var.size());
        return qs5Var.subList(qs5Var.size() - i2, qs5Var.size() - i).u();
    }

    @Override // defpackage.qs5, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
