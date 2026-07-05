package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dqe  reason: default package */
/* loaded from: classes.dex */
public final class dqe extends f5f {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqe(a6f a6fVar, int i) {
        super(a6fVar);
        this.d = i;
    }

    @Override // defpackage.f5f
    public final void a0() {
        int i = this.d;
    }

    public boolean b0() {
        Y();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((lte) this.a).a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public void e0(String str, h5f h5fVar, hte hteVar, tpe tpeVar) {
        String str2;
        URL url;
        byte[] a;
        ete eteVar;
        Map map;
        String str3 = h5fVar.a;
        lte lteVar = (lte) this.a;
        W();
        Y();
        try {
            url = new URI(str3).toURL();
            this.b.k0();
            a = hteVar.a();
            eteVar = lteVar.C;
            lte.m(eteVar);
            map = h5fVar.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            eteVar.j0(new aqe(this, str2, url, a, map, tpeVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.g(ppe.f0(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
        }
    }

    private final void c0() {
    }

    private final void d0() {
    }
}
