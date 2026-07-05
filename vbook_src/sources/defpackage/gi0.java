package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gi0  reason: default package */
/* loaded from: classes.dex */
public final class gi0 implements xp9 {
    public final w26 a;

    public /* synthetic */ gi0(w26 w26Var) {
        this.a = w26Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gi0) {
            if (!this.a.equals(((gi0) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ")";
    }
}
