package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: up1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class up1 implements rw4 {
    public static final up1 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [up1, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.app.ui.screen.community.CommentEditorRoute", obj, 5);
        n09Var.k("topicId", false);
        n09Var.k("category", false);
        n09Var.k("postId", true);
        n09Var.k("quoteId", true);
        n09Var.k("initialContentHtml", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        wp1 wp1Var = (wp1) obj;
        wp1Var.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        int i = wp1Var.a;
        String str = wp1Var.e;
        long j = wp1Var.d;
        long j2 = wp1Var.c;
        k.z(0, i, o9aVar);
        k.z(1, wp1Var.b, o9aVar);
        if (k.V(o9aVar) || j2 != -1) {
            k.B(o9aVar, 2, j2);
        }
        if (k.V(o9aVar) || j != -1) {
            k.B(o9aVar, 3, j);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 4, str);
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
        long j = 0;
        long j2 = 0;
        String str = null;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    str = t.k(o9aVar, 4);
                                    i |= 16;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                j2 = t.D(o9aVar, 3);
                                i |= 8;
                            }
                        } else {
                            j = t.D(o9aVar, 2);
                            i |= 4;
                        }
                    } else {
                        i3 = t.r(o9aVar, 1);
                        i |= 2;
                    }
                } else {
                    i2 = t.r(o9aVar, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new wp1(i, i2, i3, j, j2, str);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        xy5 xy5Var = xy5.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{xy5Var, xy5Var, ky6Var, ky6Var, c4b.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
