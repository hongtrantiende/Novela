package okhttp3.internal;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class UnreadableResponseBody extends ResponseBody implements osa {
    public final MediaType b;
    public final long c;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.b = mediaType;
        this.c = j;
    }

    @Override // okhttp3.ResponseBody
    public final long o() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType q() {
        return this.b;
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        my0Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return dac.d;
    }

    @Override // okhttp3.ResponseBody
    public final bz0 v() {
        return new mj9(this);
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
