package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jbb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jbb implements rw4 {
    public static final jbb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jbb, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncContent", obj, 5);
        n09Var.k("id", true);
        n09Var.k("position", true);
        n09Var.k("content", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        lbb lbbVar = (lbb) obj;
        lbbVar.getClass();
        long j = lbbVar.e;
        long j2 = lbbVar.d;
        Map map = lbbVar.c;
        int i = lbbVar.b;
        String str = lbbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = lbb.f;
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 0, str);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(1, i, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(map, ls3.a)) {
            k.F(o9aVar, 2, (s76) ye6VarArr[2].getValue(), map);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 3, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 4, j);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = lbb.f;
        int i = 0;
        int i2 = 0;
        String str = null;
        Map map = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f == 4) {
                                    j2 = t.D(o9aVar, 4);
                                    i |= 16;
                                } else {
                                    fb4.a(f);
                                    return null;
                                }
                            } else {
                                j = t.D(o9aVar, 3);
                                i |= 8;
                            }
                        } else {
                            map = (Map) t.q(o9aVar, 2, (s76) ye6VarArr[2].getValue(), map);
                            i |= 4;
                        }
                    } else {
                        i2 = t.r(o9aVar, 1);
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
        return new lbb(i, str, i2, map, j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = lbb.f;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4b.a, xy5.a, ye6VarArr[2].getValue(), ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
