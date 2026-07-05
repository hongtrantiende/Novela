package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x1c  reason: default package */
/* loaded from: classes3.dex */
public final class x1c {
    public final String a;
    public final ii2 b;
    public final h1a c;
    public zm9 d;
    public Map e;
    public Map f;
    public o1c g;
    public ArrayList h;
    public List i;
    public final sw7 j;

    public x1c(String str, ii2 ii2Var, h1a h1aVar) {
        str.getClass();
        this.a = str;
        this.b = ii2Var;
        this.c = h1aVar;
        this.j = new sw7();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tr9 g(defpackage.d56 r5) {
        /*
            java.lang.String r0 = "code"
            java.lang.Object r0 = r5.get(r0)
            k46 r0 = (defpackage.k46) r0
            r1 = 0
            if (r0 == 0) goto L1e
            i56 r0 = defpackage.oc2.C(r0)
            if (r0 == 0) goto L16
            java.lang.Integer r0 = defpackage.l46.e(r0)
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            goto L1f
        L1e:
            r0 = 1
        L1f:
            java.lang.String r2 = "data"
            java.lang.Object r2 = r5.get(r2)
            k46 r2 = (defpackage.k46) r2
            if (r2 == 0) goto L2e
            java.lang.String r2 = defpackage.oc2.x(r2)
            goto L2f
        L2e:
            r2 = r1
        L2f:
            java.lang.String r3 = ""
            if (r2 != 0) goto L34
            r2 = r3
        L34:
            java.lang.String r4 = "data2"
            java.lang.Object r5 = r5.get(r4)
            k46 r5 = (defpackage.k46) r5
            if (r5 == 0) goto L42
            java.lang.String r1 = defpackage.oc2.x(r5)
        L42:
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r1
        L46:
            tr9 r5 = new tr9
            r5.<init>(r3, r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.g(d56):tr9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r9.o(r0) == r6) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:23:0x004e, B:25:0x0052, B:29:0x0068), top: B:40:0x004e }] */
    /* JADX WARN: Type inference failed for: r1v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r8v0, types: [x1c] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [qw7] */
    /* JADX WARN: Type inference failed for: r8v8, types: [qw7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.r1c
            if (r0 == 0) goto L13
            r0 = r9
            r1c r0 = (defpackage.r1c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            r1c r0 = new r1c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            pvc r2 = defpackage.pvc.a
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            qw7 r8 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L2f
            goto L84
        L2f:
            r9 = move-exception
            goto L8f
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r5
        L37:
            qw7 r1 = r0.a
            defpackage.hre.r(r9)
            r9 = r1
            goto L4e
        L3e:
            defpackage.hre.r(r9)
            sw7 r9 = r8.j
            r0.a = r9
            r0.d = r4
            java.lang.Object r1 = r9.o(r0)
            if (r1 != r6) goto L4e
            goto L82
        L4e:
            zm9 r1 = r8.d     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L8b
            ii2 r1 = r8.b     // Catch: java.lang.Throwable -> L86
            gk2 r1 = r1.I     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = r8.a     // Catch: java.lang.Throwable -> L86
            pf9 r1 = r1.k0(r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L86
            un2 r1 = (defpackage.un2) r1     // Catch: java.lang.Throwable -> L86
            if (r1 != 0) goto L68
            r9.q(r5)
            return r2
        L68:
            java.util.Map r4 = r1.p     // Catch: java.lang.Throwable -> L86
            r8.e = r4     // Catch: java.lang.Throwable -> L86
            java.util.Map r4 = r1.q     // Catch: java.lang.Throwable -> L86
            r8.f = r4     // Catch: java.lang.Throwable -> L86
            h1a r4 = r8.c     // Catch: java.lang.Throwable -> L86
            zm9 r1 = r4.a(r1)     // Catch: java.lang.Throwable -> L86
            r8.d = r1     // Catch: java.lang.Throwable -> L86
            r0.a = r9     // Catch: java.lang.Throwable -> L86
            r0.d = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r8 = r8.f(r0)     // Catch: java.lang.Throwable -> L86
            if (r8 != r6) goto L83
        L82:
            return r6
        L83:
            r8 = r9
        L84:
            r9 = r8
            goto L8b
        L86:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L8f
        L8b:
            r9.q(r5)
            return r2
        L8f:
            r8.q(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.a(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.s1c
            if (r0 == 0) goto L13
            r0 = r12
            s1c r0 = (defpackage.s1c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            s1c r0 = new s1c
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r12)
            goto L3a
        L25:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            r11 = 0
            return r11
        L2c:
            defpackage.hre.r(r12)
            r0.c = r2
            java.lang.Object r12 = r11.a(r0)
            n82 r0 = defpackage.n82.a
            if (r12 != r0) goto L3a
            return r0
        L3a:
            o1c r11 = r11.g
            r11.getClass()
            int r1 = r11.a
            boolean r2 = r11.b
            int r3 = r11.c
            boolean r9 = r11.d
            java.lang.String r10 = r11.e
            syb r0 = new syb
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8 = 1
            r4 = 1
            r5 = 1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.b(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.t1c
            if (r0 == 0) goto L13
            r0 = r5
            t1c r0 = (defpackage.t1c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            t1c r0 = new t1c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.hre.r(r5)
            goto L3a
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r5)
            r0.c = r3
            java.lang.Object r5 = r4.a(r0)
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L3a
            return r0
        L3a:
            java.util.List r4 = r4.i
            if (r4 == 0) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.tl1.s(r4, r5)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L4d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L66
            java.lang.Object r5 = r4.next()
            p1c r5 = (defpackage.p1c) r5
            tyb r0 = new tyb
            java.lang.String r1 = r5.a
            java.lang.String r5 = r5.b
            r0.<init>(r1, r5)
            r2.add(r0)
            goto L4d
        L66:
            if (r2 != 0) goto L6b
            ks3 r4 = defpackage.ks3.a
            return r4
        L6b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.c(n42):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (a(r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r10 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:34:0x0076, B:36:0x008e, B:39:0x0099, B:44:0x00a4, B:46:0x00ae, B:48:0x00b4, B:50:0x00bc, B:52:0x00c1, B:53:0x00c6, B:54:0x00c7, B:55:0x00cb, B:56:0x00cc, B:57:0x00d1, B:22:0x004e, B:24:0x0052, B:26:0x0056, B:30:0x0063), top: B:71:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:34:0x0076, B:36:0x008e, B:39:0x0099, B:44:0x00a4, B:46:0x00ae, B:48:0x00b4, B:50:0x00bc, B:52:0x00c1, B:53:0x00c6, B:54:0x00c7, B:55:0x00cb, B:56:0x00cc, B:57:0x00d1, B:22:0x004e, B:24:0x0052, B:26:0x0056, B:30:0x0063), top: B:71:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:34:0x0076, B:36:0x008e, B:39:0x0099, B:44:0x00a4, B:46:0x00ae, B:48:0x00b4, B:50:0x00bc, B:52:0x00c1, B:53:0x00c6, B:54:0x00c7, B:55:0x00cb, B:56:0x00cc, B:57:0x00d1, B:22:0x004e, B:24:0x0052, B:26:0x0056, B:30:0x0063), top: B:71:0x0023 }] */
    /* JADX WARN: Type inference failed for: r7v20, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r8, java.lang.String r9, defpackage.n42 r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.d(java.lang.String, java.lang.String, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.v1c
            if (r0 == 0) goto L13
            r0 = r8
            v1c r0 = (defpackage.v1c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v1c r0 = new v1c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L3e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L2e:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.a(r0)
            n82 r0 = defpackage.n82.a
            if (r8 != r0) goto L3e
            return r0
        L3e:
            java.util.ArrayList r6 = r6.h
            if (r6 == 0) goto L8a
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L4d:
            if (r2 >= r0) goto L64
            java.lang.Object r4 = r6.get(r2)
            int r2 = r2 + 1
            r5 = r4
            q1c r5 = (defpackage.q1c) r5
            java.lang.String r5 = r5.c
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L4d
            r8.add(r4)
            goto L4d
        L64:
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.tl1.s(r8, r6)
            r2.<init>(r6)
            int r6 = r8.size()
        L73:
            if (r1 >= r6) goto L8a
            java.lang.Object r7 = r8.get(r1)
            int r1 = r1 + 1
            q1c r7 = (defpackage.q1c) r7
            wyb r0 = new wyb
            java.lang.String r4 = r7.a
            java.lang.String r7 = r7.b
            r0.<init>(r4, r7, r3)
            r2.add(r0)
            goto L73
        L8a:
            if (r2 != 0) goto L8f
            ks3 r6 = defpackage.ks3.a
            return r6
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.e(java.lang.String, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1c.f(n42):java.lang.Object");
    }
}
