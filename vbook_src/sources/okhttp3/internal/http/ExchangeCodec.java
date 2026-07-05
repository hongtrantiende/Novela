package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public interface ExchangeCodec {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Carrier {
        void c(RealCall realCall, IOException iOException);

        void cancel();

        void f();

        Route h();
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    void a();

    void b(Request request);

    boolean c();

    void cancel();

    osa d(Response response);

    Response.Builder e(boolean z);

    void f();

    wra g();

    long h(Response response);

    Carrier i();

    yma j(Request request, long j);
}
