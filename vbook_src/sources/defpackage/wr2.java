package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wr2  reason: default package */
/* loaded from: classes3.dex */
public final class wr2 implements xr2 {
    public final String a;

    public wr2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof wr2) || !this.a.equals(((wr2) obj).a)) {
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
        return hl5.n("ShowInstallSource(url=", this.a, ")");
    }
}
