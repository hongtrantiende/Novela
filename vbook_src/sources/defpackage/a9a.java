package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a9a  reason: default package */
/* loaded from: classes.dex */
public final class a9a extends vye {
    public final int i;

    public a9a(int i) {
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a9a) && this.i == ((a9a) obj).i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i);
    }

    public final String toString() {
        return hl5.l("RestoreSentinel(zwspIndex=", ")", this.i);
    }
}
