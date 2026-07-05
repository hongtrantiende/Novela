package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lx1  reason: default package */
/* loaded from: classes.dex */
public final class lx1 implements f9a {
    public final mm9 a;
    public long b;

    public lx1(List list, List list2) {
        boolean z;
        ls5 i = qs5.i();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        for (int i2 = 0; i2 < list.size(); i2++) {
            i.b(new kx1((f9a) list.get(i2), (List) list2.get(i2)));
        }
        this.a = i.g();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.f9a
    public final long g() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            mm9 mm9Var = this.a;
            if (i >= mm9Var.d) {
                break;
            }
            long g = ((kx1) mm9Var.get(i)).a.g();
            if (g != Long.MIN_VALUE) {
                j = Math.min(j, g);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.f9a
    public final boolean n() {
        int i = 0;
        while (true) {
            mm9 mm9Var = this.a;
            if (i >= mm9Var.d) {
                return false;
            }
            if (((kx1) mm9Var.get(i)).a.n()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long g = g();
            if (g == Long.MIN_VALUE) {
                return z3;
            }
            int i = 0;
            z = false;
            while (true) {
                mm9 mm9Var = this.a;
                if (i < mm9Var.d) {
                    long g2 = ((kx1) mm9Var.get(i)).a.g();
                    if (g2 != Long.MIN_VALUE && g2 <= vs6Var.a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (g2 == g || z2) {
                        z |= ((kx1) mm9Var.get(i)).a.t(vs6Var);
                    }
                    i++;
                } else {
                    z3 |= z;
                }
            }
        } while (z);
        return z3;
    }

    @Override // defpackage.f9a
    public final long u() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            mm9 mm9Var = this.a;
            if (i >= mm9Var.d) {
                break;
            }
            kx1 kx1Var = (kx1) mm9Var.get(i);
            long u = kx1Var.a.u();
            qs5 qs5Var = kx1Var.b;
            if ((qs5Var.contains(1) || qs5Var.contains(2) || qs5Var.contains(4)) && u != Long.MIN_VALUE) {
                j = Math.min(j, u);
            }
            if (u != Long.MIN_VALUE) {
                j2 = Math.min(j2, u);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        } else if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.b;
            if (j3 != -9223372036854775807L) {
                return j3;
            }
            return j2;
        }
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        int i = 0;
        while (true) {
            mm9 mm9Var = this.a;
            if (i < mm9Var.d) {
                ((kx1) mm9Var.get(i)).x(j);
                i++;
            } else {
                return;
            }
        }
    }
}
