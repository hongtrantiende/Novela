package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sxa  reason: default package */
/* loaded from: classes3.dex */
public final class sxa {
    public final long a;
    public final gsc b;
    public final String c;
    public final long d;

    public sxa(gsc gscVar, String str, long j) {
        gscVar.getClass();
        str.getClass();
        this.a = by5.a.k().b() + j;
        this.b = gscVar;
        this.c = str;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sxa) {
                sxa sxaVar = (sxa) obj;
                if (this.b != sxaVar.b || !c16.i(this.c, sxaVar.c) || this.d != sxaVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + eub.j(this.b.hashCode() * 31, 923521, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Normal(type=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=null, actionTitle=null, action=null, duration=");
        return hl5.q(sb, this.d, ")");
    }
}
