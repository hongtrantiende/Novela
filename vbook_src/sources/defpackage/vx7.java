package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vx7  reason: default package */
/* loaded from: classes3.dex */
public final class vx7 implements s76 {
    public static final /* synthetic */ vx7 a = new Object();
    public static final q9a b;

    /* JADX WARN: Type inference failed for: r0v0, types: [vx7, java.lang.Object] */
    static {
        String g = cm9.a(wx7.class).g();
        g.getClass();
        o9a[] o9aVarArr = new o9a[0];
        if (!k4b.j0(g)) {
            hi1 hi1Var = new hi1(g);
            c4b c4bVar = c4b.a;
            y59 y59Var = c4b.b;
            hi1Var.a("prefix", y59Var);
            hi1Var.a("namespaceURI", y59Var);
            b = new q9a(g, a5b.f, hi1Var.c.size(), b00.D0(o9aVarArr), hi1Var);
            return;
        }
        vs.m("Blank serial names are prohibited");
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        wx7 wx7Var = (wx7) obj;
        wx7Var.getClass();
        q9a q9aVar = b;
        jbe k = jbeVar.k(q9aVar);
        k.J(q9aVar, 0, wx7Var.getPrefix());
        k.J(q9aVar, 1, wx7Var.getNamespaceURI());
        k.K(q9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        q9a q9aVar = b;
        fx1 t = yq2Var.t(q9aVar);
        String str = null;
        String str2 = null;
        for (int f = t.f(q9aVar); f != -1; f = t.f(q9aVar)) {
            if (f != 0) {
                if (f == 1) {
                    str2 = t.k(q9aVar, f);
                }
            } else {
                str = t.k(q9aVar, f);
            }
        }
        t.n(q9aVar);
        if (str != null) {
            if (str2 != null) {
                return new tod(str, str2);
            }
            c16.w("namespaceUri");
            throw null;
        }
        c16.w("prefix");
        throw null;
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
