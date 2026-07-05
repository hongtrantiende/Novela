package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ala  reason: default package */
/* loaded from: classes3.dex */
public final class ala implements cla {
    public final Throwable a;

    public ala(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ala) || !this.a.equals(((ala) obj).a)) {
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
        return "SignUpFailed(exception=" + this.a + ")";
    }
}
