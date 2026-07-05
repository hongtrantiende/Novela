package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h9c  reason: default package */
/* loaded from: classes3.dex */
public final class h9c implements s76 {
    public static final h9c a = new Object();
    public static final ye6 b = ipe.x(sk6.b, new a1c(7));

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        pj2 pj2Var = (pj2) obj;
        pj2Var.getClass();
        o9a e = e();
        jbe k = jbeVar.k(e);
        k.B(a.e(), 0, pj2Var.d);
        k.K(e);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a e = e();
        fx1 t = yq2Var.t(e);
        long j = 0;
        boolean z = false;
        while (true) {
            h9c h9cVar = a;
            int f = t.f(h9cVar.e());
            if (f != -1) {
                if (f == 0) {
                    j = t.D(h9cVar.e(), 0);
                    z = true;
                } else {
                    jbe.W(f);
                    throw null;
                }
            } else {
                t.n(e);
                if (z) {
                    return new pj2(j);
                }
                throw new tc7("nanoseconds", e().a());
            }
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        return (o9a) b.getValue();
    }
}
