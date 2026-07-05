package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f4a  reason: default package */
/* loaded from: classes3.dex */
public final class f4a extends vh8 {
    public final String c;
    public final String d;
    public final int e;

    public f4a(String str, String str2, int i) {
        super(a82.j(i, "section_"), i);
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    @Override // defpackage.vh8
    public final int a() {
        return this.e * 100000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4a)) {
            return false;
        }
        f4a f4aVar = (f4a) obj;
        if (c16.i(this.c, f4aVar.c) && c16.i(this.d, f4aVar.d) && this.e == f4aVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.e) + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return rs8.g(this.e, ")", nk2.y("SectionPage(chapterName=", this.c, ", nextChapterName=", this.d, ", chapterIndex="));
    }
}
