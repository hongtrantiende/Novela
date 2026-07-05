package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gy7  reason: default package */
/* loaded from: classes.dex */
public final class gy7 {
    public final Context a;

    public gy7(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(1:(3:11|12|(9:14|(1:16)|17|(1:19)(1:28)|20|(1:22)(1:27)|23|24|25)(2:29|30))(2:31|32))(2:33|34))(5:43|44|45|(1:47)|40)|35|36|37|38))|54|6|7|(0)(0)|35|36|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
        if (r11 != r6) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [re5] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [xt4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [vl8, c3e] */
    /* JADX WARN: Type inference failed for: r8v1, types: [x88, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy7.a(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(6:11|12|13|(2:15|(2:17|(1:19)))|20|(1:25)(2:22|23))(2:27|28))(2:29|30))(3:37|38|(2:40|36))|31|(1:33)(1:34)))|43|6|7|(0)(0)|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        r7 = new defpackage.gs9(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:12:0x0027, B:31:0x0057, B:19:0x0035, B:25:0x0047, B:28:0x004c, B:22:0x003c), top: B:46:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ey7
            if (r0 == 0) goto L13
            r0 = r7
            ey7 r0 = (defpackage.ey7) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ey7 r0 = new ey7
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            n82 r1 = defpackage.n82.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L2b
            goto L57
        L2b:
            r6 = move-exception
            goto L5a
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r5
        L33:
            gy7 r6 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L2b
            goto L47
        L39:
            defpackage.hre.r(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L2b
            r0.d = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r6.c(r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L47
            goto L56
        L47:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L2b
            if (r7 != 0) goto L4c
            return r5
        L4c:
            r0.a = r5     // Catch: java.lang.Throwable -> L2b
            r0.d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r6.a(r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L57
        L56:
            return r1
        L57:
            n05 r7 = (defpackage.n05) r7     // Catch: java.lang.Throwable -> L2b
            goto L5f
        L5a:
            gs9 r7 = new gs9
            r7.<init>(r6)
        L5f:
            java.lang.Throwable r6 = defpackage.hs9.a(r7)
            if (r6 == 0) goto L88
            java.lang.String r6 = r6.getMessage()
            java.lang.String r0 = "Native Google auth failed, falling back to codeAuth: "
            java.lang.String r6 = defpackage.s21.m(r0, r6)
            boolean r0 = defpackage.jy.a()
            if (r0 == 0) goto L88
            kw6 r0 = defpackage.kw6.b
            iea r1 = defpackage.iea.d
            z56 r2 = r0.a
            iea r2 = r2.a
            int r2 = r2.compareTo(r1)
            if (r2 > 0) goto L88
            java.lang.String r2 = "NativeGoogleAuth"
            r0.a(r1, r2, r6, r5)
        L88:
            boolean r6 = r7 instanceof defpackage.gs9
            if (r6 == 0) goto L8d
            goto L8e
        L8d:
            r5 = r7
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy7.b(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Type inference failed for: r8v1, types: [tvd, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy7.c(n42):java.lang.Object");
    }
}
