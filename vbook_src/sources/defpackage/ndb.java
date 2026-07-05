package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ndb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ndb implements rw4 {
    public static final ndb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ndb, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncQtWord", obj, 7);
        n09Var.k("id", true);
        n09Var.k("word", true);
        n09Var.k("trans", true);
        n09Var.k("type", true);
        n09Var.k("mode", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        pdb pdbVar = (pdb) obj;
        pdbVar.getClass();
        long j = pdbVar.g;
        long j2 = pdbVar.f;
        int i = pdbVar.e;
        int i2 = pdbVar.d;
        String str = pdbVar.c;
        String str2 = pdbVar.b;
        String str3 = pdbVar.a;
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
        if (k.V(o9aVar) || i2 != 0) {
            k.z(3, i2, o9aVar);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(4, i, o9aVar);
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
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
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
                    i3 = t.r(o9aVar, 4);
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
        return new pdb(i, str, str2, str3, i2, i3, j, j2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, xy5Var, xy5Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
