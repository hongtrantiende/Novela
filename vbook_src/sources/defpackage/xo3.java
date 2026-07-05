package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xo3  reason: default package */
/* loaded from: classes3.dex */
public final class xo3 {
    public final String a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final ofb j;

    public xo3(String str, boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, ofb ofbVar) {
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = ofbVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xo3) {
                xo3 xo3Var = (xo3) obj;
                if (!this.a.equals(xo3Var.a) || this.b != xo3Var.b || this.c != xo3Var.c || this.d != xo3Var.d || this.e != xo3Var.e || this.f != xo3Var.f || this.g != xo3Var.g || this.h != xo3Var.h || this.i != xo3Var.i || !this.j.equals(xo3Var.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.j.hashCode() + hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(hl5.c(eub.k(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditorTheme(name=");
        sb.append(this.a);
        sb.append(", dark=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        rs8.x(sb, ", foreground=", this.d, ", currentLineBackground=");
        sb.append(this.e);
        rs8.x(sb, ", selection=", this.f, ", lineNumber=");
        sb.append(this.g);
        rs8.x(sb, ", lineNumberActive=", this.h, ", gutter=");
        sb.append(this.i);
        sb.append(", syntax=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
