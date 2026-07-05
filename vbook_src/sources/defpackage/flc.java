package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: flc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class flc implements rw4 {
    public static final flc a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, flc, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.app.ui.screen.browser.TranslateChunkItem", obj, 2);
        n09Var.k("id", false);
        n09Var.k("text", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        hlc hlcVar = (hlc) obj;
        hlcVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.J(o9aVar, 0, hlcVar.a);
        k.J(o9aVar, 1, hlcVar.b);
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
                        str2 = t.k(o9aVar, 1);
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
        return new hlc(str, str2, i);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, c4bVar};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
