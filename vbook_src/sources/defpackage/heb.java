package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: heb  reason: default package */
/* loaded from: classes3.dex */
public final class heb implements tdb {
    public final gdb a;
    public final xcb b;
    public final d05 c;
    public final l05 d;

    static {
        int i = d05.e;
        r76[] r76VarArr = gdb.h;
    }

    public heb(gdb gdbVar, xcb xcbVar, d05 d05Var, l05 l05Var) {
        this.a = gdbVar;
        this.b = xcbVar;
        this.c = d05Var;
        this.d = l05Var;
    }

    public static String b(String str, String str2) {
        String i = i(str);
        if (i.length() == 0) {
            return "/".concat(str2);
        }
        return eub.o(i, "/", str2);
    }

    public static String i(String str) {
        String O0 = k4b.O0(k4b.N0(r4b.O(str, '\\', '/')).toString(), '/');
        if (O0.length() == 0) {
            return "";
        }
        return "/".concat(O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, defpackage.ieb r18, defpackage.n42 r19) {
        /*
            r12 = this;
            r0 = r19
            boolean r1 = r0 instanceof defpackage.udb
            if (r1 == 0) goto L15
            r1 = r0
            udb r1 = (defpackage.udb) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            udb r1 = new udb
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.a
            int r2 = r1.c
            r11 = 1
            if (r2 == 0) goto L2e
            if (r2 != r11) goto L27
            defpackage.hre.r(r0)
            goto L74
        L27:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L2e:
            defpackage.hre.r(r0)
            long r4 = defpackage.zj1.n()
            java.lang.String r0 = "yyyyMMdd_HHmmss"
            java.lang.String r0 = defpackage.zj1.f(r4, r0)
            java.lang.String r2 = "backup_"
            java.lang.String r4 = ".tar"
            java.lang.String r0 = defpackage.hl5.n(r2, r0, r4)
            vdb r2 = new vdb
            r10 = 0
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.c = r11
            sw2 r3 = defpackage.ab3.a
            n35 r3 = defpackage.zz6.a
            he4 r4 = new he4
            r5 = 0
            r6 = 1
            java.lang.String r7 = "zst"
            r13 = r0
            r15 = r2
            r12 = r4
            r16 = r5
            r17 = r6
            r14 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            r0 = r12
            java.lang.Object r0 = defpackage.z87.E(r3, r0, r1)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L74
            return r1
        L74:
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.a(boolean, boolean, boolean, boolean, boolean, ieb, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r8 == r6) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.wdb
            if (r0 == 0) goto L13
            r0 = r8
            wdb r0 = (defpackage.wdb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wdb r0 = new wdb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.hre.r(r8)
            return r8
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L34:
            defpackage.hre.r(r8)
            return r8
        L38:
            defpackage.hre.r(r8)
            goto L48
        L3c:
            defpackage.hre.r(r8)
            r0.c = r5
            ycb r8 = r7.g()
            if (r8 != r6) goto L48
            goto L6b
        L48:
            ycb r8 = (defpackage.ycb) r8
            int r8 = r8.ordinal()
            if (r8 == 0) goto L63
            if (r8 == r5) goto L59
            if (r8 != r4) goto L55
            return r2
        L55:
            defpackage.xk5.o()
            return r2
        L59:
            r0.c = r3
            java.io.Serializable r7 = r7.d(r0)
            if (r7 != r6) goto L62
            goto L6b
        L62:
            return r7
        L63:
            r0.c = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r6) goto L6c
        L6b:
            return r6
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.c(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|(1:19)(2:16|17))(2:21|22))(6:23|24|25|(1:27)|14|(0)(0)))(2:30|31))(2:36|(1:38)(2:39|(2:41|29)))|32|(2:34|29)(5:35|25|(0)|14|(0)(0))))|44|6|7|(0)(0)|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        if (r9 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
        r9 = new defpackage.gs9(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:40:0x008b, B:20:0x003a, B:35:0x0076, B:37:0x007a, B:23:0x0040, B:31:0x005f, B:28:0x0052), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.xdb
            if (r0 == 0) goto L13
            r0 = r9
            xdb r0 = (defpackage.xdb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            xdb r0 = new xdb
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2e
            goto L8b
        L2e:
            r8 = move-exception
            goto L8e
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r5
        L36:
            java.lang.String r8 = r0.b
            heb r1 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2e
            goto L76
        L3e:
            heb r8 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5f
        L44:
            defpackage.hre.r(r9)
            d05 r9 = r8.c
            m05 r9 = r9.c
            n05 r9 = r9.a()
            if (r9 != 0) goto L52
            return r5
        L52:
            l05 r9 = r8.d     // Catch: java.lang.Throwable -> L2e
            r0.a = r8     // Catch: java.lang.Throwable -> L2e
            r0.e = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r9.c(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r6) goto L5f
            goto L8a
        L5f:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L2e
            l05 r1 = r8.d     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "backup.tar.zst"
            r0.a = r8     // Catch: java.lang.Throwable -> L2e
            r0.b = r9     // Catch: java.lang.Throwable -> L2e
            r0.e = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = r1.e(r9, r4, r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 != r6) goto L72
            goto L8a
        L72:
            r7 = r1
            r1 = r8
            r8 = r9
            r9 = r7
        L76:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L93
            l05 r9 = r1.d     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "backup.zip"
            r0.a = r5     // Catch: java.lang.Throwable -> L2e
            r0.b = r5     // Catch: java.lang.Throwable -> L2e
            r0.e = r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r9.e(r8, r1, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r6) goto L8b
        L8a:
            return r6
        L8b:
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> L2e
            goto L93
        L8e:
            gs9 r9 = new gs9
            r9.<init>(r8)
        L93:
            boolean r8 = r9 instanceof defpackage.gs9
            if (r8 == 0) goto L98
            goto L99
        L98:
            r5 = r9
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.d(n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r15 == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
        if (r15 == r6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.e(n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
        if (r9 == r5) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Type inference failed for: r11v2, types: [zl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e6 -> B:52:0x0127). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0102 -> B:42:0x0105). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.odd r10, java.lang.String r11, defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.f(odd, java.lang.String, n42):java.lang.Object");
    }

    public final ycb g() {
        gdb gdbVar = this.a;
        int intValue = ((Number) gdbVar.b.c(gdb.h[0], gdbVar)).intValue();
        ycb.b.getClass();
        return iv8.e(intValue);
    }

    public final xfd h() {
        gdb gdbVar = this.a;
        u68 u68Var = gdbVar.d;
        r76[] r76VarArr = gdb.h;
        String obj = k4b.N0((String) u68Var.c(r76VarArr[2], gdbVar)).toString();
        String obj2 = k4b.N0((String) gdbVar.e.c(r76VarArr[3], gdbVar)).toString();
        String str = (String) gdbVar.f.c(r76VarArr[4], gdbVar);
        String obj3 = k4b.N0((String) gdbVar.g.c(r76VarArr[5], gdbVar)).toString();
        if (obj.length() == 0 || obj2.length() == 0 || str.length() == 0) {
            return null;
        }
        return new xfd(obj, obj2, str, obj3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(1:(3:10|11|12)(2:14|15))(4:16|17|18|19))(25:48|(1:50)|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|(1:73)|27)|20|21|(2:30|31)|23|(3:25|(3:28|11|12)|27)(1:29)))|94|6|(0)(0)|20|21|(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r11 = r15;
        r15 = r3;
        r3 = r11;
        r11 = r12;
        r12 = r8;
        r8 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.f76 r18, defpackage.cs9 r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, defpackage.ieb r25, defpackage.n42 r26) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.j(f76, cs9, boolean, boolean, boolean, boolean, boolean, ieb, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r0 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.cs9 r8, boolean r9, boolean r10, boolean r11, boolean r12, defpackage.ieb r13, defpackage.n42 r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.beb
            if (r0 == 0) goto L14
            r0 = r14
            beb r0 = (defpackage.beb) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.E = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            beb r0 = new beb
            r0.<init>(r7, r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.C
            int r1 = r14.E
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L4a
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            defpackage.hre.r(r0)
            return r0
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r5
        L36:
            defpackage.hre.r(r0)
            return r0
        L3a:
            boolean r12 = r14.f
            boolean r11 = r14.e
            boolean r10 = r14.d
            boolean r9 = r14.c
            ieb r13 = r14.b
            cs9 r8 = r14.a
            defpackage.hre.r(r0)
            goto L62
        L4a:
            defpackage.hre.r(r0)
            r14.a = r8
            r14.b = r13
            r14.c = r9
            r14.d = r10
            r14.e = r11
            r14.f = r12
            r14.E = r4
            ycb r0 = r7.g()
            if (r0 != r6) goto L62
            goto La2
        L62:
            ycb r0 = (defpackage.ycb) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L8e
            if (r0 == r4) goto L78
            if (r0 == r3) goto L72
            defpackage.xk5.o()
            return r5
        L72:
            java.lang.String r7 = "OneDrive is not implemented"
            defpackage.xk5.q(r7)
            return r5
        L78:
            r14.a = r5
            r14.b = r5
            r14.c = r9
            r14.d = r10
            r14.e = r11
            r14.f = r12
            r14.E = r2
            java.lang.Object r7 = r7.l(r8, r9, r10, r11, r12, r13, r14)
            if (r7 != r6) goto L8d
            goto La2
        L8d:
            return r7
        L8e:
            r14.a = r5
            r14.b = r5
            r14.c = r9
            r14.d = r10
            r14.e = r11
            r14.f = r12
            r14.E = r3
            java.lang.Object r7 = r7.m(r8, r9, r10, r11, r12, r13, r14)
            if (r7 != r6) goto La3
        La2:
            return r6
        La3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.k(cs9, boolean, boolean, boolean, boolean, ieb, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0167, code lost:
        if (r4.a(r5, r6, r7, r8, r9, r10, r3, false, r13) == r14) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0146 A[Catch: all -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003f, blocks: (B:16:0x003a, B:48:0x0146), top: B:57:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Type inference failed for: r1v0, types: [xt4] */
    /* JADX WARN: Type inference failed for: r1v10, types: [hn8] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.cs9 r18, boolean r19, boolean r20, boolean r21, boolean r22, defpackage.xt4 r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.l(cs9, boolean, boolean, boolean, boolean, xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x018a, code lost:
        if (r3.a(r4, r5, r6, r0, r8, r7, r10, false, r12) == r13) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:16:0x0036, B:51:0x0166), top: B:62:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARN: Type inference failed for: r2v13, types: [hn8] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.cs9 r18, boolean r19, boolean r20, boolean r21, boolean r22, defpackage.xt4 r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.m(cs9, boolean, boolean, boolean, boolean, xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(boolean r8, boolean r9, boolean r10, boolean r11, defpackage.ieb r12, defpackage.n42 r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof defpackage.eeb
            if (r0 == 0) goto L14
            r0 = r13
            eeb r0 = (defpackage.eeb) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.D = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            eeb r0 = new eeb
            r0.<init>(r7, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.f
            int r1 = r13.D
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L48
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            defpackage.hre.r(r0)
            return r0
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L36:
            defpackage.hre.r(r0)
            return r0
        L3a:
            boolean r11 = r13.d
            boolean r10 = r13.c
            boolean r9 = r13.b
            boolean r8 = r13.a
            ieb r12 = r13.e
            defpackage.hre.r(r0)
            goto L5e
        L48:
            defpackage.hre.r(r0)
            r13.e = r12
            r13.a = r8
            r13.b = r9
            r13.c = r10
            r13.d = r11
            r13.D = r5
            ycb r0 = r7.g()
            if (r0 != r6) goto L5e
            goto L9a
        L5e:
            ycb r0 = (defpackage.ycb) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L88
            if (r0 == r5) goto L74
            if (r0 == r4) goto L6e
            defpackage.xk5.o()
            return r2
        L6e:
            java.lang.String r7 = "OneDrive sync is not implemented"
            defpackage.xk5.q(r7)
            return r2
        L74:
            r13.e = r2
            r13.a = r8
            r13.b = r9
            r13.c = r10
            r13.d = r11
            r13.D = r3
            java.lang.Object r7 = r7.o(r8, r9, r10, r11, r12, r13)
            if (r7 != r6) goto L87
            goto L9a
        L87:
            return r7
        L88:
            r13.e = r2
            r13.a = r8
            r13.b = r9
            r13.c = r10
            r13.d = r11
            r13.D = r4
            java.lang.Object r7 = r7.p(r8, r9, r10, r11, r12, r13)
            if (r7 != r6) goto L9b
        L9a:
            return r6
        L9b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.n(boolean, boolean, boolean, boolean, ieb, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(boolean r18, boolean r19, boolean r20, boolean r21, defpackage.xt4 r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.o(boolean, boolean, boolean, boolean, xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #2 {all -> 0x003f, blocks: (B:16:0x0038, B:48:0x014f, B:50:0x0155, B:53:0x018c, B:55:0x0190, B:57:0x0196, B:58:0x019d, B:59:0x019e, B:60:0x01a4), top: B:72:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #2 {all -> 0x003f, blocks: (B:16:0x0038, B:48:0x014f, B:50:0x0155, B:53:0x018c, B:55:0x0190, B:57:0x0196, B:58:0x019d, B:59:0x019e, B:60:0x01a4), top: B:72:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1, types: [hyc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(boolean r19, boolean r20, boolean r21, boolean r22, defpackage.xt4 r23, defpackage.n42 r24) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.heb.p(boolean, boolean, boolean, boolean, xt4, n42):java.lang.Object");
    }
}
