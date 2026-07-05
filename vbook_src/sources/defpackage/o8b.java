package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o8b  reason: default package */
/* loaded from: classes.dex */
public interface o8b {
    default x7b f(byte[] bArr, int i, int i2) {
        ls5 i3 = qs5.i();
        k(bArr, 0, i2, n8b.c, new d89(i3, 8));
        return new xd2(i3.g());
    }

    void k(byte[] bArr, int i, int i2, n8b n8bVar, h12 h12Var);

    int m();

    default void reset() {
    }
}
