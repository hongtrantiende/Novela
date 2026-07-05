package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb8 implements rw4 {
    public static final fb8 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fb8, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.OldSyncTrash", obj, 3);
        n09Var.k("find", true);
        n09Var.k("regex", true);
        n09Var.k("enable", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        hb8 hb8Var = (hb8) obj;
        hb8Var.getClass();
        boolean z = hb8Var.c;
        boolean z2 = hb8Var.b;
        String str = hb8Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 0, str);
        }
        if (k.V(o9aVar) || z2) {
            k.o(o9aVar, 1, z2);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 2, z);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f == 2) {
                            z3 = t.z(o9aVar, 2);
                            i |= 4;
                        } else {
                            fb4.a(f);
                            return null;
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
        return new hb8(i, str, z2, z3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        ms0 ms0Var = ms0.a;
        return new s76[]{c4b.a, ms0Var, ms0Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
