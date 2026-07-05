package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ukb */
/* loaded from: classes.dex */
public abstract class ukb {
    public static final ij3 a = new ij3(3, 2, null);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0047 -> B:40:0x004a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.gab r5, boolean r6, defpackage.s09 r7, defpackage.m42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.jkb
            if (r0 == 0) goto L13
            r0 = r8
            jkb r0 = (defpackage.jkb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            jkb r0 = new jkb
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.c
            s09 r6 = r0.b
            gab r7 = r0.a
            defpackage.hre.r(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L36:
            defpackage.hre.r(r8)
        L39:
            r0.a = r5
            r0.b = r7
            r0.c = r6
            r0.e = r2
            java.lang.Object r8 = r5.j(r7, r0)
            n82 r1 = defpackage.n82.a
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r09 r8 = (defpackage.r09) r8
            r1 = 0
            boolean r3 = f(r8, r6, r1)
            if (r3 == 0) goto L39
            java.util.List r5 = r8.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukb.a(gab, boolean, s09, m42):java.lang.Object");
    }

    public static /* synthetic */ Object b(gab gabVar, boolean z, m42 m42Var, int i) {
        s09 s09Var;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            s09Var = s09.b;
        } else {
            s09Var = s09.a;
        }
        return a(gabVar, z, s09Var, m42Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0042 -> B:40:0x0045). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.gab r5, defpackage.s09 r6, defpackage.hh0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.kkb
            if (r0 == 0) goto L13
            r0 = r7
            kkb r0 = (defpackage.kkb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kkb r0 = new kkb
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            s09 r5 = r0.b
            gab r6 = r0.a
            defpackage.hre.r(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L33:
            defpackage.hre.r(r7)
        L36:
            r0.a = r5
            r0.b = r6
            r0.d = r2
            java.lang.Object r7 = r5.j(r6, r0)
            n82 r1 = defpackage.n82.a
            if (r7 != r1) goto L45
            return r1
        L45:
            r09 r7 = (defpackage.r09) r7
            r1 = 0
            boolean r3 = f(r7, r1, r2)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukb.c(gab, s09, hh0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c A[LOOP:0: B:51:0x004a->B:52:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x003d -> B:50:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.gab r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.lkb
            if (r0 == 0) goto L13
            r0 = r8
            lkb r0 = (defpackage.lkb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lkb r0 = new lkb
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            gab r7 = r0.a
            defpackage.hre.r(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.hre.r(r8)
        L31:
            r0.a = r7
            r0.c = r2
            s09 r8 = defpackage.s09.b
            java.lang.Object r8 = r7.j(r8, r0)
            n82 r1 = defpackage.n82.a
            if (r8 != r1) goto L40
            return r1
        L40:
            r09 r8 = (defpackage.r09) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            z09 r6 = (defpackage.z09) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            z09 r3 = (defpackage.z09) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukb.d(gab, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [ij3] */
    public static Object e(d19 d19Var, c9d c9dVar, ex4 ex4Var, upa upaVar, xt4 xt4Var, m42 m42Var, int i) {
        c9d c9dVar2;
        ex4 ex4Var2;
        if ((i & 1) != 0) {
            c9dVar2 = null;
        } else {
            c9dVar2 = c9dVar;
        }
        if ((i & 2) != 0) {
            ex4Var2 = null;
        } else {
            ex4Var2 = ex4Var;
        }
        upa upaVar2 = upaVar;
        if ((i & 4) != 0) {
            upaVar2 = a;
        }
        Object p = k27.p(new da(d19Var, c9dVar2, ex4Var2, upaVar2, xt4Var, (m42) null, 17), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    public static final boolean f(r09 r09Var, boolean z, boolean z2) {
        boolean k;
        if (z2) {
            List list = r09Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((z09) list.get(i)).i != 2) {
                        break;
                    }
                    i++;
                } else if ((r09Var.d & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = r09Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            z09 z09Var = (z09) list2.get(i2);
            if (z) {
                k = ie2.j(z09Var);
            } else {
                k = ie2.k(z09Var);
            }
            if (!k) {
                return false;
            }
        }
        return true;
    }

    public static iya g(m82 m82Var, w26 w26Var, lu4 lu4Var) {
        return z87.v(m82Var, null, p82.d, new qkb(w26Var, lu4Var, (m42) null, 0), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e2  */
    /* JADX WARN: Type inference failed for: r0v23, types: [w26] */
    /* JADX WARN: Type inference failed for: r0v9, types: [w26] */
    /* JADX WARN: Type inference failed for: r15v21, types: [xt4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r2v2, types: [hh0, rkb, m42, n42] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.gab r21, defpackage.m82 r22, defpackage.j59 r23, defpackage.xt4 r24, defpackage.xt4 r25, defpackage.mu4 r26, defpackage.xt4 r27, defpackage.hh0 r28) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukb.h(gab, m82, j59, xt4, xt4, mu4, xt4, hh0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002e  */
    /* JADX WARN: Type inference failed for: r9v2, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.gab r7, defpackage.s09 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.skb
            if (r0 == 0) goto L13
            r0 = r9
            skb r0 = (defpackage.skb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            skb r0 = new skb
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            zl9 r7 = r0.a
            defpackage.hre.r(r9)     // Catch: defpackage.t09 -> L59
            goto L56
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L2e:
            defpackage.hre.r(r9)
            zl9 r9 = new zl9
            r9.<init>()
            by6 r1 = defpackage.by6.a
            r9.a = r1
            ucd r1 = r7.p()     // Catch: defpackage.t09 -> L59
            long r4 = r1.b()     // Catch: defpackage.t09 -> L59
            d r1 = new d     // Catch: defpackage.t09 -> L59
            r6 = 7
            r1.<init>(r8, r9, r2, r6)     // Catch: defpackage.t09 -> L59
            r0.a = r9     // Catch: defpackage.t09 -> L59
            r0.c = r3     // Catch: defpackage.t09 -> L59
            java.lang.Object r7 = r7.t(r4, r1, r0)     // Catch: defpackage.t09 -> L59
            n82 r8 = defpackage.n82.a
            if (r7 != r8) goto L55
            return r8
        L55:
            r7 = r9
        L56:
            java.lang.Object r7 = r7.a
            return r7
        L59:
            dy6 r7 = defpackage.dy6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukb.i(gab, s09, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ad, code lost:
        if (r0 == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c7, code lost:
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x00ad -> B:67:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.gab r17, defpackage.s09 r18, defpackage.hh0 r19) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukb.j(gab, s09, hh0):java.lang.Object");
    }
}
