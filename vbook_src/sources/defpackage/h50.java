package defpackage;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h50  reason: default package */
/* loaded from: classes.dex */
public abstract class h50 {
    public static AudioManager a;

    public static void A(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void B(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void C(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void D(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static void b(AudioManager audioManager, f50 f50Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = f50Var.e;
            obj.getClass();
            audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
            return;
        }
        audioManager.abandonAudioFocus(f50Var.b);
    }

    public static boolean c(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean d(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean e(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean f(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean g(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static final Bitmap h(int i, int i2, int i3, sm1 sm1Var) {
        Bitmap.Config config;
        ColorSpace colorSpace;
        ColorSpace.Rgb rgb;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace e;
        ColorSpace u;
        ColorSpace colorSpace2;
        Bitmap.Config F = ay5.F(i3);
        if (c16.i(sm1Var, wm1.e)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (c16.i(sm1Var, wm1.q)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (c16.i(sm1Var, wm1.r)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (c16.i(sm1Var, wm1.o)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (c16.i(sm1Var, wm1.j)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (c16.i(sm1Var, wm1.i)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (c16.i(sm1Var, wm1.t)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (c16.i(sm1Var, wm1.s)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (c16.i(sm1Var, wm1.k)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (c16.i(sm1Var, wm1.l)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (c16.i(sm1Var, wm1.g)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (c16.i(sm1Var, wm1.h)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (c16.i(sm1Var, wm1.f)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (c16.i(sm1Var, wm1.m)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (c16.i(sm1Var, wm1.p)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (c16.i(sm1Var, wm1.n)) {
            colorSpace2 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34 && (u = k4.u(sm1Var)) != null) {
                rgb = u;
            } else if (i4 >= 36 && (e = s4.e(sm1Var)) != null) {
                rgb = e;
            } else {
                if (sm1Var instanceof zs9) {
                    String str = sm1Var.a;
                    zs9 zs9Var = (zs9) sm1Var;
                    float[] a2 = zs9Var.d.a();
                    yjc yjcVar = zs9Var.g;
                    if (yjcVar != null) {
                        config = F;
                        transferParameters = new ColorSpace.Rgb.TransferParameters(yjcVar.b, yjcVar.c, yjcVar.d, yjcVar.e, yjcVar.f, yjcVar.g, yjcVar.a);
                    } else {
                        config = F;
                        transferParameters = null;
                    }
                    float[] fArr = zs9Var.i;
                    if (transferParameters != null) {
                        ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(str, zs9Var.h, a2, transferParameters);
                        if (Float.isNaN(fArr[0]) || Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = rgb2;
                        } else {
                            colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr2 = zs9Var.h;
                        final ys9 ys9Var = zs9Var.l;
                        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: um1
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i5 = r1;
                                xt4 xt4Var = ys9Var;
                                switch (i5) {
                                    case 0:
                                        return ((Number) xt4Var.invoke(Double.valueOf(d))).doubleValue();
                                    default:
                                        return ((Number) xt4Var.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }
                        };
                        final ys9 ys9Var2 = zs9Var.o;
                        rgb = new ColorSpace.Rgb(str, fArr2, a2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: um1
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i5 = r1;
                                xt4 xt4Var = ys9Var2;
                                switch (i5) {
                                    case 0:
                                        return ((Number) xt4Var.invoke(Double.valueOf(d))).doubleValue();
                                    default:
                                        return ((Number) xt4Var.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }
                        }, zs9Var.e, zs9Var.f);
                    }
                    return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, rgb);
                }
                config = F;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                rgb = colorSpace;
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, rgb);
            }
            config = F;
            return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, rgb);
        }
        rgb = colorSpace2;
        config = F;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, rgb);
    }

    public static Notification.Builder i(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static final bj j(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new bj(AutofillValue.forToggle(z));
        }
        return null;
    }

    public static final bj k(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new bj(AutofillValue.forText(kxe.t(charSequence)));
        }
        return null;
    }

    public static boolean l(Context context) {
        Display display;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static final int m(Bitmap bitmap) {
        int i;
        Bitmap.Config config;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        config = Bitmap.Config.RGBA_F16;
                        if (config2 == config) {
                            i = 8;
                        }
                    }
                    i = 4;
                }
                return height * i;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static synchronized AudioManager n(Context context) {
        synchronized (h50.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    vy1 vy1Var = new vy1();
                    eg0.s().execute(new b9(4, applicationContext, vy1Var));
                    vy1Var.a();
                    AudioManager audioManager2 = a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AutofillId o(View view) {
        return view.getAutofillId();
    }

    public static PackageInfo p() {
        return WebView.getCurrentWebViewPackage();
    }

    public static float q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float r(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final boolean s(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void t(bf bfVar, SparseArray sparseArray) {
        be0 be0Var = bfVar.b;
        if (!be0Var.a.isEmpty()) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue g = sz0.g(sparseArray.get(keyAt));
                if (g.isText()) {
                    g.getTextValue().toString();
                    if (be0Var.a.get(Integer.valueOf(keyAt)) != null) {
                        vm1.h();
                        return;
                    }
                } else if (!g.isDate()) {
                    if (!g.isList()) {
                        if (g.isToggle()) {
                            throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    } else {
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                } else {
                    throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
            }
        }
    }

    public static Intent u(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 == Integer.MIN_VALUE) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v(android.media.AudioManager r4, defpackage.f50 r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            java.lang.Object r5 = r5.e
            r5.getClass()
            android.media.AudioFocusRequest r5 = defpackage.vs.d(r5)
            int r4 = r4.requestAudioFocus(r5)
            return r4
        L14:
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r5.b
            l40 r3 = r5.d
            r3.getClass()
            if (r0 < r1) goto L29
            android.media.AudioAttributes r0 = r3.a()     // Catch: java.lang.RuntimeException -> L29
            int r0 = r0.getVolumeControlStream()     // Catch: java.lang.RuntimeException -> L29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L2a
        L29:
            r0 = 3
        L2a:
            int r5 = r5.a
            int r4 = r4.requestAudioFocus(r2, r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h50.v(android.media.AudioManager, f50):int");
    }

    public static int w(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static void x(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void y(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static final void z(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }
}
