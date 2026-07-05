package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lg2  reason: default package */
/* loaded from: classes.dex */
public final class lg2 extends InputStream {
    public final jg2 a;
    public final mg2 b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public lg2(jg2 jg2Var, mg2 mg2Var) {
        this.a = jg2Var;
        this.b = mg2Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.e) {
            this.a.close();
            this.e = true;
        }
    }

    public final void o() {
        if (!this.d) {
            this.a.d(this.b);
            this.d = true;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        wq9.D(!this.e);
        o();
        int read = this.a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
