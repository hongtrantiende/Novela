package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal._HeadersCommonKt;
import org.chromium.net.UrlResponseInfo;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sr9  reason: default package */
/* loaded from: classes3.dex */
public final class sr9 {
    public static final ts5 a = ts5.i(4, "br", "deflate", "gzip", "x-gzip");
    public static final uu5 b;

    static {
        uu5 c = uu5.c(',');
        ic1 ic1Var = ic1.c;
        ic1Var.getClass();
        b = new uu5((exa) c.d, true, ic1Var, Integer.MAX_VALUE);
    }

    public static Response.Builder a(Request request, UrlResponseInfo urlResponseInfo, osa osaVar) {
        String str;
        String str2;
        long j;
        List<String> list;
        Response.Builder builder = new Response.Builder();
        List<String> list2 = urlResponseInfo.getAllHeaders().get("Content-Type");
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = null;
        r2 = null;
        MediaType mediaType = null;
        if (list2 != null && !list2.isEmpty()) {
            str = (String) yf2.t(list2);
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        List<String> list3 = Collections.EMPTY_LIST;
        List<String> list4 = allHeaders.get("Content-Encoding");
        if (list4 == null) {
            list3.getClass();
        } else {
            list3 = list4;
        }
        for (String str3 : list3) {
            uu5 uu5Var = b;
            uu5Var.getClass();
            str3.getClass();
            dxa dxaVar = new dxa(uu5Var, str3);
            if (dxaVar instanceof Collection) {
                arrayList.addAll((Collection) dxaVar);
            } else {
                nq2.u(arrayList, dxaVar.iterator());
            }
        }
        boolean z = true;
        if (!arrayList.isEmpty() && a.containsAll(arrayList)) {
            z = false;
        }
        if (z && (list = urlResponseInfo.getAllHeaders().get("Content-Length")) != null && !list.isEmpty()) {
            str2 = (String) yf2.t(list);
        } else {
            str2 = null;
        }
        if (osaVar != null) {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (request.b.equals("HEAD")) {
                j = 0;
            } else {
                j = -1;
                if (str2 != null) {
                    try {
                        j = Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            if ((httpStatusCode != 204 && httpStatusCode != 205) || j <= 0) {
                if (str != null) {
                    gm9 gm9Var = MediaType.b;
                    try {
                        mediaType = MediaType.Companion.a(str);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                mj9 mj9Var = new mj9(osaVar);
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$12 = ResponseBody.a;
                responseBody$Companion$asResponseBody$1 = new ResponseBody$Companion$asResponseBody$1(mediaType, j, mj9Var);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(httpStatusCode).length() + 35);
                sb.append("HTTP ");
                sb.append(httpStatusCode);
                sb.append(" had non-zero Content-Length: ");
                sb.append(str2);
                throw new ProtocolException(sb.toString());
            }
        }
        builder.a = request;
        builder.c = urlResponseInfo.getHttpStatusCode();
        String httpStatusText = urlResponseInfo.getHttpStatusText();
        httpStatusText.getClass();
        builder.d = httpStatusText;
        String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
        boolean contains = negotiatedProtocol.contains("quic");
        Protocol protocol = Protocol.QUIC;
        if (!contains && !negotiatedProtocol.contains("h3")) {
            boolean contains2 = negotiatedProtocol.contains("spdy");
            protocol = Protocol.HTTP_2;
            if (!contains2 && !negotiatedProtocol.contains("h2")) {
                protocol = negotiatedProtocol.contains("http/1.1") ? Protocol.HTTP_1_1 : Protocol.HTTP_1_0;
            }
        }
        builder.b = protocol;
        responseBody$Companion$asResponseBody$1.getClass();
        builder.g = responseBody$Companion$asResponseBody$1;
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            if (z || (!kve.c(entry.getKey(), "Content-Length") && !kve.c(entry.getKey(), "Content-Encoding"))) {
                String key = entry.getKey();
                String value = entry.getValue();
                key.getClass();
                value.getClass();
                Headers.Builder builder2 = builder.f;
                builder2.getClass();
                _HeadersCommonKt.b(key);
                _HeadersCommonKt.c(value, key);
                _HeadersCommonKt.a(builder2, key, value);
            }
        }
        return builder;
    }
}
