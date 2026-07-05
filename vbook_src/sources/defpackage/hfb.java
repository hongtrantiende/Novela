package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hfb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hfb implements rw4 {
    public static final hfb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [hfb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncTrash", obj, 7);
        n09Var.k("id", true);
        n09Var.k("book_id", true);
        n09Var.k("word", true);
        n09Var.k("type", true);
        n09Var.k("regex", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        jfb jfbVar = (jfb) obj;
        jfbVar.getClass();
        long j = jfbVar.g;
        long j2 = jfbVar.f;
        boolean z = jfbVar.e;
        int i = jfbVar.d;
        String str = jfbVar.c;
        String str2 = jfbVar.b;
        String str3 = jfbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 0, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 1, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 2, str);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(3, i, o9aVar);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 4, z);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 5, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 6, j);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        boolean z2 = true;
        while (z2) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    str = t.k(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = t.k(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = t.k(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = t.r(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z = t.z(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    j = t.D(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = t.D(o9aVar, 6);
                    i |= 64;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new jfb(i, str, str2, str3, i2, z, j, j2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, xy5.a, ms0.a, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
