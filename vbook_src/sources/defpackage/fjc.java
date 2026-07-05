package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fjc  reason: default package */
/* loaded from: classes.dex */
public interface fjc {
    void a(long j, int i, int i2, int i3, ejc ejcVar);

    void b(km8 km8Var, int i, int i2);

    int c(eg2 eg2Var, int i, boolean z);

    default void e(int i, km8 km8Var) {
        b(km8Var, i, 0);
    }

    default int f(eg2 eg2Var, int i, boolean z) {
        return c(eg2Var, i, z);
    }

    void g(vq4 vq4Var);

    default void d(long j) {
    }
}
