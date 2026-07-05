package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ia8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia8 implements rw4 {
    public static final ia8 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [ia8, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.OldSyncExtensionSource", obj, 4);
        n09Var.k("id", true);
        n09Var.k("repository", true);
        n09Var.k("description", true);
        n09Var.k("author", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ka8 ka8Var = (ka8) obj;
        ka8Var.getClass();
        String str = ka8Var.d;
        String str2 = ka8Var.c;
        String str3 = ka8Var.b;
        long j = ka8Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 0, j);
        }
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 1, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 2, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 3, str);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f == 3) {
                                str3 = t.k(o9aVar, 3);
                                i |= 8;
                            } else {
                                fb4.a(f);
                                return null;
                            }
                        } else {
                            str2 = t.k(o9aVar, 2);
                            i |= 4;
                        }
                    } else {
                        str = t.k(o9aVar, 1);
                        i |= 2;
                    }
                } else {
                    j = t.D(o9aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new ka8(i, j, str, str2, str3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{ky6.a, c4bVar, c4bVar, c4bVar};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
