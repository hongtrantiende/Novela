package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl extends kn8 {
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, int i) {
        super(path, i);
        if (i != 0) {
            this.c = createInternalPathIterator(path, a82.C(i), 2.0E-4f);
            return;
        }
        throw null;
    }

    private final native long createInternalPathIterator(Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j);

    @FastNative
    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    @FastNative
    private final native int internalPathIteratorPeek(long j);

    @FastNative
    private final native int internalPathIteratorRawSize(long j);

    @FastNative
    private final native int internalPathIteratorSize(long j);

    @Override // defpackage.kn8
    public final boolean a() {
        return internalPathIteratorHasNext(this.c);
    }

    @Override // defpackage.kn8
    public final int b(float[] fArr) {
        return ln8.a[internalPathIteratorNext(this.c, fArr, 0)];
    }

    public final void finalize() {
        destroyInternalPathIterator(this.c);
    }
}
