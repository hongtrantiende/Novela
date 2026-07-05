package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u7c  reason: default package */
/* loaded from: classes.dex */
public final class u7c {
    public static final u7c a = new Object();

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof u7c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(8L) + (Long.hashCode(200L) * 31);
    }

    public final String toString() {
        return "TileAnimationSpec(duration=200, interval=8)";
    }
}
