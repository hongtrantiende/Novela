package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t98  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class t98 implements rw4 {
    public static final t98 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [t98, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.OldSyncBookmark", obj, 7);
        n09Var.k("id", true);
        n09Var.k("name", true);
        n09Var.k("content", true);
        n09Var.k("title", true);
        n09Var.k("chap_index", true);
        n09Var.k("position", true);
        n09Var.k("timestamp", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        v98 v98Var = (v98) obj;
        v98Var.getClass();
        long j = v98Var.g;
        float f = v98Var.f;
        int i = v98Var.e;
        String str = v98Var.d;
        String str2 = v98Var.c;
        String str3 = v98Var.b;
        long j2 = v98Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 0, j2);
        }
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 1, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 2, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 3, str);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(4, i, o9aVar);
        }
        if (k.V(o9aVar) || Float.compare(f, nae.e) != 0) {
            k.v(o9aVar, 5, f);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 6, j);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int i = 0;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        boolean z = true;
        while (z) {
            int f2 = t.f(o9aVar);
            switch (f2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    j = t.D(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str = t.k(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = t.k(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = t.k(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    i2 = t.r(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    f = t.e(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = t.D(o9aVar, 6);
                    i |= 64;
                    break;
                default:
                    fb4.a(f2);
                    return null;
            }
        }
        t.n(o9aVar);
        return new v98(i, j, str, str2, str3, i2, f, j2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        ky6 ky6Var = ky6.a;
        c4b c4bVar = c4b.a;
        return new s76[]{ky6Var, c4bVar, c4bVar, c4bVar, xy5.a, zi4.a, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
