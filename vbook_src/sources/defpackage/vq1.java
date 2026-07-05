package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq1  reason: default package */
/* loaded from: classes.dex */
public abstract class vq1 {
    public static final kw5 a = new kw5("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            kw5 kw5Var = a;
            if (Log.isLoggable((String) kw5Var.b, 6)) {
                String str = (String) kw5Var.c;
                if (str != null) {
                    concat = str.concat(concat);
                }
                Log.e("CommonUtils", concat);
                return "";
            }
            return "";
        }
    }
}
