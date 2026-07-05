package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ev  reason: default package */
/* loaded from: classes3.dex */
public final class ev {
    public static final /* synthetic */ int f = 0;
    public final k0d a;
    public final zk b;
    public final sw7 c = new sw7();
    public final mce d = new mce(ri5.a(null, new y4(17)));
    public final fz4 e;

    static {
        bl8 bl8Var = k0d.m;
    }

    public ev(k0d k0dVar, zk zkVar) {
        this.a = k0dVar;
        this.b = zkVar;
        re5 a = ri5.a(null, new y4(17));
        ((ci5) kf5.a(a, ci5.b)).a.add(new wa(this, (m42) null, 2));
        this.e = new fz4(a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:19:0x0049, B:68:0x0172, B:73:0x01be, B:22:0x0058, B:62:0x0150, B:64:0x0158, B:53:0x0126, B:58:0x0137, B:56:0x0131, B:77:0x01e2), top: B:86:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [qw7, te5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ev r17, defpackage.w8a r18, defpackage.gh5 r19, defpackage.te5 r20, defpackage.n42 r21) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev.a(ev, w8a, gh5, te5, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(2:23|24)(3:25|26|(1:28)))|11|(2:13|14)|16|17))|30|6|7|(0)(0)|11|(0)|16|17) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:11:0x0023, B:24:0x0054, B:26:0x005a, B:16:0x0031, B:18:0x0044, B:20:0x0047), top: B:31:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cv
            if (r0 == 0) goto L13
            r0 = r6
            cv r0 = (defpackage.cv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cv r0 = new cv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            k0d r2 = r5.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.hre.r(r6)     // Catch: java.lang.Exception -> L64
            goto L54
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.hre.r(r6)
            u68 r6 = r2.d     // Catch: java.lang.Exception -> L64
            r76[] r1 = defpackage.k0d.n     // Catch: java.lang.Exception -> L64
            r4 = 3
            r1 = r1[r4]     // Catch: java.lang.Exception -> L64
            java.lang.Object r6 = r6.c(r1, r2)     // Catch: java.lang.Exception -> L64
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L64
            int r1 = r6.length()     // Catch: java.lang.Exception -> L64
            if (r1 != 0) goto L47
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L64
            return r5
        L47:
            mce r5 = r5.d     // Catch: java.lang.Exception -> L64
            r0.c = r3     // Catch: java.lang.Exception -> L64
            java.lang.Object r6 = r5.n(r6, r0)     // Catch: java.lang.Exception -> L64
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L54
            return r5
        L54:
            or9 r6 = (defpackage.or9) r6     // Catch: java.lang.Exception -> L64
            java.lang.Object r5 = r6.b     // Catch: java.lang.Exception -> L64
            if (r5 == 0) goto L64
            jcc r5 = (defpackage.jcc) r5     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = r5.a     // Catch: java.lang.Exception -> L64
            r2.f(r5)     // Catch: java.lang.Exception -> L64
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L64
            return r5
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev.b(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|8|(1:(1:(1:(5:13|14|(2:16|17)|19|20)(2:21|22))(5:23|24|25|(1:27)|28))(1:31))(8:46|47|(1:49)(1:54)|(2:51|(2:53|30))|45|(2:39|(2:41|30)(4:42|25|(0)|28))|43|44)|32|(4:34|(3:36|39|(0)(0))|43|44)|45|(0)|43|44))|56|6|7|8|(0)(0)|32|(0)|45|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
        if (r12 != r10) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:14:0x002e, B:49:0x00bc, B:51:0x00c2, B:19:0x0041, B:43:0x00a2, B:46:0x00a8, B:20:0x0049, B:31:0x006f, B:33:0x0073, B:36:0x007b, B:39:0x0082, B:53:0x00de, B:23:0x0050, B:25:0x005d, B:28:0x0066), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:14:0x002e, B:49:0x00bc, B:51:0x00c2, B:19:0x0041, B:43:0x00a2, B:46:0x00a8, B:20:0x0049, B:31:0x006f, B:33:0x0073, B:36:0x007b, B:39:0x0082, B:53:0x00de, B:23:0x0050, B:25:0x005d, B:28:0x0066), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev.c(n42):java.lang.Object");
    }
}
