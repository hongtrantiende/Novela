package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xhc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xhc implements rw4 {
    public static final xhc a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [xhc, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.app.ui.screen.community.TopicEditorRoute", obj, 2);
        n09Var.k("category", false);
        n09Var.k("topicId", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        zhc zhcVar = (zhc) obj;
        zhcVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        int i = zhcVar.a;
        Integer num = zhcVar.b;
        k.z(0, i, o9aVar);
        if (k.V(o9aVar) || num != null) {
            k.E(o9aVar, 1, xy5.a, num);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Integer num = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f == 1) {
                        num = (Integer) t.x(o9aVar, 1, xy5.a, num);
                        i |= 2;
                    } else {
                        fb4.a(f);
                        return null;
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
        return new zhc(i, i2, num);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        xy5 xy5Var = xy5.a;
        return new s76[]{xy5Var, wq9.H(xy5Var)};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
