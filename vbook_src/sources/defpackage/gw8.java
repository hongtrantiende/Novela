package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gw8  reason: default package */
/* loaded from: classes3.dex */
public final class gw8 {
    public s26 a;
    public tu8 b;
    public e48 c;
    public int d;
    public int e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r0v4, types: [my0, java.lang.Object] */
    public static qla b(String str) {
        Object gs9Var;
        byte[] p0;
        m66 m66Var = pe4.a;
        hn8 f = hn8.f(hn8.f(hn8.f(ie2.u(m66Var), "tts"), "data"), str.concat("-word_id.bin"));
        Object obj = null;
        if (!m66Var.j0(f)) {
            return null;
        }
        try {
            qw5 J = tl1.J(f.toFile());
            ?? obj2 = new Object();
            obj2.J(J);
            p0 = obj2.p0(obj2.b);
            try {
                J.close();
                obj2.o();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            gs9Var = new gs9(th2);
        }
        if (th == null) {
            gs9Var = wq9.I(p0);
            if (!(gs9Var instanceof gs9)) {
                obj = gs9Var;
            }
            return (qla) obj;
        }
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
        if (defpackage.pe4.a.j0(r6) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0153, code lost:
        if (r8 == null) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a9  */
    /* JADX WARN: Type inference failed for: r0v43, types: [e48] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r10v6, types: [ejf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [my0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.t9 r18, defpackage.hn8 r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw8.a(t9, hn8, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
        if (r1 == r12) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[LOOP:0: B:43:0x0098->B:44:0x009a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r14, int r15, double r16, boolean r18, defpackage.n42 r19) {
        /*
            r13 = this;
            r1 = r19
            boolean r2 = r1 instanceof defpackage.dw8
            if (r2 == 0) goto L16
            r2 = r1
            dw8 r2 = (defpackage.dw8) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.c = r3
        L14:
            r10 = r2
            goto L1c
        L16:
            dw8 r2 = new dw8
            r2.<init>(r13, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r10.a
            int r2 = r10.c
            r6 = 2
            r3 = 1
            r11 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L35
            if (r2 != r6) goto L2e
            defpackage.hre.r(r1)
            goto L91
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L35:
            defpackage.hre.r(r1)
            return r1
        L39:
            defpackage.hre.r(r1)
            s26 r1 = r13.a
            if (r1 != 0) goto L43
            short[] r0 = new short[r11]
            return r0
        L43:
            tu8 r1 = r13.b
            if (r1 != 0) goto L4a
            short[] r0 = new short[r11]
            return r0
        L4a:
            e48 r1 = r13.c
            if (r1 != 0) goto L51
            short[] r0 = new short[r11]
            return r0
        L51:
            java.lang.String r1 = r1.a(r14)
            int r2 = r13.d
            int r2 = r2 - r3
            if (r2 >= 0) goto L5b
            r2 = r11
        L5b:
            int r2 = defpackage.dce.n(r15, r11, r2)
            n82 r12 = defpackage.n82.a
            if (r18 != 0) goto L71
            r10.c = r3
            r0 = r13
            r3 = r16
            r5 = r10
            java.io.Serializable r0 = r0.d(r1, r2, r3, r5)
            if (r0 != r12) goto L70
            goto L90
        L70:
            return r0
        L71:
            r7 = r1
            y40 r8 = defpackage.y40.a
            ew8 r0 = new ew8
            r5 = 0
            r1 = r13
            r3 = r16
            r0.<init>(r1, r2, r3, r5)
            r10.c = r6
            r1 = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r4 = r1
            r3 = r8
            r8 = r0
            java.lang.Object r1 = r3.a(r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r12) goto L91
        L90:
            return r12
        L91:
            cw4 r1 = (defpackage.cw4) r1
            float[] r0 = r1.a
            int r1 = r0.length
            short[] r2 = new short[r1]
        L98:
            if (r11 >= r1) goto Laf
            r3 = r0[r11]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = defpackage.dce.m(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r2[r11] = r3
            int r11 = r11 + 1
            goto L98
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw8.c(java.lang.String, int, double, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Type inference failed for: r4v10, types: [short[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [short[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [short[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [short[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, short[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r5, int r6, double r7, defpackage.n42 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.fw8
            if (r0 == 0) goto L14
            r0 = r9
            fw8 r0 = (defpackage.fw8) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            fw8 r0 = new fw8
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.a
            int r1 = r9.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            defpackage.hre.r(r0)
            goto L56
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2f:
            defpackage.hre.r(r0)
            r0 = r4
            s26 r4 = r0.a
            if (r4 != 0) goto L3a
            short[] r4 = new short[r3]
            return r4
        L3a:
            tu8 r0 = r0.b
            if (r0 != 0) goto L41
            short[] r4 = new short[r3]
            return r4
        L41:
            int[] r5 = r0.b(r5)
            int r0 = r5.length
            if (r0 != 0) goto L4b
            short[] r4 = new short[r3]
            return r4
        L4b:
            r9.c = r2
            java.io.Serializable r0 = r4.S(r5, r6, r7, r9)
            n82 r4 = defpackage.n82.a
            if (r0 != r4) goto L56
            return r4
        L56:
            short[] r0 = (short[]) r0
            r0.getClass()
            int r4 = r0.length
            if (r4 != 0) goto L5f
            goto L8b
        L5f:
            r4 = r3
        L60:
            int r5 = r0.length
            r6 = 196(0xc4, float:2.75E-43)
            if (r4 >= r5) goto L70
            short r5 = r0[r4]
            int r5 = java.lang.Math.abs(r5)
            if (r5 > r6) goto L70
            int r4 = r4 + 1
            goto L60
        L70:
            int r5 = r0.length
            if (r4 != r5) goto L76
            short[] r4 = new short[r3]
            return r4
        L76:
            int r5 = r0.length
            int r5 = r5 - r2
        L78:
            if (r5 <= r4) goto L85
            short r7 = r0[r5]
            int r7 = java.lang.Math.abs(r7)
            if (r7 > r6) goto L85
            int r5 = r5 + (-1)
            goto L78
        L85:
            if (r4 != 0) goto L8c
            int r6 = r0.length
            int r6 = r6 - r2
            if (r5 != r6) goto L8c
        L8b:
            return r0
        L8c:
            int r5 = r5 + r2
            int r6 = r0.length
            defpackage.sue.m(r5, r6)
            short[] r4 = java.util.Arrays.copyOfRange(r0, r4, r5)
            r4.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw8.d(java.lang.String, int, double, n42):java.io.Serializable");
    }
}
