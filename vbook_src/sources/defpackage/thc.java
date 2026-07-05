package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: thc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class thc implements rw4 {
    public static final thc a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, thc, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.community.api.dto.TopicDto", obj, 15);
        n09Var.k("id", true);
        n09Var.k("title", true);
        n09Var.k("content", true);
        n09Var.k("background", true);
        n09Var.k("category", true);
        n09Var.k("type", true);
        n09Var.k("user", true);
        n09Var.k("status", true);
        n09Var.k("tag", true);
        n09Var.k("likes", true);
        n09Var.k("liked", true);
        n09Var.k("pined", true);
        n09Var.k("comments", true);
        n09Var.k("updated_at", true);
        n09Var.k("created_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        vhc vhcVar = (vhc) obj;
        vhcVar.getClass();
        long j = vhcVar.o;
        long j2 = vhcVar.n;
        int i = vhcVar.m;
        boolean z = vhcVar.l;
        boolean z2 = vhcVar.k;
        int i2 = vhcVar.j;
        String str = vhcVar.i;
        int i3 = vhcVar.h;
        vzc vzcVar = vhcVar.g;
        int i4 = vhcVar.f;
        int i5 = vhcVar.e;
        String str2 = vhcVar.d;
        String str3 = vhcVar.c;
        String str4 = vhcVar.b;
        int i6 = vhcVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || i6 != 0) {
            k.z(0, i6, o9aVar);
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
        if (k.V(o9aVar) || i5 != 0) {
            k.z(4, i5, o9aVar);
        }
        if (k.V(o9aVar) || i4 != 0) {
            k.z(5, i4, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(vzcVar, new vzc())) {
            k.F(o9aVar, 6, tzc.a, vzcVar);
        }
        if (k.V(o9aVar) || i3 != 0) {
            k.z(7, i3, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 8, str);
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(9, i2, o9aVar);
        }
        if (k.V(o9aVar) || z2) {
            k.o(o9aVar, 10, z2);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 11, z);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(12, i, o9aVar);
        }
        if (k.V(o9aVar) || j2 != -1) {
            k.B(o9aVar, 13, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 14, j);
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
        boolean z = false;
        boolean z2 = false;
        int i7 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        vzc vzcVar = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        boolean z3 = true;
        while (z3) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z3 = false;
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
                    str3 = t.k(o9aVar, 3);
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
                    vzcVar = (vzc) t.q(o9aVar, 6, tzc.a, vzcVar);
                    i |= 64;
                    break;
                case 7:
                    i5 = t.r(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    str4 = t.k(o9aVar, 8);
                    i |= 256;
                    break;
                case 9:
                    i6 = t.r(o9aVar, 9);
                    i |= 512;
                    break;
                case 10:
                    z = t.z(o9aVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    z2 = t.z(o9aVar, 11);
                    i |= 2048;
                    break;
                case 12:
                    i7 = t.r(o9aVar, 12);
                    i |= 4096;
                    break;
                case 13:
                    j = t.D(o9aVar, 13);
                    i |= 8192;
                    break;
                case 14:
                    j2 = t.D(o9aVar, 14);
                    i |= 16384;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new vhc(i, i2, str, str2, str3, i3, i4, vzcVar, i5, str4, i6, z, z2, i7, j, j2);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        xy5 xy5Var = xy5.a;
        c4b c4bVar = c4b.a;
        ms0 ms0Var = ms0.a;
        ky6 ky6Var = ky6.a;
        return new s76[]{xy5Var, c4bVar, c4bVar, c4bVar, xy5Var, xy5Var, tzc.a, xy5Var, c4bVar, xy5Var, ms0Var, ms0Var, xy5Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
