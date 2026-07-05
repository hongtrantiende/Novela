package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k78  reason: default package */
/* loaded from: classes3.dex */
public interface k78 extends AutoCloseable {
    Object I();

    void R0(Object obj);

    void a();

    @Override // java.lang.AutoCloseable
    default void close() {
        a();
    }
}
