package com.squareup.zstd.okio;

import com.squareup.zstd.ZstdCompressor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class ZstdCompressSink implements yma {
    public boolean closed;
    private final ZstdCompressor compressor;
    private final my0 inputBuffer;
    private final ky0 inputCursor;
    private final ky0 outputCursor;
    public final az0 sink;

    /* JADX WARN: Type inference failed for: r1v1, types: [my0, java.lang.Object] */
    public ZstdCompressSink(az0 az0Var, ZstdCompressor zstdCompressor) {
        az0Var.getClass();
        zstdCompressor.getClass();
        this.sink = az0Var;
        this.compressor = zstdCompressor;
        this.inputBuffer = new Object();
        this.inputCursor = new ky0();
        this.outputCursor = new ky0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:14|15|16|17|(5:18|19|20|21|22)|(6:58|59|60|61|62|(2:32|(2:(2:35|(2:37|38)(1:39))(2:41|(2:45|46))|40)(3:49|50|51))(2:52|53))(2:24|57)|26|27|28|29|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
        throw new java.lang.IllegalStateException("already attached to a buffer");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
        defpackage.pye.e(r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #7 {all -> 0x008e, blocks: (B:31:0x0082, B:43:0x00c3, B:34:0x0093), top: B:79:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void compress(int r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.zstd.okio.ZstdCompressSink.compress(int):void");
    }

    @Override // defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.closed) {
            this.closed = true;
            az0 az0Var = this.sink;
            try {
                ZstdCompressor zstdCompressor = this.compressor;
                compress(2);
                th = null;
                dxe.r(zstdCompressor, null);
                if (az0Var != null) {
                    try {
                        az0Var.close();
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (az0Var != null) {
                    try {
                        az0Var.close();
                    } catch (Throwable th3) {
                        pye.e(th, th3);
                    }
                }
            }
            if (th == null) {
                return;
            }
            throw th;
        }
    }

    @Override // defpackage.yma, java.io.Flushable
    public void flush() {
        if (!this.closed) {
            compress(1);
            this.sink.flush();
            return;
        }
        vs.k("closed");
    }

    @Override // defpackage.yma
    public dac timeout() {
        return this.sink.timeout();
    }

    @Override // defpackage.yma
    public void write(my0 my0Var, long j) {
        my0Var.getClass();
        if (!this.closed) {
            this.inputBuffer.write(my0Var, j);
            compress(0);
            return;
        }
        vs.k("closed");
    }
}
