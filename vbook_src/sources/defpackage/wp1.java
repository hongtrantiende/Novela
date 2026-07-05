package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: wp1  reason: default package */
/* loaded from: classes3.dex */
public final class wp1 implements lz7 {
    public static final vp1 Companion = new Object();
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;

    public /* synthetic */ wp1(int i, int i2, int i3, long j, long j2, String str) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = i3;
            if ((i & 4) == 0) {
                this.c = -1L;
            } else {
                this.c = j;
            }
            if ((i & 8) == 0) {
                this.d = -1L;
            } else {
                this.d = j2;
            }
            if ((i & 16) == 0) {
                this.e = "";
                return;
            } else {
                this.e = str;
                return;
            }
        }
        w92.x(i, 3, up1.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp1)) {
            return false;
        }
        wp1 wp1Var = (wp1) obj;
        if (this.a == wp1Var.a && this.b == wp1Var.b && this.c == wp1Var.c && this.d == wp1Var.d && c16.i(this.e, wp1Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + hl5.c(hl5.c(hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "CommentEditorRoute(topicId=", ", category=", ", postId=");
        r.append(this.c);
        rs8.x(r, ", quoteId=", this.d, ", initialContentHtml=");
        return s21.q(r, this.e, ")");
    }

    public wp1(int i, int i2, long j, long j2, String str, int i3) {
        j = (i3 & 4) != 0 ? -1L : j;
        j2 = (i3 & 8) != 0 ? -1L : j2;
        str = (i3 & 16) != 0 ? "" : str;
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = str;
    }
}
