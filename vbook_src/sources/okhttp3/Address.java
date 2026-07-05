package okhttp3;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Address {
    public final Dns a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final CertificatePinner e;
    public final Authenticator f;
    public final ProxySelector g;
    public final HttpUrl h;
    public final List i;
    public final List j;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, List list, List list2, ProxySelector proxySelector) {
        String str2;
        str.getClass();
        dns.getClass();
        socketFactory.getClass();
        authenticator.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = dns;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = certificatePinner;
        this.f = authenticator;
        this.g = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        if (str2.equalsIgnoreCase("http")) {
            builder.a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            builder.a = "https";
        } else {
            vs.m("unexpected scheme: ".concat(str2));
            throw null;
        }
        String b = _HostnamesCommonKt.b(_UrlKt.c(0, str, 0, 7));
        if (b != null) {
            builder.d = b;
            if (1 <= i && i < 65536) {
                builder.e = i;
                this.h = builder.a();
                this.i = _UtilJvmKt.i(list);
                this.j = _UtilJvmKt.i(list2);
                return;
            }
            p1a.k(a82.j(i, "unexpected port: "));
            throw null;
        }
        vs.m("unexpected host: ".concat(str));
        throw null;
    }

    public final boolean a(Address address) {
        address.getClass();
        if (c16.i(this.a, address.a) && c16.i(this.f, address.f) && c16.i(this.i, address.i) && c16.i(this.j, address.j) && c16.i(this.g, address.g) && c16.i(this.c, address.c) && c16.i(this.d, address.d) && c16.i(this.e, address.e) && this.h.e == address.h.e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (c16.i(this.h, address.h) && a(address)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int j = eub.j(527, 31, this.h.h);
        int l = eub.l(eub.l((this.f.hashCode() + ((this.a.hashCode() + j) * 31)) * 31, this.i, 31), this.j, 31);
        int hashCode = Objects.hashCode(this.c);
        int hashCode2 = Objects.hashCode(this.d);
        return Objects.hashCode(this.e) + ((hashCode2 + ((hashCode + ((this.g.hashCode() + l) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.h;
        sb.append(httpUrl.d);
        sb.append(':');
        sb.append(httpUrl.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
