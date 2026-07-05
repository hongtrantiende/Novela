package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eyb  reason: default package */
/* loaded from: classes3.dex */
public final class eyb {
    public final String a;
    public final String b;

    public eyb(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyb)) {
            return false;
        }
        eyb eybVar = (eyb) obj;
        if (c16.i(this.a, eybVar.a) && c16.i(this.b, eybVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("TextSourceChapterContent(title=", this.a, ", content=", this.b, ")");
    }

    public /* synthetic */ eyb(String str) {
        this("", str);
    }
}
