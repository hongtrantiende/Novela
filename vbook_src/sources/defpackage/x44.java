package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x44  reason: default package */
/* loaded from: classes3.dex */
public final class x44 {
    public final ii2 a;
    public final h1a b;

    public x44(ii2 ii2Var, h1a h1aVar) {
        this.a = ii2Var;
        this.b = h1aVar;
    }

    public static p44 d(String str) {
        String str2;
        String str3;
        d56 g = l46.g(r36.d.c(str));
        k46 k46Var = (k46) g.get("plugin");
        String str4 = null;
        if (k46Var != null) {
            str2 = oc2.x(l46.h(k46Var));
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        k46 k46Var2 = (k46) g.get("icon");
        if (k46Var2 != null) {
            str3 = oc2.x(l46.h(k46Var2));
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        k46 k46Var3 = (k46) g.get("src");
        if (k46Var3 != null) {
            str4 = oc2.x(l46.h(k46Var3));
        }
        if (str4 == null) {
            str4 = "";
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        if (str3.length() > 0) {
            try {
                byte[] l = kxe.l(str3);
                if (l != null) {
                    hashMap2.put("icon", "data:image/png;base64," + kxe.m(zxe.l(ay5.a(axe.j(zxe.i(l))), 90)));
                }
            } catch (Throwable unused) {
            }
        }
        d56 g2 = l46.g(r36.d.c(str2));
        k46 k46Var4 = (k46) l46.g(g2).get("metadata");
        if (k46Var4 != null) {
            for (Map.Entry entry : l46.g(k46Var4).a.entrySet()) {
                Object key = entry.getKey();
                String x = oc2.x(l46.h((k46) entry.getValue()));
                if (x == null) {
                    x = "";
                }
                hashMap2.put(key, x);
            }
        }
        k46 k46Var5 = (k46) l46.g(g2).get("script");
        if (k46Var5 != null) {
            for (Map.Entry entry2 : l46.g(k46Var5).a.entrySet()) {
                Object key2 = entry2.getKey();
                String x2 = oc2.x(l46.h((k46) entry2.getValue()));
                if (x2 == null) {
                    x2 = "";
                }
                hashMap3.put(key2, x2);
            }
        }
        k46 k46Var6 = (k46) l46.g(g2).get("config");
        if (k46Var6 != null) {
            for (Map.Entry entry3 : l46.g(k46Var6).a.entrySet()) {
                hashMap4.put(entry3.getKey(), ((k46) entry3.getValue()).toString());
            }
        }
        for (Map.Entry entry4 : l46.g(r36.d.c(str4)).a.entrySet()) {
            Object key3 = entry4.getKey();
            String x3 = oc2.x(l46.h((k46) entry4.getValue()));
            if (x3 == null) {
                x3 = "";
            }
            hashMap.put(key3, x3);
        }
        return new p44(hashMap, hashMap2, hashMap3, hashMap4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(1:(1:(11:10|11|12|13|14|15|16|17|18|19|(3:24|25|26)(1:21))(2:38|39))(4:40|41|42|43))(13:110|111|112|(1:114)(1:140)|(1:116)|117|(1:119)(1:139)|(1:121)|122|(1:124)(1:138)|(1:126)|127|(2:129|(3:131|(1:133)|101)(2:134|135))(2:136|137))|44|(3:46|(1:48)(1:106)|(11:50|(1:52)|53|(1:55)|56|57|58|59|60|61|(8:63|(2:65|(6:67|68|69|70|71|(1:73)(1:74))(2:77|78))|79|(10:82|83|(1:85)|(1:87)|88|89|90|91|(1:93)(2:94|95)|80)|98|99|(8:102|14|15|16|17|18|19|(0)(0))|101)(1:103)))|107|57|58|59|60|61|(0)(0)))|143|6|(0)(0)|44|(0)|107|57|58|59|60|61|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0170, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0284 A[Catch: all -> 0x0037, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0037, blocks: (B:13:0x0031, B:132:0x024a, B:150:0x0284, B:133:0x0255), top: B:171:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0285 A[Catch: all -> 0x005c, TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x005c, blocks: (B:20:0x0050, B:53:0x011a, B:55:0x0128, B:60:0x0136, B:63:0x0143, B:66:0x014e, B:68:0x0153, B:82:0x017f, B:84:0x0185, B:86:0x018b, B:101:0x01b7, B:102:0x01b8, B:103:0x01bf, B:104:0x01c0, B:105:0x01ca, B:107:0x01d0, B:127:0x021f, B:128:0x0220, B:151:0x0285, B:108:0x01ee, B:112:0x0201, B:115:0x0209, B:87:0x019f, B:69:0x0168), top: B:175:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128 A[Catch: all -> 0x005c, TryCatch #16 {all -> 0x005c, blocks: (B:20:0x0050, B:53:0x011a, B:55:0x0128, B:60:0x0136, B:63:0x0143, B:66:0x014e, B:68:0x0153, B:82:0x017f, B:84:0x0185, B:86:0x018b, B:101:0x01b7, B:102:0x01b8, B:103:0x01bf, B:104:0x01c0, B:105:0x01ca, B:107:0x01d0, B:127:0x021f, B:128:0x0220, B:151:0x0285, B:108:0x01ee, B:112:0x0201, B:115:0x0209, B:87:0x019f, B:69:0x0168), top: B:175:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f A[Catch: all -> 0x005c, TryCatch #16 {all -> 0x005c, blocks: (B:20:0x0050, B:53:0x011a, B:55:0x0128, B:60:0x0136, B:63:0x0143, B:66:0x014e, B:68:0x0153, B:82:0x017f, B:84:0x0185, B:86:0x018b, B:101:0x01b7, B:102:0x01b8, B:103:0x01bf, B:104:0x01c0, B:105:0x01ca, B:107:0x01d0, B:127:0x021f, B:128:0x0220, B:151:0x0285, B:108:0x01ee, B:112:0x0201, B:115:0x0209, B:87:0x019f, B:69:0x0168), top: B:175:0x0050 }] */
    /* JADX WARN: Type inference failed for: r3v7, types: [my0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.a(java.lang.String, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.u44
            if (r0 == 0) goto L13
            r0 = r6
            u44 r0 = (defpackage.u44) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            u44 r0 = new u44
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r6)
            r0.c = r2
            java.lang.Object r6 = r4.c(r5, r0)
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L3a
            return r5
        L3a:
            un2 r6 = (defpackage.un2) r6
            ii2 r4 = r4.a
            gk2 r4 = r4.I
            r4.B0(r6)
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.b(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r36, defpackage.n42 r37) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.c(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r11 == r6) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Type inference failed for: r11v17, types: [gs9] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x44] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.e(java.lang.String, n42):java.lang.Object");
    }
}
