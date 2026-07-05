package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e9f  reason: default package */
/* loaded from: classes.dex */
public final class e9f extends a8f {
    public static final e9f e = new e9f(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public e9f(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.u7f
    public final Object[] b() {
        return this.c;
    }

    @Override // defpackage.u7f
    public final int c() {
        return 0;
    }

    @Override // defpackage.u7f
    public final int d() {
        return this.d;
    }

    @Override // defpackage.u7f
    public final boolean f() {
        return false;
    }

    @Override // defpackage.a8f, defpackage.u7f
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        voe.A(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
