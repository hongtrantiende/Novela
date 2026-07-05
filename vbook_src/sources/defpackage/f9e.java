package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f9e  reason: default package */
/* loaded from: classes.dex */
public final class f9e extends n6e {
    public final transient m9e D;
    public final transient k9e E;

    public f9e(m9e m9eVar, k9e k9eVar) {
        super(1);
        this.D = m9eVar;
        this.E = k9eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.D.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hwd
    public final int f(Object[] objArr) {
        return this.E.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.E.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D.f;
    }
}
