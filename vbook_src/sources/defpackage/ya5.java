package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ya5  reason: default package */
/* loaded from: classes.dex */
public final class ya5 extends ote {
    public final int c;

    public ya5(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ya5) && this.c == ((ya5) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + hl5.a(this.c, Integer.hashCode(4000000) * 31, 31);
    }

    public final String toString() {
        return hl5.l("InputLimitExceeded(limit=4000000, actual=", ", charOffset=0)", this.c);
    }
}
