package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gc0  reason: default package */
/* loaded from: classes.dex */
public final class gc0 extends oa2 {
    public final String a;

    public gc0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oa2) {
            return this.a.equals(((gc0) ((oa2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s21.q(new StringBuilder("User{identifier="), this.a, "}");
    }
}
