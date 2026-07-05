package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o33  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class o33 implements rw4 {
    public static final o33 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o33, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.app.ui.screen.detail.DetailRoute", obj, 2);
        n09Var.k("path", false);
        n09Var.k("extensionId", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        q33 q33Var = (q33) obj;
        q33Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        String str = q33Var.a;
        String str2 = q33Var.b;
        k.J(o9aVar, 0, str);
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 1, c4b.a, str2);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f == 1) {
                        str2 = (String) t.x(o9aVar, 1, c4b.a, str2);
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
        return new q33(str, str2, i);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, wq9.H(c4bVar)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
