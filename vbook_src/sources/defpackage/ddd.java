package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ddd  reason: default package */
/* loaded from: classes3.dex */
public final class ddd {
    public float a = 1.0f;
    public long b = 0;
    public final hm8 c = new hm8(new l27(l27.a()), r0f.J);
    public final h23 d = yae.q(new vm(this, 9));
    public final h23 e = yae.q(new imb(this, 18));

    public static rk9 a(rk9 rk9Var, rk9 rk9Var2) {
        return lpe.o(npe.n(0L, dna.e(Math.min((rk9Var2.c - rk9Var2.a) / (rk9Var.c - rk9Var.a), (rk9Var2.d - rk9Var2.b) / (rk9Var.d - rk9Var.b)), rk9Var.h())), rk9Var2);
    }

    public final float[] b() {
        return ((l27) this.c.getValue()).a;
    }

    public final void c(rk9 rk9Var, rk9 rk9Var2) {
        rk9Var.getClass();
        rk9 a = a(rk9Var, rk9Var2);
        float[] a2 = m27.a(b());
        float[] a3 = l27.a();
        m27.c(a3, rk9Var, a);
        l27.j(a2, a3);
        this.c.setValue(new l27(a2));
    }
}
