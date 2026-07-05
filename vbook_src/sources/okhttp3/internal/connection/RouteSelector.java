package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RouteSelector {
    public final Address a;
    public final RouteDatabase b;
    public final RealCall c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Selection {
        public final ArrayList a;
        public int b;

        public Selection(ArrayList arrayList) {
            this.a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, RealCall realCall, boolean z) {
        List j;
        routeDatabase.getClass();
        this.a = address;
        this.b = routeDatabase;
        this.c = realCall;
        this.d = z;
        ks3 ks3Var = ks3.a;
        this.e = ks3Var;
        this.g = ks3Var;
        this.h = new ArrayList();
        HttpUrl httpUrl = address.h;
        realCall.e.r(realCall, httpUrl);
        URI h = httpUrl.h();
        if (h.getHost() == null) {
            j = _UtilJvmKt.j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.g.select(h);
            if (select != null && !select.isEmpty()) {
                j = _UtilJvmKt.i(select);
            } else {
                j = _UtilJvmKt.j(new Proxy[]{Proxy.NO_PROXY});
            }
        }
        this.e = j;
        this.f = 0;
        realCall.e.q(realCall, httpUrl, this.e);
    }

    public final boolean a() {
        if (this.f < this.e.size() || !this.h.isEmpty()) {
            return true;
        }
        return false;
    }
}
