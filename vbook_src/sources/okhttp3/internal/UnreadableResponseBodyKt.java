package okhttp3.internal;

import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class UnreadableResponseBodyKt {
    public static final Response a(Response response) {
        response.getClass();
        Response.Builder o = response.o();
        ResponseBody responseBody = response.C;
        o.g = new UnreadableResponseBody(responseBody.q(), responseBody.o());
        return o.a();
    }
}
