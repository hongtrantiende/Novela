package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sq9  reason: default package */
/* loaded from: classes3.dex */
public final class sq9 {
    public final ub6 a;
    public final km9 b;
    public final h6c c;
    public final v13 d;

    public sq9(ub6 ub6Var, km9 km9Var, h6c h6cVar, v13 v13Var) {
        this.a = ub6Var;
        this.b = km9Var;
        this.c = h6cVar;
        this.d = v13Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sq9.class == obj.getClass()) {
                sq9 sq9Var = (sq9) obj;
                if (this.a.equals(sq9Var.a) && this.b.equals(sq9Var.b) && this.c == sq9Var.c && this.d == sq9Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j(this.a.a.hashCode() * 31, 31, this.b.a);
        return this.d.hashCode() + ((this.c.hashCode() + j) * 31);
    }
}
