package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.dnsoverhttps.DnsOverHttps;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l03  reason: default package */
/* loaded from: classes3.dex */
public final class l03 implements Dns {
    public final lf5 b;
    public final mfb c;
    public volatile yb3 d;
    public volatile DnsOverHttps e;

    public l03(lf5 lf5Var) {
        lf5Var.getClass();
        this.b = lf5Var;
        this.c = new mfb(new rj2(6));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [okhttp3.dnsoverhttps.DnsOverHttps$Builder, java.lang.Object] */
    @Override // okhttp3.Dns
    public final List a(String str) {
        DnsOverHttps dnsOverHttps;
        str.getClass();
        yb3 yb3Var = this.b.a;
        if (yb3Var == null) {
            return Dns.a.a(str);
        }
        synchronized (this) {
            try {
                if (yb3Var != this.d) {
                    this.d = yb3Var;
                    ?? obj = new Object();
                    obj.c = Dns.a;
                    OkHttpClient okHttpClient = (OkHttpClient) this.c.getValue();
                    okHttpClient.getClass();
                    obj.a = okHttpClient;
                    String str2 = yb3Var.a;
                    HttpUrl.Builder builder = new HttpUrl.Builder();
                    builder.b(null, str2);
                    obj.b = builder.a();
                    List<String> list = yb3Var.b;
                    ArrayList arrayList = new ArrayList(tl1.s(list, 10));
                    for (String str3 : list) {
                        arrayList.add(InetAddress.getByName(str3));
                    }
                    obj.d = arrayList;
                    this.e = obj.a();
                }
                dnsOverHttps = this.e;
                dnsOverHttps.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return dnsOverHttps.a(str);
    }
}
