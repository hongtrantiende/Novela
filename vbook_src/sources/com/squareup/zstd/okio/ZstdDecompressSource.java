package com.squareup.zstd.okio;

import com.squareup.zstd.Zstd;
import com.squareup.zstd.ZstdDecompressor;
import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class ZstdDecompressSource implements osa {
    public boolean closed;
    private final ZstdDecompressor decompressor;
    private final ky0 inputCursor;
    private long lastDecompressResult;
    private final my0 outputBuffer;
    private final ky0 outputCursor;
    public final bz0 source;

    /* JADX WARN: Type inference failed for: r1v2, types: [my0, java.lang.Object] */
    public ZstdDecompressSource(bz0 bz0Var, ZstdDecompressor zstdDecompressor) {
        bz0Var.getClass();
        zstdDecompressor.getClass();
        this.source = bz0Var;
        this.decompressor = zstdDecompressor;
        this.inputCursor = new ky0();
        this.outputBuffer = new Object();
        this.outputCursor = new ky0();
    }

    private final void refillIfNecessary() {
        Throwable th;
        long j;
        my0 b;
        ky0 ky0Var;
        while (this.outputBuffer.k()) {
            long j2 = 0;
            if (!this.source.request(1L)) {
                if (this.lastDecompressResult != 0) {
                    throw new EOFException("EOF before end of stream");
                }
                return;
            }
            my0 my0Var = this.outputBuffer;
            ky0 ky0Var2 = this.outputCursor;
            my0Var.m0(ky0Var2);
            try {
                j = this.outputBuffer.b;
                ky0Var2.o();
                b = this.source.b();
                ky0Var = this.inputCursor;
                b.getClass();
                ky0Var.getClass();
                byte[] bArr = b.a;
            } catch (Throwable th2) {
                th = th2;
                try {
                    ky0Var2.close();
                } catch (Throwable th3) {
                    pye.e(th, th3);
                }
            }
            if (ky0Var.a == null) {
                ky0Var.a = b;
                ky0Var.b = false;
                th = null;
                ky0Var.q();
                ZstdDecompressor zstdDecompressor = this.decompressor;
                byte[] bArr2 = ky0Var2.e;
                bArr2.getClass();
                int i = ky0Var2.C;
                int i2 = ky0Var2.f;
                byte[] bArr3 = ky0Var.e;
                bArr3.getClass();
                j2 = zstdDecompressor.decompressStream(bArr2, i, i2, bArr3, ky0Var.C, ky0Var.f);
                try {
                    ky0Var.close();
                    th = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                if (th == null) {
                    this.source.skip(this.decompressor.inputBytesProcessed);
                    ky0Var2.C(j + this.decompressor.outputBytesProcessed);
                    try {
                        ky0Var2.close();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    if (th == null) {
                        this.lastDecompressResult = j2;
                        String errorName = Zstd.getErrorName(j2);
                        if (errorName != null) {
                            fb4.k("zstd decompress failed: ".concat(errorName));
                            return;
                        }
                    } else {
                        throw th;
                    }
                } else {
                    throw th;
                }
            } else {
                throw new IllegalStateException("already attached to a buffer");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th;
        if (!this.closed) {
            this.closed = true;
            this.outputBuffer.o();
            bz0 bz0Var = this.source;
            try {
                th = null;
                dxe.r(this.decompressor, null);
                if (bz0Var != null) {
                    try {
                        bz0Var.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (bz0Var != null) {
                    try {
                        bz0Var.close();
                    } catch (Throwable th4) {
                        pye.e(th, th4);
                    }
                }
            }
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    @Override // defpackage.osa
    public long read(my0 my0Var, long j) {
        my0Var.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (!this.closed) {
                if (i == 0) {
                    return 0L;
                }
                refillIfNecessary();
                return this.outputBuffer.read(my0Var, j);
            }
            vs.k("closed");
            return 0L;
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.osa
    public dac timeout() {
        return this.source.timeout();
    }
}
