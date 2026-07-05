package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d6c  reason: default package */
/* loaded from: classes3.dex */
public final class d6c {
    public final long a;
    public final mv b;

    public d6c(long j, mv mvVar) {
        this.a = j;
        this.b = mvVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d6c) {
                d6c d6cVar = (d6c) obj;
                if (!zl1.c(this.a, d6cVar.a) || this.b != d6cVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = zl1.j;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String i = zl1.i(this.a);
        return "ThemeColorState(primaryColor=" + i + ", background=" + this.b + ")";
    }
}
