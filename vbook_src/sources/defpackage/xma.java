package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xma  reason: default package */
/* loaded from: classes.dex */
public final class xma extends ts5 {
    public final transient Object d;

    public xma(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.ts5, defpackage.is5
    public final qs5 a() {
        return qs5.r(this.d);
    }

    @Override // defpackage.is5
    public final int b(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.is5, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.is5
    public final boolean f() {
        return false;
    }

    @Override // defpackage.is5
    public final jwc g() {
        return new f26(this.d);
    }

    @Override // defpackage.ts5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
