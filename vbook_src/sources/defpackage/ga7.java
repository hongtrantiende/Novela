package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ga7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga7 implements rw4 {
    public static final ga7 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ga7, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.community.api.dto.MessageDto", obj, 8);
        n09Var.k("id", true);
        n09Var.k("content", true);
        n09Var.k("type", true);
        n09Var.k("user", true);
        n09Var.k("quote", true);
        n09Var.k("status", true);
        n09Var.k("updated_at", true);
        n09Var.k("created_at", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        ia7 ia7Var = (ia7) obj;
        ia7Var.getClass();
        long j = ia7Var.h;
        long j2 = ia7Var.g;
        int i = ia7Var.f;
        ia7 ia7Var2 = ia7Var.e;
        vzc vzcVar = ia7Var.d;
        int i2 = ia7Var.c;
        String str = ia7Var.b;
        long j3 = ia7Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        if (k.V(o9aVar) || j3 != 0) {
            k.B(o9aVar, 0, j3);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 1, str);
        }
        if (k.V(o9aVar) || i2 != 0) {
            k.z(2, i2, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(vzcVar, new vzc())) {
            k.F(o9aVar, 3, tzc.a, vzcVar);
        }
        if (k.V(o9aVar) || ia7Var2 != null) {
            k.E(o9aVar, 4, a, ia7Var2);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(5, i, o9aVar);
        }
        if (k.V(o9aVar) || j2 != 0) {
            k.B(o9aVar, 6, j2);
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
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        vzc vzcVar = null;
        ia7 ia7Var = null;
        boolean z = true;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    break;
                case 0:
                    j = t.D(o9aVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str = t.k(o9aVar, 1);
                    i |= 2;
                    break;
                case 2:
                    i2 = t.r(o9aVar, 2);
                    i |= 4;
                    break;
                case 3:
                    vzcVar = (vzc) t.q(o9aVar, 3, tzc.a, vzcVar);
                    i |= 8;
                    break;
                case 4:
                    ia7Var = (ia7) t.x(o9aVar, 4, a, ia7Var);
                    i |= 16;
                    break;
                case 5:
                    i3 = t.r(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    j2 = t.D(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    j3 = t.D(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                default:
                    fb4.a(f);
                    return null;
            }
        }
        t.n(o9aVar);
        return new ia7(i, j, str, i2, vzcVar, ia7Var, i3, j2, j3);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        s76 H = wq9.H(a);
        ky6 ky6Var = ky6.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{ky6Var, c4b.a, xy5Var, tzc.a, H, xy5Var, ky6Var, ky6Var};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
