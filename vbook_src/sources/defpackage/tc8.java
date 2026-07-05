package defpackage;

import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc8  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc8 implements rw4 {
    public static final tc8 a;
    private static final o9a descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [tc8, java.lang.Object, rw4] */
    static {
        ?? obj = new Object();
        a = obj;
        n09 n09Var = new n09("org.publicvalue.multiplatform.oidc.types.remote.OpenIdConnectConfiguration", obj, 18);
        n09Var.k("authorization_endpoint", true);
        n09Var.k("token_endpoint", true);
        n09Var.k("device_authorization_endpoint", true);
        n09Var.k("userinfo_endpoint", true);
        n09Var.k("end_session_endpoint", true);
        n09Var.k("introspection_endpoint", true);
        n09Var.k("revocation_endpoint", true);
        n09Var.k("issuer", true);
        n09Var.k("jwks_uri", true);
        n09Var.k("response_types_supported", true);
        n09Var.k("id_token_signing_alg_values_supported", true);
        n09Var.k("frontchannel_logout_supported", true);
        n09Var.k("scopes_supported", true);
        n09Var.k("claims_supported", true);
        n09Var.k("subject_types_supported", true);
        n09Var.k("token_endpoint_auth_methods_supported", true);
        n09Var.k("grant_types_supported", true);
        n09Var.k("introspection_endpoint_auth_methods_supported", true);
        descriptor = n09Var;
    }

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        List list;
        List list2;
        vc8 vc8Var = (vc8) obj;
        vc8Var.getClass();
        List list3 = vc8Var.r;
        List list4 = vc8Var.q;
        List list5 = vc8Var.p;
        List list6 = vc8Var.o;
        List list7 = vc8Var.n;
        List list8 = vc8Var.m;
        Boolean bool = vc8Var.l;
        List list9 = vc8Var.k;
        List list10 = vc8Var.j;
        String str = vc8Var.i;
        String str2 = vc8Var.h;
        String str3 = vc8Var.g;
        String str4 = vc8Var.f;
        String str5 = vc8Var.e;
        String str6 = vc8Var.d;
        String str7 = vc8Var.c;
        String str8 = vc8Var.b;
        String str9 = vc8Var.a;
        o9a o9aVar = descriptor;
        jbe k = jbeVar.k(o9aVar);
        ye6[] ye6VarArr = vc8.s;
        if (k.V(o9aVar) || str9 != null) {
            list = list7;
            list2 = list8;
            k.E(o9aVar, 0, c4b.a, str9);
        } else {
            list = list7;
            list2 = list8;
        }
        if (k.V(o9aVar) || str8 != null) {
            k.E(o9aVar, 1, c4b.a, str8);
        }
        if (k.V(o9aVar) || str7 != null) {
            k.E(o9aVar, 2, c4b.a, str7);
        }
        if (k.V(o9aVar) || str6 != null) {
            k.E(o9aVar, 3, c4b.a, str6);
        }
        if (k.V(o9aVar) || str5 != null) {
            k.E(o9aVar, 4, c4b.a, str5);
        }
        if (k.V(o9aVar) || str4 != null) {
            k.E(o9aVar, 5, c4b.a, str4);
        }
        if (k.V(o9aVar) || str3 != null) {
            k.E(o9aVar, 6, c4b.a, str3);
        }
        if (k.V(o9aVar) || str2 != null) {
            k.E(o9aVar, 7, c4b.a, str2);
        }
        if (k.V(o9aVar) || str != null) {
            k.E(o9aVar, 8, c4b.a, str);
        }
        if (k.V(o9aVar) || list10 != null) {
            k.E(o9aVar, 9, (s76) ye6VarArr[9].getValue(), list10);
        }
        if (k.V(o9aVar) || list9 != null) {
            k.E(o9aVar, 10, (s76) ye6VarArr[10].getValue(), list9);
        }
        if (k.V(o9aVar) || bool != null) {
            k.E(o9aVar, 11, ms0.a, bool);
        }
        if (k.V(o9aVar) || list2 != null) {
            k.E(o9aVar, 12, (s76) ye6VarArr[12].getValue(), list2);
        }
        if (k.V(o9aVar) || list != null) {
            k.E(o9aVar, 13, (s76) ye6VarArr[13].getValue(), list);
        }
        if (k.V(o9aVar) || list6 != null) {
            k.E(o9aVar, 14, (s76) ye6VarArr[14].getValue(), list6);
        }
        if (k.V(o9aVar) || list5 != null) {
            k.E(o9aVar, 15, (s76) ye6VarArr[15].getValue(), list5);
        }
        if (k.V(o9aVar) || list4 != null) {
            k.E(o9aVar, 16, (s76) ye6VarArr[16].getValue(), list4);
        }
        if (k.V(o9aVar) || list3 != null) {
            k.E(o9aVar, 17, (s76) ye6VarArr[17].getValue(), list3);
        }
        k.K(o9aVar);
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        Boolean bool;
        String str;
        String str2;
        String str3;
        int i;
        Boolean bool2;
        String str4;
        String str5;
        o9a o9aVar = descriptor;
        fx1 t = yq2Var.t(o9aVar);
        ye6[] ye6VarArr = vc8.s;
        Boolean bool3 = null;
        List list = null;
        List list2 = null;
        String str6 = null;
        List list3 = null;
        String str7 = null;
        int i2 = 0;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        String str8 = null;
        String str9 = null;
        boolean z = true;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (z) {
            int f = t.f(o9aVar);
            switch (f) {
                case -1:
                    bool2 = bool3;
                    str4 = str9;
                    str5 = str10;
                    z = false;
                    list = list;
                    str9 = str4;
                    str10 = str5;
                    break;
                case 0:
                    bool2 = bool3;
                    str4 = str9;
                    str5 = (String) t.x(o9aVar, 0, c4b.a, str10);
                    i2 |= 1;
                    list = list;
                    str8 = str8;
                    str9 = str4;
                    str10 = str5;
                    break;
                case 1:
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str11 = (String) t.x(o9aVar, 1, c4b.a, str11);
                    i2 |= 2;
                    str12 = str12;
                    str8 = str;
                    bool3 = bool;
                    str9 = str2;
                case 2:
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str12 = (String) t.x(o9aVar, 2, c4b.a, str12);
                    i2 |= 4;
                    str8 = str;
                    bool3 = bool;
                    str9 = str2;
                case 3:
                    bool = bool3;
                    str = str8;
                    str2 = str9;
                    str13 = (String) t.x(o9aVar, 3, c4b.a, str13);
                    i2 |= 8;
                    str8 = str;
                    bool3 = bool;
                    str9 = str2;
                case 4:
                    bool = bool3;
                    str2 = str9;
                    str = str8;
                    str14 = (String) t.x(o9aVar, 4, c4b.a, str14);
                    i2 |= 16;
                    str8 = str;
                    bool3 = bool;
                    str9 = str2;
                case 5:
                    bool = bool3;
                    str2 = str9;
                    str8 = (String) t.x(o9aVar, 5, c4b.a, str8);
                    i2 |= 32;
                    bool3 = bool;
                    str9 = str2;
                case 6:
                    bool2 = bool3;
                    str9 = (String) t.x(o9aVar, 6, c4b.a, str9);
                    i2 |= 64;
                    str8 = str8;
                    break;
                case 7:
                    str3 = str8;
                    str2 = str9;
                    str7 = (String) t.x(o9aVar, 7, c4b.a, str7);
                    i2 |= Token.CASE;
                    str8 = str3;
                    str9 = str2;
                case 8:
                    str3 = str8;
                    str2 = str9;
                    str6 = (String) t.x(o9aVar, 8, c4b.a, str6);
                    i2 |= 256;
                    str8 = str3;
                    str9 = str2;
                case 9:
                    str3 = str8;
                    str2 = str9;
                    list2 = (List) t.x(o9aVar, 9, (s76) ye6VarArr[9].getValue(), list2);
                    i2 |= 512;
                    str8 = str3;
                    str9 = str2;
                case 10:
                    str3 = str8;
                    str2 = str9;
                    list = (List) t.x(o9aVar, 10, (s76) ye6VarArr[10].getValue(), list);
                    i2 |= 1024;
                    str8 = str3;
                    str9 = str2;
                case 11:
                    str3 = str8;
                    str2 = str9;
                    bool3 = (Boolean) t.x(o9aVar, 11, ms0.a, bool3);
                    i2 |= 2048;
                    str8 = str3;
                    str9 = str2;
                case 12:
                    str3 = str8;
                    str2 = str9;
                    list3 = (List) t.x(o9aVar, 12, (s76) ye6VarArr[12].getValue(), list3);
                    i2 |= 4096;
                    str8 = str3;
                    str9 = str2;
                case 13:
                    str3 = str8;
                    str2 = str9;
                    list4 = (List) t.x(o9aVar, 13, (s76) ye6VarArr[13].getValue(), list4);
                    i2 |= 8192;
                    str8 = str3;
                    str9 = str2;
                case 14:
                    str3 = str8;
                    str2 = str9;
                    list5 = (List) t.x(o9aVar, 14, (s76) ye6VarArr[14].getValue(), list5);
                    i2 |= 16384;
                    str8 = str3;
                    str9 = str2;
                case 15:
                    str3 = str8;
                    str2 = str9;
                    list6 = (List) t.x(o9aVar, 15, (s76) ye6VarArr[15].getValue(), list6);
                    i = 32768;
                    i2 |= i;
                    str8 = str3;
                    str9 = str2;
                case 16:
                    str3 = str8;
                    str2 = str9;
                    list7 = (List) t.x(o9aVar, 16, (s76) ye6VarArr[16].getValue(), list7);
                    i = Parser.ARGC_LIMIT;
                    i2 |= i;
                    str8 = str3;
                    str9 = str2;
                case 17:
                    str3 = str8;
                    str2 = str9;
                    list8 = (List) t.x(o9aVar, 17, (s76) ye6VarArr[17].getValue(), list8);
                    i = 131072;
                    i2 |= i;
                    str8 = str3;
                    str9 = str2;
                default:
                    fb4.a(f);
                    return null;
            }
            bool3 = bool2;
        }
        Boolean bool4 = bool3;
        String str15 = str9;
        t.n(o9aVar);
        return new vc8(i2, str10, str11, str12, str13, str14, str8, str15, str7, str6, list2, list, bool4, list3, list4, list5, list6, list7, list8);
    }

    @Override // defpackage.rw4
    public final s76[] d() {
        ye6[] ye6VarArr = vc8.s;
        c4b c4bVar = c4b.a;
        return new s76[]{wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H(c4bVar), wq9.H((s76) ye6VarArr[9].getValue()), wq9.H((s76) ye6VarArr[10].getValue()), wq9.H(ms0.a), wq9.H((s76) ye6VarArr[12].getValue()), wq9.H((s76) ye6VarArr[13].getValue()), wq9.H((s76) ye6VarArr[14].getValue()), wq9.H((s76) ye6VarArr[15].getValue()), wq9.H((s76) ye6VarArr[16].getValue()), wq9.H((s76) ye6VarArr[17].getValue())};
    }

    @Override // defpackage.s76
    public final o9a e() {
        return descriptor;
    }
}
