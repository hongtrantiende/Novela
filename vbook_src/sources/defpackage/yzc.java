package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yzc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yzc implements rw4 {
    public static final yzc a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [yzc, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("com.reader.data.community.api.dto.UserInfoDto", obj, 9);
        n09Var.k("id", true);
        n09Var.k("name", true);
        n09Var.k("email", true);
        n09Var.k("avatar", true);
        n09Var.k("role", true);
        n09Var.k("premium", true);
        n09Var.k("exp", true);
        n09Var.k("color", true);
        n09Var.k("extra_color", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        a0d a0dVar = (a0d) obj;
        a0dVar.getClass();
        List list = a0dVar.i;
        String str = a0dVar.h;
        int i = a0dVar.g;
        boolean z = a0dVar.f;
        int i2 = a0dVar.e;
        String str2 = a0dVar.d;
        String str3 = a0dVar.c;
        String str4 = a0dVar.b;
        String str5 = a0dVar.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = a0d.j;
        if (k.V(o9aVar) || !c16.i(str5, "")) {
            k.J(o9aVar, 0, str5);
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
        if (k.V(o9aVar) || i2 != 0) {
            k.z(4, i2, o9aVar);
        }
        if (k.V(o9aVar) || z) {
            k.o(o9aVar, 5, z);
        }
        if (k.V(o9aVar) || i != 0) {
            k.z(6, i, o9aVar);
        }
        if (k.V(o9aVar) || !c16.i(str, "")) {
            k.J(o9aVar, 7, str);
        }
        if (k.V(o9aVar) || !c16.i(list, ks3.a)) {
            k.F(o9aVar, 8, (s76) ye6VarArr[8].getValue(), list);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = a0d.j;
        Object obj = null;
        boolean z = true;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    z = false;
                    continue;
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
                    i2 = t.r(o9aVar, 4);
                    i |= 16;
                    break;
                case 5:
                    z2 = t.z(o9aVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i3 = t.r(o9aVar, 6);
                    i |= 64;
                    break;
                case 7:
                    str5 = t.k(o9aVar, 7);
                    i |= Token.CASE;
                    break;
                case 8:
                    list = (List) t.q(o9aVar, 8, (s76) ye6VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    fb4.a(f);
                    return obj;
            }
            obj = null;
        }
        t.n(o9aVar);
        return new a0d(i, str, str2, str3, str4, i2, z2, i3, str5, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = a0d.j;
        c4b c4bVar = c4b.a;
        xy5 xy5Var = xy5.a;
        return new s76[]{c4bVar, c4bVar, c4bVar, c4bVar, xy5Var, ms0.a, xy5Var, c4bVar, ye6VarArr[8].getValue()};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
