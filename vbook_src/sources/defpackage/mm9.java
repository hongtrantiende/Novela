package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mm9  reason: default package */
/* loaded from: classes.dex */
public final class mm9 extends qs5 {
    public static final mm9 e = new mm9(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public mm9(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.qs5, defpackage.is5
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.is5
    public final Object[] c() {
        return this.c;
    }

    @Override // defpackage.is5
    public final int d() {
        return this.d;
    }

    @Override // defpackage.is5
    public final int e() {
        return 0;
    }

    @Override // defpackage.is5
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wq9.w(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
