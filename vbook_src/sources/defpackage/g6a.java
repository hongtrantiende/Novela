package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g6a  reason: default package */
/* loaded from: classes.dex */
public final class g6a {
    public final f6a a;
    public final f6a b;
    public final boolean c;

    public g6a(f6a f6aVar, f6a f6aVar2, boolean z) {
        this.a = f6aVar;
        this.b = f6aVar2;
        this.c = z;
    }

    public static g6a a(g6a g6aVar, f6a f6aVar, f6a f6aVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            f6aVar = g6aVar.a;
        }
        if ((i & 2) != 0) {
            f6aVar2 = g6aVar.b;
        }
        if ((i & 4) != 0) {
            z = g6aVar.c;
        }
        g6aVar.getClass();
        return new g6a(f6aVar, f6aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6a)) {
            return false;
        }
        g6a g6aVar = (g6a) obj;
        if (c16.i(this.a, g6aVar.a) && c16.i(this.b, g6aVar.b) && this.c == g6aVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return rs8.m(")", sb, this.c);
    }
}
