package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lq4  reason: default package */
/* loaded from: classes3.dex */
public final class lq4 implements nq4 {
    public final String a;

    public lq4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof lq4) || !this.a.equals(((lq4) obj).a)) {
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
        return hl5.n("ForgotPassFailed(message=", this.a, ")");
    }
}
