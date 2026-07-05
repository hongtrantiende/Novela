package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j69  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j69 implements rw4 {
    public static final j69 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j69, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.google.firebase.sessions.ProcessData", obj, 2);
        n09Var.k("pid", false);
        n09Var.k("uuid", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        l69 l69Var = (l69) obj;
        l69Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.z(0, l69Var.a, o9aVar);
        k.J(o9aVar, 1, l69Var.b);
        k.K(o9aVar);
    }

    @Override // defpackage.rw4
    public final s76[] b() {
        return r1d.c;
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f == 1) {
                        str = t.k(o9aVar, 1);
                        i |= 2;
                    } else {
                        fb4.a(f);
                        return null;
                    }
                } else {
                    i2 = t.r(o9aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new l69(i, i2, str);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{xy5.a, c4b.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
