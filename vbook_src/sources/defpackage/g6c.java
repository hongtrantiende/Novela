package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g6c  reason: default package */
/* loaded from: classes3.dex */
public final class g6c {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public g6c(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6c)) {
            return false;
        }
        g6c g6cVar = (g6c) obj;
        if (this.a == g6cVar.a && this.b == g6cVar.b && this.c == g6cVar.c && this.d == g6cVar.d && this.e == g6cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eub.k(eub.k(eub.k(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeOptionState(darkTheme=");
        sb.append(this.a);
        sb.append(", useAmoledTheme=");
        sb.append(this.b);
        sb.append(", useEInkTheme=");
        rs8.z(sb, this.c, ", useLiquidGlass=", this.d, ", useSystemColor=");
        return rs8.m(")", sb, this.e);
    }
}
