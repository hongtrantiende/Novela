package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf9  reason: default package */
/* loaded from: classes.dex */
public final class wf9 extends InputStream {
    public int a;
    public int b;
    public final /* synthetic */ yf9 c;

    public wf9(yf9 yf9Var, vf9 vf9Var) {
        this.c = yf9Var;
        this.a = yf9Var.p0(vf9Var.b + 4);
        this.b = vf9Var.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.b;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    int i4 = this.a;
                    yf9 yf9Var = this.c;
                    yf9Var.g0(i4, bArr, i, i2);
                    this.a = yf9Var.p0(this.a + i2);
                    this.b -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        xk5.k("buffer");
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        yf9 yf9Var = this.c;
        RandomAccessFile randomAccessFile = yf9Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int read = randomAccessFile.read();
        this.a = yf9Var.p0(this.a + 1);
        this.b--;
        return read;
    }
}
