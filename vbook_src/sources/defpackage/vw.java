package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vw  reason: default package */
/* loaded from: classes.dex */
public final class vw {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final kw5 h;

    public vw(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, kw5 kw5Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = kw5Var;
    }

    public static vw a(Context context, al5 al5Var, String str, String str2, ArrayList arrayList, kw5 kw5Var) {
        String num;
        String packageName = context.getPackageName();
        String d = al5Var.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            num = Long.toString(packageInfo.getLongVersionCode());
        } else {
            num = Integer.toString(packageInfo.versionCode);
        }
        String str3 = num;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = "0.0";
        }
        return new vw(str, str2, arrayList, d, packageName, str3, str4, kw5Var);
    }
}
