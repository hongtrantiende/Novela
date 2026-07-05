package defpackage;

import java.util.RandomAccess;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: we8  reason: default package */
/* loaded from: classes.dex */
public final class we8 extends e2 implements RandomAccess {
    public final e31[] a;

    public we8(e31[] e31VarArr, int[] iArr) {
        this.a = e31VarArr;
    }

    @Override // defpackage.v0
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.v0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof e31)) {
            return false;
        }
        return super.contains((e31) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.e2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof e31)) {
            return -1;
        }
        return super.indexOf((e31) obj);
    }

    @Override // defpackage.e2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof e31)) {
            return -1;
        }
        return super.lastIndexOf((e31) obj);
    }
}
