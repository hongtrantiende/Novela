package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ca8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca8 implements rw4 {
    public static final ca8 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ca8, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.sync.impl.model.OldSyncDownload", obj, 8);
        n09Var.k("book_id", true);
        n09Var.k("name", true);
        n09Var.k("cover", true);
        n09Var.k("download_status", true);
        n09Var.k("downloaded", true);
        n09Var.k("chapter_count", true);
        n09Var.k("from_last_read", true);
        n09Var.k("timestamp", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ea8 ea8Var = (ea8) obj;
        ea8Var.getClass();
        long j = ea8Var.h;
        boolean z = ea8Var.g;
        int i = ea8Var.f;
        int i2 = ea8Var.e;
        int i3 = ea8Var.d;
        String str = ea8Var.c;
        String str2 = ea8Var.b;
        String str3 = ea8Var.a;
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
        if (k.V(o9aVar) || i3 != 0) {
            k.z(3, i3, o9aVar);
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(4, i2, o9aVar);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(5, i, o9aVar);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 6, z);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 7, j);
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
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
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
                    i2 = t.r(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = t.r(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i4 = t.r(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    z = t.z(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    j = t.D(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new ea8(i, str, str2, str3, i2, i3, i4, z, j);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, xy5Var, xy5Var, xy5Var, ms0.a, ky6.a};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
