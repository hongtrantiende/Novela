package okhttp3.internal.http;

import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class HttpHeaders {
    public static final e31 a;
    public static final e31 b;

    static {
        e31 e31Var = e31.d;
        a = p40.o("\"\\");
        b = p40.o("\t ,=");
    }

    public static final boolean a(Response response) {
        if (!c16.i(response.a.b, "HEAD")) {
            int i = response.d;
            if (((i >= 100 && i < 200) || i == 204 || i == 304) && _UtilJvmKt.e(response) == -1) {
                String a2 = response.f.a("Transfer-Encoding");
                if (a2 == null) {
                    a2 = null;
                }
                if (!"chunked".equalsIgnoreCase(a2)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v8, types: [my0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.my0 r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.b(my0, java.util.ArrayList):void");
    }

    public static final String c(my0 my0Var) {
        long g0 = my0Var.g0(b);
        if (g0 == -1) {
            g0 = my0Var.b;
        }
        if (g0 != 0) {
            return my0Var.I0(g0, ed1.a);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cb, code lost:
        if (okhttp3.internal._HostnamesCommonKt.a.g(r0) == false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(okhttp3.CookieJar r36, okhttp3.HttpUrl r37, okhttp3.Headers r38) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static final boolean e(my0 my0Var) {
        boolean z = false;
        while (!my0Var.k()) {
            byte S = my0Var.S(0L);
            if (S == 44) {
                my0Var.readByte();
                z = true;
            } else if (S != 32 && S != 9) {
                break;
            } else {
                my0Var.readByte();
            }
        }
        return z;
    }
}
