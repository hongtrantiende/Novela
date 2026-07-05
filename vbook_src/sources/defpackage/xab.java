package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xab  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xab implements rw4 {
    public static final xab a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [xab, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncBookmark", obj, 10);
        n09Var.k("id", true);
        n09Var.k("chapter_index", true);
        n09Var.k("chapter_name", true);
        n09Var.k("type", true);
        n09Var.k("content", true);
        n09Var.k("description", true);
        n09Var.k("color", true);
        n09Var.k("start_position", true);
        n09Var.k("end_position", true);
        n09Var.k("create_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        long j;
        zab zabVar = (zab) obj;
        zabVar.getClass();
        long j2 = zabVar.j;
        long j3 = zabVar.i;
        long j4 = zabVar.h;
        String str = zabVar.g;
        String str2 = zabVar.f;
        String str3 = zabVar.e;
        int i = zabVar.d;
        String str4 = zabVar.c;
        int i2 = zabVar.b;
        String str5 = zabVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str5, "")) {
            j = j2;
            k.J(o9aVar, 0, str5);
        } else {
            j = j2;
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(1, i2, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str4, "")) {
            k.J(o9aVar, 2, str4);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(3, i, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 4, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 5, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 6, str);
        }
        if (k.V(o9aVar) || j4 != 0) {
            k.B(o9aVar, 7, j4);
        }
        if (k.V(o9aVar) || j3 != 0) {
            k.B(o9aVar, 8, j3);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 9, j);
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
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
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
                    i2 = t.r(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = t.k(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    i3 = t.r(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = t.k(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = t.k(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = t.k(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    j = t.D(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    j2 = t.D(o9aVar, 8);
                    i |= 256;
                    break;
                case 9:
                    j3 = t.D(o9aVar, 9);
                    i |= 512;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new zab(i, str, i2, str2, i3, str3, str4, str5, j, j2, j3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{c4bVar, xy5Var, c4bVar, xy5Var, c4bVar, c4bVar, c4bVar, ky6Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
