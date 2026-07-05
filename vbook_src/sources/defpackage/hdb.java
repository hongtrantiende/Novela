package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hdb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hdb implements rw4 {
    public static final hdb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [hdb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncQtDictionary", obj, 6);
        n09Var.k("id", true);
        n09Var.k("name", true);
        n09Var.k("name_dictionary", true);
        n09Var.k("vp_dictionary", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        jdb jdbVar = (jdb) obj;
        jdbVar.getClass();
        long j = jdbVar.f;
        long j2 = jdbVar.e;
        String str = jdbVar.d;
        String str2 = jdbVar.c;
        String str3 = jdbVar.b;
        String str4 = jdbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str4, "")) {
            k.J(o9aVar, 0, str4);
        }
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 1, str3);
        }
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 2, c4b.a, str2);
        }
        if (k.V(o9aVar) || str != null) {
            k.E(o9aVar, 3, c4b.a, str);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 4, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 5, j);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        Object obj = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        String str4 = null;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = t.k(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = t.k(o9aVar, 1);
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
                    j = t.D(o9aVar, 4);
                    i |= 16;
                    continue;
                case 5:
                    j2 = t.D(o9aVar, 5);
                    i |= 32;
                    continue;
                default:
                    fb4.a(f);
                    return obj;
            }
            obj = null;
        }
        t.n(o9aVar);
        return new jdb(i, j, j2, str, str2, str3, str4);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        s76 H = wq9.H(c4bVar);
        s76 H2 = wq9.H(c4bVar);
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, c4bVar, H, H2, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
