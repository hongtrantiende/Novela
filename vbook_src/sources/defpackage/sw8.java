package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sw8  reason: default package */
/* loaded from: classes.dex */
public final class sw8 extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final rw8 b;
    public boolean c;

    public sw8(rw8 rw8Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = rw8Var;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[Catch: jy4 -> 0x0040, TRY_LEAVE, TryCatch #0 {jy4 -> 0x0040, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0011, B:16:0x0034, B:11:0x001f, B:14:0x002c), top: B:27:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: defpackage.jy4 -> L40
            r2 = 26
            if (r1 >= r2) goto L1d
            java.lang.String r3 = "samsung"
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch: defpackage.jy4 -> L40
            boolean r3 = r3.equals(r4)     // Catch: defpackage.jy4 -> L40
            if (r3 != 0) goto L1b
            java.lang.String r3 = "XT1650"
            java.lang.String r4 = android.os.Build.MODEL     // Catch: defpackage.jy4 -> L40
            boolean r3 = r3.equals(r4)     // Catch: defpackage.jy4 -> L40
            if (r3 == 0) goto L1d
        L1b:
            r5 = r0
            goto L32
        L1d:
            if (r1 >= r2) goto L2c
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: defpackage.jy4 -> L40
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r1)     // Catch: defpackage.jy4 -> L40
            if (r5 != 0) goto L2c
            goto L1b
        L2c:
            java.lang.String r5 = "EGL_EXT_protected_content"
            boolean r5 = defpackage.xoe.k(r5)     // Catch: defpackage.jy4 -> L40
        L32:
            if (r5 == 0) goto L42
            java.lang.String r5 = "EGL_KHR_surfaceless_context"
            boolean r5 = defpackage.xoe.k(r5)     // Catch: defpackage.jy4 -> L40
            if (r5 == 0) goto L3e
            r5 = 1
            return r5
        L3e:
            r5 = 2
            return r5
        L40:
            r5 = move-exception
            goto L43
        L42:
            return r0
        L43:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to determine secure mode due to GL error: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "PlaceholderSurface"
            defpackage.st0.h(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (sw8.class) {
            try {
                z = true;
                if (!e) {
                    d = a(context);
                    e = true;
                }
                if (d == 0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    rw8 rw8Var = this.b;
                    rw8Var.b.getClass();
                    rw8Var.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
