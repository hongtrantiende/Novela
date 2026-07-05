package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ddb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ddb implements rw4 {
    public static final ddb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [ddb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncNotification", obj, 5);
        n09Var.k("id", true);
        n09Var.k("type", true);
        n09Var.k("content", true);
        n09Var.k("read", true);
        n09Var.k("create_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        fdb fdbVar = (fdb) obj;
        fdbVar.getClass();
        long j = fdbVar.e;
        boolean z = fdbVar.d;
        String str = fdbVar.c;
        int i = fdbVar.b;
        String str2 = fdbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 0, str2);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(1, i, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 2, str);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 3, z);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 4, j);
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
        long j = 0;
        boolean z2 = true;
        while (z2) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    j = t.D(o9aVar, 4);
                                    i |= 16;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                z = t.z(o9aVar, 3);
                                i |= 8;
                            }
                        } else {
                            str2 = t.k(o9aVar, 2);
                            i |= 4;
                        }
                    } else {
                        i2 = t.r(o9aVar, 1);
                        i |= 2;
                    }
                } else {
                    str = t.k(o9aVar, 0);
                    i |= 1;
                }
            } else {
                z2 = false;
            }
        }
        t.n(o9aVar);
        return new fdb(i, str, i2, str2, z, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, xy5.a, c4bVar, ms0.a, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
