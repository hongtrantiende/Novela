package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sgd  reason: default package */
/* loaded from: classes.dex */
public final class sgd extends hv {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sgd(String str, String str2, int i) {
        super(str, str2, 2);
        this.e = i;
    }

    @Override // defpackage.iv
    public final boolean b() {
        PackageInfo packageInfo;
        long j;
        switch (this.e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                int i = qgd.a;
                if (Build.VERSION.SDK_INT >= 26) {
                    packageInfo = h50.p();
                } else {
                    try {
                        packageInfo = qgd.a();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfo = null;
                    }
                }
                if (packageInfo == null) {
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    j = ru.o(packageInfo);
                } else {
                    j = packageInfo.versionCode;
                }
                if (j < 636700000) {
                    return false;
                }
                return true;
            case 1:
                if (!super.b() || !uue.A("MULTI_PROCESS")) {
                    return false;
                }
                int i2 = qgd.a;
                if (tgd.b.b()) {
                    return wgd.a.getStatics().isMultiProcessEnabled();
                }
                xk5.q("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (!uue.A("MULTI_PROFILE")) {
                    return false;
                }
                return super.b();
        }
    }
}
