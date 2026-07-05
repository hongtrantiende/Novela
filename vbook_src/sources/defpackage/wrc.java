package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wrc  reason: default package */
/* loaded from: classes3.dex */
public final class wrc implements src {
    public final xh9 a;

    static {
        r76[] r76VarArr = xh9.s;
    }

    public wrc(xh9 xh9Var) {
        this.a = xh9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r12 == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r12 != r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[LOOP:0: B:20:0x0052->B:22:0x0058, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.trc
            if (r0 == 0) goto L13
            r0 = r12
            trc r0 = (defpackage.trc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            trc r0 = new trc
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r12)
            goto L9c
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L31:
            defpackage.hre.r(r12)
            goto L41
        L35:
            defpackage.hre.r(r12)
            r0.c = r3
            java.io.Serializable r12 = r11.b(r0)
            if (r12 != r4) goto L41
            goto L9b
        L41:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.tl1.s(r12, r1)
            r11.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L52:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r12.next()
            orc r1 = (defpackage.orc) r1
            rrc r5 = new rrc
            java.lang.String r6 = r1.a
            boolean r10 = r1.b
            java.lang.String r7 = r1.c
            java.lang.String r8 = r1.d
            java.lang.String r9 = r1.e
            r5.<init>(r6, r7, r8, r9, r10)
            r11.add(r5)
            goto L52
        L71:
            long r5 = defpackage.zj1.n()
            java.lang.String r12 = "yyyyMMdd_HHmmss"
            java.lang.String r12 = defpackage.zj1.f(r5, r12)
            java.lang.String r1 = "txt_rules_"
            java.lang.String r6 = r1.concat(r12)
            wd3 r8 = new wd3
            r9 = 0
            r8.<init>(r11, r9, r3)
            r0.c = r2
            sw2 r11 = defpackage.ab3.a
            n35 r11 = defpackage.zz6.a
            he4 r5 = new he4
            r10 = 0
            java.lang.String r7 = "json"
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r12 = defpackage.z87.E(r11, r5, r0)
            if (r12 != r4) goto L9c
        L9b:
            return r4
        L9c:
            if (r12 == 0) goto L9f
            goto La0
        L9f:
            r3 = 0
        La0:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrc.a(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(1:9)(2:42|43))(2:44|(4:46|(2:49|47)|50|51)(2:52|(1:54)))|10|11|12|13|(4:15|(3:18|(1:20)(3:21|22|23)|16)|25|26)|(2:28|29)(1:30)))|55|6|(0)(0)|10|11|12|13|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r12 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if (r12 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
        if (defpackage.jy.a() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
        r0 = defpackage.kw6.b;
        r1 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r0.a.a.compareTo(r1) <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
        r0.a(r1, "Log", r12, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrc.b(n42):java.io.Serializable");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:3|(24:5|6|(1:(1:9)(2:115|116))(2:117|(1:119)(1:120))|10|11|12|13|(1:15)|16|(1:18)|19|(2:22|20)|23|24|(1:26)|27|(2:30|28)|31|(3:33|(4:36|(2:38|39)(1:41)|40|34)|42)(1:103)|(1:44)|45|(1:(2:48|(4:50|(4:53|(3:58|59|60)|61|51)|64|65)(2:66|67))(4:69|(8:72|(2:73|(2:75|(1:78)(1:77))(2:97|98))|79|(1:(2:81|(1:84)(1:83))(2:95|96))|(1:86)|(3:92|93|94)(3:88|89|90)|91|70)|99|100))|101|102))|121|6|(0)(0)|10|11|12|13|(0)|16|(0)|19|(1:20)|23|24|(0)|27|(1:28)|31|(0)(0)|(0)|45|(0)|101|102) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (defpackage.jy.a() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        r5 = defpackage.kw6.b;
        r8 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r5.a.a.compareTo(r8) <= 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
        r5.a(r8, "Log", r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[LOOP:0: B:38:0x00bd->B:40:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea A[LOOP:1: B:45:0x00e4->B:47:0x00ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v0, types: [f76] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.f76 r22, defpackage.cs9 r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrc.c(f76, cs9, n42):java.lang.Object");
    }
}
