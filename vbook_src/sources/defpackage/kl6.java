package defpackage;

import android.graphics.pdf.PdfRenderer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kl6  reason: default package */
/* loaded from: classes.dex */
public final class kl6 implements zg8 {
    public final String a;
    public final sw7 b;
    public PdfRenderer c;

    public kl6(String str) {
        str.getClass();
        this.a = str;
        this.b = new sw7();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E0(defpackage.ch8 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fl6
            if (r0 == 0) goto L13
            r0 = r6
            fl6 r0 = (defpackage.fl6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fl6 r0 = new fl6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ch8 r5 = r0.a
            defpackage.hre.r(r6)
            goto L3e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2e:
            defpackage.hre.r(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.o(r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            android.graphics.pdf.PdfRenderer r6 = (android.graphics.pdf.PdfRenderer) r6
            int r4 = r5.a
            android.graphics.pdf.PdfRenderer$Page r4 = r6.openPage(r4)
            dh8 r5 = new dh8     // Catch: java.lang.Throwable -> L57
            int r6 = r4.getWidth()     // Catch: java.lang.Throwable -> L57
            int r0 = r4.getHeight()     // Catch: java.lang.Throwable -> L57
            r5.<init>(r6, r0)     // Catch: java.lang.Throwable -> L57
            defpackage.dxe.r(r4, r2)
            return r5
        L57:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L59
        L59:
            r6 = move-exception
            defpackage.dxe.r(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.E0(ch8, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.el6
            if (r0 == 0) goto L13
            r0 = r5
            el6 r0 = (defpackage.el6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            el6 r0 = new el6
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
            java.lang.Object r5 = r4.o(r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            android.graphics.pdf.PdfRenderer r5 = (android.graphics.pdf.PdfRenderer) r5
            int r4 = r5.getPageCount()
            if (r4 <= 0) goto L7c
            r4 = 0
            android.graphics.pdf.PdfRenderer$Page r4 = r5.openPage(r4)
            int r5 = r4.getWidth()     // Catch: java.lang.Throwable -> L75
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L75
            r0 = 1140850688(0x44000000, float:512.0)
            float r0 = r0 / r5
            int r5 = r4.getHeight()     // Catch: java.lang.Throwable -> L75
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L75
            float r5 = r5 * r0
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L75
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L75
            r1 = 512(0x200, float:7.17E-43)
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r1, r5, r0)     // Catch: java.lang.Throwable -> L75
            long r0 = defpackage.zl1.e     // Catch: java.lang.Throwable -> L75
            int r0 = defpackage.sve.x(r0)     // Catch: java.lang.Throwable -> L75
            r5.eraseColor(r0)     // Catch: java.lang.Throwable -> L75
            r4.render(r5, r2, r2, r3)     // Catch: java.lang.Throwable -> L75
            r0 = 100
            byte[] r5 = defpackage.zxe.l(r5, r0)     // Catch: java.lang.Throwable -> L75
            defpackage.dxe.r(r4, r2)
            r2 = r5
            goto L7c
        L75:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L77
        L77:
            r0 = move-exception
            defpackage.dxe.r(r4, r5)
            throw r0
        L7c:
            ah8 r4 = new ah8
            r4.<init>(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.H0(n42):java.lang.Object");
    }

    @Override // defpackage.zg8
    public final Object T() {
        Object gs9Var;
        Throwable th;
        try {
            m66 m66Var = pe4.a;
            String str = hn8.b;
            x56 N0 = m66Var.N0(fn8.d(this.a, false));
            Throwable th2 = null;
            Object t = cne.t(N0);
            try {
                N0.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            gs9Var = t;
        } catch (Throwable th4) {
            gs9Var = new gs9(th4);
        }
        if (th != null) {
            throw th;
        } else if (gs9Var instanceof gs9) {
            return ks3.a;
        } else {
            return gs9Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[LOOP:0: B:18:0x0046->B:19:0x0048, LOOP_END] */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable T0(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.hl6
            if (r0 == 0) goto L13
            r0 = r5
            hl6 r0 = (defpackage.hl6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hl6 r0 = new hl6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            r0.c = r2
            java.lang.Object r5 = r4.o(r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3a
            return r4
        L3a:
            android.graphics.pdf.PdfRenderer r5 = (android.graphics.pdf.PdfRenderer) r5
            int r4 = r5.getPageCount()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r0 = 0
        L46:
            if (r0 >= r4) goto L53
            ch8 r1 = new ch8
            r1.<init>(r0)
            r5.add(r1)
            int r0 = r0 + 1
            goto L46
        L53:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.T0(n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[SYNTHETIC] */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable W0(defpackage.ty5 r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gl6
            if (r0 == 0) goto L13
            r0 = r7
            gl6 r0 = (defpackage.gl6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gl6 r0 = new gl6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ty5 r6 = r0.a
            defpackage.hre.r(r7)
            goto L3e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L2e:
            defpackage.hre.r(r7)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r5.o(r0)
            n82 r5 = defpackage.n82.a
            if (r7 != r5) goto L3e
            return r5
        L3e:
            android.graphics.pdf.PdfRenderer r7 = (android.graphics.pdf.PdfRenderer) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.tl1.s(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            r0 = r6
            sy5 r0 = (defpackage.sy5) r0
            boolean r1 = r0.c
            if (r1 == 0) goto L79
            int r0 = r0.nextInt()
            android.graphics.pdf.PdfRenderer$Page r0 = r7.openPage(r0)
            dh8 r1 = new dh8     // Catch: java.lang.Throwable -> L72
            int r3 = r0.getWidth()     // Catch: java.lang.Throwable -> L72
            int r4 = r0.getHeight()     // Catch: java.lang.Throwable -> L72
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L72
            defpackage.dxe.r(r0, r2)
            r5.add(r1)
            goto L4f
        L72:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L74
        L74:
            r6 = move-exception
            defpackage.dxe.r(r0, r5)
            throw r6
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.W0(ty5, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // defpackage.zg8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1(defpackage.ch8 r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, defpackage.n42 r14) {
        /*
            r4 = this;
            boolean r0 = r14 instanceof defpackage.jl6
            if (r0 == 0) goto L13
            r0 = r14
            jl6 r0 = (defpackage.jl6) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            jl6 r0 = new jl6
            r0.<init>(r4, r14)
        L18:
            java.lang.Object r14 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 != r3) goto L38
            int r13 = r0.E
            int r12 = r0.D
            int r11 = r0.C
            int r10 = r0.f
            int r9 = r0.e
            int r8 = r0.d
            int r7 = r0.c
            int r6 = r0.b
            ch8 r5 = r0.a
            defpackage.hre.r(r14)
            goto L5e
        L38:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L3e:
            defpackage.hre.r(r14)
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r8
            r0.e = r9
            r0.f = r10
            r0.C = r11
            r0.D = r12
            r0.E = r13
            r0.H = r3
            java.lang.Object r14 = r4.o(r0)
            n82 r4 = defpackage.n82.a
            if (r14 != r4) goto L5e
            return r4
        L5e:
            android.graphics.pdf.PdfRenderer r14 = (android.graphics.pdf.PdfRenderer) r14
            int r4 = r5.a
            android.graphics.pdf.PdfRenderer$Page r4 = r14.openPage(r4)
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L96
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r12, r13, r5)     // Catch: java.lang.Throwable -> L96
            long r12 = defpackage.zl1.e     // Catch: java.lang.Throwable -> L96
            int r12 = defpackage.sve.x(r12)     // Catch: java.lang.Throwable -> L96
            r5.eraseColor(r12)     // Catch: java.lang.Throwable -> L96
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L96
            r12.<init>()     // Catch: java.lang.Throwable -> L96
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L96
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L96
            float r8 = r8 / r6
            float r6 = (float) r9     // Catch: java.lang.Throwable -> L96
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L96
            float r6 = r6 / r7
            r12.postScale(r8, r6)     // Catch: java.lang.Throwable -> L96
            float r6 = (float) r10     // Catch: java.lang.Throwable -> L96
            float r6 = -r6
            float r7 = (float) r11     // Catch: java.lang.Throwable -> L96
            float r7 = -r7
            r12.postTranslate(r6, r7)     // Catch: java.lang.Throwable -> L96
            r4.render(r5, r2, r12, r3)     // Catch: java.lang.Throwable -> L96
            jj r6 = new jj     // Catch: java.lang.Throwable -> L96
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L96
            defpackage.dxe.r(r4, r2)
            return r6
        L96:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L98
        L98:
            r6 = move-exception
            defpackage.dxe.r(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.c1(ch8, int, int, int, int, int, int, int, int, n42):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        PdfRenderer pdfRenderer = this.c;
        if (pdfRenderer != null) {
            pdfRenderer.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:18:0x0041, B:20:0x0045), top: B:28:0x0041 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.il6
            if (r0 == 0) goto L13
            r0 = r5
            il6 r0 = (defpackage.il6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            il6 r0 = new il6
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
            android.graphics.pdf.PdfRenderer r5 = r4.c     // Catch: java.lang.Throwable -> L5a
            if (r5 != 0) goto L5c
            android.graphics.pdf.PdfRenderer r5 = new android.graphics.pdf.PdfRenderer     // Catch: java.lang.Throwable -> L5a
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> L5a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5a
            r2 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r2)     // Catch: java.lang.Throwable -> L5a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L5a
            r4.c = r5     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r4 = move-exception
            goto L60
        L5c:
            r0.q(r3)
            return r5
        L60:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.o(n42):java.lang.Object");
    }
}
