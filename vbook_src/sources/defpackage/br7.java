package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br7  reason: default package */
/* loaded from: classes3.dex */
public final class br7 implements s76 {
    public static final br7 a = new Object();
    public static final ye6 b = ipe.x(sk6.b, new rh7(22));

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        nj2 nj2Var = (nj2) obj;
        nj2Var.getClass();
        o9a e = e();
        jbe k = jbeVar.k(e);
        k.z(0, nj2Var.d, a.e());
        k.K(e);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a e = e();
        fx1 t = yq2Var.t(e);
        boolean z = false;
        int i = 0;
        while (true) {
            br7 br7Var = a;
            int f = t.f(br7Var.e());
            if (f != -1) {
                if (f == 0) {
                    i = t.r(br7Var.e(), 0);
                    z = true;
                } else {
                    jbe.W(f);
                    throw null;
                }
            } else {
                t.n(e);
                if (z) {
                    return new nj2(i);
                }
                throw new tc7("months", e().a());
            }
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        return (o9a) b.getValue();
    }
}
