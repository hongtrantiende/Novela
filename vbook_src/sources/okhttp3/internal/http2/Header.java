package okhttp3.internal.http2;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Header {
    public static final e31 d;
    public static final e31 e;
    public static final e31 f;
    public static final e31 g;
    public static final e31 h;
    public static final e31 i;
    public final e31 a;
    public final e31 b;
    public final int c;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        e31 e31Var = e31.d;
        d = p40.o(":");
        e = p40.o(":status");
        f = p40.o(":method");
        g = p40.o(":path");
        h = p40.o(":scheme");
        i = p40.o(":authority");
    }

    public Header(e31 e31Var, e31 e31Var2) {
        e31Var.getClass();
        e31Var2.getClass();
        this.a = e31Var;
        this.b = e31Var2;
        this.c = e31Var2.e() + e31Var.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (c16.i(this.a, header.a) && c16.i(this.b, header.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.t() + ": " + this.b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(p40.o(str), p40.o(str2));
        e31 e31Var = e31.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(e31 e31Var, String str) {
        this(e31Var, p40.o(str));
        e31Var.getClass();
        str.getClass();
        e31 e31Var2 = e31.d;
    }
}
