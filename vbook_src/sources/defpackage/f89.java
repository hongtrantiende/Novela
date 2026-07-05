package defpackage;

import android.net.Uri;
import android.os.Looper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f89  reason: default package */
/* loaded from: classes.dex */
public final class f89 extends ci0 {
    public final gg2 h;
    public final d89 i;
    public final fl3 j;
    public final ox9 k;
    public final int l;
    public final vq4 m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public ys2 s;
    public f57 t;

    public f89(f57 f57Var, gg2 gg2Var, d89 d89Var, fl3 fl3Var, ox9 ox9Var, int i, vq4 vq4Var) {
        this.t = f57Var;
        this.h = gg2Var;
        this.i = d89Var;
        this.j = fl3Var;
        this.k = ox9Var;
        this.l = i;
        this.m = vq4Var;
    }

    @Override // defpackage.ci0
    public final n57 b(e67 e67Var, ij1 ij1Var, long j) {
        jg2 h = this.h.h();
        ys2 ys2Var = this.s;
        if (ys2Var != null) {
            h.u(ys2Var);
        }
        c57 c57Var = h().b;
        c57Var.getClass();
        Uri uri = c57Var.a;
        this.g.getClass();
        return new b89(uri, h, new ij1((u94) this.i.b, 15), this.j, new cl3(this.d.c, 0, e67Var), this.k, a(e67Var), this, ij1Var, this.l, this.m, a2d.Q(c57Var.e), null);
    }

    @Override // defpackage.ci0
    public final synchronized f57 h() {
        return this.t;
    }

    @Override // defpackage.ci0
    public final void l(ys2 ys2Var) {
        this.s = ys2Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        a09 a09Var = this.g;
        a09Var.getClass();
        fl3 fl3Var = this.j;
        fl3Var.l(myLooper, a09Var);
        fl3Var.j();
        t();
    }

    @Override // defpackage.ci0
    public final void n(n57 n57Var) {
        fx9[] fx9VarArr;
        b89 b89Var = (b89) n57Var;
        if (b89Var.T) {
            for (fx9 fx9Var : b89Var.Q) {
                fx9Var.k();
                mu9 mu9Var = fx9Var.h;
                if (mu9Var != null) {
                    mu9Var.y(fx9Var.e);
                    fx9Var.h = null;
                    fx9Var.g = null;
                }
            }
        }
        b89Var.H.S(b89Var);
        b89Var.M.removeCallbacksAndMessages(null);
        b89Var.N = null;
        b89Var.m0 = true;
    }

    @Override // defpackage.ci0
    public final void p() {
        this.j.a();
    }

    @Override // defpackage.ci0
    public final synchronized void s(f57 f57Var) {
        this.t = f57Var;
    }

    public final void t() {
        b57 b57Var;
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        f57 h = h();
        if (z2) {
            b57Var = h.c;
        } else {
            b57Var = null;
        }
        aac mmaVar = new mma(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, h, b57Var);
        if (this.n) {
            mmaVar = new kr4(mmaVar);
        }
        m(mmaVar);
    }

    public final void u(long j, m4a m4aVar, boolean z) {
        if (!this.r || !m4aVar.d()) {
            this.r = !m4aVar.d();
            if (j == -9223372036854775807L) {
                j = this.o;
            }
            boolean c = m4aVar.c();
            if (!this.n && this.o == j && this.p == c && this.q == z) {
                return;
            }
            this.o = j;
            this.p = c;
            this.q = z;
            this.n = false;
            t();
        }
    }

    @Override // defpackage.ci0
    public final void j() {
    }
}
