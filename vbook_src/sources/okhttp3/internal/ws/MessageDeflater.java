package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Deflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class MessageDeflater implements Closeable {
    public final boolean a;
    public final my0 b;
    public final Deflater c;
    public final b03 d;

    /* JADX WARN: Type inference failed for: r4v1, types: [my0, java.lang.Object, yma] */
    public MessageDeflater(boolean z) {
        this.a = z;
        ?? obj = new Object();
        this.b = obj;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new b03(new lj9(obj), deflater, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
