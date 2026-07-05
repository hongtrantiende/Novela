package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.media.AudioDescriptor;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ih  reason: default package */
/* loaded from: classes.dex */
public abstract class ih {
    public static int[] a(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RenderEffect c(c3e c3eVar, float f, float f2, int i) {
        if (f == nae.e && f2 == nae.e) {
            return RenderEffect.createOffsetEffect(nae.e, nae.e);
        }
        if (c3eVar == null) {
            return RenderEffect.createBlurEffect(f, f2, kte.k(i));
        }
        return RenderEffect.createBlurEffect(f, f2, c3eVar.n(), kte.k(i));
    }

    public static void d(Context context, f28 f28Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            d28 d28Var = new d28(f28Var);
            telephonyManager.registerTelephonyCallback(f28Var.a, d28Var);
            telephonyManager.unregisterTelephonyCallback(d28Var);
        } catch (RuntimeException unused) {
            f28Var.c(5);
        }
    }

    public static void e(kh khVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        d8a d8aVar;
        b8a b8aVar;
        xt4 xt4Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (d8aVar = (d8a) khVar.c().b((int) keyAt)) != null && (b8aVar = d8aVar.a) != null) {
                Object g = b8aVar.d.a.g(s7a.l);
                if (g == null) {
                    g = null;
                }
                g4 g4Var = (g4) g;
                if (g4Var != null && (xt4Var = (xt4) g4Var.b) != null) {
                    Boolean bool = (Boolean) xt4Var.invoke(new ps(text.toString()));
                }
            }
        }
    }

    public static void f(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void g(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void h(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static qs5 i(List list) {
        if (Build.VERSION.SDK_INT >= 31 && list != null) {
            TreeSet treeSet = new TreeSet(Comparator.comparing(new f1(1)).reversed());
            for (Object obj : list) {
                AudioDescriptor a = vs.a(obj);
                if (a.getStandard() == 1) {
                    byte[] descriptor = a.getDescriptor();
                    if (descriptor.length != 3) {
                        st0.w("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                    } else {
                        byte b = descriptor[0];
                        int i = (b & 7) + 1;
                        if (((b >> 3) & 15) == 1) {
                            treeSet.add(Integer.valueOf(a2d.s(i)));
                        }
                    }
                }
            }
            return qs5.l(treeSet);
        }
        ms5 ms5Var = qs5.b;
        return mm9.e;
    }

    public static Path j(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float k(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return nae.e;
        }
    }

    public static Shader.TileMode l() {
        return Shader.TileMode.DECAL;
    }

    public static ru9 m(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        vs.m(a82.j(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new ru9(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int n(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void o(kh khVar, long[] jArr, Consumer consumer) {
        b8a b8aVar;
        for (long j : jArr) {
            d8a d8aVar = (d8a) khVar.c().b((int) j);
            if (d8aVar != null && (b8aVar = d8aVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(khVar.a.getAutofillId(), b8aVar.f);
                Object g = b8aVar.d.a.g(h8a.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new ps(er6.a(62, null, "\n", list))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float p(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return nae.e;
        }
    }

    public static void q(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void r(yv yvVar, a09 a09Var) {
        LogSessionId logSessionId;
        LogSessionId a = a09Var.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!a.equals(logSessionId)) {
            ((MediaFormat) yvVar.b).setString("log-session-id", a.getStringId());
        }
    }

    public static void s(RenderNode renderNode, c3e c3eVar) {
        RenderEffect renderEffect;
        if (c3eVar != null) {
            renderEffect = c3eVar.n();
        } else {
            renderEffect = null;
        }
        renderNode.setRenderEffect(renderEffect);
    }

    public static void t(View view, c3e c3eVar) {
        RenderEffect renderEffect;
        if (c3eVar != null) {
            renderEffect = c3eVar.n();
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }

    public static int[] u(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }
}
