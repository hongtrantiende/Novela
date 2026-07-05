package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i7b  reason: default package */
/* loaded from: classes.dex */
public final class i7b implements j7b {
    public final g7b a;

    public i7b(g7b g7bVar) {
        this.a = g7bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof i7b) || !this.a.equals(((i7b) obj).a)) {
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
        return "Success(subsamplingImage=" + this.a + ')';
    }
}
