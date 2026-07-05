package com.squareup.zstd;
/* loaded from: classes3.dex */
public final class Zstd {
    public static final int ZSTD_e_continue = 0;
    public static final int ZSTD_e_end = 2;
    public static final int ZSTD_e_flush = 1;

    public static final String getErrorName(long j) {
        return Zstd__Zstd_jniKt.getErrorName(j);
    }

    public static final ZstdCompressor zstdCompressor() {
        return Zstd__Zstd_jniKt.zstdCompressor();
    }

    public static final ZstdDecompressor zstdDecompressor() {
        return Zstd__Zstd_jniKt.zstdDecompressor();
    }
}
