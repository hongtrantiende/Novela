package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fge  reason: default package */
/* loaded from: classes.dex */
public final class fge extends dee {
    public final transient Object E;

    public fge(Object obj) {
        super(4);
        this.E = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.E.equals(obj);
    }

    @Override // defpackage.hwd
    public final int f(Object[] objArr) {
        objArr[0] = this.E;
        return 1;
    }

    @Override // defpackage.dee, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new tee(this.E);
    }

    @Override // defpackage.hwd
    public final jwc k() {
        return new tee(this.E);
    }

    @Override // defpackage.dee
    public final vde r() {
        Object[] objArr = {this.E};
        for (int i = 0; i < 1; i++) {
            wce wceVar = vde.C;
            if (objArr[i] == null) {
                xk5.k(a82.j(i, "at index "));
                return null;
            }
        }
        return vde.r(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return hl5.n("[", this.E.toString(), "]");
    }
}
