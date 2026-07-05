package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: fi9  reason: default package */
/* loaded from: classes3.dex */
public final class fi9 implements lz7 {
    public static final ei9 Companion = new Object();
    public final String a;

    public /* synthetic */ fi9(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            w92.x(i, 1, di9.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fi9) && c16.i(this.a, ((fi9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("ReaderQtPrivNameRoute(bookId=", this.a, ")");
    }

    public fi9(String str) {
        str.getClass();
        this.a = str;
    }
}
