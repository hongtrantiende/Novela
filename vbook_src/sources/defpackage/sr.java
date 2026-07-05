package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sr  reason: default package */
/* loaded from: classes.dex */
public interface sr {
    boolean a();

    long b();

    drc c();

    js d(long j);

    default boolean e(long j) {
        if (j >= b()) {
            return true;
        }
        return false;
    }

    Object f(long j);

    Object g();
}
