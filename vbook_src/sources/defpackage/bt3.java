package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bt3  reason: default package */
/* loaded from: classes.dex */
public final class bt3 {
    public final String a;

    public bt3(String str) {
        if (str != null) {
            this.a = str;
        } else {
            xk5.k("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt3)) {
            return false;
        }
        return this.a.equals(((bt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s21.q(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
