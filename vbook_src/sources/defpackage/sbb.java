package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sbb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sbb implements rw4 {
    public static final sbb a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [sbb, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.SyncDownload", obj, 12);
        n09Var.k("id", true);
        n09Var.k("book_id", true);
        n09Var.k("title", true);
        n09Var.k("image", true);
        n09Var.k("path", true);
        n09Var.k("start", true);
        n09Var.k("end", true);
        n09Var.k("downloaded", true);
        n09Var.k("total", true);
        n09Var.k("type", true);
        n09Var.k("status", true);
        n09Var.k("create_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        long j;
        ubb ubbVar = (ubb) obj;
        ubbVar.getClass();
        long j2 = ubbVar.l;
        int i = ubbVar.k;
        int i2 = ubbVar.j;
        int i3 = ubbVar.i;
        int i4 = ubbVar.h;
        int i5 = ubbVar.g;
        int i6 = ubbVar.f;
        String str = ubbVar.e;
        String str2 = ubbVar.d;
        String str3 = ubbVar.c;
        String str4 = ubbVar.b;
        String str5 = ubbVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || !c16.i(str5, "")) {
            j = j2;
            k.J(o9aVar, 0, str5);
        } else {
            j = j2;
        }
        if (k.V(o9aVar) || !c16.i(str4, "")) {
            k.J(o9aVar, 1, str4);
        }
        if (k.V(o9aVar) || !c16.i(str3, "")) {
            k.J(o9aVar, 2, str3);
        }
        if (k.V(o9aVar) || !c16.i(str2, "")) {
            k.J(o9aVar, 3, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 4, str);
        }
        if (k.V(o9aVar) || i6 != 0) {
            k.z(5, i6, o9aVar);
        }
        if (k.V(o9aVar) || i5 != 0) {
            k.z(6, i5, o9aVar);
        }
        if (k.V(o9aVar) || i4 != 0) {
            k.z(7, i4, o9aVar);
        }
        if (k.V(o9aVar) || i3 != 0) {
            k.z(8, i3, o9aVar);
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(9, i2, o9aVar);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(10, i, o9aVar);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 11, j);
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
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    str3 = t.k(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = t.k(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = t.k(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = t.r(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i3 = t.r(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    i4 = t.r(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    i5 = t.r(o9aVar, 8);
                    i |= 256;
                    break;
                case 9:
                    i6 = t.r(o9aVar, 9);
                    i |= 512;
                    break;
                case 10:
                    i7 = t.r(o9aVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    j = t.D(o9aVar, 11);
                    i |= 2048;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new ubb(i, str, str2, str3, str4, str5, i2, i3, i4, i5, i6, i7, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, c4bVar, c4bVar, xy5Var, xy5Var, xy5Var, xy5Var, xy5Var, xy5Var, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
