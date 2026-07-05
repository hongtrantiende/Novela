package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v95  reason: default package */
/* loaded from: classes.dex */
public final class v95 implements dd6 {
    public final zsb a;
    public final int b;
    public final ikc c;
    public final vt4 d;

    public v95(zsb zsbVar, int i, ikc ikcVar, vt4 vt4Var) {
        this.a = zsbVar;
        this.b = i;
        this.c = ikcVar;
        this.d = vt4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v95) {
                v95 v95Var = (v95) obj;
                if (this.a == v95Var.a && this.b == v95Var.b && this.c.equals(v95Var.c) && c16.i(this.d, v95Var.d)) {
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
        long j2;
        if (w27Var.J(x02.h(j)) < x02.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = x02.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        mw8 M = w27Var.M(j);
        int min = Math.min(M.a, x02.i(j2));
        return e37Var.q0(min, M.b, ls3.a, new gt0(this, e37Var, M, min, 2));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
