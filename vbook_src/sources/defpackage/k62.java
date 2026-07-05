package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k62  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class k62 implements rw4 {
    public static final k62 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [k62, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.community.api.dto.ConversationDto", obj, 12);
        n09Var.k("id", true);
        n09Var.k("type", true);
        n09Var.k("name", true);
        n09Var.k("image", true);
        n09Var.k("visibility", true);
        n09Var.k("latest_message", true);
        n09Var.k("unread_count", true);
        n09Var.k("member_count", true);
        n09Var.k("is_joined", true);
        n09Var.k("created_by", true);
        n09Var.k("updated_at", true);
        n09Var.k("created_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        m62 m62Var = (m62) obj;
        m62Var.getClass();
        long j = m62Var.l;
        long j2 = m62Var.k;
        vzc vzcVar = m62Var.j;
        boolean z = m62Var.i;
        int i = m62Var.h;
        int i2 = m62Var.g;
        ia7 ia7Var = m62Var.f;
        String str = m62Var.e;
        String str2 = m62Var.d;
        String str3 = m62Var.c;
        String str4 = m62Var.b;
        long j3 = m62Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || j3 != 0) {
            k.B(o9aVar, 0, j3);
        }
        if (k.V(o9aVar) || !c16.i(str4, "")) {
            k.J(o9aVar, 1, str4);
        }
        if (k.V(o9aVar) || str3 != null) {
            k.E(o9aVar, 2, c4b.a, str3);
        }
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 3, c4b.a, str2);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 4, str);
        }
        if (k.V(o9aVar) || ia7Var != null) {
            k.E(o9aVar, 5, ga7.a, ia7Var);
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(6, i2, o9aVar);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(7, i, o9aVar);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 8, z);
        }
        if (k.V(o9aVar) || vzcVar != null) {
            k.E(o9aVar, 9, tzc.a, vzcVar);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 10, j2);
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
        Object obj = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        vzc vzcVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ia7 ia7Var = null;
        boolean z2 = true;
        while (z2) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    j = t.D(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str = t.k(o9aVar, 1);
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
                    str4 = t.k(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    ia7Var = (ia7) t.x(o9aVar, 5, ga7.a, ia7Var);
                    i |= 32;
                    break;
                case 6:
                    i2 = t.r(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    i3 = t.r(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    z = t.z(o9aVar, 8);
                    i |= 256;
                    break;
                case 9:
                    vzcVar = (vzc) t.x(o9aVar, 9, tzc.a, vzcVar);
                    i |= 512;
                    break;
                case 10:
                    j2 = t.D(o9aVar, 10);
                    i |= 1024;
                    continue;
                case 11:
                    j3 = t.D(o9aVar, 11);
                    i |= 2048;
                    continue;
                default:
                    fb4.a(f);
                    return obj;
            }
            obj = null;
        }
        t.n(o9aVar);
        return new m62(i, j, str, str2, str3, str4, ia7Var, i2, i3, z, vzcVar, j2, j3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        c4b c4bVar = c4b.a;
        s76 H = wq9.H(c4bVar);
        s76 H2 = wq9.H(c4bVar);
        s76 H3 = wq9.H(ga7.a);
        s76 H4 = wq9.H(tzc.a);
        ky6 ky6Var = ky6.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{ky6Var, c4bVar, H, H2, c4bVar, H3, xy5Var, xy5Var, ms0.a, H4, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
