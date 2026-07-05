package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mz7  reason: default package */
/* loaded from: classes3.dex */
public final class mz7 implements s76 {
    public final q9a a = aze.l("androidx.navigation.runtime.NavKey", new o9a[0], new bo7(13));

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        lz7 lz7Var = (lz7) obj;
        q9a q9aVar = this.a;
        jbe k = jbeVar.k(q9aVar);
        k.J(q9aVar, 0, lz7Var.getClass().getName());
        gi1 a = cm9.a(lz7Var.getClass());
        s76 j = sze.j(a);
        if (j != null) {
            k.F(q9aVar, 1, j, lz7Var);
            k.K(q9aVar);
            return;
        }
        q1d.s(a);
        throw null;
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        q9a q9aVar = this.a;
        fx1 t = yq2Var.t(q9aVar);
        gi1 a = cm9.a(Class.forName(t.k(q9aVar, t.f(q9aVar))));
        s76 j = sze.j(a);
        if (j != null) {
            Object q = t.q(q9aVar, t.f(q9aVar), j, null);
            q.getClass();
            lz7 lz7Var = (lz7) q;
            t.n(q9aVar);
            return lz7Var;
        }
        q1d.s(a);
        throw null;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return this.a;
    }
}
