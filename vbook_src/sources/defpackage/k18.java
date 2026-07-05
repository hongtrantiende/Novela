package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k18  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k18 extends xu4 implements xt4 {
    public static final k18 a = new xu4(1, yz1.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && eze.f(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new xz1(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return wz1.a;
    }
}
