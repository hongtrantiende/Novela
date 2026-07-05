package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: np0  reason: default package */
/* loaded from: classes3.dex */
public final class np0 implements lz7 {
    public static final mp0 Companion = new Object();
    public final String a;

    public /* synthetic */ np0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            w92.x(i, 1, lp0.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof np0) && c16.i(this.a, ((np0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("BookMigrateRoute(bookId=", this.a, ")");
    }

    public np0(String str) {
        str.getClass();
        this.a = str;
    }
}
