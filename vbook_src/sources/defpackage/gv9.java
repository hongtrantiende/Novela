package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gv9  reason: default package */
/* loaded from: classes.dex */
public final class gv9 implements b37, bv9 {
    public final fz a;
    public final mk0 b;

    public gv9(fz fzVar, mk0 mk0Var) {
        this.a = fzVar;
        this.b = mk0Var;
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
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
            int J = w27Var.J(i);
            if (s == nae.e) {
                i3 += J;
            } else if (s > nae.e) {
                f += s;
                i2 = Math.max(i2, Math.round(J / s));
            }
        }
        return ((list.size() - 1) * X0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.bv9
    public final void b(int i, int[] iArr, int[] iArr2, e37 e37Var) {
        this.a.f(e37Var, i, iArr, e37Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.bv9
    public final long c(int i, int i2, int i3, boolean z) {
        if (!z) {
            return y02.a(i, i2, 0, i3);
        }
        return ak0.r(i, i2, 0, i3);
    }

    @Override // defpackage.bv9
    public final c37 d(mw8[] mw8VarArr, e37 e37Var, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return e37Var.q0(i2, i3, ls3.a, new fv9(mw8VarArr, this, i3, i, iArr));
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        return iue.Q(this, x02.k(j), x02.j(j), x02.i(j), x02.h(j), e37Var.X0(this.a.b()), e37Var, list, new mw8[list.size()], 0, list.size(), null, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gv9) {
                gv9 gv9Var = (gv9) obj;
                if (!this.a.equals(gv9Var.a) || !c16.i(this.b, gv9Var.b)) {
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
            int F = w27Var.F(i);
            if (s == nae.e) {
                i3 += F;
            } else if (s > nae.e) {
                f += s;
                i2 = Math.max(i2, Math.round(F / s));
            }
        }
        return ((list.size() - 1) * X0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
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
                int min2 = Math.min(w27Var.J(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, w27Var.j(min2));
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
                i4 = Math.max(i4, w27Var2.j(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.bv9
    public final int h(mw8 mw8Var) {
        return mw8Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
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
                int min2 = Math.min(w27Var.J(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, w27Var.n0(min2));
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
                i4 = Math.max(i4, w27Var2.n0(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.bv9
    public final int j(mw8 mw8Var) {
        return mw8Var.a;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
