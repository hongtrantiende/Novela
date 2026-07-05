package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fw2  reason: default package */
/* loaded from: classes3.dex */
public final class fw2 {
    public static final mfb d = new mfb(new rj2(3));
    public final re5 a;
    public final rc8 b;
    public final mfb c;

    public fw2(rc8 rc8Var) {
        String str;
        re5 re5Var = (re5) d.getValue();
        re5Var.getClass();
        this.a = re5Var;
        this.b = rc8Var;
        this.c = new mfb(new rj2(2));
        String str2 = rc8Var.a;
        if (str2 == null || k4b.j0(str2)) {
            ht3 ht3Var = rc8Var.b;
            if (ht3Var != null) {
                str = ht3Var.a;
            } else {
                str = null;
            }
            if (str != null) {
                if ((ht3Var != null ? ht3Var.b : null) == null) {
                    throw new ad8("Invalid configuration: authorizationEndpoint is null");
                }
            } else {
                throw new ad8("Invalid configuration: tokenEndpoint is null");
            }
        }
        if (rc8Var.c != null) {
            return;
        }
        throw new ad8("Invalid configuration: clientId is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Type inference failed for: r0v7, types: [vl8, c3e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.y60 r15, java.lang.String r16, defpackage.xt4 r17, defpackage.n42 r18) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.a(y60, java.lang.String, xt4, n42):java.lang.Object");
    }

    public final y60 b(xt4 xt4Var) {
        String i;
        String str;
        rc8 rc8Var = this.b;
        kw8 kw8Var = new kw8(rc8Var.f);
        if (rc8Var.i) {
            i = null;
        } else {
            i = sxd.i(v9e.L());
        }
        String str2 = i;
        String i2 = sxd.i(v9e.L());
        ht3 ht3Var = rc8Var.b;
        if (ht3Var != null && (str = ht3Var.b) != null) {
            xtc o = obe.o(str);
            xyc xycVar = o.j;
            String str3 = rc8Var.c;
            str3.getClass();
            xycVar.h("client_id", str3);
            o.j.h("response_type", "code");
            o.j.h("response_mode", "query");
            String str4 = rc8Var.e;
            if (str4 != null) {
                o.j.h("scope", str4);
            }
            if (str2 != null) {
                o.j.h("nonce", str2);
            }
            String str5 = rc8Var.f.a;
            if (str5 != null) {
                o.j.h("code_challenge_method", str5);
            }
            if (rc8Var.f != qk1.off) {
                o.j.h("code_challenge", kw8Var.b);
            }
            String str6 = rc8Var.g;
            if (str6 != null) {
                o.j.h("redirect_uri", str6);
            }
            o.j.h("state", i2);
            if (xt4Var != null) {
                xt4Var.invoke(o);
            }
            return new y60(o.b(), this.b, kw8Var, i2, str2);
        }
        throw new zc8("No authorizationEndpoint set");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: all -> 0x00d3, ed8 -> 0x00e2, TryCatch #2 {ed8 -> 0x00e2, all -> 0x00d3, blocks: (B:14:0x002d, B:38:0x00c3, B:19:0x003e, B:26:0x005c, B:28:0x007e, B:30:0x0085, B:31:0x008a, B:33:0x0091, B:34:0x0096, B:40:0x00cb, B:41:0x00d2, B:22:0x0049), top: B:50:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb A[Catch: all -> 0x00d3, ed8 -> 0x00e2, TryCatch #2 {ed8 -> 0x00e2, all -> 0x00d3, blocks: (B:14:0x002d, B:38:0x00c3, B:19:0x003e, B:26:0x005c, B:28:0x007e, B:30:0x0085, B:31:0x008a, B:33:0x0091, B:34:0x0096, B:40:0x00cb, B:41:0x00d2, B:22:0x0049), top: B:50:0x0025 }] */
    /* JADX WARN: Type inference failed for: r2v10, types: [vl8, c3e, h4b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r15, defpackage.n42 r16) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.c(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zv2
            if (r0 == 0) goto L13
            r0 = r5
            zv2 r0 = (defpackage.zv2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zv2 r0 = new zv2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            rc8 r2 = r4.b
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.hre.r(r5)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            goto L4f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            java.lang.String r5 = r2.a     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            if (r5 == 0) goto L57
            eb5 r1 = new eb5     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            re5 r4 = r4.a     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.c = r3     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            xtc r4 = defpackage.obe.o(r5)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            vyc r4 = r4.b()     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            java.lang.Object r5 = r1.n(r4, r0)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L4f
            return r4
        L4f:
            vc8 r5 = (defpackage.vc8) r5     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r2.a(r5)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            pvc r4 = defpackage.pvc.a
            return r4
        L57:
            ad8 r4 = new ad8     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            java.lang.String r5 = "No discoveryUri set"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            throw r4     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
        L5f:
            r4 = move-exception
            bd8 r5 = new bd8
            java.lang.String r0 = r4.getMessage()
            if (r0 != 0) goto L6a
            java.lang.String r0 = "Unknown error"
        L6a:
            r5.<init>(r0, r4)
            throw r5
        L6e:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.d(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.y60 r6, java.lang.String r7, defpackage.xt4 r8, defpackage.n42 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.aw2
            if (r0 == 0) goto L13
            r0 = r9
            aw2 r0 = (defpackage.aw2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aw2 r0 = new aw2
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            return r9
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L31:
            int r6 = r0.b
            int r7 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            goto L4d
        L39:
            defpackage.hre.r(r9)
            r9 = 0
            r0.a = r9     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.b = r9     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.e = r3     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            java.lang.Object r6 = r5.a(r6, r7, r8, r0)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            if (r6 != r4) goto L4a
            goto L5d
        L4a:
            r7 = r9
            r9 = r6
            r6 = r7
        L4d:
            mcc r9 = (defpackage.mcc) r9     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            hi5 r8 = r9.a     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.a = r7     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.b = r6     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.e = r2     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            java.lang.Object r5 = r5.f(r8, r0)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            if (r5 != r4) goto L5e
        L5d:
            return r4
        L5e:
            return r5
        L5f:
            r5 = move-exception
            bd8 r6 = new bd8
            java.lang.String r7 = r5.getMessage()
            if (r7 != 0) goto L6a
            java.lang.String r7 = "Unknown error"
        L6a:
            r6.<init>(r7, r5)
            throw r6
        L6e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.e(y60, java.lang.String, xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(1:(1:(1:(2:14|15)(3:17|18|19))(3:20|21|22))(3:23|24|25))(3:26|27|(2:29|30)(2:31|32)))(1:33))(1:47)|34|(6:36|37|38|39|(1:41)|(0)(0))(1:45)|42))|55|6|7|(0)(0)|34|(0)(0)|42|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r12 == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
        r1.a = null;
        r1.d = 4;
        r12 = i(r11, r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
        if (r12 != r9) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r1.a = null;
        r1.d = 3;
        r12 = i(r11, r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
        if (r12 != r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
        if (r12 == r9) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d A[Catch: b46 -> 0x004c, w28 -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {b46 -> 0x004c, w28 -> 0x004e, blocks: (B:21:0x0048, B:41:0x008d, B:43:0x0090, B:44:0x0097, B:33:0x006d, B:37:0x007b), top: B:62:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: b46 -> 0x004c, w28 -> 0x004e, TryCatch #3 {b46 -> 0x004c, w28 -> 0x004e, blocks: (B:21:0x0048, B:41:0x008d, B:43:0x0090, B:44:0x0097, B:33:0x006d, B:37:0x007b), top: B:62:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090 A[Catch: b46 -> 0x004c, w28 -> 0x004e, TryCatch #3 {b46 -> 0x004c, w28 -> 0x004e, blocks: (B:21:0x0048, B:41:0x008d, B:43:0x0090, B:44:0x0097, B:33:0x006d, B:37:0x007b), top: B:62:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.hi5 r11, defpackage.n42 r12) {
        /*
            r10 = this;
            java.lang.Class<f4> r0 = defpackage.f4.class
            boolean r1 = r12 instanceof defpackage.bw2
            if (r1 == 0) goto L15
            r1 = r12
            bw2 r1 = (defpackage.bw2) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            bw2 r1 = new bw2
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.b
            int r2 = r1.d
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            n82 r9 = defpackage.n82.a
            if (r2 == 0) goto L54
            if (r2 == r7) goto L50
            if (r2 == r6) goto L46
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3d
            if (r2 == r3) goto L38
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r8
        L38:
            defpackage.hre.r(r12)
            goto Lbf
        L3d:
            defpackage.hre.r(r12)
            goto La3
        L41:
            defpackage.hre.r(r12)
            goto Lb1
        L46:
            oh5 r11 = r1.a
            defpackage.hre.r(r12)     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            goto L8b
        L4c:
            r12 = move-exception
            goto L98
        L4e:
            r12 = move-exception
            goto La6
        L50:
            defpackage.hre.r(r12)
            goto L60
        L54:
            defpackage.hre.r(r12)
            r1.d = r7
            java.lang.Object r12 = r11.c(r1)
            if (r12 != r9) goto L60
            goto Lbe
        L60:
            r11 = r12
            oh5 r11 = (defpackage.oh5) r11
            ii5 r12 = r11.e()
            boolean r12 = defpackage.uue.B(r12)
            if (r12 == 0) goto Lb4
            te5 r12 = r11.y0()     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            gi1 r2 = defpackage.cm9.a(r0)     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            nsc r0 = defpackage.cm9.d(r0)     // Catch: java.lang.Throwable -> L7a
            goto L7b
        L7a:
            r0 = r8
        L7b:
            isc r3 = new isc     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            r3.<init>(r2, r0)     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            r1.a = r11     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            r1.d = r6     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            java.lang.Object r12 = r12.a(r3, r1)     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            if (r12 != r9) goto L8b
            goto Lbe
        L8b:
            if (r12 == 0) goto L90
            f4 r12 = (defpackage.f4) r12     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            return r12
        L90:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            java.lang.String r0 = "null cannot be cast to non-null type org.publicvalue.multiplatform.oidc.types.remote.AccessTokenResponse"
            r12.<init>(r0)     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
            throw r12     // Catch: defpackage.b46 -> L4c defpackage.w28 -> L4e
        L98:
            r1.a = r8
            r1.d = r4
            java.io.Serializable r12 = r10.i(r11, r12, r1)
            if (r12 != r9) goto La3
            goto Lbe
        La3:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        La6:
            r1.a = r8
            r1.d = r5
            java.io.Serializable r12 = r10.i(r11, r12, r1)
            if (r12 != r9) goto Lb1
            goto Lbe
        Lb1:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        Lb4:
            r1.a = r8
            r1.d = r3
            java.io.Serializable r12 = r10.i(r11, r8, r1)
            if (r12 != r9) goto Lbf
        Lbe:
            return r9
        Lbf:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.f(hi5, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cw2
            if (r0 == 0) goto L13
            r0 = r6
            cw2 r0 = (defpackage.cw2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cw2 r0 = new cw2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            rc8 r2 = r5.b
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.hre.r(r6)
            goto L4e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L2e:
            defpackage.hre.r(r6)
            ht3 r6 = r2.b
            if (r6 == 0) goto L38
            java.lang.String r1 = r6.a
            goto L39
        L38:
            r1 = r4
        L39:
            if (r1 == 0) goto L43
            if (r6 == 0) goto L3f
            java.lang.String r4 = r6.a
        L3f:
            r4.getClass()
            return r4
        L43:
            r0.c = r3
            java.lang.Object r5 = r5.d(r0)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L4e
            return r6
        L4e:
            ht3 r5 = r2.b
            if (r5 == 0) goto L54
            java.lang.String r4 = r5.a
        L54:
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.g(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dw2
            if (r0 == 0) goto L13
            r0 = r7
            dw2 r0 = (defpackage.dw2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dw2 r0 = new dw2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            return r7
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L31:
            int r6 = r0.b
            int r1 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            goto L4d
        L39:
            defpackage.hre.r(r7)
            r7 = 0
            r0.a = r7     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.b = r7     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.e = r3     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            java.lang.Object r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            if (r6 != r4) goto L4a
            goto L5d
        L4a:
            r1 = r7
            r7 = r6
            r6 = r1
        L4d:
            mcc r7 = (defpackage.mcc) r7     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            hi5 r7 = r7.a     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.a = r1     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.b = r6     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            r0.e = r2     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            java.lang.Object r5 = r5.f(r7, r0)     // Catch: java.lang.Throwable -> L5f defpackage.ed8 -> L6e
            if (r5 != r4) goto L5e
        L5d:
            return r4
        L5e:
            return r5
        L5f:
            r5 = move-exception
            bd8 r6 = new bd8
            java.lang.String r7 = r5.getMessage()
            if (r7 != 0) goto L6a
            java.lang.String r7 = "Unknown error"
        L6a:
            r6.<init>(r7, r5)
            throw r6
        L6e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.h(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(1:(3:10|11|(4:13|(1:(1:22))(1:17)|18|19)(2:23|24))(2:25|26))(1:27))(1:37)|28|29|30|31|(3:34|11|(0)(0))|33))|39|6|(0)(0)|28|29|30|31|(0)|33) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r10 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        r2 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(defpackage.oh5 r11, java.lang.Exception r12, defpackage.n42 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ew2
            if (r0 == 0) goto L13
            r0 = r13
            ew2 r0 = (defpackage.ew2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ew2 r0 = new ew2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r10 = r0.d
            int r13 = r0.f
            r1 = 2
            r2 = 1
            r3 = 0
            n82 r4 = defpackage.n82.a
            if (r13 == 0) goto L41
            if (r13 == r2) goto L39
            if (r13 != r1) goto L33
            sw3 r11 = r0.c
            java.lang.Throwable r12 = r0.b
            oh5 r13 = r0.a
            defpackage.hre.r(r10)
            r8 = r11
        L31:
            r9 = r12
            goto L7f
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r3
        L39:
            java.lang.Throwable r12 = r0.b
            oh5 r11 = r0.a
            defpackage.hre.r(r10)
            goto L55
        L41:
            defpackage.hre.r(r10)
            te5 r10 = r11.y0()
            r0.a = r11
            r0.b = r12
            r0.f = r2
            java.lang.Object r10 = defpackage.fce.s(r10, r0)
            if (r10 != r4) goto L55
            goto L7a
        L55:
            sw3 r10 = (defpackage.sw3) r10
            te5 r13 = r11.y0()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            gi1 r5 = defpackage.cm9.a(r2)
            nsc r2 = defpackage.cm9.d(r2)     // Catch: java.lang.Throwable -> L66
            goto L67
        L66:
            r2 = r3
        L67:
            isc r6 = new isc
            r6.<init>(r5, r2)
            r0.a = r11
            r0.b = r12
            r0.c = r10
            r0.f = r1
            java.lang.Object r13 = r13.a(r6, r0)
            if (r13 != r4) goto L7b
        L7a:
            return r4
        L7b:
            r8 = r10
            r10 = r13
            r13 = r11
            goto L31
        L7f:
            if (r10 == 0) goto Lbd
            java.lang.String r10 = (java.lang.String) r10
            r11 = 11
            r12 = 0
            java.lang.String r7 = defpackage.xk1.d(r12, r10, r12, r11)
            cd8 r4 = new cd8
            ii5 r10 = r13.e()
            int r10 = r10.a
            if (r8 == 0) goto L9b
            java.lang.String r11 = r8.b
            if (r11 != 0) goto L99
            goto L9b
        L99:
            r3 = r11
            goto L9f
        L9b:
            if (r8 == 0) goto L9f
            rw3 r3 = r8.a
        L9f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Exchange token failed: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = " "
            r11.append(r10)
            r11.append(r3)
            java.lang.String r5 = r11.toString()
            ii5 r6 = r13.e()
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        Lbd:
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.String"
            defpackage.xk5.k(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw2.i(oh5, java.lang.Exception, n42):java.io.Serializable");
    }
}
