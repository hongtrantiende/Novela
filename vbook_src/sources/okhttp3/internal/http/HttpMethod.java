package okhttp3.internal.http;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class HttpMethod {
    public static final boolean a(String str) {
        str.getClass();
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }
}
