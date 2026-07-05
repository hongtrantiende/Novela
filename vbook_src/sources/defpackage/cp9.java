package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cp9  reason: default package */
/* loaded from: classes3.dex */
public final class cp9 {
    public final long a;
    public final f33 b;

    public cp9(long j, f33 f33Var) {
        this.a = j;
        this.b = f33Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cp9) {
                cp9 cp9Var = (cp9) obj;
                if (this.a != cp9Var.a || !this.b.equals(cp9Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ReplyTarget(postId=" + this.a + ", quote=" + this.b + ")";
    }
}
