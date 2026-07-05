package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k9e  reason: default package */
/* loaded from: classes.dex */
public final class k9e extends w1e {
    public final transient Object[] D;
    public final transient int E;
    public final transient int F;

    public k9e(Object[] objArr, int i, int i2) {
        super(1);
        this.D = objArr;
        this.E = i;
        this.F = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xpe.q(i, this.F);
        Object obj = this.D[i + i + this.E];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.F;
    }
}
