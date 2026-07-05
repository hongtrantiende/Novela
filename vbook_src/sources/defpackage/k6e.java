package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k6e  reason: default package */
/* loaded from: classes.dex */
public final class k6e extends e4e {
    public static final k6e F = new k6e(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public k6e(Object[] objArr, int i) {
        super(2);
        this.D = objArr;
        this.E = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fpe.z(i, this.E);
        Object obj = this.D[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.hwd
    public final Object[] h() {
        return this.D;
    }

    @Override // defpackage.hwd
    public final int i() {
        return 0;
    }

    @Override // defpackage.hwd
    public final int j() {
        return this.E;
    }

    @Override // defpackage.e4e, defpackage.hwd
    public final int m(Object[] objArr) {
        Object[] objArr2 = this.D;
        int i = this.E;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
