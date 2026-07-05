package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j9f  reason: default package */
/* loaded from: classes.dex */
public final class j9f extends m8f {
    public final transient r9f d;
    public final transient q9f e;

    public j9f(r9f r9fVar, q9f q9fVar) {
        this.d = r9fVar;
        this.e = q9fVar;
    }

    @Override // defpackage.u7f
    public final iaf a() {
        return this.e.listIterator(0);
    }

    @Override // defpackage.u7f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m8f, defpackage.u7f
    public final a8f e() {
        return this.e;
    }

    @Override // defpackage.u7f
    public final boolean f() {
        return true;
    }

    @Override // defpackage.u7f
    public final int g(Object[] objArr) {
        return this.e.g(objArr);
    }

    @Override // defpackage.m8f, defpackage.u7f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
