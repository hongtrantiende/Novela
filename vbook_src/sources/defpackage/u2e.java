package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u2e  reason: default package */
/* loaded from: classes.dex */
public final class u2e extends e4e {
    public final transient int D;
    public final transient int E;
    public final /* synthetic */ e4e F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2e(e4e e4eVar, int i, int i2) {
        super(2);
        this.F = e4eVar;
        this.D = i;
        this.E = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fpe.z(i, this.E);
        return this.F.get(i + this.D);
    }

    @Override // defpackage.hwd
    public final Object[] h() {
        return this.F.h();
    }

    @Override // defpackage.hwd
    public final int i() {
        return this.F.i() + this.D;
    }

    @Override // defpackage.hwd
    public final int j() {
        return this.F.i() + this.D + this.E;
    }

    @Override // defpackage.e4e, java.util.List
    /* renamed from: p */
    public final e4e subList(int i, int i2) {
        fpe.A(i, i2, this.E);
        int i3 = this.D;
        return this.F.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.E;
    }
}
