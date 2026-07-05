package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tp3  reason: default package */
/* loaded from: classes.dex */
public final class tp3 implements lp3 {
    public nyb b;
    public String a = "";
    public int c = Integer.MAX_VALUE;
    public xy4 d = vy4.a;

    @Override // defpackage.lp3
    public final xy4 a() {
        return this.d;
    }

    @Override // defpackage.lp3
    public final void b(xy4 xy4Var) {
        this.d = xy4Var;
    }

    @Override // defpackage.lp3
    public final lp3 c() {
        tp3 tp3Var = new tp3();
        tp3Var.d = this.d;
        tp3Var.a = this.a;
        tp3Var.b = this.b;
        tp3Var.c = this.c;
        return tp3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.d);
        sb.append(", maxLines=");
        return hl5.p(sb, this.c, ')');
    }
}
