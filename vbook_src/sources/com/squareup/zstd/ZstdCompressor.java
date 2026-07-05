package com.squareup.zstd;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class ZstdCompressor implements AutoCloseable {
    public int inputBytesProcessed = -1;
    public int outputBytesProcessed = -1;

    public abstract long compressStream2(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5);

    public abstract long setParameter(int i, int i2);
}
