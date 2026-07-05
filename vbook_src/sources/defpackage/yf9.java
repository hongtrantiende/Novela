package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yf9  reason: default package */
/* loaded from: classes.dex */
public final class yf9 implements Closeable {
    public static final Logger C = Logger.getLogger(yf9.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public vf9 d;
    public vf9 e;
    public final byte[] f;

    public yf9(File file) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    I0(bArr2, i, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    fb4.k("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int S = S(bArr, 0);
        this.b = S;
        if (S <= randomAccessFile2.length()) {
            this.c = S(bArr, 4);
            int S2 = S(bArr, 8);
            int S3 = S(bArr, 12);
            this.d = Q(S2);
            this.e = Q(S3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static void I0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int S(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final synchronized void C(xf9 xf9Var) {
        int i = this.d.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            vf9 Q = Q(i);
            xf9Var.a(new wf9(this, Q), Q.c);
            i = p0(Q.b + 4 + Q.c);
        }
    }

    public final synchronized boolean G() {
        boolean z;
        if (this.c == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final vf9 Q(int i) {
        if (i == 0) {
            return vf9.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new vf9(i, randomAccessFile.readInt(), 0);
    }

    public final synchronized void V() {
        if (!G()) {
            if (this.c == 1) {
                synchronized (this) {
                    y0(4096, 0, 0, 0);
                    this.c = 0;
                    vf9 vf9Var = vf9.d;
                    this.d = vf9Var;
                    this.e = vf9Var;
                    if (this.b > 4096) {
                        RandomAccessFile randomAccessFile = this.a;
                        randomAccessFile.setLength(4096L);
                        randomAccessFile.getChannel().force(true);
                    }
                    this.b = 4096;
                }
            } else {
                vf9 vf9Var2 = this.d;
                int p0 = p0(vf9Var2.b + 4 + vf9Var2.c);
                g0(p0, this.f, 0, 4);
                int S = S(this.f, 0);
                y0(this.b, this.c - 1, p0, this.e.b);
                this.c--;
                this.d = new vf9(p0, S, 0);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final void g0(int i, byte[] bArr, int i2, int i3) {
        int p0 = p0(i);
        int i4 = p0 + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(p0);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - p0;
        randomAccessFile.seek(p0);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void j0(byte[] bArr, int i, int i2) {
        int p0 = p0(i);
        int i3 = p0 + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(p0);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - p0;
        randomAccessFile.seek(p0);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int m0() {
        if (this.c == 0) {
            return 16;
        }
        vf9 vf9Var = this.e;
        int i = vf9Var.b;
        int i2 = this.d.b;
        if (i >= i2) {
            return (i - i2) + 4 + vf9Var.c + 16;
        }
        return (((i + 4) + vf9Var.c) + this.b) - i2;
    }

    public final void o(byte[] bArr) {
        int p0;
        int i;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    q(length);
                    boolean G = G();
                    if (G) {
                        p0 = 16;
                    } else {
                        vf9 vf9Var = this.e;
                        p0 = p0(vf9Var.b + 4 + vf9Var.c);
                    }
                    vf9 vf9Var2 = new vf9(p0, length, 0);
                    I0(this.f, 0, length);
                    j0(this.f, p0, 4);
                    j0(bArr, p0 + 4, length);
                    if (G) {
                        i = p0;
                    } else {
                        i = this.d.b;
                    }
                    y0(this.b, this.c + 1, i, p0);
                    this.e = vf9Var2;
                    this.c++;
                    if (G) {
                        this.d = vf9Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final int p0(int i) {
        int i2 = this.b;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    public final void q(int i) {
        int i2 = i + 4;
        int m0 = this.b - m0();
        if (m0 >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            m0 += i3;
            i3 <<= 1;
        } while (m0 < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        vf9 vf9Var = this.e;
        int p0 = p0(vf9Var.b + 4 + vf9Var.c);
        if (p0 < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = p0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                vs.j("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            y0(i3, this.c, i5, i6);
            this.e = new vf9(i6, this.e.c, 0);
        } else {
            y0(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(yf9.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            C(new ih1(sb, 5));
        } catch (IOException e) {
            C.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void y0(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 < 4) {
                I0(bArr, i6, iArr[i5]);
                i6 += 4;
                i5++;
            } else {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }
}
