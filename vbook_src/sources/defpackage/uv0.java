package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uv0  reason: default package */
/* loaded from: classes3.dex */
public final class uv0 {
    public final String a;
    public final String b;
    public final long c;

    public uv0(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        if (c16.i(this.a, uv0Var.a) && c16.i(this.b, uv0Var.b) && this.c == uv0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hl5.q(nk2.y("BrowserHistory(title=", this.a, ", url=", this.b, ", createAt="), this.c, ")");
    }
}
