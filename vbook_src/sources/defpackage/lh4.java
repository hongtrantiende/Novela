package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lh4  reason: default package */
/* loaded from: classes.dex */
public final class lh4 implements wr7 {
    public int a;
    public long b;
    public boolean c;
    public Object d;
    public Object e;

    public long a(long j, h6a h6aVar, fvb fvbVar, boolean z) {
        ytb ytbVar = (ytb) this.e;
        int length = fvbVar.a.a.b.length();
        int i = this.a;
        if (i < 0 || i > length) {
            i = ytbVar.b.d(false, this.b);
        }
        int i2 = i;
        long A = ytbVar.A(ytbVar.a.f(), i2, ytbVar.b.d(false, j), false, h6aVar, false, z, null);
        if (this.a == -1 && !fxb.d(A)) {
            this.a = (int) (A >> 32);
        }
        if (fxb.h(A)) {
            A = sze.a((int) (4294967295L & A), (int) (A >> 32));
        }
        ytbVar.a.m(A);
        ytbVar.w(x2c.c);
        return A;
    }

    @Override // defpackage.wr7
    public boolean c(long j) {
        return true;
    }

    @Override // defpackage.wr7
    public void d() {
        ytb ytbVar = (ytb) this.e;
        ytbVar.r.setValue(ntb.a);
        if (this.c) {
            ytbVar.r();
        }
    }

    @Override // defpackage.wr7
    public boolean e(long j, h6a h6aVar, int i) {
        ytb ytbVar = (ytb) this.e;
        fvb c = ytbVar.b.c();
        boolean z = false;
        if (!ytbVar.i || c == null || ytbVar.a.f().d.length() == 0) {
            return false;
        }
        if (i >= 2) {
            z = true;
        }
        this.c = z;
        ytbVar.r.setValue(ntb.c);
        ((a0b) this.d).invoke();
        ytbVar.w = -1;
        this.a = -1;
        this.b = j;
        this.a = (int) (a(j, h6aVar, c, true) >> 32);
        return true;
    }

    @Override // defpackage.wr7
    public boolean f(long j, h6a h6aVar) {
        ytb ytbVar = (ytb) this.e;
        hvb hvbVar = ytbVar.b;
        mkc mkcVar = ytbVar.a;
        fvb c = hvbVar.c();
        if (!ytbVar.i || c == null || mkcVar.f().d.length() == 0) {
            return false;
        }
        if (!fxb.c(mkcVar.f().e, a(j, h6aVar, c, false))) {
            this.c = false;
            return true;
        }
        return true;
    }

    @Override // defpackage.wr7
    public boolean g(long j) {
        ytb ytbVar = (ytb) this.e;
        fvb c = ytbVar.b.c();
        if (!ytbVar.i || c == null || ytbVar.a.f().d.length() == 0) {
            return false;
        }
        this.c = false;
        ((a0b) this.d).invoke();
        a(j, abf.H, c, false);
        return true;
    }
}
