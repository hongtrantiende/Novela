package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zr8  reason: default package */
/* loaded from: classes3.dex */
public final class zr8 implements dyb {
    public final String a;
    public final sw7 b;
    public zg8 c;
    public boolean d;

    public zr8(String str) {
        str.getClass();
        this.a = str;
        this.b = new sw7();
    }

    @Override // defpackage.dyb
    public final Object J0(int i, n42 n42Var, String str) {
        return u(i, str, false, n42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r8 == r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(int r7, defpackage.m42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.tr8
            if (r0 == 0) goto L13
            r0 = r8
            tr8 r0 = (defpackage.tr8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tr8 r0 = new tr8
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            int r7 = r0.a
            defpackage.hre.r(r8)
            goto L48
        L37:
            defpackage.hre.r(r8)
            r6.o()
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.q(r0)
            if (r8 != r5) goto L48
            goto L5b
        L48:
            zg8 r8 = (defpackage.zg8) r8
            sw2 r6 = defpackage.ab3.a
            ur8 r1 = new ur8
            r1.<init>(r7, r8, r2)
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = defpackage.z87.E(r6, r1, r0)
            if (r6 != r5) goto L5c
        L5b:
            return r5
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.L0(int, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[RETURN] */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a1(int r17, int r18, int r19, defpackage.m42 r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof defpackage.qr8
            if (r4 == 0) goto L1b
            r4 = r3
            qr8 r4 = (defpackage.qr8) r4
            int r5 = r4.f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f = r5
            goto L22
        L1b:
            qr8 r4 = new qr8
            n42 r3 = (defpackage.n42) r3
            r4.<init>(r0, r3)
        L22:
            java.lang.Object r3 = r4.d
            int r5 = r4.f
            r6 = 2
            r7 = 1
            n82 r8 = defpackage.n82.a
            if (r5 == 0) goto L48
            if (r5 == r7) goto L3b
            if (r5 != r6) goto L34
            defpackage.hre.r(r3)
            return r3
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L3b:
            int r0 = r4.c
            int r1 = r4.b
            int r2 = r4.a
            defpackage.hre.r(r3)
            r13 = r0
            r10 = r2
        L46:
            r12 = r1
            goto L68
        L48:
            defpackage.hre.r(r3)
            if (r2 > r1) goto L50
            ks3 r0 = defpackage.ks3.a
            return r0
        L50:
            r0.o()
            r3 = r17
            r4.a = r3
            r4.b = r1
            r4.c = r2
            r4.f = r7
            java.lang.Object r0 = r0.q(r4)
            if (r0 != r8) goto L64
            goto L82
        L64:
            r13 = r2
            r10 = r3
            r3 = r0
            goto L46
        L68:
            r11 = r3
            zg8 r11 = (defpackage.zg8) r11
            sw2 r0 = defpackage.ab3.a
            rr8 r9 = new rr8
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4.a = r10
            r4.b = r12
            r4.c = r13
            r4.f = r6
            java.lang.Object r0 = defpackage.z87.E(r0, r9, r4)
            if (r0 != r8) goto L83
        L82:
            return r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.a1(int, int, int, m42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        this.d = true;
        zg8 zg8Var = this.c;
        if (zg8Var != null) {
            if (zg8Var instanceof AutoCloseable) {
                zg8Var.close();
            } else if (zg8Var instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) zg8Var;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (zg8Var instanceof TypedArray) {
                ((TypedArray) zg8Var).recycle();
            } else if (zg8Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) zg8Var).release();
            } else if (zg8Var instanceof MediaDrm) {
                ((MediaDrm) zg8Var).release();
            } else {
                p1a.g();
                return;
            }
        }
        this.c = null;
    }

    @Override // defpackage.dyb
    public final hyb f() {
        return new hyb("PDF", "pdf", ls3.a, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[RETURN] */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(int r17, int r18, int r19, defpackage.m42 r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof defpackage.vr8
            if (r4 == 0) goto L1b
            r4 = r3
            vr8 r4 = (defpackage.vr8) r4
            int r5 = r4.f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f = r5
            goto L22
        L1b:
            vr8 r4 = new vr8
            n42 r3 = (defpackage.n42) r3
            r4.<init>(r0, r3)
        L22:
            java.lang.Object r3 = r4.d
            int r5 = r4.f
            r6 = 2
            r7 = 1
            n82 r8 = defpackage.n82.a
            if (r5 == 0) goto L48
            if (r5 == r7) goto L3b
            if (r5 != r6) goto L34
            defpackage.hre.r(r3)
            return r3
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L3b:
            int r0 = r4.c
            int r1 = r4.b
            int r2 = r4.a
            defpackage.hre.r(r3)
            r13 = r0
            r10 = r2
        L46:
            r12 = r1
            goto L68
        L48:
            defpackage.hre.r(r3)
            if (r2 > r1) goto L50
            ks3 r0 = defpackage.ks3.a
            return r0
        L50:
            r0.o()
            r3 = r17
            r4.a = r3
            r4.b = r1
            r4.c = r2
            r4.f = r7
            java.lang.Object r0 = r0.q(r4)
            if (r0 != r8) goto L64
            goto L82
        L64:
            r13 = r2
            r10 = r3
            r3 = r0
            goto L46
        L68:
            r11 = r3
            zg8 r11 = (defpackage.zg8) r11
            sw2 r0 = defpackage.ab3.a
            rr8 r9 = new rr8
            r14 = 0
            r15 = 1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4.a = r10
            r4.b = r12
            r4.c = r13
            r4.f = r6
            java.lang.Object r0 = defpackage.z87.E(r0, r9, r4)
            if (r0 != r8) goto L83
        L82:
            return r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.l0(int, int, int, m42):java.lang.Object");
    }

    public final void o() {
        if (!this.d) {
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:18:0x0041, B:20:0x0045), top: B:28:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wr8
            if (r0 == 0) goto L13
            r0 = r5
            wr8 r0 = (defpackage.wr8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wr8 r0 = new wr8
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
            sw7 r5 = r4.b
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.o(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            zg8 r5 = r4.c     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L66
            m66 r5 = defpackage.pe4.a     // Catch: java.lang.Throwable -> L64
            hn8 r5 = defpackage.ie2.r(r5)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r4.a     // Catch: java.lang.Throwable -> L64
            hn8 r5 = defpackage.hn8.f(r5, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "data"
            hn8 r5 = defpackage.hn8.f(r5, r1)     // Catch: java.lang.Throwable -> L64
            e31 r5 = r5.a     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = r5.t()     // Catch: java.lang.Throwable -> L64
            zg8 r5 = defpackage.qka.a(r5)     // Catch: java.lang.Throwable -> L64
            r4.c = r5     // Catch: java.lang.Throwable -> L64
            goto L66
        L64:
            r4 = move-exception
            goto L6a
        L66:
            r0.q(r3)
            return r5
        L6a:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.q(n42):java.lang.Object");
    }

    @Override // defpackage.dyb
    public final Object s(String str, Map map, n42 n42Var) {
        return null;
    }

    @Override // defpackage.dyb
    public final Object t(int i, m42 m42Var, String str) {
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r9 == r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[RETURN] */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r6, java.lang.String r7, boolean r8, defpackage.n42 r9) {
        /*
            r5 = this;
            boolean r7 = r9 instanceof defpackage.sr8
            if (r7 == 0) goto L13
            r7 = r9
            sr8 r7 = (defpackage.sr8) r7
            int r0 = r7.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.e = r0
            goto L18
        L13:
            sr8 r7 = new sr8
            r7.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r7.c
            int r0 = r7.e
            r1 = 2
            r2 = 1
            r3 = 0
            n82 r4 = defpackage.n82.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L31
            if (r0 != r1) goto L2b
            defpackage.hre.r(r9)
            return r9
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r3
        L31:
            boolean r8 = r7.b
            int r6 = r7.a
            defpackage.hre.r(r9)
            goto L4c
        L39:
            defpackage.hre.r(r9)
            r5.o()
            r7.a = r6
            r7.b = r8
            r7.e = r2
            java.lang.Object r9 = r5.q(r7)
            if (r9 != r4) goto L4c
            goto L63
        L4c:
            zg8 r9 = (defpackage.zg8) r9
            sw2 r5 = defpackage.ab3.a
            rr0 r0 = new rr0
            r2 = 8
            r0.<init>(r9, r6, r3, r2)
            r7.a = r6
            r7.b = r8
            r7.e = r1
            java.lang.Object r5 = defpackage.z87.E(r5, r0, r7)
            if (r5 != r4) goto L64
        L63:
            return r4
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.u(int, java.lang.String, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r7 == r4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r7 != r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(boolean r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.xr8
            if (r0 == 0) goto L13
            r0 = r7
            xr8 r0 = (defpackage.xr8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xr8 r0 = new xr8
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            n82 r4 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.hre.r(r7)
            goto L55
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L31:
            boolean r6 = r0.a
            defpackage.hre.r(r7)
            goto L48
        L37:
            defpackage.hre.r(r7)
            r5.o()
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r5.q(r0)
            if (r7 != r4) goto L48
            goto L54
        L48:
            zg8 r7 = (defpackage.zg8) r7
            r0.a = r6
            r0.d = r2
            java.io.Serializable r7 = r7.T0(r0)
            if (r7 != r4) goto L55
        L54:
            return r4
        L55:
            java.util.List r7 = (java.util.List) r7
            int r5 = r7.size()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.x(boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r9 == r5) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    @Override // defpackage.dyb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(int r7, int r8, defpackage.m42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.yr8
            if (r0 == 0) goto L13
            r0 = r9
            yr8 r0 = (defpackage.yr8) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            yr8 r0 = new yr8
            n42 r9 = (defpackage.n42) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            defpackage.hre.r(r9)
            return r9
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L33:
            int r8 = r0.b
            int r7 = r0.a
            defpackage.hre.r(r9)
            goto L51
        L3b:
            defpackage.hre.r(r9)
            r6.o()
            if (r8 > 0) goto L44
            return r4
        L44:
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r6.q(r0)
            if (r9 != r5) goto L51
            goto L66
        L51:
            zg8 r9 = (defpackage.zg8) r9
            sw2 r6 = defpackage.ab3.a
            hk8 r1 = new hk8
            r1.<init>(r7, r9, r8, r4)
            r0.a = r7
            r0.b = r8
            r0.e = r2
            java.lang.Object r6 = defpackage.z87.E(r6, r1, r0)
            if (r6 != r5) goto L67
        L66:
            return r5
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.z(int, int, m42):java.lang.Object");
    }
}
