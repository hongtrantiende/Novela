package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xyd  reason: default package */
/* loaded from: classes.dex */
public final class xyd implements Closeable {
    public static final ro b = new ro(3);
    public int a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i > 0) {
            this.a = i - 1;
        } else {
            vs.j("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
