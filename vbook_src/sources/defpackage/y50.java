package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y50  reason: default package */
/* loaded from: classes.dex */
public interface y50 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean c();

    ByteBuffer d();

    void e(w50 w50Var);

    void f(ByteBuffer byteBuffer);

    v50 g(v50 v50Var);

    void h();

    boolean isActive();

    void reset();

    default long i(long j) {
        return j;
    }
}
