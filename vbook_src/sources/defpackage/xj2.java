package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xj2  reason: default package */
/* loaded from: classes3.dex */
public final class xj2 implements s76 {
    public static final xj2 a = new Object();
    public static final ye6 b = ipe.x(sk6.b, new rj2(1));

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        lj2 lj2Var = (lj2) obj;
        lj2Var.getClass();
        o9a e = e();
        jbe k = jbeVar.k(e);
        k.z(0, lj2Var.d, a.e());
        k.K(e);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a e = e();
        fx1 t = yq2Var.t(e);
        boolean z = false;
        int i = 0;
        while (true) {
            xj2 xj2Var = a;
            int f = t.f(xj2Var.e());
            if (f != -1) {
                if (f == 0) {
                    i = t.r(xj2Var.e(), 0);
                    z = true;
                } else {
                    jbe.W(f);
                    throw null;
                }
            } else {
                t.n(e);
                if (z) {
                    return new lj2(i);
                }
                throw new tc7("days", e().a());
            }
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        return (o9a) b.getValue();
    }
}
