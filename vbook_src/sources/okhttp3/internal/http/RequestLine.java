package okhttp3.internal.http;

import okhttp3.HttpUrl;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RequestLine {
    public static String a(HttpUrl httpUrl) {
        httpUrl.getClass();
        String b = httpUrl.b();
        String d = httpUrl.d();
        if (d != null) {
            return b + '?' + d;
        }
        return b;
    }
}
