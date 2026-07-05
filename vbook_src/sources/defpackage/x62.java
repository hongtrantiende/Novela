package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x62  reason: default package */
/* loaded from: classes3.dex */
public final class x62 implements l1a {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public x62(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.l1a
    public final Object b(String str, Object[] objArr, m42 m42Var) {
        d56 B;
        k46 k46Var;
        String str2 = null;
        switch (this.a) {
            case 0:
                String str3 = (String) this.b;
                String str4 = "";
                if (str.equals("Cookie_set")) {
                    Object q0 = b00.q0(0, objArr);
                    if (q0 != null) {
                        str2 = q0.toString();
                    }
                    if (str2 != null) {
                        str4 = str2;
                    }
                    z62.a.getClass();
                    ((oh) y62.a()).b.setCookie(str3, str4);
                    return pvc.a;
                } else if (!str.equals("Cookie_get")) {
                    return null;
                } else {
                    z62.a.getClass();
                    String cookie = ((oh) y62.a()).b.getCookie(str3);
                    if (cookie == null) {
                        return "";
                    }
                    return cookie;
                }
            case 1:
                if (!"Log_log".equals(str)) {
                    return null;
                }
                String valueOf = String.valueOf(b00.q0(0, objArr));
                xt4 xt4Var = (xt4) this.b;
                if (xt4Var != null) {
                    xt4Var.invoke(valueOf);
                }
                if (jy.a()) {
                    kw6 kw6Var = kw6.b;
                    iea ieaVar = iea.b;
                    if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                        kw6Var.a(ieaVar, "Log", valueOf, null);
                    }
                }
                return Boolean.TRUE;
            default:
                un2 un2Var = (un2) this.b;
                if (!"LocalConfig_getItem".equals(str)) {
                    return null;
                }
                Object obj = objArr[0];
                obj.getClass();
                String str5 = (String) obj;
                d56 c = v46.c(un2Var.s);
                if (c.containsKey(str5)) {
                    k46 k46Var2 = (k46) c.get(str5);
                    if (k46Var2 == null) {
                        return null;
                    }
                    return oc2.x(k46Var2);
                }
                Map map = un2Var.q;
                if (!map.containsKey(str5) || (B = oc2.B(v46.b(map.get(str5)))) == null || (k46Var = (k46) B.get("default")) == null) {
                    return null;
                }
                return oc2.x(k46Var);
        }
    }

    public x62(xt4 xt4Var) {
        this.b = xt4Var;
    }

    public x62(un2 un2Var) {
        un2Var.getClass();
        this.b = un2Var;
    }
}
