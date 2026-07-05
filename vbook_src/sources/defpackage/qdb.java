package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qdb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qdb implements rw4 {
    public static final qdb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qdb, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncReadHistory", obj, 4);
        n09Var.k("id", true);
        n09Var.k("read_time", true);
        n09Var.k("listen_time", true);
        n09Var.k("create_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        sdb sdbVar = (sdb) obj;
        sdbVar.getClass();
        long j = sdbVar.d;
        long j2 = sdbVar.c;
        long j3 = sdbVar.b;
        String str = sdbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 0, str);
        }
        if (k.V(o9aVar) || j3 != 0) {
            k.B(o9aVar, 1, j3);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 2, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 3, j);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int i = 0;
        String str = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f == 3) {
                                j3 = t.D(o9aVar, 3);
                                i |= 8;
                            } else {
                                fb4.a(f);
                                return null;
                            }
                        } else {
                            j2 = t.D(o9aVar, 2);
                            i |= 4;
                        }
                    } else {
                        j = t.D(o9aVar, 1);
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
        return new sdb(i, str, j, j2, j3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        ky6 ky6Var = ky6.a;
        return new s76[]{c4b.a, ky6Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
