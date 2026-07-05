package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rxb  reason: default package */
/* loaded from: classes3.dex */
public final class rxb {
    public final int a;
    public final int b;
    public final int c;
    public final ps d;

    public rxb(int i, int i2, int i3, ps psVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = psVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxb)) {
            return false;
        }
        rxb rxbVar = (rxb) obj;
        if (this.a == rxbVar.a && this.b == rxbVar.b && this.c == rxbVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "TextSearchContent(chapterIndex=", ", startIndex=", ", endIndex=");
        r.append(this.c);
        r.append(", searchContent=");
        r.append((Object) this.d);
        r.append(")");
        return r.toString();
    }
}
