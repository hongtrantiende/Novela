package com.squareup.zstd;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class JniZstdCompressor extends ZstdCompressor {
    public long cctxPointer;

    public JniZstdCompressor() {
        long createZstdCompressor = JniZstdKt.createZstdCompressor();
        if (createZstdCompressor != 0) {
            this.cctxPointer = createZstdCompressor;
            return;
        }
        throw new OutOfMemoryError("createZstdCompressor failed");
    }

    private final native void close(long j);

    private final native long compressStream2(long j, long j2, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5);

    private final native long setParameter(long j, int i, int i2);

    @Override // java.lang.AutoCloseable
    public void close() {
        long j = this.cctxPointer;
        if (j != 0) {
            this.cctxPointer = 0L;
            close(j);
        }
    }

    @Override // com.squareup.zstd.ZstdCompressor
    public long compressStream2(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5) {
        bArr.getClass();
        bArr2.getClass();
        return compressStream2(JniZstdKt.getJniZstdPointer(), this.cctxPointer, bArr, i, i2, bArr2, i3, i4, i5);
    }

    @Override // com.squareup.zstd.ZstdCompressor
    public long setParameter(int i, int i2) {
        return setParameter(this.cctxPointer, i, i2);
    }
}
