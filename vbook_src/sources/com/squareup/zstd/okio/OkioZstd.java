package com.squareup.zstd.okio;

import com.squareup.zstd.Zstd;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class OkioZstd {
    private static final byte[] emptyByteArray = new byte[0];

    public static final byte[] getEmptyByteArray() {
        return emptyByteArray;
    }

    public static final yma zstdCompress(yma ymaVar) {
        ymaVar.getClass();
        return new ZstdCompressSink(new lj9(ymaVar), Zstd.zstdCompressor());
    }

    public static final osa zstdDecompress(osa osaVar) {
        osaVar.getClass();
        return new ZstdDecompressSource(new mj9(osaVar), Zstd.zstdDecompressor());
    }
}
