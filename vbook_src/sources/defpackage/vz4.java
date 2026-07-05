package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vz4  reason: default package */
/* loaded from: classes.dex */
public class vz4 {
    public static final int a;
    public static final vz4 b;

    /* JADX WARN: Type inference failed for: r0v2, types: [vz4, java.lang.Object] */
    static {
        int i = s05.e;
        a = 12451000;
        b = new Object();
    }

    public static void d(Context context) {
        int i = s05.e;
        vz4 vz4Var = b;
        int c = vz4Var.c(context, 11925000);
        if (c != 0) {
            Intent a2 = vz4Var.a(context, "e", c);
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(c);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a2 == null) {
                throw new Exception();
            }
            throw new Exception("Google Play Services not available");
        }
    }

    public Intent a(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && p1d.n(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(wnd.a(context).b(0, context.getPackageName()).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    public int b(Context context) {
        return c(context, a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:2|3)|4|(4:8|2d|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:45)(1:47)|46)|48|(13:50|(1:52)(1:112)|53|(4:104|105|(1:107)(1:110)|108)(1:55)|56|57|(1:59)(1:102)|60|61|(1:63)(2:(2:73|(1:75))|(4:81|(1:83)(1:100)|(1:85)|(1:87)(4:88|(2:94|95)|90|(1:92)(1:93)))(1:80))|64|(1:(1:67)(1:68))|(1:70)(1:71)))|113|(0)(0)|53|(0)(0)|56|57|(0)(0)|60|61|(0)(0)|64|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r2).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz4.c(android.content.Context, int):int");
    }
}
