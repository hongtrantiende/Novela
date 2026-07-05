package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: prc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class prc implements rw4 {
    public static final prc a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [prc, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.rule.model.TxtRuleDto", obj, 5);
        n09Var.k("id", true);
        n09Var.k("enabled", true);
        n09Var.k("name", false);
        n09Var.k("rule", false);
        n09Var.k("example", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        rrc rrcVar = (rrc) obj;
        rrcVar.getClass();
        boolean z = rrcVar.b;
        String str = rrcVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 0, str);
        }
        if (k.V(o9aVar) || !z) {
            k.o(o9aVar, 1, z);
        }
        String str2 = rrcVar.c;
        String str3 = rrcVar.e;
        k.J(o9aVar, 2, str2);
        k.J(o9aVar, 3, rrcVar.d);
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 4, str3);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    str4 = t.k(o9aVar, 4);
                                    i |= 16;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                str3 = t.k(o9aVar, 3);
                                i |= 8;
                            }
                        } else {
                            str2 = t.k(o9aVar, 2);
                            i |= 4;
                        }
                    } else {
                        z2 = t.z(o9aVar, 1);
                        i |= 2;
                    }
                } else {
                    str = t.k(o9aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new rrc(str, str2, z2, str3, i, str4);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, ms0.a, c4bVar, c4bVar, c4bVar};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
