package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z7f  reason: default package */
/* loaded from: classes.dex */
public final class z7f extends a8f {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ a8f e;

    public z7f(a8f a8fVar, int i, int i2) {
        this.e = a8fVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.u7f
    public final Object[] b() {
        return this.e.b();
    }

    @Override // defpackage.u7f
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // defpackage.u7f
    public final int d() {
        return this.e.c() + this.c + this.d;
    }

    @Override // defpackage.u7f
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        voe.A(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.a8f, java.util.List
    /* renamed from: h */
    public final a8f subList(int i, int i2) {
        voe.C(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
