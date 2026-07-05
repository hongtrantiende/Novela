package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealInterceptorChain;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jc2  reason: default package */
/* loaded from: classes3.dex */
public final class jc2 implements Interceptor, AutoCloseable {
    public final cq9 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ScheduledThreadPoolExecutor c;

    public jc2(cq9 cq9Var) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.c = scheduledThreadPoolExecutor;
        this.a = cq9Var;
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new x0(this, 13), 500L, 500L, TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.shutdown();
    }

    @Override // okhttp3.Interceptor
    public final Response o(RealInterceptorChain realInterceptorChain) {
        UploadDataProvider vp9Var;
        ConcurrentHashMap concurrentHashMap = this.b;
        if (!realInterceptorChain.a.N) {
            Request request = realInterceptorChain.e;
            cq9 cq9Var = this.a;
            int i = realInterceptorChain.g;
            int i2 = realInterceptorChain.h;
            cq9Var.getClass();
            w88 w88Var = new w88(i);
            CronetEngine cronetEngine = cq9Var.a;
            HttpUrl httpUrl = request.a;
            Headers headers = request.c;
            UrlRequest.Builder allowDirectExecutor = cronetEngine.newUrlRequestBuilder(httpUrl.h, w88Var, e73.a).allowDirectExecutor();
            allowDirectExecutor.setHttpMethod(request.b);
            for (int i3 = 0; i3 < headers.size(); i3++) {
                allowDirectExecutor.addHeader(headers.b(i3), headers.d(i3));
            }
            RequestBody requestBody = request.d;
            if (requestBody != null) {
                MediaType b = requestBody.b();
                if (b != null) {
                    allowDirectExecutor.addHeader("Content-Type", b.a);
                }
                if (headers.a("Content-Length") == null && requestBody.a() != -1) {
                    allowDirectExecutor.addHeader("Content-Length", String.valueOf(requestBody.a()));
                }
                if (requestBody.a() != 0) {
                    String a = headers.a("Content-Type");
                    if (b == null && (a == null || a.trim().isEmpty())) {
                        Log.w("CronetTransportForOkHttp", "Cronet OkHttp transport was passed a request body with a missing or empty Content-Type header. This is not supported by Cronet. Content-Type has been overridden to \"application/octet-stream\"", new Exception());
                        allowDirectExecutor.addHeader("Content-Type", "application/octet-stream");
                    }
                    eb5 eb5Var = cq9Var.d;
                    long a2 = requestBody.a();
                    if (a2 != -1 && a2 <= 1048576) {
                        bl8 bl8Var = (bl8) eb5Var.b;
                        long a3 = requestBody.a();
                        if (a3 >= 0 && a3 <= 1048576) {
                            vp9Var = new up9(bl8Var, a3, requestBody);
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 50);
                            sb.append("Expected definite length less than 1048576but got ");
                            sb.append(a3);
                            throw new IOException(sb.toString());
                        }
                    } else {
                        vp9Var = new vp9(requestBody, new bx2(), (ExecutorService) ((g99) eb5Var.c).b, i2);
                    }
                    allowDirectExecutor.setUploadDataProvider(vp9Var, cq9Var.b);
                }
            }
            UrlRequest build = allowDirectExecutor.build();
            xk9 xk9Var = new xk9(2, build, new zg4(cq9Var, request, w88Var));
            concurrentHashMap.put(realInterceptorChain.a, build);
            try {
                build.start();
                return q(realInterceptorChain.a, xk9Var.g());
            } catch (IOException | RuntimeException e) {
                concurrentHashMap.remove(realInterceptorChain.a);
                throw e;
            }
        }
        fb4.k("Canceled");
        return null;
    }

    public final Response q(Call call, Response response) {
        ResponseBody responseBody = response.C;
        responseBody.getClass();
        if (responseBody instanceof ic2) {
            return response;
        }
        Response.Builder o = response.o();
        o.g = new ic2(this, responseBody, call);
        return o.a();
    }
}
