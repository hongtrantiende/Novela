package com.squareup.zstd;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
final /* synthetic */ class Zstd__Zstd_jniKt {
    public static final String getErrorName(long j) {
        return JniZstdKt.jniGetErrorName(j);
    }

    public static final ZstdCompressor zstdCompressor() {
        return new JniZstdCompressor();
    }

    public static final ZstdDecompressor zstdDecompressor() {
        return new JniZstdDecompressor();
    }
}
