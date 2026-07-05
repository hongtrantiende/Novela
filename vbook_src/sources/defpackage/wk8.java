package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wk8  reason: default package */
/* loaded from: classes.dex */
public final class wk8 extends uq7 {
    public final vk8 b;
    public final dc c;
    public final w22 d;
    public final float e;
    public final em1 f;

    public wk8(vk8 vk8Var, dc dcVar, w22 w22Var, float f, em1 em1Var) {
        this.b = vk8Var;
        this.c = dcVar;
        this.d = w22Var;
        this.e = f;
        this.f = em1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, xk8] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = true;
        mq7Var.M = this.c;
        mq7Var.N = this.d;
        mq7Var.O = this.e;
        mq7Var.P = this.f;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "painter");
        c00Var.b(Boolean.TRUE, "sizeToIntrinsics");
        c00Var.b(this.c, "alignment");
        c00Var.b(this.d, "contentScale");
        c00Var.b(Float.valueOf(this.e), "alpha");
        c00Var.b(this.f, "colorFilter");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        boolean z;
        xk8 xk8Var = (xk8) mq7Var;
        boolean z2 = xk8Var.L;
        vk8 vk8Var = this.b;
        if (z2 && dna.a(xk8Var.K.h(), vk8Var.h())) {
            z = false;
        } else {
            z = true;
        }
        xk8Var.K = vk8Var;
        xk8Var.L = true;
        xk8Var.M = this.c;
        xk8Var.N = this.d;
        xk8Var.O = this.e;
        xk8Var.P = this.f;
        if (z) {
            ube.y(xk8Var);
        }
        hud.o(xk8Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wk8) {
                wk8 wk8Var = (wk8) obj;
                if (!c16.i(this.b, wk8Var.b) || !c16.i(this.c, wk8Var.c) || !c16.i(this.d, wk8Var.d) || Float.compare(this.e, wk8Var.e) != 0 || !c16.i(this.f, wk8Var.f)) {
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
        int k = eub.k(this.b.hashCode() * 31, 31, true);
        int hashCode2 = this.d.hashCode();
        int d = nk2.d(this.e, (hashCode2 + ((this.c.hashCode() + k) * 31)) * 31, 31);
        em1 em1Var = this.f;
        if (em1Var == null) {
            hashCode = 0;
        } else {
            hashCode = em1Var.hashCode();
        }
        return d + hashCode;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=true, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ")";
    }
}
