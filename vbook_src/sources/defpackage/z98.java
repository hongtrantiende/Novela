package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z98  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class z98 implements rw4 {
    public static final z98 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [z98, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.OldSyncChapter", obj, 6);
        n09Var.k("id", true);
        n09Var.k("url", true);
        n09Var.k("name", true);
        n09Var.k("read", true);
        n09Var.k("downloaded", true);
        n09Var.k("name_trans", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ba8 ba8Var = (ba8) obj;
        ba8Var.getClass();
        String str = ba8Var.f;
        boolean z = ba8Var.e;
        boolean z2 = ba8Var.d;
        String str2 = ba8Var.c;
        String str3 = ba8Var.b;
        int i = ba8Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || i != 0) {
            k.z(0, i, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 1, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 2, str2);
        }
        if (k.V(o9aVar) || z2) {
            k.o(o9aVar, 3, z2);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 4, z);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 5, str);
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
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = t.r(o9aVar, 0);
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
                    z2 = t.z(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = t.z(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = t.k(o9aVar, 5);
                    i |= 32;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new ba8(i, i2, str, str2, z2, z3, str3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        ms0 ms0Var = ms0.a;
        return new s76[]{xy5.a, c4bVar, c4bVar, ms0Var, ms0Var, c4bVar};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
