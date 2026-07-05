package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jt8  reason: default package */
/* loaded from: classes3.dex */
public final class jt8 {
    public final String a;

    public jt8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof jt8) || !this.a.equals(((jt8) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return hl5.n("PendingModeSnapshot(modeId=", this.a, ", maxItems=null)");
    }
}
