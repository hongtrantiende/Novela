package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: to2  reason: default package */
/* loaded from: classes3.dex */
public final class to2 {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final boolean e;

    public to2(int i, long j, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to2)) {
            return false;
        }
        to2 to2Var = (to2) obj;
        if (c16.i(this.a, to2Var.a) && this.b == to2Var.b && c16.i(this.c, to2Var.c) && this.d == to2Var.d && this.e == to2Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + hl5.c(eub.j(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("DbNotification(id=", this.a, ", type=", this.b, ", content=");
        s.append(this.c);
        s.append(", createAt=");
        s.append(this.d);
        s.append(", read=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }
}
