package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pp3  reason: default package */
/* loaded from: classes.dex */
public final class pp3 implements lp3 {
    public to5 b;
    public mac c;
    public xy4 a = vy4.a;
    public int d = 1;

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
        pp3 pp3Var = new pp3();
        pp3Var.a = this.a;
        pp3Var.b = this.b;
        pp3Var.c = this.c;
        pp3Var.d = this.d;
        return pp3Var;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.a + ", provider=" + this.b + ", colorFilterParams=" + this.c + ", contentScale=" + ((Object) v22.a(this.d)) + ')';
    }
}
