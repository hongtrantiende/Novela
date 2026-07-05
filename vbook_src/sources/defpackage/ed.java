package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ed  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ed implements rw4 {
    public static final ed a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rw4, ed] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.document.viewer.layout.core.anchor.Anchor", obj, 2);
        n09Var.k("pageIndex", false);
        n09Var.k("offsetFraction", false);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        gd gdVar = (gd) obj;
        gdVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        k.z(0, gdVar.a, o9aVar);
        k.v(o9aVar, 1, gdVar.b);
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        float f = nae.e;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int f2 = t.f(o9aVar);
            if (f2 != -1) {
                if (f2 != 0) {
                    if (f2 == 1) {
                        f = t.e(o9aVar, 1);
                        i |= 2;
                    } else {
                        fb4.a(f2);
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
        return new gd(f, i, i2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{xy5.a, zi4.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
