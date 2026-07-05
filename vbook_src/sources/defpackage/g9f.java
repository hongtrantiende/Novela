package defpackage;

import java.util.AbstractMap;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g9f  reason: default package */
/* loaded from: classes.dex */
public final class g9f extends a8f {
    public final /* synthetic */ h9f c;

    public g9f(h9f h9fVar) {
        this.c = h9fVar;
    }

    @Override // defpackage.u7f
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        h9f h9fVar = this.c;
        voe.A(i, h9fVar.f);
        Object[] objArr = h9fVar.e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
