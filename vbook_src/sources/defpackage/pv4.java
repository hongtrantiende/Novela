package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv4  reason: default package */
/* loaded from: classes.dex */
public final class pv4 extends px1 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final uv7 e;
    public final hm8 f;
    public final /* synthetic */ rv4 g;

    public pv4(rv4 rv4Var, long j, boolean z, boolean z2, mu9 mu9Var) {
        this.g = rv4Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        uv7 uv7Var = uz9.a;
        this.e = new uv7();
        this.f = new hm8(xt8.d, r0f.L);
    }

    @Override // defpackage.px1
    public final void a(ux1 ux1Var, lu4 lu4Var) {
        this.g.b.a(ux1Var, lu4Var);
    }

    @Override // defpackage.px1
    public final uv7 b(ux1 ux1Var, rka rkaVar, lu4 lu4Var) {
        return this.g.b.b(ux1Var, rkaVar, lu4Var);
    }

    @Override // defpackage.px1
    public final void c(ls7 ls7Var) {
        this.g.b.c(ls7Var);
    }

    @Override // defpackage.px1
    public final void d() {
        rv4 rv4Var = this.g;
        rv4Var.A--;
    }

    @Override // defpackage.px1
    public final boolean e() {
        return this.g.b.e();
    }

    @Override // defpackage.px1
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.px1
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.px1
    public final long h() {
        return this.a;
    }

    @Override // defpackage.px1
    public final ox1 i() {
        return this.g.h;
    }

    @Override // defpackage.px1
    public final xt8 j() {
        return (xt8) this.f.getValue();
    }

    @Override // defpackage.px1
    public final d82 k() {
        return this.g.b.k();
    }

    @Override // defpackage.px1
    public final boolean l() {
        return this.g.b.l();
    }

    @Override // defpackage.px1
    public final void m(ls7 ls7Var) {
        this.g.b.m(ls7Var);
    }

    @Override // defpackage.px1
    public final void n(ux1 ux1Var) {
        rv4 rv4Var = this.g;
        rv4Var.b.n(rv4Var.h);
        rv4Var.b.n(ux1Var);
    }

    @Override // defpackage.px1
    public final void o(ls7 ls7Var, ks7 ks7Var, ny nyVar) {
        this.g.b.o(ls7Var, ks7Var, nyVar);
    }

    @Override // defpackage.px1
    public final ks7 p(ls7 ls7Var) {
        return this.g.b.p(ls7Var);
    }

    @Override // defpackage.px1
    public final uv7 q(ux1 ux1Var, rka rkaVar, uv7 uv7Var) {
        return this.g.b.q(ux1Var, rkaVar, uv7Var);
    }

    @Override // defpackage.px1
    public final void r(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.px1
    public final void s(rv4 rv4Var) {
        this.e.a(rv4Var);
    }

    @Override // defpackage.px1
    public final void t(ek9 ek9Var) {
        this.g.b.t(ek9Var);
    }

    @Override // defpackage.px1
    public final void u(ux1 ux1Var) {
        this.g.b.u(ux1Var);
    }

    @Override // defpackage.px1
    public final h61 v(ik ikVar) {
        return this.g.b.v(ikVar);
    }

    @Override // defpackage.px1
    public final void w() {
        this.g.A++;
    }

    @Override // defpackage.px1
    public final void x(rv4 rv4Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                rv4Var.getClass();
                ((Set) it.next()).remove(rv4Var.y());
            }
        }
        if (rv4Var != null) {
            this.e.l(rv4Var);
        }
    }

    @Override // defpackage.px1
    public final void y(ux1 ux1Var) {
        this.g.b.y(ux1Var);
    }

    public final void z() {
        uv7 uv7Var = this.e;
        if (uv7Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = uv7Var.b;
                long[] jArr = uv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    rv4 rv4Var = (rv4) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(rv4Var.y());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            uv7Var.b();
        }
    }
}
