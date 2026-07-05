package okhttp3.dnsoverhttps;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Dns;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class BootstrapDns implements Dns {
    public final String b;
    public final List c;

    public BootstrapDns(String str, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        this.b = str;
        this.c = arrayList;
    }

    @Override // okhttp3.Dns
    public final List a(String str) {
        str.getClass();
        String str2 = this.b;
        if (c16.i(str2, str)) {
            return this.c;
        }
        throw new UnknownHostException(eub.p("BootstrapDns called for ", str, " instead of ", str2));
    }
}
