package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc2  reason: default package */
/* loaded from: classes.dex */
public final class uc2 implements vc2 {
    public final nl5 a;

    public uc2(nl5 nl5Var) {
        this.a = nl5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uc2) || !this.a.equals(((uc2) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(bitmap=" + this.a + ")";
    }
}
