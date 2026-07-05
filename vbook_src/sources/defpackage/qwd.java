package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qwd  reason: default package */
/* loaded from: classes.dex */
public final class qwd extends owd {
    public static final qwd F = new qwd(new Object[0], 0);
    public final transient Object[] D;
    public final transient int E;

    public qwd(Object[] objArr, int i) {
        super(0);
        this.D = objArr;
        this.E = i;
    }

    @Override // defpackage.owd, defpackage.hwd
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.D;
        int i = this.E;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.hwd
    public final int b() {
        return this.E;
    }

    @Override // defpackage.hwd
    public final int c() {
        return 0;
    }

    @Override // defpackage.hwd
    public final Object[] d() {
        return this.D;
    }

    @Override // java.util.List
    public final Object get(int i) {
        eze.u(i, this.E);
        Object obj = this.D[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
