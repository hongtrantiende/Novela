package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ku2  reason: default package */
/* loaded from: classes.dex */
public final class ku2 extends ih0 {
    public final String C;
    public final kw5 D;
    public final kw5 E;
    public mg2 F;
    public HttpURLConnection G;
    public InputStream H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public final int e;
    public final int f;

    public ku2(String str, int i, int i2, kw5 kw5Var) {
        super(true);
        this.C = str;
        this.e = i;
        this.f = i2;
        this.D = kw5Var;
        this.E = new kw5(28);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.net.HttpURLConnection, mg2, java.io.InputStream] */
    @Override // defpackage.jg2
    public final void close() {
        try {
            InputStream inputStream = this.H;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = a2d.a;
                    throw new nf5(e, 2000, 3);
                }
            }
        } finally {
            this.H = null;
            l();
            if (this.I) {
                this.I = false;
                c();
            }
            this.G = null;
            this.F = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152 A[Catch: IOException -> 0x015d, TRY_LEAVE, TryCatch #5 {IOException -> 0x015d, blocks: (B:56:0x014a, B:58:0x0152), top: B:117:0x014a }] */
    @Override // defpackage.jg2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(defpackage.mg2 r27) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku2.d(mg2):long");
    }

    public final void l() {
        HttpURLConnection httpURLConnection = this.G;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                st0.i("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection m(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        boolean z3;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap hashMap = new HashMap();
        kw5 kw5Var = this.D;
        if (kw5Var != null) {
            hashMap.putAll(kw5Var.u());
        }
        hashMap.putAll(this.E.u());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = pi5.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder o = rs8.o(j, "bytes=", "-");
            if (j2 != -1) {
                o.append((j + j2) - 1);
            }
            sb = o.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.C;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        int i2 = mg2.i;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "HEAD";
                } else {
                    vm1.d();
                    return null;
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // defpackage.jg2
    public final Map o() {
        HttpURLConnection httpURLConnection = this.G;
        if (httpURLConnection == null) {
            return rm9.C;
        }
        return new ju2(httpURLConnection.getHeaderFields());
    }

    public final void r(long j) {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                InputStream inputStream = this.H;
                String str = a2d.a;
                int read = inputStream.read(bArr, 0, (int) Math.min(j, 4096L));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        j -= read;
                        b(read);
                    } else {
                        throw new nf5();
                    }
                } else {
                    throw new nf5(new InterruptedIOException(), 2000, 1);
                }
            }
        }
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.K;
            if (j != -1) {
                long j2 = j - this.L;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.H;
            String str = a2d.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.L += read;
                b(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = a2d.a;
            throw nf5.a(e, 2);
        }
    }

    @Override // defpackage.jg2
    public final Uri t() {
        HttpURLConnection httpURLConnection = this.G;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        mg2 mg2Var = this.F;
        if (mg2Var != null) {
            return mg2Var.a;
        }
        return null;
    }
}
