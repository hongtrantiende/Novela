package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bp0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements rw4 {
    public static final bp0 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [bp0, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.app.ui.screen.list.BookListRoute", obj, 3);
        n09Var.k("extensionId", false);
        n09Var.k("name", false);
        n09Var.k("data", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        dp0 dp0Var = (dp0) obj;
        dp0Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.J(o9aVar, 0, dp0Var.a);
        k.J(o9aVar, 1, dp0Var.b);
        k.J(o9aVar, 2, dp0Var.c);
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
        String str3 = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f == 2) {
                            str3 = t.k(o9aVar, 2);
                            i |= 4;
                        } else {
                            fb4.a(f);
                            return null;
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
        return new dp0(str, str2, i, str3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, c4bVar, c4bVar};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
