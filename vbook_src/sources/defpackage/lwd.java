package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lwd  reason: default package */
/* loaded from: classes.dex */
public final class lwd extends owd {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ owd F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwd(owd owdVar, int i, int i2) {
        super(0);
        this.F = owdVar;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.hwd
    public final int b() {
        return this.F.c() + this.D + this.E;
    }

    @Override // defpackage.hwd
    public final int c() {
        return this.F.c() + this.D;
    }

    @Override // defpackage.hwd
    public final Object[] d() {
        return this.F.d();
    }

    @Override // java.util.List
    public final Object get(int i) {
        eze.u(i, this.E);
        return this.F.get(i + this.D);
    }

    @Override // defpackage.owd, java.util.List
    /* renamed from: n */
    public final owd subList(int i, int i2) {
        eze.v(i, i2, this.E);
        int i3 = this.D;
        return this.F.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
