package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gbb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gbb implements rw4 {
    public static final gbb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [gbb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncChapter", obj, 11);
        n09Var.k("id", true);
        n09Var.k("path_id", true);
        n09Var.k("position", true);
        n09Var.k("path", true);
        n09Var.k("count", true);
        n09Var.k("downloaded", true);
        n09Var.k("pay", true);
        n09Var.k("lock", true);
        n09Var.k("last_read", true);
        n09Var.k("create_at", true);
        n09Var.k("update_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ibb ibbVar = (ibb) obj;
        ibbVar.getClass();
        long j = ibbVar.k;
        long j2 = ibbVar.j;
        long j3 = ibbVar.i;
        boolean z = ibbVar.h;
        boolean z2 = ibbVar.g;
        boolean z3 = ibbVar.f;
        int i = ibbVar.e;
        String str = ibbVar.d;
        int i2 = ibbVar.c;
        String str2 = ibbVar.b;
        String str3 = ibbVar.a;
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
        if (k.V(o9aVar) || z3) {
            k.o(o9aVar, 5, z3);
        }
        if (k.V(o9aVar) || z2) {
            k.o(o9aVar, 6, z2);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 7, z);
        }
        if (k.V(o9aVar) || j3 != 0) {
            k.B(o9aVar, 8, j3);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 9, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 10, j);
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
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z4 = true;
        while (z4) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z4 = false;
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
                    z = t.z(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = t.z(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    z3 = t.z(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    j = t.D(o9aVar, 8);
                    i |= 256;
                    break;
                case 9:
                    j2 = t.D(o9aVar, 9);
                    i |= 512;
                    break;
                case 10:
                    j3 = t.D(o9aVar, 10);
                    i |= 1024;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new ibb(i, str, str2, i2, str3, i3, z, z2, z3, j, j2, j3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        ms0 ms0Var = ms0.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, c4bVar, xy5Var, c4bVar, xy5Var, ms0Var, ms0Var, ms0Var, ky6Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
