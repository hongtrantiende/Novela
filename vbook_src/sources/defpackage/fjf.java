package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fjf  reason: default package */
/* loaded from: classes.dex */
public final class fjf extends ocf {
    public static final fjf e = new fjf(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public fjf(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.ocf, defpackage.z6f
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.z6f
    public final int b() {
        return this.d;
    }

    @Override // defpackage.z6f
    public final int c() {
        return 0;
    }

    @Override // defpackage.z6f
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pbe.v(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
