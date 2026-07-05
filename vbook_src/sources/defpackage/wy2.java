package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wy2  reason: default package */
/* loaded from: classes.dex */
public final class wy2 implements tad {
    public final q8d a;
    public final r8d b;
    public final w8d c;
    public final ArrayDeque d;
    public Surface e;
    public vq4 f;
    public long g;
    public rad h;
    public Executor i;
    public o8d j;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, o8d] */
    public wy2(q8d q8dVar, r8d r8dVar, xfb xfbVar) {
        this.a = q8dVar;
        this.b = r8dVar;
        q8dVar.l = xfbVar;
        this.c = new w8d(new kw5(this), q8dVar, r8dVar);
        this.d = new ArrayDeque();
        this.f = new vq4(new uq4());
        this.g = -9223372036854775807L;
        this.h = rad.a;
        this.i = new az(2);
        this.j = new Object();
    }

    @Override // defpackage.tad
    public final void b(float f) {
        this.a.h(f);
    }

    @Override // defpackage.tad
    public final boolean c() {
        w8d w8dVar = this.c;
        long j = w8dVar.j;
        if (j != -9223372036854775807L && w8dVar.i == j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tad
    public final boolean d() {
        return true;
    }

    @Override // defpackage.tad
    public final Surface e() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.tad
    public final void f() {
        this.b.b();
        q8d q8dVar = this.a;
        q8dVar.d = false;
        q8dVar.i = -9223372036854775807L;
        v8d v8dVar = q8dVar.b;
        v8dVar.d = false;
        s8d s8dVar = v8dVar.c;
        if (s8dVar != null) {
            s8dVar.b();
        }
        v8dVar.a();
    }

    @Override // defpackage.tad
    public final void g() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.tad
    public final void h(vq4 vq4Var, long j, int i, List list) {
        long j2;
        long j3;
        wq9.D(list.isEmpty());
        int i2 = vq4Var.v;
        int i3 = vq4Var.w;
        vq4 vq4Var2 = this.f;
        int i4 = vq4Var2.v;
        w8d w8dVar = this.c;
        if (i2 != i4 || i3 != vq4Var2.w) {
            cw cwVar = w8dVar.d;
            long j4 = w8dVar.h;
            if (j4 == -9223372036854775807L) {
                j2 = 0;
            } else {
                j2 = j4 + 1;
            }
            cwVar.a(new uad(i2, i3), j2);
        }
        float f = vq4Var.z;
        if (f != this.f.z) {
            this.a.f(f);
        }
        this.f = vq4Var;
        if (j != this.g) {
            if (w8dVar.f.d == 0) {
                w8dVar.b.e(i);
                w8dVar.l = j;
            } else {
                cw cwVar2 = w8dVar.e;
                long j5 = w8dVar.h;
                if (j5 == -9223372036854775807L) {
                    j3 = -4611686018427387904L;
                } else {
                    j3 = j5 + 1;
                }
                cwVar2.a(Long.valueOf(j), j3);
            }
            this.g = j;
        }
    }

    @Override // defpackage.tad
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tad
    public final void j() {
        w8d w8dVar = this.c;
        if (w8dVar.h == -9223372036854775807L) {
            w8dVar.h = Long.MIN_VALUE;
            w8dVar.i = Long.MIN_VALUE;
        }
        w8dVar.j = w8dVar.h;
    }

    @Override // defpackage.tad
    public final void k(int i) {
        v8d v8dVar = this.a.b;
        if (v8dVar.j == i) {
            return;
        }
        v8dVar.j = i;
        v8dVar.d(true);
    }

    @Override // defpackage.tad
    public final void l() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.tad
    public final void m(q47 q47Var) {
        this.h = q47Var;
        this.i = e73.a;
    }

    @Override // defpackage.tad
    public final boolean n(long j, r47 r47Var) {
        this.d.add(r47Var);
        w8d w8dVar = this.c;
        lu0 lu0Var = w8dVar.f;
        int i = lu0Var.d;
        long[] jArr = (long[]) lu0Var.f;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i2 = lu0Var.b;
                int i3 = length2 - i2;
                System.arraycopy(jArr, i2, jArr2, 0, i3);
                System.arraycopy((long[]) lu0Var.f, 0, jArr2, i3, i2);
                lu0Var.b = 0;
                lu0Var.c = lu0Var.d - 1;
                lu0Var.f = jArr2;
                lu0Var.e = length - 1;
            } else {
                vm1.d();
                return false;
            }
        }
        int i4 = (lu0Var.c + 1) & lu0Var.e;
        lu0Var.c = i4;
        ((long[]) lu0Var.f)[i4] = j;
        lu0Var.d++;
        w8dVar.h = j;
        w8dVar.j = -9223372036854775807L;
        this.i.execute(new x0(this, 19));
        return true;
    }

    @Override // defpackage.tad
    public final boolean o(vq4 vq4Var) {
        return true;
    }

    @Override // defpackage.tad
    public final void p(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            q8d q8dVar = this.a;
            q8dVar.b.b();
            q8dVar.h = -9223372036854775807L;
            q8dVar.f = -9223372036854775807L;
            q8dVar.e = Math.min(q8dVar.e, 1);
            q8dVar.i = -9223372036854775807L;
            q8dVar.n = false;
        }
        this.b.b();
        w8d w8dVar = this.c;
        cw cwVar = w8dVar.d;
        lu0 lu0Var = w8dVar.f;
        lu0Var.b = 0;
        lu0Var.c = -1;
        lu0Var.d = 0;
        w8dVar.h = -9223372036854775807L;
        w8dVar.i = -9223372036854775807L;
        w8dVar.j = -9223372036854775807L;
        cw cwVar2 = w8dVar.e;
        if (cwVar2.n() > 0) {
            if (cwVar2.n() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            wq9.s(z2);
            while (cwVar2.n() > 1) {
                cwVar2.i();
            }
            Object i = cwVar2.i();
            i.getClass();
            w8dVar.l = ((Long) i).longValue();
        }
        if (cwVar.n() > 0) {
            if (cwVar.n() > 0) {
                z3 = true;
            }
            wq9.s(z3);
            while (cwVar.n() > 1) {
                cwVar.i();
            }
            Object i2 = cwVar.i();
            i2.getClass();
            cwVar.a((uad) i2, 0L);
        }
        this.d.clear();
    }

    @Override // defpackage.tad
    public final void q(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tad
    public final void r(long j, long j2) {
        try {
            this.c.a(j, j2);
        } catch (pz3 e) {
            throw new sad(e, this.f);
        }
    }

    @Override // defpackage.tad
    public final void s(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.tad
    public final boolean t(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.tad
    public final void u(o8d o8dVar) {
        this.j = o8dVar;
    }

    @Override // defpackage.tad
    public final void v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tad
    public final void w(Surface surface, bna bnaVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // defpackage.tad
    public final void x() {
        q8d q8dVar = this.a;
        if (q8dVar.e == 0) {
            q8dVar.e = 1;
        }
    }

    @Override // defpackage.tad
    public final void a() {
    }
}
