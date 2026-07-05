package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ow3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ow3 implements rw4 {
    public static final ow3 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ow3, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("org.publicvalue.multiplatform.oidc.types.remote.ErrorResponse", obj, 4);
        n09Var.k("error", false);
        n09Var.k("error_description", false);
        n09Var.k("error_uri", false);
        n09Var.k("state", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        sw3 sw3Var = (sw3) obj;
        sw3Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.F(o9aVar, 0, (s76) sw3.e[0].getValue(), sw3Var.a);
        c4b c4bVar = c4b.a;
        k.E(o9aVar, 1, c4bVar, sw3Var.b);
        k.E(o9aVar, 2, c4bVar, sw3Var.c);
        k.E(o9aVar, 3, c4bVar, sw3Var.d);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = sw3.e;
        boolean z = true;
        int i = 0;
        rw3 rw3Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f == 3) {
                                str3 = (String) t.x(o9aVar, 3, c4b.a, str3);
                                i |= 8;
                            } else {
                                fb4.a(f);
                                return null;
                            }
                        } else {
                            str2 = (String) t.x(o9aVar, 2, c4b.a, str2);
                            i |= 4;
                        }
                    } else {
                        str = (String) t.x(o9aVar, 1, c4b.a, str);
                        i |= 2;
                    }
                } else {
                    rw3Var = (rw3) t.q(o9aVar, 0, (s76) ye6VarArr[0].getValue(), rw3Var);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new sw3(i, rw3Var, str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{sw3.e[0].getValue(), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
