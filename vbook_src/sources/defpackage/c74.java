package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c74  reason: default package */
/* loaded from: classes3.dex */
public final class c74 implements n64 {
    public final ii2 a;
    public final dx b;
    public final re5 c;
    public final i34 d;
    public final cza e = dza.a(null);

    public c74(ii2 ii2Var, dx dxVar, re5 re5Var, i34 i34Var) {
        this.a = ii2Var;
        this.b = dxVar;
        this.c = re5Var;
        this.d = i34Var;
    }

    public final void a(String str) {
        ii2 ii2Var = this.a;
        gk2 gk2Var = ii2Var.I;
        gk2Var.getClass();
        str.getClass();
        ((mm) gk2Var.a).q(-1605821191, "DELETE FROM DbExtension\nWHERE id = ?", new ui2(str, 14));
        gk2Var.C(-1605821191, new ao2(1));
        ii2Var.J.d0(str);
        this.d.b(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|(1:20)(2:23|24)))(1:25))(1:33)|26|27|28|29))|35|6|7|(0)(0)|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r11 == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (r11 != r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (defpackage.g54.a.b(r9.a, r3, r10, false, (byte[]) r11, r7) == r8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, defpackage.n42 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.o64
            if (r0 == 0) goto L14
            r0 = r11
            o64 r0 = (defpackage.o64) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            o64 r0 = new o64
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.b
            int r0 = r7.d
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r8 = defpackage.n82.a
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3d
            if (r0 == r2) goto L37
            if (r0 != r1) goto L31
            defpackage.hre.r(r11)
            goto La8
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r4
        L37:
            java.lang.String r10 = r7.a
            defpackage.hre.r(r11)
            goto L8a
        L3d:
            java.lang.String r10 = r7.a
            defpackage.hre.r(r11)
            goto L68
        L43:
            defpackage.hre.r(r11)
            gh5 r11 = new gh5
            r11.<init>()
            h40 r0 = defpackage.hh5.a
            r10.getClass()
            xtc r0 = r11.a
            defpackage.ytc.b(r0, r10)
            pg5 r0 = defpackage.pg5.b
            re5 r5 = r9.c
            hi5 r11 = defpackage.rs8.c(r11, r0, r11, r5)
            r7.a = r10
            r7.d = r3
            java.lang.Object r11 = r11.c(r7)
            if (r11 != r8) goto L68
            goto La7
        L68:
            oh5 r11 = (defpackage.oh5) r11
            te5 r11 = r11.y0()
            java.lang.Class<byte[]> r0 = byte[].class
            gi1 r3 = defpackage.cm9.a(r0)
            nsc r0 = defpackage.cm9.d(r0)     // Catch: java.lang.Throwable -> L79
            goto L7a
        L79:
            r0 = r4
        L7a:
            isc r5 = new isc
            r5.<init>(r3, r0)
            r7.a = r10
            r7.d = r2
            java.lang.Object r11 = r11.a(r5, r7)
            if (r11 != r8) goto L8a
            goto La7
        L8a:
            if (r11 == 0) goto Lab
            r6 = r11
            byte[] r6 = (byte[]) r6
            byte[] r11 = defpackage.r4b.H(r10)
            java.lang.String r3 = defpackage.kxe.p(r11)
            r7.a = r4
            r7.d = r1
            g54 r1 = defpackage.g54.a
            ii2 r2 = r9.a
            r5 = 0
            r4 = r10
            java.lang.Object r9 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r9 != r8) goto La8
        La7:
            return r8
        La8:
            pvc r9 = defpackage.pvc.a
            return r9
        Lab:
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.ByteArray"
            defpackage.xk5.k(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.b(java.lang.String, n42):java.lang.Object");
    }

    public final Object c(String str, aab aabVar) {
        Object obj;
        String str2;
        Object gs9Var;
        String Q0;
        Iterator it = this.a.I.u0().c().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                boolean z = false;
                try {
                    String str3 = ((vx4) obj).b;
                    str3.getClass();
                    Pattern compile = Pattern.compile(str3);
                    compile.getClass();
                    str.getClass();
                    boolean z2 = true;
                    if (!compile.matcher(str).matches()) {
                        if (r4b.Q(str, "https://", false)) {
                            Q0 = k4b.Q0(k4b.t0(str, "https://"), '/');
                        } else if (r4b.Q(str, "http://", false)) {
                            Q0 = k4b.Q0(k4b.t0(str, "http://"), '/');
                        } else {
                            Q0 = k4b.Q0(str, '/');
                        }
                        Q0.getClass();
                        if (!compile.matcher(Q0).matches()) {
                            z2 = false;
                        }
                    }
                    gs9Var = Boolean.valueOf(z2);
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                if (gs9Var instanceof gs9) {
                    gs9Var = null;
                }
                Boolean bool = (Boolean) gs9Var;
                if (bool != null) {
                    z = bool.booleanValue();
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        vx4 vx4Var = (vx4) obj;
        if (vx4Var != null) {
            str2 = vx4Var.a;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return z1d.E(e(str2), aabVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(8:11|12|13|(3:15|(60:18|(2:20|(1:22)(57:23|24|(1:26)(1:158)|27|(52:34|35|(2:37|(1:39)(49:40|(1:42)|43|(1:154)(1:45)|46|(1:48)(4:149|150|(1:152)|153)|49|(2:51|(1:53)(41:54|(1:56)|57|(2:59|(1:61)(36:62|(1:64)|65|(1:146)(1:69)|70|(2:72|(1:74)(30:75|(1:77)|78|(1:80)(2:141|(1:143)(1:144))|81|82|(2:84|(1:86)(23:87|(1:89)(1:139)|90|(2:92|(1:94)(19:95|(1:97)(1:137)|98|(1:102)|103|(2:105|(1:107)(13:108|109|(1:111)(1:135)|(1:113)(1:134)|(1:115)(1:133)|(1:117)(1:132)|(1:119)|120|(2:122|(1:124)(4:125|(1:127)(1:130)|128|129))|131|(0)(0)|128|129))|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129))|138|(0)(0)|98|(2:100|102)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129))|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129))|145|(0)|78|(0)(0)|81|82|(0)|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129))|147|(0)|65|(1:67)|146|70|(0)|145|(0)|78|(0)(0)|81|82|(0)|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129))|148|(0)|57|(0)|147|(0)|65|(0)|146|70|(0)|145|(0)|78|(0)(0)|81|82|(0)|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129))|156|(0)|43|(0)(0)|46|(0)(0)|49|(0)|148|(0)|57|(0)|147|(0)|65|(0)|146|70|(0)|145|(0)|78|(0)(0)|81|82|(0)|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129)|157|35|(0)|156|(0)|43|(0)(0)|46|(0)(0)|49|(0)|148|(0)|57|(0)|147|(0)|65|(0)|146|70|(0)|145|(0)|78|(0)(0)|81|82|(0)|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129))|159|24|(0)(0)|27|(54:29|31|34|35|(0)|156|(0)|43|(0)(0)|46|(0)(0)|49|(0)|148|(0)|57|(0)|147|(0)|65|(0)|146|70|(0)|145|(0)|78|(0)(0)|81|82|(0)|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129)|157|35|(0)|156|(0)|43|(0)(0)|46|(0)(0)|49|(0)|148|(0)|57|(0)|147|(0)|65|(0)|146|70|(0)|145|(0)|78|(0)(0)|81|82|(0)|140|(0)(0)|90|(0)|138|(0)(0)|98|(0)|103|(0)|136|109|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)|120|(0)|131|(0)(0)|128|129|16)|160)|162|(1:164)(1:171)|165|(1:170)(2:167|168))(2:172|173))(2:174|175))(3:180|181|(2:183|178))|176|(7:179|13|(0)|162|(0)(0)|165|(0)(0))|178))|186|6|7|(0)(0)|176|(0)|178) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02de, code lost:
        r4 = new defpackage.gs9(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
        if (r0.equalsIgnoreCase("und") == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a4 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bf A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01dd A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01eb A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020f A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022d A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0249 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0267 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027c A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0287 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0296 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b2 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142 A[Catch: all -> 0x014c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0033, B:30:0x0093, B:32:0x00a7, B:33:0x00b1, B:35:0x00b7, B:37:0x00cb, B:40:0x00d4, B:47:0x00e3, B:49:0x00ed, B:51:0x00f3, B:54:0x00f8, B:56:0x00fe, B:58:0x010c, B:61:0x0115, B:65:0x011e, B:81:0x0159, B:83:0x016b, B:86:0x0174, B:90:0x017d, B:92:0x0187, B:95:0x0190, B:99:0x0199, B:101:0x01a4, B:103:0x01ae, B:105:0x01b7, B:107:0x01bf, B:110:0x01c8, B:114:0x01d1, B:116:0x01dd, B:122:0x0207, B:124:0x020f, B:127:0x0218, B:132:0x0223, B:134:0x022d, B:137:0x0236, B:142:0x0241, B:144:0x0249, B:146:0x0257, B:147:0x025b, B:149:0x0267, B:152:0x0270, B:154:0x0276, B:156:0x027c, B:159:0x0287, B:165:0x0296, B:169:0x029f, B:171:0x02b2, B:174:0x02bb, B:179:0x02c8, B:118:0x01eb, B:120:0x01f1, B:121:0x01fe, B:77:0x0152, B:80:0x0157, B:68:0x0135, B:20:0x0048, B:26:0x0079, B:23:0x004f, B:73:0x0142), top: B:191:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0198  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9, types: [mv6] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [gs9] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r30, defpackage.n42 r31) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.d(java.lang.String, n42):java.io.Serializable");
    }

    public final hg3 e(String str) {
        str.getClass();
        s02 O = v9e.O(this.a.I.k0(str));
        sw2 sw2Var = ab3.a;
        return new hg3(v9e.B(O, ru2.c), 1);
    }

    public final hs0 f() {
        gk2 gk2Var = this.a.I;
        gk2Var.getClass();
        io2 io2Var = io2.a;
        mm mmVar = (mm) gk2Var.a;
        zn2 zn2Var = new zn2(gk2Var, 2);
        mmVar.getClass();
        s02 O = v9e.O(new xla(1737905505, new String[]{"DbExtension"}, mmVar, "DbExtension.sq", "getReadExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0 AND (type = 1 OR type = 2 OR type = 3 OR type = 4)\nORDER BY development DESC, pinedAt DESC, lastUse DESC, updateAt DESC", zn2Var));
        sw2 sw2Var = ab3.a;
        return new hs0(v9e.z(O, ru2.c), 6);
    }

    public final l54 g() {
        un2 un2Var;
        dx dxVar = this.b;
        u68 u68Var = dxVar.R;
        r76[] r76VarArr = dx.W;
        String str = (String) u68Var.c(r76VarArr[44], dxVar);
        int length = str.length();
        cza czaVar = this.e;
        ii2 ii2Var = this.a;
        if (length > 0 && (un2Var = (un2) ii2Var.I.k0(str).e()) != null) {
            czaVar.m(un2Var.a);
            return sze.n(un2Var);
        }
        gk2 gk2Var = ii2Var.I;
        gk2Var.getClass();
        do2 do2Var = do2.a;
        mm mmVar = (mm) gk2Var.a;
        zn2 zn2Var = new zn2(gk2Var, 4);
        mmVar.getClass();
        un2 un2Var2 = (un2) new xla(222553226, new String[]{"DbExtension"}, mmVar, "DbExtension.sq", "findLastUse", "SELECT DbExtension.id, DbExtension.name, DbExtension.author, DbExtension.version, DbExtension.source, DbExtension.path, DbExtension.regex, DbExtension.icon, DbExtension.description, DbExtension.language, DbExtension.type, DbExtension.nsfw, DbExtension.development, DbExtension.draft, DbExtension.encrypt, DbExtension.scriptMetadata, DbExtension.settingMetadata, DbExtension.scriptData, DbExtension.settingData, DbExtension.translateData, DbExtension.pinedAt, DbExtension.lastUse, DbExtension.createAt, DbExtension.updateAt\nFROM DbExtension\nWHERE draft = 0 AND (type = 1 OR type = 2 OR type = 3 OR type = 4)\nORDER BY lastUse DESC\nLIMIT 1", zn2Var).e();
        if (un2Var2 == null) {
            return null;
        }
        String str2 = un2Var2.a;
        str2.getClass();
        u68Var.e(r76VarArr[44], str2);
        czaVar.getClass();
        czaVar.n(null, str2);
        return sze.n(un2Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r11 == r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r11 != r8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.f76 r10, defpackage.n42 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.a74
            if (r0 == 0) goto L14
            r0 = r11
            a74 r0 = (defpackage.a74) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            a74 r0 = new a74
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.b
            int r0 = r7.d
            r1 = 2
            r2 = 1
            r3 = 0
            n82 r8 = defpackage.n82.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2d
            defpackage.hre.r(r11)
            goto L6b
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r3
        L33:
            f76 r10 = r7.a
            defpackage.hre.r(r11)
            goto L47
        L39:
            defpackage.hre.r(r11)
            r7.a = r10
            r7.d = r2
            java.lang.Object r11 = r10.a(r7)
            if (r11 != r8) goto L47
            goto L6a
        L47:
            r6 = r11
            byte[] r6 = (byte[]) r6
            java.lang.String r11 = r10.b()
            byte[] r11 = defpackage.r4b.H(r11)
            java.lang.String r11 = defpackage.kxe.p(r11)
            java.lang.String r4 = r10.b()
            r7.a = r3
            r7.d = r1
            g54 r1 = defpackage.g54.a
            ii2 r2 = r9.a
            r5 = 1
            r3 = r11
            java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r11 != r8) goto L6b
        L6a:
            return r8
        L6b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L76
            pvc r9 = defpackage.pvc.a
            return r9
        L76:
            e60 r9 = new e60
            r10 = 9
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.h(f76, n42):java.lang.Object");
    }

    public final void i(String str, boolean z) {
        long j;
        gk2 gk2Var = this.a.I;
        if (z) {
            j = by5.a.k().b();
        } else {
            j = 0;
        }
        gk2Var.getClass();
        str.getClass();
        ((mm) gk2Var.a).q(1129385223, "UPDATE DbExtension\nSET pinedAt = ?\nWHERE id = ?", new ik2(str, j, 7));
        gk2Var.C(1129385223, new ao2(7));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(4:12|13|14|(1:19)(2:16|17))(2:20|21))(3:22|23|(1:25)(2:28|29)))(2:30|31))(3:41|42|(2:44|27))|32|33|34|35|(2:37|27)(2:38|(0)(0))))|47|6|7|(0)(0)|32|33|34|35|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r10 == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
        r10 = new defpackage.gs9(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:41:0x00a1, B:20:0x003c, B:38:0x0092, B:42:0x00a4, B:43:0x00ab, B:23:0x0042, B:29:0x006f, B:33:0x007f, B:26:0x0049), top: B:50:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:41:0x00a1, B:20:0x003c, B:38:0x0092, B:42:0x00a4, B:43:0x00ab, B:23:0x0042, B:29:0x006f, B:33:0x007f, B:26:0x0049), top: B:50:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r9, defpackage.n42 r10) {
        /*
            r8 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = r10 instanceof defpackage.b74
            if (r1 == 0) goto L15
            r1 = r10
            b74 r1 = (defpackage.b74) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            b74 r1 = new b74
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.b
            int r2 = r1.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r2 == 0) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L34
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L31
            goto La1
        L31:
            r8 = move-exception
            goto Lac
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L3a:
            java.lang.String r8 = r1.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L31
            goto L90
        L40:
            java.lang.String r9 = r1.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L31
            goto L6f
        L46:
            defpackage.hre.r(r10)
            re5 r8 = r8.c     // Catch: java.lang.Throwable -> L31
            gh5 r10 = new gh5     // Catch: java.lang.Throwable -> L31
            r10.<init>()     // Catch: java.lang.Throwable -> L31
            h40 r2 = defpackage.hh5.a     // Catch: java.lang.Throwable -> L31
            r9.getClass()     // Catch: java.lang.Throwable -> L31
            xtc r2 = r10.a     // Catch: java.lang.Throwable -> L31
            defpackage.ytc.b(r2, r9)     // Catch: java.lang.Throwable -> L31
            pg5 r2 = defpackage.pg5.b     // Catch: java.lang.Throwable -> L31
            r10.d(r2)     // Catch: java.lang.Throwable -> L31
            hi5 r2 = new hi5     // Catch: java.lang.Throwable -> L31
            r2.<init>(r10, r8)     // Catch: java.lang.Throwable -> L31
            r1.a = r9     // Catch: java.lang.Throwable -> L31
            r1.d = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.c(r1)     // Catch: java.lang.Throwable -> L31
            if (r10 != r7) goto L6f
            goto La0
        L6f:
            oh5 r10 = (defpackage.oh5) r10     // Catch: java.lang.Throwable -> L31
            te5 r8 = r10.y0()     // Catch: java.lang.Throwable -> L31
            gi1 r10 = defpackage.cm9.a(r0)     // Catch: java.lang.Throwable -> L31
            nsc r0 = defpackage.cm9.d(r0)     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
            r0 = r6
        L7f:
            isc r2 = new isc     // Catch: java.lang.Throwable -> L31
            r2.<init>(r10, r0)     // Catch: java.lang.Throwable -> L31
            r1.a = r9     // Catch: java.lang.Throwable -> L31
            r1.d = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r8.a(r2, r1)     // Catch: java.lang.Throwable -> L31
            if (r10 != r7) goto L8f
            goto La0
        L8f:
            r8 = r9
        L90:
            if (r10 == 0) goto La4
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L31
            g54 r9 = defpackage.g54.a     // Catch: java.lang.Throwable -> L31
            r1.a = r6     // Catch: java.lang.Throwable -> L31
            r1.d = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r9.c(r8, r10, r1)     // Catch: java.lang.Throwable -> L31
            if (r10 != r7) goto La1
        La0:
            return r7
        La1:
            l54 r10 = (defpackage.l54) r10     // Catch: java.lang.Throwable -> L31
            goto Lb1
        La4:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.ByteArray"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        Lac:
            gs9 r10 = new gs9
            r10.<init>(r8)
        Lb1:
            boolean r8 = r10 instanceof defpackage.gs9
            if (r8 == 0) goto Lb6
            goto Lb7
        Lb6:
            r6 = r10
        Lb7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.j(java.lang.String, n42):java.lang.Object");
    }
}
