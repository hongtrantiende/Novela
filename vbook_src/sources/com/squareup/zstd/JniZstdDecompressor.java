package com.squareup.zstd;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class JniZstdDecompressor extends ZstdDecompressor {
    public long dctxPointer;

    public JniZstdDecompressor() {
        long createZstdDecompressor = JniZstdKt.createZstdDecompressor();
        if (createZstdDecompressor != 0) {
            this.dctxPointer = createZstdDecompressor;
            return;
        }
        throw new OutOfMemoryError("createZstdDecompressor failed");
    }

    private final native void close(long j);

    private final native long decompressStream(long j, long j2, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    @Override // java.lang.AutoCloseable
    public void close() {
        long j = this.dctxPointer;
        if (j != 0) {
            this.dctxPointer = 0L;
            close(j);
        }
    }

    @Override // com.squareup.zstd.ZstdDecompressor
    public long decompressStream(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        bArr.getClass();
        bArr2.getClass();
        return decompressStream(JniZstdKt.getJniZstdPointer(), this.dctxPointer, bArr, i, i2, bArr2, i3, i4);
    }
}
