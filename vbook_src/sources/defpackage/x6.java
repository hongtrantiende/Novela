package defpackage;

import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x6  reason: default package */
/* loaded from: classes3.dex */
public final class x6 implements t6 {
    public final re5 a;
    public final rw b;
    public final sw7 c = new sw7();
    public final HashSet d = new HashSet();
    public final cza e = dza.a(null);

    public x6(re5 re5Var, rw rwVar) {
        this.a = re5Var;
        this.b = rwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r14 == r11) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        if (r14 == r11) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0110, code lost:
        if (c(r3) == r11) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6.a(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.v6
            if (r0 == 0) goto L13
            r0 = r6
            v6 r0 = (defpackage.v6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            v6 r0 = new v6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.a
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
            r0.d = r2
            java.lang.Object r6 = r4.c(r0)
            n82 r0 = defpackage.n82.a
            if (r6 != r0) goto L3e
            return r0
        L3e:
            r5.getClass()
            xtc r5 = defpackage.obe.o(r5)
            vyc r5 = r5.b()
            java.lang.String r5 = r5.a
            java.util.HashSet r4 = r4.d
            boolean r4 = r4.contains(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6.b(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (defpackage.z1d.C(r9, r0) == r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r8.o(r0) != r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.w6
            if (r0 == 0) goto L13
            r0 = r9
            w6 r0 = (defpackage.w6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            w6 r0 = new w6
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            java.util.HashSet r2 = r8.d
            r3 = 1
            r4 = 2
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r4) goto L2f
            sw7 r8 = r0.a
            defpackage.hre.r(r9)
            goto L60
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r5
        L35:
            defpackage.hre.r(r9)
            goto L53
        L39:
            defpackage.hre.r(r9)
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto Ld6
            mx r9 = new mx
            r1 = 4
            cza r7 = r8.e
            r9.<init>(r7, r1)
            r0.d = r3
            java.lang.Object r9 = defpackage.z1d.C(r9, r0)
            if (r9 != r6) goto L53
            goto L5f
        L53:
            sw7 r8 = r8.c
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r8.o(r0)
            if (r9 != r6) goto L60
        L5f:
            return r6
        L60:
            m66 r9 = defpackage.pe4.a     // Catch: java.lang.Throwable -> Ld1
            r9.getClass()     // Catch: java.lang.Throwable -> Ld1
            ck r9 = defpackage.k73.a()     // Catch: java.lang.Throwable -> Ld1
            hn8 r9 = r9.a()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "resources"
            hn8 r9 = defpackage.hn8.f(r9, r0)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "browser"
            hn8 r9 = defpackage.hn8.f(r9, r0)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "adblock.txt"
            hn8 r9 = defpackage.hn8.f(r9, r0)     // Catch: java.lang.Throwable -> Ld1
            java.io.File r9 = r9.toFile()     // Catch: java.lang.Throwable -> Ld1
            qw5 r9 = defpackage.tl1.J(r9)     // Catch: java.lang.Throwable -> Ld1
            mj9 r0 = new mj9     // Catch: java.lang.Throwable -> Ld1
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Ld1
        L8c:
            java.lang.String r9 = r0.S()     // Catch: java.lang.Throwable -> Lc1
            if (r9 != 0) goto L99
            r0.close()     // Catch: java.lang.Throwable -> L97
            r9 = r5
            goto Lca
        L97:
            r9 = move-exception
            goto Lca
        L99:
            int r1 = r9.length()     // Catch: java.lang.Throwable -> Lc1
            if (r1 != 0) goto La0
            goto L8c
        La0:
            r1 = 0
            char r3 = r9.charAt(r1)     // Catch: java.lang.Throwable -> Lc1
            r4 = 35
            if (r3 == r4) goto L8c
            r3 = 32
            r4 = 6
            int r1 = defpackage.k4b.f0(r9, r3, r1, r4)     // Catch: java.lang.Throwable -> Lc1
            r3 = -1
            if (r1 == r3) goto L8c
            int r1 = r1 + 1
            int r3 = r9.length()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r9 = r9.substring(r1, r3)     // Catch: java.lang.Throwable -> Lc1
            r2.add(r9)     // Catch: java.lang.Throwable -> Lc1
            goto L8c
        Lc1:
            r9 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lc6
            goto Lca
        Lc6:
            r0 = move-exception
            defpackage.pye.e(r9, r0)     // Catch: java.lang.Throwable -> Ld1
        Lca:
            if (r9 != 0) goto Ld0
            r8.q(r5)
            goto Ld6
        Ld0:
            throw r9     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r9 = move-exception
            r8.q(r5)
            throw r9
        Ld6:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6.c(n42):java.lang.Object");
    }
}
