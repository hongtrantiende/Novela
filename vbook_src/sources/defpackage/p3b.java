package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p3b  reason: default package */
/* loaded from: classes.dex */
public final class p3b implements ls {
    public final String a;

    public /* synthetic */ p3b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p3b) {
            if (!c16.i(this.a, ((p3b) obj).a)) {
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
        return hl5.n("StringAnnotation(value=", this.a, ")");
    }
}
