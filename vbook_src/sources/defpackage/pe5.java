package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe5  reason: default package */
/* loaded from: classes3.dex */
public abstract class pe5 {
    public static final pw6 a = sw6.b("io.ktor.client.plugins.HttpCallValidator");
    public static final ij1 b = new ij1("HttpResponseValidator", ke5.a, new tn4(22));
    public static final h40 c;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(Boolean.class);
        try {
            nscVar = cm9.d(Boolean.TYPE);
        } catch (Throwable unused) {
            nscVar = null;
        }
        c = new h40("ExpectSuccessAttributeKey", new isc(a2, nscVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List r4, java.lang.Throwable r5, defpackage.fh5 r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.me5
            if (r0 == 0) goto L13
            r0 = r7
            me5 r0 = (defpackage.me5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            me5 r0 = new me5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            int r0 = r0.b
            if (r0 == 0) goto L30
            r4 = 1
            if (r0 == r4) goto L24
            r4 = 2
            if (r0 != r4) goto L28
        L24:
            defpackage.hre.r(r7)
            goto L2e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L2e:
            r4 = 0
            goto L56
        L30:
            defpackage.hre.r(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Processing exception "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " for request "
            r7.append(r5)
            vyc r5 = r6.getUrl()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            pw6 r6 = defpackage.pe5.a
            r6.i(r5)
            java.util.Iterator r4 = r4.iterator()
        L56:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L5d
            return
        L5d:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L67
            defpackage.xk5.o()
            return
        L67:
            defpackage.vm1.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe5.a(java.util.List, java.lang.Throwable, fh5, n42):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r5, defpackage.oh5 r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ne5
            if (r0 == 0) goto L13
            r0 = r7
            ne5 r0 = (defpackage.ne5) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ne5 r0 = new ne5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r5 = r0.c
            java.util.Iterator r6 = r0.b
            java.util.Iterator r6 = (java.util.Iterator) r6
            oh5 r1 = r0.a
            defpackage.hre.r(r7)
            r7 = r1
            goto L60
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L35:
            defpackage.hre.r(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Validating response for request "
            r7.<init>(r1)
            te5 r1 = r6.y0()
            fh5 r1 = r1.c()
            vyc r1 = r1.getUrl()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            pw6 r1 = defpackage.pe5.a
            r1.i(r7)
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L60:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()
            lu4 r1 = (defpackage.lu4) r1
            r0.a = r7
            r3 = r6
            java.util.Iterator r3 = (java.util.Iterator) r3
            r0.b = r3
            r0.c = r5
            r0.e = r2
            java.lang.Object r1 = r1.invoke(r7, r0)
            n82 r3 = defpackage.n82.a
            if (r1 != r3) goto L60
            return r3
        L80:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe5.b(java.util.List, oh5, n42):java.lang.Object");
    }
}
