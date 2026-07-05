package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w60  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class w60 implements rw4 {
    public static final w60 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [w60, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("org.publicvalue.multiplatform.oidc.types.AuthCodeRequest", obj, 5);
        n09Var.k("url", false);
        n09Var.k("config", false);
        n09Var.k("pkce", false);
        n09Var.k("state", false);
        n09Var.k("nonce", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        y60 y60Var = (y60) obj;
        y60Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.F(o9aVar, 0, azc.a, y60Var.a);
        k.F(o9aVar, 1, pc8.a, y60Var.b);
        k.F(o9aVar, 2, iw8.a, y60Var.c);
        k.J(o9aVar, 3, y60Var.d);
        k.E(o9aVar, 4, c4b.a, y60Var.e);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        vyc vycVar = null;
        rc8 rc8Var = null;
        kw8 kw8Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    str2 = (String) t.x(o9aVar, 4, c4b.a, str2);
                                    i |= 16;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                str = t.k(o9aVar, 3);
                                i |= 8;
                            }
                        } else {
                            kw8Var = (kw8) t.q(o9aVar, 2, iw8.a, kw8Var);
                            i |= 4;
                        }
                    } else {
                        rc8Var = (rc8) t.q(o9aVar, 1, pc8.a, rc8Var);
                        i |= 2;
                    }
                } else {
                    vycVar = (vyc) t.q(o9aVar, 0, azc.a, vycVar);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new y60(i, vycVar, rc8Var, kw8Var, str, str2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{azc.a, pc8.a, iw8.a, c4bVar, wq9.H(c4bVar)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
