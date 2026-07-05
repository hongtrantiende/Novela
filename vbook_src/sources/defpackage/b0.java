package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b0  reason: default package */
/* loaded from: classes.dex */
public final class b0 extends se8 {
    public static final b0 a = new Object();

    @Override // defpackage.se8
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.se8
    public final boolean b() {
        return false;
    }

    @Override // defpackage.se8
    public final Object c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
