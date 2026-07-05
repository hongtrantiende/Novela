package defpackage;

import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: os5  reason: default package */
/* loaded from: classes.dex */
public final class os5 extends qs5 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ qs5 e;

    public os5(qs5 qs5Var, int i, int i2) {
        this.e = qs5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.is5
    public final Object[] c() {
        return this.e.c();
    }

    @Override // defpackage.is5
    public final int d() {
        return this.e.e() + this.c + this.d;
    }

    @Override // defpackage.is5
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wq9.w(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.qs5, defpackage.is5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.qs5, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.qs5, java.util.List
    /* renamed from: w */
    public final qs5 subList(int i, int i2) {
        wq9.B(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.qs5, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
