package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sp3  reason: default package */
/* loaded from: classes.dex */
public final class sp3 implements lp3 {
    public xy4 a = vy4.a;

    @Override // defpackage.lp3
    public final xy4 a() {
        return this.a;
    }

    @Override // defpackage.lp3
    public final void b(xy4 xy4Var) {
        this.a = xy4Var;
    }

    @Override // defpackage.lp3
    public final lp3 c() {
        sp3 sp3Var = new sp3();
        sp3Var.a = this.a;
        return sp3Var;
    }

    public final String toString() {
        return "EmittableSpacer(modifier=" + this.a + ')';
    }
}
