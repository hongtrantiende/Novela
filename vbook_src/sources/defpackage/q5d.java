package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q5d  reason: default package */
/* loaded from: classes.dex */
public final class q5d implements dd6 {
    public final zsb a;
    public final int b;
    public final ikc c;
    public final vt4 d;

    public q5d(zsb zsbVar, int i, ikc ikcVar, vt4 vt4Var) {
        this.a = zsbVar;
        this.b = i;
        this.c = ikcVar;
        this.d = vt4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q5d) {
                q5d q5dVar = (q5d) obj;
                if (this.a == q5dVar.a && this.b == q5dVar.b && this.c.equals(q5dVar.c) && c16.i(this.d, q5dVar.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = hl5.a(this.b, this.a.hashCode() * 31, 31);
        return this.d.hashCode() + ((this.c.hashCode() + a) * 31);
    }

    @Override // defpackage.dd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(x02.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(M.b, x02.h(j));
        return e37Var.q0(M.a, min, ls3.a, new in2(this, M, min));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
