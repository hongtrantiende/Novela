package com.squareup.zstd;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class JniZstdKt {
    private static final long jniZstdPointer;

    static {
        AndroidZstdKt.loadNativeLibrary();
        jniZstdPointer = createJniZstd();
    }

    public static final native long createJniZstd();

    public static final native long createZstdCompressor();

    public static final native long createZstdDecompressor();

    public static final long getJniZstdPointer() {
        return jniZstdPointer;
    }

    public static final native String jniGetErrorName(long j);
}
