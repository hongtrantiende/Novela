package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: efb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class efb implements rw4 {
    public static final efb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [efb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncTocLink", obj, 7);
        n09Var.k("id", true);
        n09Var.k("title", true);
        n09Var.k("path", true);
        n09Var.k("parent_id", true);
        n09Var.k("position", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        gfb gfbVar = (gfb) obj;
        gfbVar.getClass();
        long j = gfbVar.g;
        long j2 = gfbVar.f;
        int i = gfbVar.e;
        String str = gfbVar.d;
        String str2 = gfbVar.c;
        Map map = gfbVar.b;
        String str3 = gfbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = gfb.h;
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 0, str3);
        }
        if (k.V(o9aVar) || !c16.i(map, ls3.a)) {
            k.F(o9aVar, 1, (s76) ye6VarArr[1].getValue(), map);
        }
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 2, c4b.a, str2);
        }
        if (k.V(o9aVar) || str != null) {
            k.E(o9aVar, 3, c4b.a, str);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(4, i, o9aVar);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 5, j2);
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
        ye6[] ye6VarArr = gfb.h;
        int i = 0;
        int i2 = 0;
        String str = null;
        Map map = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
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
                    map = (Map) t.q(o9aVar, 1, (s76) ye6VarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) t.x(o9aVar, 2, c4b.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) t.x(o9aVar, 3, c4b.a, str3);
                    i |= 8;
                    break;
                case 4:
                    i2 = t.r(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    j = t.D(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = t.D(o9aVar, 6);
                    i |= 64;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new gfb(i, str, map, str2, str3, i2, j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = gfb.h;
        c4b c4bVar = c4b.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, ye6VarArr[1].getValue(), wq9.H(c4bVar), wq9.H(c4bVar), xy5.a, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
