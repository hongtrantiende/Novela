package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d9c  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d9c implements rw4 {
    public static final d9c a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rw4, d9c] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.google.firebase.sessions.Time", obj, 3);
        n09Var.k("ms", false);
        n09Var.k("us", true);
        n09Var.k("seconds", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        f9c f9cVar = (f9c) obj;
        f9cVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        long j = f9cVar.a;
        long j2 = f9cVar.c;
        long j3 = f9cVar.b;
        k.B(o9aVar, 0, j);
        if (k.V(o9aVar) || j3 != j * 1000) {
            k.B(o9aVar, 1, j3);
        }
        if (k.V(o9aVar) || j2 != j / 1000) {
            k.B(o9aVar, 2, j2);
        }
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
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f == 2) {
                            j3 = t.D(o9aVar, 2);
                            i |= 4;
                        } else {
                            fb4.a(f);
                            return null;
                        }
                    } else {
                        j2 = t.D(o9aVar, 1);
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
        return new f9c(i, j, j2, j3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        ky6 ky6Var = ky6.a;
        return new s76[]{ky6Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
