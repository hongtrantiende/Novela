package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xz1  reason: default package */
/* loaded from: classes.dex */
public final class xz1 implements wz1 {
    public final ConnectivityManager b;

    public xz1(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // defpackage.wz1
    public final boolean a() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            return true;
        }
        return false;
    }
}
