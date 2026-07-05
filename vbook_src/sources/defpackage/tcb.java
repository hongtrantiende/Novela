package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tcb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tcb implements rw4 {
    public static final tcb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [tcb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncInfo", obj, 6);
        n09Var.k("device_id", true);
        n09Var.k("device_name", true);
        n09Var.k("device_type", true);
        n09Var.k("app_version", true);
        n09Var.k("backup_version", true);
        n09Var.k("create_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        vcb vcbVar = (vcb) obj;
        vcbVar.getClass();
        long j = vcbVar.f;
        int i = vcbVar.e;
        String str = vcbVar.d;
        int i2 = vcbVar.c;
        String str2 = vcbVar.b;
        String str3 = vcbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 0, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 1, str2);
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(2, i2, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 3, str);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(4, i, o9aVar);
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
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
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
                    i2 = t.r(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = t.k(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = t.r(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    j = t.D(o9aVar, 5);
                    i |= 32;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new vcb(i, str, str2, i2, str3, i3, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{c4bVar, c4bVar, xy5Var, c4bVar, xy5Var, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
