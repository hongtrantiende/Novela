package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nb5  reason: default package */
/* loaded from: classes.dex */
public final class nb5 {
    public final String a;

    public nb5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof nb5) || !this.a.equals(((nb5) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (lh9.c.hashCode() * 31);
    }

    public final String toString() {
        lh9 lh9Var = lh9.c;
        return "GroupMatch(encoder=" + lh9Var + ", key=" + ((Object) this.a) + ")";
    }
}
