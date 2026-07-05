package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iq5  reason: default package */
/* loaded from: classes3.dex */
public final class iq5 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public iq5(String str, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iq5) {
                iq5 iq5Var = (iq5) obj;
                if (!this.a.equals(iq5Var.a) || this.b != iq5Var.b || this.c != iq5Var.c || this.d != iq5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.k(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ImageSourceInfo(name=" + this.a + ", isSupportDownload=" + this.b + ", isSupportCheckNewChapter=" + this.c + ", isSupportShowChapterName=" + this.d + ")";
    }
}
