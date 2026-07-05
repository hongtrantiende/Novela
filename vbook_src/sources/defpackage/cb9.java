package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cb9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb9 implements rw4 {
    public static final cb9 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, cb9, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.translate.engine.qt.model.QtDicDto", obj, 2);
        n09Var.k("path", false);
        n09Var.k("size", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        eb9 eb9Var = (eb9) obj;
        eb9Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.J(o9aVar, 0, eb9Var.a);
        k.z(1, eb9Var.b, o9aVar);
        k.K(o9aVar);
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
                        i2 = t.r(o9aVar, 1);
                        i |= 2;
                    } else {
                        fb4.a(f);
                        return null;
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
        return new eb9(i, str, i2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{c4b.a, xy5.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
