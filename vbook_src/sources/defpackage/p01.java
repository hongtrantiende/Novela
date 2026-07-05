package defpackage;

import android.media.MediaDataSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p01  reason: default package */
/* loaded from: classes.dex */
public final class p01 extends MediaDataSource {
    public final byte[] a;

    public p01(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.a.length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.a;
        if (j >= bArr2.length) {
            return -1;
        }
        long j2 = i2 + j;
        if (j2 > bArr2.length) {
            i2 -= (int) (j2 - bArr2.length);
        }
        if (bArr != null) {
            System.arraycopy(bArr2, (int) j, bArr, i, i2);
        }
        return i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
