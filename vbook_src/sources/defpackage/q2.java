package defpackage;

import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q2  reason: default package */
/* loaded from: classes.dex */
public final class q2 extends i2 implements ListIterator {
    public final /* synthetic */ r2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r2 r2Var, int i) {
        super(r2Var, ((List) r2Var.b).listIterator(i));
        this.e = r2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        r2 r2Var = this.e;
        boolean isEmpty = r2Var.isEmpty();
        b().add(obj);
        r2Var.f.f++;
        if (isEmpty) {
            r2Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r2 r2Var) {
        super(r2Var);
        this.e = r2Var;
    }
}
