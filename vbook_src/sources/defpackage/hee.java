package defpackage;

import java.util.AbstractMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hee  reason: default package */
/* loaded from: classes.dex */
public final class hee extends vde {
    public final /* synthetic */ jee D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hee(jee jeeVar) {
        super(4);
        this.D = jeeVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        mee meeVar = this.D.E;
        return new AbstractMap.SimpleImmutableEntry(meeVar.c.G.get(i), meeVar.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.D.E.d.size();
    }
}
