package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a9c  reason: default package */
/* loaded from: classes.dex */
public final class a9c {
    public final long a;
    public final vy5 b;
    public final int c;
    public final l8c d;
    public final int e;
    public final int f;
    public final int g;

    public a9c(long j, vy5 vy5Var, int i, l8c l8cVar, int i2, int i3, int i4) {
        this.a = j;
        this.b = vy5Var;
        this.c = i;
        this.d = l8cVar;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a9c) {
                a9c a9cVar = (a9c) obj;
                long j = a9cVar.a;
                int i = qy5.c;
                if (this.a == j && this.b.equals(a9cVar.b) && this.c == a9cVar.c && c16.i(this.d, a9cVar.d) && this.e == a9cVar.e && this.f == a9cVar.f && this.g == a9cVar.g) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = qy5.c;
        int hashCode2 = this.b.hashCode();
        int a = hl5.a(this.c, (hashCode2 + (Long.hashCode(this.a) * 31)) * 31, 31);
        l8c l8cVar = this.d;
        if (l8cVar == null) {
            hashCode = 0;
        } else {
            hashCode = l8cVar.hashCode();
        }
        return Integer.hashCode(this.g) + hl5.a(this.f, hl5.a(this.e, (a + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileSnapshot(coordinate=");
        sb.append((Object) qy5.a(this.a));
        sb.append(", srcRect=");
        sb.append(this.b);
        sb.append(", sampleSize=");
        sb.append(this.c);
        sb.append(", tileImage=");
        sb.append(this.d);
        sb.append(", state=");
        sb.append(this.e);
        sb.append(", from=");
        sb.append(this.f);
        sb.append(", alpha=");
        return hl5.p(sb, this.g, ')');
    }
}
