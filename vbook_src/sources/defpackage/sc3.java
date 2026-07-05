package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc3  reason: default package */
/* loaded from: classes.dex */
public final class sc3 {
    public gu3 a;
    public final Charset b;
    public boolean c;
    public final boolean d;
    public int e;
    public final int f;
    public rc3 g;

    public sc3(gu3 gu3Var, Charset charset, boolean z, boolean z2, int i, int i2, rc3 rc3Var) {
        gu3Var.getClass();
        charset.getClass();
        rc3Var.getClass();
        this.a = gu3Var;
        this.b = charset;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = rc3Var;
    }

    /* renamed from: a */
    public final sc3 clone() {
        gu3 gu3Var = this.a;
        boolean z = this.c;
        int i = this.e;
        rc3 rc3Var = this.g;
        gu3Var.getClass();
        Charset charset = this.b;
        charset.getClass();
        rc3Var.getClass();
        return new sc3(gu3Var, charset, z, this.d, i, this.f, rc3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc3)) {
            return false;
        }
        sc3 sc3Var = (sc3) obj;
        if (this.a == sc3Var.a && c16.i(this.b, sc3Var.b) && this.c == sc3Var.c && this.d == sc3Var.d && this.e == sc3Var.e && this.f == sc3Var.f && this.g == sc3Var.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + hl5.a(this.f, hl5.a(this.e, eub.k(eub.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        gu3 gu3Var = this.a;
        boolean z = this.c;
        int i = this.e;
        rc3 rc3Var = this.g;
        StringBuilder sb = new StringBuilder("OutputSettings(escapeMode=");
        sb.append(gu3Var);
        sb.append(", charset=");
        sb.append(this.b);
        sb.append(", prettyPrint=");
        rs8.z(sb, z, ", outline=", this.d, ", indentAmount=");
        rs8.q(i, this.f, ", maxPaddingWidth=", ", syntax=", sb);
        sb.append(rc3Var);
        sb.append(")");
        return sb.toString();
    }

    public sc3() {
        this(gu3.base, (Charset) dd1.a.getValue(), true, false, 1, 30, rc3.a);
    }
}
