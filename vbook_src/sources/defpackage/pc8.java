package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pc8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc8 implements rw4 {
    public static final pc8 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [pc8, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("org.publicvalue.multiplatform.oidc.OpenIdConnectClientConfig", obj, 9);
        n09Var.k("discoveryUri", true);
        n09Var.k("endpoints", true);
        n09Var.k("clientId", true);
        n09Var.k("clientSecret", true);
        n09Var.k("scope", true);
        n09Var.k("codeChallengeMethod", true);
        n09Var.k("redirectUri", true);
        n09Var.k("postLogoutRedirectUri", true);
        n09Var.k("disableNonce", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        rc8 rc8Var = (rc8) obj;
        rc8Var.getClass();
        boolean z = rc8Var.i;
        String str = rc8Var.h;
        String str2 = rc8Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = rc8.j;
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 0, c4b.a, str2);
        }
        if (k.V(o9aVar) || rc8Var.b != null) {
            k.E(o9aVar, 1, ft3.a, rc8Var.b);
        }
        if (k.V(o9aVar) || rc8Var.c != null) {
            k.E(o9aVar, 2, c4b.a, rc8Var.c);
        }
        if (k.V(o9aVar) || rc8Var.d != null) {
            k.E(o9aVar, 3, c4b.a, rc8Var.d);
        }
        if (k.V(o9aVar) || rc8Var.e != null) {
            k.E(o9aVar, 4, c4b.a, rc8Var.e);
        }
        if (k.V(o9aVar) || rc8Var.f != qk1.S256) {
            k.F(o9aVar, 5, (s76) ye6VarArr[5].getValue(), rc8Var.f);
        }
        if (k.V(o9aVar) || rc8Var.g != null) {
            k.E(o9aVar, 6, c4b.a, rc8Var.g);
        }
        if (k.V(o9aVar) || str != null) {
            k.E(o9aVar, 7, c4b.a, str);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 8, z);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = rc8.j;
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        ht3 ht3Var = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        qk1 qk1Var = null;
        String str6 = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) t.x(o9aVar, 0, c4b.a, str2);
                    i |= 1;
                    break;
                case 1:
                    ht3Var = (ht3) t.x(o9aVar, 1, ft3.a, ht3Var);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) t.x(o9aVar, 2, c4b.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) t.x(o9aVar, 3, c4b.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) t.x(o9aVar, 4, c4b.a, str5);
                    i |= 16;
                    break;
                case 5:
                    qk1Var = (qk1) t.q(o9aVar, 5, (s76) ye6VarArr[5].getValue(), qk1Var);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) t.x(o9aVar, 6, c4b.a, str6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) t.x(o9aVar, 7, c4b.a, str);
                    i |= Token.CASE;
                    break;
                case 8:
                    z2 = t.z(o9aVar, 8);
                    i |= 256;
                    break;
                default:
                    fb4.a(f);
                    return obj;
            }
            obj = null;
        }
        t.n(o9aVar);
        return new rc8(i, str2, ht3Var, str3, str4, str5, qk1Var, str6, str, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = rc8.j;
        c4b c4bVar = c4b.a;
        return new s76[]{wq9.H(c4bVar), wq9.H(ft3.a), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), ye6VarArr[5].getValue(), wq9.H(c4bVar), wq9.H(c4bVar), ms0.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
