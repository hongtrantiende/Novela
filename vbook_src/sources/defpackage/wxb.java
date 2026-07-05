package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wxb  reason: default package */
/* loaded from: classes.dex */
public final class wxb {
    public final long a;
    public final long b;

    public wxb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxb)) {
            return false;
        }
        wxb wxbVar = (wxb) obj;
        if (zl1.c(this.a, wxbVar.a) && zl1.c(this.b, wxbVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hl5.o("SelectionColors(selectionHandleColor=", zl1.i(this.a), ", selectionBackgroundColor=", zl1.i(this.b), ")");
    }
}
