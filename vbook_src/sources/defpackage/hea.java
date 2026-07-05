package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hea  reason: default package */
/* loaded from: classes3.dex */
public final class hea {
    public static final hea d = new hea(1.0f, 0, 0);
    public final long a;
    public final float b;
    public final long c;

    public hea(float f, long j, long j2) {
        this.a = j;
        this.b = f;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hea) {
                hea heaVar = (hea) obj;
                if (!zy5.b(this.a, heaVar.a) || Float.compare(this.b, heaVar.b) != 0 || !zy5.b(this.c, heaVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + nk2.d(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String c = zy5.c(this.a);
        String c2 = zy5.c(this.c);
        StringBuilder sb = new StringBuilder("SettleBaseline(pageSize=");
        sb.append(c);
        sb.append(", zoom=");
        sb.append(this.b);
        sb.append(", viewportSize=");
        return s21.q(sb, c2, ")");
    }
}
