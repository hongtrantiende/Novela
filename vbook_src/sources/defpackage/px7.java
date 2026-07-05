package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: px7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class px7 implements rw4 {
    public static final px7 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, px7, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.word.model.NameWordDto", obj, 3);
        n09Var.k("word", false);
        n09Var.k("replace", false);
        n09Var.k("ignoreCase", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        rx7 rx7Var = (rx7) obj;
        rx7Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.J(o9aVar, 0, rx7Var.a);
        k.J(o9aVar, 1, rx7Var.b);
        k.o(o9aVar, 2, rx7Var.c);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f == 2) {
                            z2 = t.z(o9aVar, 2);
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
        return new rx7(i, str, str2, z2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        return new s76[]{c4bVar, c4bVar, ms0.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
