package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d64  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class d64 implements rw4 {
    public static final d64 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [d64, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.app.ui.screen.extension.ExtensionRepoRoute", obj, 1);
        n09Var.k("isShowAdd", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        f64 f64Var = (f64) obj;
        f64Var.getClass();
        boolean z = f64Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 0, z);
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
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f == 0) {
                    z2 = t.z(o9aVar, 0);
                    i = 1;
                } else {
                    fb4.a(f);
                    return null;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new f64(i, z2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{ms0.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
