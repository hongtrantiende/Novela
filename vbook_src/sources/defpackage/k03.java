package defpackage;

import java.util.concurrent.Executors;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import org.chromium.net.CronetEngine;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k03  reason: default package */
/* loaded from: classes3.dex */
public final class k03 implements Interceptor {
    public final lf5 a;
    public volatile jc2 b;

    public k03(lf5 lf5Var) {
        lf5Var.getClass();
        this.a = lf5Var;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, sr9] */
    @Override // okhttp3.Interceptor
    public final Response o(RealInterceptorChain realInterceptorChain) {
        Object gs9Var;
        if (!this.a.b) {
            return realInterceptorChain.b(realInterceptorChain.e);
        }
        jc2 jc2Var = this.b;
        if (jc2Var == null) {
            synchronized (this) {
                jc2Var = this.b;
                if (jc2Var == null) {
                    CronetEngine a = gc2.a.a();
                    if (a == null) {
                        return realInterceptorChain.b(realInterceptorChain.e);
                    }
                    wq9.s(hc2.class.equals(hc2.class));
                    jc2Var = new jc2(new cq9(a, Executors.newFixedThreadPool(4), new eb5(22, new bl8(2), new g99(Executors.newCachedThreadPool(), 3)), new Object()));
                    this.b = jc2Var;
                }
            }
        }
        try {
            gs9Var = jc2Var.o(realInterceptorChain);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (hs9.a(gs9Var) != null) {
            gs9Var = realInterceptorChain.b(realInterceptorChain.e);
        }
        return (Response) gs9Var;
    }
}
