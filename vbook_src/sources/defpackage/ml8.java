package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ml8  reason: default package */
/* loaded from: classes.dex */
public final class ml8 {
    public final wj a;
    public final int b;
    public final int c;

    public ml8(wj wjVar, int i, int i2) {
        this.a = wjVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ml8) {
                ml8 ml8Var = (ml8) obj;
                if (this.a == ml8Var.a && this.b == ml8Var.b && this.c == ml8Var.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return rs8.g(this.c, ")", sb);
    }
}
