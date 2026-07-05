package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cb5  reason: default package */
/* loaded from: classes3.dex */
public final class cb5 extends ote {
    public final String c;
    public final int d;

    public cb5(String str, int i) {
        str.getClass();
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb5)) {
            return false;
        }
        cb5 cb5Var = (cb5) obj;
        if (c16.i(this.c, cb5Var.c) && this.d == cb5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return s21.k("UnclosedTag(tag=", this.d, this.c, ", charOffset=", ")");
    }
}
