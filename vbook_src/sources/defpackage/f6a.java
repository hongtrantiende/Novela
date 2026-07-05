package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f6a  reason: default package */
/* loaded from: classes.dex */
public final class f6a {
    public final oq9 a;
    public final int b;
    public final long c;

    public f6a(oq9 oq9Var, int i, long j) {
        this.a = oq9Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6a)) {
            return false;
        }
        f6a f6aVar = (f6a) obj;
        if (this.a == f6aVar.a && this.b == f6aVar.b && this.c == f6aVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return hl5.q(sb, this.c, ")");
    }
}
