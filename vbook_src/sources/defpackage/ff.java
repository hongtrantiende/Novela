package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.LocusId;
import android.content.res.AssetFileDescriptor;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;
import defpackage.q69;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ff  reason: default package */
/* loaded from: classes.dex */
public abstract class ff {
    public static void A(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void B(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void C(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            r95 n = r95.n();
            String str = SystemForegroundService.e;
            if (n.b <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            r95 n2 = r95.n();
            String str2 = SystemForegroundService.e;
            if (n2.b <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }

    public static final BlendMode D(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        if (i == 0) {
            return sz0.c();
        }
        if (i == 1) {
            return sz0.n();
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            blendMode2 = BlendMode.SRC_OVER;
            return blendMode2;
        } else if (i == 4) {
            return BlendMode.DST_OVER;
        } else {
            if (i == 5) {
                return BlendMode.SRC_IN;
            }
            if (i == 6) {
                return BlendMode.DST_IN;
            }
            if (i == 7) {
                return BlendMode.SRC_OUT;
            }
            if (i == 8) {
                return BlendMode.DST_OUT;
            }
            if (i == 9) {
                return BlendMode.SRC_ATOP;
            }
            if (i == 10) {
                return BlendMode.DST_ATOP;
            }
            if (i == 11) {
                return BlendMode.XOR;
            }
            if (i == 12) {
                return BlendMode.PLUS;
            }
            if (i == 13) {
                return BlendMode.MODULATE;
            }
            if (i == 14) {
                return BlendMode.SCREEN;
            }
            if (i == 15) {
                return BlendMode.OVERLAY;
            }
            if (i == 16) {
                return BlendMode.DARKEN;
            }
            if (i == 17) {
                return BlendMode.LIGHTEN;
            }
            if (i == 18) {
                return BlendMode.COLOR_DODGE;
            }
            if (i == 19) {
                return sz0.h();
            }
            if (i == 20) {
                return sz0.p();
            }
            if (i == 21) {
                return sz0.r();
            }
            if (i == 22) {
                return BlendMode.DIFFERENCE;
            }
            if (i == 23) {
                return BlendMode.EXCLUSION;
            }
            if (i == 24) {
                return BlendMode.MULTIPLY;
            }
            if (i == 25) {
                return BlendMode.HUE;
            }
            if (i == 26) {
                return BlendMode.SATURATION;
            }
            if (i == 27) {
                return BlendMode.COLOR;
            }
            if (i != 28) {
                blendMode = BlendMode.SRC_OVER;
                return blendMode;
            }
            return BlendMode.LUMINOSITY;
        }
    }

    public static final ImageDecoder.Source E(dq5 dq5Var, xe8 xe8Var, boolean z) {
        hn8 M0;
        if (dq5Var.getFileSystem() == pe4.a && (M0 = dq5Var.M0()) != null) {
            return ImageDecoder.createSource(M0.toFile());
        }
        jxe l = dq5Var.l();
        if (l instanceof n00) {
            return ImageDecoder.createSource(xe8Var.a.getAssets(), ((n00) l).g);
        }
        if ((l instanceof j22) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((j22) l).g;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new k92(assetFileDescriptor, 3));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (l instanceof er9) {
            er9 er9Var = (er9) l;
            if (er9Var.g.equals(xe8Var.a.getPackageName())) {
                return ImageDecoder.createSource(xe8Var.a.getResources(), er9Var.h);
            }
        }
        if (l instanceof w01) {
            if (Build.VERSION.SDK_INT >= 30 || !z || ((w01) l).g.isDirect()) {
                return ImageDecoder.createSource(((w01) l).g);
            }
            return null;
        }
        return null;
    }

    public static final PorterDuff.Mode F(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final void G(long j, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    public static void a(AudioAttributes.Builder builder) {
        builder.setHapticChannelsMuted(true);
    }

    public static int b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 < supportedPerformancePoints.size()) {
                    if (xk5.f(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                        i3 = 2;
                        break;
                    }
                    i4++;
                } else {
                    i3 = 1;
                    break;
                }
            }
            if (i3 == 1 && vye.h == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 37) {
                    int n = n(true);
                    if (i5 < 35) {
                        vye.h = Boolean.valueOf(z);
                        if (z) {
                        }
                    } else {
                        vye.h = Boolean.valueOf(z);
                        if (z) {
                        }
                    }
                }
                z = false;
                vye.h = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static LocusId c(String str) {
        return new LocusId(str);
    }

    public static void d(Canvas canvas) {
        canvas.disableZ();
    }

    public static void e(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void f(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void g(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static void h(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void i(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void j(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void k(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static void l(Canvas canvas) {
        canvas.enableZ();
    }

    public static void m(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static int n(boolean z) {
        Iterable e;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            uq4 uq4Var = new uq4();
            uq4Var.n = lc7.p("video/avc");
            vq4 vq4Var = new vq4(uq4Var);
            String str = vq4Var.o;
            if (str != null) {
                List e2 = o47.e(str, z, false);
                String c = o47.c(vq4Var);
                if (c == null) {
                    e = mm9.e;
                } else {
                    e = o47.e(c, z, false);
                }
                ls5 i = qs5.i();
                i.c(e2);
                i.c(e);
                mm9 g = i.g();
                for (int i2 = 0; i2 < g.d; i2++) {
                    if (((h47) g.get(i2)).d != null && (videoCapabilities = ((h47) g.get(i2)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                            if (xk5.f(supportedPerformancePoints.get(i3)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (m47 unused) {
        }
        return 0;
    }

    public static ContentCaptureSession o(View view) {
        return view.getContentCaptureSession();
    }

    public static mm9 p(l40 l40Var) {
        ls5 i = qs5.i();
        jwc it = r40.h.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (Build.VERSION.SDK_INT >= a2d.r(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), l40Var.a())) {
                i.b(num);
            }
        }
        i.b(2);
        return i.g();
    }

    public static int q(int i, int i2, l40 l40Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int s = a2d.s(i3);
            if (s != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(s).build(), l40Var.a())) {
                return i3;
            }
        }
        return 0;
    }

    public static final void r(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static final long s(rg rgVar) {
        return rgVar.getUniqueDrawingId();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r9) {
        /*
            android.content.SharedPreferences r0 = defpackage.fbe.E(r9)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Lf
            goto La9
        Lf:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            r3 = 1
            android.content.Context r4 = r9.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r5 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r5 == 0) goto L39
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo(r4, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r4 == 0) goto L39
            android.os.Bundle r5 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r5 == 0) goto L39
            boolean r5 = r5.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r5 == 0) goto L39
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            boolean r0 = r4.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            goto L3a
        L39:
            r0 = r3
        L3a:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            r6 = 0
            if (r4 < r5) goto La6
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource
            r4.<init>()
            java.lang.String r5 = "error configuring notification delegate for package "
            int r7 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> L70
            android.content.pm.ApplicationInfo r8 = r9.getApplicationInfo()     // Catch: java.lang.Throwable -> L70
            int r8 = r8.uid     // Catch: java.lang.Throwable -> L70
            if (r7 != r8) goto L55
            r2 = r3
        L55:
            if (r2 != 0) goto L72
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Throwable -> L70
            r1.append(r9)     // Catch: java.lang.Throwable -> L70
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L70
            android.util.Log.e(r0, r9)     // Catch: java.lang.Throwable -> L70
        L6c:
            r4.trySetResult(r6)
            goto L9e
        L70:
            r9 = move-exception
            goto La2
        L72:
            android.content.SharedPreferences r2 = defpackage.fbe.E(r9)     // Catch: java.lang.Throwable -> L70
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L70
            r2.putBoolean(r1, r3)     // Catch: java.lang.Throwable -> L70
            r2.apply()     // Catch: java.lang.Throwable -> L70
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r9 = r9.getSystemService(r1)     // Catch: java.lang.Throwable -> L70
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "com.google.android.gms"
            if (r0 == 0) goto L90
            r9.setNotificationDelegate(r1)     // Catch: java.lang.Throwable -> L70
            goto L6c
        L90:
            java.lang.String r0 = r9.getNotificationDelegate()     // Catch: java.lang.Throwable -> L70
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6c
            r9.setNotificationDelegate(r6)     // Catch: java.lang.Throwable -> L70
            goto L6c
        L9e:
            r4.getTask()
            goto La9
        La2:
            r4.trySetResult(r6)
            throw r9
        La6:
            com.google.android.gms.tasks.Tasks.forResult(r6)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.t(android.content.Context):void");
    }

    public static boolean u(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "GMS core is set for proxying");
                        return true;
                    }
                    return true;
                }
            } else {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
        }
        return false;
    }

    public static Insets v(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static final void w(Activity activity, q69.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void x(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void y(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    public static void z(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }
}
