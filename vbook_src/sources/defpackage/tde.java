package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tde  reason: default package */
/* loaded from: classes.dex */
public final class tde extends vde {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ vde F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tde(vde vdeVar, int i, int i2) {
        super(4);
        this.F = vdeVar;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.hwd
    public final int g() {
        return this.F.i() + this.D + this.E;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ctd.B(i, this.E);
        return this.F.get(i + this.D);
    }

    @Override // defpackage.hwd
    public final int i() {
        return this.F.i() + this.D;
    }

    @Override // defpackage.hwd
    public final Object[] l() {
        return this.F.l();
    }

    @Override // defpackage.vde, java.util.List
    /* renamed from: p */
    public final vde subList(int i, int i2) {
        ctd.C(i, i2, this.E);
        int i3 = this.D;
        return this.F.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
