package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q15  reason: default package */
/* loaded from: classes.dex */
public final class q15 extends uq7 {
    public final long C;
    public final wea D;
    public final boolean E;
    public final long F;
    public final long G;
    public final em1 H;
    public final hc6 I;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public q15(float f, float f2, float f3, float f4, float f5, long j, wea weaVar, boolean z, long j2, long j3, em1 em1Var, hc6 hc6Var) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.C = j;
        this.D = weaVar;
        this.E = z;
        this.F = j2;
        this.G = j3;
        this.H = em1Var;
        this.I = hc6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, rla, java.lang.Object] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        mq7Var.N = this.e;
        mq7Var.O = this.f;
        mq7Var.P = 8.0f;
        mq7Var.Q = this.C;
        mq7Var.R = this.D;
        mq7Var.S = this.E;
        mq7Var.T = this.F;
        mq7Var.U = this.G;
        mq7Var.V = 3;
        mq7Var.W = this.H;
        mq7Var.X = this.I;
        mq7Var.Y = new ko9(mq7Var, 6);
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(Float.valueOf(this.b), "scaleX");
        c00Var.b(Float.valueOf(this.c), "scaleY");
        c00Var.b(Float.valueOf(this.d), "alpha");
        Float valueOf = Float.valueOf((float) nae.e);
        c00Var.b(valueOf, "translationX");
        c00Var.b(valueOf, "translationY");
        c00Var.b(Float.valueOf(this.e), "shadowElevation");
        c00Var.b(valueOf, "rotationX");
        c00Var.b(valueOf, "rotationY");
        c00Var.b(Float.valueOf(this.f), "rotationZ");
        c00Var.b(Float.valueOf(8.0f), "cameraDistance");
        c00Var.b(new ckc(this.C), "transformOrigin");
        c00Var.b(this.D, "shape");
        c00Var.b(Boolean.valueOf(this.E), "clip");
        c00Var.b(null, "renderEffect");
        c00Var.b(new zl1(this.F), "ambientShadowColor");
        c00Var.b(new zl1(this.G), "spotShadowColor");
        c00Var.b(new Object(), "compositingStrategy");
        c00Var.b(new Object(), "blendMode");
        c00Var.b(this.H, "colorFilter");
        c00Var.b(this.I, "outsets");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        rla rlaVar = (rla) mq7Var;
        rlaVar.K = this.b;
        rlaVar.L = this.c;
        rlaVar.M = this.d;
        rlaVar.N = this.e;
        rlaVar.O = this.f;
        rlaVar.P = 8.0f;
        rlaVar.Q = this.C;
        rlaVar.R = this.D;
        rlaVar.S = this.E;
        rlaVar.T = this.F;
        rlaVar.U = this.G;
        rlaVar.V = 3;
        rlaVar.W = this.H;
        rlaVar.X = this.I;
        ube.F(rlaVar, rlaVar.Y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q15) {
                q15 q15Var = (q15) obj;
                if (Float.compare(this.b, q15Var.b) != 0 || Float.compare(this.c, q15Var.c) != 0 || Float.compare(this.d, q15Var.d) != 0 || Float.compare(nae.e, nae.e) != 0 || Float.compare(nae.e, nae.e) != 0 || Float.compare(this.e, q15Var.e) != 0 || Float.compare(nae.e, nae.e) != 0 || Float.compare(nae.e, nae.e) != 0 || Float.compare(this.f, q15Var.f) != 0 || Float.compare(8.0f, 8.0f) != 0 || !ckc.a(this.C, q15Var.C) || !c16.i(this.D, q15Var.D) || this.E != q15Var.E || !zl1.c(this.F, q15Var.F) || !zl1.c(this.G, q15Var.G) || !c16.i(this.H, q15Var.H) || !c16.i(this.I, q15Var.I)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(8.0f, nk2.d(this.f, nk2.d(nae.e, nk2.d(nae.e, nk2.d(this.e, nk2.d(nae.e, nk2.d(nae.e, nk2.d(this.d, nk2.d(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = ckc.c;
        int k = eub.k((this.D.hashCode() + hl5.c(d, this.C, 31)) * 31, 961, this.E);
        int i2 = zl1.j;
        int i3 = 0;
        int a = hl5.a(3, hl5.a(0, hl5.c(hl5.c(k, this.F, 31), this.G, 31), 31), 31);
        em1 em1Var = this.H;
        if (em1Var != null) {
            i3 = em1Var.hashCode();
        }
        return this.I.hashCode() + ((a + i3) * 31);
    }

    public final String toString() {
        String d = ckc.d(this.C);
        String i = zl1.i(this.F);
        String i2 = zl1.i(this.G);
        String a = vl0.a(3);
        StringBuilder x = nk2.x("GraphicsLayerElement(scaleX=", this.b, ", scaleY=", this.c, ", alpha=");
        s21.D(x, this.d, ", translationX=0.0, translationY=0.0, shadowElevation=", this.e, ", rotationX=0.0, rotationY=0.0, rotationZ=");
        x.append(this.f);
        x.append(", cameraDistance=8.0, transformOrigin=");
        x.append(d);
        x.append(", shape=");
        x.append(this.D);
        x.append(", clip=");
        x.append(this.E);
        x.append(", renderEffect=null, ambientShadowColor=");
        nk2.C(x, i, ", spotShadowColor=", i2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        x.append(a);
        x.append(", colorFilter=");
        x.append(this.H);
        x.append(", outsets=");
        x.append(this.I);
        x.append(")");
        return x.toString();
    }
}
