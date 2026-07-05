package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4 implements rw4 {
    public static final d4 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [d4, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("org.publicvalue.multiplatform.oidc.types.remote.AccessTokenResponse", obj, 8);
        n09Var.k("access_token", false);
        n09Var.k("token_type", true);
        n09Var.k("expires_in", true);
        n09Var.k("refresh_token", true);
        n09Var.k("refresh_token_expires_in", true);
        n09Var.k("id_token", true);
        n09Var.k("scope", true);
        n09Var.k("received_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        f4 f4Var = (f4) obj;
        f4Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        String str = f4Var.a;
        long j = f4Var.h;
        String str2 = f4Var.g;
        String str3 = f4Var.f;
        Integer num = f4Var.e;
        String str4 = f4Var.d;
        Integer num2 = f4Var.c;
        String str5 = f4Var.b;
        k.J(o9aVar, 0, str);
        if (k.V(o9aVar) || str5 != null) {
            k.E(o9aVar, 1, c4b.a, str5);
        }
        if (k.V(o9aVar) || num2 != null) {
            k.E(o9aVar, 2, xy5.a, num2);
        }
        if (k.V(o9aVar) || str4 != null) {
            k.E(o9aVar, 3, c4b.a, str4);
        }
        if (k.V(o9aVar) || num != null) {
            k.E(o9aVar, 4, xy5.a, num);
        }
        if (k.V(o9aVar) || str3 != null) {
            k.E(o9aVar, 5, c4b.a, str3);
        }
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 6, c4b.a, str2);
        }
        if (k.V(o9aVar) || j != by5.a.k().a) {
            k.B(o9aVar, 7, j);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = t.k(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) t.x(o9aVar, 1, c4b.a, str2);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) t.x(o9aVar, 2, xy5.a, num);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) t.x(o9aVar, 3, c4b.a, str3);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) t.x(o9aVar, 4, xy5.a, num2);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) t.x(o9aVar, 5, c4b.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) t.x(o9aVar, 6, c4b.a, str5);
                    i |= 64;
                    break;
                case 7:
                    j = t.D(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new f4(i, str, str2, num, str3, num2, str4, str5, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        s76 H = wq9.H(c4bVar);
        xy5 xy5Var = xy5.a;
        return new s76[]{c4bVar, H, wq9.H(xy5Var), wq9.H(c4bVar), wq9.H(xy5Var), wq9.H(c4bVar), wq9.H(c4bVar), ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
