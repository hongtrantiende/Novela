package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zeb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zeb implements rw4 {
    public static final zeb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [zeb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncTTSWord", obj, 6);
        n09Var.k("id", true);
        n09Var.k("word", true);
        n09Var.k("replace", true);
        n09Var.k("ignore_case", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        bfb bfbVar = (bfb) obj;
        bfbVar.getClass();
        long j = bfbVar.f;
        long j2 = bfbVar.e;
        boolean z = bfbVar.d;
        String str = bfbVar.c;
        String str2 = bfbVar.b;
        String str3 = bfbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 0, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 1, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 2, str);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 3, z);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 4, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 5, j);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        boolean z2 = true;
        while (z2) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    str = t.k(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = t.k(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = t.k(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    z = t.z(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    j = t.D(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    j2 = t.D(o9aVar, 5);
                    i |= 32;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new bfb(i, j, j2, str, str2, str3, z);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, ms0.a, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
