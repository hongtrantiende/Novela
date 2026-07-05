package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o6a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o6a implements l88, uu4 {
    public final /* synthetic */ vt4 a;

    public o6a(vt4 vt4Var) {
        this.a = vt4Var;
    }

    @Override // defpackage.uu4
    public final hu4 a() {
        return this.a;
    }

    @Override // defpackage.l88
    public final /* synthetic */ long b() {
        return ((y78) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l88) || !(obj instanceof uu4)) {
            return false;
        }
        return c16.i(a(), ((uu4) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
