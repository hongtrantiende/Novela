package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p66  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class p66 implements rw4 {
    public static final p66 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [p66, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("org.publicvalue.multiplatform.oidc.types.JwtHeader", obj, 11);
        n09Var.k("alg", false);
        n09Var.k("jku", false);
        n09Var.k("jwk", false);
        n09Var.k("kid", false);
        n09Var.k("x5u", false);
        n09Var.k("x5c", false);
        n09Var.k("x5t", false);
        n09Var.k("x5t#S256", false);
        n09Var.k("typ", false);
        n09Var.k("cty", false);
        n09Var.k("crit", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        r66 r66Var = (r66) obj;
        r66Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.J(o9aVar, 0, r66Var.a);
        c4b c4bVar = c4b.a;
        k.E(o9aVar, 1, c4bVar, r66Var.b);
        k.E(o9aVar, 2, c4bVar, r66Var.c);
        k.E(o9aVar, 3, c4bVar, r66Var.d);
        k.E(o9aVar, 4, c4bVar, r66Var.e);
        k.E(o9aVar, 5, c4bVar, r66Var.f);
        k.E(o9aVar, 6, c4bVar, r66Var.g);
        k.E(o9aVar, 7, c4bVar, r66Var.h);
        k.E(o9aVar, 8, c4bVar, r66Var.i);
        k.E(o9aVar, 9, c4bVar, r66Var.j);
        k.E(o9aVar, 10, c4bVar, r66Var.k);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        boolean z;
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        String str = null;
        String str2 = null;
        boolean z2 = true;
        String str3 = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (z2) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    str4 = t.k(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    str5 = (String) t.x(o9aVar, 1, c4b.a, str5);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    str6 = (String) t.x(o9aVar, 2, c4b.a, str6);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    str7 = (String) t.x(o9aVar, 3, c4b.a, str7);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    str8 = (String) t.x(o9aVar, 4, c4b.a, str8);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    str9 = (String) t.x(o9aVar, 5, c4b.a, str9);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    str10 = (String) t.x(o9aVar, 6, c4b.a, str10);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    str11 = (String) t.x(o9aVar, 7, c4b.a, str11);
                    i |= Token.CASE;
                    break;
                case 8:
                    z = z2;
                    str3 = (String) t.x(o9aVar, 8, c4b.a, str3);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    str2 = (String) t.x(o9aVar, 9, c4b.a, str2);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    str = (String) t.x(o9aVar, 10, c4b.a, str);
                    i |= 1024;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
            z2 = z;
        }
        t.n(o9aVar);
        return new r66(i, str4, str5, str6, str7, str8, str9, str10, str11, str3, str2, str);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
