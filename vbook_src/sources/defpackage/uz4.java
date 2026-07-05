package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz4  reason: default package */
/* loaded from: classes.dex */
public final class uz4 extends vz4 {
    public static final Object d = new Object();
    public static final uz4 e = new Object();
    public xb4 c;

    public static AlertDialog f(Activity activity, int i, fvd fvdVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(cvd.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    string = resources.getString(17039370);
                } else {
                    string = resources.getString(R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, fvdVar);
        }
        String a = cvd.a(activity, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", a82.j(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [mw3, android.app.DialogFragment] */
    public static void j(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ur4) {
                hs4 hs4Var = ((tr4) ((ur4) activity).R.a).f;
                g9b g9bVar = new g9b();
                am8.t(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                g9bVar.E0 = alertDialog;
                if (onCancelListener != null) {
                    g9bVar.F0 = onCancelListener;
                }
                g9bVar.B0 = false;
                g9bVar.C0 = true;
                hs4Var.getClass();
                uf0 uf0Var = new uf0(hs4Var);
                uf0Var.o = true;
                uf0Var.f(0, g9bVar, str);
                uf0Var.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        am8.t(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    @Override // defpackage.vz4
    public final int b(Context context) {
        return c(context, vz4.a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog f = f(googleApiActivity, i, new fvd(super.a(googleApiActivity, "d", i), googleApiActivity, 0), googleApiActivity2);
        if (f == null) {
            return;
        }
        j(googleApiActivity, f, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Activity activity, sn6 sn6Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f = f(activity, i, new fvd(super.a(activity, "d", i), sn6Var, 1), onCancelListener);
        if (f == null) {
            return;
        }
        j(activity, f, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [n48, c3e, java.lang.Object] */
    public final void h(Context context, int i, PendingIntent pendingIntent) {
        String a;
        String d2;
        int i2;
        Log.w("GoogleApiAvailability", hl5.l("GMS core API Availability. ConnectionResult=", ", tag=null", i), new IllegalArgumentException());
        if (i == 18) {
            new yud(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i == 6) {
                a = cvd.e(context, "common_google_play_services_resolution_required_title");
            } else {
                a = cvd.a(context, i);
            }
            if (a == null) {
                a = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i != 6 && i != 19) {
                d2 = cvd.b(context, i);
            } else {
                d2 = cvd.d(context, "common_google_play_services_resolution_required_text", cvd.c(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            am8.s(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            o48 o48Var = new o48(context, null);
            o48Var.q = true;
            o48Var.d(16, true);
            o48Var.e = o48.c(a);
            ?? obj = new Object();
            obj.b = o48.c(d2);
            o48Var.f(obj);
            PackageManager packageManager = context.getPackageManager();
            if (p1d.g == null) {
                p1d.g = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            int i3 = 17301642;
            if (p1d.g.booleanValue()) {
                int i4 = context.getApplicationInfo().icon;
                if (i4 != 0) {
                    i3 = i4;
                }
                o48Var.w.icon = i3;
                o48Var.j = 2;
                if (p1d.n(context)) {
                    o48Var.a(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    o48Var.g = pendingIntent;
                }
            } else {
                o48Var.w.icon = 17301642;
                String string = resources.getString(R.string.common_google_play_services_notification_ticker);
                o48Var.w.tickerText = o48.c(string);
                o48Var.w.when = System.currentTimeMillis();
                o48Var.g = pendingIntent;
                o48Var.f = o48.c(d2);
            }
            if (yz1.o()) {
                am8.v(yz1.o());
                synchronized (d) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
                } else if (!string2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                o48Var.u = "com.google.android.gms.availability";
            }
            Notification b = o48Var.b();
            if (i != 1 && i != 2 && i != 3) {
                i2 = 39789;
            } else {
                s05.a.set(false);
                i2 = 10436;
            }
            notificationManager.notify(i2, b);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [xb4, tz4] */
    public final void i(Context context, jz1 jz1Var, boolean z) {
        int intValue;
        Integer num = jz1Var.e;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = intValue;
        String packageName = context.getPackageName();
        kud kudVar = new kud(i, jz1Var.b, System.currentTimeMillis(), packageName, z);
        if (this.c == null) {
            this.c = new tz4(context, null, xb4.m, xs.g, sz4.c);
        }
        xb4 xb4Var = this.c;
        xb4Var.getClass();
        uu5 b = uu5.b();
        b.d = new mb4[]{c16.f};
        b.a = false;
        b.c = new l97(kudVar);
        xb4Var.b(2, b.a());
    }
}
