package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: on2  reason: default package */
/* loaded from: classes3.dex */
public final class on2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public on2(long j, String str, String str2, String str3) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on2)) {
            return false;
        }
        on2 on2Var = (on2) obj;
        if (c16.i(this.a, on2Var.a) && c16.i(this.b, on2Var.b) && c16.i(this.c, on2Var.c) && this.d == on2Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbEmoji(id=", this.a, ", category=", this.b, ", url=");
        y.append(this.c);
        y.append(", lastUse=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
