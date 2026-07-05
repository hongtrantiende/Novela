package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qkc  reason: default package */
/* loaded from: classes.dex */
public interface qkc {
    default boolean c(Enum r2, Enum r3) {
        if (r2.equals(d()) && r3.equals(f())) {
            return true;
        }
        return false;
    }

    Object d();

    Object f();
}
