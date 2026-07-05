package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jqd  reason: default package */
/* loaded from: classes.dex */
public final class jqd {
    public final long a;
    public final int b;

    public jqd(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqd)) {
            return false;
        }
        jqd jqdVar = (jqd) obj;
        if (this.a == jqdVar.a && this.b == jqdVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ZipSizeInfo(totalUncompressed=" + this.a + ", entryCount=" + this.b + ")";
    }
}
