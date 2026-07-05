package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zb0  reason: default package */
/* loaded from: classes.dex */
public final class zb0 extends ia2 {
    public final String a;

    public zb0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ia2) {
            return this.a.equals(((zb0) ((ia2) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return s21.q(new StringBuilder("Log{content="), this.a, "}");
    }
}
