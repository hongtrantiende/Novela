package okhttp3;

import java.util.Iterator;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.EmptyTags;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpMethod;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Request {
    public final HttpUrl a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final HttpUrl e;
    public final EmptyTags f;
    public CacheControl g;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class Builder {
        public HttpUrl a;
        public RequestBody d;
        public HttpUrl e;
        public EmptyTags f = EmptyTags.a;
        public String b = "GET";
        public Headers.Builder c = new Headers.Builder();

        public final void a(String str, String str2) {
            str2.getClass();
            Headers.Builder builder = this.c;
            builder.getClass();
            _HeadersCommonKt.b(str);
            _HeadersCommonKt.c(str2, str);
            builder.b(str);
            _HeadersCommonKt.a(builder, str, str2);
        }

        public final void b(String str, RequestBody requestBody) {
            str.getClass();
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                        p1a.k(hl5.n("method ", str, " must have a request body."));
                        return;
                    }
                } else if (!HttpMethod.a(str)) {
                    p1a.k(hl5.n("method ", str, " must not have a request body."));
                    return;
                }
                this.b = str;
                this.d = requestBody;
                return;
            }
            vs.m("method.isEmpty() == true");
        }

        public final void c(String str) {
            str.getClass();
            if (r4b.Q(str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (r4b.Q(str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.b(null, str);
            this.a = builder.a();
        }
    }

    public Request(Builder builder) {
        HttpUrl httpUrl = builder.a;
        if (httpUrl != null) {
            this.a = httpUrl;
            this.b = builder.b;
            this.c = builder.c.a();
            this.d = builder.d;
            this.e = builder.e;
            this.f = builder.f;
            return;
        }
        vs.k("url == null");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.Request$Builder, java.lang.Object] */
    public final Builder a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.d = this.d;
        obj.f = this.f;
        obj.c = this.c.c();
        obj.e = this.e;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        Headers headers = this.c;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            Iterator<yk8> it = headers.iterator();
            int i = 0;
            while (true) {
                b2 b2Var = (b2) it;
                if (b2Var.hasNext()) {
                    Object next = b2Var.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        yk8 yk8Var = (yk8) next;
                        String str = (String) yk8Var.a;
                        String str2 = (String) yk8Var.b;
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (_UtilCommonKt.k(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i = i2;
                    } else {
                        tl1.M();
                        throw null;
                    }
                } else {
                    sb.append(']');
                    break;
                }
            }
        }
        EmptyTags emptyTags = EmptyTags.a;
        EmptyTags emptyTags2 = this.f;
        if (!c16.i(emptyTags2, emptyTags)) {
            sb.append(", tags=");
            sb.append(emptyTags2);
        }
        sb.append('}');
        return sb.toString();
    }
}
