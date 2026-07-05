package defpackage;

import java.util.AbstractMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rkf  reason: default package */
/* loaded from: classes.dex */
public final class rkf extends ocf {
    public final /* synthetic */ ixd c;

    public rkf(ixd ixdVar) {
        this.c = ixdVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        ixd ixdVar = this.c;
        pbe.v(i, ixdVar.e);
        int i2 = i + i;
        Object[] objArr = ixdVar.d;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
