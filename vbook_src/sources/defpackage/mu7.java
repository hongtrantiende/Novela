package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mu7  reason: default package */
/* loaded from: classes3.dex */
public abstract class mu7 {
    public static final d31 a;
    public static final d31 b;

    static {
        byte[] t = fre.t("\r\n", ed1.a);
        a = new d31(t, 0, t.length);
        b = new d31(new byte[]{45, 45});
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x016a, code lost:
        if (r2 == r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a5, code lost:
        if (r5.c(r6) != r11) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.d31 r29, defpackage.x82 r30, defpackage.i11 r31, defpackage.mg5 r32, long r33, defpackage.n42 r35) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu7.a(d31, x82, i11, mg5, long, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:12:0x0025, B:24:0x0056, B:27:0x005b, B:28:0x0062), top: B:45:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.x82 r9, defpackage.n42 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.ku7
            if (r0 == 0) goto L13
            r0 = r10
            ku7 r0 = (defpackage.ku7) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ku7 r0 = new ku7
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            vb1 r9 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L29
            goto L56
        L29:
            r10 = move-exception
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r3
        L31:
            defpackage.hre.r(r10)
            vb1 r10 = new vb1
            r10.<init>()
            r0.a = r10     // Catch: java.lang.Throwable -> L67
            r0.c = r4     // Catch: java.lang.Throwable -> L67
            java.util.Set r1 = defpackage.tg5.a     // Catch: java.lang.Throwable -> L67
            vf9 r1 = new vf9     // Catch: java.lang.Throwable -> L67
            r5 = 8
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L67
            r1.b = r2     // Catch: java.lang.Throwable -> L67
            r1.c = r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object r9 = defpackage.tg5.c(r9, r10, r1, r0)     // Catch: java.lang.Throwable -> L67
            n82 r0 = defpackage.n82.a
            if (r9 != r0) goto L53
            return r0
        L53:
            r8 = r10
            r10 = r9
            r9 = r8
        L56:
            mg5 r10 = (defpackage.mg5) r10     // Catch: java.lang.Throwable -> L29
            if (r10 == 0) goto L5b
            return r10
        L5b:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L29
            throw r10     // Catch: java.lang.Throwable -> L29
        L63:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L69
        L67:
            r9 = move-exception
            goto L63
        L69:
            k78 r0 = r9.a
            java.util.ArrayList r1 = r9.b
            if (r1 == 0) goto L82
            r9.c = r3
            int r5 = r1.size()
            r6 = r2
        L76:
            if (r6 >= r5) goto L8b
            java.lang.Object r7 = r1.get(r6)
            r0.R0(r7)
            int r6 = r6 + 1
            goto L76
        L82:
            char[] r1 = r9.c
            if (r1 == 0) goto L89
            r0.R0(r1)
        L89:
            r9.c = r3
        L8b:
            r9.e = r4
            r9.b = r3
            r9.d = r3
            r9.C = r2
            r9.f = r2
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu7.b(x82, n42):java.lang.Object");
    }

    public static final void c(xl9 xl9Var, byte[] bArr, byte b2) {
        int i = xl9Var.a;
        if (i < bArr.length) {
            xl9Var.a = i + 1;
            bArr[i] = b2;
            return;
        }
        fb4.k("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.s11 r4, defpackage.d31 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.lu7
            if (r0 == 0) goto L13
            r0 = r6
            lu7 r0 = (defpackage.lu7) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lu7 r0 = new lu7
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            d31 r5 = r0.a
            defpackage.hre.r(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.c = r2
            java.lang.Object r6 = defpackage.v9e.M(r4, r5, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4b
            byte[] r4 = r5.a
            int r4 = r4.length
            long r4 = (long) r4
            goto L4d
        L4b:
            r4 = 0
        L4d:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu7.d(s11, d31, n42):java.lang.Object");
    }
}
