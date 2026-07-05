package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xn1  reason: default package */
/* loaded from: classes.dex */
public final class xn1 implements b37, bv9 {
    public final jz a;
    public final lk0 b;

    public xn1(jz jzVar, lk0 lk0Var) {
        this.a = jzVar;
        this.b = lk0Var;
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int X0 = u06Var.X0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * X0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            w27 w27Var = (w27) list.get(i5);
            float s = gue.s(gue.r(w27Var));
            if (s == nae.e) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(w27Var.j(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, w27Var.J(min2));
            } else if (s > nae.e) {
                f += s;
            }
        }
        if (f == nae.e) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            w27 w27Var2 = (w27) list.get(i6);
            float s2 = gue.s(gue.r(w27Var2));
            if (s2 > nae.e) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * s2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, w27Var2.J(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.bv9
    public final void b(int i, int[] iArr, int[] iArr2, e37 e37Var) {
        this.a.k(e37Var, i, iArr, iArr2);
    }

    @Override // defpackage.bv9
    public final long c(int i, int i2, int i3, boolean z) {
        if (!z) {
            return y02.a(0, i3, i, i2);
        }
        return ak0.q(0, i3, i, i2);
    }

    @Override // defpackage.bv9
    public final c37 d(mw8[] mw8VarArr, e37 e37Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return e37Var.q0(i3, i2, ls3.a, new gu0(mw8VarArr, this, i3, i, e37Var, iArr));
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        return iue.Q(this, x02.j(j), x02.k(j), x02.h(j), x02.i(j), e37Var.X0(this.a.b()), e37Var, list, new mw8[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xn1) {
                xn1 xn1Var = (xn1) obj;
                if (!this.a.equals(xn1Var.a) || !this.b.equals(xn1Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.b37
    public final int f(u06 u06Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int X0 = u06Var.X0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * X0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            w27 w27Var = (w27) list.get(i5);
            float s = gue.s(gue.r(w27Var));
            if (s == nae.e) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(w27Var.j(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, w27Var.F(min2));
            } else if (s > nae.e) {
                f += s;
            }
        }
        if (f == nae.e) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            w27 w27Var2 = (w27) list.get(i6);
            float s2 = gue.s(gue.r(w27Var2));
            if (s2 > nae.e) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * s2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, w27Var2.F(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
        int X0 = u06Var.X0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            w27 w27Var = (w27) list.get(i4);
            float s = gue.s(gue.r(w27Var));
            int j = w27Var.j(i);
            if (s == nae.e) {
                i3 += j;
            } else if (s > nae.e) {
                f += s;
                i2 = Math.max(i2, Math.round(j / s));
            }
        }
        return ((list.size() - 1) * X0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.bv9
    public final int h(mw8 mw8Var) {
        return mw8Var.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
        int X0 = u06Var.X0(this.a.b());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            w27 w27Var = (w27) list.get(i4);
            float s = gue.s(gue.r(w27Var));
            int n0 = w27Var.n0(i);
            if (s == nae.e) {
                i3 += n0;
            } else if (s > nae.e) {
                f += s;
                i2 = Math.max(i2, Math.round(n0 / s));
            }
        }
        return ((list.size() - 1) * X0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.bv9
    public final int j(mw8 mw8Var) {
        return mw8Var.b;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
