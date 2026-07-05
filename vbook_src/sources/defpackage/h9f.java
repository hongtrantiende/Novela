package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h9f  reason: default package */
/* loaded from: classes.dex */
public final class h9f extends m8f {
    public final transient r9f d;
    public final transient Object[] e;
    public final transient int f;

    public h9f(r9f r9fVar, Object[] objArr, int i) {
        this.d = r9fVar;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.u7f
    public final iaf a() {
        return e().listIterator(0);
    }

    @Override // defpackage.u7f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.u7f
    public final boolean f() {
        return true;
    }

    @Override // defpackage.u7f
    public final int g(Object[] objArr) {
        return e().g(objArr);
    }

    @Override // defpackage.m8f, defpackage.u7f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // defpackage.m8f
    public final a8f j() {
        return new g9f(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
