package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: plc  reason: default package */
/* loaded from: classes3.dex */
public final class plc implements klc {
    public final ii2 a;
    public final jlc b;
    public final bnc c;
    public final uz6 d;
    public final cza e;
    public final cza f;
    public final cza g;
    public final cza h;
    public final cza i;
    public final cza j;

    static {
        r76[] r76VarArr = jlc.f;
    }

    public plc(ii2 ii2Var, jlc jlcVar, bnc bncVar, uz6 uz6Var) {
        this.a = ii2Var;
        this.b = jlcVar;
        this.c = bncVar;
        this.d = uz6Var;
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        m41 a = k27.a(ru2Var);
        this.e = dza.a(Boolean.FALSE);
        this.f = dza.a(null);
        this.g = dza.a(null);
        this.h = dza.a(null);
        this.i = dza.a(null);
        this.j = dza.a(null);
        z87.v(a, ru2Var, null, new ov9(this, (m42) null, 27), 2);
    }

    public static String g(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        if (Boolean.parseBoolean((String) map2.get("show_raw"))) {
            String str = (String) map.get("raw");
            if (str != null) {
                return str;
            }
        } else {
            String str2 = (String) map2.get("engine_id");
            if (str2 == null) {
                str2 = "raw";
            }
            String str3 = (String) map.get(str2);
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() == 0) {
                String str4 = (String) map.get("raw");
                if (str4 != null) {
                    return str4;
                }
            } else {
                return str3;
            }
        }
        return "";
    }

    public final mx c() {
        return new mx(this.e, 4);
    }

    public final mx d() {
        return new mx(this.f, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[LOOP:0: B:18:0x004d->B:20:0x0053, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.llc
            if (r0 == 0) goto L13
            r0 = r6
            llc r0 = (defpackage.llc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            llc r0 = new llc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            r0.c = r2
            uz6 r4 = r4.d
            java.lang.Object r6 = r4.a(r5, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3c
            return r4
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.tl1.s(r6, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L4d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r5.next()
            cl5 r6 = (defpackage.cl5) r6
            java.lang.String r6 = r6.a
            r4.add(r6)
            goto L4d
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plc.e(java.lang.String, n42):java.io.Serializable");
    }

    public final String f(Map map, String str, String str2) {
        map.getClass();
        str.getClass();
        jlc jlcVar = this.b;
        h49 h49Var = jlcVar.a;
        ls0 ls0Var = jlcVar.b;
        r76[] r76VarArr = jlc.f;
        if (!((Boolean) ls0Var.c(r76VarArr[0], jlcVar)).booleanValue()) {
            String str3 = (String) map.get("raw");
            if (str3 != null) {
                return str3;
            }
        } else {
            ii2 ii2Var = this.a;
            gk2 gk2Var = ii2Var.c;
            gk2Var.getClass();
            Map map2 = (Map) new ok2(gk2Var, str, new kk2(gk2Var, 12), 0).e();
            Map map3 = ls3.a;
            if (map2 == null) {
                map2 = map3;
            }
            if (!map2.isEmpty()) {
                return g(map, map2);
            }
            gk2 gk2Var2 = ii2Var.I;
            if (str2 == null) {
                str2 = "";
            }
            gk2Var2.getClass();
            Map map4 = (Map) new co2(gk2Var2, str2, new zn2(gk2Var2, 0, false), 4).e();
            if (map4 != null) {
                map3 = map4;
            }
            if (!map3.isEmpty()) {
                return g(map, map3);
            }
            yk8 yk8Var = new yk8("engine_id", jlcVar.a());
            yk8 yk8Var2 = new yk8("show_raw", String.valueOf(((Boolean) jlcVar.d.c(r76VarArr[2], jlcVar)).booleanValue()));
            String a = jlcVar.a();
            a.getClass();
            yk8 yk8Var3 = new yk8("to_language", h49Var.e("to_language_".concat(a), ""));
            String a2 = jlcVar.a();
            a2.getClass();
            Map s = o17.s(yk8Var, yk8Var2, yk8Var3, new yk8("from_language", h49Var.e("from_language_".concat(a2), "")));
            if (!s.isEmpty()) {
                return g(map, s);
            }
            String str4 = (String) map.get("raw");
            if (str4 != null) {
                return str4;
            }
        }
        return "";
    }

    public final String h(Map map, boolean z, Map map2, Map map3, Map map4) {
        map.getClass();
        map2.getClass();
        map4.getClass();
        if (!z) {
            String str = (String) map.get("raw");
            if (str != null) {
                return str;
            }
        } else if (map2.containsKey("engine_id")) {
            return g(map, map2);
        } else {
            if (map3.containsKey("engine_id")) {
                return g(map, map3);
            }
            if (map4.containsKey("engine_id")) {
                return g(map, map4);
            }
            String str2 = (String) map.get("raw");
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final Integer i() {
        jlc jlcVar = this.b;
        return new Integer(((Number) jlcVar.c.c(jlc.f[1], jlcVar)).intValue());
    }

    public final eb1 j() {
        return z1d.N(c(), new wa((m42) null, this, 27));
    }
}
