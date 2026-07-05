package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xaa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xaa implements rw4 {
    public static final xaa a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [xaa, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.google.firebase.sessions.SessionDetails", obj, 4);
        n09Var.k("sessionId", false);
        n09Var.k("firstSessionId", false);
        n09Var.k("sessionIndex", false);
        n09Var.k("sessionStartTimestampUs", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        zaa zaaVar = (zaa) obj;
        zaaVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.J(o9aVar, 0, zaaVar.a);
        k.J(o9aVar, 1, zaaVar.b);
        k.z(2, zaaVar.c, o9aVar);
        k.B(o9aVar, 3, zaaVar.d);
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
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f == 3) {
                                j = t.D(o9aVar, 3);
                                i |= 8;
                            } else {
                                fb4.a(f);
                                return null;
                            }
                        } else {
                            i2 = t.r(o9aVar, 2);
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
        return new zaa(i, str, str2, i2, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, c4bVar, xy5.a, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
