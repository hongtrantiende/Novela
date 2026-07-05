package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i82  reason: default package */
/* loaded from: classes3.dex */
public final class i82 extends c1 {
    public static final ox9 c = new ox9(20);
    public final String b;

    public i82(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i82) && c16.i(this.b, ((i82) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return s21.p(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
