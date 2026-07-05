package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: et3  reason: default package */
/* loaded from: classes3.dex */
public final class et3 extends vh8 {
    public final int c;

    public et3(int i) {
        super("end", i);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof et3) && this.c == ((et3) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return hl5.l("EndPage(chapterIndex=", ")", this.c);
    }
}
