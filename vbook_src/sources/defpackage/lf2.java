package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lf2  reason: default package */
/* loaded from: classes.dex */
public final class lf2 extends aac {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final ff2 i;
    public final f57 j;
    public final b57 k;

    public lf2(long j, long j2, long j3, int i, long j4, long j5, long j6, ff2 ff2Var, f57 f57Var, b57 b57Var) {
        boolean z;
        boolean z2 = ff2Var.d;
        if (b57Var != null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z2 == z);
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = ff2Var;
        this.j = f57Var;
        this.k = b57Var;
    }

    @Override // defpackage.aac
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.e) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override // defpackage.aac
    public final y9c f(int i, y9c y9cVar, boolean z) {
        String str;
        wq9.w(i, h());
        Integer num = null;
        ff2 ff2Var = this.i;
        if (z) {
            str = ff2Var.b(i).a;
        } else {
            str = null;
        }
        if (z) {
            num = Integer.valueOf(this.e + i);
        }
        y9cVar.getClass();
        y9cVar.h(str, num, 0, ff2Var.d(i), a2d.Q(ff2Var.b(i).b - ff2Var.b(0).b) - this.f, c7.c, false);
        return y9cVar;
    }

    @Override // defpackage.aac
    public final int h() {
        return this.i.m.size();
    }

    @Override // defpackage.aac
    public final Object l(int i) {
        wq9.w(i, h());
        return Integer.valueOf(this.e + i);
    }

    @Override // defpackage.aac
    public final z9c m(int i, z9c z9cVar, long j) {
        boolean z;
        long j2;
        long j3;
        boolean z2;
        long j4;
        pf2 d;
        wq9.w(i, 1);
        ff2 ff2Var = this.i;
        boolean z3 = ff2Var.d;
        long j5 = this.h;
        if (z3 && ff2Var.e != -9223372036854775807L && ff2Var.b == -9223372036854775807L) {
            long j6 = 0;
            if (j > 0) {
                j5 += j;
                if (j5 > this.g) {
                    z = true;
                    j3 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                    Object obj = z9c.p;
                    if (!ff2Var.d && ff2Var.e != j2 && ff2Var.b == j2) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    z9cVar.b(this.j, ff2Var, this.b, this.c, this.d, true, z2, this.k, j3, this.g, h() - 1, this.f);
                    return z9cVar;
                }
            }
            long j7 = this.f + j5;
            long d2 = ff2Var.d(0);
            int i2 = 0;
            while (i2 < ff2Var.m.size() - 1 && j7 >= d2) {
                j7 -= d2;
                i2++;
                d2 = ff2Var.d(i2);
            }
            mt8 b = ff2Var.b(i2);
            List list = b.c;
            z = true;
            int size = list.size();
            j2 = -9223372036854775807L;
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    j4 = j6;
                    if (((g7) list.get(i3)).b == 2) {
                        break;
                    }
                    i3++;
                    j6 = j4;
                } else {
                    j4 = j6;
                    i3 = -1;
                    break;
                }
            }
            if (i3 != -1 && (d = ((tp9) ((g7) b.c.get(i3)).c.get(0)).d()) != null && d.B(d2) != j4) {
                j5 = (d.b(d.r(j7, d2)) + j5) - j7;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        j3 = j5;
        Object obj2 = z9c.p;
        if (!ff2Var.d) {
        }
        z2 = false;
        z9cVar.b(this.j, ff2Var, this.b, this.c, this.d, true, z2, this.k, j3, this.g, h() - 1, this.f);
        return z9cVar;
    }

    @Override // defpackage.aac
    public final int o() {
        return 1;
    }
}
