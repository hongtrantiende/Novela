package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vuc  reason: default package */
/* loaded from: classes.dex */
public final class vuc {
    public final String a;
    public final String b;
    public final int c;

    public vuc(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vuc) {
                vuc vucVar = (vuc) obj;
                if (!this.a.equals(vucVar.a) || !this.b.equals(vucVar.b) || this.c != vucVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.g(this.c, ")", nk2.y("UmdChapter(title=", this.a, ", content=", this.b, ", startOffset="));
    }
}
