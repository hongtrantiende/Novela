package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cb8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb8 implements rw4 {
    public static final cb8 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [cb8, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.OldSyncQtVietPhrase", obj, 5);
        n09Var.k("src", true);
        n09Var.k("dest", true);
        n09Var.k("type", true);
        n09Var.k("word_type", true);
        n09Var.k("timestamp", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        eb8 eb8Var = (eb8) obj;
        eb8Var.getClass();
        long j = eb8Var.e;
        int i = eb8Var.d;
        int i2 = eb8Var.c;
        String str = eb8Var.b;
        String str2 = eb8Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 0, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 1, str);
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(2, i2, o9aVar);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(3, i, o9aVar);
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
        int i3 = 0;
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
                            if (f != 3) {
                                if (f == 4) {
                                    j = t.D(o9aVar, 4);
                                    i |= 16;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                i3 = t.r(o9aVar, 3);
                                i |= 8;
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
        return new eb8(i, str, str2, i2, i3, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{c4bVar, c4bVar, xy5Var, xy5Var, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
