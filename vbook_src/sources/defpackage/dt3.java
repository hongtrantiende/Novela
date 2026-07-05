package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dt3  reason: default package */
/* loaded from: classes3.dex */
public final class dt3 extends wh8 {
    public final int d;

    public dt3(int i) {
        super("end", "", i);
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dt3) && this.d == ((dt3) obj).d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final String toString() {
        return hl5.l("EndPage(chapterIndex=", ")", this.d);
    }
}
