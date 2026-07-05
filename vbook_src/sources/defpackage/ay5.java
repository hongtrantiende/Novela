package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ay5  reason: default package */
/* loaded from: classes.dex */
public abstract class ay5 {
    public static Context a;
    public static Boolean b;

    public static void A(ViewStructure viewStructure) {
        viewStructure.setInputType(Token.DEFAULT);
    }

    public static void B(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    public static void C(NotificationChannel notificationChannel, boolean z) {
        notificationChannel.setShowBadge(z);
    }

    public static void D(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static void E(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }

    public static final Bitmap.Config F(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i2 >= 26 && i == 4) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    public static final int G(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                config3 = Bitmap.Config.RGBA_F16;
                if (config == config3) {
                    return 3;
                }
            }
            if (i >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    return 4;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public static final Bitmap a(nl5 nl5Var) {
        if (nl5Var instanceof jj) {
            return ((jj) nl5Var).a;
        }
        xk5.q("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static AudioFocusRequest b(AudioAttributes audioAttributes, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return new AudioFocusRequest.Builder(1).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public static NotificationChannel c(int i, CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, i);
    }

    public static void d(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static Icon e(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void f(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(false);
    }

    public static void g(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
    }

    public static void h(Context context) {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 26 || (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) == null || notificationManager.getNotificationChannel("general") != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("general", "General", 3);
        notificationChannel.setDescription("General broadcast notifications");
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static AutofillValue i(String str) {
        return AutofillValue.forText(kxe.t(str));
    }

    public static AutofillValue j(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static float[] k(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static synchronized boolean n(Context context) {
        Boolean bool;
        synchronized (ay5.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (yz1.o()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    b = Boolean.FALSE;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }

    public static boolean o(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void p(rg rgVar) {
        ViewParent parent = rgVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(rgVar, rgVar);
        }
    }

    public static void q(Context context, String str, String str2, Uri uri) {
        Intent launchIntentForPackage;
        PendingIntent pendingIntent;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            return;
        }
        if (uri != null) {
            launchIntentForPackage = new Intent("android.intent.action.VIEW", uri);
            launchIntentForPackage.setPackage(context.getPackageName());
            launchIntentForPackage.addFlags(603979776);
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        }
        if (launchIntentForPackage != null) {
            pendingIntent = PendingIntent.getActivity(context, (int) (System.currentTimeMillis() & 2147483647L), launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        o48 o48Var = new o48(context, "general");
        o48Var.w.icon = context.getApplicationInfo().icon;
        o48Var.e = o48.c(str);
        o48Var.f = o48.c(str2);
        o48Var.d(16, true);
        o48Var.j = 0;
        if (pendingIntent != null) {
            o48Var.g = pendingIntent;
        }
        notificationManager.notify((int) (System.currentTimeMillis() & 2147483647L), o48Var.b());
    }

    public static Intent r(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2);
    }

    public static void s(Context context, TextClassification textClassification) {
        int i;
        String text = textClassification.getText();
        if (text != null) {
            i = text.hashCode();
        } else {
            i = 0;
        }
        PendingIntent activity = PendingIntent.getActivity(context, i, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            k4.A(activity);
        } else {
            activity.send();
        }
    }

    public static void t(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void u(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void v(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void w(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void x(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static void y(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    public static void z(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }
}
