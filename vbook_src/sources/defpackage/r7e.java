package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r7e  reason: default package */
/* loaded from: classes.dex */
public final class r7e extends w1e {
    public static final r7e F = new r7e(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public r7e(Object[] objArr, int i) {
        super(1);
        this.D = objArr;
        this.E = i;
    }

    @Override // defpackage.w1e, defpackage.hwd
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.D;
        int i = this.E;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.hwd
    public final int g() {
        return this.E;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xpe.q(i, this.E);
        Object obj = this.D[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.hwd
    public final int i() {
        return 0;
    }

    @Override // defpackage.hwd
    public final Object[] l() {
        return this.D;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
