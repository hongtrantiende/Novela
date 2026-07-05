package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lp1  reason: default package */
/* loaded from: classes3.dex */
public final class lp1 implements cq5 {
    public un2 C;
    public hk2 D;
    public pta E;
    public final String a;
    public final ii2 b;
    public final re5 c;
    public final pb1 d;
    public final h1a e;
    public final sw7 f;

    public lp1(String str, ii2 ii2Var, re5 re5Var, pb1 pb1Var, h1a h1aVar) {
        str.getClass();
        this.a = str;
        this.b = ii2Var;
        this.c = re5Var;
        this.d = pb1Var;
        this.e = h1aVar;
        this.f = new sw7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5, types: [hq5] */
    /* JADX WARN: Type inference failed for: r5v0, types: [hq5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eq5 G(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.G(java.lang.String):eq5");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(2:11|(3:13|14|(1:19)(2:16|17))(2:20|21))(2:22|23))(1:24))(5:36|37|(1:42)|43|(2:45|32))|25|(4:27|28|29|30)(3:35|14|(0)(0))))|48|6|7|(0)(0)|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
        if (r10 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
        r10 = new defpackage.gs9(r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:40:0x0099, B:41:0x009c, B:42:0x00a3, B:18:0x0036, B:30:0x006f, B:32:0x007b, B:36:0x0089, B:21:0x003d, B:23:0x0050, B:26:0x0057, B:27:0x005c), top: B:52:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable C(java.lang.String r8, java.lang.String r9, defpackage.n42 r10) {
        /*
            r7 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = r10 instanceof defpackage.jp1
            if (r1 == 0) goto L15
            r1 = r10
            jp1 r1 = (defpackage.jp1) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            jp1 r1 = new jp1
            r1.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r1.a
            int r2 = r1.c
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L30
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L2d
            goto L97
        L2d:
            r7 = move-exception
            goto La6
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r5
        L36:
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L2d
            goto L6f
        L3a:
            defpackage.hre.r(r10)
            re5 r7 = r7.c     // Catch: java.lang.Throwable -> L2d
            gh5 r10 = new gh5     // Catch: java.lang.Throwable -> L2d
            r10.<init>()     // Catch: java.lang.Throwable -> L2d
            h40 r2 = defpackage.hh5.a     // Catch: java.lang.Throwable -> L2d
            r8.getClass()     // Catch: java.lang.Throwable -> L2d
            xtc r2 = r10.a     // Catch: java.lang.Throwable -> L2d
            defpackage.ytc.b(r2, r8)     // Catch: java.lang.Throwable -> L2d
            if (r9 == 0) goto L5c
            int r8 = r9.length()     // Catch: java.lang.Throwable -> L2d
            if (r8 != 0) goto L57
            goto L5c
        L57:
            java.lang.String r8 = "Referer"
            defpackage.kqe.t(r10, r8, r9)     // Catch: java.lang.Throwable -> L2d
        L5c:
            pg5 r8 = defpackage.pg5.b     // Catch: java.lang.Throwable -> L2d
            r10.d(r8)     // Catch: java.lang.Throwable -> L2d
            hi5 r8 = new hi5     // Catch: java.lang.Throwable -> L2d
            r8.<init>(r10, r7)     // Catch: java.lang.Throwable -> L2d
            r1.c = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = r8.c(r1)     // Catch: java.lang.Throwable -> L2d
            if (r10 != r6) goto L6f
            goto L96
        L6f:
            oh5 r10 = (defpackage.oh5) r10     // Catch: java.lang.Throwable -> L2d
            ii5 r7 = r10.e()     // Catch: java.lang.Throwable -> L2d
            boolean r7 = defpackage.uue.B(r7)     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto La4
            te5 r7 = r10.y0()     // Catch: java.lang.Throwable -> L2d
            gi1 r8 = defpackage.cm9.a(r0)     // Catch: java.lang.Throwable -> L2d
            nsc r9 = defpackage.cm9.d(r0)     // Catch: java.lang.Throwable -> L88
            goto L89
        L88:
            r9 = r5
        L89:
            isc r10 = new isc     // Catch: java.lang.Throwable -> L2d
            r10.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2d
            r1.c = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = r7.a(r10, r1)     // Catch: java.lang.Throwable -> L2d
            if (r10 != r6) goto L97
        L96:
            return r6
        L97:
            if (r10 == 0) goto L9c
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L2d
            goto Lab
        L9c:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.ByteArray"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2d
            throw r7     // Catch: java.lang.Throwable -> L2d
        La4:
            r10 = r5
            goto Lab
        La6:
            gs9 r10 = new gs9
            r10.<init>(r7)
        Lab:
            boolean r7 = r10 instanceof defpackage.gs9
            if (r7 == 0) goto Lb0
            goto Lb1
        Lb0:
            r5 = r10
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.C(java.lang.String, java.lang.String, n42):java.io.Serializable");
    }

    @Override // defpackage.cq5
    public final iq5 f() {
        String str;
        un2 un2Var = this.C;
        if (un2Var != null) {
            str = un2Var.b;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new iq5(str, true, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x0041, B:20:0x0049), top: B:28:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.hp1
            if (r0 == 0) goto L13
            r0 = r5
            hp1 r0 = (defpackage.hp1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hp1 r0 = new hp1
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
            un2 r5 = r4.q()     // Catch: java.lang.Throwable -> L53
            pta r1 = r4.E     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L55
            pta r1 = new pta     // Catch: java.lang.Throwable -> L53
            h1a r2 = r4.e     // Catch: java.lang.Throwable -> L53
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L53
            r4.E = r1     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r4 = move-exception
            goto L59
        L55:
            r0.q(r3)
            return r1
        L59:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.o(n42):java.lang.Object");
    }

    public final un2 q() {
        if (this.C == null) {
            ii2 ii2Var = this.b;
            hk2 hk2Var = (hk2) ii2Var.c.k0(this.a).d();
            this.D = hk2Var;
            this.C = g54.a(ii2Var, hk2Var.j, hk2Var.l);
        }
        un2 un2Var = this.C;
        if (un2Var != null) {
            return un2Var;
        }
        throw new Exception();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r9v5, types: [my0, java.lang.Object] */
    @Override // defpackage.cq5
    public final Object s(String str, Map map, n42 n42Var) {
        Throwable th;
        byte[] bArr = null;
        if (r4b.Q(str, "http", false)) {
            String str2 = (String) map.get("script");
            String str3 = (String) map.get("Referer");
            n82 n82Var = n82.a;
            if (str2 != null && str2.length() != 0) {
                Object E = z87.E(ab3.a, new n0(this, str2, str, null, 24), n42Var);
                if (E == n82Var) {
                    return E;
                }
                return (byte[]) E;
            }
            Serializable C = C(str, str3, n42Var);
            if (C == n82Var) {
                return C;
            }
            return (byte[]) C;
        }
        m66 m66Var = pe4.a;
        hn8 f = hn8.f(hn8.f(hn8.f(ie2.r(m66Var), this.a), "images"), str);
        if (!m66Var.j0(f)) {
            return null;
        }
        qw5 J = tl1.J(f.toFile());
        ?? obj = new Object();
        try {
            obj.J(J);
            byte[] p0 = obj.p0(obj.b);
            try {
                J.close();
                obj.o();
            } catch (Throwable th2) {
                bArr = th2;
            }
            byte[] bArr2 = bArr;
            bArr = p0;
            th = bArr2;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            try {
                J.close();
                obj.o();
                th = th4;
            } catch (Throwable th5) {
                pye.e(th4, th5);
                th = th4;
            }
        }
        if (th == null) {
            return bArr;
        }
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    @Override // defpackage.cq5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(int r14, defpackage.m42 r15, java.lang.String r16) {
        /*
            r13 = this;
            boolean r2 = r15 instanceof defpackage.gp1
            if (r2 == 0) goto L13
            r2 = r15
            gp1 r2 = (defpackage.gp1) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.e = r3
            goto L1b
        L13:
            gp1 r2 = new gp1
            r1 = r15
            n42 r1 = (defpackage.n42) r1
            r2.<init>(r13, r1)
        L1b:
            java.lang.Object r1 = r2.c
            int r3 = r2.e
            r4 = 0
            r5 = 2
            r6 = 1
            n82 r7 = defpackage.n82.a
            if (r3 == 0) goto L42
            if (r3 == r6) goto L37
            if (r3 != r5) goto L31
            int r2 = r2.a
            defpackage.hre.r(r1)
            r5 = r2
            goto L65
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            return r4
        L37:
            int r3 = r2.a
            java.lang.String r6 = r2.b
            defpackage.hre.r(r1)
            r12 = r6
            r6 = r1
            r1 = r12
            goto L55
        L42:
            defpackage.hre.r(r1)
            r1 = r16
            r2.b = r1
            r2.a = r14
            r2.e = r6
            java.lang.Object r6 = r13.o(r2)
            if (r6 != r7) goto L54
            goto L63
        L54:
            r3 = r14
        L55:
            pta r6 = (defpackage.pta) r6
            r2.b = r4
            r2.a = r3
            r2.e = r5
            java.lang.Object r1 = r6.d(r1, r2)
            if (r1 != r7) goto L64
        L63:
            return r7
        L64:
            r5 = r3
        L65:
            dta r1 = (defpackage.dta) r1
            java.lang.String r2 = r1.b
            eq5 r2 = G(r2)
            yj1 r3 = defpackage.by5.a
            zx5 r3 = r3.k()
            long r7 = r3.b()
            ii2 r3 = r13.b
            gk2 r4 = r3.C
            java.util.ArrayList r2 = r2.b
            int r2 = r2.size()
            java.lang.String r6 = r13.a
            r4.N0(r2, r5, r6)
            gk2 r11 = r3.D
            xm2 r2 = new xm2
            java.lang.String r3 = "_"
            java.lang.String r3 = defpackage.a82.m(r6, r3, r5)
            java.lang.String r4 = "raw"
            java.lang.String r1 = r1.b
            java.util.Map r6 = java.util.Collections.singletonMap(r4, r1)
            r6.getClass()
            java.lang.String r4 = r13.a
            r9 = r7
            r2.<init>(r3, r4, r5, r6, r7, r9)
            r11.w0(r2)
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.t(int, m42, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
        if (r15 != r8) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    @Override // defpackage.cq5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r12, java.lang.String r13, boolean r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.u(int, java.lang.String, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:102)|103|104|105|106|(9:108|109|110|111|112|113|(1:115)|116|(2:121|(1:124)(7:123|13|14|15|(1:17)|100|(0)))(6:120|14|15|(0)|100|(0)))|128|129) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
        if (r3 == r13) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0200, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0201, code lost:
        r52 = r15;
        r15 = r2;
        r2 = r4;
        r4 = r52;
        r52 = r6;
        r6 = r3;
        r3 = r52;
        r52 = r11;
        r11 = r5;
        r5 = r7;
        r7 = r52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r53v0, types: [java.lang.Object, lp1] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0282 -> B:101:0x0286). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x018f -> B:64:0x019d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0230 -> B:96:0x023d). Please submit an issue!!! */
    @Override // defpackage.cq5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(boolean r54, defpackage.n42 r55) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp1.x(boolean, n42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
