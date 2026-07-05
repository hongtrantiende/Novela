package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mnb  reason: default package */
/* loaded from: classes3.dex */
public final class mnb implements fnb {
    public final qwb a;
    public final ih8 b;

    static {
        r76[] r76VarArr = qwb.A;
    }

    public mnb(qwb qwbVar, ih8 ih8Var) {
        this.a = qwbVar;
        this.b = ih8Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|(1:(1:9)(2:38|39))(2:40|(1:42))|10|(1:(2:12|(1:14))(2:36|37))|15|(1:17)|18|19|20|(1:22)|23|24))|43|6|(0)(0)|10|(2:(0)(0)|13)|15|(0)|18|19|20|(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        r7 = r7.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r7 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if (defpackage.jy.a() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
        r8 = defpackage.kw6.b;
        r0 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r8.a.a.compareTo(r0) <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r8.a(r0, "Log", r7, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.gnb
            if (r0 == 0) goto L13
            r0 = r8
            gnb r0 = (defpackage.gnb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gnb r0 = new gnb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            n82 r1 = defpackage.n82.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L3e
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L30:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r3
            java.util.List r8 = r6.j()
            if (r8 != r1) goto L3e
            return r1
        L3e:
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.ArrayList r8 = defpackage.sl1.E0(r8)
            int r0 = r8.size()
            r1 = 0
            r2 = r1
        L4a:
            if (r2 >= r0) goto L5e
            java.lang.Object r3 = r8.get(r2)
            int r2 = r2 + 1
            r5 = r3
            sn1 r5 = (defpackage.sn1) r5
            java.lang.String r5 = r5.a
            boolean r5 = defpackage.c16.i(r5, r7)
            if (r5 == 0) goto L4a
            goto L5f
        L5e:
            r3 = r4
        L5f:
            sn1 r3 = (defpackage.sn1) r3
            if (r3 == 0) goto L7c
            m66 r0 = defpackage.pe4.a
            hn8 r2 = defpackage.ie2.u(r0)
            java.lang.String r3 = "resources"
            hn8 r2 = defpackage.hn8.f(r2, r3)
            java.lang.String r3 = "backgrounds"
            hn8 r2 = defpackage.hn8.f(r2, r3)
            hn8 r2 = defpackage.hn8.f(r2, r7)
            r0.V(r2, r1)
        L7c:
            a23 r0 = new a23
            r2 = 15
            r0.<init>(r7, r2)
            defpackage.xl1.Q(r8, r0)
            qwb r6 = r6.a
            s46 r7 = defpackage.v46.a     // Catch: java.lang.Exception -> L9d
            r7.getClass()     // Catch: java.lang.Exception -> L9d
            sz r0 = new sz     // Catch: java.lang.Exception -> L9d
            rn1 r2 = defpackage.sn1.Companion     // Catch: java.lang.Exception -> L9d
            s76 r2 = r2.serializer()     // Catch: java.lang.Exception -> L9d
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L9d
            java.lang.String r4 = r7.b(r0, r8)     // Catch: java.lang.Exception -> L9d
            goto Lbf
        L9d:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto La6
            java.lang.String r7 = ""
        La6:
            boolean r8 = defpackage.jy.a()
            if (r8 == 0) goto Lbf
            kw6 r8 = defpackage.kw6.b
            iea r0 = defpackage.iea.e
            z56 r1 = r8.a
            iea r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto Lbf
            java.lang.String r1 = "Log"
            r8.a(r0, r1, r7, r4)
        Lbf:
            if (r4 != 0) goto Lc3
            java.lang.String r4 = "[]"
        Lc3:
            u68 r6 = r6.g
            r76[] r7 = defpackage.qwb.A
            r8 = 8
            r7 = r7[r8]
            r6.e(r7, r4)
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.a(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|(1:(1:9)(2:33|34))(2:35|(1:37))|10|11|12|13|(1:15)|16|(2:19|17)|20|21))|38|6|(0)(0)|10|11|12|13|(0)|16|(1:17)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        r5 = r5.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (defpackage.jy.a() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
        r6 = defpackage.kw6.b;
        r0 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r6.a.a.compareTo(r0) <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        r6.a(r0, "Log", r5, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[LOOP:0: B:33:0x0097->B:35:0x009d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.hnb
            if (r0 == 0) goto L13
            r0 = r6
            hnb r0 = (defpackage.hnb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hnb r0 = new hnb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r5 = r0.a
            n82 r6 = defpackage.n82.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.hre.r(r5)
            goto L3e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L2e:
            defpackage.hre.r(r5)
            r0.c = r2
            tza r5 = defpackage.fr9.a
            java.lang.String r5 = "composeResources/com.reader.resources/files/reader/theme.json"
            java.lang.Object r5 = defpackage.ns2.b(r5)
            if (r5 != r6) goto L3e
            return r6
        L3e:
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = defpackage.r4b.F(r5)
            s46 r6 = defpackage.v46.a     // Catch: java.lang.Exception -> L60
            r6.getClass()     // Catch: java.lang.Exception -> L60
            sz r0 = new sz     // Catch: java.lang.Exception -> L60
            rn1 r1 = defpackage.sn1.Companion     // Catch: java.lang.Exception -> L60
            s76 r1 = r1.serializer()     // Catch: java.lang.Exception -> L60
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L60
            s76 r0 = defpackage.wq9.H(r0)     // Catch: java.lang.Exception -> L60
            s76 r0 = (defpackage.s76) r0     // Catch: java.lang.Exception -> L60
            java.lang.Object r3 = r6.a(r0, r5)     // Catch: java.lang.Exception -> L60
            goto L82
        L60:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            if (r5 != 0) goto L69
            java.lang.String r5 = ""
        L69:
            boolean r6 = defpackage.jy.a()
            if (r6 == 0) goto L82
            kw6 r6 = defpackage.kw6.b
            iea r0 = defpackage.iea.e
            z56 r1 = r6.a
            iea r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L82
            java.lang.String r1 = "Log"
            r6.a(r0, r1, r5, r3)
        L82:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L88
            ks3 r3 = defpackage.ks3.a
        L88:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.tl1.s(r3, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r3.iterator()
        L97:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r6.next()
            sn1 r0 = (defpackage.sn1) r0
            pn1 r1 = new pn1
            java.lang.String r2 = r0.a
            java.lang.String r3 = r0.b
            java.lang.String r4 = r0.c
            java.lang.String r0 = r0.d
            r1.<init>(r2, r3, r4, r0)
            r5.add(r1)
            goto L97
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.b(n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[LOOP:0: B:21:0x0054->B:23:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[LOOP:1: B:32:0x0090->B:34:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.lang.String r8, defpackage.n42 r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.c(java.lang.String, n42):java.io.Serializable");
    }

    public final boolean d() {
        qwb qwbVar = this.a;
        return ((Boolean) qwbVar.k.c(qwb.A[12], qwbVar)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0146 A[LOOP:0: B:29:0x0140->B:31:0x0146, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.e(java.lang.String, n42):java.io.Serializable");
    }

    public final String f() {
        qwb qwbVar = this.a;
        return (String) qwbVar.l.c(qwb.A[13], qwbVar);
    }

    public final float g() {
        qwb qwbVar = this.a;
        return ((Number) qwbVar.m.c(qwb.A[14], qwbVar)).floatValue();
    }

    public final int h() {
        qwb qwbVar = this.a;
        return ((Number) qwbVar.s.c(qwb.A[20], qwbVar)).intValue();
    }

    public final float i() {
        qwb qwbVar = this.a;
        return ((Number) qwbVar.o.c(qwb.A[16], qwbVar)).floatValue();
    }

    public final List j() {
        Object obj;
        qwb qwbVar = this.a;
        String str = (String) qwbVar.g.c(qwb.A[8], qwbVar);
        try {
            s46 s46Var = v46.a;
            s46Var.getClass();
            obj = s46Var.a(wq9.H(new sz(sn1.Companion.serializer(), 0)), str);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (jy.a()) {
                kw6 kw6Var = kw6.b;
                iea ieaVar = iea.e;
                if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                    kw6Var.a(ieaVar, "Log", message, null);
                }
            }
            obj = null;
        }
        List list = (List) obj;
        if (list == null) {
            return ks3.a;
        }
        return list;
    }

    public final int k() {
        qwb qwbVar = this.a;
        return ((Number) qwbVar.t.c(qwb.A[21], qwbVar)).intValue();
    }

    public final int l() {
        qwb qwbVar = this.a;
        return ((Number) qwbVar.a.c(qwb.A[0], qwbVar)).intValue();
    }

    public final float m() {
        qwb qwbVar = this.a;
        return ((Number) qwbVar.n.c(qwb.A[15], qwbVar)).floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[LOOP:0: B:18:0x004b->B:20:0x0051, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable n(defpackage.n42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.knb
            if (r0 == 0) goto L13
            r0 = r6
            knb r0 = (defpackage.knb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            knb r0 = new knb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            goto L3a
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.hre.r(r6)
            r0.c = r2
            java.util.List r6 = r5.j()
            n82 r5 = defpackage.n82.a
            if (r6 != r5) goto L3a
            return r5
        L3a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L4b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r6.next()
            sn1 r0 = (defpackage.sn1) r0
            pn1 r1 = new pn1
            java.lang.String r2 = r0.a
            java.lang.String r3 = r0.b
            java.lang.String r4 = r0.c
            java.lang.String r0 = r0.d
            r1.<init>(r2, r3, r4, r0)
            r5.add(r1)
            goto L4b
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.n(n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r15 == r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r11, java.lang.String r12, java.lang.String r13, defpackage.f76 r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnb.o(java.lang.String, java.lang.String, java.lang.String, f76, n42):java.lang.Object");
    }

    public final void p(boolean z) {
        this.a.k.e(qwb.A[12], Boolean.valueOf(z));
    }
}
