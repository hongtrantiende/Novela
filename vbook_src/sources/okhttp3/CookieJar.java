package okhttp3;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public interface CookieJar {
    public static final CookieJar a = new Object();

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
        /* loaded from: classes3.dex */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final void a(HttpUrl httpUrl, List list) {
                httpUrl.getClass();
            }

            @Override // okhttp3.CookieJar
            public final void b(HttpUrl httpUrl) {
                httpUrl.getClass();
            }
        }
    }

    void a(HttpUrl httpUrl, List list);

    void b(HttpUrl httpUrl);
}
