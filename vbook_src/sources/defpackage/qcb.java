package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qcb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qcb implements rw4 {
    public static final qcb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qcb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncExtensionSource", obj, 5);
        n09Var.k("id", true);
        n09Var.k("path", true);
        n09Var.k("author", true);
        n09Var.k("description", true);
        n09Var.k("create_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        scb scbVar = (scb) obj;
        scbVar.getClass();
        long j = scbVar.e;
        String str = scbVar.d;
        String str2 = scbVar.c;
        String str3 = scbVar.b;
        String str4 = scbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str4, "")) {
            k.J(o9aVar, 0, str4);
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
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        boolean z = true;
        while (z) {
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
                                str4 = t.k(o9aVar, 3);
                                i |= 8;
                            }
                        } else {
                            str3 = t.k(o9aVar, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = t.k(o9aVar, 1);
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
        return new scb(i, str, str2, str3, str4, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, c4bVar, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
