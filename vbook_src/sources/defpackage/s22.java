package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s22  reason: default package */
/* loaded from: classes.dex */
public final class s22 extends uq7 {
    public final q10 C;
    public final jp5 b;
    public final io5 c;
    public final g10 d;
    public final dc e;
    public final w22 f;

    public s22(jp5 jp5Var, io5 io5Var, g10 g10Var, dc dcVar, w22 w22Var, q10 q10Var) {
        this.b = jp5Var;
        this.c = io5Var;
        this.d = g10Var;
        this.e = dcVar;
        this.f = w22Var;
        this.C = q10Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        g10 g10Var = this.d;
        io5 io5Var = this.c;
        jp5 jp5Var = this.b;
        h10 h10Var = new h10(io5Var, jp5Var, g10Var);
        n10 n10Var = new n10(h10Var);
        n10Var.I = n10.R;
        a12 a12Var = null;
        n10Var.J = null;
        w22 w22Var = this.f;
        n10Var.K = w22Var;
        n10Var.L = 1;
        n10Var.M = this.C;
        n10Var.n(h10Var);
        una unaVar = jp5Var.o;
        if (unaVar instanceof a12) {
            a12Var = (a12) unaVar;
        }
        return new t22(n10Var, this.e, w22Var, a12Var);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "request");
        c00Var.b(this.c, "imageLoader");
        c00Var.b(this.d, "modelEqualityDelegate");
        c00Var.b(n10.R, "transform");
        c00Var.b(null, "onState");
        c00Var.b(new Object(), "filterQuality");
        c00Var.b(this.e, "alignment");
        c00Var.b(this.f, "contentScale");
        c00Var.b(Float.valueOf(1.0f), "alpha");
        c00Var.b(null, "colorFilter");
        c00Var.b(Boolean.TRUE, "clipToBounds");
        c00Var.b(this.C, "previewHandler");
        c00Var.b(null, "contentDescription");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        t22 t22Var = (t22) mq7Var;
        long h = t22Var.P.h();
        a12 a12Var = t22Var.O;
        g10 g10Var = this.d;
        io5 io5Var = this.c;
        jp5 jp5Var = this.b;
        h10 h10Var = new h10(io5Var, jp5Var, g10Var);
        n10 n10Var = t22Var.P;
        n10Var.I = n10.R;
        a12 a12Var2 = null;
        n10Var.J = null;
        w22 w22Var = this.f;
        n10Var.K = w22Var;
        n10Var.L = 1;
        n10Var.M = this.C;
        n10Var.n(h10Var);
        boolean a = dna.a(h, n10Var.h());
        t22Var.K = this.e;
        una unaVar = jp5Var.o;
        if (unaVar instanceof a12) {
            a12Var2 = (a12) unaVar;
        }
        t22Var.O = a12Var2;
        t22Var.L = w22Var;
        t22Var.M = 1.0f;
        t22Var.N = true;
        boolean i = c16.i(a12Var, t22Var.O);
        if (!a || !i) {
            ube.y(t22Var);
        }
        hud.o(t22Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s22) {
                s22 s22Var = (s22) obj;
                if (!this.b.equals(s22Var.b) || !c16.i(this.c, s22Var.c) || !c16.i(this.d, s22Var.d) || !c16.i(this.e, s22Var.e) || !this.f.equals(s22Var.f) || Float.compare(1.0f, 1.0f) != 0 || !c16.i(this.C, s22Var.C)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int a = hl5.a(1, (n10.R.hashCode() + ((hashCode3 + ((hashCode2 + (this.b.hashCode() * 31)) * 31)) * 31)) * 961, 31);
        int k = eub.k(nk2.d(1.0f, (this.f.hashCode() + ((this.e.hashCode() + a) * 31)) * 31, 961), 31, true);
        q10 q10Var = this.C;
        if (q10Var == null) {
            hashCode = 0;
        } else {
            hashCode = q10Var.hashCode();
        }
        return (k + hashCode) * 31;
    }

    public final String toString() {
        String a = cf4.a(1);
        return "ContentPainterElement(request=" + this.b + ", imageLoader=" + this.c + ", modelEqualityDelegate=" + this.d + ", transform=" + n10.R + ", onState=null, filterQuality=" + a + ", alignment=" + this.e + ", contentScale=" + this.f + ", alpha=1.0, colorFilter=null, clipToBounds=true, previewHandler=" + this.C + ", contentDescription=null)";
    }
}
