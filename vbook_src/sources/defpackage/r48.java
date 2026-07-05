package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r48  reason: default package */
/* loaded from: classes.dex */
public final class r48 implements u48 {
    public final String a;
    public final String b;

    public r48(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r48) {
                r48 r48Var = (r48) obj;
                if (!this.a.equals(r48Var.a) || !this.b.equals(r48Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("Broadcast(title=", this.a, ", body=", this.b, ")");
    }
}
