package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qaa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qaa implements rw4 {
    public static final qaa a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [qaa, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        n09Var.k("sessionsEnabled", false);
        n09Var.k("sessionSamplingRate", false);
        n09Var.k("sessionTimeoutSeconds", false);
        n09Var.k("cacheDurationSeconds", false);
        n09Var.k("cacheUpdatedTimeSeconds", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        saa saaVar = (saa) obj;
        saaVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.E(o9aVar, 0, ms0.a, saaVar.a);
        k.E(o9aVar, 1, bf3.a, saaVar.b);
        xy5 xy5Var = xy5.a;
        k.E(o9aVar, 2, xy5Var, saaVar.c);
        k.E(o9aVar, 3, xy5Var, saaVar.d);
        k.E(o9aVar, 4, ky6.a, saaVar.e);
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
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    l = (Long) t.x(o9aVar, 4, ky6.a, l);
                                    i |= 16;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                num2 = (Integer) t.x(o9aVar, 3, xy5.a, num2);
                                i |= 8;
                            }
                        } else {
                            num = (Integer) t.x(o9aVar, 2, xy5.a, num);
                            i |= 4;
                        }
                    } else {
                        d = (Double) t.x(o9aVar, 1, bf3.a, d);
                        i |= 2;
                    }
                } else {
                    bool = (Boolean) t.x(o9aVar, 0, ms0.a, bool);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new saa(i, bool, d, num, num2, l);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        s76 H = wq9.H(ms0.a);
        s76 H2 = wq9.H(bf3.a);
        xy5 xy5Var = xy5.a;
        return new s76[]{H, H2, wq9.H(xy5Var), wq9.H(xy5Var), wq9.H(ky6.a)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
