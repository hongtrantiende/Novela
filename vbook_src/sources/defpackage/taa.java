package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: taa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class taa implements rw4 {
    public static final taa a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [taa, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.google.firebase.sessions.SessionData", obj, 3);
        n09Var.k("sessionDetails", false);
        n09Var.k("backgroundTime", true);
        n09Var.k("processDataMap", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        vaa vaaVar = (vaa) obj;
        vaaVar.getClass();
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = vaa.d;
        xaa xaaVar = xaa.a;
        zaa zaaVar = vaaVar.a;
        Map map = vaaVar.c;
        f9c f9cVar = vaaVar.b;
        k.F(o9aVar, 0, xaaVar, zaaVar);
        if (k.V(o9aVar) || f9cVar != null) {
            k.E(o9aVar, 1, d9c.a, f9cVar);
        }
        if (k.V(o9aVar) || map != null) {
            k.E(o9aVar, 2, (s76) ye6VarArr[2].getValue(), map);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.rw4
    public final s76[] b() {
        return r1d.c;
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = vaa.d;
        boolean z = true;
        int i = 0;
        zaa zaaVar = null;
        f9c f9cVar = null;
        Map map = null;
        while (z) {
            int f = t.f(o9aVar);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f == 2) {
                            map = (Map) t.x(o9aVar, 2, (s76) ye6VarArr[2].getValue(), map);
                            i |= 4;
                        } else {
                            fb4.a(f);
                            return null;
                        }
                    } else {
                        f9cVar = (f9c) t.x(o9aVar, 1, d9c.a, f9cVar);
                        i |= 2;
                    }
                } else {
                    zaaVar = (zaa) t.q(o9aVar, 0, xaa.a, zaaVar);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        t.n(o9aVar);
        return new vaa(i, zaaVar, f9cVar, map);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        return new s76[]{xaa.a, wq9.H(d9c.a), wq9.H((s76) vaa.d[2].getValue())};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
