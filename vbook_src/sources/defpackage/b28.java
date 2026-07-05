package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b28  reason: default package */
/* loaded from: classes.dex */
public final class b28 extends m02 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final vu5 i;

    public b28(Context context, omd omdVar) {
        super(context, omdVar);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new vu5(this);
    }

    @Override // defpackage.m02
    public final Object a() {
        return a28.a(this.f, this.h);
    }

    @Override // defpackage.m02
    public final void c() {
        try {
            r95.n().c(a28.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            vu5 vu5Var = this.i;
            connectivityManager.getClass();
            vu5Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(vu5Var);
        } catch (IllegalArgumentException e) {
            r95.n().k(a28.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            r95.n().k(a28.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.m02
    public final void d() {
        try {
            r95.n().c(a28.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException e) {
            r95.n().k(a28.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            r95.n().k(a28.a, "Received exception while unregistering network callback", e2);
        }
    }
}
