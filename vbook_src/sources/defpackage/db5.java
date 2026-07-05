package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: db5  reason: default package */
/* loaded from: classes.dex */
public final class db5 extends ote {
    public final String c;
    public final int d;

    public db5(String str, int i) {
        str.getClass();
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db5)) {
            return false;
        }
        db5 db5Var = (db5) obj;
        if (c16.i(this.c, db5Var.c) && this.d == db5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return s21.k("UnknownTag(tag=", this.d, this.c, ", charOffset=", ")");
    }
}
