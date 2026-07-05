package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class MessageInflater implements Closeable {
    public final boolean a;
    public final my0 b = new Object();
    public Inflater c;
    public bv5 d;

    /* JADX WARN: Type inference failed for: r1v1, types: [my0, java.lang.Object] */
    public MessageInflater(boolean z) {
        this.a = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bv5 bv5Var = this.d;
        if (bv5Var != null) {
            bv5Var.close();
        }
        this.d = null;
        this.c = null;
    }
}
