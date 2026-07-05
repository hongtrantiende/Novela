package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fr  reason: default package */
/* loaded from: classes.dex */
public final class fr implements b37 {
    public final rr a;
    public boolean b;

    public fr(rr rrVar) {
        this.a = rrVar;
    }

    @Override // defpackage.b37
    public final int a(u06 u06Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int J = ((w27) list.get(0)).J(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int J2 = ((w27) list.get(i2)).J(i);
                if (J2 > J) {
                    J = J2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return J;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        hm8 hm8Var = this.a.b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            mw8 M = ((w27) list.get(i3)).M(j);
            i = Math.max(i, M.a);
            i2 = Math.max(i2, M.b);
            arrayList.add(M);
        }
        if (e37Var.I0()) {
            this.b = true;
            hm8Var.setValue(new zy5((i2 & 4294967295L) | (i << 32)));
        } else if (!this.b) {
            hm8Var.setValue(new zy5((i2 & 4294967295L) | (i << 32)));
        }
        return e37Var.q0(i, i2, ls3.a, new bi(2, arrayList));
    }

    @Override // defpackage.b37
    public final int f(u06 u06Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int F = ((w27) list.get(0)).F(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int F2 = ((w27) list.get(i2)).F(i);
                if (F2 > F) {
                    F = F2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return F;
    }

    @Override // defpackage.b37
    public final int g(u06 u06Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int j = ((w27) list.get(0)).j(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int j2 = ((w27) list.get(i2)).j(i);
                if (j2 > j) {
                    j = j2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return j;
    }

    @Override // defpackage.b37
    public final int i(u06 u06Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int n0 = ((w27) list.get(0)).n0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int n02 = ((w27) list.get(i2)).n0(i);
                if (n02 > n0) {
                    n0 = n02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return n0;
    }
}
