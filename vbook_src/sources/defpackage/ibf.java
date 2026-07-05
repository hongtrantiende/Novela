package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ibf  reason: default package */
/* loaded from: classes.dex */
public final class ibf extends ocf {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ ocf e;

    public ibf(ocf ocfVar, int i, int i2) {
        this.e = ocfVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.z6f
    public final int b() {
        return this.e.c() + this.c + this.d;
    }

    @Override // defpackage.z6f
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // defpackage.z6f
    public final Object[] d() {
        return this.e.d();
    }

    @Override // defpackage.ocf, java.util.List
    /* renamed from: e */
    public final ocf subList(int i, int i2) {
        pbe.w(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        pbe.v(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
