package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hu0  reason: default package */
/* loaded from: classes.dex */
public final class hu0 implements b37 {
    public final dc a;
    public final boolean b;

    public hu0(dc dcVar, boolean z) {
        this.a = dcVar;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [xl9, java.lang.Object] */
    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        long j2;
        int i;
        int i2;
        bu0 bu0Var;
        boolean z;
        bu0 bu0Var2;
        boolean z2;
        boolean z3;
        int k;
        int j3;
        boolean z4;
        mw8 M;
        boolean isEmpty = list.isEmpty();
        ls3 ls3Var = ls3.a;
        if (isEmpty) {
            return e37Var.q0(x02.k(j), x02.j(j), ls3Var, new oi5(8));
        }
        if (this.b) {
            j2 = j;
        } else {
            j2 = j & (-8589934589L);
        }
        bu0 bu0Var3 = null;
        boolean z5 = true;
        if (list.size() == 1) {
            w27 w27Var = (w27) list.get(0);
            Object S = w27Var.S();
            if (S instanceof bu0) {
                bu0Var3 = (bu0) S;
            }
            if (bu0Var3 != null) {
                z3 = bu0Var3.L;
            } else {
                z3 = false;
            }
            if (!z3) {
                M = w27Var.M(j2);
                k = Math.max(x02.k(j), M.a);
                j3 = Math.max(x02.j(j), M.b);
            } else {
                k = x02.k(j);
                j3 = x02.j(j);
                int k2 = x02.k(j);
                int j4 = x02.j(j);
                if (k2 >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (j4 < 0) {
                    z5 = false;
                }
                if (!(z5 & z4)) {
                    nv5.a("width and height must be >= 0");
                }
                M = w27Var.M(y02.h(k2, k2, j4, j4));
            }
            int i3 = j3;
            int i4 = k;
            return e37Var.q0(i4, i3, ls3Var, new gu0(M, w27Var, e37Var, i4, i3, this));
        }
        mw8[] mw8VarArr = new mw8[list.size()];
        ?? obj = new Object();
        obj.a = x02.k(j);
        ?? obj2 = new Object();
        obj2.a = x02.j(j);
        int size = list.size();
        boolean z6 = false;
        for (int i5 = 0; i5 < size; i5++) {
            w27 w27Var2 = (w27) list.get(i5);
            Object S2 = w27Var2.S();
            if (S2 instanceof bu0) {
                bu0Var2 = (bu0) S2;
            } else {
                bu0Var2 = null;
            }
            if (bu0Var2 != null) {
                z2 = bu0Var2.L;
            } else {
                z2 = false;
            }
            if (!z2) {
                mw8 M2 = w27Var2.M(j2);
                mw8VarArr[i5] = M2;
                obj.a = Math.max(obj.a, M2.a);
                obj2.a = Math.max(obj2.a, M2.b);
            } else {
                z6 = true;
            }
        }
        if (z6) {
            int i6 = obj.a;
            if (i6 != Integer.MAX_VALUE) {
                i = i6;
            } else {
                i = 0;
            }
            int i7 = obj2.a;
            if (i7 != Integer.MAX_VALUE) {
                i2 = i7;
            } else {
                i2 = 0;
            }
            long a = y02.a(i, i6, i2, i7);
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                w27 w27Var3 = (w27) list.get(i8);
                Object S3 = w27Var3.S();
                if (S3 instanceof bu0) {
                    bu0Var = (bu0) S3;
                } else {
                    bu0Var = null;
                }
                if (bu0Var != null) {
                    z = bu0Var.L;
                } else {
                    z = false;
                }
                if (z) {
                    mw8VarArr[i8] = w27Var3.M(a);
                }
            }
        }
        return e37Var.q0(obj.a, obj2.a, ls3Var, new hm0(mw8VarArr, list, e37Var, obj, obj2, this, 2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hu0) {
                hu0 hu0Var = (hu0) obj;
                if (!c16.i(this.a, hu0Var.a) || this.b != hu0Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
