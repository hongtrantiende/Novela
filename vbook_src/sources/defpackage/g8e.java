package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g8e  reason: default package */
/* loaded from: classes.dex */
public final class g8e extends f4e {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ f4e F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8e(f4e f4eVar, int i, int i2) {
        super(3);
        this.F = f4eVar;
        this.D = i;
        this.E = i2;
    }

    @Override // defpackage.hwd
    public final int e() {
        return this.F.g() + this.D + this.E;
    }

    @Override // defpackage.hwd
    public final int g() {
        return this.F.g() + this.D;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zpe.t(i, this.E);
        return this.F.get(i + this.D);
    }

    @Override // defpackage.hwd
    public final Object[] l() {
        return this.F.l();
    }

    @Override // defpackage.f4e, java.util.List
    /* renamed from: n */
    public final f4e subList(int i, int i2) {
        zpe.u(i, i2, this.E);
        int i3 = this.D;
        return (f4e) this.F.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
