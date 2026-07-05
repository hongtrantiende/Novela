package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uea  reason: default package */
/* loaded from: classes.dex */
public abstract class uea {
    public final kwe a;
    public yj b;
    public wl0 c;
    public long d;
    public long e;
    public long f;
    public tc6 g;
    public float h;

    public uea(kwe kweVar) {
        this.a = kweVar;
        int i = zl1.j;
        this.d = zl1.i;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = tc6.a;
        this.h = 1.0f;
    }

    public abstract void a(ak3 ak3Var, long j, long j2, yj yjVar);

    public final void b(ak3 ak3Var, em1 em1Var, long j, long j2, hy0 hy0Var, float f, int i) {
        kwe kweVar = this.a;
        wl0 wl0Var = null;
        if (kweVar instanceof sf8) {
            this.b = ((sf8) kweVar).c;
            this.e = 0L;
        } else if (kweVar instanceof uf8) {
            uf8 uf8Var = (uf8) kweVar;
            ou9 ou9Var = uf8Var.c;
            if (vte.g(ou9Var)) {
                this.b = null;
                this.e = ou9Var.e;
            } else {
                this.b = uf8Var.d;
                this.e = 0L;
            }
        } else if (kweVar instanceof tf8) {
            this.b = null;
            this.e = 0L;
        } else {
            xk5.o();
            return;
        }
        if (em1Var != null) {
            wl0Var = em1Var;
        } else if (hy0Var == null && j2 != 16) {
            wl0 wl0Var2 = this.c;
            if (wl0Var2 == null || !zl1.c(this.d, j2)) {
                wl0Var2 = new wl0(j2, 5);
                this.d = j2;
                this.c = wl0Var2;
            }
            wl0Var = wl0Var2;
        }
        long j3 = this.f;
        if (j3 == 9205357640488583168L || !dna.a(j3, j) || this.g != ak3Var.getLayoutDirection() || this.h != ak3Var.f()) {
            a(ak3Var, j, this.e, this.b);
            this.f = j;
            this.g = ak3Var.getLayoutDirection();
            this.h = ak3Var.f();
        }
        c(ak3Var, this.e, this.b, f, wl0Var, hy0Var, i);
    }

    public abstract void c(ak3 ak3Var, long j, yj yjVar, float f, em1 em1Var, hy0 hy0Var, int i);
}
