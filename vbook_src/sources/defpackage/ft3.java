package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ft3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft3 implements rw4 {
    public static final ft3 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [ft3, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("org.publicvalue.multiplatform.oidc.Endpoints", obj, 5);
        n09Var.k("tokenEndpoint", true);
        n09Var.k("authorizationEndpoint", true);
        n09Var.k("userInfoEndpoint", true);
        n09Var.k("endSessionEndpoint", true);
        n09Var.k("revocationEndpoint", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ht3 ht3Var = (ht3) obj;
        ht3Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || ht3Var.a != null) {
            k.E(o9aVar, 0, c4b.a, ht3Var.a);
        }
        if (k.V(o9aVar) || ht3Var.b != null) {
            k.E(o9aVar, 1, c4b.a, ht3Var.b);
        }
        if (k.V(o9aVar) || ht3Var.c != null) {
            k.E(o9aVar, 2, c4b.a, ht3Var.c);
        }
        if (k.V(o9aVar) || ht3Var.d != null) {
            k.E(o9aVar, 3, c4b.a, ht3Var.d);
        }
        if (k.V(o9aVar) || ht3Var.e != null) {
            k.E(o9aVar, 4, c4b.a, ht3Var.e);
        }
        k.K(o9aVar);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [ht3, java.lang.Object] */
    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    str5 = (String) t.x(o9aVar, 4, c4b.a, str5);
                                    z2 |= true;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                str4 = (String) t.x(o9aVar, 3, c4b.a, str4);
                                z2 |= true;
                            }
                        } else {
                            str3 = (String) t.x(o9aVar, 2, c4b.a, str3);
                            z2 |= true;
                        }
                    } else {
                        str2 = (String) t.x(o9aVar, 1, c4b.a, str2);
                        z2 |= true;
                    }
                } else {
                    str = (String) t.x(o9aVar, 0, c4b.a, str);
                    z2 |= true;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        ?? obj = new Object();
        if (!(z2 & true)) {
            obj.a = null;
        } else {
            obj.a = str;
        }
        if (!(z2 & true)) {
            obj.b = null;
        } else {
            obj.b = str2;
        }
        if (!(z2 & true)) {
            obj.c = null;
        } else {
            obj.c = str3;
        }
        if (!(z2 & true)) {
            obj.d = null;
        } else {
            obj.d = str4;
        }
        if (!(z2 & true)) {
            obj.e = null;
            return obj;
        }
        obj.e = str5;
        return obj;
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
