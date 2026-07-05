package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: tr1  reason: default package */
/* loaded from: classes3.dex */
public final class tr1 implements lz7 {
    public static final sr1 Companion = new Object();
    public final String a;

    public /* synthetic */ tr1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            w92.x(i, 1, rr1.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tr1) && c16.i(this.a, ((tr1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("CommunityDiscussSearchRoute(searchKey=", this.a, ")");
    }

    public tr1(String str) {
        str.getClass();
        this.a = str;
    }
}
