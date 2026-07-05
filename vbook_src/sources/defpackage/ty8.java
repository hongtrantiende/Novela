package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty8  reason: default package */
/* loaded from: classes.dex */
public final class ty8 implements tad {
    public qs5 a;
    public vq4 b;
    public long c;
    public long d;
    public int e;
    public final /* synthetic */ xy8 f;

    public ty8(xy8 xy8Var, Context context) {
        this.f = xy8Var;
        a2d.N(context);
        ms5 ms5Var = qs5.b;
        this.a = mm9.e;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.tad
    public final void a() {
        xy8 xy8Var = this.f;
        if (xy8Var.n == 2) {
            return;
        }
        ggb ggbVar = xy8Var.k;
        if (ggbVar != null) {
            ggbVar.a.removeCallbacksAndMessages(null);
        }
        xy8Var.l = null;
        xy8Var.n = 2;
    }

    @Override // defpackage.tad
    public final void b(float f) {
        xy8 xy8Var = this.f;
        xy8Var.i.c(f);
        xy8Var.e.b(f);
    }

    @Override // defpackage.tad
    public final boolean c() {
        return false;
    }

    @Override // defpackage.tad
    public final boolean d() {
        return false;
    }

    @Override // defpackage.tad
    public final Surface e() {
        wq9.D(false);
        throw null;
    }

    @Override // defpackage.tad
    public final void f() {
        xy8 xy8Var = this.f;
        if (xy8Var.d) {
            xy8Var.e.f();
        }
    }

    @Override // defpackage.tad
    public final void g() {
        xy8 xy8Var = this.f;
        if (xy8Var.d) {
            xy8Var.e.g();
        }
    }

    @Override // defpackage.tad
    public final void h(vq4 vq4Var, long j, int i, List list) {
        wq9.D(false);
        this.a = qs5.l(list);
        this.b = vq4Var;
        uq4 a = vq4Var.a();
        gm1 gm1Var = vq4Var.E;
        if (gm1Var == null || !gm1Var.d()) {
            gm1Var = gm1.h;
        }
        a.D = gm1Var;
        a.a();
        throw null;
    }

    @Override // defpackage.tad
    public final void i(long j) {
        this.c = j;
    }

    @Override // defpackage.tad
    public final void j() {
        long j = this.d;
        xy8 xy8Var = this.f;
        if (xy8Var.o >= j) {
            xy8Var.e.j();
        }
    }

    @Override // defpackage.tad
    public final void k(int i) {
        this.f.e.k(i);
    }

    @Override // defpackage.tad
    public final void l() {
        int i = bna.c.a;
        this.f.l = null;
    }

    @Override // defpackage.tad
    public final boolean n(long j, r47 r47Var) {
        long j2;
        long j3;
        int i;
        wq9.D(false);
        long j4 = j + this.c;
        xy8 xy8Var = this.f;
        r8d r8dVar = xy8Var.i;
        if (r8dVar.a == -9223372036854775807L) {
            j3 = -9223372036854775807L;
        } else {
            j3 = (long) (((j4 - j2) * r8dVar.c) + r8dVar.b);
        }
        if (j3 != -9223372036854775807L) {
            long j5 = xy8Var.h;
            if (j5 != -9223372036854775807L && j3 < j5 && (i = this.e) < 2) {
                this.e = i + 1;
                u47 u47Var = r47Var.c;
                d47 d47Var = r47Var.a;
                int i2 = r47Var.b;
                Trace.beginSection("dropVideoBuffer");
                d47Var.e(i2);
                Trace.endSection();
                u47Var.S0(0, 1);
                return true;
            }
        }
        int i3 = xy8Var.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.tad
    public final boolean o(vq4 vq4Var) {
        boolean z;
        boolean z2;
        xy8 xy8Var = this.f;
        boolean z3 = true;
        if (xy8Var.n == 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        gm1 gm1Var = vq4Var.E;
        if (gm1Var == null || !gm1Var.d()) {
            gm1Var = gm1.h;
        }
        int i = gm1Var.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 34) {
                    if (i2 >= 33 && xoe.k("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        xfb xfbVar = xy8Var.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        xy8Var.k = xfbVar.a(myLooper, null);
                        xy8Var.b.a();
                        throw null;
                    }
                }
            } catch (jy4 e) {
                throw new sad(e, vq4Var);
            }
        }
        if (i == 6) {
            if (Build.VERSION.SDK_INT < 33 || !xoe.k("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z3 = false;
            }
        } else if (i == 7) {
            z3 = xoe.k("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z3 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            st0.w("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
            gm1 gm1Var2 = gm1.h;
            xfb xfbVar2 = xy8Var.f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            xy8Var.k = xfbVar2.a(myLooper2, null);
            xy8Var.b.a();
            throw null;
        }
        if (i == 2 || i == 10) {
            gm1 gm1Var3 = gm1.h;
        }
        xfb xfbVar22 = xy8Var.f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        xy8Var.k = xfbVar22.a(myLooper22, null);
        xy8Var.b.a();
        throw null;
    }

    @Override // defpackage.tad
    public final void p(boolean z) {
        cw cwVar;
        this.d = -9223372036854775807L;
        xy8 xy8Var = this.f;
        wy2 wy2Var = xy8Var.e;
        if (xy8Var.n == 1) {
            xy8Var.m++;
            wy2Var.p(z);
            while (true) {
                int n = xy8Var.j.n();
                cwVar = xy8Var.j;
                if (n <= 1) {
                    break;
                }
                cwVar.i();
            }
            if (cwVar.n() != 1) {
                xy8Var.o = -9223372036854775807L;
                ggb ggbVar = xy8Var.k;
                ggbVar.getClass();
                ggbVar.d(new x0(xy8Var, 28));
                return;
            }
            ((wy8) xy8Var.j.i()).getClass();
            throw null;
        }
    }

    @Override // defpackage.tad
    public final void q(List list) {
        if (!this.a.equals(list)) {
            this.a = qs5.l(list);
            vq4 vq4Var = this.b;
            if (vq4Var == null) {
                return;
            }
            uq4 a = vq4Var.a();
            gm1 gm1Var = vq4Var.E;
            if (gm1Var == null || !gm1Var.d()) {
                gm1Var = gm1.h;
            }
            a.D = gm1Var;
            a.a();
            throw null;
        }
    }

    @Override // defpackage.tad
    public final void r(long j, long j2) {
        this.f.e.r(j + this.c, j2);
    }

    @Override // defpackage.tad
    public final void s(boolean z) {
        xy8 xy8Var = this.f;
        if (xy8Var.d) {
            xy8Var.e.s(z);
        }
    }

    @Override // defpackage.tad
    public final boolean t(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // defpackage.tad
    public final void u(o8d o8dVar) {
        this.f.e.j = o8dVar;
    }

    @Override // defpackage.tad
    public final void w(Surface surface, bna bnaVar) {
        xy8 xy8Var = this.f;
        Pair pair = xy8Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((bna) xy8Var.l.second).equals(bnaVar)) {
            return;
        }
        xy8Var.l = Pair.create(surface, bnaVar);
        int i = bnaVar.a;
    }

    @Override // defpackage.tad
    public final void x() {
        xy8 xy8Var = this.f;
        if (xy8Var.j.n() == 0) {
            xy8Var.e.x();
            return;
        }
        cw cwVar = new cw(6, (byte) 0);
        if (xy8Var.j.n() <= 0) {
            xy8Var.j = cwVar;
        } else {
            ((wy8) xy8Var.j.i()).getClass();
            throw null;
        }
    }

    @Override // defpackage.tad
    public final void v() {
    }

    @Override // defpackage.tad
    public final void m(q47 q47Var) {
    }
}
