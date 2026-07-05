package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h54  reason: default package */
/* loaded from: classes3.dex */
public final class h54 {
    public final String a;
    public final String b;
    public final long c;

    public h54(long j, String str, String str2) {
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
        if (!(obj instanceof h54)) {
            return false;
        }
        h54 h54Var = (h54) obj;
        if (c16.i(this.a, h54Var.a) && c16.i(this.b, h54Var.b) && this.c == h54Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return hl5.q(nk2.y("ExtensionIcon(id=", this.a, ", icon=", this.b, ", update="), this.c, ")");
    }

    public /* synthetic */ h54(String str) {
        this(0L, str, "");
    }
}
