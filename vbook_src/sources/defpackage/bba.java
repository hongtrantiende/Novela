package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bba  reason: default package */
/* loaded from: classes.dex */
public final class bba {
    public static final bba a = new Object();
    public static final n07 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [bba, java.lang.Object] */
    static {
        f46 f46Var = new f46();
        f46Var.b(aba.class, oa0.a);
        f46Var.b(fba.class, pa0.a);
        f46Var.b(ag2.class, ma0.a);
        f46Var.b(ky.class, la0.a);
        f46Var.b(we.class, ka0.a);
        f46Var.b(o69.class, na0.a);
        f46Var.d = true;
        b = new n07(f46Var, 20);
    }

    public static ky a(qf4 qf4Var) {
        String valueOf;
        qf4Var.a();
        Context context = qf4Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        qf4Var.a();
        String str2 = qf4Var.c.b;
        str2.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = str;
        }
        Build.MANUFACTURER.getClass();
        qf4Var.a();
        o69 i = r4.i(context);
        qf4Var.a();
        return new ky(str2, new we(packageName, str3, str, i, r4.e(context)));
    }
}
