package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ldd  reason: default package */
/* loaded from: classes.dex */
public interface ldd {
    default gdd a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default gdd b(Class cls, ru7 ru7Var) {
        return a(cls);
    }

    default gdd c(gi1 gi1Var, ru7 ru7Var) {
        return b(nmd.B(gi1Var), ru7Var);
    }
}
