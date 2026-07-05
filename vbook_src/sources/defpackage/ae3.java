package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ae3  reason: default package */
/* loaded from: classes3.dex */
public final class ae3 implements td3 {
    public final ii2 a;
    public final HashMap b;

    public ae3(ii2 ii2Var) {
        this.a = ii2Var;
        sw2 sw2Var = ab3.a;
        m41 a = k27.a(ru2.c);
        this.b = new HashMap();
        z87.v(a, null, null, new oi(this, (m42) null, 23), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.n42 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.vd3
            if (r0 == 0) goto L13
            r0 = r11
            vd3 r0 = (defpackage.vd3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vd3 r0 = new vd3
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L26
            defpackage.hre.r(r11)
            goto L93
        L26:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L2d:
            defpackage.hre.r(r11)
            ii2 r10 = r10.a
            lm2 r10 = r10.E
            pf9 r10 = r10.h0()
            java.util.List r10 = r10.c()
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.tl1.s(r10, r1)
            r11.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L4b:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r10.next()
            cn2 r1 = (defpackage.cn2) r1
            nd3 r4 = new nd3
            java.lang.String r5 = r1.b
            java.lang.String r6 = r1.c
            boolean r1 = r1.d
            r4.<init>(r5, r6, r1)
            r11.add(r4)
            goto L4b
        L66:
            long r4 = defpackage.zj1.n()
            java.lang.String r10 = "yyyyMMdd_HHmmss"
            java.lang.String r10 = defpackage.zj1.f(r4, r10)
            java.lang.String r1 = "domains_"
            java.lang.String r5 = r1.concat(r10)
            wd3 r7 = new wd3
            r8 = 0
            r7.<init>(r11, r8, r2)
            r0.c = r3
            sw2 r10 = defpackage.ab3.a
            n35 r10 = defpackage.zz6.a
            he4 r4 = new he4
            r9 = 0
            java.lang.String r6 = "json"
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = defpackage.z87.E(r10, r4, r0)
            n82 r10 = defpackage.n82.a
            if (r11 != r10) goto L93
            return r10
        L93:
            if (r11 == 0) goto L96
            r2 = r3
        L96:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae3.a(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(1:9)(2:26|27))(2:28|(1:30))|10|11|12|13|14))|31|6|(0)(0)|10|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        r6 = r6.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (defpackage.jy.a() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r7 = defpackage.kw6.b;
        r0 = defpackage.iea.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r7.a.a.compareTo(r0) <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        r7.a(r0, "Log", r6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.f76 r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.zd3
            if (r0 == 0) goto L13
            r0 = r7
            zd3 r0 = (defpackage.zd3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zd3 r0 = new zd3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            n82 r1 = defpackage.n82.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.hre.r(r7)
            goto L3a
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L2e:
            defpackage.hre.r(r7)
            r0.c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L3a
            return r1
        L3a:
            byte[] r7 = (byte[]) r7
            java.lang.String r6 = defpackage.r4b.F(r7)
            s46 r7 = defpackage.v46.a     // Catch: java.lang.Exception -> L5c
            r7.getClass()     // Catch: java.lang.Exception -> L5c
            sz r0 = new sz     // Catch: java.lang.Exception -> L5c
            md3 r1 = defpackage.nd3.Companion     // Catch: java.lang.Exception -> L5c
            s76 r1 = r1.serializer()     // Catch: java.lang.Exception -> L5c
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L5c
            s76 r0 = defpackage.wq9.H(r0)     // Catch: java.lang.Exception -> L5c
            s76 r0 = (defpackage.s76) r0     // Catch: java.lang.Exception -> L5c
            java.lang.Object r4 = r7.a(r0, r6)     // Catch: java.lang.Exception -> L5c
            goto L7e
        L5c:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L65
            java.lang.String r6 = ""
        L65:
            boolean r7 = defpackage.jy.a()
            if (r7 == 0) goto L7e
            kw6 r7 = defpackage.kw6.b
            iea r0 = defpackage.iea.e
            z56 r1 = r7.a
            iea r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L7e
            java.lang.String r1 = "Log"
            r7.a(r0, r1, r6, r4)
        L7e:
            java.util.List r4 = (java.util.List) r4
            ii2 r6 = r5.a
            lm2 r6 = r6.E
            ud3 r7 = new ud3
            r7.<init>(r5, r4, r3)
            defpackage.l0e.z(r6, r7)
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae3.b(f76, n42):java.lang.Object");
    }
}
