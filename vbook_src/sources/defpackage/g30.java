package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g30  reason: default package */
/* loaded from: classes3.dex */
public final class g30 {
    public final rf a;

    public g30(rf rfVar) {
        this.a = rfVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof g30) || !c16.i(this.a, ((g30) obj).a)) {
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
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
