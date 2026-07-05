package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h68  reason: default package */
/* loaded from: classes3.dex */
public final class h68 implements dyb {
    public un2 C;
    public hk2 D;
    public final String a;
    public final ii2 b;
    public final re5 c;
    public final pb1 d;
    public final h1a e;
    public final sw7 f;

    public h68(String str, ii2 ii2Var, re5 re5Var, pb1 pb1Var, h1a h1aVar) {
        str.getClass();
        this.a = str;
        this.b = ii2Var;
        this.c = re5Var;
        this.d = pb1Var;
        this.e = h1aVar;
        this.f = new sw7();
    }

    public final un2 C() {
        String str;
        if (this.C == null) {
            ii2 ii2Var = this.b;
            gk2 gk2Var = ii2Var.c;
            String str2 = this.a;
            hk2 hk2Var = (hk2) gk2Var.k0(str2).d();
            this.D = hk2Var;
            un2 a = g54.a(ii2Var, hk2Var.j, hk2Var.l);
            this.C = a;
            String str3 = a.a;
            hk2 hk2Var2 = this.D;
            String str4 = null;
            if (hk2Var2 != null) {
                if (!c16.i(str3, hk2Var2.l)) {
                    un2 un2Var = this.C;
                    if (un2Var != null) {
                        str = un2Var.a;
                    } else {
                        str = null;
                    }
                    if (un2Var != null) {
                        str4 = un2Var.b;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    gk2Var.H0(str, str4, str2);
                }
            } else {
                c16.w("book");
                throw null;
            }
        }
        un2 un2Var2 = this.C;
        if (un2Var2 != null) {
            return un2Var2;
        }
        throw new Exception();
    }

    @Override // defpackage.dyb
    public final Object J0(int i, n42 n42Var, String str) {
        Map map;
        String str2;
        String a = this.d.a(str);
        String str3 = "";
        String str4 = null;
        if (a != null) {
            d56 g = l46.g(v46.a.c(a));
            k46 k46Var = (k46) g.get("title");
            if (k46Var != null) {
                str2 = oc2.x(k46Var);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            k46 k46Var2 = (k46) g.get("content");
            if (k46Var2 != null) {
                str4 = oc2.x(k46Var2);
            }
            if (str4 != null) {
                str3 = str4;
            }
            return new eyb(str2, str3);
        }
        ii2 ii2Var = this.b;
        gk2 gk2Var = ii2Var.U;
        StringBuilder sb = new StringBuilder();
        String str5 = this.a;
        sb.append(str5);
        sb.append("_");
        sb.append(i);
        String sb2 = sb.toString();
        gk2Var.getClass();
        wp2 wp2Var = wp2.a;
        tp2 tp2Var = (tp2) new vp2(gk2Var, sb2, new up2(gk2Var, 1), (byte) 0).e();
        xm2 xm2Var = (xm2) ii2Var.D.k0(str5 + "_" + i).e();
        if (xm2Var == null) {
            return null;
        }
        if (tp2Var != null && (map = tp2Var.c) != null) {
            str4 = (String) map.get("raw");
        }
        if (str4 == null) {
            str4 = "";
        }
        String str6 = (String) xm2Var.d.get("raw");
        if (str6 != null) {
            str3 = str6;
        }
        return new eyb(str4, str3);
    }

    @Override // defpackage.dyb
    public final hyb f() {
        Object gs9Var;
        String str;
        String str2;
        try {
            gs9Var = C();
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Map map = null;
        if (gs9Var instanceof gs9) {
            gs9Var = null;
        }
        un2 un2Var = (un2) gs9Var;
        if (un2Var != null) {
            str = un2Var.b;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (un2Var != null) {
            str2 = un2Var.a;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (un2Var != null) {
            map = un2Var.t;
        }
        if (map == null) {
            map = ls3.a;
        }
        return new hyb(str, str2, map, true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #8 {all -> 0x0088, blocks: (B:37:0x00f5, B:39:0x0101, B:24:0x0083), top: B:101:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.String, p40] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0175 -> B:99:0x0179). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0180 -> B:79:0x01a7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x019c -> B:79:0x01a7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x019e -> B:79:0x01a7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01a3 -> B:80:0x01a8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.uc3 r19, java.lang.String r20, defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h68.o(uc3, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.d68
            if (r0 == 0) goto L13
            r0 = r5
            d68 r0 = (defpackage.d68) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            d68 r0 = new d68
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            sw7 r0 = r0.a
            defpackage.hre.r(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2e:
            defpackage.hre.r(r5)
            sw7 r5 = r4.f
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            un2 r5 = r4.C()     // Catch: java.lang.Throwable -> L50
            pta r1 = new pta     // Catch: java.lang.Throwable -> L50
            h1a r4 = r4.e     // Catch: java.lang.Throwable -> L50
            r1.<init>(r5, r4)     // Catch: java.lang.Throwable -> L50
            r0.q(r3)
            return r1
        L50:
            r4 = move-exception
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h68.q(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
        if (r12 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010d, code lost:
        if (r12 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010f, code lost:
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Type inference failed for: r10v2, types: [o45, c3e] */
    /* JADX WARN: Type inference failed for: r10v4, types: [my0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r10, java.util.Map r11, defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h68.s(java.lang.String, java.util.Map, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r11 == r10) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(int r20, defpackage.m42 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h68.t(int, m42, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r23, java.lang.String r24, boolean r25, defpackage.n42 r26) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h68.u(int, java.lang.String, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:93)|94|95|96|97|(19:99|100|101|102|103|(1:105)|106|(2:110|(1:113)(11:112|15|16|(1:18)|91|93|94|95|96|97|(0)))|14|15|16|(0)|91|93|94|95|96|97|(0))|117|118) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|(8:93|94|95|96|97|(19:99|100|101|102|103|(1:105)|106|(2:110|(1:113)(11:112|15|16|(1:18)|91|93|94|95|96|97|(0)))|14|15|16|(0)|91|93|94|95|96|97|(0))|117|118)(2:20|(2:89|90)(2:24|(11:26|(0)|91|93|94|95|96|97|(0)|117|118)(11:27|(1:29)|30|(2:33|31)|34|35|(4:37|(2:39|(10:41|(1:43)(1:60)|(1:45)(1:59)|46|(1:48)(1:58)|49|(1:51)(1:57)|(1:53)(1:56)|54|55)(3:61|62|63))|65|66)(4:73|(2:75|(3:77|(2:79|80)(2:82|83)|81)(3:84|85|86))|87|88)|67|(1:69)(1:72)|70|71))))(2:125|126))(13:127|128|129|130|100|101|102|103|(0)|106|(1:108)|110|(0)(0)))(8:131|132|133|134|135|(1:137)|138|(2:171|172)(7:142|(4:145|(1:158)(2:147|(2:148|(1:1)(2:150|(3:153|154|155)(1:152))))|156|143)|159|(1:170)(1:165)|(1:167)(1:169)|168|(0)(0))))(1:173))(4:182|(1:184)|117|118)|174|175|(9:177|(3:179|117|118)|134|135|(0)|138|(1:140)|171|172)(2:180|181)))|187|6|7|(0)(0)|174|175|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
        r0 = new defpackage.gs9(r0);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e7, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e8, code lost:
        r49 = r14;
        r14 = r2;
        r2 = r3;
        r3 = r15;
        r15 = r5;
        r5 = r6;
        r6 = r9;
        r9 = r10;
        r10 = r4;
        r4 = r49;
        r49 = r13;
        r13 = r11;
        r11 = r49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:23:0x008a, B:38:0x00d5, B:33:0x00be, B:35:0x00c2, B:39:0x00d8, B:40:0x00df), top: B:174:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:23:0x008a, B:38:0x00d5, B:33:0x00be, B:35:0x00c2, B:39:0x00d8, B:40:0x00df), top: B:174:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0211 -> B:105:0x0214). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0267 -> B:106:0x021a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x017d -> B:77:0x0189). Please submit an issue!!! */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(boolean r51, defpackage.n42 r52) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h68.x(boolean, n42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
