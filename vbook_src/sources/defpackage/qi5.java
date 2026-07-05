package defpackage;

import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qi5  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi5 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf5 b;

    public /* synthetic */ qi5(lf5 lf5Var, int i) {
        this.a = i;
        this.b = lf5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mc, javax.net.ssl.X509TrustManager, java.lang.Object] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        lf5 lf5Var = this.b;
        switch (i) {
            case 0:
                x88 x88Var = (x88) obj;
                x88Var.getClass();
                x88Var.a = new fl7(14, x88Var.a, new qi5(lf5Var, 1));
                return pvc.a;
            default:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                builder.getClass();
                builder.i = true;
                builder.j = true;
                ?? obj2 = new Object();
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, new mc[]{obj2}, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                socketFactory.getClass();
                if (!socketFactory.equals(builder.p) || obj2 != builder.q) {
                    builder.B = null;
                }
                builder.p = socketFactory;
                Platform platform = Platform.a;
                builder.v = Platform.a.c(obj2);
                builder.q = obj2;
                if (lf5Var != null) {
                    l03 l03Var = new l03(lf5Var);
                    if (l03Var != builder.l) {
                        builder.B = null;
                    }
                    builder.l = l03Var;
                    builder.c.add(new k03(lf5Var));
                }
                return pvc.a;
        }
    }
}
