package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: auc  reason: default package */
/* loaded from: classes3.dex */
public final class auc implements Comparable {
    public final short a;

    public /* synthetic */ auc(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return c16.l(this.a & 65535, ((auc) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof auc) {
            if (this.a != ((auc) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
