package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pta  reason: default package */
/* loaded from: classes3.dex */
public final class pta {
    public final un2 a;
    public final zm9 b;
    public final mfb c;

    public pta(un2 un2Var, h1a h1aVar) {
        h1aVar.getClass();
        this.a = un2Var;
        this.b = h1aVar.a(un2Var);
        this.c = new mfb(new ak9(this, 21));
    }

    public static boolean m(d56 d56Var) {
        Integer num;
        k46 k46Var = (k46) d56Var.get("code");
        if (k46Var != null) {
            i56 C = oc2.C(k46Var);
            if (C != null) {
                num = l46.e(C);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String n(String str, String str2) {
        if (str.length() != 0 && !r4b.Q(str, "https", false) && !r4b.Q(str, "http", false)) {
            return eub.o(k4b.Q0(str2, '/'), "/", k4b.S0(str, '/'));
        }
        return str;
    }

    public static String o(String str) {
        if (!r4b.Q(str, "https://", false) && !r4b.Q(str, "http://", false)) {
            return str;
        }
        return k4b.Q0(str, '/');
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tr9 p(defpackage.d56 r5) {
        /*
            java.lang.String r0 = "code"
            java.lang.Object r0 = r5.get(r0)
            k46 r0 = (defpackage.k46) r0
            r1 = 0
            if (r0 == 0) goto L1e
            i56 r0 = defpackage.oc2.C(r0)
            if (r0 == 0) goto L16
            java.lang.Integer r0 = defpackage.l46.e(r0)
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            goto L1f
        L1e:
            r0 = 1
        L1f:
            java.lang.String r2 = "data"
            java.lang.Object r2 = r5.get(r2)
            k46 r2 = (defpackage.k46) r2
            if (r2 == 0) goto L2e
            java.lang.String r2 = defpackage.oc2.x(r2)
            goto L2f
        L2e:
            r2 = r1
        L2f:
            java.lang.String r3 = ""
            if (r2 != 0) goto L34
            r2 = r3
        L34:
            java.lang.String r4 = "data2"
            java.lang.Object r5 = r5.get(r4)
            k46 r5 = (defpackage.k46) r5
            if (r5 == 0) goto L42
            java.lang.String r1 = defpackage.oc2.x(r5)
        L42:
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r1
        L46:
            tr9 r5 = new tr9
            r5.<init>(r3, r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.p(d56):tr9");
    }

    public static uta q(d56 d56Var) {
        String str;
        String str2;
        String str3;
        k46 k46Var = (k46) d56Var.get("type");
        String str4 = null;
        if (k46Var != null) {
            str = oc2.x(k46Var);
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.length() == 0) {
            return null;
        }
        k46 k46Var2 = (k46) d56Var.get("script");
        if (k46Var2 != null) {
            str2 = oc2.x(k46Var2);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        k46 k46Var3 = (k46) d56Var.get("input");
        if (k46Var3 != null) {
            str3 = oc2.x(k46Var3);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        k46 k46Var4 = (k46) d56Var.get("name");
        if (k46Var4 != null) {
            str4 = oc2.x(k46Var4);
        }
        if (str4 != null) {
            str5 = str4;
        }
        return new uta(lowerCase, str5, str2, str3);
    }

    public static hua t(d56 d56Var) {
        String str;
        String str2;
        k46 k46Var = (k46) d56Var.get("title");
        String str3 = null;
        if (k46Var != null) {
            str = oc2.x(k46Var);
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        k46 k46Var2 = (k46) d56Var.get("input");
        if (k46Var2 != null) {
            str2 = oc2.x(k46Var2);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        k46 k46Var3 = (k46) d56Var.get("script");
        if (k46Var3 != null) {
            str3 = oc2.x(k46Var3);
        }
        if (str3 != null) {
            str4 = str3;
        }
        return new hua(str, str2, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:11:0x0024, B:21:0x0043, B:22:0x0048, B:16:0x0031), top: B:33:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, defpackage.n42 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.eta
            if (r0 == 0) goto L13
            r0 = r8
            eta r0 = (defpackage.eta) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eta r0 = new eta
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            n82 r1 = defpackage.n82.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L49
            goto L40
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L2e:
            defpackage.hre.r(r8)
            zm9 r5 = r5.b     // Catch: java.lang.Throwable -> L49
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L49
            r0.c = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r8 = r5.e(r6, r4, r7, r0)     // Catch: java.lang.Throwable -> L49
            if (r8 != r1) goto L40
            return r1
        L40:
            if (r8 == 0) goto L43
            return r8
        L43:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L49
            r5.<init>()     // Catch: java.lang.Throwable -> L49
            throw r5     // Catch: java.lang.Throwable -> L49
        L49:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            if (r6 != 0) goto L52
            java.lang.String r6 = ""
        L52:
            boolean r7 = defpackage.jy.a()
            if (r7 == 0) goto L6b
            kw6 r7 = defpackage.kw6.b
            iea r8 = defpackage.iea.e
            z56 r0 = r7.a
            iea r0 = r0.a
            int r0 = r0.compareTo(r8)
            if (r0 > 0) goto L6b
            java.lang.String r0 = "Log"
            r7.a(r8, r0, r6, r5)
        L6b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.a(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x0052, B:24:0x0066, B:26:0x0075, B:28:0x007b, B:29:0x0081, B:31:0x0087, B:33:0x009b, B:36:0x00a5, B:38:0x00b1, B:43:0x00bc, B:45:0x00c6, B:49:0x00cf, B:51:0x00e5, B:53:0x00eb, B:55:0x00fb, B:60:0x0106, B:62:0x0111, B:64:0x0117, B:66:0x011e, B:68:0x0128, B:70:0x012e, B:71:0x0132, B:35:0x00a1, B:73:0x013c, B:74:0x0140, B:75:0x0141, B:76:0x0146, B:18:0x0037), top: B:90:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0141 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x0052, B:24:0x0066, B:26:0x0075, B:28:0x007b, B:29:0x0081, B:31:0x0087, B:33:0x009b, B:36:0x00a5, B:38:0x00b1, B:43:0x00bc, B:45:0x00c6, B:49:0x00cf, B:51:0x00e5, B:53:0x00eb, B:55:0x00fb, B:60:0x0106, B:62:0x0111, B:64:0x0117, B:66:0x011e, B:68:0x0128, B:70:0x012e, B:71:0x0132, B:35:0x00a1, B:73:0x013c, B:74:0x0140, B:75:0x0141, B:76:0x0146, B:18:0x0037), top: B:90:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.b(java.lang.String, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:22:0x0049, B:24:0x004f, B:26:0x0063, B:28:0x0072, B:29:0x007c, B:31:0x0082, B:33:0x0098, B:37:0x00a1, B:39:0x00ab, B:43:0x00b4, B:45:0x00be, B:49:0x00c7, B:51:0x00e1, B:55:0x00ea, B:56:0x00f1, B:58:0x00fb, B:61:0x0102, B:63:0x0108, B:64:0x010c, B:18:0x0038), top: B:78:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:22:0x0049, B:24:0x004f, B:26:0x0063, B:28:0x0072, B:29:0x007c, B:31:0x0082, B:33:0x0098, B:37:0x00a1, B:39:0x00ab, B:43:0x00b4, B:45:0x00be, B:49:0x00c7, B:51:0x00e1, B:55:0x00ea, B:56:0x00f1, B:58:0x00fb, B:61:0x0102, B:63:0x0108, B:64:0x010c, B:18:0x0038), top: B:78:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.c(java.lang.String, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x0051, B:24:0x0065, B:26:0x0079, B:28:0x007d, B:32:0x0086, B:38:0x0094, B:35:0x008d, B:40:0x0098, B:42:0x009c, B:44:0x00a0, B:47:0x00a7, B:49:0x00b1, B:51:0x00b5, B:53:0x00b9, B:56:0x00c0, B:58:0x00ca, B:59:0x00cf, B:60:0x00d0, B:61:0x00d4, B:62:0x00d5, B:63:0x00da, B:18:0x0036), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x0051, B:24:0x0065, B:26:0x0079, B:28:0x007d, B:32:0x0086, B:38:0x0094, B:35:0x008d, B:40:0x0098, B:42:0x009c, B:44:0x00a0, B:47:0x00a7, B:49:0x00b1, B:51:0x00b5, B:53:0x00b9, B:56:0x00c0, B:58:0x00ca, B:59:0x00cf, B:60:0x00d0, B:61:0x00d4, B:62:0x00d5, B:63:0x00da, B:18:0x0036), top: B:77:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.n42 r8) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.d(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02aa A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:24:0x005e, B:26:0x0072, B:28:0x007c, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009d, B:38:0x00a3, B:40:0x00ac, B:42:0x00b6, B:47:0x00c1, B:49:0x00cb, B:54:0x00d6, B:56:0x00e0, B:60:0x00e9, B:62:0x0103, B:66:0x010c, B:68:0x0126, B:72:0x012f, B:74:0x0149, B:79:0x0153, B:81:0x015f, B:83:0x0165, B:84:0x0174, B:86:0x017a, B:89:0x0191, B:91:0x019b, B:93:0x01a1, B:94:0x01b0, B:96:0x01b6, B:99:0x01cd, B:101:0x01d7, B:103:0x01dd, B:104:0x01ec, B:106:0x01f2, B:109:0x0209, B:111:0x0213, B:113:0x0219, B:114:0x0228, B:116:0x022e, B:119:0x0245, B:121:0x0254, B:123:0x025a, B:124:0x0261, B:126:0x026b, B:128:0x0271, B:129:0x0280, B:131:0x0286, B:136:0x029d, B:138:0x02aa, B:143:0x02b7, B:145:0x02c1, B:149:0x02cd, B:150:0x02d1, B:152:0x02d7, B:247:0x0403, B:249:0x040d, B:251:0x0413, B:253:0x041c, B:255:0x0426, B:257:0x042c, B:260:0x0435, B:155:0x02e0, B:160:0x02ef, B:163:0x02f8, B:167:0x0305, B:171:0x0312, B:175:0x031e, B:178:0x0327, B:181:0x0330, B:185:0x033c, B:189:0x0348, B:193:0x0354, B:196:0x035e, B:200:0x036b, B:204:0x0379, B:208:0x0387, B:211:0x0391, B:215:0x039f, B:219:0x03ad, B:223:0x03bb, B:227:0x03c9, B:231:0x03d7, B:235:0x03e5, B:246:0x03fd, B:39:0x00a8, B:262:0x0445, B:263:0x044a, B:264:0x044b, B:265:0x044f, B:266:0x0450, B:267:0x0455, B:19:0x003e), top: B:281:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c1 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:24:0x005e, B:26:0x0072, B:28:0x007c, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009d, B:38:0x00a3, B:40:0x00ac, B:42:0x00b6, B:47:0x00c1, B:49:0x00cb, B:54:0x00d6, B:56:0x00e0, B:60:0x00e9, B:62:0x0103, B:66:0x010c, B:68:0x0126, B:72:0x012f, B:74:0x0149, B:79:0x0153, B:81:0x015f, B:83:0x0165, B:84:0x0174, B:86:0x017a, B:89:0x0191, B:91:0x019b, B:93:0x01a1, B:94:0x01b0, B:96:0x01b6, B:99:0x01cd, B:101:0x01d7, B:103:0x01dd, B:104:0x01ec, B:106:0x01f2, B:109:0x0209, B:111:0x0213, B:113:0x0219, B:114:0x0228, B:116:0x022e, B:119:0x0245, B:121:0x0254, B:123:0x025a, B:124:0x0261, B:126:0x026b, B:128:0x0271, B:129:0x0280, B:131:0x0286, B:136:0x029d, B:138:0x02aa, B:143:0x02b7, B:145:0x02c1, B:149:0x02cd, B:150:0x02d1, B:152:0x02d7, B:247:0x0403, B:249:0x040d, B:251:0x0413, B:253:0x041c, B:255:0x0426, B:257:0x042c, B:260:0x0435, B:155:0x02e0, B:160:0x02ef, B:163:0x02f8, B:167:0x0305, B:171:0x0312, B:175:0x031e, B:178:0x0327, B:181:0x0330, B:185:0x033c, B:189:0x0348, B:193:0x0354, B:196:0x035e, B:200:0x036b, B:204:0x0379, B:208:0x0387, B:211:0x0391, B:215:0x039f, B:219:0x03ad, B:223:0x03bb, B:227:0x03c9, B:231:0x03d7, B:235:0x03e5, B:246:0x03fd, B:39:0x00a8, B:262:0x0445, B:263:0x044a, B:264:0x044b, B:265:0x044f, B:266:0x0450, B:267:0x0455, B:19:0x003e), top: B:281:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cd A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:24:0x005e, B:26:0x0072, B:28:0x007c, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009d, B:38:0x00a3, B:40:0x00ac, B:42:0x00b6, B:47:0x00c1, B:49:0x00cb, B:54:0x00d6, B:56:0x00e0, B:60:0x00e9, B:62:0x0103, B:66:0x010c, B:68:0x0126, B:72:0x012f, B:74:0x0149, B:79:0x0153, B:81:0x015f, B:83:0x0165, B:84:0x0174, B:86:0x017a, B:89:0x0191, B:91:0x019b, B:93:0x01a1, B:94:0x01b0, B:96:0x01b6, B:99:0x01cd, B:101:0x01d7, B:103:0x01dd, B:104:0x01ec, B:106:0x01f2, B:109:0x0209, B:111:0x0213, B:113:0x0219, B:114:0x0228, B:116:0x022e, B:119:0x0245, B:121:0x0254, B:123:0x025a, B:124:0x0261, B:126:0x026b, B:128:0x0271, B:129:0x0280, B:131:0x0286, B:136:0x029d, B:138:0x02aa, B:143:0x02b7, B:145:0x02c1, B:149:0x02cd, B:150:0x02d1, B:152:0x02d7, B:247:0x0403, B:249:0x040d, B:251:0x0413, B:253:0x041c, B:255:0x0426, B:257:0x042c, B:260:0x0435, B:155:0x02e0, B:160:0x02ef, B:163:0x02f8, B:167:0x0305, B:171:0x0312, B:175:0x031e, B:178:0x0327, B:181:0x0330, B:185:0x033c, B:189:0x0348, B:193:0x0354, B:196:0x035e, B:200:0x036b, B:204:0x0379, B:208:0x0387, B:211:0x0391, B:215:0x039f, B:219:0x03ad, B:223:0x03bb, B:227:0x03c9, B:231:0x03d7, B:235:0x03e5, B:246:0x03fd, B:39:0x00a8, B:262:0x0445, B:263:0x044a, B:264:0x044b, B:265:0x044f, B:266:0x0450, B:267:0x0455, B:19:0x003e), top: B:281:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x040d A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:24:0x005e, B:26:0x0072, B:28:0x007c, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009d, B:38:0x00a3, B:40:0x00ac, B:42:0x00b6, B:47:0x00c1, B:49:0x00cb, B:54:0x00d6, B:56:0x00e0, B:60:0x00e9, B:62:0x0103, B:66:0x010c, B:68:0x0126, B:72:0x012f, B:74:0x0149, B:79:0x0153, B:81:0x015f, B:83:0x0165, B:84:0x0174, B:86:0x017a, B:89:0x0191, B:91:0x019b, B:93:0x01a1, B:94:0x01b0, B:96:0x01b6, B:99:0x01cd, B:101:0x01d7, B:103:0x01dd, B:104:0x01ec, B:106:0x01f2, B:109:0x0209, B:111:0x0213, B:113:0x0219, B:114:0x0228, B:116:0x022e, B:119:0x0245, B:121:0x0254, B:123:0x025a, B:124:0x0261, B:126:0x026b, B:128:0x0271, B:129:0x0280, B:131:0x0286, B:136:0x029d, B:138:0x02aa, B:143:0x02b7, B:145:0x02c1, B:149:0x02cd, B:150:0x02d1, B:152:0x02d7, B:247:0x0403, B:249:0x040d, B:251:0x0413, B:253:0x041c, B:255:0x0426, B:257:0x042c, B:260:0x0435, B:155:0x02e0, B:160:0x02ef, B:163:0x02f8, B:167:0x0305, B:171:0x0312, B:175:0x031e, B:178:0x0327, B:181:0x0330, B:185:0x033c, B:189:0x0348, B:193:0x0354, B:196:0x035e, B:200:0x036b, B:204:0x0379, B:208:0x0387, B:211:0x0391, B:215:0x039f, B:219:0x03ad, B:223:0x03bb, B:227:0x03c9, B:231:0x03d7, B:235:0x03e5, B:246:0x03fd, B:39:0x00a8, B:262:0x0445, B:263:0x044a, B:264:0x044b, B:265:0x044f, B:266:0x0450, B:267:0x0455, B:19:0x003e), top: B:281:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:24:0x005e, B:26:0x0072, B:28:0x007c, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009d, B:38:0x00a3, B:40:0x00ac, B:42:0x00b6, B:47:0x00c1, B:49:0x00cb, B:54:0x00d6, B:56:0x00e0, B:60:0x00e9, B:62:0x0103, B:66:0x010c, B:68:0x0126, B:72:0x012f, B:74:0x0149, B:79:0x0153, B:81:0x015f, B:83:0x0165, B:84:0x0174, B:86:0x017a, B:89:0x0191, B:91:0x019b, B:93:0x01a1, B:94:0x01b0, B:96:0x01b6, B:99:0x01cd, B:101:0x01d7, B:103:0x01dd, B:104:0x01ec, B:106:0x01f2, B:109:0x0209, B:111:0x0213, B:113:0x0219, B:114:0x0228, B:116:0x022e, B:119:0x0245, B:121:0x0254, B:123:0x025a, B:124:0x0261, B:126:0x026b, B:128:0x0271, B:129:0x0280, B:131:0x0286, B:136:0x029d, B:138:0x02aa, B:143:0x02b7, B:145:0x02c1, B:149:0x02cd, B:150:0x02d1, B:152:0x02d7, B:247:0x0403, B:249:0x040d, B:251:0x0413, B:253:0x041c, B:255:0x0426, B:257:0x042c, B:260:0x0435, B:155:0x02e0, B:160:0x02ef, B:163:0x02f8, B:167:0x0305, B:171:0x0312, B:175:0x031e, B:178:0x0327, B:181:0x0330, B:185:0x033c, B:189:0x0348, B:193:0x0354, B:196:0x035e, B:200:0x036b, B:204:0x0379, B:208:0x0387, B:211:0x0391, B:215:0x039f, B:219:0x03ad, B:223:0x03bb, B:227:0x03c9, B:231:0x03d7, B:235:0x03e5, B:246:0x03fd, B:39:0x00a8, B:262:0x0445, B:263:0x044a, B:264:0x044b, B:265:0x044f, B:266:0x0450, B:267:0x0455, B:19:0x003e), top: B:281:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0426 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:24:0x005e, B:26:0x0072, B:28:0x007c, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009d, B:38:0x00a3, B:40:0x00ac, B:42:0x00b6, B:47:0x00c1, B:49:0x00cb, B:54:0x00d6, B:56:0x00e0, B:60:0x00e9, B:62:0x0103, B:66:0x010c, B:68:0x0126, B:72:0x012f, B:74:0x0149, B:79:0x0153, B:81:0x015f, B:83:0x0165, B:84:0x0174, B:86:0x017a, B:89:0x0191, B:91:0x019b, B:93:0x01a1, B:94:0x01b0, B:96:0x01b6, B:99:0x01cd, B:101:0x01d7, B:103:0x01dd, B:104:0x01ec, B:106:0x01f2, B:109:0x0209, B:111:0x0213, B:113:0x0219, B:114:0x0228, B:116:0x022e, B:119:0x0245, B:121:0x0254, B:123:0x025a, B:124:0x0261, B:126:0x026b, B:128:0x0271, B:129:0x0280, B:131:0x0286, B:136:0x029d, B:138:0x02aa, B:143:0x02b7, B:145:0x02c1, B:149:0x02cd, B:150:0x02d1, B:152:0x02d7, B:247:0x0403, B:249:0x040d, B:251:0x0413, B:253:0x041c, B:255:0x0426, B:257:0x042c, B:260:0x0435, B:155:0x02e0, B:160:0x02ef, B:163:0x02f8, B:167:0x0305, B:171:0x0312, B:175:0x031e, B:178:0x0327, B:181:0x0330, B:185:0x033c, B:189:0x0348, B:193:0x0354, B:196:0x035e, B:200:0x036b, B:204:0x0379, B:208:0x0387, B:211:0x0391, B:215:0x039f, B:219:0x03ad, B:223:0x03bb, B:227:0x03c9, B:231:0x03d7, B:235:0x03e5, B:246:0x03fd, B:39:0x00a8, B:262:0x0445, B:263:0x044a, B:264:0x044b, B:265:0x044f, B:266:0x0450, B:267:0x0455, B:19:0x003e), top: B:281:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0450 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:24:0x005e, B:26:0x0072, B:28:0x007c, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:36:0x009d, B:38:0x00a3, B:40:0x00ac, B:42:0x00b6, B:47:0x00c1, B:49:0x00cb, B:54:0x00d6, B:56:0x00e0, B:60:0x00e9, B:62:0x0103, B:66:0x010c, B:68:0x0126, B:72:0x012f, B:74:0x0149, B:79:0x0153, B:81:0x015f, B:83:0x0165, B:84:0x0174, B:86:0x017a, B:89:0x0191, B:91:0x019b, B:93:0x01a1, B:94:0x01b0, B:96:0x01b6, B:99:0x01cd, B:101:0x01d7, B:103:0x01dd, B:104:0x01ec, B:106:0x01f2, B:109:0x0209, B:111:0x0213, B:113:0x0219, B:114:0x0228, B:116:0x022e, B:119:0x0245, B:121:0x0254, B:123:0x025a, B:124:0x0261, B:126:0x026b, B:128:0x0271, B:129:0x0280, B:131:0x0286, B:136:0x029d, B:138:0x02aa, B:143:0x02b7, B:145:0x02c1, B:149:0x02cd, B:150:0x02d1, B:152:0x02d7, B:247:0x0403, B:249:0x040d, B:251:0x0413, B:253:0x041c, B:255:0x0426, B:257:0x042c, B:260:0x0435, B:155:0x02e0, B:160:0x02ef, B:163:0x02f8, B:167:0x0305, B:171:0x0312, B:175:0x031e, B:178:0x0327, B:181:0x0330, B:185:0x033c, B:189:0x0348, B:193:0x0354, B:196:0x035e, B:200:0x036b, B:204:0x0379, B:208:0x0387, B:211:0x0391, B:215:0x039f, B:219:0x03ad, B:223:0x03bb, B:227:0x03c9, B:231:0x03d7, B:235:0x03e5, B:246:0x03fd, B:39:0x00a8, B:262:0x0445, B:263:0x044a, B:264:0x044b, B:265:0x044f, B:266:0x0450, B:267:0x0455, B:19:0x003e), top: B:281:0x0028 }] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r28, defpackage.n42 r29) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.e(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x004d, B:24:0x0061, B:26:0x0070, B:28:0x0076, B:29:0x007c, B:31:0x0082, B:34:0x008f, B:36:0x0099, B:40:0x00a2, B:43:0x00b2, B:45:0x00bc, B:47:0x00c2, B:48:0x00cd, B:50:0x00d3, B:52:0x00df, B:55:0x00e7, B:58:0x00ee, B:59:0x00f0, B:61:0x00fb, B:65:0x0104, B:67:0x010a, B:68:0x0122, B:70:0x012d, B:75:0x0138, B:77:0x0142, B:82:0x014d, B:84:0x0157, B:86:0x015d, B:88:0x0164, B:89:0x016e, B:91:0x0174, B:92:0x0178, B:93:0x0179, B:94:0x017e, B:18:0x0037), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x004d, B:24:0x0061, B:26:0x0070, B:28:0x0076, B:29:0x007c, B:31:0x0082, B:34:0x008f, B:36:0x0099, B:40:0x00a2, B:43:0x00b2, B:45:0x00bc, B:47:0x00c2, B:48:0x00cd, B:50:0x00d3, B:52:0x00df, B:55:0x00e7, B:58:0x00ee, B:59:0x00f0, B:61:0x00fb, B:65:0x0104, B:67:0x010a, B:68:0x0122, B:70:0x012d, B:75:0x0138, B:77:0x0142, B:82:0x014d, B:84:0x0157, B:86:0x015d, B:88:0x0164, B:89:0x016e, B:91:0x0174, B:92:0x0178, B:93:0x0179, B:94:0x017e, B:18:0x0037), top: B:108:0x0022 }] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ks3] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.f(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x004c, B:24:0x004f, B:26:0x0063, B:28:0x0072, B:29:0x007c, B:31:0x0082, B:33:0x0098, B:37:0x00a1, B:39:0x00ab, B:43:0x00b4, B:45:0x00be, B:49:0x00c7, B:51:0x00cf, B:52:0x00d3, B:18:0x0036), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x004c, B:24:0x004f, B:26:0x0063, B:28:0x0072, B:29:0x007c, B:31:0x0082, B:33:0x0098, B:37:0x00a1, B:39:0x00ab, B:43:0x00b4, B:45:0x00be, B:49:0x00c7, B:51:0x00cf, B:52:0x00d3, B:18:0x0036), top: B:66:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(defpackage.n42 r9) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.g(n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x004c, B:24:0x0060, B:26:0x006f, B:27:0x0079, B:29:0x007f, B:31:0x0095, B:35:0x009e, B:37:0x00a8, B:41:0x00b1, B:43:0x00bb, B:47:0x00c4, B:49:0x00cc, B:50:0x00d0, B:51:0x00d1, B:52:0x00d6, B:18:0x0036), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:22:0x004c, B:24:0x0060, B:26:0x006f, B:27:0x0079, B:29:0x007f, B:31:0x0095, B:35:0x009e, B:37:0x00a8, B:41:0x00b1, B:43:0x00bb, B:47:0x00c4, B:49:0x00cc, B:50:0x00d0, B:51:0x00d1, B:52:0x00d6, B:18:0x0036), top: B:66:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(defpackage.n42 r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.h(n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:23:0x004b, B:25:0x0053, B:27:0x0067, B:29:0x0076, B:30:0x0080, B:32:0x0086, B:37:0x00a0, B:38:0x00a6, B:40:0x00b0, B:43:0x00b7, B:45:0x00ca, B:46:0x00ce, B:18:0x0034), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:23:0x004b, B:25:0x0053, B:27:0x0067, B:29:0x0076, B:30:0x0080, B:32:0x0086, B:37:0x00a0, B:38:0x00a6, B:40:0x00b0, B:43:0x00b7, B:45:0x00ca, B:46:0x00ce, B:18:0x0034), top: B:52:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, java.lang.String r7, java.lang.String r8, defpackage.n42 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.mta
            if (r0 == 0) goto L13
            r0 = r9
            mta r0 = (defpackage.mta) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mta r0 = new mta
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L28
            goto L49
        L28:
            r5 = move-exception
            goto Lcf
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L31:
            defpackage.hre.r(r9)
            zm9 r9 = r5.b     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = o(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}     // Catch: java.lang.Throwable -> L28
            r0.c = r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r9.e(r6, r4, r7, r0)     // Catch: java.lang.Throwable -> L28
            n82 r6 = defpackage.n82.a
            if (r9 != r6) goto L49
            return r6
        L49:
            if (r9 != 0) goto L53
            fua r5 = new fua     // Catch: java.lang.Throwable -> L28
            ks3 r6 = defpackage.ks3.a     // Catch: java.lang.Throwable -> L28
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L28
            return r5
        L53:
            q36 r6 = defpackage.r36.d     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L28
            k46 r6 = r6.c(r7)     // Catch: java.lang.Throwable -> L28
            d56 r6 = defpackage.l46.g(r6)     // Catch: java.lang.Throwable -> L28
            boolean r7 = m(r6)     // Catch: java.lang.Throwable -> L28
            if (r7 == 0) goto Lca
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L28
            r7.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "data"
            java.lang.Object r8 = r6.get(r8)     // Catch: java.lang.Throwable -> L28
            k46 r8 = (defpackage.k46) r8     // Catch: java.lang.Throwable -> L28
            if (r8 == 0) goto La6
            t36 r8 = defpackage.l46.f(r8)     // Catch: java.lang.Throwable -> L28
            java.util.List r8 = r8.a     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L28
        L80:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto La6
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L28
            k46 r9 = (defpackage.k46) r9     // Catch: java.lang.Throwable -> L28
            d56 r9 = defpackage.l46.g(r9)     // Catch: java.lang.Throwable -> L28
            cua r9 = r5.s(r9)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r9.a     // Catch: java.lang.Throwable -> L28
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L28
            if (r0 <= 0) goto L9d
            goto L9e
        L9d:
            r9 = r4
        L9e:
            if (r9 == 0) goto L80
            java.lang.String r0 = r9.c     // Catch: java.lang.Throwable -> L28
            r7.put(r0, r9)     // Catch: java.lang.Throwable -> L28
            goto L80
        La6:
            java.lang.String r5 = "data2"
            java.lang.Object r5 = r6.get(r5)     // Catch: java.lang.Throwable -> L28
            k46 r5 = (defpackage.k46) r5     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto Lb4
            java.lang.String r4 = defpackage.oc2.x(r5)     // Catch: java.lang.Throwable -> L28
        Lb4:
            if (r4 != 0) goto Lb7
            r4 = r3
        Lb7:
            fua r5 = new fua     // Catch: java.lang.Throwable -> L28
            java.util.Collection r6 = r7.values()     // Catch: java.lang.Throwable -> L28
            r6.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L28
            java.util.List r6 = defpackage.sl1.C0(r6)     // Catch: java.lang.Throwable -> L28
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L28
            return r5
        Lca:
            tr9 r5 = p(r6)     // Catch: java.lang.Throwable -> L28
            throw r5     // Catch: java.lang.Throwable -> L28
        Lcf:
            boolean r6 = r5 instanceof defpackage.tr9
            if (r6 != 0) goto Ld9
            tr9 r5 = new tr9
            r5.<init>(r3, r3, r2)
            throw r5
        Ld9:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.i(java.lang.String, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public final a84 j() {
        return (a84) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:26:0x0061, B:28:0x0075, B:30:0x0084, B:32:0x008a, B:33:0x0090, B:35:0x0096, B:38:0x00a5, B:40:0x00ad, B:41:0x00b1, B:42:0x00b2, B:43:0x00b7, B:18:0x0036, B:20:0x0042, B:22:0x004c), top: B:57:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0026, B:26:0x0061, B:28:0x0075, B:30:0x0084, B:32:0x008a, B:33:0x0090, B:35:0x0096, B:38:0x00a5, B:40:0x00ad, B:41:0x00b1, B:42:0x00b2, B:43:0x00b7, B:18:0x0036, B:20:0x0042, B:22:0x004c), top: B:57:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nta
            if (r0 == 0) goto L13
            r0 = r8
            nta r0 = (defpackage.nta) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nta r0 = new nta
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            n82 r1 = defpackage.n82.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            java.lang.String r5 = ""
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L2a
            goto L5f
        L2a:
            r6 = move-exception
            goto Lb8
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L33:
            defpackage.hre.r(r8)
            a84 r8 = r6.j()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r8 = r8.g     // Catch: java.lang.Throwable -> L2a
            int r2 = r8.length()     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L4c
            eua r6 = new eua     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L2a
            java.util.List r6 = defpackage.tl1.A(r6)     // Catch: java.lang.Throwable -> L2a
            return r6
        L4c:
            zm9 r6 = r6.b     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = o(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L2a
            r0.c = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r6.e(r8, r3, r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r1) goto L5f
            return r1
        L5f:
            if (r8 == 0) goto Lb2
            q36 r6 = defpackage.r36.d     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L2a
            k46 r6 = r6.c(r7)     // Catch: java.lang.Throwable -> L2a
            d56 r6 = defpackage.l46.g(r6)     // Catch: java.lang.Throwable -> L2a
            boolean r7 = m(r6)     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto Lad
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            r7.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r8 = "data"
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L2a
            k46 r6 = (defpackage.k46) r6     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto Lac
            t36 r6 = defpackage.oc2.A(r6)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto Lac
            java.util.List r6 = r6.a     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L2a
        L90:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto Lac
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L2a
            k46 r8 = (defpackage.k46) r8     // Catch: java.lang.Throwable -> L2a
            eua r0 = new eua     // Catch: java.lang.Throwable -> L2a
            java.lang.String r8 = defpackage.oc2.x(r8)     // Catch: java.lang.Throwable -> L2a
            if (r8 != 0) goto La5
            r8 = r5
        La5:
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            r7.add(r0)     // Catch: java.lang.Throwable -> L2a
            goto L90
        Lac:
            return r7
        Lad:
            tr9 r6 = p(r6)     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        Lb2:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2a
            r6.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r6     // Catch: java.lang.Throwable -> L2a
        Lb8:
            java.lang.String r7 = r6.getMessage()
            if (r7 != 0) goto Lbf
            r7 = r5
        Lbf:
            boolean r8 = defpackage.jy.a()
            if (r8 == 0) goto Ld8
            kw6 r8 = defpackage.kw6.b
            iea r0 = defpackage.iea.e
            z56 r1 = r8.a
            iea r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto Ld8
            java.lang.String r1 = "Log"
            r8.a(r0, r1, r7, r6)
        Ld8:
            boolean r7 = r6 instanceof defpackage.tr9
            if (r7 != 0) goto Le2
            tr9 r6 = new tr9
            r6.<init>(r5, r5, r4)
            throw r6
        Le2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.k(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0270 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0389 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04d7 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x050a A[Catch: all -> 0x004c, LOOP:0: B:286:0x0504->B:288:0x050a, LOOP_END, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x053a A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r30, defpackage.n42 r31) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.l(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vta r(defpackage.d56 r11) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.r(d56):vta");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cua s(defpackage.d56 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "host"
            java.lang.Object r0 = r10.get(r0)
            k46 r0 = (defpackage.k46) r0
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = defpackage.oc2.x(r0)
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r2 = ""
            if (r0 != 0) goto L16
            r0 = r2
        L16:
            int r3 = r0.length()
            if (r3 != 0) goto L20
            un2 r9 = r9.a
            java.lang.String r0 = r9.e
        L20:
            java.lang.String r9 = "name"
            java.lang.Object r9 = r10.get(r9)
            k46 r9 = (defpackage.k46) r9
            if (r9 == 0) goto L2f
            java.lang.String r9 = defpackage.oc2.x(r9)
            goto L30
        L2f:
            r9 = r1
        L30:
            if (r9 != 0) goto L34
            r4 = r2
            goto L35
        L34:
            r4 = r9
        L35:
            java.lang.String r9 = "cover"
            java.lang.Object r9 = r10.get(r9)
            k46 r9 = (defpackage.k46) r9
            if (r9 == 0) goto L54
            java.lang.String r9 = defpackage.oc2.x(r9)
            if (r9 == 0) goto L54
            boolean r3 = defpackage.k4b.j0(r9)
            if (r3 != 0) goto L4c
            goto L4d
        L4c:
            r9 = r1
        L4d:
            if (r9 == 0) goto L54
            java.lang.String r9 = n(r9, r0)
            goto L55
        L54:
            r9 = r1
        L55:
            if (r9 != 0) goto L59
            r5 = r2
            goto L5a
        L59:
            r5 = r9
        L5a:
            java.lang.String r9 = "link"
            java.lang.Object r9 = r10.get(r9)
            k46 r9 = (defpackage.k46) r9
            if (r9 == 0) goto L69
            java.lang.String r9 = defpackage.oc2.x(r9)
            goto L6a
        L69:
            r9 = r1
        L6a:
            if (r9 != 0) goto L6d
            r9 = r2
        L6d:
            java.lang.CharSequence r9 = defpackage.k4b.N0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r6 = n(r9, r0)
            java.lang.String r9 = "description"
            java.lang.Object r9 = r10.get(r9)
            k46 r9 = (defpackage.k46) r9
            if (r9 == 0) goto L88
            java.lang.String r9 = defpackage.oc2.x(r9)
            goto L89
        L88:
            r9 = r1
        L89:
            if (r9 != 0) goto L8d
            r7 = r2
            goto L8e
        L8d:
            r7 = r9
        L8e:
            java.lang.String r9 = "tag"
            java.lang.Object r9 = r10.get(r9)
            k46 r9 = (defpackage.k46) r9
            if (r9 == 0) goto L9c
            java.lang.String r1 = defpackage.oc2.x(r9)
        L9c:
            if (r1 != 0) goto La0
            r8 = r2
            goto La1
        La0:
            r8 = r1
        La1:
            cua r3 = new cua
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pta.s(d56):cua");
    }
}
