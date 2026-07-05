package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z6a  reason: default package */
/* loaded from: classes.dex */
public final class z6a {
    public final h35 a;
    public final long b;
    public final y6a c;
    public final boolean d;

    public z6a(h35 h35Var, long j, y6a y6aVar, boolean z) {
        this.a = h35Var;
        this.b = j;
        this.c = y6aVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z6a) {
                z6a z6aVar = (z6a) obj;
                if (this.a != z6aVar.a || !y78.d(this.b, z6aVar.b) || this.c != z6aVar.c || this.d != z6aVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = hl5.c(this.a.hashCode() * 31, this.b, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + c) * 31);
    }

    public final String toString() {
        String l = y78.l(this.b);
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + l + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
