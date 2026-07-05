package okhttp3.internal;

import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class _UtilJvmKt {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = k4b.u0(k4b.t0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        if (c16.i(httpUrl.d, httpUrl2.d) && httpUrl.e == httpUrl2.e && c16.i(httpUrl.a, httpUrl2.a)) {
            return true;
        }
        return false;
    }

    public static final int b(long j) {
        TimeUnit.MILLISECONDS.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (j <= 2147483647L) {
                if (j == 0 && i > 0) {
                    p1a.k("timeout".concat(" too small"));
                    return 0;
                }
                return (int) j;
            }
            p1a.k("timeout".concat(" too large"));
            return 0;
        }
        cy7.a("timeout".concat(" < 0"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (c16.i(e2.getMessage(), "bio == null")) {
                return;
            }
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(Response response) {
        String a2 = response.f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.a;
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [my0, java.lang.Object] */
    public static final boolean f(osa osaVar, int i) {
        long j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (osaVar.timeout().e()) {
            j = osaVar.timeout().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        osaVar.timeout().d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (osaVar.read(obj, 8192L) != -1) {
                obj.o();
            }
            if (j == Long.MAX_VALUE) {
                osaVar.timeout().a();
                return true;
            }
            osaVar.timeout().d(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                osaVar.timeout().a();
                return false;
            }
            osaVar.timeout().d(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                osaVar.timeout().a();
            } else {
                osaVar.timeout().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static final Headers g(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            _HeadersCommonKt.a(builder, header.a.t(), header.b.t());
        }
        return builder.a();
    }

    public static final String h(HttpUrl httpUrl, boolean z) {
        httpUrl.getClass();
        int i = httpUrl.e;
        String str = httpUrl.d;
        if (k4b.V(str, ":", false)) {
            str = eub.n(']', "[", str);
        }
        if (!z && i == HttpUrl.Companion.a(httpUrl.a)) {
            return str;
        }
        return str + ':' + i;
    }

    public static final List i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return ks3.a;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr.length == 1) {
                List singletonList = Collections.singletonList(objArr[0]);
                singletonList.getClass();
                return singletonList;
            }
            Object[] objArr2 = (Object[]) objArr.clone();
            objArr2.getClass();
            List asList = Arrays.asList(objArr2);
            asList.getClass();
            List unmodifiableList = Collections.unmodifiableList(asList);
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        return ks3.a;
    }
}
