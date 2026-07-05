package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kt6  reason: default package */
/* loaded from: classes3.dex */
public final class kt6 {
    public final String a;
    public final long b;

    public kt6(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt6)) {
            return false;
        }
        kt6 kt6Var = (kt6) obj;
        if (c16.i(this.a, kt6Var.a) && this.b == kt6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalChapter(pathId=" + this.a + ", lastRead=" + this.b + ")";
    }
}
