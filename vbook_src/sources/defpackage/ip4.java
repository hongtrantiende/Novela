package defpackage;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ip4  reason: default package */
/* loaded from: classes.dex */
public abstract class ip4 {
    public static final ypa a = new ypa(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final jla d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new zp9(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new jla(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((cp4) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #3 {all -> 0x00c1, blocks: (B:3:0x000b, B:5:0x0013, B:8:0x001c, B:9:0x0020, B:30:0x0052, B:33:0x005b, B:35:0x0061, B:37:0x0067, B:39:0x0078, B:47:0x009d, B:50:0x00a9, B:43:0x0081, B:45:0x0098, B:14:0x002f, B:16:0x0037, B:19:0x003b, B:21:0x003f, B:26:0x004a, B:56:0x00b7, B:44:0x0092, B:38:0x0072), top: B:64:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #3 {all -> 0x00c1, blocks: (B:3:0x000b, B:5:0x0013, B:8:0x001c, B:9:0x0020, B:30:0x0052, B:33:0x005b, B:35:0x0061, B:37:0x0067, B:39:0x0078, B:47:0x009d, B:50:0x00a9, B:43:0x0081, B:45:0x0098, B:14:0x002f, B:16:0x0037, B:19:0x003b, B:21:0x003f, B:26:0x004a, B:56:0x00b7, B:44:0x0092, B:38:0x0072), top: B:64:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hp4 b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            ypa r0 = defpackage.ip4.a
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = defpackage.sxd.o(r1)
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.h(r8)     // Catch: java.lang.Throwable -> Lc1
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto L1c
            hp4 r8 = new hp4     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        L1c:
            qy2 r10 = defpackage.wo4.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb7 java.lang.Throwable -> Lc1
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> Lc1
            int r10 = r10.a     // Catch: java.lang.Throwable -> Lc1
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2f
            if (r10 == r2) goto L2d
        L2b:
            r10 = r3
            goto L50
        L2d:
            r10 = -2
            goto L50
        L2f:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc1
            fq4[] r10 = (defpackage.fq4[]) r10     // Catch: java.lang.Throwable -> Lc1
            if (r10 == 0) goto L4f
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lc1
            if (r5 != 0) goto L3b
            goto L4f
        L3b:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lc1
            r6 = r4
        L3d:
            if (r6 >= r5) goto L4d
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lc1
            int r7 = r7.f     // Catch: java.lang.Throwable -> Lc1
            if (r7 == 0) goto L4a
            if (r7 >= 0) goto L48
            goto L2b
        L48:
            r10 = r7
            goto L50
        L4a:
            int r6 = r6 + 1
            goto L3d
        L4d:
            r10 = r4
            goto L50
        L4f:
            r10 = r2
        L50:
            if (r10 == 0) goto L5b
            hp4 r8 = new hp4     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        L5b:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lc1
            if (r10 <= r2) goto L81
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc1
            r2 = 29
            if (r10 < r2) goto L81
            fbe r10 = defpackage.qsc.a     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r10 = defpackage.sxd.o(r10)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.beginSection(r10)     // Catch: java.lang.Throwable -> Lc1
            fbe r10 = defpackage.qsc.a     // Catch: java.lang.Throwable -> L7c
            android.graphics.Typeface r9 = r10.A(r9, r1, r11)     // Catch: java.lang.Throwable -> L7c
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            goto L9b
        L7c:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            throw r8     // Catch: java.lang.Throwable -> Lc1
        L81:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc1
            fq4[] r10 = (defpackage.fq4[]) r10     // Catch: java.lang.Throwable -> Lc1
            fbe r1 = defpackage.qsc.a     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r1 = defpackage.sxd.o(r1)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> Lc1
            fbe r1 = defpackage.qsc.a     // Catch: java.lang.Throwable -> Lb2
            android.graphics.Typeface r9 = r1.z(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb2
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
        L9b:
            if (r9 == 0) goto La9
            r0.m(r8, r9)     // Catch: java.lang.Throwable -> Lc1
            hp4 r8 = new hp4     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        La9:
            hp4 r8 = new hp4     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        Lb2:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            throw r8     // Catch: java.lang.Throwable -> Lc1
        Lb7:
            hp4 r8 = new hp4     // Catch: java.lang.Throwable -> Lc1
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        Lc1:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip4.b(java.lang.String, android.content.Context, java.util.List, int):hp4");
    }
}
