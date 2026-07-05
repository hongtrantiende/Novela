package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: va5  reason: default package */
/* loaded from: classes.dex */
public final class va5 extends ote {
    public final String c;
    public final String d;
    public final int e;

    public va5(String str, String str2, int i) {
        str2.getClass();
        this.c = str;
        this.d = str2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va5)) {
            return false;
        }
        va5 va5Var = (va5) obj;
        if (c16.i(this.c, va5Var.c) && c16.i(this.d, va5Var.d) && this.e == va5Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.e) + eub.j(hashCode * 31, 31, this.d);
    }

    public final String toString() {
        return rs8.g(this.e, ")", nk2.y("DecoderException(tag=", this.c, ", message=", this.d, ", charOffset="));
    }
}
