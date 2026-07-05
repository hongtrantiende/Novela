package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: u85  reason: default package */
/* loaded from: classes3.dex */
public final class u85 implements lz7 {
    public static final t85 Companion = new Object();
    public final String a;

    public /* synthetic */ u85(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            w92.x(i, 1, s85.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u85) && c16.i(this.a, ((u85) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("HomeSearchRoute(keyword=", this.a, ")");
    }

    public u85(String str) {
        str.getClass();
        this.a = str;
    }
}
