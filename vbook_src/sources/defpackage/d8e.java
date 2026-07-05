package defpackage;

import java.util.AbstractMap;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d8e  reason: default package */
/* loaded from: classes.dex */
public final class d8e extends w1e {
    public final /* synthetic */ r8e D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8e(r8e r8eVar) {
        super(1);
        this.D = r8eVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        r8e r8eVar = this.D;
        xpe.q(i, r8eVar.F);
        Object[] objArr = r8eVar.E;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D.F;
    }
}
