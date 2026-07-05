package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ln0  reason: default package */
/* loaded from: classes3.dex */
public final class ln0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public ln0(d2f d2fVar, dcc dccVar) {
        this.a = 5;
        this.b = dccVar;
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return (int) Math.min(((my0) obj).b, 2147483647L);
            case 2:
                return ((ln0) obj).available();
            case 3:
                mj9 mj9Var = (mj9) obj;
                if (!mj9Var.c) {
                    return (int) Math.min(mj9Var.b.b, 2147483647L);
                }
                fb4.k("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s9e.m((s11) obj);
                return;
            case 1:
                return;
            case 2:
                super.close();
                ((ln0) obj).close();
                return;
            case 3:
                ((mj9) obj).close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                bArr.getClass();
                s11 s11Var = (s11) obj;
                if (!s11Var.i()) {
                    if (s11Var.h().k()) {
                        z87.C(gs3.a, new oi(s11Var, (m42) null, 3));
                    }
                    ly0 h = s11Var.h();
                    h.getClass();
                    int q = s11Var.h().q(bArr, i, Math.min((int) h.c, i2) + i);
                    if (q >= 0) {
                        return q;
                    }
                    if (!s11Var.i()) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                bArr.getClass();
                return ((my0) obj).read(bArr, i, i2);
            case 2:
                bArr.getClass();
                return ((ln0) obj).read(bArr, i, i2);
            case 3:
                bArr.getClass();
                mj9 mj9Var = (mj9) obj;
                my0 my0Var = mj9Var.b;
                if (!mj9Var.c) {
                    bbe.n(bArr.length, i, i2);
                    if (my0Var.b == 0 && mj9Var.a.read(my0Var, 8192L) == -1) {
                        return -1;
                    }
                    return my0Var.read(bArr, i, i2);
                }
                fb4.k("closed");
                return 0;
            case 4:
                d2f d2fVar = (d2f) obj;
                try {
                    int inflate = d2fVar.a.inflate(bArr, i, i2);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (d2fVar.a.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = d2fVar.a.getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((dcc) obj).l(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        int i;
        switch (this.a) {
            case 5:
                if (j <= 0) {
                    return 0L;
                }
                if (j > 2147483647L) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = (int) j;
                }
                ((dcc) this.b).m(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return ((my0) obj) + ".inputStream()";
            case 2:
            default:
                return super.toString();
            case 3:
                return ((mj9) obj) + ".inputStream()";
        }
    }

    public long transferTo(OutputStream outputStream) {
        switch (this.a) {
            case 3:
                outputStream.getClass();
                mj9 mj9Var = (mj9) this.b;
                my0 my0Var = mj9Var.b;
                if (!mj9Var.c) {
                    long j = 0;
                    while (true) {
                        if (my0Var.b == 0 && mj9Var.a.read(my0Var, 8192L) == -1) {
                            return j;
                        }
                        long j2 = my0Var.b;
                        j += j2;
                        bbe.n(j2, 0L, j2);
                        e5a e5aVar = my0Var.a;
                        while (j2 > 0) {
                            e5aVar.getClass();
                            int min = (int) Math.min(j2, e5aVar.c - e5aVar.b);
                            outputStream.write(e5aVar.a, e5aVar.b, min);
                            int i = e5aVar.b + min;
                            e5aVar.b = i;
                            long j3 = min;
                            my0Var.b -= j3;
                            j2 -= j3;
                            if (i == e5aVar.c) {
                                e5a a = e5aVar.a();
                                my0Var.a = a;
                                n5a.a(e5aVar);
                                e5aVar = a;
                            }
                        }
                    }
                } else {
                    fb4.k("closed");
                    return 0L;
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ ln0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void o() {
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s11 s11Var = (s11) obj;
                if (s11Var.i()) {
                    return -1;
                }
                if (s11Var.h().k()) {
                    z87.C(gs3.a, new oi(s11Var, (m42) null, 3));
                }
                if (s11Var.i()) {
                    return -1;
                }
                return s11Var.h().readByte() & 255;
            case 1:
                my0 my0Var = (my0) obj;
                if (my0Var.b > 0) {
                    return my0Var.readByte() & 255;
                }
                return -1;
            case 2:
                return ((ln0) obj).read();
            case 3:
                mj9 mj9Var = (mj9) obj;
                my0 my0Var2 = mj9Var.b;
                if (!mj9Var.c) {
                    if (my0Var2.b == 0 && mj9Var.a.read(my0Var2, 8192L) == -1) {
                        return -1;
                    }
                    return my0Var2.readByte() & 255;
                }
                fb4.k("closed");
                return 0;
            case 4:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((dcc) obj).l(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
