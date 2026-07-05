package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p29  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class p29 implements rw4 {
    public static final p29 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [p29, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.community.api.dto.PostDto", obj, 11);
        n09Var.k("id", true);
        n09Var.k("topic_id", true);
        n09Var.k("user", true);
        n09Var.k("content", true);
        n09Var.k("quote", true);
        n09Var.k("status", true);
        n09Var.k("like_count", true);
        n09Var.k("updated_at", true);
        n09Var.k("created_at", true);
        n09Var.k("liked", true);
        n09Var.k("likes", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        int i;
        r29 r29Var = (r29) obj;
        r29Var.getClass();
        int i2 = r29Var.k;
        boolean z = r29Var.j;
        long j = r29Var.i;
        long j2 = r29Var.h;
        int i3 = r29Var.g;
        int i4 = r29Var.f;
        r29 r29Var2 = r29Var.e;
        String str = r29Var.d;
        vzc vzcVar = r29Var.c;
        int i5 = r29Var.b;
        long j3 = r29Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || j3 != 0) {
            i = i2;
            k.B(o9aVar, 0, j3);
        } else {
            i = i2;
        }
        if (k.V(o9aVar) || i5 != 0) {
            k.z(1, i5, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(vzcVar, new vzc())) {
            k.F(o9aVar, 2, tzc.a, vzcVar);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 3, str);
        }
        if (k.V(o9aVar) || r29Var2 != null) {
            k.E(o9aVar, 4, a, r29Var2);
        }
        if (k.V(o9aVar) || i4 != 0) {
            k.z(5, i4, o9aVar);
        }
        if (k.V(o9aVar) || i3 != 0) {
            k.z(6, i3, o9aVar);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 7, j2);
        }
        if (k.V(o9aVar) || j != 0) {
            k.B(o9aVar, 8, j);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 9, z);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(10, i, o9aVar);
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
        int i5 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        vzc vzcVar = null;
        String str = null;
        r29 r29Var = null;
        boolean z2 = true;
        while (z2) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    j = t.D(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = t.r(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    vzcVar = (vzc) t.q(o9aVar, 2, tzc.a, vzcVar);
                    i |= 4;
                    break;
                case 3:
                    str = t.k(o9aVar, 3);
                    i |= 8;
                    break;
                case 4:
                    r29Var = (r29) t.x(o9aVar, 4, a, r29Var);
                    i |= 16;
                    break;
                case 5:
                    i3 = t.r(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i4 = t.r(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    j2 = t.D(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    j3 = t.D(o9aVar, 8);
                    i |= 256;
                    break;
                case 9:
                    z = t.z(o9aVar, 9);
                    i |= 512;
                    break;
                case 10:
                    i5 = t.r(o9aVar, 10);
                    i |= 1024;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new r29(i, j, i2, vzcVar, str, r29Var, i3, i4, j2, j3, z, i5);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        s76 H = wq9.H(a);
        ky6 ky6Var = ky6.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{ky6Var, xy5Var, tzc.a, c4b.a, H, xy5Var, xy5Var, ky6Var, ky6Var, ms0.a, xy5Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
