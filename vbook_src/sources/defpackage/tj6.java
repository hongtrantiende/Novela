package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tj6  reason: default package */
/* loaded from: classes3.dex */
public final class tj6 implements fh6 {
    public final nk6 a;

    public tj6(nk6 nk6Var) {
        this.a = nk6Var;
    }

    @Override // defpackage.fh6
    public final int a() {
        return this.a.g().l;
    }

    @Override // defpackage.fh6
    public final int b() {
        return ((ik6) sl1.j0(this.a.g().m)).a;
    }

    @Override // defpackage.fh6
    public final int c() {
        long j;
        int i;
        long j2;
        nk6 nk6Var = this.a;
        int i2 = 0;
        if (nk6Var.g().m.isEmpty()) {
            return 0;
        }
        gk6 g = nk6Var.g();
        gk6 gk6Var = hk6.a;
        ff8 ff8Var = g.v;
        long j3 = g.n;
        ff8 ff8Var2 = ff8.a;
        if (ff8Var == ff8Var2) {
            j = j3 & 4294967295L;
        } else {
            j = j3 >> 32;
        }
        int i3 = (int) j;
        gk6 g2 = nk6Var.g();
        List list = g2.m;
        if (!list.isEmpty()) {
            int size = list.size();
            int i4 = 0;
            while (i2 < size) {
                ik6 ik6Var = (ik6) list.get(i2);
                if (g2.v == ff8Var2) {
                    j2 = ik6Var.v & 4294967295L;
                } else {
                    j2 = ik6Var.v >> 32;
                }
                i4 += (int) j2;
                i2++;
            }
            i2 = (i4 / list.size()) + g2.s;
        }
        if (i2 == 0 || (i = i3 / i2) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.fh6
    public final boolean d() {
        return !this.a.g().m.isEmpty();
    }

    @Override // defpackage.fh6
    public final int e() {
        return ((em8) this.a.c.d).h();
    }
}
