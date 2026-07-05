package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b34  reason: default package */
/* loaded from: classes3.dex */
public final class b34 {
    public static final cne g = new cne(24);
    public final y24 a;
    public final int b;
    public final int c;
    public final z24 d;
    public final String e;
    public final String f;

    public b34(y24 y24Var, int i, int i2, z24 z24Var, String str, String str2) {
        str.getClass();
        this.a = y24Var;
        this.b = i;
        this.c = i2;
        this.d = z24Var;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b34)) {
            return false;
        }
        b34 b34Var = (b34) obj;
        if (this.a == b34Var.a && this.b == b34Var.b && this.c == b34Var.c && this.d == b34Var.d && c16.i(this.e, b34Var.e) && c16.i(this.f, b34Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + eub.j((this.d.hashCode() + hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExportState(phase=");
        sb.append(this.a);
        sb.append(", current=");
        sb.append(this.b);
        sb.append(", total=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", message=");
        return nk2.w(sb, this.e, ", filePath=", this.f, ")");
    }

    public /* synthetic */ b34(y24 y24Var, int i, int i2, z24 z24Var, String str, int i3) {
        this(y24Var, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, z24Var, str, "");
    }
}
