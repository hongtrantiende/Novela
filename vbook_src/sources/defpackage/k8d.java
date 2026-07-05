package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k8d  reason: default package */
/* loaded from: classes3.dex */
public final class k8d implements n8d {
    public final int a;

    public k8d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k8d) && this.a == ((k8d) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("CheckNewEpisodeSuccess(newEpisode=", ")", this.a);
    }
}
