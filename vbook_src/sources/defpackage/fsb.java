package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fsb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fsb implements yi4, uu4 {
    public final /* synthetic */ vt4 a;

    public fsb(vt4 vt4Var) {
        this.a = vt4Var;
    }

    @Override // defpackage.uu4
    public final hu4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yi4) || !(obj instanceof uu4)) {
            return false;
        }
        return c16.i(a(), ((uu4) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.yi4
    public final /* synthetic */ float invoke() {
        return ((Number) this.a.invoke()).floatValue();
    }
}
