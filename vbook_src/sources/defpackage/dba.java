package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dba  reason: default package */
/* loaded from: classes.dex */
public final class dba {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final qf4 a;
    public final ig4 b;
    public final wba c;
    public final jx3 d;
    public final d82 e;

    public dba(qf4 qf4Var, ig4 ig4Var, wba wbaVar, jx3 jx3Var, d82 d82Var) {
        qf4Var.getClass();
        ig4Var.getClass();
        wbaVar.getClass();
        jx3Var.getClass();
        d82Var.getClass();
        this.a = qf4Var;
        this.b = ig4Var;
        this.c = wbaVar;
        this.d = jx3Var;
        this.e = d82Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r6 == r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        if (r0.b(r1) == r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dba r6, defpackage.n42 r7) {
        /*
            wba r0 = r6.c
            boolean r1 = r7 instanceof defpackage.cba
            if (r1 == 0) goto L15
            r1 = r7
            cba r1 = (defpackage.cba) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            cba r1 = new cba
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r6 = r1.a
            int r7 = r1.c
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            n82 r5 = defpackage.n82.a
            if (r7 == 0) goto L39
            if (r7 == r3) goto L35
            if (r7 != r2) goto L2e
            defpackage.hre.r(r6)
            goto L7e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L35:
            defpackage.hre.r(r6)
            goto L47
        L39:
            defpackage.hre.r(r6)
            eh4 r6 = defpackage.eh4.a
            r1.c = r3
            java.lang.Object r6 = r6.b(r1)
            if (r6 != r5) goto L47
            goto L7d
        L47:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L5d
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5d
            goto Lb3
        L5d:
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb3
            java.lang.Object r7 = r6.next()
            f92 r7 = (defpackage.f92) r7
            wf2 r7 = r7.a
            boolean r7 = r7.j()
            if (r7 == 0) goto L61
            r1.c = r2
            java.lang.Object r6 = r0.b(r1)
            if (r6 != r5) goto L7e
        L7d:
            return r5
        L7e:
            fea r6 = r0.a
            java.lang.Boolean r6 = r6.b()
            if (r6 == 0) goto L8b
        L86:
            boolean r3 = r6.booleanValue()
            goto L94
        L8b:
            fea r6 = r0.b
            java.lang.Boolean r6 = r6.b()
            if (r6 == 0) goto L94
            goto L86
        L94:
            if (r3 != 0) goto L9e
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L9e:
            double r6 = defpackage.dba.f
            double r0 = r0.a()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto Lab
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lab:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lb3:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dba.a(dba, n42):java.lang.Object");
    }
}
