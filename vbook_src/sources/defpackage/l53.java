package defpackage;

import android.os.Build;
import android.provider.Settings;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l53  reason: default package */
/* loaded from: classes.dex */
public abstract class l53 {
    public static final mfb a = new mfb(new rj2(16));

    public static uwd a() {
        return ((gk) a.getValue()).b;
    }

    public static String b() {
        d();
        String string = Settings.Secure.getString(((gk) a().b).a.getContentResolver(), "android_id");
        string.getClass();
        return string;
    }

    public static String c() {
        d();
        a();
        String str = Build.MANUFACTURER;
        str.getClass();
        a();
        String str2 = Build.MODEL;
        str2.getClass();
        return str + " " + str2;
    }

    public static void d() {
        ((gk) a.getValue()).getClass();
    }

    public static void e() {
        ((gk) a.getValue()).getClass();
    }
}
