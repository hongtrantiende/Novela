package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rla  reason: default package */
/* loaded from: classes.dex */
public final class rla extends mq7 implements fd6, z7a {
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public long Q;
    public wea R;
    public boolean S;
    public long T;
    public long U;
    public int V;
    public em1 W;
    public hc6 X;
    public ko9 Y;

    @Override // defpackage.z7a
    public final boolean F() {
        return false;
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        if (!this.S) {
            return;
        }
        j8a.j(l8aVar, this.R);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(j);
        return e37Var.q0(M.a, M.b, ls3.a, new jk(15, M, this));
    }

    public final String toString() {
        float f = this.K;
        float f2 = this.L;
        float f3 = this.M;
        float f4 = this.N;
        float f5 = this.O;
        float f6 = this.P;
        String d = ckc.d(this.Q);
        wea weaVar = this.R;
        boolean z = this.S;
        String i = zl1.i(this.T);
        String i2 = zl1.i(this.U);
        String a = vl0.a(this.V);
        em1 em1Var = this.W;
        hc6 hc6Var = this.X;
        StringBuilder x = nk2.x("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        s21.D(x, f3, ", translationX=0.0, translationY=0.0, shadowElevation=", f4, ", rotationX=0.0, rotationY=0.0, rotationZ=");
        s21.D(x, f5, ", cameraDistance=", f6, ", transformOrigin=");
        x.append(d);
        x.append(", shape=");
        x.append(weaVar);
        x.append(", clip=");
        x.append(z);
        x.append(", renderEffect=null, ambientShadowColor=");
        x.append(i);
        x.append(", spotShadowColor=");
        nk2.C(x, i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", a, ", colorFilter=");
        x.append(em1Var);
        x.append("outsets=");
        x.append(hc6Var);
        x.append(")");
        return x.toString();
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }
}
