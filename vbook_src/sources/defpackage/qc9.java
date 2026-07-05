package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qc9  reason: default package */
/* loaded from: classes3.dex */
public final class qc9 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public qc9(long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc9)) {
            return false;
        }
        qc9 qc9Var = (qc9) obj;
        if (c16.i(this.a, qc9Var.a) && c16.i(this.b, qc9Var.b) && this.c == qc9Var.c && this.d == qc9Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("QtNameSkip(id=", this.a, ", word=", this.b, ", createAt=");
        y.append(this.c);
        return a82.n(y, ", updateAt=", this.d, ")");
    }
}
