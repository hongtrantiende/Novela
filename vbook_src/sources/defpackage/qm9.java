package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qm9  reason: default package */
/* loaded from: classes.dex */
public final class qm9 extends qs5 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public qm9(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wq9.w(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
