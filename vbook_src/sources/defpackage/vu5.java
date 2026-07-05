package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vu5  reason: default package */
/* loaded from: classes.dex */
public final class vu5 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a = 1;
    public final Object b;

    public vu5(b28 b28Var) {
        this.b = b28Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 1:
                network.getClass();
                if (network.equals(((b28) this.b).f.getActiveNetwork())) {
                    r95 n = r95.n();
                    String str = a28.a;
                    n.c(str, "Network blocked status changed: " + z);
                    b28 b28Var = (b28) this.b;
                    Object obj = b28Var.e;
                    if (obj == null) {
                        obj = b28Var.a();
                    }
                    z18 z18Var = (z18) obj;
                    b28 b28Var2 = (b28) this.b;
                    synchronized (b28Var2.g) {
                        if (b28Var2.h != z) {
                            b28Var2.h = z;
                            ((b28) this.b).b(new z18(z18Var.a, z18Var.b, z18Var.c, z18Var.d, z));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i = this.a;
        network.getClass();
        networkCapabilities.getClass();
        switch (i) {
            case 0:
                r95.n().c(zld.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((fl7) this.b).invoke(b12.a);
                return;
            default:
                r95 n = r95.n();
                String str = a28.a;
                n.c(str, "Network capabilities changed: " + networkCapabilities);
                b28 b28Var = (b28) this.b;
                b28Var.b(a28.a(b28Var.f, b28Var.h));
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.a;
        Object obj = this.b;
        network.getClass();
        switch (i) {
            case 0:
                r95.n().c(zld.a, "NetworkRequestConstraintController onLost callback");
                ((fl7) obj).invoke(new c12(7));
                return;
            default:
                r95.n().c(a28.a, "Network connection lost");
                ((b28) obj).b(new z18(false, false, false, false, false));
                return;
        }
    }

    public vu5(fl7 fl7Var) {
        this.b = fl7Var;
    }
}
