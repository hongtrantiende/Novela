package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zr0  reason: default package */
/* loaded from: classes3.dex */
public final class zr0 {
    public final ii2 a;
    public final dx b;
    public final fyb c;
    public final fq5 d;
    public final xad e;
    public final a58 f;
    public final klc g;

    static {
        r76[] r76VarArr = dx.W;
    }

    public zr0(ii2 ii2Var, dx dxVar, fyb fybVar, fq5 fq5Var, xad xadVar, a58 a58Var, klc klcVar) {
        this.a = ii2Var;
        this.b = dxVar;
        this.c = fybVar;
        this.d = fq5Var;
        this.e = xadVar;
        this.f = a58Var;
        this.g = klcVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(1:(8:12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(8:26|27|28|(1:30)|31|(1:33)|20|21))(8:35|36|37|(1:39)|40|(1:42)|20|21))(3:44|(1:(4:47|(2:49|50)|20|21)(10:58|59|(1:61)|27|28|(0)|31|(0)|20|21))(2:62|63)|57)))|71|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
        r9 = new defpackage.gs9(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ba, code lost:
        r9 = new defpackage.gs9(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
        if (r10 == r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00eb, code lost:
        r9 = new defpackage.gs9(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.zr0 r8, defpackage.hk2 r9, defpackage.n42 r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.a(zr0, hk2, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r11, int r12, defpackage.mf r13, defpackage.mf r14, defpackage.n42 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.ur0
            if (r0 == 0) goto L13
            r0 = r15
            ur0 r0 = (defpackage.ur0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ur0 r0 = new ur0
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r15)
            goto L8b
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L2c:
            defpackage.hre.r(r15)
            ii2 r15 = r10.a
            gk2 r15 = r15.c
            vk2 r15 = r15.r0(r2)
            java.util.List r15 = r15.c()
            c00 r15 = defpackage.sl1.V(r15)
            kn4 r1 = new kn4
            r3 = 14
            r1.<init>(r3)
            ki4 r3 = new ki4
            r4 = 2
            r3.<init>(r4, r15, r1)
            tr0 r15 = new tr0
            r1 = 0
            r15.<init>(r11, r1)
            ff4 r11 = new ff4
            r11.<init>(r3, r2, r15)
            tr0 r15 = new tr0
            r15.<init>(r12, r2)
            ff4 r12 = new ff4
            r12.<init>(r11, r2, r15)
            java.util.List r4 = defpackage.g9a.e0(r12)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r1)
            int r12 = r4.size()
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r12)
            r13.invoke(r11, r15)
            r0.c = r2
            r9 r3 = new r9
            r8 = 0
            r9 = 2
            r5 = r10
            r7 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r10 = defpackage.k27.p(r3, r0)
            n82 r11 = defpackage.n82.a
            if (r10 != r11) goto L8b
            return r11
        L8b:
            pvc r10 = defpackage.pvc.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.b(int, int, mf, mf, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r11, defpackage.mf r12, defpackage.mf r13, defpackage.n42 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.yr0
            if (r0 == 0) goto L13
            r0 = r14
            yr0 r0 = (defpackage.yr0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yr0 r0 = new yr0
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L26
            defpackage.hre.r(r14)
            goto La7
        L26:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L2d:
            defpackage.hre.r(r14)
            ii2 r14 = r10.a
            gk2 r14 = r14.c
            vk2 r11 = r14.r0(r11)
            java.util.List r11 = r11.c()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r11 = r11.iterator()
        L45:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r11.next()
            r3 = r1
            hk2 r3 = (defpackage.hk2) r3
            yj1 r4 = defpackage.by5.a
            zx5 r4 = r4.k()
            long r4 = r4.b()
            long r6 = r3.I
            long r4 = r4 - r6
            hq7 r3 = defpackage.wl3.b
            r3 = 30
            am3 r6 = defpackage.am3.MINUTES
            long r6 = defpackage.jue.O(r3, r6)
            long r6 = defpackage.wl3.e(r6)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L45
            r14.add(r1)
            goto L45
        L75:
            kn4 r11 = new kn4
            r1 = 15
            r11.<init>(r1)
            java.util.List r4 = defpackage.sl1.u0(r14, r11)
            java.lang.Integer r11 = new java.lang.Integer
            r14 = 0
            r11.<init>(r14)
            int r14 = r4.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r14)
            r12.invoke(r11, r1)
            r0.c = r2
            r9 r3 = new r9
            r8 = 0
            r9 = 2
            r5 = r10
            r7 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r10 = defpackage.k27.p(r3, r0)
            n82 r11 = defpackage.n82.a
            if (r10 != r11) goto La7
            return r11
        La7:
            pvc r10 = defpackage.pvc.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.c(boolean, mf, mf, n42):java.lang.Object");
    }
}
