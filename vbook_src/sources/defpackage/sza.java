package defpackage;

import android.graphics.ImageDecoder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sza  reason: default package */
/* loaded from: classes.dex */
public final class sza implements xq2 {
    public final ImageDecoder.Source a;
    public final AutoCloseable b;
    public final xe8 c;
    public final q8a d;

    public sza(ImageDecoder.Source source, AutoCloseable autoCloseable, xe8 xe8Var, q8a q8aVar) {
        this.a = source;
        this.b = autoCloseable;
        this.c = xe8Var;
        this.d = q8aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r1v2, types: [vl9, java.lang.Object] */
    @Override // defpackage.xq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.m42 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.rza
            if (r0 == 0) goto L13
            r0 = r7
            rza r0 = (defpackage.rza) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            rza r0 = new rza
            n42 r7 = (defpackage.n42) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            q8a r0 = r0.a
            defpackage.hre.r(r7)
            goto L43
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L30:
            defpackage.hre.r(r7)
            q8a r7 = r6.d
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = r7.a(r0)
            n82 r1 = defpackage.n82.a
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r7
        L43:
            java.lang.AutoCloseable r7 = r6.b     // Catch: java.lang.Throwable -> L68
            vl9 r1 = new vl9     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            android.graphics.ImageDecoder$Source r4 = r6.a     // Catch: java.lang.Throwable -> L6a
            ir r5 = new ir     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r6, r1, r3)     // Catch: java.lang.Throwable -> L6a
            android.graphics.Bitmap r6 = android.graphics.ImageDecoder.decodeBitmap(r4, r5)     // Catch: java.lang.Throwable -> L6a
            tq2 r3 = new tq2     // Catch: java.lang.Throwable -> L6a
            ql0 r4 = new ql0     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            boolean r6 = r1.a     // Catch: java.lang.Throwable -> L6a
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L6a
            defpackage.dxe.r(r7, r2)     // Catch: java.lang.Throwable -> L68
            r0.c()
            return r3
        L68:
            r6 = move-exception
            goto L71
        L6a:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L6c
        L6c:
            r1 = move-exception
            defpackage.dxe.r(r7, r6)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L68
        L71:
            r0.c()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sza.a(m42):java.lang.Object");
    }
}
