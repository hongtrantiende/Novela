package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tga  reason: default package */
/* loaded from: classes.dex */
public final class tga extends ConnectivityManager.NetworkCallback {
    public static final tga a = new ConnectivityManager.NetworkCallback();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        if (!bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities)) {
            return true;
        }
        return false;
    }

    public static void b() {
        Object c12Var;
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        xt4 xt4Var = (xt4) entry.getKey();
                        tga tgaVar = a;
                        NetworkCapabilities networkCapabilities = d;
                        tgaVar.getClass();
                        if (a((NetworkRequest) entry.getValue(), networkCapabilities)) {
                            c12Var = b12.a;
                        } else {
                            c12Var = new c12(7);
                        }
                        arrayList.add(new yk8(xt4Var, c12Var));
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        yk8 yk8Var = (yk8) obj;
                        ((xt4) yk8Var.a).invoke((d12) yk8Var.b);
                    }
                    return;
                }
                r95 n = r95.n();
                String str = zld.a;
                n.c(str, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        r95 n = r95.n();
        String str = zld.a;
        n.c(str, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (b) {
            if (c16.i(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        r95.n().c(zld.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        r95.n().c(zld.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            for (xt4 xt4Var : c.keySet()) {
                xt4Var.invoke(new c12(7));
            }
        }
    }
}
